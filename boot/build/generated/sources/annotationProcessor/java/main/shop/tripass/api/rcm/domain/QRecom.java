package shop.tripass.api.rcm.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecom is a Querydsl query type for Recom
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecom extends EntityPathBase<Recom> {

    private static final long serialVersionUID = -451314508L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecom recom = new QRecom("recom");

    public final ListPath<shop.tripass.api.crs.domain.Course, shop.tripass.api.crs.domain.QCourse> courseList = this.<shop.tripass.api.crs.domain.Course, shop.tripass.api.crs.domain.QCourse>createList("courseList", shop.tripass.api.crs.domain.Course.class, shop.tripass.api.crs.domain.QCourse.class, PathInits.DIRECT2);

    public final shop.tripass.api.pce.domain.QPlace place;

    public final NumberPath<Long> rcmNum = createNumber("rcmNum", Long.class);

    public final shop.tripass.api.svy.domain.QSurvey survey;

    public QRecom(String variable) {
        this(Recom.class, forVariable(variable), INITS);
    }

    public QRecom(Path<? extends Recom> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecom(PathMetadata metadata, PathInits inits) {
        this(Recom.class, metadata, inits);
    }

    public QRecom(Class<? extends Recom> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new shop.tripass.api.pce.domain.QPlace(forProperty("place")) : null;
        this.survey = inits.isInitialized("survey") ? new shop.tripass.api.svy.domain.QSurvey(forProperty("survey")) : null;
    }

}

