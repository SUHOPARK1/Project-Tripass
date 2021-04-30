package shop.tripass.api.crs.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCourse is a Querydsl query type for Course
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCourse extends EntityPathBase<Course> {

    private static final long serialVersionUID = 1036978717L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCourse course = new QCourse("course");

    public final StringPath crsName = createString("crsName");

    public final NumberPath<Long> crsNum = createNumber("crsNum", Long.class);

    public final ListPath<Long, NumberPath<Long>> places = this.<Long, NumberPath<Long>>createList("places", Long.class, NumberPath.class, PathInits.DIRECT2);

    public final shop.tripass.api.rcm.domain.QRecom recom;

    public final shop.tripass.api.usr.domain.QUser user;

    public QCourse(String variable) {
        this(Course.class, forVariable(variable), INITS);
    }

    public QCourse(Path<? extends Course> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCourse(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCourse(PathMetadata metadata, PathInits inits) {
        this(Course.class, metadata, inits);
    }

    public QCourse(Class<? extends Course> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.recom = inits.isInitialized("recom") ? new shop.tripass.api.rcm.domain.QRecom(forProperty("recom"), inits.get("recom")) : null;
        this.user = inits.isInitialized("user") ? new shop.tripass.api.usr.domain.QUser(forProperty("user")) : null;
    }

}

