.class public abstract Lio/sentry/config/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lo2/e;


# direct methods
.method public static final A(Ly2/r;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, La3/w0;

    invoke-virtual {p0}, La3/w0;->N0()La3/n0;

    move-result-object p0

    invoke-static {p0}, Lio/sentry/config/a;->K(La3/n0;)Z

    move-result v0

    invoke-virtual {p0}, La3/n0;->r()Ljava/util/List;

    move-result-object p0

    new-instance v1, Ljava/util/ArrayList;

    move-object v2, p0

    check-cast v2, Lr1/b;

    iget-object v3, v2, Lr1/b;->w:Lr1/c;

    iget v3, v3, Lr1/c;->y:I

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p0, :cond_1

    invoke-virtual {v2, v3}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La3/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v4}, La3/n0;->o()Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_0
    invoke-virtual {v4}, La3/n0;->p()Ljava/util/List;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static B()Lp1/k1;
    .locals 1

    sget-object v0, Lb3/n3;->a:Lp1/k1;

    return-object v0
.end method

.method public static final synthetic C(I)Lr7/s;
    .locals 2

    int-to-double v0, p0

    sget-object p0, Lr7/s;->y:Lr7/l;

    invoke-static {v0, v1}, Lr7/l;->a(D)Lr7/s;

    move-result-object p0

    return-object p0
.end method

