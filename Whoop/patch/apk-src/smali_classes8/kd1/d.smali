.class public abstract Lkd1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0008\u0005\u001a]\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001aB\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a:\u0010\u0017\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\u0019\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\"\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006$\u00b2\u0006\u000e\u0010#\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lzr2/a;",
        "dateProvider",
        "Lod1/u;",
        "userContext",
        "Ly92/a;",
        "authManager",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "",
        "url",
        "contentDescription",
        "Lj02/j;",
        "confirmDismissContent",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDismiss",
        "r",
        "(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "cookieName",
        "",
        "isNewAuthEnabled",
        "R",
        "(Ljava/lang/String;Lzr2/a;Ljava/lang/String;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;",
        "P",
        "(Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;",
        "value",
        "kotlin.jvm.PlatformType",
        "Q",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "S",
        "(Lj92/t;Ljava/lang/String;)Z",
        "",
        "a",
        "Ljava/util/List;",
        "cookieNames",
        "showConfirmDialog",
        "design_release"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "whoop-auth-expiry"

    const-string v1, "platform"

    const-string v2, "whoop-auth-token"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkd1/d;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lj02/j;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v4

    const/16 v26, 0x0

    const v27, 0x3fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lkd1/d;->r(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final D(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final E(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ljava/lang/String;Ljava/lang/String;ZLj02/j;Lc93/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 40

    move-object/from16 v3, p9

    and-int/lit8 v4, p11, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_0

    move v4, v7

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    and-int/lit8 v5, p11, 0x1

    move-object/from16 v13, p10

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->n()J

    move-result-wide v8

    sget-object v10, Li2/w0;->a:Li2/v0;

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v8, v9, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v13, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v13, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v13, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v10, v13, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move-object/from16 p11, v7

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v13, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_2
    move-object/from16 v10, p11

    goto :goto_3

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_2

    :goto_3
    invoke-static {v13, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v13, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v17, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    sget v6, Lgy0/a;->Y:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    const/16 v31, 0x1fe7

    const/16 v32, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v22, p1

    invoke-direct/range {v17 .. v32}, Lcom/whoop/design/atomic/organism/toolbar/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v6, p2

    invoke-virtual {v13, v6}, Lp1/q;->h(Z)Z

    move-result v7

    move-object/from16 v8, p3

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v7, v10

    move-object/from16 v10, p4

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v7, v7, v16

    move-object/from16 p11, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_7

    if-ne v4, v8, :cond_8

    :cond_7
    new-instance v33, Ldn0/k;

    const/16 v38, 0x2

    move-object/from16 v35, p3

    move-object/from16 v37, p6

    move/from16 v34, v6

    move-object/from16 v36, v10

    invoke-direct/range {v33 .. v38}, Ldn0/k;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v4, v33

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lc93/a;

    move-object v6, v15

    const/4 v15, 0x0

    const/16 v16, 0x35

    move-object v7, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v14

    move-object v14, v13

    const/4 v13, 0x0

    move-object v1, v7

    move-object v7, v9

    move-object v2, v11

    move-object/from16 v9, v17

    move-object/from16 v0, v18

    move-object v11, v4

    move-object/from16 v4, v19

    invoke-static/range {v8 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    const-string v8, "webview-nav-bar-android"

    move-object/from16 v9, p5

    invoke-interface {v9, v8}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v8

    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v8, :cond_f

    const v8, 0x51f82b70

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x1

    int-to-float v11, v10

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v11, v10

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    invoke-static {v10, v11, v13, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v13, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v11, v13, v11, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v13, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v9

    const-wide/16 v6, 0x0

    cmpl-double v0, v4, v6

    if-lez v0, :cond_c

    goto :goto_5

    :cond_c
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v10, 0x1

    invoke-direct {v0, v9, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v13, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v0

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v8, Lny0/o;

    sget-object v18, Lny0/q$a;->f:Lny0/q$a;

    invoke-static/range {p11 .. p11}, Lih0/d0;->C(Lx81/d;)I

    move-result v19

    invoke-interface/range {p7 .. p7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    const/16 v28, 0x3dc

    const/16 v29, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v17, v8

    invoke-direct/range {v17 .. v29}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lgy0/f;->B0:I

    const/4 v4, 0x0

    invoke-static {v0, v13, v4}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_d

    new-instance v4, Ljt1/b;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v3}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v12, v4

    check-cast v12, Lc93/a;

    const/16 v14, 0x6180

    const/16 v15, 0x8

    const/4 v11, 0x0

    move/from16 v39, v9

    move-object v9, v0

    move/from16 v0, v39

    invoke-static/range {v8 .. v15}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v4

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v8, Lny0/o;

    invoke-static/range {p11 .. p11}, Ldc/b;->D(Lx81/d;)I

    move-result v19

    invoke-interface/range {p8 .. p8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    const/16 v28, 0x3dc

    const/16 v29, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v17, v8

    invoke-direct/range {v17 .. v29}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, Lgy0/f;->C0:I

    const/4 v5, 0x0

    invoke-static {v4, v13, v5}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_e

    new-instance v4, Ljt1/b;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v3}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v12, v4

    check-cast v12, Lc93/a;

    const/16 v14, 0x6180

    const/16 v15, 0x8

    const/4 v11, 0x0

    invoke-static/range {v8 .. v15}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_f
    move v0, v9

    const/4 v4, 0x0

    const/4 v10, 0x1

    const v5, 0x520e0c44

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_10

    new-instance v4, Lbm2/x;

    const/4 v5, 0x4

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct {v4, v3, v6, v7, v5}, Lbm2/x;-><init>(Lp1/c1;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_7

    :cond_10
    move-object/from16 v6, p7

    move-object/from16 v7, p8

    :goto_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v2, p0

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_11

    if-ne v5, v1, :cond_12

    :cond_11
    new-instance v5, Lkd1/a;

    const/4 v1, 0x0

    invoke-direct {v5, v2, v6, v7, v1}, Lkd1/a;-><init>(Ljava/lang/String;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v1, 0x36

    const/4 v2, 0x0

    move-object/from16 p1, v0

    move/from16 p4, v1

    move/from16 p5, v2

    move-object/from16 p0, v4

    move-object/from16 p2, v5

    move-object/from16 p3, v13

    invoke-static/range {p0 .. p5}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final G(ZLj02/j;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    invoke-static {p3, p0}, Lkd1/d;->D(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/webkit/WebView;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/webkit/WebView;->goBack()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/webkit/WebView;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/webkit/WebView;->goForward()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/c1;Lp1/c1;Lp1/c1;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    const/4 v1, 0x1

    invoke-virtual {p3, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    new-instance p3, Lkd1/d$b;

    invoke-direct {p3, v0, p1, p2}, Lkd1/d$b;-><init>(Landroid/webkit/WebView;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v0, p3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 p2, -0x1

    invoke-direct {p1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final K(Ljava/lang/String;Lp1/c1;Lp1/c1;Landroid/webkit/WebView;)Ll83/a0;
    .locals 1

    const-string v0, "webView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p3}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p2, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic L(Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkd1/d;->P(Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M(Ljava/lang/String;Lzr2/a;Ljava/lang/String;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkd1/d;->R(Ljava/lang/String;Lzr2/a;Ljava/lang/String;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N()Ljava/util/List;
    .locals 1

    sget-object v0, Lkd1/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic O(Lj92/t;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lkd1/d;->S(Lj92/t;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final P(Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lzr2/a;",
            "Lod1/u;",
            "Ly92/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lkd1/d$c;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lkd1/d$c;

    iget v1, v0, Lkd1/d$c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkd1/d$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkd1/d$c;

    invoke-direct {v0, p5}, Lkd1/d$c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lkd1/d$c;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkd1/d$c;->G:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lkd1/d$c;->z:Ljava/lang/Object;

    check-cast p0, Ly92/a;

    iget-object p0, v0, Lkd1/d$c;->y:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lod1/u;

    iget-object p0, v0, Lkd1/d$c;->x:Ljava/lang/Object;

    check-cast p0, Lzr2/a;

    iget-object p0, v0, Lkd1/d$c;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p5

    const v2, 0x2d691a4a

    if-eq p5, v2, :cond_d

    const p1, 0x6fbd6873

    if-eq p5, p1, :cond_b

    const p1, 0x75e31e02

    if-eq p5, p1, :cond_3

    goto :goto_3

    :cond_3
    const-string p1, "whoop-auth-token"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_3

    :cond_4
    if-eqz p4, :cond_9

    iput-object v4, v0, Lkd1/d$c;->w:Ljava/lang/Object;

    iput-object v4, v0, Lkd1/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkd1/d$c;->y:Ljava/lang/Object;

    iput-object v4, v0, Lkd1/d$c;->z:Ljava/lang/Object;

    iput-boolean p4, v0, Lkd1/d$c;->E:Z

    iput v3, v0, Lkd1/d$c;->G:I

    invoke-virtual {p3, v0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    check-cast p5, Lcom/whoop/domain/model/AuthMaterial;

    if-eqz p5, :cond_7

    invoke-virtual {p5}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_2

    :cond_6
    return-object p0

    :cond_7
    :goto_2
    invoke-virtual {p2}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/whoop/domain/model/Session;->getAuthToken()Lcom/whoop/domain/model/AuthToken;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/whoop/domain/model/AuthToken;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    return-object v4

    :cond_9
    invoke-virtual {p2}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/whoop/domain/model/Session;->getAuthToken()Lcom/whoop/domain/model/AuthToken;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/whoop/domain/model/AuthToken;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    return-object v4

    :cond_b
    const-string p1, "platform"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_3

    :cond_c
    const-string p0, "android-app"

    return-object p0

    :cond_d
    const-string p2, "whoop-auth-expiry"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    :goto_3
    return-object v4

    :cond_e
    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p0

    const/16 p1, 0x3840

    invoke-virtual {p0, p1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {p0, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final R(Ljava/lang/String;Lzr2/a;Ljava/lang/String;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lzr2/a;",
            "Ljava/lang/String;",
            "Lod1/u;",
            "Ly92/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p6, Lkd1/d$d;

    if-eqz v0, :cond_0

    move-object v0, p6

    check-cast v0, Lkd1/d$d;

    iget v1, v0, Lkd1/d$d;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkd1/d$d;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkd1/d$d;

    invoke-direct {v0, p6}, Lkd1/d$d;-><init>(Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p6, v6, Lkd1/d$d;->G:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lkd1/d$d;->H:I

    const/4 v2, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p0, v6, Lkd1/d$d;->E:Ljava/lang/Object;

    check-cast p0, Ly92/a;

    iget-object p0, v6, Lkd1/d$d;->z:Ljava/lang/Object;

    check-cast p0, Lod1/u;

    iget-object p0, v6, Lkd1/d$d;->y:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/String;

    iget-object p0, v6, Lkd1/d$d;->x:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lzr2/a;

    iget-object p0, v6, Lkd1/d$d;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p6}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v6, Lkd1/d$d;->w:Ljava/lang/Object;

    iput-object p1, v6, Lkd1/d$d;->x:Ljava/lang/Object;

    iput-object p2, v6, Lkd1/d$d;->y:Ljava/lang/Object;

    iput-object v7, v6, Lkd1/d$d;->z:Ljava/lang/Object;

    iput-object v7, v6, Lkd1/d$d;->E:Ljava/lang/Object;

    iput-boolean p5, v6, Lkd1/d$d;->F:Z

    iput v2, v6, Lkd1/d$d;->H:I

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-static/range {v1 .. v6}, Lkd1/d;->P(Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object p6

    if-ne p6, v0, :cond_3

    return-object v0

    :cond_3
    move-object p0, v1

    move-object p1, v2

    :goto_2
    check-cast p6, Ljava/lang/String;

    if-eqz p6, :cond_4

    invoke-static {p0}, Lkd1/d;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p6}, Lkd1/d;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance p4, Ljava/text/SimpleDateFormat;

    const-string p5, "EEE, dd MMM yyyy HH\':\'mm\':\'ss \'GMT\'"

    invoke-direct {p4, p5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string p5, "UTC"

    invoke-static {p5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p5

    invoke-virtual {p4, p5}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/16 p5, 0x3840

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1, p5}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/net/URI;

    invoke-direct {p4, p2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "="

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ";Domain="

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ";Path=/;Secure;Expires="

    invoke-static {p0, p1, p4}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v7
.end method

.method private static final S(Lj92/t;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lj92/u;->a(Lj92/t;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lj02/j;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d;->v(Lj02/j;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d;->w(Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkd1/d;->u(Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkd1/d;->A(Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lj02/j;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d;->y(Lj02/j;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkd1/d;->x(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Ljava/lang/String;ZLj02/j;Lc93/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lkd1/d;->F(Ljava/lang/String;Ljava/lang/String;ZLj02/j;Lc93/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ZLj02/j;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d;->G(ZLj02/j;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkd1/d;->I(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;Lp1/c1;Lp1/c1;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d;->J(Lp1/c1;Lp1/c1;Lp1/c1;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lkd1/d;->B(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkd1/d;->z(Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;Lp1/c1;Lp1/c1;Landroid/webkit/WebView;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/d;->K(Ljava/lang/String;Lp1/c1;Lp1/c1;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/a;Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkd1/d;->t(Lc93/a;Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkd1/d;->E(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkd1/d;->s(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkd1/d;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lzr2/a;Lod1/u;Ly92/a;Lj92/t;Ljava/lang/String;Ljava/lang/String;Lj02/j;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzr2/a;",
            "Lod1/u;",
            "Ly92/a;",
            "Lj92/t;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lj02/j;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p4

    move-object/from16 v3, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    const-string v4, "dateProvider"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "userContext"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "authManager"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "url"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onDismiss"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p8

    check-cast v12, Lp1/q;

    const v4, -0x37201835

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v11, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_1
    move v4, v11

    :goto_1
    and-int/lit8 v6, v11, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_5
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_8

    and-int/lit8 v6, p10, 0x8

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    move-object/from16 v6, p3

    :cond_7
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    goto :goto_5

    :cond_8
    move-object/from16 v6, p3

    :goto_5
    and-int/lit16 v7, v11, 0x6000

    const/16 v9, 0x4000

    if-nez v7, :cond_a

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    move v7, v9

    goto :goto_6

    :cond_9
    const/16 v7, 0x2000

    :goto_6
    or-int/2addr v4, v7

    :cond_a
    and-int/lit8 v7, p10, 0x20

    const/high16 v10, 0x30000

    if-eqz v7, :cond_c

    or-int/2addr v4, v10

    :cond_b
    move-object/from16 v10, p5

    goto :goto_8

    :cond_c
    and-int/2addr v10, v11

    if-nez v10, :cond_b

    move-object/from16 v10, p5

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/high16 v13, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v13, 0x10000

    :goto_7
    or-int/2addr v4, v13

    :goto_8
    and-int/lit8 v13, p10, 0x40

    const/high16 v14, 0x180000

    if-eqz v13, :cond_e

    :goto_9
    or-int/2addr v4, v14

    goto :goto_b

    :cond_e
    and-int/2addr v14, v11

    if-nez v14, :cond_11

    const/high16 v14, 0x200000

    and-int/2addr v14, v11

    if-nez v14, :cond_f

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    goto :goto_a

    :cond_f
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    :goto_a
    if-eqz v14, :cond_10

    const/high16 v14, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v14, 0x80000

    goto :goto_9

    :cond_11
    :goto_b
    const/high16 v14, 0xc00000

    and-int/2addr v14, v11

    if-nez v14, :cond_13

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    const/high16 v14, 0x800000

    goto :goto_c

    :cond_12
    const/high16 v14, 0x400000

    :goto_c
    or-int/2addr v4, v14

    :cond_13
    const v14, 0x492493

    and-int/2addr v14, v4

    const v15, 0x492492

    move/from16 v16, v7

    if-eq v14, v15, :cond_14

    const/4 v14, 0x1

    goto :goto_d

    :cond_14
    const/4 v14, 0x0

    :goto_d
    and-int/lit8 v15, v4, 0x1

    invoke-virtual {v12, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_27

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v14, v11, 0x1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    const/16 v18, 0x0

    if-eqz v14, :cond_17

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v14

    if-eqz v14, :cond_15

    goto :goto_e

    :cond_15
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v13, p10, 0x8

    if-eqz v13, :cond_16

    and-int/lit16 v4, v4, -0x1c01

    :cond_16
    move-object v13, v3

    move v14, v4

    goto :goto_f

    :cond_17
    :goto_e
    and-int/lit8 v14, p10, 0x8

    if-eqz v14, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_18

    new-instance v6, Lj92/t;

    invoke-direct {v6}, Lj92/t;-><init>()V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v6, Lj92/t;

    and-int/lit16 v4, v4, -0x1c01

    :cond_19
    if-eqz v16, :cond_1a

    const-string v10, ""

    :cond_1a
    if-eqz v13, :cond_16

    move v14, v4

    move-object/from16 v13, v18

    :goto_f
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_1b

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v16, v3

    check-cast v16, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_1c

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v19, v3

    check-cast v19, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_1d

    invoke-static/range {v18 .. v18}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v18, v3

    check-cast v18, Lp1/c1;

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_1e

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v20, v4

    check-cast v20, Lp1/c1;

    const-string v4, "webview-dismiss-confirmation"

    invoke-interface {v3, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v21

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const v22, 0xe000

    and-int v7, v14, v22

    if-ne v7, v9, :cond_1f

    const/4 v7, 0x1

    goto :goto_10

    :cond_1f
    const/4 v7, 0x0

    :goto_10
    or-int/2addr v4, v7

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_21

    if-ne v7, v15, :cond_20

    goto :goto_11

    :cond_20
    move-object v5, v0

    move-object/from16 v27, v6

    move-object/from16 p3, v10

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v6, v3

    goto :goto_12

    :cond_21
    :goto_11
    new-instance v0, Lkd1/d$a;

    const/4 v7, 0x0

    move-object/from16 p3, v3

    move-object v3, v1

    move-object v1, v6

    move-object/from16 v6, p3

    move-object v4, v2

    move-object/from16 p3, v10

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object/from16 v2, p4

    invoke-direct/range {v0 .. v7}, Lkd1/d$a;-><init>(Lj92/t;Ljava/lang/String;Lzr2/a;Lod1/u;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)V

    move-object/from16 v27, v1

    move-object v5, v2

    move-object v1, v3

    move-object v2, v4

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v0

    :goto_12
    check-cast v7, Lc93/m;

    invoke-static {v5, v2, v1, v7, v12}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    const/high16 v0, 0x1c00000

    and-int/2addr v0, v14

    const/high16 v3, 0x800000

    if-ne v0, v3, :cond_22

    move v7, v10

    goto :goto_13

    :cond_22
    move v7, v9

    :goto_13
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v7, :cond_23

    if-ne v0, v15, :cond_24

    :cond_23
    new-instance v0, Liy0/a;

    const/16 v3, 0x9

    invoke-direct {v0, v8, v3}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v14, v0

    check-cast v14, Lc93/a;

    new-instance v0, Lc4/a0;

    invoke-direct {v0, v10, v9, v9}, Lc4/a0;-><init>(ZZZ)V

    move-object v3, v0

    new-instance v0, Lgt1/m;

    move-object/from16 v2, p3

    move-object v1, v5

    move-object v5, v8

    move v11, v9

    move-object v4, v13

    move-object/from16 v8, v16

    move-object/from16 v10, v18

    move-object/from16 v9, v19

    move-object/from16 v7, v20

    move-object v13, v3

    move/from16 v3, v21

    invoke-direct/range {v0 .. v10}, Lgt1/m;-><init>(Ljava/lang/String;Ljava/lang/String;ZLj02/j;Lc93/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    move-object v8, v5

    const v1, 0xb2bf62

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x1b0

    invoke-static {v14, v13, v0, v12, v1}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    if-eqz v3, :cond_26

    invoke-static {v7}, Lkd1/d;->C(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_26

    if-eqz v4, :cond_26

    const v0, 0x75e84a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_25

    new-instance v0, Ljt1/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v7}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v0, Lc93/a;

    new-instance v1, Ljp1/k;

    const/4 v3, 0x1

    invoke-direct {v1, v8, v7, v4, v3}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x1ce894de

    invoke-static {v3, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    new-instance v1, Lj21/d;

    const/4 v3, 0x4

    invoke-direct {v1, v3, v7, v4}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x52054d1c

    invoke-static {v3, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    new-instance v1, Lkd1/c;

    const/4 v3, 0x0

    invoke-direct {v1, v4, v3}, Lkd1/c;-><init>(Lj02/j;I)V

    const v3, 0x6c93a93b

    invoke-static {v3, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    new-instance v1, Lkd1/c;

    const/4 v3, 0x1

    invoke-direct {v1, v4, v3}, Lkd1/c;-><init>(Lj02/j;I)V

    const v3, -0x78ddfaa6

    invoke-static {v3, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    const v25, 0x36c36

    const/16 v26, 0x3c4

    const/4 v14, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v24, v12

    move-object v12, v0

    invoke-static/range {v12 .. v26}, Ldc/a;->a(Lc93/a;Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Li2/a1;JJLc4/a0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v24

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_26
    move-object v0, v12

    const v1, 0x824c57

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_14
    move-object v6, v2

    move-object v7, v4

    move-object/from16 v4, v27

    goto :goto_15

    :cond_27
    move-object v0, v12

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v7, v3

    move-object v4, v6

    move-object v6, v10

    :goto_15
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_28

    new-instance v0, Lb90/b;

    const/16 v11, 0x9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lb90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final s(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lkd1/d;->D(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lc93/a;Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v1, Lcp0/t0;

    const/4 v0, 0x2

    invoke-direct {v1, p0, p1, v0}, Lcp0/t0;-><init>(Lc93/a;Lp1/c1;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, v1

    check-cast v2, Lc93/a;

    new-instance p0, Lkd1/b;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Lkd1/b;-><init>(Lj02/j;I)V

    const p1, 0x35a95d01

    invoke-static {p1, v10, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x30000000

    const/16 v12, 0x1fe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkd1/d;->D(Lp1/c1;Z)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lj02/j;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    const-string v0, "$this$TextButton"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lj02/j;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v4

    const/16 v26, 0x0

    const v27, 0x3fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lp1/c1;Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_1

    new-instance p2, Ljt1/b;

    const/4 p3, 0x2

    invoke-direct {p2, p3, p0}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v9, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p2

    check-cast v1, Lc93/a;

    new-instance p0, Lkd1/b;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lkd1/b;-><init>(Lj02/j;I)V

    const p1, 0x6ac6153f

    invoke-static {p1, v9, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x30000006

    const/16 v11, 0x1fe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lkd1/d;->D(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lj02/j;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    const-string v0, "$this$TextButton"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lj02/j;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v4

    const/16 v26, 0x0

    const v27, 0x3fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lj02/j;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lj02/j;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v3, 0x6

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v4

    const/16 v26, 0x0

    const v27, 0x3fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
