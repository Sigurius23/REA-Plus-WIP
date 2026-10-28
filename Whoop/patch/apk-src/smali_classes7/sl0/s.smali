.class public abstract Lsl0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001b\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002\u00b2\u0006\u0012\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lsl0/n0;",
        "screenArgs",
        "Lsl0/q;",
        "e",
        "(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lsl0/q;",
        "Lf6/d;",
        "",
        "a",
        "Lf6/d;",
        "PERMISSION_DISCLAIMER_KEY",
        "Lml0/c;",
        "navigationRouter",
        "Lz92/a;",
        "userInfoAccessor",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Lm32/a;",
        "permissionChecker",
        "Lxk0/a;",
        "analyticsHelper",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "has-shown-permission-disclaimer"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lsl0/s;->a:Lf6/d;

    return-void
.end method

.method public static synthetic a(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsl0/s;->k(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsl0/s;->f(Landroid/content/Context;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsl0/n0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lsl0/s;->n(Lsl0/n0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Lf6/d;
    .locals 1

    sget-object v0, Lsl0/s;->a:Lf6/d;

    return-object v0
.end method

.method public static final e(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lsl0/q;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "featureFlagChecker"

    move-object/from16 v10, p1

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "screenArgs"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lvf3/c;

    const-string v3, "COACH_WRAPPER_NAVIGATION_ROUTER"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_0

    if-ne v4, v5, :cond_1

    :cond_0
    new-instance v4, Lsl0/v0;

    const/4 v3, 0x2

    invoke-direct {v4, v0, v3}, Lsl0/v0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v4, Lc93/a;

    const v0, 0x717a6169

    invoke-virtual {v12, v0}, Lp1/q;->f0(I)V

    sget-object v3, Lpf3/a;->a:Lpf3/a;

    invoke-virtual {v3}, Lpf3/a;->a()Lnf3/a;

    move-result-object v6

    iget-object v6, v6, Lnf3/a;->a:Lwf3/a;

    iget-object v6, v6, Lwf3/a;->d:Lxf3/c;

    const v7, -0x384098

    invoke-virtual {v12, v7}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2

    if-ne v9, v5, :cond_3

    :cond_2
    sget-object v8, Ll83/i;->y:Ll83/i;

    new-instance v9, Lsl0/s$a;

    invoke-direct {v9, v6, v2, v4}, Lsl0/s$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v8, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    check-cast v9, Ll83/h;

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3}, Lpf3/a;->a()Lnf3/a;

    move-result-object v4

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v12, v7}, Lp1/q;->f0(I)V

    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_4

    if-ne v11, v5, :cond_5

    :cond_4
    sget-object v8, Ll83/i;->y:Ll83/i;

    new-instance v11, Lsl0/s$b;

    invoke-direct {v11, v4, v6, v6}, Lsl0/s$b;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v8, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    check-cast v11, Ll83/h;

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3}, Lpf3/a;->a()Lnf3/a;

    move-result-object v4

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v12, v7}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v8, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_6

    if-ne v13, v5, :cond_7

    :cond_6
    sget-object v8, Ll83/i;->y:Ll83/i;

    new-instance v13, Lsl0/s$c;

    invoke-direct {v13, v4, v6, v6}, Lsl0/s$c;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v8, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v13

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    check-cast v13, Ll83/h;

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3}, Lpf3/a;->a()Lnf3/a;

    move-result-object v4

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v12, v7}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v8, :cond_8

    if-ne v14, v5, :cond_9

    :cond_8
    sget-object v8, Ll83/i;->y:Ll83/i;

    new-instance v14, Lsl0/s$d;

    invoke-direct {v14, v4, v6, v6}, Lsl0/s$d;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v8, v14}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    check-cast v14, Ll83/h;

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_a

    if-ne v8, v5, :cond_b

    :cond_a
    new-instance v8, Lsl0/r;

    const/4 v4, 0x0

    invoke-direct {v8, v1, v4}, Lsl0/r;-><init>(Lsl0/n0;I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v8, Lc93/a;

    invoke-virtual {v12, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3}, Lpf3/a;->a()Lnf3/a;

    move-result-object v4

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v12, v7}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v15, :cond_c

    if-ne v7, v5, :cond_d

    :cond_c
    sget-object v7, Ll83/i;->y:Ll83/i;

    new-instance v15, Lsl0/s$e;

    invoke-direct {v15, v4, v6, v8}, Lsl0/s$e;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v7, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    check-cast v7, Ll83/h;

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v3}, Lpf3/a;->a()Lnf3/a;

    move-result-object v0

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const v3, -0x384098

    invoke-virtual {v12, v3}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_e

    if-ne v4, v5, :cond_f

    :cond_e
    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v4, Lsl0/s$f;

    invoke-direct {v4, v0, v6, v6}, Lsl0/s$f;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    check-cast v4, Ll83/h;

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    invoke-static {v12}, Ldp/d;->H(Lp1/q;)Lnf3/a;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_10

    new-instance v2, Lsl0/r;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lsl0/r;-><init>(Lsl0/n0;I)V

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Lnl0/e;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v6}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnl0/e;

    invoke-static {v9}, Lsl0/s;->g(Ll83/h;)Lml0/c;

    move-result-object v5

    invoke-static {v11}, Lsl0/s;->h(Ll83/h;)Lz92/a;

    move-result-object v1

    invoke-static {v13}, Lsl0/s;->i(Ll83/h;)La6/g;

    move-result-object v8

    invoke-static {v14}, Lsl0/s;->j(Ll83/h;)Lm32/a;

    move-result-object v9

    invoke-static {v7}, Lsl0/s;->l(Ll83/h;)Lxk0/a;

    move-result-object v6

    invoke-static {v4}, Lsl0/s;->m(Ll83/h;)Lzr2/a;

    move-result-object v11

    new-instance v3, Lsl0/q;

    move-object v4, v0

    move-object v7, v1

    invoke-direct/range {v3 .. v11}, Lsl0/q;-><init>(Lld1/c;Lml0/c;Lxk0/a;Lz92/a;La6/g;Lm32/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_10
    check-cast v2, Lsl0/q;

    return-object v2
.end method

.method private static final f(Landroid/content/Context;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ll83/h;)Lml0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lml0/c;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lml0/c;

    return-object p0
.end method

.method private static final h(Ll83/h;)Lz92/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lz92/a;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz92/a;

    return-object p0
.end method

.method private static final i(Ll83/h;)La6/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "La6/g;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    return-object p0
.end method

.method private static final j(Ll83/h;)Lm32/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lm32/a;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm32/a;

    return-object p0
.end method

.method private static final k(Lsl0/n0;)Luf3/a;
    .locals 4

    invoke-virtual {p0}, Lsl0/n0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, v1, v2, v3, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ll83/h;)Lxk0/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lxk0/a;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxk0/a;

    return-object p0
.end method

.method private static final m(Ll83/h;)Lzr2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lzr2/a;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzr2/a;

    return-object p0
.end method

.method private static final n(Lsl0/n0;)Luf3/a;
    .locals 3

    new-instance v0, Lor2/m;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method
