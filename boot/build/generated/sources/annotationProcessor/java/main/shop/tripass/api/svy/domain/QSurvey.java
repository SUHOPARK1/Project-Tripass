package shop.tripass.api.svy.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSurvey is a Querydsl query type for Survey
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSurvey extends EntityPathBase<Survey> {

    private static final long serialVersionUID = 91858542L;

    public static final QSurvey survey = new QSurvey("survey");

    public final StringPath age = createString("age");

    public final StringPath duration = createString("duration");

    public final StringPath gender = createString("gender");

    public final StringPath location = createString("location");

    public final StringPath partner = createString("partner");

    public final ListPath<shop.tripass.api.rcm.domain.Recom, shop.tripass.api.rcm.domain.QRecom> RecomList = this.<shop.tripass.api.rcm.domain.Recom, shop.tripass.api.rcm.domain.QRecom>createList("RecomList", shop.tripass.api.rcm.domain.Recom.class, shop.tripass.api.rcm.domain.QRecom.class, PathInits.DIRECT2);

    public final StringPath season = createString("season");

    public final NumberPath<Long> svyNum = createNumber("svyNum", Long.class);

    public final StringPath theme1 = createString("theme1");

    public final StringPath theme2 = createString("theme2");

    public final StringPath theme3 = createString("theme3");

    public QSurvey(String variable) {
        super(Survey.class, forVariable(variable));
    }

    public QSurvey(Path<? extends Survey> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSurvey(PathMetadata metadata) {
        super(Survey.class, metadata);
    }

}

