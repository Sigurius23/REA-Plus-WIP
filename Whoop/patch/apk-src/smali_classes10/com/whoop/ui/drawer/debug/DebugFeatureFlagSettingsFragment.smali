.class public final Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006 \u00b2\u0006\u000c\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lnm2/e;",
        "flag",
        "Ll83/a0;",
        "G",
        "(Lnm2/e;Landroidx/compose/runtime/Composer;I)V",
        "J",
        "(Landroidx/compose/runtime/Composer;I)V",
        "V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "onStart",
        "Lnm2/c;",
        "w",
        "Ll83/h;",
        "O",
        "()Lnm2/c;",
        "viewModel",
        "x",
        "a",
        "Lnm2/d;",
        "viewState",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final x:Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$a;

.field public static final y:I


# instance fields
.field private final w:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->x:Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$h;

    invoke-direct {v0, p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$h;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$i;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->H(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->K(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->R(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->I(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lnm2/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->U(Lnm2/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->S(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final G(Lnm2/e;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x28174906

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x1

    if-eq v6, v7, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v3, v9

    invoke-virtual {v8, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v10

    int-to-float v12, v9

    int-to-float v4, v4

    mul-float/2addr v12, v4

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v10, v11, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->K:Lb2/l;

    sget-object v13, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v13, v11, v8, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    move v13, v6

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v16, v7

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_5

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v8, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_6
    invoke-static {v5, v8, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x3

    int-to-float v5, v5

    mul-float/2addr v5, v4

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v8, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lnm2/e;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v3, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v10, v7

    const-wide/16 v17, 0x0

    cmpl-double v10, v10, v17

    if-lez v10, :cond_8

    :goto_5
    move-object v10, v3

    move-object v3, v4

    goto :goto_6

    :cond_8
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v7, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v27, v7, 0x12

    const v28, 0x2fff8

    move-object/from16 v21, v8

    const-wide/16 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    move/from16 v17, v13

    const-wide/16 v12, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v25

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move-object/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v2, v29

    move/from16 v34, v30

    move/from16 v1, v31

    const/4 v0, 0x2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual/range {p1 .. p1}, Lnm2/e;->f()Z

    move-result v23

    invoke-virtual {v2, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b()J

    move-result-wide v3

    invoke-virtual {v2, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b()J

    move-result-wide v5

    invoke-virtual {v2, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->G()J

    move-result-wide v1

    const-wide/16 v19, 0x0

    const/16 v22, 0x3f0

    const v7, 0x3e99999a    # 0.3f

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v21, v8

    move-wide v8, v1

    invoke-static/range {v3 .. v22}, Ltx/f;->A(JJFJJFJJJJLandroidx/compose/runtime/Composer;I)Lg1/x1;

    move-result-object v7

    move-object/from16 v8, v21

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v15, v0, v1

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v33

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move-object/from16 v2, p1

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_9

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_a

    :cond_9
    new-instance v3, Llq0/d;

    const/16 v1, 0x1a

    invoke-direct {v3, v1, v0, v2}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x180

    const/16 v10, 0x18

    const/4 v6, 0x0

    move/from16 v3, v23

    invoke-static/range {v3 .. v10}, Lg1/r7;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/o7;Landroidx/compose/runtime/Composer;II)V

    move/from16 v12, v34

    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    move-object v2, v1

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_c

    new-instance v3, Lmx1/i;

    const/16 v4, 0x9

    move/from16 v5, p3

    invoke-direct {v3, v0, v2, v5, v4}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final H(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;Z)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->O()Lnm2/c;

    move-result-object p0

    invoke-virtual {p1}, Lnm2/e;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnm2/c;->A(Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-direct {p0, p1, p3, p2}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->G(Lnm2/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final J(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move/from16 v0, p2

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, 0xcda9e8c

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lhi0/j;->Q:I

    invoke-static {v1, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v1, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v21

    invoke-virtual {v4, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v4, v1, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b()J

    move-result-wide v4

    sget-object v8, Li2/w0;->a:Li2/v0;

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v4, v5, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v13, Lw3/k;

    const/4 v4, 0x3

    invoke-direct {v13, v4}, Lw3/k;-><init>(I)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v25, v4, 0x12

    const v26, 0x2fdf8

    move-object/from16 v23, v1

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v1

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lk71/i;

    const/16 v3, 0x15

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v0, v3}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_2
    move-object/from16 v4, p0

    return-void
.end method

.method private static final K(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-direct {p0, p2, p1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->J(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic L(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lnm2/e;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->G(Lnm2/e;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic M(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)Lnm2/c;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->O()Lnm2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->V()V

    return-void
.end method

.method private final O()Lnm2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnm2/c;

    return-object v0
.end method

.method private static final P(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p2, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-direct {v0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->O()Lnm2/c;

    move-result-object v1

    invoke-virtual {v1}, Lnm2/c;->E()Lec3/t1;

    move-result-object v6

    new-instance v7, Lnm2/d;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lnm2/d;-><init>(Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x0

    const/4 v11, 0x2

    move-object v9, v15

    invoke-static/range {v6 .. v11}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    const/4 v5, 0x3

    invoke-static {v3, v3, v15, v5}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v6

    invoke-static {v1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->Q(Lp1/t2;)Lnm2/d;

    move-result-object v7

    invoke-virtual {v7}, Lnm2/d;->c()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnm2/e;

    invoke-virtual {v9}, Lnm2/e;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v8, v6, v15, v3}, Lhy0/v0;->u(Ljava/lang/Object;Ln0/u;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v11, v10, v15, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v15, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v15, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_2

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_2
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v15, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-nez v12, :cond_3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    :cond_3
    invoke-static {v11, v15, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v15, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->Q(Lp1/t2;)Lnm2/d;

    move-result-object v9

    invoke-virtual {v9}, Lnm2/d;->d()Z

    move-result v9

    if-eqz v9, :cond_5

    const v9, -0x5b77ac03

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    invoke-direct {v0, v15, v3}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->J(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    const v9, -0x5b76d9cb

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    :goto_3
    sget-object v3, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    sget v9, Lhi0/j;->c0:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v3

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_6

    if-ne v10, v11, :cond_7

    :cond_6
    new-instance v10, Llive/hms/video/connection/degredation/a;

    const/16 v9, 0x18

    invoke-direct {v10, v0, v9}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v9, v10

    check-cast v9, Lc93/a;

    sget v10, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v13, v10, 0x3

    const/16 v14, 0x35

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 p1, v7

    move-object v7, v3

    move/from16 v3, p1

    move/from16 p1, v5

    move-object v5, v12

    move-object v12, v15

    move-object/from16 v15, v16

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v12

    invoke-static {v1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->Q(Lp1/t2;)Lnm2/d;

    move-result-object v6

    invoke-virtual {v6}, Lnm2/d;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v6, Lhi0/j;->S0:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    int-to-float v6, v4

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v6, v10

    const/4 v11, 0x0

    invoke-static {v5, v6, v11, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v22, 0x0

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v23, v6

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v21, v23

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_8

    if-ne v13, v15, :cond_9

    :cond_8
    new-instance v13, Llc0/c;

    const/16 v12, 0x1a

    invoke-direct {v13, v0, v12}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v22, v13

    check-cast v22, Lkotlin/jvm/functions/Function1;

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v12, 0x3

    or-int/lit8 v12, v12, 0x6

    sget v13, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v13, v13, 0x6

    or-int v24, v12, v13

    const/16 v25, 0x0

    const/16 v26, 0x3bf8

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move v12, v10

    move v13, v11

    const-wide/16 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v27, v17

    const/16 v17, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v32, v28

    move/from16 v31, v30

    invoke-static/range {v6 .. v26}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v23

    float-to-double v6, v3

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_a

    goto :goto_4

    :cond_a
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v3, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move/from16 v7, v31

    const/4 v8, 0x0

    invoke-static {v6, v7, v8, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v9, v2

    mul-float v9, v9, v27

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_b

    move-object/from16 v10, v32

    if-ne v11, v10, :cond_c

    goto :goto_5

    :cond_b
    move-object/from16 v10, v32

    :goto_5
    new-instance v11, Llq0/d;

    const/16 v12, 0x19

    invoke-direct {v11, v12, v1, v0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v14, v11

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6000

    const/16 v17, 0x1ec

    move v13, v8

    const/4 v8, 0x0

    move-object/from16 v32, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v29, v13

    const/4 v13, 0x0

    move/from16 v21, v7

    move-object/from16 v7, v18

    move-object/from16 v2, v32

    invoke-static/range {v6 .. v17}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v7, Lny0/v;->TextLarge:Lny0/v;

    sget v6, Lhi0/j;->R0:I

    invoke-static {v15, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v6, v15, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b()J

    move-result-wide v10

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_d

    if-ne v9, v2, :cond_e

    :cond_d
    new-instance v9, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$b;

    invoke-direct {v9, v0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lj93/g;

    invoke-static {v1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->Q(Lp1/t2;)Lnm2/d;

    move-result-object v0

    invoke-virtual {v0}, Lnm2/d;->d()Z

    move-result v0

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v2, p1

    int-to-float v2, v2

    mul-float v2, v2, v27

    const/4 v13, 0x0

    invoke-static {v1, v2, v13, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v22, 0x0

    const/16 v24, 0x5

    const/16 v20, 0x0

    move/from16 v23, v2

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v14, v9

    check-cast v14, Lc93/a;

    const/16 v16, 0x36

    const/16 v17, 0x60

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v9, v0

    invoke-static/range {v6 .. v17}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_f
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Q(Lp1/t2;)Lnm2/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lnm2/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnm2/d;

    return-object p0
.end method

.method private static final R(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhy0/x0$c;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->O()Lnm2/c;

    move-result-object p0

    check-cast p1, Lhy0/x0$c;

    invoke-virtual {p1}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnm2/c;->K(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lhy0/x0$a;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->O()Lnm2/c;

    move-result-object p0

    invoke-virtual {p0}, Lnm2/c;->y()V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lp1/t2;Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->Q(Lp1/t2;)Lnm2/d;

    move-result-object p0

    invoke-virtual {p0}, Lnm2/d;->c()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ln72/b;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ln72/b;-><init>(I)V

    sget-object v1, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$c;->w:Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$c;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$d;

    invoke-direct {v3, v0, p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$e;

    invoke-direct {v0, v1, p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v1, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$f;

    invoke-direct {v1, p0, p1}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$f;-><init>(Ljava/util/List;Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v4, 0x2fd4df92

    invoke-direct {p0, v1, p1, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    invoke-virtual {p2, v2, v3, v0, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lnm2/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnm2/e;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final V()V
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment$g;-><init>(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Lq83/d;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/b0;->a(Lc93/m;)Lbc3/c2;

    return-void
.end method

.method public static synthetic y(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->P(Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lp1/t2;Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->T(Lp1/t2;Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x273691d

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStart()V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;->O()Lnm2/c;

    move-result-object v0

    invoke-virtual {v0}, Lnm2/c;->G()V

    return-void
.end method
