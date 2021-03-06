import React, { Fragment, useState } from "react";
import { WHeader } from "webapp/cmm";
import { useCustomState } from "webapp/cmm/state/State";
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import axios from "axios";

const useStyles = makeStyles((theme) => ({
  root: {
    '& .MuiTextField-root': {
      margin: theme.spacing(1),
      width: '30ch',
    },
  },
  margin: {
    margin: theme.spacing(1),
  },
}));

export default () => {
  const state = useCustomState()[0];
  const classes = useStyles();
  const URL = process.env.REACT_APP_API_URL

  const [contentid, setContentid] = useState('')
  const [overview, setOverview] = useState('')

  const save = e => {
    e.preventDefault()
    axios.post(`${URL}/detail/save`, {
      contentid, overview,
      proxy: {
        host: 'localhost',
        port: 8080,
        protocol: 'http'
      }
    })
    .then(resp => {
      alert('저장 성공')
    })
    .catch(err => {
      alert('저장 실패')
    })
  }

  return (
    <Fragment>
      <WHeader>관광지 개요 입력</WHeader>
      <div>  
      <form className={classes.root} noValidate autoComplete="off">
      <TextField name="contentid" label="contentid" placeholder="contentid" onChange = { e => { setContentid(`${e.target.value}`) }}/>
      <TextField name="overview" style={{ fontSize: '80px' }} label="overview" placeholder="overview" onChange = { e => { setOverview(`${e.target.value}`) }}/>
      </form>
      </div>
      <Button 
          variant="outlined" 
          color="primary" 
          type="submit" 
          onClick={save}
          className={classes.margin}>
        저장
      </Button>
      <Button 
          variant="outlined" 
          color="primary" 
          type="button" 
          href='/place/list'
          className={classes.margin}>
        취소
      </Button>
    </Fragment>
  );
};