.method public static final D(Le10/k0;)J
    .locals 6

    iget-object p0, p0, Le10/k0;->x:Ljava/lang/Object;

    check-cast p0, Landroid/view/DragEvent;

    invoke-virtual {p0}, Landroid/view/DragEvent;->getX()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/DragEvent;->getY()F

    move-result p0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v2, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public static final E(Lr93/x0;)Llb3/y;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    invoke-interface {p0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Llb3/y;

    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v4

    invoke-interface {v4}, Llb3/q0;->d()Lr93/h;

    move-result-object v4

    instance-of v5, v4, Lr93/e;

    if-eqz v5, :cond_1

    move-object v3, v4

    check-cast v3, Lr93/e;

    :cond_1
    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lr93/e;->getKind()Lr93/f;

    move-result-object v4

    sget-object v5, Lr93/f;->x:Lr93/f;

    if-eq v4, v5, :cond_0

    invoke-interface {v3}, Lr93/e;->getKind()Lr93/f;

    move-result-object v3

    sget-object v4, Lr93/f;->E:Lr93/f;

    if-eq v3, v4, :cond_0

    move-object v3, v2

    :cond_3
    check-cast v3, Llb3/y;

    if-nez v3, :cond_4

    invoke-interface {p0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "first(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Llb3/y;

    return-object p0

    :cond_4
    return-object v3
.end method

.method public static F(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x15

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "unknown status code: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-string p0, "RECONNECTION_TIMED_OUT"

    return-object p0

    :pswitch_2
    const-string p0, "RECONNECTION_TIMED_OUT_DURING_UPDATE"

    return-object p0

    :pswitch_3
    const-string p0, "CONNECTION_SUSPENDED_DURING_CALL"

    return-object p0

    :pswitch_4
    const-string p0, "REMOTE_EXCEPTION"

    return-object p0

    :pswitch_5
    const-string p0, "DEAD_CLIENT"

    return-object p0

    :pswitch_6
    const-string p0, "API_NOT_CONNECTED"

    return-object p0

    :pswitch_7
    const-string p0, "CANCELED"

    return-object p0

    :pswitch_8
    const-string p0, "TIMEOUT"

    return-object p0

    :pswitch_9
    const-string p0, "INTERRUPTED"

    return-object p0

    :pswitch_a
    const-string p0, "ERROR"

    return-object p0

    :pswitch_b
    const-string p0, "DEVELOPER_ERROR"

    return-object p0

    :pswitch_c
    const-string p0, "INTERNAL_ERROR"

    return-object p0

    :pswitch_d
    const-string p0, "NETWORK_ERROR"

    return-object p0

    :pswitch_e
    const-string p0, "RESOLUTION_REQUIRED"

    return-object p0

    :pswitch_f
    const-string p0, "INVALID_ACCOUNT"

    return-object p0

    :pswitch_10
    const-string p0, "SIGN_IN_REQUIRED"

    return-object p0

    :pswitch_11
    const-string p0, "SERVICE_DISABLED"

    return-object p0

    :pswitch_12
    const-string p0, "SERVICE_VERSION_UPDATE_REQUIRED"

    return-object p0

    :pswitch_13
    const-string p0, "SUCCESS"

    return-object p0

    :pswitch_14
    const-string p0, "SUCCESS_CACHE"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_14
        :pswitch_13
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final G(Ljava/lang/Object;Lcd3/f;)Lwc3/c;
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    sget-object p0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {p0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p1}, Lio/sentry/config/a;->u(Ljava/util/Collection;Lcd3/f;)Lwc3/c;

    move-result-object p0

    invoke-static {p0}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_3

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0, p1}, Lio/sentry/config/a;->G(Ljava/lang/Object;Lcd3/f;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {p0}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/util/Set;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p1}, Lio/sentry/config/a;->u(Ljava/util/Collection;Lcd3/f;)Lwc3/c;

    move-result-object p0

    new-instance p1, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    invoke-direct {p1, p0}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    return-object p1

    :cond_4
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p1}, Lio/sentry/config/a;->u(Ljava/util/Collection;Lcd3/f;)Lwc3/c;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0, p1}, Lio/sentry/config/a;->u(Ljava/util/Collection;Lcd3/f;)Lwc3/c;

    move-result-object p0

    invoke-static {v0, p0}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-virtual {p1, v0, v2}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-static {p0}, Lvb/g;->i(Lj93/d;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_6
    return-object p1
.end method

.method public static final H(Lr93/x0;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p0, v0, v1}, Lio/sentry/config/a;->J(Lr93/x0;Llb3/q0;I)Z

    move-result p0

    return p0
.end method

.method public static final I(Lr93/x0;Llb3/q0;Ljava/util/Set;)Z
    .locals 3

    const-string v0, "typeParameter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    const-string v1, "getUpperBounds(...)"

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

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/y;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p0}, Lr93/h;->i()Llb3/c0;

    move-result-object v2

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    invoke-static {v1, v2, p2}, Lio/sentry/config/a;->q(Llb3/y;Llb3/q0;Ljava/util/Set;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic J(Lr93/x0;Llb3/q0;I)Z
    .locals 1

    and-int/lit8 p2, p2, 0x2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move-object p1, v0

    :cond_0
    invoke-static {p0, p1, v0}, Lio/sentry/config/a;->I(Lr93/x0;Llb3/q0;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final K(La3/n0;)Z
    .locals 3

    invoke-virtual {p0}, La3/n0;->v()La3/h0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lio/sentry/config/a;->K(La3/n0;)Z

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "no parent for idle node"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static L(Lio/sentry/e5;Lio/sentry/q6;)Z
    .locals 2

    invoke-virtual {p1}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/util/d;->a:Ljava/nio/charset/Charset;

    :try_start_0
    new-instance v1, Lio/sentry/util/c;

    invoke-direct {v1}, Lio/sentry/util/c;-><init>()V

    invoke-interface {v0, v1, p0}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V

    iget-wide p0, v1, Lio/sentry/util/c;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Could not calculate size of serializable"

    invoke-interface {p1, v0, v1, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/16 p0, 0x0

    :goto_0
    const-wide/32 v0, 0x100000

    cmp-long p0, p0, v0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static final M(Llb3/y;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Llb3/l;

    if-eqz v0, :cond_0

    check-cast p0, Llb3/l;

    :cond_0
    return-void
.end method

.method public static final N(Llb3/c0;)Z
    .locals 1

    instance-of v0, p0, Lnb3/i;

    if-eqz v0, :cond_0

    check-cast p0, Lnb3/i;

    iget-object p0, p0, Lnb3/i;->z:Lnb3/k;

    iget-boolean p0, p0, Lnb3/k;->x:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static O(Lio/sentry/e5;Lio/sentry/q6;)Lio/sentry/e5;
    .locals 6

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/q6;->isEnableEventSizeLimiting()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lio/sentry/config/a;->L(Lio/sentry/e5;Lio/sentry/q6;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "Event %s exceeds %d bytes limit. Reducing size by dropping fields."

    iget-object v3, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    const-wide/32 v4, 0x100000

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getOnOversizedEvent()Lio/sentry/l6;

    iget-object v0, p0, Lio/sentry/r4;->M:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/r4;->M:Ljava/util/List;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "Removed breadcrumbs to reduce size of event %s"

    iget-object v3, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-static {p0, p1}, Lio/sentry/config/a;->L(Lio/sentry/e5;Lio/sentry/q6;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, Lio/sentry/config/a;->d0(Lio/sentry/e5;Lio/sentry/q6;)V

    invoke-static {p0, p1}, Lio/sentry/config/a;->L(Lio/sentry/e5;Lio/sentry/q6;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server."

    iget-object v3, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_4
    :goto_0
    return-object p0

    :goto_1
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "An error occurred while limiting event size. Event will be sent as-is."

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static final P(Ljava/lang/Exception;Lfk/a;Ljava/lang/String;)V
    .locals 2

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lfk/a;->error(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p0}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    const-string p2, "Stack trace: "

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lfk/a;->error(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static final Q(Llb3/y;)Llb3/f1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Llb3/d1;->g(Llb3/y;Z)Llb3/f1;

    move-result-object p0

    const-string v0, "makeNullable(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final R(Llb3/y;)Loa3/l;
    .locals 2

    sget-object v0, Loa3/t;->i:Loa3/t;

    sget-object v1, Lub3/c;->w:Lub3/c;

    invoke-static {p0, v0, v1}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loa3/l;

    return-object p0
.end method

.method public static final S(Llb3/y;Ls93/i;)Llb3/y;
    .locals 1

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v0

    invoke-interface {v0}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object p0

    invoke-static {p0, p1}, Lio/sentry/config/a;->T(Llb3/k0;Ls93/i;)Llb3/k0;

    move-result-object p0

    invoke-virtual {v0, p0}, Llb3/f1;->t0(Llb3/k0;)Llb3/f1;

    move-result-object p0

    return-object p0
.end method

.method public static final T(Llb3/k0;Ls93/i;)Llb3/k0;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb3/h;->a(Llb3/k0;)Ls93/i;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Llb3/h;->b:Ld0/o2;

    sget-object v1, Llb3/h;->a:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Ld0/o2;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/g;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lrb3/d;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lrb3/d;->w:Lrb3/a;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Llb3/g;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v1}, Lrb3/a;->a()I

    move-result v1

    if-ne v0, v1, :cond_4

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_4
    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object v0

    :goto_2
    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    move-object p0, v0

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-interface {p1}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    new-instance v0, Llb3/g;

    invoke-direct {v0, p1}, Llb3/g;-><init>(Ls93/i;)V

    sget-object p1, Llb3/k0;->x:Lwe/o;

    invoke-static {}, Llb3/g;->b()Lj93/d;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "kClass"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lwe/o;->I(Ljava/lang/String;)I

    move-result p1

    iget-object v1, p0, Lrb3/d;->w:Lrb3/a;

    invoke-virtual {v1, p1}, Lrb3/a;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    :goto_4
    return-object p0

    :cond_8
    invoke-virtual {p0}, Lrb3/d;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p0, Llb3/k0;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Llb3/k0;-><init>(Ljava/util/List;)V

    return-object p0

    :cond_9
    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-static {v0, p0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final U(Llb3/y;)Llb3/f1;
    .locals 10

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    instance-of v0, p0, Llb3/r;

    const/4 v1, 0x2

    const/16 v2, 0xa

    const-string v3, "getParameters(...)"

    const/4 v4, 0x0

    if-eqz v0, :cond_6

    move-object v0, p0

    check-cast v0, Llb3/r;

    iget-object v5, v0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v5}, Llb3/y;->i0()Llb3/q0;

    move-result-object v6

    invoke-interface {v6}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Llb3/y;->i0()Llb3/q0;

    move-result-object v6

    invoke-interface {v6}, Llb3/q0;->d()Lr93/h;

    move-result-object v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Llb3/y;->i0()Llb3/q0;

    move-result-object v6

    invoke-interface {v6}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr93/x0;

    new-instance v9, Llb3/h0;

    invoke-direct {v9, v8}, Llb3/h0;-><init>(Lr93/x0;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v5, v7, v4, v1}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v5

    :cond_2
    :goto_1
    iget-object v0, v0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v6

    invoke-interface {v6}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v6

    invoke-interface {v6}, Llb3/q0;->d()Lr93/h;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v6

    invoke-interface {v6}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/x0;

    new-instance v7, Llb3/h0;

    invoke-direct {v7, v6}, Llb3/h0;-><init>(Lr93/x0;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-static {v0, v3, v4, v1}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-static {v5, v0}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    goto :goto_5

    :cond_6
    instance-of v0, p0, Llb3/c0;

    if-eqz v0, :cond_a

    move-object v0, p0

    check-cast v0, Llb3/c0;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_9

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->d()Lr93/h;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v5, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/x0;

    new-instance v6, Llb3/h0;

    invoke-direct {v6, v5}, Llb3/h0;-><init>(Lr93/x0;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-static {v0, v3, v4, v1}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v0

    :cond_9
    :goto_5
    invoke-static {v0, p0}, Llb3/o;->d(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p0

    return-object p0

    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static V(Landroid/content/Context;I)Landroid/util/TypedValue;
    .locals 2

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static W(Landroid/content/Context;IZ)Z
    .locals 1

    invoke-static {p0, p1}, Lio/sentry/config/a;->V(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p0

    if-eqz p0, :cond_1

    iget p1, p0, Landroid/util/TypedValue;->type:I

    const/16 v0, 0x12

    if-ne p1, v0, :cond_1

    iget p0, p0, Landroid/util/TypedValue;->data:I

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return p2
.end method

.method public static X(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;
    .locals 1

    invoke-static {p0, p1}, Lio/sentry/config/a;->V(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final Y(Ls63/a;Lcd3/f;)Lwc3/c;
    .locals 2

    const-string v0, "typeInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls63/a;->a:Lj93/d;

    const-string v1, "module"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ls63/a;->c:Lj93/a0;

    invoke-interface {p0}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {p1, p0, v1}, Lvo/b;->D(Lcd3/f;Lj93/a0;Z)Lwc3/c;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-virtual {p1, v0, v1}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Lj93/a0;->isMarkedNullable()Z

    move-result p0

    if-ne p0, v1, :cond_2

    invoke-static {p1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_2
    return-object p1

    :cond_3
    invoke-static {v0}, Lvb/g;->i(Lj93/d;)Lwc3/c;

    move-result-object p1

    invoke-interface {p0}, Lj93/a0;->isMarkedNullable()Z

    move-result p0

    if-ne p0, v1, :cond_4

    invoke-static {p1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_4
    return-object p1
.end method

.method public static final Z(Lj93/d;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "dataTypeKC"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uidsList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Landroidx/health/platform/client/proto/c2;->r()Landroidx/health/platform/client/proto/b2;

    move-result-object v2

    invoke-static {p0}, Le4/a;->S(Lj93/d;)Landroidx/health/platform/client/proto/w;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v4, v2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v4, Landroidx/health/platform/client/proto/c2;

    invoke-static {v4, v3}, Landroidx/health/platform/client/proto/c2;->p(Landroidx/health/platform/client/proto/c2;Landroidx/health/platform/client/proto/w;)V

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v2, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/c2;

    invoke-static {v3, v1}, Landroidx/health/platform/client/proto/c2;->q(Landroidx/health/platform/client/proto/c2;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOptionClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p3

    check-cast v4, Lp1/q;

    const v0, 0x4f0f8d2c

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x100

    goto :goto_1

    :cond_1
    const/16 v3, 0x80

    :goto_1
    or-int/2addr v0, v3

    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_3

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    and-int/lit16 v3, v0, 0x3fe

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lse/b;->l(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_4

    new-instance v0, Ljp1/k;

    const/16 v5, 0x10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final a0(Ls93/i;)Llb3/k0;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Llb3/k0;->y:Llb3/k0;

    return-object p0

    :cond_0
    sget-object v0, Llb3/k0;->x:Lwe/o;

    new-instance v1, Llb3/g;

    invoke-direct {v1, p0}, Llb3/g;-><init>(Ls93/i;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lwe/o;->l(Ljava/util/List;)Llb3/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;)Ljv/c;
    .locals 12

    new-instance v0, Ljv/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Ljv/b;->a:Z

    const-string v2, "#FF1E8CAB"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    iput v2, v0, Ljv/b;->b:I

    const v2, 0x800053

    iput v2, v0, Ljv/b;->c:I

    const/high16 v2, 0x42b80000    # 92.0f

    iput v2, v0, Ljv/b;->d:F

    const/high16 v2, 0x40800000    # 4.0f

    iput v2, v0, Ljv/b;->e:F

    iput v2, v0, Ljv/b;->f:F

    iput v2, v0, Ljv/b;->g:F

    iput-boolean v1, v0, Ljv/b;->h:Z

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ljv/c;

    iget-boolean v4, v0, Ljv/b;->a:Z

    iget v5, v0, Ljv/b;->b:I

    iget v6, v0, Ljv/b;->c:I

    iget v7, v0, Ljv/b;->d:F

    iget v8, v0, Ljv/b;->e:F

    iget v9, v0, Ljv/b;->f:F

    iget v10, v0, Ljv/b;->g:F

    iget-boolean v11, v0, Ljv/b;->h:Z

    invoke-direct/range {v3 .. v11}, Ljv/c;-><init>(ZIIFFFFZ)V

    return-object v3
.end method

.method public static final b0(Ljava/net/InetAddress;)Lbg/f;
    .locals 3

    instance-of v0, p0, Ljava/net/Inet4Address;

    const-string v1, "getAddress(...)"

    if-eqz v0, :cond_0

    new-instance v0, Lbg/h;

    move-object v2, p0

    check-cast v2, Ljava/net/Inet4Address;

    invoke-virtual {v2}, Ljava/net/Inet4Address;->getAddress()[B

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Lbg/h;-><init>([B)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ljava/net/Inet6Address;

    if-eqz v0, :cond_1

    new-instance v0, Lbg/k;

    move-object v2, p0

    check-cast v2, Ljava/net/Inet6Address;

    invoke-virtual {v2}, Ljava/net/Inet6Address;->getAddress()[B

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2}, Lbg/k;-><init>(Ljava/lang/String;[B)V

    :goto_0
    new-instance v1, Lbg/f;

    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object p0

    const-string v2, "getHostName(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p0, v0}, Lbg/f;-><init>(Ljava/lang/String;Landroidx/room/c1;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unrecognized InetAddress "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 6

    check-cast p2, Lp1/q;

    const v0, -0x158b58d6

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_4
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_6

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_5

    :cond_6
    :goto_3
    const/4 v3, 0x1

    if-eqz v0, :cond_7

    move p1, v3

    :cond_7
    invoke-static {p0, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_8

    new-instance v4, Lh/e;

    invoke-direct {v4, p1, v0}, Lh/e;-><init>(ZLp1/c1;)V

    invoke-virtual {p2, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lh/e;

    and-int/lit8 v0, v2, 0xe

    if-ne v0, v1, :cond_9

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    :goto_4
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v3, :cond_a

    if-ne v0, v5, :cond_b

    :cond_a
    new-instance v0, Lfv/g;

    const/4 v1, 0x1

    invoke-direct {v0, v4, p1, v1}, Lfv/g;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lc93/a;

    invoke-static {v0, p2}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-static {p2}, Lh/h;->a(Landroidx/compose/runtime/Composer;)Lg/b0;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v0}, Lg/b0;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v1

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/g0;

    invoke-virtual {p2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_c

    if-ne v3, v5, :cond_d

    :cond_c
    new-instance v3, Lb4/g;

    const/4 v2, 0x5

    invoke-direct {v3, v0, v1, v4, v2}, Lb4/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, v3, p2}, Lp1/x;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance v0, Lh/d;

    invoke-direct {v0, p1, p0, p3, p4}, Lh/d;-><init>(ZLc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c0(Ldt/b;Lnh/g;)I
    .locals 1

    instance-of v0, p0, Lnh/a;

    if-eqz v0, :cond_0

    check-cast p0, Lnh/a;

    iget p0, p0, Lnh/a;->a:I

    return p0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 p1, 0x1

    if-ne p0, p1, :cond_1

    const p0, 0x7fffffff

    return p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    const/high16 p0, -0x80000000

    return p0
.end method

.method public static final d(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p3, Lp1/q;

    const v0, 0x7224e0d9

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x800

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v3, 0x492

    if-ne v1, v3, :cond_4

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_5

    :cond_4
    :goto_3
    if-eqz p1, :cond_8

    if-nez p0, :cond_8

    sget-object v1, Lb2/t;->w:Lb2/t;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v1}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v3, 0x70c87f74

    invoke-virtual {p3, v3}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x1c00

    const/4 v3, 0x0

    if-ne v0, v2, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    move v0, v3

    :goto_4
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Lb30/h2;

    const/4 v0, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, p2, v0, v4}, Lb30/h2;-><init>(Lc93/a;Lq83/d;I)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v0, v2}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p3, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_8
    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_9

    new-instance v0, Loy/d;

    const/4 v5, 0x0

    move v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Loy/d;-><init>(ZZLc93/a;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static d0(Lio/sentry/e5;Lio/sentry/q6;)V
    .locals 3

    invoke-virtual {p0}, Lio/sentry/e5;->d()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/protocol/u;

    iget-object v1, v1, Lio/sentry/protocol/u;->E:Lio/sentry/protocol/b0;

    if-eqz v1, :cond_0

    const-string v2, "Truncated exception stack frames of event %s"

    invoke-static {v1, p0, p1, v2}, Lio/sentry/config/a;->e0(Lio/sentry/protocol/b0;Lio/sentry/e5;Lio/sentry/q6;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/e5;->e()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/protocol/c0;

    iget-object v1, v1, Lio/sentry/protocol/c0;->I:Lio/sentry/protocol/b0;

    if-eqz v1, :cond_2

    const-string v2, "Truncated thread stack frames for event %s"

    invoke-static {v1, p0, p1, v2}, Lio/sentry/config/a;->e0(Lio/sentry/protocol/b0;Lio/sentry/e5;Lio/sentry/q6;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static final e(Lk20/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v2, p0

    move-object/from16 v8, p1

    move/from16 v9, p3

    const-string v0, "eventReporter"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v0, 0x1721b007

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v11, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v9, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v11

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v9

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    and-int/lit8 v1, v9, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    move v12, v0

    and-int/lit8 v0, v12, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_6

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_17

    :cond_6
    :goto_4
    sget-object v13, Lg40/j4;->a:Lp1/u2;

    const v0, -0x7613e33a

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v14, v12, 0xe

    const/4 v0, 0x0

    if-eq v14, v11, :cond_8

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_7

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    move v1, v0

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v1, 0x1

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_9

    if-ne v3, v4, :cond_a

    :cond_9
    move v1, v0

    goto :goto_7

    :cond_a
    move v15, v0

    move-object/from16 v18, v4

    goto :goto_8

    :goto_7
    new-instance v0, La1/e;

    const/4 v6, 0x0

    const/16 v7, 0xe

    move v3, v1

    const/4 v1, 0x1

    move v5, v3

    const-class v3, Lk20/a;

    move-object/from16 v16, v4

    const-string v4, "onAutofill"

    move/from16 v17, v5

    const-string v5, "onAutofill(Ljava/lang/String;)V"

    move-object/from16 v18, v16

    move/from16 v15, v17

    invoke-direct/range {v0 .. v7}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_8
    check-cast v3, Lj93/g;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v13

    sget-object v0, La40/f;->a:Lp1/u2;

    const v1, -0x7613d8ef

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    if-eq v14, v11, :cond_c

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_b

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_9

    :cond_b
    move v1, v15

    goto :goto_a

    :cond_c
    :goto_9
    const/4 v1, 0x1

    :goto_a
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_e

    move-object/from16 v1, v18

    if-ne v3, v1, :cond_d

    :goto_b
    move-object v3, v0

    goto :goto_c

    :cond_d
    move-object v11, v0

    move-object/from16 v19, v1

    goto :goto_d

    :cond_e
    move-object/from16 v1, v18

    goto :goto_b

    :goto_c
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/4 v7, 0x4

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object v4, v3

    const-class v3, Lk20/a;

    move-object v5, v4

    const-string v4, "onCardNumberCompleted"

    move-object/from16 v17, v5

    const-string v5, "onCardNumberCompleted()V"

    move-object/from16 v19, v16

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_d
    check-cast v3, Lj93/g;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    new-instance v0, Lc30/e;

    check-cast v3, Lc93/a;

    invoke-direct {v0, v3}, Lc30/e;-><init>(Lc93/a;)V

    invoke-virtual {v11, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v11

    sget-object v0, La40/d;->a:Lp1/u2;

    const v1, -0x7613cde8

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x4

    if-eq v14, v1, :cond_10

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_f

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_e

    :cond_f
    move v1, v15

    goto :goto_f

    :cond_10
    :goto_e
    const/4 v1, 0x1

    :goto_f
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_12

    move-object/from16 v1, v19

    if-ne v3, v1, :cond_11

    :goto_10
    move-object v3, v0

    goto :goto_11

    :cond_11
    move-object/from16 v20, v0

    move-object/from16 v21, v1

    goto :goto_12

    :cond_12
    move-object/from16 v1, v19

    goto :goto_10

    :goto_11
    new-instance v0, La1/e;

    const/4 v6, 0x0

    const/16 v7, 0xf

    move-object/from16 v16, v1

    const/4 v1, 0x1

    move-object v4, v3

    const-class v3, Lk20/a;

    move-object v5, v4

    const-string v4, "onDisallowedCardBrandEntered"

    move-object/from16 v17, v5

    const-string v5, "onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V"

    move-object/from16 v21, v16

    move-object/from16 v20, v17

    invoke-direct/range {v0 .. v7}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_12
    check-cast v3, Lj93/g;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    new-instance v0, Lc30/d;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v3}, Lc30/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    sget-object v1, La40/b;->a:Lp1/u2;

    const v3, -0x7613c2b4

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x4

    if-eq v14, v3, :cond_14

    and-int/lit8 v3, v12, 0x8

    if-eqz v3, :cond_13

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    goto :goto_13

    :cond_13
    move v3, v15

    goto :goto_14

    :cond_14
    :goto_13
    const/4 v3, 0x1

    :goto_14
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_15

    move-object/from16 v3, v21

    if-ne v4, v3, :cond_16

    :cond_15
    move-object v3, v0

    goto :goto_15

    :cond_16
    move-object v14, v0

    move-object v12, v1

    goto :goto_16

    :goto_15
    new-instance v0, La1/e;

    const/4 v6, 0x0

    const/16 v7, 0x10

    move-object v4, v1

    const/4 v1, 0x1

    move-object v5, v3

    const-class v3, Lk20/a;

    move-object v12, v4

    const-string v4, "onAnalyticsEvent"

    move-object v14, v5

    const-string v5, "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V"

    invoke-direct/range {v0 .. v7}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :goto_16
    check-cast v4, Lj93/g;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    new-instance v0, Lc30/c;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v4}, Lc30/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    sget-object v1, Lv30/c;->a:Lp1/b0;

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    filled-new-array {v13, v11, v14, v0, v1}, [Lp1/u1;

    move-result-object v0

    new-instance v1, Lb30/l4;

    const/4 v3, 0x1

    invoke-direct {v1, v8, v3}, Lb30/l4;-><init>(Lx1/b;I)V

    const v3, 0x5a50347

    invoke-static {v3, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v3, 0x38

    invoke-static {v0, v1, v10, v3}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_17
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v1, Lk;

    const/16 v3, 0x1b

    invoke-direct {v1, v2, v8, v9, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static e0(Lio/sentry/protocol/b0;Lio/sentry/e5;Lio/sentry/q6;Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x1f4

    if-le v1, v2, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    const/16 v3, 0xfa

    invoke-interface {v0, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iput-object v1, p0, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p2, p3, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final f(ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p2, Lp1/q;

    const v0, 0x1053ec15

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_5

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v1, 0x0

    if-eqz p0, :cond_6

    const v0, 0xe7d3ccf

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    invoke-interface {v2}, Ly3/c;->getDensity()F

    move-result v2

    new-instance v3, Ly3/d;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v3, v2, v4}, Ly3/d;-><init>(FF)V

    invoke-virtual {v0, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v2, Lb30/l4;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lb30/l4;-><init>(Lx1/b;I)V

    const v3, 0x2f80ac9a

    invoke-static {v3, p2, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v0, v2, p2, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const v2, 0xe7fd17f

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0, p1, p2, v1}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lam0/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lam0/b;-><init>(ZLjava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final g(Lg1/c1;Lg1/h9;Lg1/l5;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v8, p3

    move/from16 v9, p5

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v1, 0x33579b6

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    and-int/lit8 v2, p6, 0x2

    if-nez v2, :cond_1

    move-object/from16 v2, p1

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    move-object/from16 v2, p1

    :cond_2
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v1, v3

    and-int/lit8 v3, p6, 0x4

    if-nez v3, :cond_3

    move-object/from16 v3, p2

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_2

    :cond_3
    move-object/from16 v3, p2

    :cond_4
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v1, v4

    and-int/lit16 v4, v9, 0xc00

    if-nez v4, :cond_6

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x800

    goto :goto_3

    :cond_5
    const/16 v4, 0x400

    :goto_3
    or-int/2addr v1, v4

    :cond_6
    and-int/lit16 v4, v1, 0x493

    const/16 v5, 0x492

    const/4 v11, 0x0

    const/4 v6, 0x1

    if-eq v4, v5, :cond_7

    move v4, v6

    goto :goto_4

    :cond_7
    move v4, v11

    :goto_4
    and-int/2addr v1, v6

    invoke-virtual {v10, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v1, v9, 0x1

    if-eqz v1, :cond_9

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v12, v2

    :goto_5
    move-object v13, v3

    goto :goto_8

    :cond_9
    :goto_6
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_a

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v10, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    goto :goto_7

    :cond_a
    move-object v1, v2

    :goto_7
    and-int/lit8 v2, p6, 0x4

    if-eqz v2, :cond_b

    sget-object v2, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/l5;

    move-object v12, v1

    move-object v13, v2

    goto :goto_8

    :cond_b
    move-object v12, v1

    goto :goto_5

    :goto_8
    invoke-virtual {v10}, Lp1/q;->r()V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v1, v14, :cond_c

    const-wide/16 v5, 0x0

    const/16 v7, 0x1fff

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v7}, Lg1/c1;->a(Lg1/c1;JJJI)Lg1/c1;

    move-result-object v1

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lg1/c1;

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v0}, Lg1/c1;->f()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->a:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lg1/c1;->b:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    iget-object v4, v1, Lg1/c1;->b:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->g()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->c:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lg1/c1;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    iget-object v4, v1, Lg1/c1;->d:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->b()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->e:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->h()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->f:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->c()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->g:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->d()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->h:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lg1/c1;->i:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    iget-object v4, v1, Lg1/c1;->i:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lg1/c1;->j:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    iget-object v4, v1, Lg1/c1;->j:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->e()J

    move-result-wide v2

    iget-object v4, v1, Lg1/c1;->k:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lg1/c1;->l:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    iget-object v4, v1, Lg1/c1;->l:Lp1/k1;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v2

    iget-object v3, v1, Lg1/c1;->m:Lp1/k1;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v11, v5}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v2

    invoke-virtual {v1}, Lg1/c1;->f()J

    move-result-wide v6

    move/from16 p2, v5

    invoke-virtual {v1}, Lg1/c1;->b()J

    move-result-wide v4

    const v3, -0x7ad4b9e5

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-static {v1, v4, v5}, Lg1/d1;->a(Lg1/c1;J)J

    move-result-wide v15

    const-wide/16 v17, 0x10

    cmp-long v3, v15, v17

    if-eqz v3, :cond_d

    move-wide v8, v15

    goto :goto_9

    :cond_d
    sget-object v3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v8, v3, Li2/x;->a:J

    :goto_9
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    move-object/from16 v22, v12

    iget-wide v11, v3, Li2/x;->a:J

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->i()Z

    move-result v3

    const-wide/high16 v23, 0x3fe0000000000000L    # 0.5

    if-eqz v3, :cond_e

    invoke-static {v11, v12}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v11, v3

    cmpl-double v3, v11, v23

    if-lez v3, :cond_f

    goto :goto_a

    :cond_e
    invoke-static {v11, v12}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v11, v3

    cmpg-double v3, v11, v23

    if-gez v3, :cond_f

    :goto_a
    const v3, 0x3f3d70a4    # 0.74f

    goto :goto_b

    :cond_f
    const v3, 0x3f19999a    # 0.6f

    :goto_b
    invoke-static {v3, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    invoke-virtual {v10, v6, v7}, Lp1/q;->f(J)Z

    move-result v3

    invoke-virtual {v10, v4, v5}, Lp1/q;->f(J)Z

    move-result v11

    or-int/2addr v3, v11

    invoke-virtual {v10, v8, v9}, Lp1/q;->f(J)Z

    move-result v11

    or-int/2addr v3, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    const/high16 v12, 0x3f800000    # 1.0f

    if-nez v3, :cond_10

    if-ne v11, v14, :cond_16

    :cond_10
    new-instance v11, Lf1/y1;

    invoke-virtual {v1}, Lg1/c1;->f()J

    move-result-wide v14

    const v21, 0x3ecccccd    # 0.4f

    move-wide/from16 v19, v4

    move-wide/from16 v17, v8

    move-wide v3, v14

    move-wide v15, v6

    invoke-static/range {v15 .. v21}, Le4/a;->q(JJJF)F

    move-result v5

    const v21, 0x3e4ccccd    # 0.2f

    invoke-static/range {v15 .. v21}, Le4/a;->q(JJJF)F

    move-result v6

    const/high16 v7, 0x40900000    # 4.5f

    cmpl-float v5, v5, v7

    const v8, 0x3ecccccd    # 0.4f

    if-ltz v5, :cond_11

    :goto_c
    move-wide v14, v15

    goto :goto_10

    :cond_11
    cmpg-float v5, v6, v7

    const v6, 0x3e4ccccd    # 0.2f

    if-gez v5, :cond_12

    move v8, v6

    goto :goto_c

    :cond_12
    move/from16 v21, v8

    const/4 v5, 0x0

    :goto_d
    const/4 v9, 0x7

    if-ge v5, v9, :cond_15

    invoke-static/range {v15 .. v21}, Le4/a;->q(JJJF)F

    move-result v9

    move-wide v14, v15

    div-float/2addr v9, v7

    sub-float/2addr v9, v12

    cmpg-float v16, p2, v9

    if-gtz v16, :cond_13

    const v16, 0x3c23d70a    # 0.01f

    cmpg-float v16, v9, v16

    if-gtz v16, :cond_13

    goto :goto_f

    :cond_13
    cmpg-float v9, v9, p2

    if-gez v9, :cond_14

    move/from16 v8, v21

    goto :goto_e

    :cond_14
    move/from16 v6, v21

    :goto_e
    add-float v9, v8, v6

    const/high16 v16, 0x40000000    # 2.0f

    div-float v21, v9, v16

    add-int/lit8 v5, v5, 0x1

    move-wide v15, v14

    goto :goto_d

    :cond_15
    move-wide v14, v15

    :goto_f
    move/from16 v8, v21

    :goto_10
    invoke-static {v8, v14, v15}, Li2/x;->c(FJ)J

    move-result-wide v5

    invoke-direct {v11, v3, v4, v5, v6}, Lf1/y1;-><init>(JJ)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v11, Lf1/y1;

    sget-object v3, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    sget-object v1, Lg1/j1;->a:Lp1/b0;

    sget-object v5, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v10, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v5, v5, Li2/x;->a:J

    invoke-virtual {v10, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/c1;

    invoke-virtual {v3}, Lg1/c1;->i()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-static {v5, v6}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v5, v3

    cmpl-double v3, v5, v23

    if-lez v3, :cond_18

    goto :goto_11

    :cond_17
    invoke-static {v5, v6}, Li2/w0;->x(J)F

    move-result v3

    float-to-double v5, v3

    cmpg-double v3, v5, v23

    if-gez v3, :cond_18

    goto :goto_11

    :cond_18
    const v12, 0x3f5eb852    # 0.87f

    :goto_11
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    sget-object v1, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    sget-object v1, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v1, v13}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v7

    sget-object v1, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v1, v11}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v8

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    move-object/from16 v2, v22

    invoke-virtual {v1, v2}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v9

    filled-new-array/range {v4 .. v9}, [Lp1/u1;

    move-result-object v1

    new-instance v3, Lb30/w2;

    move-object/from16 v4, p3

    const/4 v9, 0x7

    invoke-direct {v3, v9, v2, v4}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x1d9c9e76

    invoke-static {v5, v10, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x38

    invoke-static {v1, v3, v10, v5}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v13

    goto :goto_12

    :cond_19
    move-object v4, v8

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Lg1/m3;

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method public static final h(Ljava/util/List;IZLm40/w;Landroidx/compose/ui/Modifier;Lc93/m;Lh20/f1;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v0, p5

    move-object/from16 v11, p6

    move/from16 v12, p8

    const-string v3, "paymentMethods"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "imageLoader"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    const v3, 0x51f272b9

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_1
    move v3, v12

    :goto_1
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v12, 0x180

    if-nez v5, :cond_5

    move/from16 v5, p2

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    move/from16 v5, p2

    :goto_4
    and-int/lit16 v6, v12, 0xc00

    if-nez v6, :cond_8

    and-int/lit16 v6, v12, 0x1000

    if-nez v6, :cond_6

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_5

    :cond_6
    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_5
    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_6

    :cond_7
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v3, v6

    :cond_8
    or-int/lit16 v3, v3, 0x6000

    const/high16 v6, 0x30000

    and-int/2addr v6, v12

    if-nez v6, :cond_a

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/high16 v6, 0x20000

    goto :goto_7

    :cond_9
    const/high16 v6, 0x10000

    :goto_7
    or-int/2addr v3, v6

    :cond_a
    const/high16 v6, 0x180000

    and-int/2addr v6, v12

    if-nez v6, :cond_c

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/high16 v6, 0x100000

    goto :goto_8

    :cond_b
    const/high16 v6, 0x80000

    :goto_8
    or-int/2addr v3, v6

    :cond_c
    move v14, v3

    const v3, 0x92493

    and-int/2addr v3, v14

    const v6, 0x92492

    if-ne v3, v6, :cond_e

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v5, p4

    goto/16 :goto_10

    :cond_e
    :goto_9
    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v3, v12, 0x1

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_10

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_a

    :cond_f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v3, p4

    goto :goto_b

    :cond_10
    :goto_a
    move-object v3, v15

    :goto_b
    invoke-virtual {v9}, Lp1/q;->r()V

    const-string v6, "TEST_TAG_NEW_PAYMENT_METHOD_VERTICAL_LAYOUT_UI"

    invoke-static {v3, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0xc

    int-to-float v7, v7

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v7, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move/from16 v16, v14

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v9, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v9, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    :cond_12
    invoke-static {v8, v9, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v9, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, -0x582ca90a

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/4 v6, 0x0

    :goto_d
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_19

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v17, v6, 0x1

    const/4 v10, 0x0

    if-ltz v6, :cond_18

    check-cast v7, Ld30/w;

    if-ne v6, v2, :cond_14

    move v4, v8

    goto :goto_e

    :cond_14
    const/4 v4, 0x0

    :goto_e
    sget-object v6, Lh20/g1;->E:Lh20/g1;

    iget-object v6, v6, Lh20/g1;->w:Lh20/f1;

    const-string v6, "rowStyle"

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move v6, v8

    new-instance v8, Lh20/g1;

    invoke-direct {v8, v11, v10, v10, v10}, Lh20/g1;-><init>(Lh20/f1;Lh20/j2;Lh20/k3;Lh20/k3;)V

    const v10, -0x62cd73a8

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    const/high16 v10, 0x70000

    and-int v10, v16, v10

    const/high16 v14, 0x20000

    if-ne v10, v14, :cond_15

    goto :goto_f

    :cond_15
    const/4 v6, 0x0

    :goto_f
    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_16

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v10, v6, :cond_17

    :cond_16
    new-instance v10, Lcom/whoop/profile/view/edit/n;

    const/16 v6, 0x9

    invoke-direct {v10, v6, v0, v7}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    invoke-static {v15, v10}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v10, v16, 0x6

    and-int/lit8 v10, v10, 0xe

    or-int/lit16 v10, v10, 0x1000

    move/from16 v14, v16

    and-int/lit16 v0, v14, 0x1c00

    or-int/2addr v10, v0

    move-object v0, v3

    move v3, v5

    move-object v5, v7

    move-object v7, v6

    move-object/from16 v6, p3

    invoke-static/range {v3 .. v10}, Le4/a;->h(ZZLd30/w;Lm40/w;Landroidx/compose/ui/Modifier;Lh20/g1;Landroidx/compose/runtime/Composer;I)V

    move/from16 v5, p2

    move-object/from16 v4, p3

    move-object v3, v0

    move/from16 v6, v17

    move-object/from16 v0, p5

    goto :goto_d

    :cond_18
    invoke-static {}, Lwb3/f;->d0()V

    throw v10

    :cond_19
    move-object v0, v3

    move v6, v8

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    move-object v5, v0

    :goto_10
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v0, Lb30/i2;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object v7, v11

    move v8, v12

    invoke-direct/range {v0 .. v8}, Lb30/i2;-><init>(Ljava/util/List;IZLm40/w;Landroidx/compose/ui/Modifier;Lc93/m;Lh20/f1;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method public static final i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move-object/from16 v10, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p9

    move/from16 v1, p10

    const-string v4, "label"

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onButtonClick"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p8

    check-cast v4, Lp1/q;

    const v5, 0x76498954

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0xc00

    :cond_5
    move-object/from16 v7, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_5

    move-object/from16 v7, p3

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_4

    :cond_7
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v5, v8

    :goto_5
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_9

    or-int/lit16 v5, v5, 0x6000

    :cond_8
    move/from16 v9, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_8

    move/from16 v9, p4

    invoke-virtual {v4, v9}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x4000

    goto :goto_6

    :cond_a
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v5, v11

    :goto_7
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_b

    const/high16 v12, 0x30000

    or-int/2addr v5, v12

    move/from16 v12, p5

    goto :goto_9

    :cond_b
    move/from16 v12, p5

    invoke-virtual {v4, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_c

    const/high16 v13, 0x20000

    goto :goto_8

    :cond_c
    const/high16 v13, 0x10000

    :goto_8
    or-int/2addr v5, v13

    :goto_9
    and-int/lit8 v13, v1, 0x40

    const/high16 v14, 0x180000

    if-eqz v13, :cond_e

    or-int/2addr v5, v14

    :cond_d
    move/from16 v14, p6

    goto :goto_b

    :cond_e
    and-int/2addr v14, v0

    if-nez v14, :cond_d

    move/from16 v14, p6

    invoke-virtual {v4, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_f

    const/high16 v15, 0x100000

    goto :goto_a

    :cond_f
    const/high16 v15, 0x80000

    :goto_a
    or-int/2addr v5, v15

    :goto_b
    and-int/lit16 v15, v1, 0x80

    if-eqz v15, :cond_10

    const/high16 v16, 0xc00000

    or-int v5, v5, v16

    move-object/from16 v0, p7

    goto :goto_d

    :cond_10
    move-object/from16 v0, p7

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x800000

    goto :goto_c

    :cond_11
    const/high16 v16, 0x400000

    :goto_c
    or-int v5, v5, v16

    :goto_d
    const v16, 0x492493

    and-int v5, v5, v16

    const v0, 0x492492

    if-ne v5, v0, :cond_13

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_e

    :cond_12
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v8, p7

    move-object v3, v4

    move-object v4, v7

    move v5, v9

    move v6, v12

    move v7, v14

    goto/16 :goto_17

    :cond_13
    :goto_e
    if-eqz v6, :cond_14

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v7, v0

    :cond_14
    const/4 v0, 0x0

    if-eqz v8, :cond_15

    move v8, v0

    goto :goto_f

    :cond_15
    move v8, v9

    :goto_f
    if-eqz v11, :cond_16

    move v12, v0

    :cond_16
    if-eqz v13, :cond_17

    move v14, v0

    :cond_17
    if-eqz v15, :cond_19

    const v5, -0x3adfbbb4

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_18

    new-instance v5, Lou1/a;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lou1/a;-><init>(I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v5, Lc93/a;

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move-object v9, v5

    goto :goto_10

    :cond_19
    move-object/from16 v9, p7

    :goto_10
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    sget-object v6, Ld40/p;->e:Ld40/k;

    invoke-static {v6, v5}, Ld40/r;->c(Ld40/k;Landroid/content/Context;)I

    move-result v6

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v15

    sget-object v6, Ld40/p;->e:Ld40/k;

    invoke-static {v6, v5}, Ld40/r;->h(Ld40/k;Landroid/content/Context;)I

    move-result v6

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v17

    sget-object v6, Ld40/p;->e:Ld40/k;

    iget-object v11, v6, Ld40/k;->c:Ld40/j;

    iget v11, v11, Ld40/j;->b:F

    invoke-static {v6, v5}, Ld40/r;->e(Ld40/k;Landroid/content/Context;)I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v5

    invoke-static {v11, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v5

    sget-object v6, Ld40/p;->e:Ld40/k;

    iget-object v6, v6, Ld40/k;->c:Ld40/j;

    iget v6, v6, Ld40/j;->a:F

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    sget-object v11, Ld40/p;->e:Ld40/k;

    invoke-static {v11, v4}, Ld40/r;->g(Ld40/k;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v13

    sget-object v11, Lg1/j1;->a:Lp1/b0;

    if-eqz v2, :cond_1c

    const v0, -0x3adf5612

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    move-wide/from16 p4, v0

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    const-wide/high16 v19, 0x3fe0000000000000L    # 0.5

    if-eqz v0, :cond_1a

    invoke-static/range {p4 .. p5}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v19

    if-lez v0, :cond_1b

    goto :goto_11

    :cond_1a
    invoke-static/range {p4 .. p5}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v0, v19

    if-gez v0, :cond_1b

    :goto_11
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_12
    const/4 v1, 0x0

    goto :goto_13

    :cond_1b
    const v0, 0x3f5eb852    # 0.87f

    goto :goto_12

    :goto_13
    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_1c
    const v0, -0x3adf532e

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    move-wide/from16 v19, v0

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->i()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static/range {v19 .. v20}, Li2/w0;->x(J)F

    :goto_14
    const/4 v1, 0x0

    goto :goto_15

    :cond_1d
    invoke-static/range {v19 .. v20}, Li2/w0;->x(J)F

    goto :goto_14

    :goto_15
    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const v0, 0x3ec28f5c    # 0.38f

    :goto_16
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v11, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    move-object v1, v0

    new-instance v0, Loy/g;

    move-object v11, v3

    move v3, v2

    move-object v2, v11

    move-object/from16 v22, v1

    move-object/from16 v21, v4

    move-object v4, v6

    move-object v1, v7

    move-wide v6, v15

    move v15, v14

    move v14, v12

    move-wide/from16 v11, v17

    invoke-direct/range {v0 .. v15}, Loy/g;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;ZLt0/i;Lf0/t;JZLc93/a;Ljava/lang/String;JLl3/v0;ZZ)V

    const v2, 0x31183e14

    move-object/from16 v3, v21

    invoke-static {v2, v3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x38

    move-object/from16 v4, v22

    invoke-static {v4, v0, v3, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v1

    move v5, v8

    move-object v8, v9

    move v6, v14

    move v7, v15

    :goto_17
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1e

    new-instance v0, Lih0/k;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lih0/k;-><init>(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method public static final j(Ljava/lang/String;JLl3/v0;ZZZLandroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v4, p7

    check-cast v4, Lp1/q;

    const v0, 0x4d4a975    # 4.9996582E-36f

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p8, v0

    move-wide/from16 v7, p1

    invoke-virtual {v4, v7, v8}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    move-object/from16 v9, p3

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    move/from16 v10, p4

    invoke-virtual {v4, v10}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    move/from16 v11, p5

    invoke-virtual {v4, v11}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x4000

    goto :goto_4

    :cond_4
    const/16 v1, 0x2000

    :goto_4
    or-int/2addr v0, v1

    move/from16 v12, p6

    invoke-virtual {v4, v12}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_5

    const/high16 v1, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v1, 0x10000

    :goto_5
    or-int/2addr v0, v1

    const v1, 0x12493

    and-int/2addr v0, v1

    const v1, 0x12492

    if-ne v0, v1, :cond_7

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_7

    :cond_7
    :goto_6
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Ld40/p;->e:Ld40/k;

    invoke-static {v1, v0}, Ld40/r;->h(Ld40/k;Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v0

    move-wide v12, v0

    sget-object v1, Lb2/e;->z:Lb2/m;

    new-instance v5, Loy/h;

    move-object v6, p0

    move v14, v10

    move v10, v11

    move/from16 v11, p6

    invoke-direct/range {v5 .. v14}, Loy/h;-><init>(Ljava/lang/String;JLl3/v0;ZZJZ)V

    const v0, 0x56d76d4b

    invoke-static {v0, v4, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0xc30

    const/4 v6, 0x5

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v5, Loy/e;

    move-object v6, p0

    move-wide/from16 v7, p1

    move-object/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move/from16 v12, p6

    move/from16 v13, p8

    invoke-direct/range {v5 .. v13}, Loy/e;-><init>(Ljava/lang/String;JLl3/v0;ZZZI)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final k(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 8

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x3addac5c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_1

    or-int/lit8 v1, v1, 0x30

    goto :goto_2

    :cond_1
    and-int/lit8 v3, p5, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_1

    :cond_2
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v1, v3

    :cond_3
    :goto_2
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_4

    or-int/lit16 v1, v1, 0x180

    goto :goto_4

    :cond_4
    invoke-virtual {v0, p2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_3

    :cond_5
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    :goto_4
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0xc00

    goto :goto_6

    :cond_6
    and-int/lit16 v6, p5, 0xc00

    if-nez v6, :cond_8

    invoke-virtual {v0, p3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v1, v6

    :cond_8
    :goto_6
    and-int/lit16 v6, v1, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_a

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_7
    move-object v2, p1

    move v3, p2

    move v4, p3

    goto :goto_9

    :cond_a
    :goto_8
    if-eqz v2, :cond_b

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_b
    if-eqz v3, :cond_c

    const/4 p2, 0x1

    :cond_c
    if-eqz v4, :cond_d

    const/4 p3, 0x0

    :cond_d
    new-instance v2, Lb30/m4;

    invoke-direct {v2, p2, p1, p3, p0}, Lb30/m4;-><init>(ZLandroidx/compose/ui/Modifier;ZLjava/lang/String;)V

    const v3, -0x62452846

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    shr-int/lit8 v1, v1, 0x9

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    invoke-static {p3, v2, v0, v1}, Lio/sentry/config/a;->f(ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_e

    new-instance v0, Lb30/k4;

    const/4 v7, 0x0

    move-object v1, p0

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/k4;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZIII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final l(Lg40/u2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0xacbac5a

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    :cond_2
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_4

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v0, p1

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v0, p0, Lg40/u2;->e:Ljava/lang/Object;

    check-cast v0, Lec3/r1;

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    iget-object v2, p0, Lg40/u2;->c:Lec3/r1;

    invoke-static {v2, v6, v1}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzy/c;

    invoke-static {v2, v6}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    const v4, 0x718ea15    # 1.1504E-34f

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Lfd3/a;

    const/16 v4, 0x12

    invoke-direct {v5, v4, p0, v0}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    shr-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0xe

    or-int/lit16 v7, p2, 0x6030

    const/4 v8, 0x0

    const-string v1, "SAME_AS_SHIPPING_CHECKBOX_TEST_TAG"

    const/4 v4, 0x1

    move v0, v3

    move-object v3, v2

    move v2, v0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lx30/s0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance p2, Lf01/b;

    const/16 v1, 0x8

    invoke-direct {p2, p0, v0, p3, v1}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final m(Lh20/x1;)Lmy/a;
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lh20/x1;->w:Ljava/lang/String;

    iget-object v4, v0, Lh20/x1;->x:Lh20/c2;

    iget-object v5, v0, Lh20/x1;->y:Lh20/h2;

    iget-object v7, v0, Lh20/x1;->z:Lh20/i1;

    iget-object v8, v0, Lh20/x1;->E:Li20/b;

    iget-boolean v9, v0, Lh20/x1;->F:Z

    iget-boolean v10, v0, Lh20/x1;->G:Z

    iget-object v11, v0, Lh20/x1;->J:Lh20/l1;

    iget-object v12, v0, Lh20/x1;->K:Ljava/util/List;

    iget-boolean v13, v0, Lh20/x1;->L:Z

    iget-object v14, v0, Lh20/x1;->M:Ljava/util/List;

    iget-object v15, v0, Lh20/x1;->N:Ljava/util/List;

    iget-object v1, v0, Lh20/x1;->P:Lh20/t1;

    iget-object v2, v0, Lh20/x1;->R:Ljava/util/List;

    iget-object v6, v0, Lh20/x1;->S:Lh20/w2;

    move-object/from16 v16, v1

    iget-object v1, v0, Lh20/x1;->U:Lh20/g3;

    move-object/from16 v19, v1

    iget-object v1, v0, Lh20/x1;->V:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lh20/x1;->W:Ljava/util/Map;

    move-object/from16 v22, v1

    iget-object v1, v0, Lh20/x1;->T:Lh20/q3;

    move-object/from16 v23, v1

    iget-boolean v1, v0, Lh20/x1;->X:Z

    move/from16 v24, v1

    iget-object v1, v0, Lh20/x1;->Y:Ljava/lang/String;

    move-object/from16 v25, v1

    iget-object v1, v0, Lh20/x1;->H:Lh20/h1;

    iget-object v0, v0, Lh20/x1;->Q:Ljava/util/List;

    move-object/from16 v18, v2

    new-instance v2, Lmy/a;

    const/16 v21, 0x0

    move-object/from16 v17, v0

    move-object/from16 v26, v1

    invoke-direct/range {v2 .. v26}, Lmy/a;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/w2;Lh20/i1;Li20/b;ZZLh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/g3;Ljava/lang/String;Lwz/d0;Ljava/util/Map;Lh20/q3;ZLjava/lang/String;Lh20/h1;)V

    return-object v2
.end method

.method public static final n(Llb3/y;)Llb3/v0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb3/v0;

    invoke-direct {v0, p0}, Llb3/v0;-><init>(Llb3/y;)V

    return-object v0
.end method

.method public static o(Lr93/w;I)Ljava/lang/String;
    .locals 6

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    move v1, v2

    :cond_1
    const-string p1, "<this>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v1, :cond_3

    instance-of v1, p0, Lr93/j;

    if-eqz v1, :cond_2

    const-string v1, "<init>"

    goto :goto_1

    :cond_2
    move-object v1, p0

    check-cast v1, Lu93/n;

    invoke-virtual {v1}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "asString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, "("

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object v1

    sget-object v2, Lub3/c;->w:Lub3/c;

    const-string v3, "getType(...)"

    if-eqz v1, :cond_4

    check-cast v1, Lu93/d;

    invoke-virtual {v1}, Lu93/d;->getType()Llb3/y;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Loa3/t;->i:Loa3/t;

    invoke-static {v1, v4, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Loa3/l;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/a1;

    check-cast v4, Lu93/x0;

    invoke-virtual {v4}, Lu93/x0;->getType()Llb3/y;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Loa3/t;->i:Loa3/t;

    invoke-static {v4, v5, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Loa3/l;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    const-string v1, ")"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_8

    instance-of v0, p0, Lr93/j;

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {p0}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v1, Lo93/h;->e:Lva3/h;

    sget-object v1, Lo93/m;->d:Lva3/f;

    invoke-static {v0, v1}, Lo93/h;->E(Llb3/y;Lva3/f;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Llb3/d1;->e(Llb3/y;)Z

    move-result v0

    if-nez v0, :cond_7

    instance-of v0, p0, Lr93/o0;

    if-nez v0, :cond_7

    :goto_3
    const-string p0, "V"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_7
    invoke-interface {p0}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Loa3/t;->i:Loa3/t;

    invoke-static {p0, v0, v2}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loa3/l;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_8
    :goto_4
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lr93/b;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lya3/f;->m(Lr93/k;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v2, v0, Lr93/e;

    if-eqz v2, :cond_1

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    iget-boolean v2, v2, Lva3/h;->x:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p0}, Lr93/b;->a()Lr93/b;

    move-result-object p0

    instance-of v2, p0, Lu93/q0;

    if-eqz v2, :cond_4

    check-cast p0, Lu93/q0;

    goto :goto_1

    :cond_4
    move-object p0, v1

    :goto_1
    if-nez p0, :cond_5

    :goto_2
    return-object v1

    :cond_5
    const/4 v1, 0x3

    invoke-static {p0, v1}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Le4/a;->R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Llb3/y;Llb3/q0;Ljava/util/Set;)Z
    .locals 5

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lr93/i;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lr93/i;->j()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object p0

    instance-of v1, p0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_6

    :cond_3
    invoke-virtual {p0}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    move-object v1, p0

    check-cast v1, Lm83/d0;

    iget-object v4, v1, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v1}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm83/c0;

    iget v4, v1, Lm83/c0;->a:I

    iget-object v1, v1, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v1, Llb3/u0;

    if-eqz v0, :cond_5

    invoke-static {v4, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/x0;

    goto :goto_2

    :cond_5
    move-object v4, v2

    :goto_2
    if-eqz v4, :cond_6

    if-eqz p2, :cond_6

    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Llb3/u0;->c()Z

    move-result v4

    if-eqz v4, :cond_7

    :goto_3
    move v1, v3

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    const-string v4, "getType(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1, p2}, Lio/sentry/config/a;->q(Llb3/y;Llb3/q0;Ljava/util/Set;)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_4

    :goto_5
    const/4 p0, 0x1

    return p0

    :cond_8
    :goto_6
    return v3
.end method

.method public static final r(Llb3/y;Llb3/g1;Lr93/x0;)Llb3/v0;
    .locals 1

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb3/v0;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-ne p2, p1, :cond_1

    sget-object p1, Llb3/g1;->y:Llb3/g1;

    :cond_1
    invoke-direct {v0, p0, p1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v0
.end method

.method public static final u(Ljava/util/Collection;Lcd3/f;)Lwc3/c;
    .locals 5

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, p1}, Lio/sentry/config/a;->G(Ljava/lang/Object;Lcd3/f;)Lwc3/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lwc3/c;

    invoke-interface {v4}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v4

    invoke-interface {v4}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v1, 0x1

    if-le p1, v1, :cond_4

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Serializing collections of different element types is not yet supported. Selected serializers: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwc3/c;

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {v0}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwc3/c;

    if-nez p1, :cond_5

    sget-object p1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    :cond_5
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->isNullable()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_7

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-static {p1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_3
    return-object p1
.end method

.method public static final v(Llb3/c0;Ljava/util/Set;)Ljava/util/LinkedHashSet;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, p0, v0, p1}, Lio/sentry/config/a;->w(Llb3/y;Llb3/c0;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    return-object v0
.end method

.method public static final w(Llb3/y;Llb3/c0;Ljava/util/LinkedHashSet;Ljava/util/Set;)V
    .locals 6

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/x0;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    check-cast v0, Lr93/x0;

    invoke-interface {v0}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0, p1, p2, p3}, Lio/sentry/config/a;->w(Llb3/y;Llb3/c0;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lr93/i;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {v0}, Lr93/i;->j()Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    add-int/lit8 v3, v1, 0x1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/u0;

    if-eqz v0, :cond_4

    invoke-static {v1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/x0;

    goto :goto_4

    :cond_4
    move-object v1, v2

    :goto_4
    if-eqz v1, :cond_5

    if-eqz p3, :cond_5

    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v4}, Llb3/u0;->c()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-virtual {v1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-interface {v1}, Llb3/q0;->d()Lr93/h;

    move-result-object v1

    invoke-static {p2, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-virtual {v1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    const-string v4, "getType(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1, p2, p3}, Lio/sentry/config/a;->w(Llb3/y;Llb3/c0;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    :cond_8
    :goto_5
    move v1, v3

    goto :goto_3

    :cond_9
    return-void
.end method

.method public static final x(Ljava/lang/Iterable;)Ljava/util/HashSet;
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getClassifierNames()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final y(Lr93/w;)Z
    .locals 8

    const-string v0, "f"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Lu93/n;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "remove"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    invoke-static {p0}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object v0

    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v0, v0, Lha3/c;

    if-nez v0, :cond_5

    invoke-static {p0}, Lo93/h;->A(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-interface {p0}, Lr93/w;->a()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    const-string v2, "getValueParameters(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/a1;

    check-cast v0, Lu93/x0;

    invoke-virtual {v0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    const-string v3, "getType(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Loa3/t;->i:Loa3/t;

    sget-object v5, Lub3/c;->w:Lub3/c;

    invoke-static {v0, v4, v5}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loa3/l;

    instance-of v6, v0, Loa3/k;

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    check-cast v0, Loa3/k;

    goto :goto_0

    :cond_1
    move-object v0, v7

    :goto_0
    if-eqz v0, :cond_2

    iget-object v7, v0, Loa3/k;->i:Ldb3/c;

    :cond_2
    sget-object v0, Ldb3/c;->I:Ldb3/c;

    if-eq v7, v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p0}, Lfa3/e;->a(Lr93/w;)Lr93/w;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p0}, Lr93/w;->a()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/a1;

    check-cast v0, Lu93/x0;

    invoke-virtual {v0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4, v5}, Ldp/d;->P(Llb3/y;Loa3/t;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loa3/l;

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p0

    sget-object v2, Lo93/m;->K:Lva3/e;

    iget-object v2, v2, Lva3/e;->a:Lva3/f;

    invoke-virtual {p0, v2}, Lva3/f;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    instance-of p0, v0, Loa3/j;

    if-eqz p0, :cond_5

    check-cast v0, Loa3/j;

    iget-object p0, v0, Loa3/j;->i:Ljava/lang/String;

    const-string v0, "java/lang/Object"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    return v1

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final z(Llb3/y;)Lo93/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->c()Lo93/h;

    move-result-object p0

    const-string v0, "getBuiltIns(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public s(Lin/e;)Lin/c;
    .locals 2

    iget-object v0, p1, Lum/c;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Llo/a;->e(Z)V

    const/high16 v1, -0x80000000

    invoke-virtual {p1, v1}, La9/a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1, v0}, Lio/sentry/config/a;->t(Lin/e;Ljava/nio/ByteBuffer;)Lin/c;

    move-result-object p1

    return-object p1
.end method

.method public abstract t(Lin/e;Ljava/nio/ByteBuffer;)Lin/c;
.end method
