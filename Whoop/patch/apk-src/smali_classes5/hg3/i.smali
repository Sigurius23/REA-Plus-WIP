.class public abstract Lhg3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lhg3/h; = null

.field public static b:Z = false


# direct methods
.method public static final A(Lorg/json/JSONObject;)Ljava/util/Set;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "this.keys()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    const-string v3, "this.getJSONArray(fieldKey)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lhg3/i;->q0(Lorg/json/JSONArray;)[I

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final B(Lm93/g;Lr93/c;Z)Lm93/g;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lya3/h;->a(Lr93/c;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-interface {p1}, Lr93/b;->c0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getContextReceiverParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/q0;

    check-cast v1, Lu93/d;

    invoke-virtual {v1}, Lu93/d;->getType()Llb3/y;

    move-result-object v1

    invoke-static {v1}, Lya3/h;->f(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    :cond_2
    :goto_0
    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    const-string v1, "getValueParameters(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/a1;

    check-cast v1, Lu93/x0;

    invoke-virtual {v1}, Lu93/x0;->getType()Llb3/y;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lya3/h;->f(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_5
    :goto_1
    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lya3/h;->b(Lr93/k;)Z

    move-result v0

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-ne v0, v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {p1}, Lhg3/i;->Q(Lr93/c;)Llb3/y;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lya3/h;->f(Llb3/y;)Z

    move-result v0

    if-ne v0, v1, :cond_8

    goto :goto_3

    :cond_8
    return-object p0

    :cond_9
    :goto_3
    new-instance v0, Lm93/e0;

    invoke-direct {v0, p0, p1, p2}, Lm93/e0;-><init>(Lm93/g;Lr93/c;Z)V

    return-object v0
.end method

.method public static C(Ljava/lang/Object;)Lio/sentry/g0;
    .locals 2

    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    const-string v1, "sentry:typeCheckHint"

    invoke-virtual {v0, p0, v1}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final D(Ljava/nio/charset/CharsetDecoder;Lv63/g;)Ljava/lang/String;
    .locals 14

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7fffffff

    int-to-long v1, v0

    instance-of v3, p1, Lv63/e;

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lv63/g;->s()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lv63/g;->s()J

    move-result-wide v3

    const-wide/16 v5, 0x10

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :goto_0
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    sget-object v1, Lu63/a;->a:Ljava/nio/CharBuffer;

    const/16 v1, 0x2000

    invoke-static {v1}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {p1, v4}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_1

    goto/16 :goto_a

    :cond_1
    move v7, v4

    move v9, v7

    move v8, v6

    :goto_1
    :try_start_0
    iget v10, v5, Lio/seon/androidsdk/service/e1;->c:I

    iget v11, v5, Lio/seon/androidsdk/service/e1;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sub-int/2addr v10, v11

    if-lt v10, v7, :cond_8

    sub-int v7, v0, v8

    if-nez v7, :cond_2

    move v7, v6

    goto :goto_4

    :cond_2
    :try_start_1
    iget-object v12, v5, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v12, Ljava/nio/ByteBuffer;

    sget-object v13, Lt63/b;->a:Ljava/nio/ByteBuffer;

    invoke-static {v12, v11, v10}, Le93/b;->b0(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v11

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    if-ge v7, v1, :cond_3

    invoke-virtual {v3, v7}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_5

    :cond_3
    :goto_2
    invoke-virtual {p0, v11, v3, v6}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v7

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v12

    add-int/2addr v8, v12

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {v7}, Ljava/nio/charset/CoderResult;->isMalformed()Z

    move-result v12

    if-nez v12, :cond_4

    invoke-virtual {v7}, Ljava/nio/charset/CoderResult;->isUnmappable()Z

    move-result v12

    if-eqz v12, :cond_5

    :cond_4
    invoke-static {v7}, Lu63/a;->d(Ljava/nio/charset/CoderResult;)V

    :cond_5
    invoke-virtual {v7}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v11}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v7

    if-eqz v7, :cond_6

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    move v9, v4

    :goto_3
    invoke-virtual {v11}, Ljava/nio/Buffer;->limit()I

    move-result v7

    if-ne v7, v10, :cond_7

    invoke-virtual {v11}, Ljava/nio/Buffer;->position()I

    move-result v7

    invoke-virtual {v5, v7}, Lio/seon/androidsdk/service/e1;->d(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v7, v9

    :goto_4
    :try_start_2
    iget v10, v5, Lio/seon/androidsdk/service/e1;->c:I

    iget v11, v5, Lio/seon/androidsdk/service/e1;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sub-int/2addr v10, v11

    goto :goto_6

    :catchall_1
    move-exception p0

    goto/16 :goto_b

    :cond_7
    :try_start_3
    const-string p0, "Buffer\'s limit change is not allowed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_8
    :goto_6
    if-nez v10, :cond_9

    :try_start_5
    invoke-static {p1, v5}, Lw63/b;->c(Lv63/g;Lw63/a;)Lw63/a;

    move-result-object v10

    goto :goto_8

    :catchall_2
    move-exception p0

    move v4, v6

    goto :goto_b

    :cond_9
    if-lt v10, v7, :cond_b

    iget v10, v5, Lio/seon/androidsdk/service/e1;->f:I

    iget v11, v5, Lio/seon/androidsdk/service/e1;->e:I

    sub-int/2addr v10, v11

    const/16 v11, 0x8

    if-ge v10, v11, :cond_a

    goto :goto_7

    :cond_a
    move-object v10, v5

    goto :goto_8

    :cond_b
    :goto_7
    invoke-static {p1, v5}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    invoke-static {p1, v7}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_8
    if-nez v10, :cond_c

    goto :goto_9

    :cond_c
    if-gtz v7, :cond_13

    move v6, v4

    move-object v5, v10

    :goto_9
    if-eqz v6, :cond_d

    invoke-static {p1, v5}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_d
    move v6, v8

    :cond_e
    :goto_a
    invoke-virtual {v3}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    sub-int p1, v0, v6

    if-eqz p1, :cond_12

    if-ge p1, v1, :cond_f

    invoke-virtual {v3, p1}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;

    :cond_f
    sget-object p1, Lu63/a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, v3, v4}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object p1

    invoke-virtual {v3}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    add-int/2addr v6, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->isUnmappable()Z

    move-result v5

    if-nez v5, :cond_10

    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->isMalformed()Z

    move-result v5

    if-eqz v5, :cond_11

    :cond_10
    invoke-static {p1}, Lu63/a;->d(Ljava/nio/charset/CoderResult;)V

    :cond_11
    invoke-virtual {p1}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result p1

    if-nez p1, :cond_e

    :cond_12
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_13
    move-object v5, v10

    goto/16 :goto_1

    :goto_b
    if-eqz v4, :cond_14

    invoke-static {p1, v5}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_14
    throw p0
.end method

.method public static final F(Ljava/util/ArrayList;Lio/ktor/utils/io/q;Ls63/a;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Lk63/f;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lk63/f;

    iget v1, v0, Lk63/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lk63/f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lk63/f;

    invoke-direct {v0, p4}, Lk63/f;-><init>(Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lk63/f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lk63/f;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lk63/f;->x:Ls63/a;

    iget-object p1, v0, Lk63/f;->w:Lio/ktor/utils/io/q;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Lbm/g;

    const/4 v2, 0x1

    invoke-direct {p4, p0, v2}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    new-instance p0, Lk63/e;

    invoke-direct {p0, p4, p3, p2, p1}, Lk63/e;-><init>(Lbm/g;Ljava/nio/charset/Charset;Ls63/a;Lio/ktor/utils/io/q;)V

    new-instance p3, Landroidx/room/e;

    const/16 p4, 0x14

    const/4 v2, 0x0

    invoke-direct {p3, p1, v2, p4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lk63/f;->w:Lio/ktor/utils/io/q;

    iput-object p2, v0, Lk63/f;->x:Ls63/a;

    iput v3, v0, Lk63/f;->z:I

    invoke-static {p0, p3, v0}, Lec3/v;->B(Lec3/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-nez p4, :cond_6

    check-cast p1, Lio/ktor/utils/io/m;

    invoke-virtual {p1}, Lio/ktor/utils/io/m;->n()Z

    move-result p0

    if-nez p0, :cond_4

    return-object p1

    :cond_4
    iget-object p0, p2, Ls63/a;->c:Lj93/a0;

    invoke-interface {p0}, Lj93/a0;->isMarkedNullable()Z

    move-result p0

    if-ne p0, v3, :cond_5

    sget-object p0, Lj63/a;->a:Lj63/a;

    return-object p0

    :cond_5
    new-instance p0, Lio/ktor/serialization/ContentConvertException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "No suitable converter found for "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lio/ktor/serialization/ContentConvertException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_6
    return-object p4
.end method

.method public static final G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La6/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, La6/c;-><init>(Lc93/m;Lq83/d;)V

    invoke-interface {p0, v0, p2}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final H(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lv63/e;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv63/d;

    invoke-direct {v0}, Lv63/d;-><init>()V

    :try_start_0
    invoke-static {p0, v0, p1, p2, p3}, Lhg3/i;->I(Ljava/nio/charset/CharsetEncoder;Lv63/d;Ljava/lang/CharSequence;II)V

    invoke-virtual {v0}, Lv63/d;->i()Lv63/e;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lv63/d;->close()V

    throw p0
.end method

.method public static final I(Ljava/nio/charset/CharsetEncoder;Lv63/d;Ljava/lang/CharSequence;II)V
    .locals 5

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-lt p3, p4, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object v2

    :goto_0
    :try_start_0
    invoke-static {p0, p2, p3, p4, v2}, Lu63/a;->b(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;IILw63/a;)I

    move-result v3

    if-ltz v3, :cond_6

    add-int/2addr p3, v3

    const/4 v4, 0x0

    if-lt p3, p4, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    if-nez v3, :cond_2

    const/16 v3, 0x8

    goto :goto_1

    :cond_2
    move v3, v0

    :goto_1
    if-lez v3, :cond_3

    invoke-static {p1, v3, v2}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_5

    :cond_3
    invoke-virtual {p1}, Lv63/d;->b()V

    invoke-static {p1, v0, v1}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object p2

    move p3, v0

    :goto_2
    :try_start_1
    invoke-static {p0, p2}, Lu63/a;->a(Ljava/nio/charset/CharsetEncoder;Lw63/a;)Z

    move-result p4

    if-eqz p4, :cond_4

    move p3, v4

    goto :goto_3

    :cond_4
    add-int/2addr p3, v0

    :goto_3
    if-lez p3, :cond_5

    invoke-static {p1, v0, p2}, Lw63/b;->d(Lv63/d;ILw63/a;)Lw63/a;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p0

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lv63/d;->b()V

    return-void

    :goto_4
    invoke-virtual {p1}, Lv63/d;->b()V

    throw p0

    :cond_6
    :try_start_2
    const-string p0, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_5
    invoke-virtual {p1}, Lv63/d;->b()V

    throw p0
.end method

.method public static final K(Ljava/lang/String;Ltb/a;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sql"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final L(Lr93/b0;Lva3/c;)Lr93/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lhg3/i;->M(Lr93/b0;Lva3/c;)Lr93/h;

    move-result-object p0

    instance-of p1, p0, Lr93/e;

    if-eqz p1, :cond_0

    check-cast p0, Lr93/e;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final M(Lr93/b0;Lva3/c;)Lr93/h;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lya3/p;->a:Lbd3/e0;

    invoke-interface {p0, v0}, Lr93/b0;->r(Lbd3/e0;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    iget-object v0, p1, Lva3/c;->a:Lva3/e;

    invoke-interface {p0, v0}, Lr93/b0;->F(Lva3/e;)Lr93/k0;

    move-result-object p0

    iget-object p1, p1, Lva3/c;->b:Lva3/e;

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lva3/f;->f(Lva3/f;)Ljava/util/List;

    move-result-object p1

    check-cast p0, Lu93/a0;

    iget-object p0, p0, Lu93/a0;->H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva3/h;

    sget-object v1, Lz93/c;->G:Lz93/c;

    invoke-virtual {p0, v0, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lva3/h;

    instance-of v2, p0, Lr93/e;

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    check-cast p0, Lr93/e;

    invoke-interface {p0}, Lr93/e;->H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p0

    sget-object v2, Lz93/c;->G:Lz93/c;

    invoke-interface {p0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p0

    instance-of v1, p0, Lr93/e;

    if-eqz v1, :cond_2

    check-cast p0, Lr93/e;

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    return-object v0

    :cond_4
    return-object p0

    :cond_5
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static final N(Landroidx/room/t0;II)Ljava/util/List;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/room/t0;->a:Ljava/util/LinkedHashMap;

    if-ne p1, p2, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-le p2, p1, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    if-eqz v2, :cond_3

    if-ge p1, p2, :cond_b

    goto :goto_1

    :cond_3
    if-le p1, p2, :cond_b

    :goto_1
    const/4 v4, 0x0

    if-eqz v2, :cond_5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/TreeMap;

    if-nez v5, :cond_4

    :goto_2
    move-object v7, v4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/TreeMap;

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v5}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v6

    new-instance v7, Ll83/k;

    invoke-direct {v7, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    if-nez v7, :cond_7

    goto :goto_6

    :cond_7
    iget-object v5, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    iget-object v6, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    if-eqz v2, :cond_9

    add-int/lit8 v8, p1, 0x1

    if-gt v8, v7, :cond_8

    if-gt v7, p2, :cond_8

    goto :goto_4

    :cond_9
    if-gt p2, v7, :cond_8

    if-ge v7, p1, :cond_8

    :goto_4
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v5, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v5, v1

    move p1, v7

    goto :goto_5

    :cond_a
    move v5, v0

    :goto_5
    if-nez v5, :cond_2

    :goto_6
    return-object v4

    :cond_b
    return-object v3
.end method

.method public static final O(Lr93/b0;Lva3/c;Lzt/q;)Lr93/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lhg3/i;->L(Lr93/b0;Lva3/c;)Lr93/e;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lr93/u;->w:Lr93/u;

    invoke-static {p1, p0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    sget-object v0, Lr93/t;->x:Lr93/t;

    invoke-static {p0, v0}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lzt/q;->t(Lva3/c;Ljava/util/List;)Lr93/e;

    move-result-object p0

    return-object p0
.end method

.method public static final P(Lqc/q;)Lqc/j;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqc/j;

    iget-object v1, p0, Lqc/q;->a:Ljava/lang/String;

    iget p0, p0, Lqc/q;->t:I

    invoke-direct {v0, v1, p0}, Lqc/j;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final Q(Lr93/c;)Llb3/y;
    .locals 3

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    invoke-interface {p0}, Lr93/b;->y()Lr93/q0;

    move-result-object v1

    if-eqz v0, :cond_0

    check-cast v0, Lu93/d;

    invoke-virtual {v0}, Lu93/d;->getType()Llb3/y;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    instance-of v2, p0, Lr93/j;

    if-eqz v2, :cond_2

    check-cast v1, Lu93/d;

    invoke-virtual {v1}, Lu93/d;->getType()Llb3/y;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    instance-of v1, p0, Lr93/e;

    if-eqz v1, :cond_3

    check-cast p0, Lr93/e;

    goto :goto_0

    :cond_3
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_4

    invoke-interface {p0}, Lr93/e;->i()Llb3/c0;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static final R(Ljava/lang/Class;Lr93/c;)Ljava/lang/reflect/Method;
    .locals 3

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "unbox-impl"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No unbox method found in inline class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " (calling "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final S(Llb3/c0;)Ljava/util/ArrayList;
    .locals 7

    invoke-static {p0}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lhg3/i;->T(Llb3/c0;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "unbox-impl-"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lr93/e;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/UtilKt;->toJavaClass(Lr93/e;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    return-object v1
.end method

.method public static final T(Llb3/c0;)Ljava/util/ArrayList;
    .locals 7

    invoke-static {p0}, Lya3/h;->g(Llb3/y;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lr93/e;

    sget v0, Lcb3/e;->a:I

    invoke-interface {p0}, Lr93/e;->I()Lr93/y0;

    move-result-object p0

    instance-of v0, p0, Lr93/c0;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lr93/c0;

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, v1, Lr93/c0;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lva3/h;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Llb3/c0;

    invoke-static {v1}, Lhg3/i;->T(Llb3/c0;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lva3/h;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x2d

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lva3/h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :cond_2
    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    return-object v1
.end method

.method public static final U(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 2

    const-string v0, "error"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this.getString(key)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static final V(Ll3/g;)Z
    .locals 6

    iget-object v0, p0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object p0, p0, Ll3/g;->w:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    move-object v2, p0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll3/e;

    iget-object v5, v4, Ll3/e;->a:Ljava/lang/Object;

    instance-of v5, v5, Ll3/v;

    if-eqz v5, :cond_0

    iget v5, v4, Ll3/e;->b:I

    iget v4, v4, Ll3/e;->c:I

    invoke-static {v1, v0, v5, v4}, Ll3/h;->b(IIII)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static W(Lio/sentry/g0;Ljava/lang/Class;)Z
    .locals 1

    const-string v0, "sentry:typeCheckHint"

    invoke-virtual {p0, v0}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static X(Lio/sentry/g0;)Z
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "sentry:isFromHybridSdk"

    const-class v2, Ljava/lang/Boolean;

    invoke-virtual {p0, v2, v1}, Lio/sentry/g0;->c(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final Y(Landroidx/room/g;II)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-le p1, p2, :cond_0

    iget-boolean p2, p0, Landroidx/room/g;->l:Z

    if-eqz p2, :cond_0

    return v0

    :cond_0
    iget-object p2, p0, Landroidx/room/g;->m:Ljava/util/Set;

    iget-boolean p0, p0, Landroidx/room/g;->k:Z

    if-eqz p0, :cond_2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static final Z(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final a(FJ)Lf0/t;
    .locals 2

    new-instance v0, Lf0/t;

    new-instance v1, Li2/c1;

    invoke-direct {v1, p1, p2}, Li2/c1;-><init>(J)V

    invoke-direct {v0, p0, v1}, Lf0/t;-><init>(FLi2/t;)V

    return-object v0
.end method

.method public static final a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(ILp3/r;I)Lp3/x;
    .locals 2

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    sget-object p1, Lp3/r;->F:Lp3/r;

    :cond_0
    new-instance p2, Lp3/x;

    new-instance v0, Lp3/q;

    const/4 v1, 0x0

    new-array v1, v1, [Lp3/p;

    invoke-direct {v0, v1}, Lp3/q;-><init>([Lp3/p;)V

    invoke-direct {p2, p0, p1, v0}, Lp3/x;-><init>(ILp3/r;Lp3/q;)V

    return-object p2
.end method

.method public static b0(Lcj/d;Lqi/i;)Lxi/a;
    .locals 4

    new-instance v0, Lxi/a;

    sget-object v1, Lbj/f;->b:Lbj/f;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {p0, p1, v2, v1, v3}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object p0

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, Lxi/a;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public static final c(Leb/u0;Leb/r0;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v6, p9

    check-cast v6, Lp1/q;

    const v0, -0x751a66d8

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v10

    goto :goto_1

    :cond_1
    move v0, v10

    :goto_1
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit8 v4, v11, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v5, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_6

    move-object/from16 v5, p3

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_5

    :cond_8
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v0, v7

    :goto_6
    and-int/lit8 v7, v11, 0x10

    if-eqz v7, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v9, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v10, 0x6000

    if-nez v9, :cond_9

    move-object/from16 v9, p4

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_7

    :cond_b
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v0, v12

    :goto_8
    and-int/lit8 v12, v11, 0x20

    const/high16 v14, 0x30000

    if-eqz v12, :cond_d

    or-int/2addr v0, v14

    :cond_c
    move-object/from16 v14, p5

    goto :goto_a

    :cond_d
    and-int/2addr v14, v10

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-virtual {v6, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v15, 0x10000

    :goto_9
    or-int/2addr v0, v15

    :goto_a
    const/high16 v15, 0x180000

    and-int v16, v10, v15

    move/from16 p9, v15

    if-nez v16, :cond_10

    and-int/lit8 v16, v11, 0x40

    move-object/from16 v13, p6

    if-nez v16, :cond_f

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    const/high16 v17, 0x100000

    goto :goto_b

    :cond_f
    const/high16 v17, 0x80000

    :goto_b
    or-int v0, v0, v17

    goto :goto_c

    :cond_10
    move-object/from16 v13, p6

    :goto_c
    const/high16 v17, 0xc00000

    and-int v18, v10, v17

    if-nez v18, :cond_13

    and-int/lit16 v8, v11, 0x80

    if-nez v8, :cond_11

    move-object/from16 v8, p7

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_12

    const/high16 v20, 0x800000

    goto :goto_d

    :cond_11
    move-object/from16 v8, p7

    :cond_12
    const/high16 v20, 0x400000

    :goto_d
    or-int v0, v0, v20

    goto :goto_e

    :cond_13
    move-object/from16 v8, p7

    :goto_e
    and-int/lit16 v15, v11, 0x100

    move/from16 v21, v0

    const/high16 v22, 0x6000000

    if-eqz v15, :cond_14

    or-int v21, v21, v22

    move-object/from16 v0, p8

    goto :goto_10

    :cond_14
    and-int v22, v10, v22

    move-object/from16 v0, p8

    if-nez v22, :cond_16

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_15

    const/high16 v23, 0x4000000

    goto :goto_f

    :cond_15
    const/high16 v23, 0x2000000

    :goto_f
    or-int v21, v21, v23

    :cond_16
    :goto_10
    const v23, 0x2492493

    and-int v0, v21, v23

    const v3, 0x2492492

    if-ne v0, v3, :cond_18

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_11

    :cond_17
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v4, v5

    move-object v0, v6

    move-object v5, v9

    move-object v7, v13

    move-object v6, v14

    move-object/from16 v9, p8

    goto/16 :goto_2d

    :cond_18
    :goto_11
    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v0, v10, 0x1

    const v23, -0x380001

    const v24, -0x1c00001

    const/4 v3, 0x0

    if-eqz v0, :cond_1c

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_12

    :cond_19
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_1a

    and-int v21, v21, v23

    :cond_1a
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_1b

    and-int v21, v21, v24

    :cond_1b
    move-object v4, v5

    move-object v5, v9

    move-object v7, v13

    move/from16 v0, v21

    move-object/from16 v9, p8

    goto :goto_13

    :cond_1c
    :goto_12
    if-eqz v4, :cond_1d

    sget-object v0, Lb2/e;->w:Lb2/m;

    move-object v5, v0

    :cond_1d
    if-eqz v7, :cond_1e

    sget-object v0, Lgb/w;->x:Lgb/w;

    move-object v9, v0

    :cond_1e
    if-eqz v12, :cond_1f

    sget-object v0, Lgb/w;->y:Lgb/w;

    move-object v14, v0

    :cond_1f
    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_20

    and-int v21, v21, v23

    move-object v13, v9

    :cond_20
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_21

    and-int v0, v21, v24

    move/from16 v21, v0

    move-object v8, v14

    :cond_21
    if-eqz v15, :cond_1b

    move-object v4, v5

    move-object v5, v9

    move-object v7, v13

    move/from16 v0, v21

    move-object v9, v3

    :goto_13
    invoke-virtual {v6}, Lp1/q;->r()V

    sget-object v12, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v6, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/lifecycle/g0;

    invoke-static {v6}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v13

    if-eqz v13, :cond_4c

    invoke-interface {v13}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v13

    invoke-virtual {v1, v13}, Leb/u0;->P(Landroidx/lifecycle/e2;)V

    iget-object v13, v1, Leb/a0;->w:Leb/j1;

    const-string v15, "graph"

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Leb/a0;->K(Leb/r0;Landroid/os/Bundle;)V

    const-string v15, "composable"

    invoke-virtual {v13, v15}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v15

    instance-of v3, v15, Lgb/i;

    if-eqz v3, :cond_22

    check-cast v15, Lgb/i;

    goto :goto_14

    :cond_22
    const/4 v15, 0x0

    :goto_14
    if-nez v15, :cond_23

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_4b

    new-instance v0, Lgb/f0;

    const/4 v12, 0x0

    move-object/from16 v3, p2

    move-object v6, v14

    invoke-direct/range {v0 .. v12}, Lgb/f0;-><init>(Leb/u0;Leb/r0;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_23
    move-object/from16 v32, v8

    move-object v8, v1

    move-object/from16 v1, v32

    invoke-virtual {v15}, Leb/i1;->b()Leb/t;

    move-result-object v2

    iget-object v2, v2, Leb/t;->e:Lec3/r1;

    const/4 v10, 0x0

    invoke-static {v2, v6, v10}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v3, v11, :cond_24

    const/4 v3, 0x0

    invoke-static {v3, v6}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v3

    :cond_24
    check-cast v3, Lp1/z0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v11, :cond_25

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object/from16 v30, v10

    check-cast v30, Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    move-object/from16 p6, v3

    const/4 v3, 0x1

    if-le v10, v3, :cond_26

    move v10, v3

    goto :goto_15

    :cond_26
    const/4 v10, 0x0

    :goto_15
    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    or-int v23, v23, v24

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v23, :cond_28

    if-ne v3, v11, :cond_27

    goto :goto_16

    :cond_27
    move-object/from16 v23, p6

    goto :goto_17

    :cond_28
    :goto_16
    new-instance v3, Lbh/h;

    const/16 v23, 0x0

    move-object/from16 p5, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v15

    move-object/from16 p8, v23

    move-object/from16 p7, v30

    invoke-direct/range {p3 .. p8}, Lbh/h;-><init>(Lgb/i;Lp1/c1;Lp1/z0;Lp1/c1;Lq83/d;)V

    move-object/from16 v23, p6

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    check-cast v3, Lc93/m;

    move-object/from16 v31, v4

    const/4 v4, 0x0

    invoke-static {v10, v3, v6, v4}, Landroidx/room/c1;->c(ZLc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_29

    if-ne v4, v11, :cond_2a

    :cond_29
    new-instance v4, Lb3/t0;

    const/4 v3, 0x6

    invoke-direct {v4, v3, v8, v12}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v4, v6}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-static {v6}, Ly1/k;->g(Landroidx/compose/runtime/Composer;)Ly1/d;

    move-result-object v3

    iget-object v4, v8, Leb/a0;->k:Lec3/r1;

    const/4 v10, 0x0

    invoke-static {v4, v6, v10}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v11, :cond_2b

    new-instance v10, La3/l0;

    const/16 v12, 0xa

    invoke-direct {v10, v4, v12}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v10}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v10

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v10, Lp1/t2;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/q;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v11, :cond_2c

    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v6, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v12, Ljava/util/Map;

    move-object/from16 p6, v5

    const v5, 0x26f18efc

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    if-eqz v4, :cond_48

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    const/high16 v25, 0x380000

    and-int v25, v0, v25

    move/from16 p3, v5

    xor-int v5, v25, p9

    move-object/from16 v25, v14

    const/high16 v14, 0x100000

    if-le v5, v14, :cond_2d

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2e

    :cond_2d
    and-int v5, v0, p9

    if-ne v5, v14, :cond_2f

    :cond_2e
    const/4 v5, 0x1

    goto :goto_18

    :cond_2f
    const/4 v5, 0x0

    :goto_18
    or-int v5, p3, v5

    const v14, 0xe000

    and-int/2addr v14, v0

    move/from16 p3, v5

    const/16 v5, 0x4000

    if-ne v14, v5, :cond_30

    const/4 v5, 0x1

    goto :goto_19

    :cond_30
    const/4 v5, 0x0

    :goto_19
    or-int v5, p3, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_32

    if-ne v14, v11, :cond_31

    goto :goto_1a

    :cond_31
    move-object/from16 v19, v7

    move-object v5, v15

    move-object/from16 v15, p6

    goto :goto_1b

    :cond_32
    :goto_1a
    new-instance v5, Lgb/g0;

    const/4 v14, 0x0

    move-object/from16 p3, v5

    move-object/from16 p5, v7

    move/from16 p8, v14

    move-object/from16 p4, v15

    move-object/from16 p7, v30

    invoke-direct/range {p3 .. p8}, Lgb/g0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v14, p3

    move-object/from16 v5, p4

    move-object/from16 v19, p5

    move-object/from16 v15, p6

    invoke-virtual {v6, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    const/high16 v20, 0x1c00000

    and-int v20, v0, v20

    move-object/from16 p4, v5

    xor-int v5, v20, v17

    move/from16 p3, v7

    const/high16 v7, 0x800000

    if-le v5, v7, :cond_33

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_34

    :cond_33
    and-int v5, v0, v17

    if-ne v5, v7, :cond_35

    :cond_34
    const/4 v5, 0x1

    goto :goto_1c

    :cond_35
    const/4 v5, 0x0

    :goto_1c
    or-int v5, p3, v5

    const/high16 v7, 0x70000

    and-int/2addr v7, v0

    move-object/from16 p5, v1

    const/high16 v1, 0x20000

    if-ne v7, v1, :cond_36

    const/4 v1, 0x1

    goto :goto_1d

    :cond_36
    const/4 v1, 0x0

    :goto_1d
    or-int/2addr v1, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_38

    if-ne v5, v11, :cond_37

    goto :goto_1e

    :cond_37
    move-object/from16 v1, p4

    move-object/from16 v17, p5

    move-object/from16 v16, v25

    goto :goto_1f

    :cond_38
    :goto_1e
    new-instance v1, Lgb/g0;

    const/4 v5, 0x1

    move-object/from16 p3, v1

    move/from16 p8, v5

    move-object/from16 p6, v25

    move-object/from16 p7, v30

    invoke-direct/range {p3 .. p8}, Lgb/g0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v5, p3

    move-object/from16 v1, p4

    move-object/from16 v17, p5

    move-object/from16 v16, p6

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/high16 v7, 0xe000000

    and-int/2addr v7, v0

    move-object/from16 v18, v15

    const/high16 v15, 0x4000000

    if-ne v7, v15, :cond_39

    const/16 v24, 0x1

    goto :goto_20

    :cond_39
    const/16 v24, 0x0

    :goto_20
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v24, :cond_3a

    if-ne v7, v11, :cond_3b

    :cond_3a
    new-instance v7, Lc0/v0;

    const/4 v15, 0x6

    invoke-direct {v7, v9, v15}, Lc0/v0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    move-object/from16 v22, v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v20, :cond_3d

    if-ne v9, v11, :cond_3c

    goto :goto_21

    :cond_3c
    move-object/from16 v20, v13

    goto :goto_22

    :cond_3d
    :goto_21
    new-instance v9, Lb3/t0;

    move-object/from16 v20, v13

    const/4 v13, 0x7

    invoke-direct {v9, v13, v10, v1}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v9, v6}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v11, :cond_3e

    new-instance v9, Ld0/f1;

    invoke-direct {v9, v4}, Ld0/f1;-><init>(Leb/q;)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    check-cast v9, Ld0/f1;

    const-string v13, "entry"

    const/16 v15, 0x38

    invoke-static {v9, v13, v6, v15}, Ld0/d2;->e(Lal/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/z1;

    move-result-object v13

    invoke-static/range {v30 .. v30}, Lhg3/i;->f(Lp1/c1;)Z

    move-result v15

    if-eqz v15, :cond_41

    const v4, -0x489d2ea8

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    move-object/from16 v4, v23

    check-cast v4, Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    or-int v15, v15, v24

    move-object/from16 p5, v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v15, :cond_40

    if-ne v2, v11, :cond_3f

    goto :goto_23

    :cond_3f
    const/16 v21, 0x0

    goto :goto_24

    :cond_40
    :goto_23
    new-instance v2, Lg20/p;

    const/4 v15, 0x2

    move-object/from16 p3, v2

    move-object/from16 p4, v9

    move/from16 p8, v15

    move-object/from16 p6, v23

    const/16 p7, 0x0

    invoke-direct/range {p3 .. p8}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v21, p7

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    check-cast v2, Lc93/m;

    invoke-static {v6, v2, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    move-object v2, v13

    goto :goto_27

    :cond_41
    const/16 v21, 0x0

    const v2, -0x48994a6b

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v2, v15

    invoke-virtual {v6, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v2, v15

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v2, :cond_43

    if-ne v15, v11, :cond_42

    goto :goto_25

    :cond_42
    move-object v2, v13

    goto :goto_26

    :cond_43
    :goto_25
    new-instance v2, Landroidx/lifecycle/e1;

    const/16 v15, 0x9

    move-object/from16 p3, v2

    move-object/from16 p5, v4

    move-object/from16 p4, v9

    move-object/from16 p6, v13

    move/from16 p8, v15

    move-object/from16 p7, v21

    invoke-direct/range {p3 .. p8}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v15, p3

    move-object/from16 v2, p6

    invoke-virtual {v6, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_26
    check-cast v15, Lc93/m;

    invoke-static {v6, v15, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-virtual {v6, v4}, Lp1/q;->q(Z)V

    :goto_27
    invoke-virtual {v6, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v6, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v6, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_45

    if-ne v9, v11, :cond_44

    goto :goto_28

    :cond_44
    move-object v15, v1

    move-object v13, v12

    move-object v12, v10

    move-object/from16 v10, v30

    goto :goto_29

    :cond_45
    :goto_28
    new-instance v23, Lgb/a0;

    move-object/from16 v25, v1

    move-object/from16 v27, v5

    move-object/from16 v28, v7

    move-object/from16 v29, v10

    move-object/from16 v24, v12

    move-object/from16 v26, v14

    invoke-direct/range {v23 .. v30}, Lgb/a0;-><init>(Ljava/util/Map;Lgb/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/t2;Lp1/c1;)V

    move-object/from16 v9, v23

    move-object/from16 v13, v24

    move-object/from16 v15, v25

    move-object/from16 v12, v29

    move-object/from16 v10, v30

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_29
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget-object v4, Lgb/b0;->x:Lgb/b0;

    new-instance v1, Lgb/c0;

    invoke-direct {v1, v3, v10, v12}, Lgb/c0;-><init>(Ly1/d;Lp1/c1;Lp1/t2;)V

    const v3, 0x30ebd9dc

    invoke-static {v3, v6, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 v1, v0, 0x3

    and-int/lit8 v1, v1, 0x70

    const v3, 0x36000

    or-int/2addr v1, v3

    and-int/lit16 v0, v0, 0x1c00

    or-int v7, v1, v0

    move-object/from16 v1, p2

    move-object v0, v2

    move-object v2, v9

    move-object/from16 v3, v31

    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/a;->a(Ld0/z1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v3

    iget-object v1, v0, Ld0/z1;->a:Lal/a;

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v6, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_46

    if-ne v5, v11, :cond_47

    :cond_46
    new-instance v3, Lgb/d0;

    const/4 v5, 0x0

    move-object/from16 p4, v0

    move-object/from16 p3, v3

    move-object/from16 p9, v5

    move-object/from16 p5, v8

    move-object/from16 p7, v12

    move-object/from16 p6, v13

    move-object/from16 p8, v15

    invoke-direct/range {p3 .. p9}, Lgb/d0;-><init>(Ld0/z1;Leb/u0;Ljava/util/Map;Lp1/t2;Lgb/i;Lq83/d;)V

    move-object/from16 v5, p3

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_47
    check-cast v5, Lc93/m;

    invoke-static {v1, v2, v5, v6}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    :goto_2a
    const/4 v10, 0x0

    goto :goto_2b

    :cond_48
    move-object/from16 v18, p6

    move-object/from16 v17, v1

    move-object/from16 v19, v7

    move-object/from16 v22, v9

    move-object/from16 v20, v13

    move-object/from16 v16, v14

    move-object/from16 v4, v31

    const/16 v21, 0x0

    goto :goto_2a

    :goto_2b
    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    const-string v0, "dialog"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v0

    instance-of v1, v0, Lgb/q;

    if-eqz v1, :cond_49

    move-object v3, v0

    check-cast v3, Lgb/q;

    goto :goto_2c

    :cond_49
    move-object/from16 v3, v21

    :goto_2c
    if-nez v3, :cond_4a

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_4b

    new-instance v0, Lgb/f0;

    const/4 v12, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v6, v16

    move-object/from16 v8, v17

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v9, v22

    invoke-direct/range {v0 .. v12}, Lgb/f0;-><init>(Leb/u0;Leb/r0;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_4a
    move-object/from16 v25, v16

    move-object/from16 v8, v17

    move-object/from16 v5, v18

    move-object/from16 v7, v19

    move-object/from16 v9, v22

    const/4 v10, 0x0

    invoke-static {v3, v6, v10}, Landroidx/room/c1;->a(Lgb/q;Landroidx/compose/runtime/Composer;I)V

    move-object v0, v6

    move-object/from16 v6, v25

    :goto_2d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_4b

    new-instance v0, Lgb/e0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lgb/e0;-><init>(Leb/u0;Leb/r0;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_4b
    return-void

    :cond_4c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c0(Lcj/c;Lqi/i;Z)Lxi/b;
    .locals 3

    new-instance v0, Lxi/b;

    if-eqz p2, :cond_0

    invoke-static {}, Ldj/i;->c()F

    move-result p2

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    sget-object v1, Lbj/f;->c:Lbj/f;

    const/4 v2, 0x0

    invoke-static {p0, p1, p2, v1, v2}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object p0

    const/4 p1, 0x7

    invoke-direct {v0, p0, p1}, Lal/a;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final d(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p9

    move/from16 v14, p11

    move/from16 v15, p12

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v1, 0x6daffdb6

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    and-int/lit8 v4, v14, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit8 v4, v15, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v14, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v1, v7

    :goto_4
    or-int/lit16 v7, v1, 0x6c00

    and-int/lit8 v8, v15, 0x20

    if-eqz v8, :cond_8

    const v7, 0x36c00

    or-int/2addr v7, v1

    :cond_7
    move-object/from16 v1, p4

    goto :goto_6

    :cond_8
    const/high16 v1, 0x30000

    and-int/2addr v1, v14

    if-nez v1, :cond_7

    move-object/from16 v1, p4

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/high16 v10, 0x20000

    goto :goto_5

    :cond_9
    const/high16 v10, 0x10000

    :goto_5
    or-int/2addr v7, v10

    :goto_6
    and-int/lit8 v10, v15, 0x40

    const/high16 v11, 0x180000

    if-eqz v10, :cond_b

    or-int/2addr v7, v11

    :cond_a
    move-object/from16 v11, p5

    goto :goto_8

    :cond_b
    and-int/2addr v11, v14

    if-nez v11, :cond_a

    move-object/from16 v11, p5

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    const/high16 v16, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v16, 0x80000

    :goto_7
    or-int v7, v7, v16

    :goto_8
    const/high16 v16, 0xc00000

    and-int v16, v14, v16

    if-nez v16, :cond_d

    const/high16 v16, 0x400000

    or-int v7, v7, v16

    :cond_d
    const/high16 v16, 0x6000000

    and-int v16, v14, v16

    if-nez v16, :cond_e

    const/high16 v16, 0x2000000

    or-int v7, v7, v16

    :cond_e
    and-int/lit16 v3, v15, 0x200

    const/high16 v16, 0x30000000

    if-eqz v3, :cond_f

    or-int v7, v7, v16

    move-object/from16 v5, p8

    goto :goto_a

    :cond_f
    and-int v16, v14, v16

    move-object/from16 v5, p8

    if-nez v16, :cond_11

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000000

    goto :goto_9

    :cond_10
    const/high16 v17, 0x10000000

    :goto_9
    or-int v7, v7, v17

    :cond_11
    :goto_a
    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/16 v17, 0x4

    goto :goto_b

    :cond_12
    const/16 v17, 0x2

    :goto_b
    const v18, 0x12492493

    and-int v2, v7, v18

    const v1, 0x12492492

    if-ne v2, v1, :cond_14

    and-int/lit8 v1, v17, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_14

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_c

    :cond_13
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object v3, v6

    move-object v0, v9

    move-object v6, v11

    move-object v9, v5

    move-object/from16 v5, p4

    goto/16 :goto_13

    :cond_14
    :goto_c
    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v1, v14, 0x1

    const v2, -0xfc00001

    if-eqz v1, :cond_16

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_d

    :cond_15
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int v1, v7, v2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v7, p7

    move-object v8, v5

    move-object v2, v6

    move-object v5, v11

    move-object/from16 v6, p6

    goto :goto_10

    :cond_16
    :goto_d
    if-eqz v4, :cond_17

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v6, v1

    :cond_17
    sget-object v1, Lb2/e;->w:Lb2/m;

    if-eqz v8, :cond_18

    sget-object v4, Lgb/b0;->y:Lgb/b0;

    goto :goto_e

    :cond_18
    move-object/from16 v4, p4

    :goto_e
    if-eqz v10, :cond_19

    sget-object v8, Lgb/b0;->z:Lgb/b0;

    goto :goto_f

    :cond_19
    move-object v8, v11

    :goto_f
    and-int/2addr v2, v7

    if-eqz v3, :cond_1a

    const/4 v3, 0x0

    move-object v5, v8

    move-object v7, v5

    move-object v8, v3

    move-object v3, v1

    move v1, v2

    move-object v2, v6

    move-object v6, v4

    goto :goto_10

    :cond_1a
    move-object v3, v1

    move v1, v2

    move-object v2, v6

    move-object v7, v8

    move-object v6, v4

    move-object v8, v5

    move-object v5, v7

    :goto_10
    invoke-virtual {v9}, Lp1/q;->r()V

    const v10, 0xe000

    and-int v11, v1, v10

    move/from16 p2, v10

    const/16 v10, 0x4000

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-ne v11, v10, :cond_1b

    move/from16 v10, v19

    goto :goto_11

    :cond_1b
    move/from16 v10, v18

    :goto_11
    and-int/lit8 v11, v1, 0x70

    move-object/from16 p3, v2

    const/16 v2, 0x20

    if-ne v11, v2, :cond_1c

    move/from16 v2, v19

    goto :goto_12

    :cond_1c
    move/from16 v2, v18

    :goto_12
    or-int/2addr v2, v10

    and-int/lit8 v10, v17, 0xe

    const/4 v11, 0x4

    if-ne v10, v11, :cond_1d

    move/from16 v18, v19

    :cond_1d
    or-int v2, v2, v18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_1e

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v10, v2, :cond_1f

    :cond_1e
    iget-object v2, v0, Leb/a0;->w:Leb/j1;

    new-instance v10, Leb/s0;

    invoke-direct {v10, v2, v12}, Leb/s0;-><init>(Leb/j1;Ljava/lang/String;)V

    invoke-interface {v13, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Leb/s0;->g()Leb/r0;

    move-result-object v10

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v10, Leb/r0;

    and-int/lit16 v2, v1, 0x1f8e

    shr-int/lit8 v1, v1, 0x3

    and-int v11, v1, p2

    or-int/2addr v2, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v1

    or-int/2addr v2, v11

    const/high16 v11, 0xe000000

    and-int/2addr v1, v11

    or-int/2addr v1, v2

    const/4 v11, 0x0

    move-object v2, v10

    move v10, v1

    move-object v1, v2

    move-object/from16 v2, p3

    invoke-static/range {v0 .. v11}, Lhg3/i;->c(Leb/u0;Leb/r0;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    :goto_13
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_20

    move-object v1, v0

    new-instance v0, Lgb/v;

    move-object v2, v12

    move-object v10, v13

    move v11, v14

    move v12, v15

    move-object v13, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v12}, Lgb/v;-><init>(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method public static d0(Lcj/d;Lqi/i;I)Lxi/a;
    .locals 10

    new-instance v0, Lxi/a;

    new-instance v1, Lbj/l;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput p2, v1, Lbj/l;->a:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-static {p0, p1, p2, v1, v2}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object p0

    move p1, v2

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_4

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lej/a;

    iget-object v1, p2, Lej/a;->b:Ljava/lang/Object;

    check-cast v1, Lyi/c;

    iget-object v3, p2, Lej/a;->c:Ljava/lang/Object;

    check-cast v3, Lyi/c;

    if-eqz v1, :cond_3

    if-eqz v3, :cond_3

    iget-object v4, v1, Lyi/c;->a:[F

    array-length v5, v4

    iget-object v6, v3, Lyi/c;->a:[F

    array-length v7, v6

    if-ne v5, v7, :cond_0

    goto :goto_2

    :cond_0
    array-length p2, v4

    array-length v5, v6

    add-int/2addr p2, v5

    new-array v5, p2, [F

    array-length v7, v4

    invoke-static {v4, v2, v5, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v4, v4

    array-length v7, v6

    invoke-static {v6, v2, v5, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v5}, Ljava/util/Arrays;->sort([F)V

    const/high16 v4, 0x7fc00000    # Float.NaN

    move v6, v2

    move v7, v6

    :goto_1
    if-ge v6, p2, :cond_2

    aget v8, v5, v6

    cmpl-float v9, v8, v4

    if-eqz v9, :cond_1

    aput v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    aget v4, v5, v6

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v5, v2, v7}, Ljava/util/Arrays;->copyOfRange([FII)[F

    move-result-object p2

    invoke-virtual {v1, p2}, Lyi/c;->b([F)Lyi/c;

    move-result-object v1

    invoke-virtual {v3, p2}, Lyi/c;->b([F)Lyi/c;

    move-result-object p2

    new-instance v3, Lej/a;

    invoke-direct {v3, v1, p2}, Lej/a;-><init>(Lyi/c;Lyi/c;)V

    move-object p2, v3

    :cond_3
    :goto_2
    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    invoke-direct {v0, p0, p1}, Lxi/a;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public static final e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v12, p1

    move-object/from16 v13, p3

    move/from16 v14, p5

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v1, 0x8741dc0

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    and-int/lit8 v2, v14, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    or-int/lit16 v1, v1, 0xd80

    and-int/lit16 v2, v14, 0x6000

    const/16 v4, 0x4000

    if-nez v2, :cond_5

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    const/16 v2, 0x2000

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x2493

    const/16 v5, 0x2492

    if-ne v2, v5, :cond_7

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v5, p2

    goto :goto_7

    :cond_7
    :goto_4
    and-int/lit16 v2, v1, 0x1c00

    const/16 v5, 0x800

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v2, v5, :cond_8

    move v2, v7

    goto :goto_5

    :cond_8
    move v2, v6

    :goto_5
    and-int/lit8 v5, v1, 0x70

    if-ne v5, v3, :cond_9

    move v3, v7

    goto :goto_6

    :cond_9
    move v3, v6

    :goto_6
    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    if-ne v3, v4, :cond_a

    move v6, v7

    :cond_a
    or-int/2addr v2, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_c

    :cond_b
    iget-object v2, p0, Leb/a0;->w:Leb/j1;

    new-instance v3, Leb/s0;

    invoke-direct {v3, v2, v12}, Leb/s0;-><init>(Leb/j1;Ljava/lang/String;)V

    invoke-interface {v13, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Leb/s0;->g()Leb/r0;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Leb/r0;

    and-int/lit16 v10, v1, 0x38e

    const/16 v11, 0x1f8

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lhg3/i;->c(Leb/u0;Leb/r0;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v2

    :goto_7
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lgb/z;

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, v12

    move-object v6, v13

    move v1, v14

    invoke-direct/range {v0 .. v6}, Lgb/z;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static e0(Lcj/c;Lqi/i;)Lxi/a;
    .locals 4

    new-instance v0, Lxi/a;

    sget-object v1, Lbj/f;->d:Lbj/f;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {p0, p1, v2, v1, v3}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object p0

    const/4 p1, 0x2

    invoke-direct {v0, p0, p1}, Lxi/a;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public static final f(Lp1/c1;)Z
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static f0(Lcj/d;Lqi/i;)Lxi/a;
    .locals 4

    new-instance v0, Lxi/a;

    invoke-static {}, Ldj/i;->c()F

    move-result v1

    sget-object v2, Lbj/f;->f:Lbj/f;

    const/4 v3, 0x1

    invoke-static {p0, p1, v1, v2, v3}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object p0

    const/4 p1, 0x3

    invoke-direct {v0, p0, p1}, Lxi/a;-><init>(Ljava/util/List;I)V

    return-object v0
.end method

.method public static g(Ljava/lang/String;Ll3/v0;JLy3/c;Lp3/h;II)Ll3/a;
    .locals 7

    move-object v1, p0

    new-instance p0, Ll3/a;

    new-instance v0, Lt3/c;

    sget-object v3, Lm83/y;->w:Lm83/y;

    move-object v4, v3

    move-object v2, p1

    move-object v6, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lt3/c;-><init>(Ljava/lang/String;Ll3/v0;Ljava/util/List;Ljava/util/List;Lp3/h;Ly3/c;)V

    move-wide p4, p2

    move-object p1, v0

    const/4 p3, 0x1

    move p2, p6

    invoke-direct/range {p0 .. p5}, Ll3/a;-><init>(Lt3/c;IIJ)V

    return-object p0
.end method

.method public static g0(Landroidx/compose/ui/Modifier;Lj1/l;)Landroidx/compose/ui/Modifier;
    .locals 16

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v1, 0x1

    const-class v3, Lj1/l;

    const-string v4, "onPull"

    const-string v5, "onPull$material(F)F"

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v8, Lj1/h;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v9, 0x2

    const-class v11, Lj1/l;

    const-string v12, "onRelease"

    const-string v13, "onRelease$material(F)F"

    move-object/from16 v10, p1

    invoke-direct/range {v8 .. v15}, Lj1/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v1, Lj1/j;

    invoke-direct {v1, v0, v8}, Lj1/j;-><init>(Landroidx/room/u;Lj1/h;)V

    const/4 v0, 0x0

    move-object/from16 v2, p0

    invoke-static {v2, v1, v0}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method

.method public static final h(JJ)Lh2/c;
    .locals 7

    new-instance v0, Lh2/c;

    const/16 v1, 0x20

    shr-long v2, p0, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p0, v3

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    shr-long v5, p2, v1

    long-to-int p1, v5

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    and-long/2addr p2, v3

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-direct {v0, v2, p0, p1, p2}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public static final i(FJ)Lh2/c;
    .locals 5

    new-instance v0, Lh2/c;

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float/2addr v2, p0

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    sub-float/2addr p2, p0

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float/2addr v1, p0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    add-float/2addr p1, p0

    invoke-direct {v0, v2, p2, v1, p1}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public static final j(JJ)Lh2/c;
    .locals 8

    new-instance v0, Lh2/c;

    const/16 v1, 0x20

    shr-long v2, p0, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p0, v4

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    shr-long v6, p2, v1

    long-to-int v1, v6

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float/2addr v1, v2

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    and-long/2addr p2, v4

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    add-float/2addr p2, p0

    invoke-direct {v0, v3, p1, v1, p2}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public static final j0(Lzt/q;Lma3/b;)Lia3/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationsOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lia3/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lia3/c;-><init>(Lzt/q;Lma3/b;Z)V

    return-object v0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move/from16 v10, p10

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, 0xa6081e7

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v10, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, p11, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p11, 0x4

    if-nez v6, :cond_6

    move-wide/from16 v6, p2

    invoke-virtual {v0, v6, v7}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v6, p2

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_5

    :cond_8
    move-wide/from16 v6, p2

    :goto_5
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_b

    and-int/lit8 v8, p11, 0x8

    if-nez v8, :cond_9

    move-wide/from16 v8, p4

    invoke-virtual {v0, v8, v9}, Lp1/q;->f(J)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    move-wide/from16 v8, p4

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    goto :goto_7

    :cond_b
    move-wide/from16 v8, p4

    :goto_7
    and-int/lit8 v11, p11, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v12, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p6

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, p11, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v3, v14

    :cond_f
    move/from16 v14, p7

    goto :goto_b

    :cond_10
    and-int/2addr v14, v10

    if-nez v14, :cond_f

    move/from16 v14, p7

    invoke-virtual {v0, v14}, Lp1/q;->d(F)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v3, v15

    :goto_b
    const/high16 v15, 0x180000

    and-int/2addr v15, v10

    if-nez v15, :cond_13

    move-object/from16 v15, p8

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    goto :goto_d

    :cond_13
    move-object/from16 v15, p8

    :goto_d
    const v16, 0x92493

    move/from16 p9, v1

    and-int v1, v3, v16

    const v2, 0x92492

    move/from16 v16, v3

    const/4 v3, 0x0

    const/16 v17, 0x1

    if-eq v1, v2, :cond_14

    move/from16 v1, v17

    goto :goto_e

    :cond_14
    move v1, v3

    :goto_e
    and-int/lit8 v2, v16, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v10, 0x1

    if-eqz v1, :cond_16

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_10

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v17, p0

    :goto_f
    move-object/from16 v18, v5

    move-wide/from16 v19, v6

    move-object/from16 v22, v12

    move/from16 v23, v14

    goto :goto_12

    :cond_16
    :goto_10
    if-eqz p9, :cond_17

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_11

    :cond_17
    move-object/from16 v1, p0

    :goto_11
    if-eqz v4, :cond_18

    sget-object v2, Li2/w0;->a:Li2/v0;

    move-object v5, v2

    :cond_18
    and-int/lit8 v2, p11, 0x4

    if-eqz v2, :cond_19

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->h()J

    move-result-wide v6

    :cond_19
    and-int/lit8 v2, p11, 0x8

    if-eqz v2, :cond_1a

    invoke-static {v6, v7, v0}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v8

    :cond_1a
    if-eqz v11, :cond_1b

    const/4 v2, 0x0

    move-object v12, v2

    :cond_1b
    if-eqz v13, :cond_1c

    int-to-float v2, v3

    move-object/from16 v17, v1

    move/from16 v23, v2

    move-object/from16 v18, v5

    move-wide/from16 v19, v6

    move-object/from16 v22, v12

    goto :goto_12

    :cond_1c
    move-object/from16 v17, v1

    goto :goto_f

    :goto_12
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v1, Lg1/u2;->b:Lp1/b0;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    add-float v2, v2, v23

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    new-instance v4, Li2/x;

    invoke-direct {v4, v8, v9}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    new-instance v4, Ly3/f;

    invoke-direct {v4, v2}, Ly3/f;-><init>(F)V

    invoke-virtual {v1, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    filled-new-array {v3, v1}, [Lp1/u1;

    move-result-object v1

    new-instance v16, Lg1/x6;

    move/from16 v21, v2

    move-object/from16 v24, v15

    invoke-direct/range {v16 .. v24}, Lg1/x6;-><init>(Landroidx/compose/ui/Modifier;Li2/a1;JFLf0/t;FLc93/m;)V

    move-object/from16 v2, v16

    const v3, -0x7776e959

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v1, v2, v0, v3}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-wide v5, v8

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    move-wide/from16 v3, v19

    move-object/from16 v7, v22

    move/from16 v8, v23

    goto :goto_13

    :cond_1d
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object v2, v5

    move-wide v3, v6

    move-wide v5, v8

    move-object v7, v12

    move v8, v14

    :goto_13
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_1e

    new-instance v0, Lg1/u6;

    move-object/from16 v9, p8

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lg1/u6;-><init>(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method public static k0(Lio/sentry/g0;)Z
    .locals 3

    const-class v0, Lio/sentry/hints/d;

    const-string v1, "sentry:typeCheckHint"

    invoke-virtual {p0, v1}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-class v0, Lio/sentry/hints/b;

    invoke-virtual {p0, v1}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-class v0, Lio/sentry/android/core/p0;

    invoke-virtual {p0, v1}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final l(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JJLf0/t;FLj0/i;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    move-wide/from16 v7, p6

    move/from16 v10, p9

    move/from16 v0, p13

    move-object/from16 v1, p12

    check-cast v1, Lp1/q;

    const v2, 0x7fa1c77a

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0x6

    move-object/from16 v15, p0

    if-nez v2, :cond_1

    invoke-virtual {v1, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v3, v0, 0x30

    move-object/from16 v14, p1

    if-nez v3, :cond_3

    invoke-virtual {v1, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit8 v3, p14, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v2, v2, 0x180

    :cond_4
    move/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v0, 0x180

    if-nez v4, :cond_4

    move/from16 v4, p2

    invoke-virtual {v1, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :goto_4
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_8

    move-object/from16 v5, p3

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v2, v6

    goto :goto_6

    :cond_8
    move-object/from16 v5, p3

    :goto_6
    and-int/lit16 v6, v0, 0x6000

    move-wide/from16 v12, p4

    if-nez v6, :cond_a

    invoke-virtual {v1, v12, v13}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x4000

    goto :goto_7

    :cond_9
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v2, v6

    :cond_a
    const/high16 v6, 0x30000

    and-int/2addr v6, v0

    if-nez v6, :cond_c

    invoke-virtual {v1, v7, v8}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_b

    const/high16 v6, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v6, 0x10000

    :goto_8
    or-int/2addr v2, v6

    :cond_c
    and-int/lit8 v6, p14, 0x40

    const/high16 v9, 0x180000

    if-eqz v6, :cond_e

    or-int/2addr v2, v9

    :cond_d
    move-object/from16 v9, p8

    goto :goto_a

    :cond_e
    and-int/2addr v9, v0

    if-nez v9, :cond_d

    move-object/from16 v9, p8

    invoke-virtual {v1, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    const/high16 v11, 0x100000

    goto :goto_9

    :cond_f
    const/high16 v11, 0x80000

    :goto_9
    or-int/2addr v2, v11

    :goto_a
    const/high16 v11, 0xc00000

    and-int/2addr v11, v0

    if-nez v11, :cond_11

    invoke-virtual {v1, v10}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x800000

    goto :goto_b

    :cond_10
    const/high16 v11, 0x400000

    :goto_b
    or-int/2addr v2, v11

    :cond_11
    const/high16 v11, 0x6000000

    and-int/2addr v11, v0

    if-nez v11, :cond_13

    move-object/from16 v11, p10

    invoke-virtual {v1, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x4000000

    goto :goto_c

    :cond_12
    const/high16 v16, 0x2000000

    :goto_c
    or-int v2, v2, v16

    goto :goto_d

    :cond_13
    move-object/from16 v11, p10

    :goto_d
    const/high16 v16, 0x30000000

    and-int v16, v0, v16

    move-object/from16 v0, p11

    if-nez v16, :cond_15

    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x20000000

    goto :goto_e

    :cond_14
    const/high16 v16, 0x10000000

    :goto_e
    or-int v2, v2, v16

    :cond_15
    const v16, 0x12492493

    and-int v0, v2, v16

    move/from16 p12, v2

    const v2, 0x12492492

    const/16 v16, 0x1

    if-eq v0, v2, :cond_16

    move/from16 v0, v16

    goto :goto_f

    :cond_16
    const/4 v0, 0x0

    :goto_f
    and-int/lit8 v2, p12, 0x1

    invoke-virtual {v1, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v0, p13, 0x1

    if-eqz v0, :cond_19

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_11

    :cond_17
    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_18
    :goto_10
    move/from16 v20, v4

    move-object/from16 v16, v9

    goto :goto_12

    :cond_19
    :goto_11
    if-eqz v3, :cond_1a

    move/from16 v4, v16

    :cond_1a
    if-eqz v6, :cond_18

    const/4 v0, 0x0

    move-object v9, v0

    goto :goto_10

    :goto_12
    invoke-virtual {v1}, Lp1/q;->r()V

    sget-object v0, Lg1/u2;->b:Lp1/b0;

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    add-float/2addr v2, v10

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    new-instance v4, Li2/x;

    invoke-direct {v4, v7, v8}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    new-instance v4, Ly3/f;

    invoke-direct {v4, v2}, Ly3/f;-><init>(F)V

    invoke-virtual {v0, v4}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v3, v0}, [Lp1/u1;

    move-result-object v0

    new-instance v9, Lg1/y6;

    move-object/from16 v19, p11

    move-object/from16 v17, v5

    move-object/from16 v18, v11

    move v11, v10

    move v10, v2

    invoke-direct/range {v9 .. v20}, Lg1/y6;-><init>(FFJLandroidx/compose/ui/Modifier;Lc93/a;Lf0/t;Li2/a1;Lj0/i;Lx1/b;Z)V

    const v2, -0x694c4546

    invoke-static {v2, v1, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v0, v2, v1, v3}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v9, v16

    move/from16 v3, v20

    goto :goto_13

    :cond_1b
    invoke-virtual {v1}, Lp1/q;->X()V

    move v3, v4

    :goto_13
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_1c

    new-instance v0, Lg1/v6;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lg1/v6;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JJLf0/t;FLj0/i;Lx1/b;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method public static final l0(ILjava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const-string p0, ", message: "

    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Landroid/database/SQLException;

    invoke-direct {p1, p0}, Landroid/database/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final m(Ljava/io/File;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, La6/q0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/q0;

    iget v1, v0, La6/q0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/q0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/q0;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, La6/q0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/q0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, La6/q0;->w:Ljava/io/File;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, La6/q0;->w:Ljava/io/File;

    iput v3, v0, La6/q0;->y:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p0

    :goto_1
    instance-of p2, p1, Landroidx/datastore/core/CorruptionException;

    if-eqz p2, :cond_4

    throw p1

    :cond_4
    invoke-static {p0, p1}, Ltx/f;->u(Ljava/io/File;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static final m0(Lorg/json/JSONObject;)Ljk/a;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljk/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "event_type"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this.getString(\"event_type\")"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ljk/a;->M:Ljava/lang/String;

    const-string v1, "user_id"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->a:Ljava/lang/String;

    const-string v1, "device_id"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->b:Ljava/lang/String;

    const-string v1, "time"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iput-object v1, v0, Ljk/a;->c:Ljava/lang/Long;

    const-string v1, "event_properties"

    invoke-static {v1, p0}, Lhg3/i;->Z(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Le93/b;->g0(Lorg/json/JSONObject;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    iput-object v1, v0, Ljk/a;->N:Ljava/util/LinkedHashMap;

    const-string v1, "user_properties"

    invoke-static {v1, p0}, Lhg3/i;->Z(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Le93/b;->g0(Lorg/json/JSONObject;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    iput-object v1, v0, Ljk/a;->O:Ljava/util/LinkedHashMap;

    const-string v1, "groups"

    invoke-static {v1, p0}, Lhg3/i;->Z(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Le93/b;->g0(Lorg/json/JSONObject;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    iput-object v1, v0, Ljk/a;->P:Ljava/util/LinkedHashMap;

    const-string v1, "group_properties"

    invoke-static {v1, p0}, Lhg3/i;->Z(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Le93/b;->g0(Lorg/json/JSONObject;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v3

    :goto_4
    iput-object v1, v0, Ljk/a;->Q:Ljava/util/LinkedHashMap;

    const-string v1, "app_version"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->i:Ljava/lang/String;

    const-string v1, "platform"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->k:Ljava/lang/String;

    const-string v1, "os_name"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->l:Ljava/lang/String;

    const-string v1, "os_version"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->m:Ljava/lang/String;

    const-string v1, "device_brand"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->n:Ljava/lang/String;

    const-string v1, "device_manufacturer"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->o:Ljava/lang/String;

    const-string v1, "device_model"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->p:Ljava/lang/String;

    const-string v1, "carrier"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->q:Ljava/lang/String;

    const-string v1, "country"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->r:Ljava/lang/String;

    const-string v1, "region"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->s:Ljava/lang/String;

    const-string v1, "city"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->t:Ljava/lang/String;

    const-string v1, "dma"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->u:Ljava/lang/String;

    const-string v1, "language"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->A:Ljava/lang/String;

    const-string v1, "price"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_5

    :cond_5
    move-object v1, v3

    :goto_5
    iput-object v1, v0, Ljk/a;->G:Ljava/lang/Double;

    const-string v1, "quantity"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_6

    :cond_6
    move-object v1, v3

    :goto_6
    iput-object v1, v0, Ljk/a;->H:Ljava/lang/Integer;

    const-string v1, "revenue"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_7

    :cond_7
    move-object v1, v3

    :goto_7
    iput-object v1, v0, Ljk/a;->F:Ljava/lang/Double;

    const-string v1, "productId"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->I:Ljava/lang/String;

    const-string v1, "revenueType"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->J:Ljava/lang/String;

    const-string v1, "location_lat"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_8

    :cond_8
    move-object v1, v3

    :goto_8
    iput-object v1, v0, Ljk/a;->g:Ljava/lang/Double;

    const-string v1, "location_lng"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_9

    :cond_9
    move-object v1, v3

    :goto_9
    iput-object v1, v0, Ljk/a;->h:Ljava/lang/Double;

    const-string v1, "ip"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->C:Ljava/lang/String;

    const-string v1, "idfa"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->v:Ljava/lang/String;

    const-string v1, "idfv"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->w:Ljava/lang/String;

    const-string v1, "adid"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->x:Ljava/lang/String;

    const-string v1, "android_id"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->z:Ljava/lang/String;

    const-string v1, "android_app_set_id"

    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->y:Ljava/lang/String;

    const-string v1, "event_id"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_a

    :cond_a
    move-object v1, v3

    :goto_a
    iput-object v1, v0, Ljk/a;->d:Ljava/lang/Long;

    const-string v1, "session_id"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_b

    :cond_b
    move-object v1, v3

    :goto_b
    iput-object v1, v0, Ljk/a;->e:Ljava/lang/Long;

    const-string v1, "insert_id"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->f:Ljava/lang/String;

    const-string v1, "library"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :cond_c
    move-object v1, v3

    :goto_c
    iput-object v1, v0, Ljk/a;->B:Ljava/lang/String;

    const-string v1, "partner_id"

    invoke-static {v1, p0}, Lhg3/i;->a0(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ljk/a;->K:Ljava/lang/String;

    const-string v1, "plan"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "this.getJSONObject(\"plan\")"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lds/p;->F(Lorg/json/JSONObject;)Ljk/d;

    move-result-object v1

    goto :goto_d

    :cond_d
    move-object v1, v3

    :goto_d
    iput-object v1, v0, Ljk/a;->D:Ljk/d;

    const-string v1, "ingestion_metadata"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "this.getJSONObject(\"ingestion_metadata\")"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ldp/d;->C(Lorg/json/JSONObject;)Ljk/c;

    move-result-object v3

    :cond_e
    iput-object v3, v0, Ljk/a;->E:Ljk/c;

    return-object v0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;F)Landroidx/compose/ui/Modifier;
    .locals 9

    const-wide/16 v6, 0x0

    const/16 v8, 0x18

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move v1, p5

    invoke-static/range {v0 .. v8}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object p1, Lb2/t;->w:Lb2/t;

    if-eqz p4, :cond_0

    iget p5, p4, Lf0/t;->a:F

    iget-object p4, p4, Lf0/t;->b:Li2/t;

    invoke-static {p5, p1, p4, v2}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    :cond_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, p2, p3, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p0, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final n0(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v2, v1

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "this.getJSONObject(it)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lhg3/i;->m0(Lorg/json/JSONObject;)Ljk/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final o(JLg1/s1;FLp1/q;)J
    .locals 8

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {p4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->h()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    const v0, -0x4307f3b6

    invoke-virtual {p4, v0}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    move-wide v3, p0

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lg1/s1;->a(JFLandroidx/compose/runtime/Composer;I)J

    move-result-wide p0

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    return-wide p0

    :cond_0
    move-wide v3, p0

    move-object v6, p4

    const p0, -0x4306e9ab

    invoke-virtual {v6, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    return-wide v3
.end method

.method public static final o0(Llb3/y;)Ljava/lang/Class;
    .locals 2

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    invoke-static {v0}, Lhg3/i;->p0(Lr93/k;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Llb3/d1;->e(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lya3/h;->h(Llb3/y;)Llb3/c0;

    move-result-object p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, Llb3/d1;->e(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p0}, Lo93/h;->G(Llb3/y;)Z

    move-result p0

    if-nez p0, :cond_3

    :goto_0
    return-object v0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static p(Ljava/util/concurrent/atomic/AtomicLong;J)V
    .locals 8

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    add-long v4, v0, p1

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-gez v6, :cond_2

    goto :goto_0

    :cond_2
    move-wide v2, v4

    :goto_0
    invoke-virtual {p0, v0, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    return-void
.end method

.method public static final p0(Lr93/k;)Ljava/lang/Class;
    .locals 4

    instance-of v0, p0, Lr93/e;

    if-eqz v0, :cond_1

    invoke-static {p0}, Lya3/h;->b(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lr93/e;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/UtilKt;->toJavaClass(Lr93/e;)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Class object for the class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " cannot be found (classId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p0, Lr93/h;

    invoke-static {p0}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final q(Lqi/i;ZZLui/o;FILp1/q;I)Lui/b;
    .locals 15

    move-object/from16 v0, p6

    move/from16 v1, p7

    const v2, 0x28bfd0f4

    invoke-virtual {v0, v2}, Lp1/q;->f0(I)V

    and-int/lit8 v2, v1, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v5, v3

    goto :goto_0

    :cond_0
    move/from16 v5, p1

    :goto_0
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_1

    move v6, v3

    goto :goto_1

    :cond_1
    move/from16 v6, p2

    :goto_1
    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    move-object v11, v2

    goto :goto_2

    :cond_2
    move-object/from16 v11, p3

    :goto_2
    and-int/lit8 v2, v1, 0x20

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v2, :cond_3

    move v2, v4

    goto :goto_3

    :cond_3
    move/from16 v2, p4

    :goto_3
    and-int/lit8 v7, v1, 0x40

    if-eqz v7, :cond_4

    move v9, v3

    goto :goto_4

    :cond_4
    move/from16 v9, p5

    :goto_4
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_5

    :goto_5
    move v12, v3

    goto :goto_6

    :cond_5
    const/4 v3, 0x2

    goto :goto_5

    :goto_6
    if-lez v9, :cond_8

    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {v0}, Ljc/x;->n0(Lp1/q;)Lui/b;

    move-result-object v7

    const v1, -0x1d58f75c

    invoke-virtual {v0, v1}, Lp1/q;->f0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_6

    invoke-static {v5, v0}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v1

    :cond_6
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    move-object v13, v1

    check-cast v13, Lp1/c1;

    const v1, -0xac3d772

    invoke-virtual {v0, v1}, Lp1/q;->f0(I)V

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    sget-object v8, Ldj/i;->a:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v8, "animator_duration_scale"

    invoke-static {v1, v8, v4}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v1

    div-float v10, v2, v1

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {p0, v1, v11, v2, v4}, [Ljava/lang/Object;

    move-result-object v1

    new-instance v4, Lui/a;

    const/4 v14, 0x0

    move-object v8, p0

    invoke-direct/range {v4 .. v14}, Lui/a;-><init>(ZZLui/b;Lqi/i;IFLui/o;ILp1/c1;Lq83/d;)V

    invoke-static {v1, v4, v0}, Lp1/x;->j([Ljava/lang/Object;Lc93/m;Lp1/q;)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    return-object v7

    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Speed must be a finite number. It is "

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    const-string p0, "Iterations must be a positive number ("

    const-string v0, ")."

    invoke-static {v9, p0, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final q0(Lorg/json/JSONArray;)[I
    .locals 4

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optInt(I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static final r(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/a;
    .locals 1

    const-string v0, "src2Dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dest2Src"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhf/a;

    invoke-direct {v0, p0, p1, p2}, Lhf/a;-><init>(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final r0(Lorg/json/JSONArray;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    invoke-virtual {v1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v2, v1

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "this.getJSONObject(it)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final s(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lhf/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "src2Dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dest2Src"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhf/f;

    invoke-direct {v0, p0, p1, p2}, Lhf/f;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final s0(Lbc3/c0;Lq83/j;ZLc93/m;)Lio/ktor/utils/io/t;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/ktor/utils/io/m;

    sget-object v1, Lio/ktor/utils/io/internal/g;->c:Lio/ktor/utils/io/internal/f;

    const/16 v2, 0x8

    invoke-direct {v0, p2, v1, v2}, Lio/ktor/utils/io/m;-><init>(ZLx63/f;I)V

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p2

    sget-object v1, Lbc3/z;->Key:Lbc3/y;

    invoke-interface {p2, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    check-cast p2, Lbc3/z;

    new-instance v1, Landroidx/lifecycle/e1;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p3, p2, v2}, Landroidx/lifecycle/e1;-><init>(Lio/ktor/utils/io/m;Lc93/m;Lbc3/z;Lq83/d;)V

    const/4 p2, 0x2

    invoke-static {p0, p1, v2, v1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    new-instance p1, Lio/ktor/utils/io/l;

    invoke-direct {p1, v0, p2}, Lio/ktor/utils/io/l;-><init>(Lio/ktor/utils/io/m;I)V

    invoke-virtual {p0, p1}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    new-instance p1, Lio/ktor/utils/io/t;

    invoke-direct {p1, p0, v0}, Lio/ktor/utils/io/t;-><init>(Lbc3/c2;Lio/ktor/utils/io/m;)V

    return-object p1
.end method

.method public static final t(Lgf/m;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;)Lhf/h;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhf/h;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lhf/h;-><init>(Lgf/m;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public static final u(Z)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final v(I)Ljava/lang/Integer;
    .locals 1

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V

    return-object v0
.end method

.method public static final z(Ljava/lang/Object;Lr93/c;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr93/n0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr93/b1;

    invoke-static {v0}, Lya3/h;->d(Lr93/b1;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lhg3/i;->Q(Lr93/c;)Llb3/y;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lhg3/i;->o0(Llb3/y;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lhg3/i;->R(Ljava/lang/Class;Lr93/c;)Ljava/lang/reflect/Method;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public abstract E([BII)Ljava/lang/String;
.end method

.method public abstract J(Ljava/lang/String;[BII)I
.end method

.method public abstract h0(Ld4/g;Ld4/g;)V
.end method

.method public abstract i0(Ld4/g;Ljava/lang/Thread;)V
.end method

.method public abstract w(Ld4/h;Ld4/d;Ld4/d;)Z
.end method

.method public abstract x(Ld4/h;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract y(Ld4/h;Ld4/g;Ld4/g;)Z
.end method
