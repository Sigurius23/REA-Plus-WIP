.class public final Lcom/whoop/profile/view/ProfileScreenContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aY\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a-\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;",
        "screenContent",
        "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
        "metadata",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function0;",
        "onOpenBottomSheet",
        "",
        "onScrollOffsetChanged",
        "ProfileContentArea",
        "(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/o;",
        "itemWrapper",
        "",
        "ProfileScreenItem",
        "(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "PreviewProfileContentArea",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lm91/p;",
        "profileItemViewFactory",
        "Lm91/p;",
        "profile_release"
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
.field private static final profileItemViewFactory:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lcom/whoop/profile/view/ProfileScreenContentKt;->profileItemViewFactory:Lm91/p;

    return-void
.end method

.method public static final PreviewProfileContentArea(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p0, Lp1/q;

    const v0, 0x7e3d1017

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lc41/l4;->v()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lkotlin/jvm/internal/k0;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    invoke-static {v3, v2, v1}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v3, v2, v1}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Lfy1/i;->a:Lfy1/i;

    invoke-static {v2, v3, v1}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v2, v3}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v2, Lb3/v1;->l:Lp1/u2;

    iget-object v3, v1, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v2, v1, v3}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v1

    new-array v1, v1, [Lp1/u1;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lp1/u1;

    new-instance v2, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;

    invoke-direct {v2, v0}, Lcom/whoop/profile/view/ProfileScreenContentKt$PreviewProfileContentArea$$inlined$WhoopPreviewTheme$1;-><init>(Ljava/util/List;)V

    const v0, -0x124c2861

    invoke-static {v0, p0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lbz0/c;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Lbz0/c;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final PreviewProfileContentArea$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->PreviewProfileContentArea(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileContentArea(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;",
            "Lcom/whoop/profile/presentation/ProfileViewState$Metadata;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "screenContent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v0, -0x7e683f29

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v6, 0x180

    const/16 v5, 0x100

    if-nez v4, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v5

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v9, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_6

    move-object/from16 v9, p3

    invoke-virtual {v7, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_4

    :cond_8
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v11, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-virtual {v7, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_6

    :cond_b
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit16 v12, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v15, 0x0

    if-eq v12, v13, :cond_c

    const/4 v12, 0x1

    goto :goto_8

    :cond_c
    move v12, v15

    :goto_8
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v7, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_19

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v12, :cond_d

    new-instance v4, Lcom/whoop/design/models/modal/a;

    const/16 v9, 0x9

    invoke-direct {v4, v9}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lc93/a;

    move-object v9, v4

    :cond_e
    if-eqz v10, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v12, :cond_f

    new-instance v4, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v10, 0x12

    invoke-direct {v4, v10}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v10, v4

    goto :goto_9

    :cond_10
    move-object v10, v11

    :goto_9
    const/4 v4, 0x3

    invoke-static {v15, v15, v7, v4}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v12, :cond_11

    new-instance v4, Lcom/whoop/profile/view/c;

    invoke-direct {v4, v11, v15}, Lcom/whoop/profile/view/c;-><init>(Ln0/u;I)V

    invoke-static {v4}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lp1/t2;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v10, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    and-int/lit16 v4, v0, 0x380

    if-ne v4, v5, :cond_12

    const/4 v13, 0x1

    goto :goto_a

    :cond_12
    move v13, v15

    :goto_a
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_13

    if-ne v14, v12, :cond_14

    :cond_13
    new-instance v14, Lbf0/a;

    const/16 v13, 0x1b

    invoke-direct {v14, v3, v13}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lc93/a;

    invoke-static {v11, v14, v7, v15}, Lgb1/q;->i(Ln0/u;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v13, v11

    sget-object v11, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v7}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v14

    iget-object v14, v14, Ll0/c2;->e:Ll0/b;

    invoke-static {v14, v7}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v14

    invoke-virtual {v14}, Ll0/x0;->a()F

    move-result v14

    const/4 v15, 0x7

    const/4 v8, 0x0

    invoke-static {v8, v8, v8, v14, v15}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v8

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-ne v4, v5, :cond_15

    const/4 v4, 0x1

    goto :goto_b

    :cond_15
    const/4 v4, 0x0

    :goto_b
    or-int/2addr v4, v14

    and-int/lit16 v0, v0, 0x1c00

    const/16 v5, 0x800

    if-ne v0, v5, :cond_16

    const/4 v14, 0x1

    goto :goto_c

    :cond_16
    const/4 v14, 0x0

    :goto_c
    or-int v0, v4, v14

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_18

    if-ne v4, v12, :cond_17

    goto :goto_d

    :cond_17
    move-object v3, v9

    goto :goto_e

    :cond_18
    :goto_d
    new-instance v0, Lam2/s;

    const/16 v5, 0xb

    move-object v4, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v9

    invoke-direct/range {v0 .. v5}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :goto_e
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/high16 v17, 0x30000

    const/16 v18, 0x1d9

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object v4, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v9, v8

    move-object v8, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v18}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v4

    move-object v4, v3

    goto :goto_f

    :cond_19
    move-object/from16 v16, v7

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object v4, v9

    move-object v5, v11

    :goto_f
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v0, La01/f;

    const/16 v8, 0xf

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final ProfileContentArea$lambda$0$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final ProfileContentArea$lambda$1$0(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentArea$lambda$2$0(Ln0/u;)F
    .locals 1

    iget-object p0, p0, Ln0/u;->e:Ll2/a;

    iget-object v0, p0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Ll2/a;->c:Ljava/lang/Object;

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    int-to-float p0, p0

    return p0

    :cond_0
    iget-object p0, p0, Ll2/a;->c:Ljava/lang/Object;

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    int-to-float p0, p0

    const v0, 0x44834000    # 1050.0f

    add-float/2addr p0, v0

    return p0
.end method

.method private static final ProfileContentArea$lambda$3$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$ScrolledToBottomAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$ScrolledToBottomAnalyticEvent;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentArea$lambda$4$0(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Ln0/q;)Ll83/a0;
    .locals 3

    const-string v0, "$this$LazyColumn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La80/f;

    const/4 v1, 0x7

    invoke-direct {v0, p0, p1, p2, v1}, La80/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const/4 p2, 0x1

    const v1, 0xe8330e2

    invoke-direct {p0, v0, p2, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p4, v0, p0, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance p0, Ll;

    const/16 v2, 0xc

    invoke-direct {p0, v2, p3, p1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lx1/b;

    const p3, -0x3e2da1b5

    invoke-direct {p1, p0, p2, p3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p4, v0, p1, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentArea$lambda$4$0$0(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$item"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    and-int/2addr p5, v1

    move-object v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/ProfileHeaderKt;->ProfileHeader(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentArea$lambda$4$0$1(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    and-int/2addr p4, v1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    const/4 p2, 0x2

    int-to-float p4, p2

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float v5, p4, v0

    const/4 p4, 0x0

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5, p4, p2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x0

    const/16 v8, 0xd

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object p4, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {p4, v3, p3, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p4

    iget-wide v3, p3, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p3, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->f:La3/i;

    invoke-static {p3, p4, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->j:La3/i;

    iget-boolean v4, p3, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p3, v3, p4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p4, La3/k;->d:La3/i;

    invoke-static {p3, p4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p2, -0x599ea476

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;

    const p4, -0x599e9d39

    invoke-virtual {p3, p4}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;->getItemViewState()Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/o;

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p3, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_5

    :cond_4
    new-instance v5, La81/j;

    const/4 v4, 0x3

    invoke-direct {v5, p1, v3, v4}, La81/j;-><init>(Lkotlin/jvm/functions/Function1;Lm91/o;I)V

    invoke-virtual {p3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v4, Lm91/o;->c:I

    invoke-static {v3, v5, p3, v4, v2}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileScreenItem(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x3

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v3, v4, v0, p3}, Ld;->w(FFLb2/t;Lp1/q;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/ProfileViewState$ComponentItem;->getInsetBottom()Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/domain/models/ProfileSectionSpacingType;->getSpacing-D9Ej5fM()F

    move-result p2

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p3, p2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentArea$lambda$4$0$1$0$0$0$0$0(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    invoke-virtual {p1}, Lm91/o;->e()Lm91/u;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileContentArea$lambda$5(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final ProfileScreenItem(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "itemWrapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x129216b8

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_5

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    :goto_4
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    if-eq v2, v3, :cond_6

    move v2, v4

    goto :goto_5

    :cond_6
    const/4 v2, 0x0

    :goto_5
    and-int/2addr v0, v4

    invoke-virtual {p2, v0, v2}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v1, :cond_8

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_7

    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v0, 0x13

    invoke-direct {p1, v0}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_8
    invoke-static {}, Lm91/l;->C()Lp1/t1;

    move-result-object v0

    sget-object v1, Lcom/whoop/profile/view/ProfileScreenContentKt;->profileItemViewFactory:Lm91/p;

    invoke-virtual {v0, v1}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, La0;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0, p1}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x2003d488

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p2, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    move-object v5, p1

    goto :goto_7

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_6

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v3, Lbj0/a;

    const/4 v8, 0x1

    move-object v4, p0

    move v6, p3

    move v7, p4

    invoke-direct/range {v3 .. v8}, Lbj0/a;-><init>(Lm91/o;Lkotlin/jvm/functions/Function1;III)V

    iput-object v3, p1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final ProfileScreenItem$lambda$0$0(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileScreenItem$lambda$1(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

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

    move-object v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object v2, Lcom/whoop/profile/view/ProfileScreenContentKt;->profileItemViewFactory:Lm91/p;

    sget p2, Lm91/o;->c:I

    sget p3, Lm91/p;->b:I

    shl-int/lit8 p3, p3, 0x3

    or-int v6, p2, p3

    const/4 v7, 0x4

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final ProfileScreenItem$lambda$2(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileScreenItem(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->profileItemViewFactory$lambda$0(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$3$0(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$4$0(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$5(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$4$0$1$0$0$0$0$0(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileScreenItem$lambda$1(Lm91/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$1$0(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$0$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenContentKt;->PreviewProfileContentArea$lambda$1(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileScreenItem$lambda$0$0(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileScreenItem$lambda$2(Lm91/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$4$0$0(Lcom/whoop/profile/presentation/ProfileViewState$Metadata;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$4$0$1(Lcom/whoop/profile/presentation/ProfileViewState$ScreenContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ln0/u;)F
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenContentKt;->ProfileContentArea$lambda$2$0(Ln0/u;)F

    move-result p0

    return p0
.end method

.method private static final profileItemViewFactory$lambda$0(Lm91/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/profile/view/components/ContextHubTileViewState;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lcom/whoop/profile/view/components/ContextHubTileItem;

    invoke-direct {v3}, Lcom/whoop/profile/view/components/ContextHubTileItem;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lcom/whoop/profile/view/components/StreaksTileViewState;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lcom/whoop/profile/view/components/StreaksTileItem;

    invoke-direct {v3}, Lcom/whoop/profile/view/components/StreaksTileItem;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object v0

    const-class v2, Lcom/whoop/profile/view/components/ReferralsTileViewState;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lcom/whoop/profile/view/components/ReferralsTileItem;

    invoke-direct {v3}, Lcom/whoop/profile/view/components/ReferralsTileItem;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lwr0/b0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lwr0/x;

    invoke-direct {v1}, Lwr0/x;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
