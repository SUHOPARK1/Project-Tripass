package shop.tripass.api.usr.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 355592701L;

    public static final QUser user = new QUser("user");

    public final StringPath age = createString("age");

    public final ListPath<shop.tripass.api.crs.domain.Course, shop.tripass.api.crs.domain.QCourse> courseList = this.<shop.tripass.api.crs.domain.Course, shop.tripass.api.crs.domain.QCourse>createList("courseList", shop.tripass.api.crs.domain.Course.class, shop.tripass.api.crs.domain.QCourse.class, PathInits.DIRECT2);

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> num = createNumber("num", Long.class);

    public final StringPath password = createString("password");

    public final StringPath provider = createString("provider");

    public final StringPath providerId = createString("providerId");

    public final ListPath<shop.tripass.api.rev.domain.Review, shop.tripass.api.rev.domain.QReview> reviewList = this.<shop.tripass.api.rev.domain.Review, shop.tripass.api.rev.domain.QReview>createList("reviewList", shop.tripass.api.rev.domain.Review.class, shop.tripass.api.rev.domain.QReview.class, PathInits.DIRECT2);

    public final StringPath role = createString("role");

    public final StringPath username = createString("username");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

