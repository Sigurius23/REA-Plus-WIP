.class public abstract Lup/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:I = 0x1

.field public static c:Lig3/b;


# direct methods
.method public static final A(Lj93/g;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj93/q;

    invoke-interface {v2}, Lj93/q;->getKind()Lj93/p;

    move-result-object v2

    sget-object v3, Lj93/p;->z:Lj93/p;

    if-ne v2, v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static declared-synchronized B(Landroid/content/Context;)I
    .locals 7

    const-class v0, Lup/d;

    monitor-enter v0

    :try_start_0
    const-string v1, "Context is null"

    invoke-static {p0, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "d"

    const-string v2, "null"

    const-string v3, "preferredRenderer: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-boolean v1, Lup/d;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return v2

    :cond_0
    :try_start_1
    invoke-static {p0}, Lrj/j;->y(Landroid/content/Context;)Lvp/d;

    move-result-object v1
    :try_end_1
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Lvp/d;->m0()Lvp/a;

    move-result-object v3

    invoke-static {v3}, Luo/w;->f(Ljava/lang/Object;)V

    sput-object v3, Ls30/e;->w:Lvp/a;

    invoke-virtual {v1}, Lvp/d;->o0()Lop/k;

    move-result-object v3

    sget-object v4, Ls6/a;->w:Lop/k;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v4, "delegate must not be null"

    invoke-static {v3, v4}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v3, Ls6/a;->w:Lop/k;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    const/4 v3, 0x1

    :try_start_3
    sput-boolean v3, Lup/d;->a:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v4, 0x2

    :try_start_4
    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v5

    const/16 v6, 0x9

    invoke-virtual {v1, v5, v6}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    if-ne v6, v4, :cond_2

    sput v4, Lup/d;->b:I

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_5

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v5, Lcp/b;

    invoke-direct {v5, p0}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object p0

    invoke-static {p0, v5}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {p0, v2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v5, 0xa

    invoke-virtual {v1, p0, v5}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :goto_2
    :try_start_5
    const-string v1, "d"

    const-string v5, "Failed to retrieve renderer type or log initialization."

    invoke-static {v1, v5, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    const-string p0, "d"

    sget v1, Lup/d;->b:I

    if-eq v1, v3, :cond_4

    if-eq v1, v4, :cond_3

    const-string v1, "null"

    goto :goto_4

    :cond_3
    const-string v1, "LATEST"

    goto :goto_4

    :cond_4
    const-string v1, "LEGACY"

    :goto_4
    const-string v3, "loadedRenderer: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v0

    return v2

    :catch_1
    move-exception p0

    :try_start_6
    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception p0

    iget p0, p0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;->w:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit v0

    return p0

    :goto_5
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p0
.end method

.method public static C()Lio/sentry/android/replay/t;
    .locals 4

    new-instance v0, Lio/sentry/android/replay/t;

    invoke-direct {v0}, Lio/sentry/android/replay/t;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lio/sentry/c7;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-object v0
.end method

.method public static D(Landroid/os/Bundle;)Z
    .locals 2

    const-string v0, "itbl"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    const-string v0, "body"

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static E(Landroid/os/Bundle;)Z
    .locals 0

    invoke-static {p0}, Lcom/iterable/iterableapi/v1;->b(Landroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method public static F(Landroid/os/Bundle;)Z
    .locals 1

    const-string v0, "itbl"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static G(I)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_1

    const/16 v0, 0x15

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static H(Ljava/util/Map;)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static I(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_a

    const/4 v0, 0x1

    if-eq p0, v0, :cond_9

    const/16 v0, 0x8

    if-eq p0, v0, :cond_8

    const/16 v0, 0x13

    if-eq p0, v0, :cond_7

    const/16 v0, 0x16

    if-eq p0, v0, :cond_6

    const/16 v0, 0x22

    if-eq p0, v0, :cond_5

    const/16 v0, 0x29

    if-eq p0, v0, :cond_4

    const/16 v0, 0x3e

    if-eq p0, v0, :cond_3

    const/16 v0, 0x85

    if-eq p0, v0, :cond_2

    const/16 v0, 0x93

    if-eq p0, v0, :cond_1

    const/16 v0, 0x100

    if-eq p0, v0, :cond_0

    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "GATT CONN CANCEL "

    return-object p0

    :cond_1
    const-string p0, "GATT TIMEOUT"

    return-object p0

    :cond_2
    const-string p0, "GATT ERROR"

    return-object p0

    :cond_3
    const-string p0, "GATT CONN FAIL ESTABLISH"

    return-object p0

    :cond_4
    const-string p0, "GATT PAIRING WITH UNIT KEY NOT SUPPORTED"

    return-object p0

    :cond_5
    const-string p0, "GATT CONN LMP TIMEOUT"

    return-object p0

    :cond_6
    const-string p0, "GATT CONN TERMINATE LOCAL HOST"

    return-object p0

    :cond_7
    const-string p0, "GATT CONN TERMINATE PEER USER"

    return-object p0

    :cond_8
    const-string p0, "GATT CONN TIMEOUT"

    return-object p0

    :cond_9
    const-string p0, "GATT CONN L2C FAILURE"

    return-object p0

    :cond_a
    const-string p0, "SUCCESS"

    return-object p0
.end method

.method public static final J(JJJJJLb2/v;[F)Lj3/c;
    .locals 16

    const/4 v0, 0x2

    move-object/from16 v12, p10

    invoke-static {v12, v0}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v0

    invoke-static {v12}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v1

    invoke-virtual {v1}, La3/n0;->Y()Z

    move-result v2

    iget-object v1, v1, La3/n0;->e0:La3/l1;

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v2, v1, La3/l1;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/ui/node/NodeCoordinator;

    if-eq v2, v0, :cond_1

    const/16 v2, 0x20

    shr-long v3, p0, v2

    long-to-int v3, v3

    int-to-float v3, v3

    const-wide v4, 0xffffffffL

    and-long v6, p0, v4

    long-to-int v6, v6

    int-to-float v6, v6

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v7, v3

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v9, v3

    shl-long v6, v7, v2

    and-long v8, v9, v4

    or-long/2addr v6, v8

    iget-wide v8, v0, Ly2/j1;->y:J

    iget-object v1, v1, La3/l1;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0, v6, v7}, Landroidx/compose/ui/node/NodeCoordinator;->p1(Ly2/y;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lvo/b;->C(J)J

    move-result-wide v0

    move-wide v14, v0

    move v0, v2

    move-wide v2, v14

    new-instance v1, Lj3/c;

    shr-long v6, v2, v0

    long-to-int v6, v6

    shr-long v10, v8, v0

    long-to-int v7, v10

    add-int/2addr v6, v7

    and-long v10, v2, v4

    long-to-int v7, v10

    and-long/2addr v8, v4

    long-to-int v8, v8

    add-int/2addr v7, v8

    int-to-long v8, v6

    shl-long/2addr v8, v0

    int-to-long v6, v7

    and-long/2addr v4, v6

    or-long/2addr v4, v8

    move-wide/from16 v6, p4

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    move-object/from16 v13, p11

    invoke-direct/range {v1 .. v13}, Lj3/c;-><init>(JJJJJLb2/v;[F)V

    return-object v1

    :cond_1
    new-instance v1, Lj3/c;

    move-wide/from16 v2, p0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-wide/from16 v8, p6

    move-wide/from16 v10, p8

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    invoke-direct/range {v1 .. v13}, Lj3/c;-><init>(JJJJJLb2/v;[F)V

    return-object v1
.end method

.method public static final K(Ll8/c;)Landroid/app/Application;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p0, v0}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Landroid/app/Application;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static L(Ly00/c8;)V
    .locals 5

    const-string v0, "stripeIntent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly00/l3;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Ly00/l3;

    iget-object v1, v1, Ly00/l3;->H:Ly00/g3;

    sget-object v2, Ly00/g3;->y:Ly00/g3;

    if-eq v1, v2, :cond_0

    new-instance p0, La30/y0;

    invoke-direct {p0, v1}, La30/y0;-><init>(Ly00/g3;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Ly00/l3;

    iget-object v1, v1, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->y:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v3, Lcom/stripe/android/model/StripeIntent$Status;->G:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->H:Lcom/stripe/android/model/StripeIntent$Status;

    filled-new-array {v2, v3, v4}, [Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p0, La30/b1;

    invoke-direct {p0, v1}, La30/b1;-><init>(Lcom/stripe/android/model/StripeIntent$Status;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Ly00/l3;

    iget-object v1, v0, Ly00/l3;->y:Ljava/lang/Long;

    if-eqz v1, :cond_2

    iget-object v0, v0, Ly00/l3;->K:Ljava/lang/String;

    if-nez v0, :cond_3

    :cond_2
    sget-object p0, La30/z0;->w:La30/z0;

    goto :goto_0

    :cond_3
    instance-of v0, p0, Ly00/g6;

    if-eqz v0, :cond_4

    check-cast p0, Ly00/g6;

    iget-object p0, p0, Ly00/g6;->K:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v0, Lcom/stripe/android/model/StripeIntent$Status;->y:Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->G:Lcom/stripe/android/model/StripeIntent$Status;

    filled-new-array {v0, v1}, [Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, La30/c1;

    invoke-direct {v0, p0}, La30/c1;-><init>(Lcom/stripe/android/model/StripeIntent$Status;)V

    move-object p0, v0

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_5

    return-void

    :cond_5
    throw p0
.end method

.method public static final M(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lee/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lee/a;

    iget v1, v0, Lee/a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lee/a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lee/a;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lee/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lee/a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lyd/f;->f:Ljf/f;

    invoke-static {p2, p0}, Ljf/e;->c(Ljf/f;Lvg/n;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_4

    iput v3, v0, Lee/a;->x:I

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lce/k;

    const-string p0, "<this>"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "sdk_ua_app_id"

    const/4 p1, 0x0

    invoke-virtual {p2, p0, p1}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method public static N(Lig3/b;)V
    .locals 0

    sput-object p0, Lup/d;->c:Lig3/b;

    return-void
.end method

.method public static final O([F)V
    .locals 14

    array-length v0, p0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, p0, v2

    const/4 v4, 0x2

    aput v3, p0, v4

    const/4 v5, 0x3

    aput v3, p0, v5

    const/4 v5, 0x4

    aput v3, p0, v5

    const/4 v5, 0x5

    aput v3, p0, v5

    const/4 v6, 0x6

    aput v1, p0, v6

    const/4 v7, 0x7

    aput v3, p0, v7

    const/16 v8, 0x8

    aput v3, p0, v8

    const/16 v8, 0x9

    aput v3, p0, v8

    const/16 v8, 0xa

    aput v3, p0, v8

    const/16 v9, 0xb

    aput v3, p0, v9

    const/16 v10, 0xc

    aput v1, p0, v10

    const/16 v11, 0xd

    aput v3, p0, v11

    const/16 v11, 0xe

    aput v3, p0, v11

    const/16 v11, 0xf

    aput v3, p0, v11

    const/16 v11, 0x10

    aput v3, p0, v11

    const/16 v11, 0x11

    aput v3, p0, v11

    const/16 v11, 0x12

    aput v1, p0, v11

    const/16 v1, 0x13

    aput v3, p0, v1

    int-to-float v1, v2

    sub-float/2addr v1, v3

    const v11, 0x3e5a1cac    # 0.213f

    mul-float/2addr v11, v1

    const v12, 0x3f370a3d    # 0.715f

    mul-float/2addr v12, v1

    const v13, 0x3d9374bc    # 0.072f

    mul-float/2addr v1, v13

    add-float v13, v11, v3

    aput v13, p0, v0

    aput v12, p0, v2

    aput v1, p0, v4

    aput v11, p0, v5

    add-float v0, v12, v3

    aput v0, p0, v6

    aput v1, p0, v7

    aput v11, p0, v8

    aput v12, p0, v9

    add-float/2addr v1, v3

    aput v1, p0, v10

    return-void
.end method

.method public static final P([FFFF)V
    .locals 7

    array-length v0, p0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, p0, v2

    const/4 v2, 0x2

    aput v3, p0, v2

    const/4 v2, 0x3

    aput v3, p0, v2

    const/4 v2, 0x4

    aput v3, p0, v2

    const/4 v2, 0x5

    aput v3, p0, v2

    const/4 v2, 0x6

    aput v1, p0, v2

    const/4 v4, 0x7

    aput v3, p0, v4

    const/16 v4, 0x8

    aput v3, p0, v4

    const/16 v4, 0x9

    aput v3, p0, v4

    const/16 v4, 0xa

    aput v3, p0, v4

    const/16 v4, 0xb

    aput v3, p0, v4

    const/16 v4, 0xc

    aput v1, p0, v4

    const/16 v5, 0xd

    aput v3, p0, v5

    const/16 v5, 0xe

    aput v3, p0, v5

    const/16 v5, 0xf

    aput v3, p0, v5

    const/16 v5, 0x10

    aput v3, p0, v5

    const/16 v5, 0x11

    aput v3, p0, v5

    const/16 v5, 0x12

    aput v1, p0, v5

    const/16 v6, 0x13

    aput v3, p0, v6

    aput p1, p0, v0

    aput p2, p0, v2

    aput p3, p0, v4

    aput v1, p0, v5

    return-void
.end method

.method public static Q(Landroid/widget/PopupWindow;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    return-void
.end method

.method public static R(Llb3/f1;Llb3/f1;)Z
    .locals 1

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb3/m;->w:Lmb3/m;

    invoke-static {v0, p0, p1}, Lcom/squareup/wire/n;->d0(Lob3/o;Lob3/g;Lob3/g;)Z

    move-result p0

    return p0
.end method

.method public static final S([F[F)V
    .locals 60

    move-object/from16 v0, p0

    array-length v1, v0

    const/16 v2, 0x14

    if-ge v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    aget v2, v0, v1

    aget v3, p1, v1

    mul-float v4, v2, v3

    const/4 v5, 0x1

    aget v6, v0, v5

    const/4 v7, 0x5

    aget v8, p1, v7

    mul-float v9, v6, v8

    add-float/2addr v9, v4

    const/4 v4, 0x2

    aget v10, v0, v4

    const/16 v11, 0xa

    aget v12, p1, v11

    mul-float v13, v10, v12

    add-float/2addr v13, v9

    const/4 v9, 0x3

    aget v14, v0, v9

    const/16 v15, 0xf

    aget v16, p1, v15

    mul-float v17, v14, v16

    add-float v17, v17, v13

    aget v13, p1, v5

    mul-float v18, v2, v13

    const/16 v19, 0x6

    aget v20, p1, v19

    mul-float v21, v6, v20

    add-float v21, v21, v18

    const/16 v18, 0xb

    aget v22, p1, v18

    mul-float v23, v10, v22

    add-float v23, v23, v21

    const/16 v21, 0x10

    aget v24, p1, v21

    mul-float v25, v14, v24

    add-float v25, v25, v23

    aget v23, p1, v4

    mul-float v26, v2, v23

    const/16 v27, 0x7

    aget v28, p1, v27

    mul-float v29, v6, v28

    add-float v29, v29, v26

    const/16 v26, 0xc

    aget v30, p1, v26

    mul-float v31, v10, v30

    add-float v31, v31, v29

    const/16 v29, 0x11

    aget v32, p1, v29

    mul-float v33, v14, v32

    add-float v33, v33, v31

    aget v31, p1, v9

    mul-float v34, v2, v31

    const/16 v35, 0x8

    aget v36, p1, v35

    mul-float v37, v6, v36

    add-float v37, v37, v34

    const/16 v34, 0xd

    aget v38, p1, v34

    mul-float v39, v10, v38

    add-float v39, v39, v37

    const/16 v37, 0x12

    aget v40, p1, v37

    mul-float v41, v14, v40

    add-float v41, v41, v39

    const/16 v39, 0x4

    aget v42, p1, v39

    mul-float v2, v2, v42

    const/16 v43, 0x9

    aget v44, p1, v43

    mul-float v6, v6, v44

    add-float/2addr v6, v2

    const/16 v2, 0xe

    aget v45, p1, v2

    mul-float v10, v10, v45

    add-float/2addr v10, v6

    const/16 v6, 0x13

    aget v46, p1, v6

    mul-float v14, v14, v46

    add-float/2addr v14, v10

    aget v10, v0, v39

    add-float/2addr v14, v10

    aget v10, v0, v7

    mul-float v47, v10, v3

    aget v48, v0, v19

    mul-float v49, v48, v8

    add-float v49, v49, v47

    aget v47, v0, v27

    mul-float v50, v47, v12

    add-float v50, v50, v49

    aget v49, v0, v35

    mul-float v51, v49, v16

    add-float v51, v51, v50

    mul-float v50, v10, v13

    mul-float v52, v48, v20

    add-float v52, v52, v50

    mul-float v50, v47, v22

    add-float v50, v50, v52

    mul-float v52, v49, v24

    add-float v52, v52, v50

    mul-float v50, v10, v23

    mul-float v53, v48, v28

    add-float v53, v53, v50

    mul-float v50, v47, v30

    add-float v50, v50, v53

    mul-float v53, v49, v32

    add-float v53, v53, v50

    mul-float v50, v10, v31

    mul-float v54, v48, v36

    add-float v54, v54, v50

    mul-float v50, v47, v38

    add-float v50, v50, v54

    mul-float v54, v49, v40

    add-float v54, v54, v50

    mul-float v10, v10, v42

    mul-float v48, v48, v44

    add-float v48, v48, v10

    mul-float v47, v47, v45

    add-float v47, v47, v48

    mul-float v49, v49, v46

    add-float v49, v49, v47

    aget v10, v0, v43

    add-float v49, v49, v10

    aget v10, v0, v11

    mul-float v47, v10, v3

    aget v48, v0, v18

    mul-float v50, v48, v8

    add-float v50, v50, v47

    aget v47, v0, v26

    mul-float v55, v47, v12

    add-float v55, v55, v50

    aget v50, v0, v34

    mul-float v56, v50, v16

    add-float v56, v56, v55

    mul-float v55, v10, v13

    mul-float v57, v48, v20

    add-float v57, v57, v55

    mul-float v55, v47, v22

    add-float v55, v55, v57

    mul-float v57, v50, v24

    add-float v57, v57, v55

    mul-float v55, v10, v23

    mul-float v58, v48, v28

    add-float v58, v58, v55

    mul-float v55, v47, v30

    add-float v55, v55, v58

    mul-float v58, v50, v32

    add-float v58, v58, v55

    mul-float v55, v10, v31

    mul-float v59, v48, v36

    add-float v59, v59, v55

    mul-float v55, v47, v38

    add-float v55, v55, v59

    mul-float v59, v50, v40

    add-float v59, v59, v55

    mul-float v10, v10, v42

    mul-float v48, v48, v44

    add-float v48, v48, v10

    mul-float v47, v47, v45

    add-float v47, v47, v48

    mul-float v50, v50, v46

    add-float v50, v50, v47

    aget v10, v0, v2

    add-float v50, v50, v10

    aget v10, v0, v15

    mul-float/2addr v3, v10

    aget v47, v0, v21

    mul-float v8, v8, v47

    add-float/2addr v8, v3

    aget v3, v0, v29

    mul-float/2addr v12, v3

    add-float/2addr v12, v8

    aget v8, v0, v37

    mul-float v16, v16, v8

    add-float v16, v16, v12

    mul-float/2addr v13, v10

    mul-float v20, v20, v47

    add-float v20, v20, v13

    mul-float v22, v22, v3

    add-float v22, v22, v20

    mul-float v24, v24, v8

    add-float v24, v24, v22

    mul-float v23, v23, v10

    mul-float v28, v28, v47

    add-float v28, v28, v23

    mul-float v30, v30, v3

    add-float v30, v30, v28

    mul-float v32, v32, v8

    add-float v32, v32, v30

    mul-float v31, v31, v10

    mul-float v36, v36, v47

    add-float v36, v36, v31

    mul-float v38, v38, v3

    add-float v38, v38, v36

    mul-float v40, v40, v8

    add-float v40, v40, v38

    mul-float v10, v10, v42

    mul-float v47, v47, v44

    add-float v47, v47, v10

    mul-float v3, v3, v45

    add-float v3, v3, v47

    mul-float v8, v8, v46

    add-float/2addr v8, v3

    aget v3, v0, v6

    add-float/2addr v8, v3

    aput v17, v0, v1

    aput v25, v0, v5

    aput v33, v0, v4

    aput v41, v0, v9

    aput v14, v0, v39

    aput v51, v0, v7

    aput v52, v0, v19

    aput v53, v0, v27

    aput v54, v0, v35

    aput v49, v0, v43

    aput v56, v0, v11

    aput v57, v0, v18

    aput v58, v0, v26

    aput v59, v0, v34

    aput v50, v0, v2

    aput v16, v0, v15

    aput v24, v0, v21

    aput v32, v0, v29

    aput v40, v0, v37

    aput v8, v0, v6

    return-void
.end method

.method public static final T(Landroidx/health/platform/client/proto/u;)Lm7/r0;
    .locals 74

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->J()Landroidx/health/platform/client/proto/w;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/w;->r()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_45

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "energy"

    const-string v4, "bpm"

    const-string v5, "rate"

    const-string v6, "count"

    const-string v7, "temperature"

    const-string v8, "percentage"

    const-string v9, "mass"

    const-string v10, "ofEpochMilli(it.endTimeMillis)"

    const-string v11, "ofEpochMilli(it.startTimeMillis)"

    const-string v12, "valuesList"

    const-string v13, "mealType"

    const-string v14, "stage"

    const-string v15, "notes"

    move/from16 v16, v2

    const-string v2, "title"

    move-object/from16 v17, v3

    const-string v3, "measurementLocation"

    sget-object v18, Lm83/y;->w:Lm83/y;

    move-object/from16 v19, v4

    const-string v4, "ofEpochMilli(value.instantTimeMillis)"

    move-object/from16 v20, v5

    const-string v5, "seriesValuesList"

    move-object/from16 v21, v6

    const/16 v6, 0xa

    const/16 v22, 0x0

    const/16 v23, 0x0

    sparse-switch v16, :sswitch_data_0

    goto/16 :goto_43

    :sswitch_0
    const-string v2, "PowerSeries"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v10

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->Q()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/b0;

    new-instance v3, Lm7/p0;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/b0;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "power"

    invoke-static {v2, v6}, Lv8/b;->t(Landroidx/health/platform/client/proto/b0;Ljava/lang/String;)D

    move-result-wide v6

    sget-object v2, Lr7/h0;->y:Lr7/d0;

    invoke-static {v6, v7}, Lr7/d0;->a(D)Lr7/h0;

    move-result-object v2

    invoke-direct {v3, v5, v2}, Lm7/p0;-><init>(Ljava/time/Instant;Lr7/h0;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v13

    new-instance v7, Lm7/q0;

    invoke-direct/range {v7 .. v13}, Lm7/q0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v7

    :sswitch_1
    const-string v3, "SleepSession"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v2}, Lv8/b;->E(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    invoke-static {v0, v15}, Lv8/b;->E(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v25

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v26

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v27

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v28

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->T()Ljava/util/Map;

    move-result-object v1

    const-string v2, "stages"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/r;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/e0;

    new-instance v4, Lm7/w0;

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->t()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->s()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v6

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lm7/x0;->i:Ljava/lang/Object;

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/g0;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/g0;->x()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_1
    move-object/from16 v3, v23

    :goto_2
    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_3

    :cond_2
    move/from16 v3, v22

    :goto_3
    invoke-direct {v4, v5, v6, v3}, Lm7/w0;-><init>(Ljava/time/Instant;Ljava/time/Instant;I)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object/from16 v31, v2

    goto :goto_4

    :cond_4
    move-object/from16 v31, v18

    :goto_4
    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v32

    new-instance v24, Lm7/x0;

    invoke-direct/range {v24 .. v32}, Lm7/x0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln7/c;)V

    return-object v24

    :sswitch_2
    const-string v2, "BoneMass"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v9}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->b(D)Lr7/b0;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/j;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/j;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v4

    :sswitch_3
    const-string v2, "Nutrition"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "biotin"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v29, v1

    goto :goto_5

    :cond_5
    move-object/from16 v29, v23

    :goto_5
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "caffeine"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_6

    :cond_6
    move-object/from16 v30, v23

    :goto_6
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "calcium"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v31, v1

    goto :goto_7

    :cond_7
    move-object/from16 v31, v23

    :goto_7
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "calories"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/k;->y:Lr7/e;

    invoke-static {v1, v2}, Lr7/e;->a(D)Lr7/k;

    move-result-object v1

    move-object/from16 v32, v1

    goto :goto_8

    :cond_8
    move-object/from16 v32, v23

    :goto_8
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "caloriesFromFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/k;->y:Lr7/e;

    invoke-static {v1, v2}, Lr7/e;->a(D)Lr7/k;

    move-result-object v1

    move-object/from16 v33, v1

    goto :goto_9

    :cond_9
    move-object/from16 v33, v23

    :goto_9
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "chloride"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v34, v1

    goto :goto_a

    :cond_a
    move-object/from16 v34, v23

    :goto_a
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "cholesterol"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v35, v1

    goto :goto_b

    :cond_b
    move-object/from16 v35, v23

    :goto_b
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "chromium"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v36, v1

    goto :goto_c

    :cond_c
    move-object/from16 v36, v23

    :goto_c
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "copper"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v37, v1

    goto :goto_d

    :cond_d
    move-object/from16 v37, v23

    :goto_d
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "dietaryFiber"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v38, v1

    goto :goto_e

    :cond_e
    move-object/from16 v38, v23

    :goto_e
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "folate"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v39, v1

    goto :goto_f

    :cond_f
    move-object/from16 v39, v23

    :goto_f
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "folicAcid"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v40, v1

    goto :goto_10

    :cond_10
    move-object/from16 v40, v23

    :goto_10
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "iodine"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v41, v1

    goto :goto_11

    :cond_11
    move-object/from16 v41, v23

    :goto_11
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "iron"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v42, v1

    goto :goto_12

    :cond_12
    move-object/from16 v42, v23

    :goto_12
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "magnesium"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v43, v1

    goto :goto_13

    :cond_13
    move-object/from16 v43, v23

    :goto_13
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "manganese"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v44, v1

    goto :goto_14

    :cond_14
    move-object/from16 v44, v23

    :goto_14
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "molybdenum"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v45, v1

    goto :goto_15

    :cond_15
    move-object/from16 v45, v23

    :goto_15
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "monounsaturatedFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v46, v1

    goto :goto_16

    :cond_16
    move-object/from16 v46, v23

    :goto_16
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "niacin"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v47, v1

    goto :goto_17

    :cond_17
    move-object/from16 v47, v23

    :goto_17
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "pantothenicAcid"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v48, v1

    goto :goto_18

    :cond_18
    move-object/from16 v48, v23

    :goto_18
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "phosphorus"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v49, v1

    goto :goto_19

    :cond_19
    move-object/from16 v49, v23

    :goto_19
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "polyunsaturatedFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v50, v1

    goto :goto_1a

    :cond_1a
    move-object/from16 v50, v23

    :goto_1a
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "potassium"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v51, v1

    goto :goto_1b

    :cond_1b
    move-object/from16 v51, v23

    :goto_1b
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "protein"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_1c

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v52, v1

    goto :goto_1c

    :cond_1c
    move-object/from16 v52, v23

    :goto_1c
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "riboflavin"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_1d

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v53, v1

    goto :goto_1d

    :cond_1d
    move-object/from16 v53, v23

    :goto_1d
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "saturatedFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v54, v1

    goto :goto_1e

    :cond_1e
    move-object/from16 v54, v23

    :goto_1e
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "selenium"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_1f

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v55, v1

    goto :goto_1f

    :cond_1f
    move-object/from16 v55, v23

    :goto_1f
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "sodium"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v56, v1

    goto :goto_20

    :cond_20
    move-object/from16 v56, v23

    :goto_20
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "sugar"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_21

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v57, v1

    goto :goto_21

    :cond_21
    move-object/from16 v57, v23

    :goto_21
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "thiamin"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_22

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v58, v1

    goto :goto_22

    :cond_22
    move-object/from16 v58, v23

    :goto_22
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "totalCarbohydrate"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_23

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v59, v1

    goto :goto_23

    :cond_23
    move-object/from16 v59, v23

    :goto_23
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "totalFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_24

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v60, v1

    goto :goto_24

    :cond_24
    move-object/from16 v60, v23

    :goto_24
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "transFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_25

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v61, v1

    goto :goto_25

    :cond_25
    move-object/from16 v61, v23

    :goto_25
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "unsaturatedFat"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_26

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v62, v1

    goto :goto_26

    :cond_26
    move-object/from16 v62, v23

    :goto_26
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminA"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v63, v1

    goto :goto_27

    :cond_27
    move-object/from16 v63, v23

    :goto_27
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminB12"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_28

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v64, v1

    goto :goto_28

    :cond_28
    move-object/from16 v64, v23

    :goto_28
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminB6"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_29

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v65, v1

    goto :goto_29

    :cond_29
    move-object/from16 v65, v23

    :goto_29
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminC"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_2a

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v66, v1

    goto :goto_2a

    :cond_2a
    move-object/from16 v66, v23

    :goto_2a
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminD"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_2b

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v67, v1

    goto :goto_2b

    :cond_2b
    move-object/from16 v67, v23

    :goto_2b
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminE"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_2c

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v68, v1

    goto :goto_2c

    :cond_2c
    move-object/from16 v68, v23

    :goto_2c
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "vitaminK"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_2d

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v1

    move-object/from16 v69, v1

    goto :goto_2d

    :cond_2d
    move-object/from16 v69, v23

    :goto_2d
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v1

    const-string v2, "zinc"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/g0;

    if-eqz v1, :cond_2e

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->a(D)Lr7/b0;

    move-result-object v23

    :cond_2e
    move-object/from16 v70, v23

    sget-object v1, Lm7/i0;->a:Ljava/lang/Object;

    invoke-static {v0, v13, v1}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v72

    const-string v1, "name"

    invoke-static {v0, v1}, Lv8/b;->E(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v71

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v25

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v26

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v27

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v28

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v73

    new-instance v24, Lm7/m0;

    invoke-direct/range {v24 .. v73}, Lm7/m0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/k;Lr7/k;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Lr7/b0;Ljava/lang/String;ILn7/c;)V

    return-object v24

    :sswitch_4
    const-string v2, "BodyFat"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v8}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v3, Lr7/c0;

    invoke-direct {v3, v1, v2}, Lr7/c0;-><init>(D)V

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/f;

    invoke-direct {v4, v1, v2, v3, v0}, Lm7/f;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/c0;Ln7/c;)V

    return-object v4

    :sswitch_5
    const-string v2, "SleepStage"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    sget-object v1, Lm7/y0;->g:Ljava/lang/Object;

    invoke-static {v0, v14, v1}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v7

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v8

    new-instance v2, Lm7/y0;

    invoke-direct/range {v2 .. v8}, Lm7/y0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v2

    :sswitch_6
    const-string v2, "BodyTemperature"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v7}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v7, Lr7/k0;

    invoke-direct {v7, v1, v2}, Lr7/k0;-><init>(D)V

    sget-object v1, Lm7/g;->a:Ljava/lang/Object;

    invoke-static {v0, v3, v1}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v8

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v9

    new-instance v4, Lm7/h;

    invoke-direct/range {v4 .. v9}, Lm7/h;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k0;ILn7/c;)V

    return-object v4

    :sswitch_7
    const-string v3, "ActivitySession"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "activityType"

    sget-object v3, Lm7/w;->l:Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v29

    invoke-static {v0, v2}, Lv8/b;->E(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v0, v15}, Lv8/b;->E(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v25

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v26

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v27

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v28

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v32

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->T()Ljava/util/Map;

    move-result-object v1

    const-string v2, "segments"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    if-eqz v1, :cond_32

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/r;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/e0;

    new-instance v4, Lm7/v;

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->t()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->s()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v8

    const-string v9, "type"

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/health/platform/client/proto/g0;

    if-eqz v8, :cond_2f

    invoke-virtual {v8}, Landroidx/health/platform/client/proto/g0;->y()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_2f

    :cond_2f
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_2f
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v3

    const-string v9, "reps"

    invoke-interface {v3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/g0;

    if-eqz v3, :cond_30

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/g0;->y()J

    move-result-wide v13

    long-to-int v3, v13

    goto :goto_30

    :cond_30
    move/from16 v3, v22

    :goto_30
    invoke-direct {v4, v5, v7, v8, v3}, Lm7/v;-><init>(Ljava/time/Instant;Ljava/time/Instant;II)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2e

    :cond_31
    move-object/from16 v33, v2

    goto :goto_31

    :cond_32
    move-object/from16 v33, v18

    :goto_31
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->T()Ljava/util/Map;

    move-result-object v1

    const-string v2, "laps"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    if-eqz v1, :cond_35

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/r;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_32
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_34

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/e0;

    new-instance v4, Lm7/p;

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->t()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->s()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v3

    const-string v8, "length"

    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/g0;

    if-eqz v3, :cond_33

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v8

    sget-object v3, Lr7/s;->y:Lr7/l;

    invoke-static {v8, v9}, Lr7/l;->a(D)Lr7/s;

    move-result-object v3

    goto :goto_33

    :cond_33
    move-object/from16 v3, v23

    :goto_33
    invoke-direct {v4, v5, v7, v3}, Lm7/p;-><init>(Ljava/time/Instant;Ljava/time/Instant;Lr7/s;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :cond_34
    move-object/from16 v34, v2

    goto :goto_34

    :cond_35
    move-object/from16 v34, v18

    :goto_34
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->T()Ljava/util/Map;

    move-result-object v1

    const-string v2, "route"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/health/platform/client/proto/r;

    if-eqz v1, :cond_3c

    new-instance v0, Lm7/t;

    new-instance v2, Lm7/r;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/r;->r()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_35
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/e0;

    invoke-virtual {v4}, Landroidx/health/platform/client/proto/e0;->t()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v13

    invoke-virtual {v4}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v5

    const-string v6, "latitude"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/g0;

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_36

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v8

    move-wide v14, v8

    goto :goto_36

    :cond_36
    move-wide v14, v6

    :goto_36
    invoke-virtual {v4}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v5

    const-string v8, "longitude"

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/g0;

    if-eqz v5, :cond_37

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v6

    :cond_37
    move-wide/from16 v16, v6

    invoke-virtual {v4}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v5

    const-string v6, "altitude"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/g0;

    if-eqz v5, :cond_38

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v5

    sget-object v7, Lr7/s;->y:Lr7/l;

    invoke-static {v5, v6}, Lr7/l;->a(D)Lr7/s;

    move-result-object v5

    move-object/from16 v20, v5

    goto :goto_37

    :cond_38
    move-object/from16 v20, v23

    :goto_37
    invoke-virtual {v4}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v5

    const-string v6, "horizontal_accuracy"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/g0;

    if-eqz v5, :cond_39

    invoke-virtual {v5}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v5

    sget-object v7, Lr7/s;->y:Lr7/l;

    invoke-static {v5, v6}, Lr7/l;->a(D)Lr7/s;

    move-result-object v5

    move-object/from16 v18, v5

    goto :goto_38

    :cond_39
    move-object/from16 v18, v23

    :goto_38
    invoke-virtual {v4}, Landroidx/health/platform/client/proto/e0;->u()Ljava/util/Map;

    move-result-object v4

    const-string v5, "vertical_accuracy"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/g0;

    if-eqz v4, :cond_3a

    invoke-virtual {v4}, Landroidx/health/platform/client/proto/g0;->w()D

    move-result-wide v4

    sget-object v6, Lr7/s;->y:Lr7/l;

    invoke-static {v4, v5}, Lr7/l;->a(D)Lr7/s;

    move-result-object v4

    move-object/from16 v19, v4

    goto :goto_39

    :cond_3a
    move-object/from16 v19, v23

    :goto_39
    new-instance v12, Lm7/q;

    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v12 .. v20}, Lm7/q;-><init>(Ljava/time/Instant;DDLr7/s;Lr7/s;Lr7/s;)V

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_35

    :cond_3b
    invoke-direct {v2, v3}, Lm7/r;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v0, v2}, Lm7/t;-><init>(Lm7/r;)V

    :goto_3a
    move-object/from16 v35, v0

    goto :goto_3b

    :cond_3c
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->W()Ljava/util/Map;

    move-result-object v0

    const-string v1, "hasRoute"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/g0;

    if-eqz v0, :cond_3d

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/g0;->u()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3d

    new-instance v0, Lm7/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_3a

    :cond_3d
    new-instance v0, Lm7/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_3a

    :goto_3b
    new-instance v24, Lm7/w;

    invoke-direct/range {v24 .. v35}, Lm7/w;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;ILjava/lang/String;Ljava/lang/String;Ln7/c;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/j;)V

    return-object v24

    :sswitch_8
    const-string v2, "CyclingPedalingCadenceSeries"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v10

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->Q()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/b0;

    new-instance v3, Lm7/l;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/b0;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "rpm"

    invoke-static {v2, v6}, Lv8/b;->t(Landroidx/health/platform/client/proto/b0;Ljava/lang/String;)D

    move-result-wide v6

    invoke-direct {v3, v6, v7, v5}, Lm7/l;-><init>(DLjava/time/Instant;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3c

    :cond_3e
    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v13

    new-instance v7, Lm7/m;

    invoke-direct/range {v7 .. v13}, Lm7/m;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v7

    :sswitch_9
    const-string v2, "WheelchairPushes"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    move-object/from16 v2, v21

    invoke-static {v0, v2}, Lv8/b;->z(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v3, Lm7/h1;

    invoke-direct/range {v3 .. v10}, Lm7/h1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v3

    :sswitch_a
    const-string v2, "ElevationGained"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "elevation"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/s;->y:Lr7/l;

    invoke-static {v1, v2}, Lr7/l;->a(D)Lr7/s;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v4, Lm7/o;

    invoke-direct/range {v4 .. v10}, Lm7/o;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/s;Ln7/c;)V

    return-object v4

    :sswitch_b
    const-string v2, "IntermenstrualBleeding"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    new-instance v1, Lm7/f0;

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lm7/f0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ln7/c;)V

    return-object v1

    :sswitch_c
    const-string v2, "StepsCadenceSeries"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v10

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->Q()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/b0;

    new-instance v3, Lm7/b1;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/b0;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, v20

    invoke-static {v2, v6}, Lv8/b;->t(Landroidx/health/platform/client/proto/b0;Ljava/lang/String;)D

    move-result-wide v13

    invoke-direct {v3, v13, v14, v5}, Lm7/b1;-><init>(DLjava/time/Instant;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_3f
    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v13

    new-instance v7, Lm7/c1;

    invoke-direct/range {v7 .. v13}, Lm7/c1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v7

    :sswitch_d
    const-string v2, "Hydration"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "volume"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v8, Lr7/w0;

    sget-object v3, Lr7/v0;->w:Lr7/t0;

    invoke-direct {v8, v1, v2, v3}, Lr7/w0;-><init>(DLr7/v0;)V

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v9

    new-instance v3, Lm7/d0;

    invoke-direct/range {v3 .. v9}, Lm7/d0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/w0;Ln7/c;)V

    return-object v3

    :sswitch_e
    move-object/from16 v6, v20

    const-string v2, "RespiratoryRate"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v6}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v10

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v12

    new-instance v7, Lm7/s0;

    invoke-direct/range {v7 .. v12}, Lm7/s0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;DLn7/c;)V

    return-object v7

    :sswitch_f
    const-string v2, "FloorsClimbed"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "floors"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v7

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v9

    new-instance v2, Lm7/x;

    invoke-direct/range {v2 .. v9}, Lm7/x;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;DLn7/c;)V

    return-object v2

    :sswitch_10
    const-string v2, "RestingHeartRate"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    move-object/from16 v2, v19

    invoke-static {v0, v2}, Lv8/b;->z(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v8

    new-instance v3, Lm7/t0;

    invoke-direct/range {v3 .. v8}, Lm7/t0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v3

    :sswitch_11
    const-string v2, "CervicalMucus"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "texture"

    sget-object v2, Lm7/k;->f:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v6

    const-string v1, "amount"

    sget-object v2, Lm7/k;->h:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v7

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v8

    new-instance v3, Lm7/k;

    invoke-direct/range {v3 .. v8}, Lm7/k;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;IILn7/c;)V

    return-object v3

    :sswitch_12
    const-string v2, "Distance"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "distance"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/s;->y:Lr7/l;

    invoke-static {v1, v2}, Lr7/l;->a(D)Lr7/s;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v4, Lm7/n;

    invoke-direct/range {v4 .. v10}, Lm7/n;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/s;Ln7/c;)V

    return-object v4

    :sswitch_13
    const-string v2, "Menstruation"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "flow"

    sget-object v2, Lm7/j0;->e:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/j0;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/j0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v4

    :sswitch_14
    const-string v2, "BasalBodyTemperature"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v7}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v7, Lr7/k0;

    invoke-direct {v7, v1, v2}, Lr7/k0;-><init>(D)V

    sget-object v1, Lm7/g;->a:Ljava/lang/Object;

    invoke-static {v0, v3, v1}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v8

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v9

    new-instance v4, Lm7/b;

    invoke-direct/range {v4 .. v9}, Lm7/b;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k0;ILn7/c;)V

    return-object v4

    :sswitch_15
    const-string v2, "ActiveCaloriesBurned"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    move-object/from16 v2, v17

    invoke-static {v0, v2}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/k;->y:Lr7/e;

    invoke-static {v1, v2}, Lr7/e;->a(D)Lr7/k;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v4, Lm7/a;

    invoke-direct/range {v4 .. v10}, Lm7/a;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k;Ln7/c;)V

    return-object v4

    :sswitch_16
    move-object/from16 v2, v21

    const-string v3, "Steps"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v2}, Lv8/b;->z(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v3, Lm7/d1;

    invoke-direct/range {v3 .. v10}, Lm7/d1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;JLn7/c;)V

    return-object v3

    :sswitch_17
    const-string v2, "BloodGlucose"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    sget-object v1, Lr7/d;->y:Ljava/util/LinkedHashMap;

    const-string v1, "level"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lds/q;->D(D)Lr7/d;

    move-result-object v6

    const-string v1, "specimenSource"

    sget-object v2, Lm7/d;->k:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v7

    sget-object v1, Lm7/i0;->a:Ljava/lang/Object;

    invoke-static {v0, v13, v1}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v8

    const-string v1, "relationToMeal"

    sget-object v2, Lm7/d;->i:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v9

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v3, Lm7/d;

    invoke-direct/range {v3 .. v10}, Lm7/d;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/d;IIILn7/c;)V

    return-object v3

    :sswitch_18
    const-string v2, "OvulationTest"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "result"

    sget-object v2, Lm7/n0;->e:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/n0;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/n0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v4

    :sswitch_19
    const-string v2, "OxygenSaturation"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v8}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v3, Lr7/c0;

    invoke-direct {v3, v1, v2}, Lr7/c0;-><init>(D)V

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/o0;

    invoke-direct {v4, v1, v2, v3, v0}, Lm7/o0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/c0;Ln7/c;)V

    return-object v4

    :sswitch_1a
    const-string v2, "BodyWaterMass"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v9}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->b(D)Lr7/b0;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/i;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/i;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v4

    :sswitch_1b
    const-string v2, "SpeedSeries"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v10

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->Q()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_40

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/b0;

    new-instance v3, Lm7/z0;

    invoke-virtual {v2}, Landroidx/health/platform/client/proto/b0;->r()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "speed"

    invoke-static {v2, v6}, Lv8/b;->t(Landroidx/health/platform/client/proto/b0;Ljava/lang/String;)D

    move-result-wide v6

    sget-object v2, Lr7/q0;->y:Lr7/l0;

    invoke-static {v6, v7}, Lr7/l0;->a(D)Lr7/q0;

    move-result-object v2

    invoke-direct {v3, v5, v2}, Lm7/z0;-><init>(Ljava/time/Instant;Lr7/q0;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3e

    :cond_40
    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v13

    new-instance v7, Lm7/a1;

    invoke-direct/range {v7 .. v13}, Lm7/a1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v7

    :sswitch_1c
    const-string v2, "BloodPressure"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "systolic"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v7, Lr7/j0;

    invoke-direct {v7, v1, v2}, Lr7/j0;-><init>(D)V

    const-string v1, "diastolic"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v8, Lr7/j0;

    invoke-direct {v8, v1, v2}, Lr7/j0;-><init>(D)V

    const-string v1, "bodyPosition"

    sget-object v2, Lm7/e;->j:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v9

    sget-object v1, Lm7/e;->h:Ljava/lang/Object;

    invoke-static {v0, v3, v1}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v10

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v11

    new-instance v4, Lm7/e;

    invoke-direct/range {v4 .. v11}, Lm7/e;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/j0;Lr7/j0;IILn7/c;)V

    return-object v4

    :sswitch_1d
    move-object/from16 v2, v17

    const-string v3, "TotalCaloriesBurned"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v2}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/k;->y:Lr7/e;

    invoke-static {v1, v2}, Lr7/e;->a(D)Lr7/k;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v10

    new-instance v4, Lm7/e1;

    invoke-direct/range {v4 .. v10}, Lm7/e1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/k;Ln7/c;)V

    return-object v4

    :sswitch_1e
    const-string v2, "SexualActivity"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "protectionUsed"

    sget-object v2, Lm7/v0;->e:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/v0;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/v0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;ILn7/c;)V

    return-object v4

    :sswitch_1f
    const-string v2, "LeanBodyMass"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0, v9}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->b(D)Lr7/b0;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/h0;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/h0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v4

    :sswitch_20
    const-string v2, "HeartRateVariabilityRmssd"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "heartRateVariability"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v2, v2, v4

    if-gez v2, :cond_41

    :goto_3f
    move-wide v9, v4

    goto :goto_40

    :cond_41
    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v2

    const-wide/high16 v4, 0x4069000000000000L    # 200.0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_42

    goto :goto_3f

    :cond_42
    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v4

    goto :goto_3f

    :goto_40
    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v7

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v11

    new-instance v6, Lm7/a0;

    invoke-direct/range {v6 .. v11}, Lm7/a0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;DLn7/c;)V

    return-object v6

    :sswitch_21
    const-string v2, "Weight"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "weight"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/b0;->y:Lr7/t;

    invoke-static {v1, v2}, Lr7/t;->b(D)Lr7/b0;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/g1;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/g1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/b0;Ln7/c;)V

    return-object v4

    :sswitch_22
    const-string v2, "Vo2Max"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "vo2"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v5

    const-string v1, "measurementMethod"

    sget-object v2, Lm7/f1;->f:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lv8/b;->J(Landroidx/health/platform/client/proto/u;Ljava/lang/String;Ljava/util/Map;)I

    move-result v7

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v8

    new-instance v2, Lm7/f1;

    invoke-direct/range {v2 .. v8}, Lm7/f1;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;DILn7/c;)V

    return-object v2

    :sswitch_23
    move-object/from16 v2, v19

    const-string v3, "HeartRateSeries"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v8

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v9

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v10

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v11

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->Q()Landroidx/health/platform/client/proto/w0;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_41
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_44

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/b0;

    new-instance v5, Lm7/y;

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/b0;->r()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/b0;->s()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/g0;

    if-eqz v3, :cond_43

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/g0;->y()J

    move-result-wide v13

    goto :goto_42

    :cond_43
    const-wide/16 v13, 0x0

    :goto_42
    invoke-direct {v5, v13, v14, v6}, Lm7/y;-><init>(JLjava/time/Instant;)V

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_44
    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v13

    new-instance v7, Lm7/z;

    invoke-direct/range {v7 .. v13}, Lm7/z;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/util/List;Ln7/c;)V

    return-object v7

    :sswitch_24
    const-string v2, "MenstruationPeriod"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    new-instance v2, Lm7/k0;

    invoke-static {v0}, Lv8/b;->C(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->D(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v4

    invoke-static {v0}, Lv8/b;->u(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v5

    invoke-static {v0}, Lv8/b;->v(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v6

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lm7/k0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ln7/c;)V

    return-object v2

    :sswitch_25
    const-string v2, "BasalMetabolicRate"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "bmr"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    new-instance v3, Lr7/h0;

    sget-object v4, Lr7/g0;->x:Lr7/e0;

    invoke-direct {v3, v1, v2, v4}, Lr7/h0;-><init>(DLr7/g0;)V

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/c;

    invoke-direct {v4, v1, v2, v3, v0}, Lm7/c;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/h0;Ln7/c;)V

    return-object v4

    :sswitch_26
    const-string v2, "Height"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    const-string v1, "height"

    invoke-static {v0, v1}, Lv8/b;->s(Landroidx/health/platform/client/proto/u;Ljava/lang/String;)D

    move-result-wide v1

    sget-object v3, Lr7/s;->y:Lr7/l;

    invoke-static {v1, v2}, Lr7/l;->a(D)Lr7/s;

    move-result-object v1

    invoke-static {v0}, Lv8/b;->F(Landroidx/health/platform/client/proto/u;)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v0}, Lv8/b;->G(Landroidx/health/platform/client/proto/u;)Ljava/time/ZoneOffset;

    move-result-object v3

    invoke-static {v0}, Lv8/b;->A(Landroidx/health/platform/client/proto/u;)Ln7/c;

    move-result-object v0

    new-instance v4, Lm7/b0;

    invoke-direct {v4, v2, v3, v1, v0}, Lm7/b0;-><init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/s;Ln7/c;)V

    return-object v4

    :cond_45
    :goto_43
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown data type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u;->J()Landroidx/health/platform/client/proto/w;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/w;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :sswitch_data_0
    .sparse-switch
        -0x7f6282b9 -> :sswitch_26
        -0x731ae5ab -> :sswitch_25
        -0x6ffaae44 -> :sswitch_24
        -0x67ae8bc3 -> :sswitch_23
        -0x670b21d5 -> :sswitch_22
        -0x65c9d168 -> :sswitch_21
        -0x5c41c7b9 -> :sswitch_20
        -0x4a795aa4 -> :sswitch_1f
        -0x45c1d177 -> :sswitch_1e
        -0x40ec9668 -> :sswitch_1d
        -0x25c129c1 -> :sswitch_1c
        -0x218bfe82 -> :sswitch_1b
        -0x217a56f7 -> :sswitch_1a
        -0x2026ea4e -> :sswitch_19
        -0x828e7f7 -> :sswitch_18
        0x8700b4 -> :sswitch_17
        0x4c7e307 -> :sswitch_16
        0x7aabe1a -> :sswitch_15
        0xb2f8d53 -> :sswitch_14
        0xeb8b01b -> :sswitch_13
        0x150bf015 -> :sswitch_12
        0x21342c4e -> :sswitch_11
        0x2d5ce678 -> :sswitch_10
        0x38ef420d -> :sswitch_f
        0x3b00f46a -> :sswitch_e
        0x3eb244d6 -> :sswitch_d
        0x4213a9a1 -> :sswitch_c
        0x4722b931 -> :sswitch_b
        0x57894cfb -> :sswitch_a
        0x581aaa52 -> :sswitch_9
        0x5951c5dd -> :sswitch_8
        0x5a3a2067 -> :sswitch_7
        0x5e77f252 -> :sswitch_6
        0x5f412e87 -> :sswitch_5
        0x667e75f7 -> :sswitch_4
        0x679c9b78 -> :sswitch_3
        0x794a17f8 -> :sswitch_2
        0x7b1a2fdf -> :sswitch_1
        0x7ce383bc -> :sswitch_0
    .end sparse-switch
.end method

.method public static final a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;JJIFLp3/r;Landroid/graphics/Typeface;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v7, p2

    move/from16 v15, p15

    const-string v0, "content"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p14

    check-cast v8, Lp1/q;

    const v0, 0x57cfac3b

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v15, 0xe

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v15

    goto :goto_1

    :cond_1
    move v0, v15

    :goto_1
    and-int/lit8 v4, v15, 0x70

    move-object/from16 v9, p1

    if-nez v4, :cond_3

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v15, 0x380

    if-nez v4, :cond_5

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v15, 0x1c00

    move-wide/from16 v10, p3

    if-nez v4, :cond_7

    invoke-virtual {v8, v10, v11}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v0, v4

    :cond_7
    const v12, 0xe000

    and-int v4, v15, v12

    move-wide/from16 v13, p5

    if-nez v4, :cond_9

    invoke-virtual {v8, v13, v14}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v0, v4

    :cond_9
    const/high16 v16, 0x70000

    and-int v4, v15, v16

    if-nez v4, :cond_b

    move/from16 v4, p7

    invoke-virtual {v8, v4}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v5, 0x10000

    :goto_6
    or-int/2addr v0, v5

    goto :goto_7

    :cond_b
    move/from16 v4, p7

    :goto_7
    const/high16 v17, 0x380000

    and-int v5, v15, v17

    if-nez v5, :cond_d

    move/from16 v5, p8

    invoke-virtual {v8, v5}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v6, 0x80000

    :goto_8
    or-int/2addr v0, v6

    goto :goto_9

    :cond_d
    move/from16 v5, p8

    :goto_9
    const/high16 v6, 0x1c00000

    and-int/2addr v6, v15

    if-nez v6, :cond_f

    move-object/from16 v6, p9

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    const/high16 v18, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v18, 0x400000

    :goto_a
    or-int v0, v0, v18

    goto :goto_b

    :cond_f
    move-object/from16 v6, p9

    :goto_b
    move/from16 p14, v12

    move/from16 v12, p16

    and-int/lit16 v2, v12, 0x200

    if-eqz v2, :cond_10

    const/high16 v19, 0x30000000

    or-int v0, v0, v19

    move-wide/from16 v3, p11

    move/from16 v20, v0

    const/16 v19, 0x2

    :goto_c
    move-object/from16 v0, p13

    goto :goto_f

    :cond_10
    const/high16 v19, 0x70000000

    and-int v19, v15, v19

    move-wide/from16 v3, p11

    if-nez v19, :cond_12

    const/16 v19, 0x2

    invoke-virtual {v8, v3, v4}, Lp1/q;->f(J)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x20000000

    goto :goto_d

    :cond_11
    const/high16 v20, 0x10000000

    :goto_d
    or-int v0, v0, v20

    :goto_e
    move/from16 v20, v0

    goto :goto_c

    :cond_12
    const/16 v19, 0x2

    goto :goto_e

    :goto_f
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/16 v18, 0x4

    goto :goto_10

    :cond_13
    move/from16 v18, v19

    :goto_10
    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v21, v15, 0x1

    if-eqz v21, :cond_16

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v21

    if-eqz v21, :cond_14

    goto :goto_11

    :cond_14
    invoke-virtual {v8}, Lp1/q;->X()V

    :cond_15
    move-wide v2, v3

    goto :goto_12

    :cond_16
    :goto_11
    if-eqz v2, :cond_15

    const-wide/16 v2, 0x0

    :goto_12
    invoke-virtual {v8}, Lp1/q;->r()V

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_17

    if-ne v0, v1, :cond_18

    :cond_17
    const-string v0, ""

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v0, Lp1/c1;

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    move-object/from16 p11, v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_19

    if-ne v0, v1, :cond_21

    :cond_19
    invoke-static/range {v19 .. v19}, Le4/p;->f(I)[I

    move-result-object v0

    array-length v1, v0

    const/4 v4, 0x0

    :goto_13
    if-ge v4, v1, :cond_1d

    move-object/from16 v21, v0

    aget v0, v21, v4

    move/from16 v22, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1b

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1a

    const-string v1, "none"

    goto :goto_14

    :cond_1a
    const/4 v0, 0x0

    throw v0

    :cond_1b
    const-string v1, "typewriter"

    :goto_14
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    move v4, v0

    goto :goto_15

    :cond_1c
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v21

    move/from16 v1, v22

    goto :goto_13

    :cond_1d
    const/4 v4, 0x0

    :goto_15
    if-nez v4, :cond_1e

    goto :goto_16

    :cond_1e
    move/from16 v19, v4

    :goto_16
    invoke-static/range {v19 .. v19}, Le4/p;->e(I)I

    move-result v0

    if-eqz v0, :cond_20

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1f

    new-instance v0, Lpj/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_17

    :cond_1f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_20
    new-instance v0, Lpj/j0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_17
    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v0, Lpj/b0;

    move-wide v1, v2

    move-object v3, v0

    new-instance v0, Lf0/c;

    const/4 v6, 0x0

    move-object/from16 v4, p0

    move-object/from16 v5, p11

    invoke-direct/range {v0 .. v6}, Lf0/c;-><init>(JLpj/b0;Ljava/lang/String;Lp1/c1;Lq83/d;)V

    move-wide v12, v1

    move-object v1, v4

    invoke-static {v8, v0, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v0, v3, Lpj/o;

    if-eqz v0, :cond_22

    move-object v0, v1

    goto :goto_18

    :cond_22
    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_18
    const/high16 v2, 0x1000000

    and-int/lit8 v3, v20, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v3, v20, 0x3

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v2, v4

    and-int v4, v3, p14

    or-int/2addr v2, v4

    and-int v4, v3, v16

    or-int/2addr v2, v4

    and-int v3, v3, v17

    or-int/2addr v2, v3

    shl-int/lit8 v3, v18, 0x18

    const/high16 v4, 0xe000000

    and-int/2addr v3, v4

    or-int v28, v2, v3

    move-wide/from16 v20, p5

    move/from16 v22, p7

    move/from16 v23, p8

    move-object/from16 v24, p9

    move-object/from16 v25, p10

    move-object/from16 v26, p13

    move-object/from16 v16, v0

    move-object/from16 v27, v8

    move-object/from16 v17, v9

    move-wide/from16 v18, v10

    invoke-static/range {v16 .. v28}, Lvd/e;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJIFLp3/r;Landroid/graphics/Typeface;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_23

    return-void

    :cond_23
    move-object v2, v0

    new-instance v0, Lpj/c;

    move-wide/from16 v4, p3

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v14, p13

    move/from16 v16, p16

    move-object/from16 v29, v2

    move-object v3, v7

    move-object/from16 v2, p1

    move-wide/from16 v6, p5

    invoke-direct/range {v0 .. v16}, Lpj/c;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;JJIFLp3/r;Landroid/graphics/Typeface;JLkotlin/jvm/functions/Function1;II)V

    move-object/from16 v2, v29

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final b(Ll3/g;JLl3/v0;Landroidx/compose/ui/Modifier;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v5, p4

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object/from16 v0, p11

    check-cast v0, Lp1/q;

    const v1, -0x74686388

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v12, 0x6

    move-object/from16 v13, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_1
    move v1, v12

    :goto_1
    and-int/lit8 v2, v12, 0x30

    if-nez v2, :cond_3

    move-wide/from16 v2, p1

    invoke-virtual {v0, v2, v3}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_3

    :cond_3
    move-wide/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p3

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    goto :goto_5

    :cond_5
    move-object/from16 v4, p3

    :goto_5
    and-int/lit16 v6, v12, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_6

    :cond_6
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    :cond_7
    and-int/lit16 v6, v12, 0x6000

    if-nez v6, :cond_9

    move-object/from16 v6, p5

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_7

    :cond_8
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v1, v7

    goto :goto_8

    :cond_9
    move-object/from16 v6, p5

    :goto_8
    const/high16 v7, 0x6db0000

    or-int/2addr v1, v7

    const/high16 v7, 0x30000000

    and-int/2addr v7, v12

    const/high16 v8, 0x20000000

    if-nez v7, :cond_b

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move v7, v8

    goto :goto_9

    :cond_a
    const/high16 v7, 0x10000000

    :goto_9
    or-int/2addr v1, v7

    :cond_b
    const v7, 0x12492493

    and-int/2addr v7, v1

    const v9, 0x12492492

    if-ne v7, v9, :cond_d

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_a

    :cond_c
    invoke-virtual {v0}, Lp1/q;->X()V

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v19, v0

    goto/16 :goto_d

    :cond_d
    :goto_a
    const v7, -0x45160788

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_e

    new-instance v7, Lov2/f;

    const/16 v10, 0x15

    invoke-direct {v7, v10}, Lov2/f;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const v10, -0x45160016

    const/4 v14, 0x0

    invoke-static {v10, v0, v14}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v10

    const/4 v15, 0x0

    if-ne v10, v9, :cond_f

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v10, Lp1/c1;

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    const v14, -0x4515efb6

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    const/high16 v14, 0x70000000

    and-int/2addr v14, v1

    const/16 v29, 0x1

    if-ne v14, v8, :cond_10

    move/from16 v8, v29

    goto :goto_b

    :cond_10
    const/4 v8, 0x0

    :goto_b
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v8, :cond_11

    if-ne v14, v9, :cond_12

    :cond_11
    new-instance v14, Ln43/a;

    const/4 v8, 0x7

    invoke-direct {v14, v10, v11, v15, v8}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v14, Lc93/m;

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v11, v14}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-interface {v5, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v30

    const/16 v27, 0x0

    const v28, 0xfffffe

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    move-wide v15, v2

    move-object v14, v4

    invoke-static/range {v14 .. v28}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v2

    const v3, -0x451572fe

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const/high16 v3, 0xe000000

    and-int v4, v1, v3

    const/high16 v14, 0x4000000

    if-ne v4, v14, :cond_13

    move/from16 v14, v29

    goto :goto_c

    :cond_13
    move v14, v8

    :goto_c
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_14

    if-ne v4, v9, :cond_15

    :cond_14
    new-instance v4, Lb30/r;

    const/16 v9, 0x1d

    invoke-direct {v4, v10, v7, v9}, Lb30/r;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v16, v4

    check-cast v16, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    and-int/lit8 v4, v1, 0xe

    const v8, 0xe000

    shr-int/lit8 v9, v1, 0x6

    and-int/2addr v8, v9

    or-int/2addr v4, v8

    const/high16 v8, 0x70000

    and-int/2addr v8, v1

    or-int/2addr v4, v8

    shr-int/lit8 v8, v1, 0x3

    const/high16 v9, 0x380000

    and-int/2addr v8, v9

    or-int/2addr v4, v8

    shl-int/lit8 v1, v1, 0xc

    and-int/2addr v1, v3

    or-int v20, v4, v1

    const/16 v17, 0x0

    move-object/from16 v19, v0

    move-object v15, v2

    move-object/from16 v18, v6

    move-object/from16 v14, v30

    invoke-static/range {v13 .. v20}, Lq83/g;->c(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;ILjava/util/Map;Landroidx/compose/runtime/Composer;I)V

    const v0, 0x7fffffff

    move v9, v0

    move-object v10, v7

    move/from16 v7, v29

    move v8, v7

    :goto_d
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_16

    new-instance v0, Lf41/m;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v12}, Lf41/m;-><init>(Ll3/g;JLl3/v0;Landroidx/compose/ui/Modifier;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "modifier"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x1dc19e1d

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v3, v3, 0x3

    if-ne v3, v4, :cond_3

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v24, v2

    goto :goto_3

    :cond_3
    :goto_2
    const-string v3, "default_payment_method_label"

    invoke-static {v0, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v3, 0x7f141113

    invoke-static {v2, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v5

    iget-object v6, v5, Lg1/h9;->l:Ll3/v0;

    sget-object v11, Lp3/r;->G:Lp3/r;

    const/16 v19, 0x0

    const v20, 0xfffffb

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v6 .. v20}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v23

    invoke-static {v2}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v5

    iget-wide v5, v5, Ld40/n;->g:J

    const/16 v26, 0xc30

    const v27, 0xd7f8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lau1/f;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, v0, v1, v4, v5}, Lau1/f;-><init>(Landroidx/compose/ui/Modifier;IIB)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 42

    move-object/from16 v0, p0

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v1, "html"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v1, -0x95e229

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :goto_3
    and-int/lit8 v4, v12, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :goto_5
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_9

    move-wide/from16 v6, p3

    invoke-virtual {v9, v6, v7}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_6

    :cond_8
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    goto :goto_7

    :cond_9
    move-wide/from16 v6, p3

    :goto_7
    and-int/lit16 v8, v11, 0x6000

    if-nez v8, :cond_b

    move-object/from16 v8, p5

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x4000

    goto :goto_8

    :cond_a
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v1, v10

    goto :goto_9

    :cond_b
    move-object/from16 v8, p5

    :goto_9
    and-int/lit8 v10, v12, 0x20

    const/high16 v14, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v1, v14

    :cond_c
    move/from16 v14, p6

    goto :goto_b

    :cond_d
    and-int/2addr v14, v11

    if-nez v14, :cond_c

    move/from16 v14, p6

    invoke-virtual {v9, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v1, v15

    :goto_b
    and-int/lit8 v15, v12, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_f

    or-int v1, v1, v16

    move-object/from16 v13, p7

    goto :goto_d

    :cond_f
    and-int v16, v11, v16

    move-object/from16 v13, p7

    if-nez v16, :cond_11

    invoke-virtual {v9, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_10
    const/high16 v16, 0x80000

    :goto_c
    or-int v1, v1, v16

    :cond_11
    :goto_d
    const/high16 v16, 0xc00000

    and-int v16, v11, v16

    if-nez v16, :cond_14

    and-int/lit16 v0, v12, 0x80

    if-nez v0, :cond_12

    move/from16 v0, p8

    invoke-virtual {v9, v0}, Lp1/q;->e(I)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_12
    move/from16 v0, p8

    :cond_13
    const/high16 v16, 0x400000

    :goto_e
    or-int v1, v1, v16

    goto :goto_f

    :cond_14
    move/from16 v0, p8

    :goto_f
    and-int/lit16 v0, v12, 0x100

    move/from16 v16, v0

    const/high16 v17, 0x6000000

    if-eqz v16, :cond_15

    or-int v1, v1, v17

    move-object/from16 v0, p9

    goto :goto_11

    :cond_15
    and-int v17, v11, v17

    move-object/from16 v0, p9

    if-nez v17, :cond_17

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_16
    const/high16 v18, 0x2000000

    :goto_10
    or-int v1, v1, v18

    :cond_17
    :goto_11
    const v18, 0x2492493

    and-int v0, v1, v18

    move/from16 v18, v1

    const v1, 0x2492492

    if-ne v0, v1, :cond_19

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_13

    :cond_18
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v10, p9

    move-object v2, v3

    move-object v3, v5

    move-object v0, v9

    move-object v8, v13

    move/from16 v9, p8

    :goto_12
    move v7, v14

    goto/16 :goto_1c

    :cond_19
    :goto_13
    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v0, v11, 0x1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    const v19, -0x1c00001

    move/from16 v20, v0

    const/4 v0, 0x0

    const/16 v21, 0x1

    if-eqz v20, :cond_1c

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v20

    if-eqz v20, :cond_1a

    goto :goto_15

    :cond_1a
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit16 v2, v12, 0x80

    if-eqz v2, :cond_1b

    and-int v2, v18, v19

    move/from16 v7, p8

    move/from16 v18, v2

    :goto_14
    move-object v2, v5

    move-object v6, v13

    move-object/from16 v13, p9

    goto/16 :goto_19

    :cond_1b
    move/from16 v7, p8

    goto :goto_14

    :cond_1c
    :goto_15
    if-eqz v2, :cond_1d

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v3, v2

    :cond_1d
    if-eqz v4, :cond_1e

    sget-object v2, Lm83/z;->w:Lm83/z;

    move-object v5, v2

    :cond_1e
    if-eqz v10, :cond_1f

    move/from16 v14, v21

    :cond_1f
    if-eqz v15, :cond_20

    new-instance v22, Ll3/m0;

    const/16 v40, 0x0

    const v41, 0xefff

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    sget-object v39, Lw3/l;->c:Lw3/l;

    invoke-direct/range {v22 .. v41}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    goto :goto_16

    :cond_20
    move-object/from16 v22, v13

    :goto_16
    and-int/lit16 v2, v12, 0x80

    if-eqz v2, :cond_21

    and-int v2, v18, v19

    move/from16 v18, v2

    move/from16 v2, v21

    goto :goto_17

    :cond_21
    move/from16 v2, p8

    :goto_17
    if-eqz v16, :cond_23

    const v4, -0x7d467f1a

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_22

    new-instance v4, Lou1/a;

    const/4 v10, 0x7

    invoke-direct {v4, v10}, Lou1/a;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v4, Lc93/a;

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move v7, v2

    move-object v13, v4

    :goto_18
    move-object v2, v5

    move-object/from16 v6, v22

    goto :goto_19

    :cond_23
    move-object/from16 v13, p9

    move v7, v2

    goto :goto_18

    :goto_19
    invoke-virtual {v9}, Lp1/q;->r()V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const v5, -0x7d466470

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    const/high16 v5, 0x70000

    and-int v10, v18, v5

    const/high16 v15, 0x20000

    if-ne v10, v15, :cond_24

    move/from16 v10, v21

    goto :goto_1a

    :cond_24
    move v10, v0

    :goto_1a
    const/high16 v15, 0xe000000

    and-int v15, v18, v15

    move/from16 p1, v5

    const/high16 v5, 0x4000000

    if-ne v15, v5, :cond_25

    goto :goto_1b

    :cond_25
    move/from16 v21, v0

    :goto_1b
    or-int v5, v10, v21

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_26

    if-ne v10, v1, :cond_27

    :cond_26
    new-instance v10, Lam2/i0;

    const/16 v1, 0xa

    invoke-direct {v10, v14, v13, v4, v1}, Lam2/i0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    const v0, 0xfffe

    and-int v0, v18, v0

    shr-int/lit8 v1, v18, 0x3

    and-int v4, v1, p1

    or-int/2addr v0, v4

    const/high16 v4, 0x380000

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    move-object v1, v3

    move-object v5, v8

    move-object v8, v10

    move-wide/from16 v3, p3

    move v10, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v10}, Lup/d;->e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;Ll3/m0;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v2

    move-object v8, v6

    move-object v0, v9

    move-object v10, v13

    move-object v2, v1

    move v9, v7

    goto/16 :goto_12

    :goto_1c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_28

    new-instance v0, Lf41/m;

    move-object/from16 v1, p0

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v12}, Lf41/m;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method public static final e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;Ll3/m0;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v10, p5

    move/from16 v8, p7

    move-object/from16 v7, p8

    move/from16 v9, p10

    const-string v1, "html"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p9

    check-cast v3, Lp1/q;

    const v1, 0x22ce487a

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v2, v9, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v9, 0x180

    if-nez v2, :cond_5

    move-object/from16 v2, p2

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    goto :goto_4

    :cond_5
    move-object/from16 v2, p2

    :goto_4
    and-int/lit16 v4, v9, 0xc00

    move-wide/from16 v13, p3

    if-nez v4, :cond_7

    invoke-virtual {v3, v13, v14}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_5

    :cond_6
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v1, v4

    :cond_7
    and-int/lit16 v4, v9, 0x6000

    if-nez v4, :cond_9

    invoke-virtual {v3, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_6

    :cond_8
    const/16 v4, 0x2000

    :goto_6
    or-int/2addr v1, v4

    :cond_9
    const/high16 v4, 0x30000

    and-int/2addr v4, v9

    if-nez v4, :cond_b

    move-object/from16 v4, p6

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v5, 0x10000

    :goto_7
    or-int/2addr v1, v5

    goto :goto_8

    :cond_b
    move-object/from16 v4, p6

    :goto_8
    const/high16 v5, 0x180000

    and-int/2addr v5, v9

    if-nez v5, :cond_d

    invoke-virtual {v3, v8}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v5, 0x80000

    :goto_9
    or-int/2addr v1, v5

    :cond_d
    const/high16 v5, 0xc00000

    and-int/2addr v5, v9

    if-nez v5, :cond_f

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v5, 0x400000

    :goto_a
    or-int/2addr v1, v5

    :cond_f
    move/from16 v19, v1

    const v1, 0x492493

    and-int v1, v19, v1

    const v5, 0x492492

    if-ne v1, v5, :cond_11

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_b

    :cond_10
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v8, v3

    goto/16 :goto_1e

    :cond_11
    :goto_b
    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v1, v9, 0x1

    if-eqz v1, :cond_13

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_13
    :goto_c
    invoke-virtual {v3}, Lp1/q;->r()V

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    and-int/lit8 v5, v19, 0xe

    shr-int/lit8 v16, v19, 0x3

    and-int/lit8 v15, v16, 0x70

    or-int/2addr v5, v15

    shr-int/lit8 v12, v19, 0x9

    and-int/lit16 v11, v12, 0x380

    or-int/2addr v5, v11

    move v4, v5

    const/4 v5, 0x0

    move-object v11, v1

    move-object v1, v2

    move-object/from16 v2, p6

    invoke-static/range {v0 .. v5}, Lup/d;->n(Ljava/lang/String;Ljava/util/Map;Ll3/m0;Landroidx/compose/runtime/Composer;II)Ll3/g;

    move-result-object v4

    move-object v0, v3

    const v1, -0xcfa68f0

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_14

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v1, Lp1/c1;

    const v3, -0xcfa60c1

    const/4 v5, 0x0

    invoke-static {v3, v0, v5}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_15

    new-instance v3, Lm40/w;

    const/16 v5, 0xe

    invoke-direct {v3, v11, v5}, Lm40/w;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v11, v3

    check-cast v11, Lm40/w;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/util/Map$Entry;

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v22, v1

    move-object/from16 v1, v21

    check-cast v1, Lp40/a;

    instance-of v1, v1, Lp40/a;

    if-eqz v1, :cond_16

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v2

    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, v21

    :cond_16
    move-object/from16 v1, v22

    goto :goto_d

    :cond_17
    move-object/from16 v22, v1

    move-object/from16 v21, v2

    shr-int/lit8 v1, v19, 0x6

    const v2, 0x42095cf3

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lm83/g0;->W(I)I

    move-result v5

    const/16 v3, 0x10

    if-ge v5, v3, :cond_18

    const/16 v5, 0x10

    :cond_18
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_e
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp40/a;

    move/from16 v24, v1

    iget v1, v2, Lp40/a;->a:I

    move-object/from16 v25, v2

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    invoke-virtual {v1}, Ln2/a;->h()J

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Lh2/e;->c(J)F

    move-result v18

    invoke-virtual {v1}, Ln2/a;->h()J

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Lh2/e;->e(J)F

    move-result v26

    iget-object v2, v10, Ll3/v0;->a:Ll3/m0;

    move-object/from16 v28, v0

    move-object/from16 v29, v1

    iget-wide v0, v2, Ll3/m0;->b:J

    div-float v2, v26, v18

    invoke-static {v0, v1}, Lv63/c;->a(J)V

    const-wide v30, 0xff00000000L

    move-object/from16 v26, v3

    move-object/from16 v18, v4

    and-long v3, v0, v30

    invoke-static {v0, v1, v3, v4, v2}, Ld13/a;->d(JJF)J

    move-result-wide v2

    new-instance v4, Lu0/j0;

    move-object/from16 v30, v4

    move-wide/from16 v34, v2

    move-wide v3, v0

    move-wide/from16 v1, v34

    new-instance v0, Ll3/d0;

    move-object v13, v5

    move v5, v8

    move-object/from16 v20, v18

    move-object/from16 v33, v21

    move-object/from16 v10, v22

    move/from16 v32, v24

    move-object/from16 v14, v25

    move-object/from16 v7, v26

    move-object/from16 v8, v28

    move-object/from16 v6, v29

    const/16 v9, 0xa

    move-object/from16 v18, v11

    move-object/from16 v11, v30

    invoke-direct/range {v0 .. v5}, Ll3/d0;-><init>(JJI)V

    new-instance v1, Ld30/b0;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v6, v14}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x1035d5a2

    invoke-static {v2, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-direct {v11, v0, v1}, Lu0/j0;-><init>(Ll3/d0;Lx1/b;)V

    invoke-interface {v7, v13, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, p1

    move-wide/from16 v13, p3

    move/from16 v9, p10

    move-object v3, v7

    move-object v0, v8

    move-object/from16 v11, v18

    move-object/from16 v4, v20

    move/from16 v1, v32

    move-object/from16 v10, p5

    move-object/from16 v7, p8

    move v8, v5

    goto/16 :goto_e

    :cond_19
    move/from16 v32, v1

    move-object v7, v3

    move-object/from16 v20, v4

    move v5, v8

    move-object/from16 v18, v11

    move-object/from16 v33, v21

    move-object/from16 v10, v22

    const/4 v2, 0x0

    const/16 v9, 0xa

    move-object v8, v0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp40/a;

    goto :goto_f

    :cond_1a
    const v1, 0x72c0e48a

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v3, 0x10

    if-ge v1, v3, :cond_1b

    move v11, v3

    goto :goto_10

    :cond_1b
    move v11, v1

    :goto_10
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_32

    const v0, -0xcf9f2e3

    const/4 v2, 0x0

    invoke-static {v0, v8, v2}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v3, v33

    if-ne v0, v3, :cond_1c

    new-instance v0, Lo0/i;

    const/4 v4, 0x4

    invoke-direct {v0, v4, v10}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v14, v0

    check-cast v14, Lc93/a;

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    or-int/lit16 v0, v15, 0x6000

    and-int/lit16 v4, v12, 0x1c00

    or-int/2addr v0, v4

    const v4, -0x6f0fcf9e

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    move-object/from16 v4, v20

    iget-object v6, v4, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v2, v6}, Ll3/g;->b(II)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    check-cast v11, Ll3/e;

    iget-object v11, v11, Ll3/e;->a:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    const-string v13, "<this>"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lm40/e;->y:Lt83/b;

    if-eqz v13, :cond_1e

    invoke-virtual {v13}, Lm83/a;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_1e

    :cond_1d
    move-object/from16 v17, v2

    goto :goto_14

    :cond_1e
    invoke-virtual {v13}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_12
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lm40/e;

    iget-object v15, v15, Lm40/e;->w:Ljava/util/List;

    check-cast v15, Ljava/lang/Iterable;

    instance-of v9, v15, Ljava/util/Collection;

    if-eqz v9, :cond_20

    move-object v9, v15

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_20

    :cond_1f
    move-object/from16 v17, v2

    goto :goto_15

    :cond_20
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_13
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v2

    const/4 v2, 0x1

    invoke-static {v11, v15, v2}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v15

    if-eqz v15, :cond_22

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    :goto_14
    move-object/from16 v2, v17

    goto :goto_11

    :cond_22
    move-object/from16 v2, v17

    goto :goto_13

    :goto_15
    move-object/from16 v2, v17

    goto :goto_12

    :cond_23
    const v2, -0x717be993

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_24

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v13, v2

    check-cast v13, Lec3/p1;

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v8, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    const v6, -0x717bd484

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2a

    const v6, -0x717bcc2f

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v15, v18

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    and-int/lit16 v9, v0, 0x1c00

    xor-int/lit16 v9, v9, 0xc00

    const/16 v11, 0x800

    if-le v9, v11, :cond_25

    invoke-virtual {v8, v5}, Lp1/q;->e(I)Z

    move-result v9

    if-nez v9, :cond_26

    :cond_25
    and-int/lit16 v0, v0, 0xc00

    if-ne v0, v11, :cond_27

    :cond_26
    const/4 v0, 0x1

    goto :goto_16

    :cond_27
    const/4 v0, 0x0

    :goto_16
    or-int/2addr v0, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_29

    if-ne v6, v3, :cond_28

    goto :goto_17

    :cond_28
    const/high16 v0, 0x800000

    goto :goto_18

    :cond_29
    :goto_17
    new-instance v11, Lp40/d;

    const/16 v18, 0x0

    move-object/from16 v16, v2

    move/from16 v17, v5

    const/high16 v0, 0x800000

    invoke-direct/range {v11 .. v18}, Lp40/d;-><init>(Ljava/util/ArrayList;Lec3/p1;Lc93/a;Lm40/w;Ly3/c;ILq83/d;)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v11

    :goto_18
    check-cast v6, Lc93/m;

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-static {v8, v6, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_19

    :cond_2a
    const/high16 v0, 0x800000

    const/4 v2, 0x0

    :goto_19
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-static {v13, v8, v2}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2c

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_2b

    goto :goto_1a

    :cond_2b
    move-object/from16 v6, p1

    goto/16 :goto_1e

    :cond_2c
    :goto_1a
    const v5, -0xcf9cc50

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_2d

    new-instance v5, Lov2/f;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Lov2/f;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    move-object/from16 v6, p1

    const/4 v9, 0x1

    invoke-static {v6, v9, v5}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v7, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-static {v1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v12

    const v1, -0xcf9b370

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x1c00000

    and-int v1, v19, v1

    if-ne v1, v0, :cond_2e

    move v5, v9

    goto :goto_1b

    :cond_2e
    const/4 v5, 0x0

    :goto_1b
    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_30

    if-ne v1, v3, :cond_2f

    goto :goto_1c

    :cond_2f
    move-object/from16 v7, p8

    goto :goto_1d

    :cond_30
    :goto_1c
    new-instance v1, Lnq0/m;

    const/16 v0, 0x14

    move-object/from16 v7, p8

    invoke-direct {v1, v0, v7, v4}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    move-object/from16 v17, v1

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move/from16 v0, v32

    and-int/lit16 v0, v0, 0x3f0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v10, p5

    move/from16 v19, v0

    move-object v7, v4

    move-object/from16 v18, v8

    move-wide/from16 v8, p3

    invoke-static/range {v7 .. v19}, Lup/d;->b(Ll3/g;JLl3/v0;Landroidx/compose/ui/Modifier;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v8, v18

    :goto_1e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_31

    new-instance v0, Lm81/c;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move-object v2, v6

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v10}, Lm81/c;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;Ll3/m0;ILkotlin/jvm/functions/Function1;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void

    :cond_32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_33

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v8, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    const/4 v0, 0x0

    throw v0

    :cond_33
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public static final f(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 24

    move/from16 v2, p1

    move-object/from16 v8, p8

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    const v0, 0x1b60070e

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v2, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v2

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    and-int/lit8 v3, p2, 0x2

    move-wide/from16 v5, p3

    if-nez v3, :cond_2

    invoke-virtual {v14, v5, v6}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    and-int/lit8 v3, p2, 0x4

    const/16 v7, 0x100

    move-wide/from16 v9, p5

    if-nez v3, :cond_3

    invoke-virtual {v14, v9, v10}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v7

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    and-int/lit8 v3, p2, 0x8

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0xc00

    :cond_4
    move/from16 v12, p0

    goto :goto_5

    :cond_5
    and-int/lit16 v12, v2, 0xc00

    if-nez v12, :cond_4

    move/from16 v12, p0

    invoke-virtual {v14, v12}, Lp1/q;->d(F)Z

    move-result v13

    if-eqz v13, :cond_6

    const/16 v13, 0x800

    goto :goto_4

    :cond_6
    const/16 v13, 0x400

    :goto_4
    or-int/2addr v0, v13

    :goto_5
    and-int/lit16 v13, v0, 0x493

    const/16 v15, 0x492

    if-ne v13, v15, :cond_8

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {v14}, Lp1/q;->X()V

    move-wide v4, v5

    move-wide v6, v9

    move v1, v12

    goto/16 :goto_e

    :cond_8
    :goto_6
    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v13, v2, 0x1

    const/4 v15, 0x6

    const/4 v4, 0x0

    if-eqz v13, :cond_c

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v3, p2, 0x2

    if-eqz v3, :cond_a

    and-int/lit8 v0, v0, -0x71

    :cond_a
    and-int/lit8 v3, p2, 0x4

    if-eqz v3, :cond_b

    and-int/lit16 v0, v0, -0x381

    :cond_b
    move-wide/from16 v19, v9

    move/from16 v18, v12

    goto :goto_8

    :cond_c
    :goto_7
    and-int/lit8 v13, p2, 0x2

    const v11, -0x1a6f7841

    if-eqz v13, :cond_d

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/b;

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    iget-wide v5, v5, Lg00/b;->y:J

    and-int/lit8 v0, v0, -0x71

    :cond_d
    and-int/lit8 v13, p2, 0x4

    if-eqz v13, :cond_e

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v9, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v14, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg00/b;

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    iget-wide v9, v9, Lg00/b;->d:J

    and-int/lit16 v0, v0, -0x381

    :cond_e
    if-eqz v3, :cond_b

    int-to-float v3, v15

    move/from16 v18, v3

    move-wide/from16 v19, v9

    :goto_8
    invoke-virtual {v14}, Lp1/q;->r()V

    const/4 v3, 0x0

    const/4 v9, 0x1

    move v10, v9

    invoke-static {v3, v14, v10}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v9

    const/16 v11, 0x4b0

    invoke-static {v11, v4, v3, v15}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    sget-object v11, Ld0/v0;->w:Ld0/v0;

    invoke-static {v3, v11, v1}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v12

    const/16 v15, 0x11b8

    const/16 v1, 0x800

    const/16 v16, 0x8

    move v3, v10

    const/4 v10, 0x0

    const/high16 v11, 0x43b40000    # 360.0f

    const/4 v13, 0x0

    move-wide/from16 v3, v19

    invoke-static/range {v9 .. v16}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v9

    const v10, 0x7f0197fb

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    and-int/lit16 v10, v0, 0x1c00

    if-ne v10, v1, :cond_f

    const/4 v1, 0x1

    goto :goto_9

    :cond_f
    const/4 v1, 0x0

    :goto_9
    and-int/lit16 v10, v0, 0x380

    xor-int/lit16 v10, v10, 0x180

    if-le v10, v7, :cond_10

    invoke-virtual {v14, v3, v4}, Lp1/q;->f(J)Z

    move-result v10

    if-nez v10, :cond_11

    :cond_10
    and-int/lit16 v10, v0, 0x180

    if-ne v10, v7, :cond_12

    :cond_11
    const/4 v7, 0x1

    goto :goto_a

    :cond_12
    const/4 v7, 0x0

    :goto_a
    or-int/2addr v1, v7

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v1, v7

    and-int/lit8 v7, v0, 0x70

    xor-int/lit8 v7, v7, 0x30

    const/16 v10, 0x20

    if-le v7, v10, :cond_13

    invoke-virtual {v14, v5, v6}, Lp1/q;->f(J)Z

    move-result v7

    if-nez v7, :cond_14

    :cond_13
    and-int/lit8 v7, v0, 0x30

    if-ne v7, v10, :cond_15

    :cond_14
    const/4 v7, 0x1

    goto :goto_b

    :cond_15
    const/4 v7, 0x0

    :goto_b
    or-int/2addr v1, v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_17

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v7, v1, :cond_16

    goto :goto_c

    :cond_16
    move-wide/from16 v21, v5

    goto :goto_d

    :cond_17
    :goto_c
    new-instance v17, Lg1/t4;

    move-wide/from16 v19, v3

    move-wide/from16 v21, v5

    move-object/from16 v23, v9

    invoke-direct/range {v17 .. v23}, Lg1/t4;-><init>(FJJLd0/j0;)V

    move-object/from16 v7, v17

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {v8, v7, v14, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-wide v6, v3

    move/from16 v1, v18

    move-wide/from16 v4, v21

    :goto_e
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_18

    new-instance v0, Lh00/g0;

    move/from16 v3, p2

    invoke-direct/range {v0 .. v8}, Lh00/g0;-><init>(FIIJJLandroidx/compose/ui/Modifier;)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lp1/t1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    sget-object v0, Lz0/h;->a:Lx1/b;

    check-cast p3, Lp1/q;

    const v1, -0x2a95dc91

    invoke-virtual {p3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-virtual {p3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, p4, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v1, 0x493

    const/16 v3, 0x492

    if-eq v2, v3, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {p3, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_9

    sget-object v2, Lp1/v0;->y:Lp1/v0;

    new-instance v3, Lp1/k1;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v2}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    invoke-virtual {p3, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_9
    move-object v5, v2

    check-cast v5, Lp1/c1;

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v0, p3, v1}, Lup/d;->o(Lx1/b;Landroidx/compose/runtime/Composer;I)Lb1/c;

    move-result-object v7

    invoke-virtual {p1, v7}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v3, Lb1/d;

    const/4 v8, 0x0

    move-object v4, p0

    move-object v6, p2

    invoke-direct/range {v3 .. v8}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p0, 0x1059082f

    invoke-static {p0, p3, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p0

    const/16 p2, 0x38

    invoke-static {v0, p0, p3, p2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_a
    move-object v4, p0

    move-object v6, p2

    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_b

    new-instance p2, Lj;

    invoke-direct {p2, v4, p1, v6, p4}, Lj;-><init>(Landroidx/compose/ui/Modifier;Lp1/t1;Lx1/b;I)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static h(Lc53/a;Lq83/j;I)Lc53/a;
    .locals 1

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    invoke-static {}, Lc53/c;->a()Lc53/a;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p1, Lq83/k;->w:Lq83/k;

    :cond_1
    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lc53/a;

    invoke-direct {p2, p0, p1}, Lc53/a;-><init>(Lc53/a;Lq83/j;)V

    return-object p2
.end method

.method public static final i(Ljava/util/Collection;)Ljava/lang/Double;
    .locals 5

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Number"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    add-double/2addr v1, v3

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    int-to-double v3, p0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/lang/String;Ljava/util/Map;)Lstream/video/sfu/models/Codec;
    .locals 10

    if-eqz p0, :cond_4

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/webrtc/RTCStats;

    if-eqz p0, :cond_4

    invoke-static {p0}, Lds/p;->S(Lorg/webrtc/RTCStats;)Ln33/b;

    move-result-object p0

    iget-object p1, p0, Ln33/b;->g:Ljava/lang/String;

    const-string v0, ""

    if-nez p1, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    iget-object p1, p0, Ln33/b;->h:Ljava/lang/Long;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int p1, v4

    move v4, p1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    iget-object p1, p0, Ln33/b;->e:Ljava/lang/Long;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-int v1, v1

    :cond_2
    move v2, v1

    iget-object p0, p0, Ln33/b;->d:Ljava/lang/String;

    if-nez p0, :cond_3

    move-object v6, v0

    goto :goto_2

    :cond_3
    move-object v6, p0

    :goto_2
    new-instance v1, Lstream/video/sfu/models/Codec;

    const/16 v8, 0x28

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lstream/video/sfu/models/Codec;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/node/NodeCoordinator;Ly2/y;Lh2/c;)Lh2/c;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/node/NodeCoordinator;->r(Ly2/y;Z)Lh2/c;

    move-result-object p0

    invoke-virtual {p0}, Lh2/c;->f()J

    move-result-wide p0

    invoke-virtual {p2, p0, p1}, Lh2/c;->l(J)Lh2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/util/Map;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lup/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/a;->b(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_2

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p1, v2}, Lup/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/stripe/android/uicore/elements/a;->b(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    instance-of v1, v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lup/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, p2}, Lup/d;->l(Ljava/util/Map;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const-string v0, "["

    const-string v1, "]"

    invoke-static {p0, v0, p1, v1}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Ljava/lang/String;Ljava/util/Map;Ll3/m0;Landroidx/compose/runtime/Composer;II)Ll3/g;
    .locals 63

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    const v2, 0x74f92f20

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_0

    sget-object v2, Lm83/z;->w:Lm83/z;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    const/4 v3, 0x4

    and-int/lit8 v4, p5, 0x4

    sget-object v22, Lw3/l;->c:Lw3/l;

    if-eqz v4, :cond_1

    new-instance v5, Ll3/m0;

    const/16 v23, 0x0

    const v24, 0xefff

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    invoke-direct/range {v5 .. v24}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object v4, v5

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    const v5, -0x718b3a08

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v5, p4, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-le v5, v3, :cond_2

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    and-int/lit8 v5, p4, 0x6

    if-ne v5, v3, :cond_4

    :cond_3
    move v3, v6

    goto :goto_2

    :cond_4
    move v3, v7

    :goto_2
    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_5

    if-ne v5, v8, :cond_6

    :cond_5
    invoke-static {v0, v7}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v5

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v0, v5

    check-cast v0, Landroid/text/Spanned;

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const v3, -0x718b207e

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_8

    if-ne v5, v8, :cond_7

    goto :goto_3

    :cond_7
    move-object v0, v1

    goto/16 :goto_8

    :cond_8
    :goto_3
    new-instance v3, Ll3/d;

    invoke-direct {v3}, Ll3/d;-><init>()V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    const-class v8, Ljava/lang/Object;

    invoke-interface {v0, v7, v5, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    const-string v8, "getSpans(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v5

    move v9, v7

    move v10, v9

    :goto_4
    const-string v11, "substring(...)"

    if-ge v9, v8, :cond_15

    aget-object v12, v5, v9

    invoke-interface {v0, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v13

    invoke-interface {v0, v12}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v10, v15, :cond_14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v13, v15, :cond_14

    sub-int v15, v13, v10

    if-ltz v15, :cond_14

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v10, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ll3/d;->b(Ljava/lang/String;)V

    instance-of v10, v12, Landroid/text/style/StyleSpan;

    if-eqz v10, :cond_c

    check-cast v12, Landroid/text/style/StyleSpan;

    invoke-virtual {v12}, Landroid/text/style/StyleSpan;->getStyle()I

    move-result v10

    if-eq v10, v6, :cond_b

    const/4 v11, 0x2

    if-eq v10, v11, :cond_a

    const/4 v11, 0x3

    if-eq v10, v11, :cond_9

    goto :goto_5

    :cond_9
    new-instance v23, Ll3/m0;

    sget-object v28, Lp3/r;->I:Lp3/r;

    new-instance v10, Lp3/n;

    invoke-direct {v10, v6}, Lp3/n;-><init>(I)V

    const/16 v41, 0x0

    const v42, 0xfff3

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    move-object/from16 v29, v10

    invoke-direct/range {v23 .. v42}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v10, v23

    invoke-virtual {v3, v10, v13, v14}, Ll3/d;->a(Ll3/m0;II)V

    :goto_5
    move-object/from16 p0, v0

    move-object/from16 p3, v1

    move-object/from16 v27, v5

    move/from16 v28, v6

    move/from16 v25, v8

    move/from16 v26, v9

    move v0, v13

    goto/16 :goto_6

    :cond_a
    new-instance v23, Ll3/m0;

    new-instance v10, Lp3/n;

    invoke-direct {v10, v6}, Lp3/n;-><init>(I)V

    const/16 v41, 0x0

    const v42, 0xfff7

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    move-object/from16 v29, v10

    invoke-direct/range {v23 .. v42}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v10, v23

    invoke-virtual {v3, v10, v13, v14}, Ll3/d;->a(Ll3/m0;II)V

    goto :goto_5

    :cond_b
    new-instance v23, Ll3/m0;

    sget-object v28, Lp3/r;->I:Lp3/r;

    const/16 v41, 0x0

    const v42, 0xfffb

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v23 .. v42}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v10, v23

    invoke-virtual {v3, v10, v13, v14}, Ll3/d;->a(Ll3/m0;II)V

    goto :goto_5

    :cond_c
    instance-of v10, v12, Landroid/text/style/UnderlineSpan;

    if-eqz v10, :cond_d

    move-object v10, v5

    new-instance v5, Ll3/m0;

    const/16 v23, 0x0

    const v24, 0xefff

    move v11, v6

    move v12, v7

    const-wide/16 v6, 0x0

    move v15, v8

    move/from16 v16, v9

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    move/from16 v26, v16

    const-wide/16 v15, 0x0

    move-object/from16 v27, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    move/from16 v31, v21

    const-wide/16 v20, 0x0

    move-object/from16 p0, v0

    move-object/from16 p3, v1

    move/from16 v0, v30

    move/from16 v1, v31

    invoke-direct/range {v5 .. v24}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    invoke-virtual {v3, v5, v0, v1}, Ll3/d;->a(Ll3/m0;II)V

    goto/16 :goto_6

    :cond_d
    move-object/from16 p0, v0

    move-object/from16 p3, v1

    move-object/from16 v27, v5

    move/from16 v28, v6

    move/from16 v25, v8

    move/from16 v26, v9

    move v0, v13

    move v1, v14

    instance-of v5, v12, Landroid/text/style/BulletSpan;

    if-eqz v5, :cond_e

    const-string v1, "\u2022\t"

    invoke-virtual {v3, v1}, Ll3/d;->b(Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_e
    instance-of v5, v12, Landroid/text/style/ForegroundColorSpan;

    if-eqz v5, :cond_f

    new-instance v43, Ll3/m0;

    check-cast v12, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {v12}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v44

    const/16 v61, 0x0

    const v62, 0xfffe

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const-wide/16 v58, 0x0

    const/16 v60, 0x0

    invoke-direct/range {v43 .. v62}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v5, v43

    invoke-virtual {v3, v5, v0, v1}, Ll3/d;->a(Ll3/m0;II)V

    goto :goto_6

    :cond_f
    instance-of v5, v12, Landroid/text/style/ImageSpan;

    if-eqz v5, :cond_12

    check-cast v12, Landroid/text/style/ImageSpan;

    invoke-virtual {v12}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    invoke-virtual {v12}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {v12}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v5, "\ufffd"

    invoke-static {v3, v0, v5}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    move v10, v1

    goto :goto_7

    :cond_12
    instance-of v5, v12, Landroid/text/style/URLSpan;

    if-eqz v5, :cond_13

    invoke-virtual {v3, v4, v0, v1}, Ll3/d;->a(Ll3/m0;II)V

    check-cast v12, Landroid/text/style/URLSpan;

    invoke-virtual {v12}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getURL(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ll3/c;

    new-instance v7, Ll3/o0;

    invoke-direct {v7, v5}, Ll3/o0;-><init>(Ljava/lang/String;)V

    const-string v5, "URL"

    invoke-direct {v6, v0, v1, v7, v5}, Ll3/c;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v3, Ll3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_6
    move v10, v0

    goto :goto_7

    :cond_14
    move-object/from16 p0, v0

    move-object/from16 p3, v1

    move-object/from16 v27, v5

    move/from16 v28, v6

    move/from16 v25, v8

    move/from16 v26, v9

    :goto_7
    add-int/lit8 v9, v26, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move/from16 v8, v25

    move-object/from16 v5, v27

    move/from16 v6, v28

    const/4 v7, 0x0

    goto/16 :goto_4

    :cond_15
    move-object/from16 p0, v0

    move-object/from16 p3, v1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v10, v0, :cond_16

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ll3/d;->b(Ljava/lang/String;)V

    :cond_16
    invoke-virtual {v3}, Ll3/d;->k()Ll3/g;

    move-result-object v5

    move-object/from16 v0, p3

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v5, Ll3/g;

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    return-object v5
.end method

.method public static final o(Lx1/b;Landroidx/compose/runtime/Composer;I)Lb1/c;
    .locals 2

    and-int/lit8 v0, p2, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    move-object v0, p1

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v1, :cond_2

    :cond_1
    const/4 p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_3

    if-ne v0, v1, :cond_4

    :cond_3
    new-instance v0, Lb1/c;

    invoke-direct {v0, p0}, Lb1/c;-><init>(Lx1/b;)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lb1/c;

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_5

    if-ne p2, v1, :cond_6

    :cond_5
    new-instance p2, La1/b;

    const/16 p0, 0xd

    invoke-direct {p2, v0, p0}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p2, p1}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object v0
.end method

.method public static final p(F)I
    .locals 2

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p0, v0

    float-to-int p0, p0

    return p0
.end method

.method public static q(Lha3/e;)Lrb3/g;
    .locals 6

    sget-object v0, Lrb3/r;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrb3/i;

    iget-object v2, v1, Lrb3/i;->b:Lyb3/p;

    iget-object v3, v1, Lrb3/i;->a:Lva3/h;

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    invoke-virtual {v3}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "asString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lrb3/i;->c:Ljava/util/Collection;

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, v1, Lrb3/i;->e:[Lrb3/e;

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_4

    aget-object v5, v0, v4

    invoke-interface {v5, p0}, Lrb3/e;->b(Lha3/e;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    new-instance p0, Lrb3/f;

    invoke-direct {p0, v3}, Lrb3/g;-><init>(Z)V

    return-object p0

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget-object v0, v1, Lrb3/i;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_5

    new-instance p0, Lrb3/f;

    invoke-direct {p0, v3}, Lrb3/g;-><init>(Z)V

    return-object p0

    :cond_5
    sget-object p0, Lrb3/f;->c:Lrb3/f;

    return-object p0

    :cond_6
    sget-object p0, Lrb3/f;->b:Lrb3/f;

    return-object p0
.end method

.method public static r()[F
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    return-object v0

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static s(Ljava/lang/String;)Lab3/j;
    .locals 1

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lab3/j;

    invoke-direct {v0, p0}, Lab3/j;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static t(Landroid/content/Context;Landroid/os/Bundle;)Lcom/iterable/iterableapi/s1;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v3, "attachment-url"

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "itbl"

    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    const-string v6, "IterableNotification"

    const/4 v7, 0x0

    if-nez v0, :cond_0

    const-string v0, "Notification doesn\'t have an Iterable payload. Skipping."

    invoke-static {v6, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    return-object v7

    :cond_0
    invoke-static {v2}, Lcom/iterable/iterableapi/v1;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Received a ghost push notification. Skipping."

    invoke-static {v6, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    return-object v7

    :cond_1
    const-string v0, "title"

    invoke-virtual {v2, v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "body"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "sound"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x1

    const-string v11, ""

    if-eqz v0, :cond_3

    const-string v12, "https"

    invoke-virtual {v0, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v12, 0x2f

    invoke-virtual {v0, v12}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v12

    add-int/2addr v12, v10

    invoke-virtual {v0, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v24, v12

    move-object v12, v0

    move-object/from16 v0, v24

    goto :goto_0

    :cond_2
    move-object v12, v7

    :goto_0
    const-string v13, "[.][^.]+$"

    invoke-virtual {v0, v13, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v24, v12

    move-object v12, v0

    move-object/from16 v0, v24

    goto :goto_1

    :cond_3
    move-object v12, v0

    move-object v0, v7

    :goto_1
    if-eqz v0, :cond_4

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_2
    move-object v14, v0

    goto :goto_4

    :cond_4
    if-eqz v12, :cond_5

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v14, "raw"

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0, v12, v14, v15}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_6

    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    goto :goto_2

    :cond_6
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "android.resource://"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "/"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_2

    :goto_4
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    const/16 v15, 0x80

    if-ne v14, v0, :cond_b

    const-string v0, "channel name: "

    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13, v15}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v7, :cond_9

    const-string v13, "iterable_notification_channel_name"

    invoke-virtual {v7, v13}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    instance-of v13, v7, Ljava/lang/String;

    if-eqz v13, :cond_7

    check-cast v7, Ljava/lang/String;

    goto :goto_5

    :catch_0
    move-exception v0

    const/4 v7, 0x0

    goto :goto_6

    :cond_7
    instance-of v13, v7, Ljava/lang/Integer;

    if-eqz v13, :cond_8

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    :try_start_1
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :cond_9
    const/4 v7, 0x0

    goto :goto_7

    :goto_6
    const-string v13, "Error while retrieving channel name"

    invoke-static {v6, v13, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_7
    if-eqz v7, :cond_a

    goto :goto_8

    :cond_a
    const-string v7, "iterable channel"

    goto :goto_8

    :cond_b
    move-object v7, v12

    :goto_8
    sget-object v0, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    if-ne v14, v0, :cond_c

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_9
    move-object v13, v0

    goto :goto_a

    :cond_c
    invoke-static {v1, v12, v10}, Lcom/iterable/iterableapi/v1;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :goto_a
    new-instance v10, Lcom/iterable/iterableapi/s1;

    invoke-direct {v10, v1, v13}, Lcom/iterable/iterableapi/s1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_b

    :catch_2
    move-exception v0

    goto :goto_c

    :cond_d
    const/4 v0, 0x0

    :goto_b
    move-object v3, v0

    goto :goto_d

    :goto_c
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_d
    new-instance v15, Lcom/iterable/iterableapi/u1;

    invoke-direct {v15, v5}, Lcom/iterable/iterableapi/u1;-><init>(Ljava/lang/String;)V

    iget-object v0, v15, Lcom/iterable/iterableapi/u1;->d:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    move-object/from16 v17, v5

    new-instance v5, Landroid/app/Notification;

    invoke-direct {v5}, Landroid/app/Notification;-><init>()V

    iget v0, v5, Landroid/app/Notification;->defaults:I

    move-object/from16 v18, v14

    const/4 v14, 0x4

    or-int/2addr v0, v14

    iput v0, v5, Landroid/app/Notification;->defaults:I

    const-string v14, "iterable_notification_icon"

    const-string v0, "iconID: "

    move-object/from16 v19, v7

    :try_start_3
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_6

    move-object/from16 v20, v13

    :try_start_4
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_5

    move-object/from16 v21, v12

    const/16 v12, 0x80

    :try_start_5
    invoke-virtual {v7, v13, v12}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget-object v12, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v12, :cond_e

    const/4 v13, 0x0

    invoke-virtual {v12, v14, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v12
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_4

    :try_start_6
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v7, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v0, v14}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_10

    :catch_3
    move-exception v0

    goto :goto_f

    :catch_4
    move-exception v0

    :goto_e
    const/4 v12, 0x0

    goto :goto_f

    :cond_e
    const/4 v12, 0x0

    goto :goto_10

    :catch_5
    move-exception v0

    move-object/from16 v21, v12

    goto :goto_e

    :catch_6
    move-exception v0

    move-object/from16 v21, v12

    move-object/from16 v20, v13

    goto :goto_e

    :goto_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_10
    if-nez v12, :cond_f

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget-object v7, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    const/4 v13, 0x0

    invoke-virtual {v1, v14, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    invoke-interface {v7, v14, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v12, "drawable"

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v7, v12, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    :cond_f
    if-nez v12, :cond_11

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    if-eqz v0, :cond_10

    const-string v0, "No Notification Icon defined - defaulting to app icon"

    invoke-static {v6, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v12, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    goto :goto_11

    :cond_10
    const-string v0, "No Notification Icon defined - push notifications will not be displayed"

    invoke-static {v6, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    :goto_11
    invoke-virtual {v10, v12}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/core/app/NotificationCompat$Builder;->setTicker(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v10, v4}, Landroidx/core/app/NotificationCompat$Builder;->setShowWhen(Z)Landroidx/core/app/NotificationCompat$Builder;

    iput-object v3, v10, Lcom/iterable/iterableapi/s1;->c:Ljava/lang/String;

    iput-object v9, v10, Lcom/iterable/iterableapi/s1;->d:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iput v0, v10, Lcom/iterable/iterableapi/s1;->e:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Request code = "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v10, Lcom/iterable/iterableapi/s1;->e:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v17, :cond_12

    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iput v0, v10, Lcom/iterable/iterableapi/s1;->e:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, Lcom/iterable/iterableapi/s1;->e:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.iterable.push.ACTION_PUSH_ACTION"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v4, Lcom/iterable/iterableapi/IterableTrampolineActivity;

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v7, "default"

    const-string v8, "actionIdentifier"

    invoke-virtual {v0, v8, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v7, 0x10000000

    invoke-virtual {v0, v7}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object v9, v15, Lcom/iterable/iterableapi/u1;->f:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    if-eqz v9, :cond_17

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v13, 0x0

    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_17

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/iterable/iterableapi/t1;

    new-instance v15, Landroid/content/Intent;

    invoke-direct {v15, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const-string v12, "requestCode"

    iget v7, v10, Lcom/iterable/iterableapi/s1;->e:I

    invoke-virtual {v15, v12, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v7, v14, Lcom/iterable/iterableapi/t1;->a:Ljava/lang/String;

    invoke-virtual {v15, v8, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v7, v14, Lcom/iterable/iterableapi/t1;->a:Ljava/lang/String;

    invoke-virtual {v15, v8, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v7, v14, Lcom/iterable/iterableapi/t1;->c:Ljava/lang/String;

    const-string v12, "textInput"

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_13

    const/high16 v22, 0xa000000

    move/from16 v2, v22

    :goto_13
    move-object/from16 v22, v3

    goto :goto_14

    :cond_13
    const/high16 v2, 0xc000000

    goto :goto_13

    :goto_14
    iget-boolean v3, v14, Lcom/iterable/iterableapi/t1;->d:Z

    if-eqz v3, :cond_14

    const-string v3, "Go through TrampolineActivity"

    invoke-static {v6, v3}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v15, v1, v4}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const/high16 v3, 0x10000000

    invoke-virtual {v15, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {v15}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v1, v3, v15, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    goto :goto_15

    :cond_14
    const-string v3, "Go through IterablePushActionReceiver"

    invoke-static {v6, v3}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    const-class v3, Lcom/iterable/iterableapi/IterablePushActionReceiver;

    invoke-virtual {v15, v1, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {v15}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v1, v3, v15, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    :goto_15
    new-instance v3, Landroidx/core/app/NotificationCompat$Action$Builder;

    iget-object v15, v14, Lcom/iterable/iterableapi/t1;->b:Ljava/lang/String;

    move-object/from16 v23, v4

    const/4 v4, 0x0

    invoke-direct {v3, v4, v15, v2}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    new-instance v2, Landroidx/core/app/RemoteInput$Builder;

    const-string v4, "userInput"

    invoke-direct {v2, v4}, Landroidx/core/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    iget-object v4, v14, Lcom/iterable/iterableapi/t1;->e:Ljava/lang/String;

    invoke-virtual {v2, v4}, Landroidx/core/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroidx/core/app/RemoteInput$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/core/app/RemoteInput$Builder;->build()Landroidx/core/app/RemoteInput;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroidx/core/app/NotificationCompat$Action$Builder;->addRemoteInput(Landroidx/core/app/RemoteInput;)Landroidx/core/app/NotificationCompat$Action$Builder;

    :cond_15
    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object v2

    invoke-virtual {v10, v2}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    const/16 v16, 0x1

    add-int/lit8 v13, v13, 0x1

    const/4 v2, 0x3

    if-ne v13, v2, :cond_16

    goto :goto_16

    :cond_16
    move-object/from16 v2, p1

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    const/high16 v7, 0x10000000

    goto/16 :goto_12

    :cond_17
    :goto_16
    iget v2, v10, Lcom/iterable/iterableapi/s1;->e:I

    const/high16 v3, 0xc000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    invoke-static/range {p1 .. p1}, Lcom/iterable/iterableapi/v1;->b(Landroid/os/Bundle;)Z

    move-result v0

    iput-boolean v0, v10, Lcom/iterable/iterableapi/s1;->b:Z

    :try_start_7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v12, 0x80

    invoke-virtual {v0, v2, v12}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_18

    const-string v2, "iterable_notification_color"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_7

    :try_start_8
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0
    :try_end_8
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_8 .. :try_end_8} :catch_7

    goto :goto_17

    :catch_7
    move-exception v0

    goto :goto_18

    :catch_8
    :goto_17
    :try_start_9
    invoke-virtual {v10, v0}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;
    :try_end_9
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_9 .. :try_end_9} :catch_7

    goto :goto_19

    :goto_18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_18
    :goto_19
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.permission.VIBRATE"

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_19

    iget v0, v5, Landroid/app/Notification;->defaults:I

    or-int/lit8 v0, v0, 0x2

    iput v0, v5, Landroid/app/Notification;->defaults:I

    :cond_19
    iget v0, v5, Landroid/app/Notification;->defaults:I

    invoke-virtual {v10, v0}, Landroidx/core/app/NotificationCompat$Builder;->setDefaults(I)Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "notification"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-eqz v0, :cond_1c

    move-object/from16 v3, v21

    const/4 v13, 0x0

    invoke-static {v1, v3, v13}, Lcom/iterable/iterableapi/v1;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v4

    if-eqz v4, :cond_1c

    invoke-virtual {v0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    move-result-object v4

    array-length v5, v4

    :goto_1a
    if-ge v13, v5, :cond_1b

    aget-object v7, v4, v13

    invoke-virtual {v7}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/Notification;->getChannelId()Ljava/lang/String;

    move-result-object v7

    if-ne v7, v3, :cond_1a

    const-string v0, "Not Deleting the channel as there are active notification for old channel"

    invoke-static {v6, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1b

    :cond_1a
    add-int/lit8 v13, v13, 0x1

    goto :goto_1a

    :cond_1b
    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V

    :cond_1c
    :goto_1b
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    if-eqz v0, :cond_1e

    move-object/from16 v2, v20

    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    move-result-object v3

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Landroid/app/NotificationChannel;->getName()Ljava/lang/CharSequence;

    move-result-object v3

    move-object/from16 v7, v19

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    goto :goto_1c

    :cond_1d
    move-object/from16 v7, v19

    :goto_1c
    const-string v3, " channelName = "

    const-string v4, " channelDescription = "

    const-string v5, "Creating notification: channelId = "

    invoke-static {v5, v2, v3, v7, v4}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v3}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v4, 0x5

    invoke-virtual {v3, v4}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v3

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v3

    new-instance v5, Landroid/app/NotificationChannel;

    invoke-direct {v5, v2, v7, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v5, v11}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-virtual {v5, v4}, Landroid/app/NotificationChannel;->enableLights(Z)V

    invoke-static {v1}, Lcom/iterable/iterableapi/v1;->c(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v5, v1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    move-object/from16 v1, v18

    invoke-virtual {v5, v1, v3}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    invoke-virtual {v0, v5}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_1e
    return-object v10
.end method

.method public static final u(Landroidx/compose/runtime/Composer;I)F
    .locals 2

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    invoke-virtual {p0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Resources;

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result p1

    div-float/2addr p0, p1

    return p0
.end method

.method public static v()Lig3/b;
    .locals 2

    sget-object v0, Lup/d;->c:Lig3/b;

    if-nez v0, :cond_2

    invoke-static {}, Lfg3/d;->d()Lig3/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lig3/d;->c()Lig3/b;

    move-result-object v1

    instance-of v0, v0, Lhg3/g;

    if-eqz v0, :cond_1

    const-string v0, "Temporary mdcAdapter given by SubstituteServiceProvider."

    invoke-static {v0}, Lhg3/d;->d(Ljava/lang/String;)V

    const-string v0, "This mdcAdapter will be replaced after backend initialization has completed."

    invoke-static {v0}, Lhg3/d;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "Failed to find provider."

    invoke-static {v0}, Lhg3/d;->a(Ljava/lang/String;)V

    const-string v0, "Defaulting to no-operation MDCAdapter implementation."

    invoke-static {v0}, Lhg3/d;->a(Ljava/lang/String;)V

    new-instance v1, Lio/sentry/hints/j;

    const/16 v0, 0x1a

    invoke-direct {v1, v0}, Lio/sentry/hints/j;-><init>(I)V

    :cond_1
    :goto_0
    sput-object v1, Lup/d;->c:Lig3/b;

    :cond_2
    sget-object v0, Lup/d;->c:Lig3/b;

    return-object v0
.end method

.method public static w(Landroid/content/Context;)Landroid/content/Intent;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public static final x(Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "blockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;->getBlockId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;->getValue()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static final y(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Ljava/lang/String;)Llj/f0;
    .locals 2

    const-string v0, "blockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getBlockId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p0, :cond_2

    new-instance p1, Llj/f0;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getValue()I

    move-result v0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getStringResponse()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;->getOtherText()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v0, v1, p0}, Llj/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static final z(Lcom/amplitude/android/engagement/types/SurveyResponseText;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "blockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseText;->getBlockId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyResponseText;->getStringResponse()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    return-object v0
.end method
