.class public final Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/stories/OnboardingStoriesDebugFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\u0008\u001a\u00020\u0005*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0007J3\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;",
        "Lm91/f;",
        "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "h",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "i",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->g(Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->e(Lkotlin/jvm/functions/Function1;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->f(Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    const-string v0, "$this$Button"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v1, v5, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v27, 0x0

    const v28, 0x1fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v4

    move-object v4, v0

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method private final i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 v0, 0x8

    int-to-float v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    invoke-virtual/range {p0 .. p5}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v1, p5

    const-string v0, "modifier"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, -0x5debf547

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x30

    if-nez v0, :cond_1

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit16 v7, v1, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_3

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v1, 0xc00

    if-nez v7, :cond_5

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x800

    goto :goto_3

    :cond_4
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v0, 0x491

    const/16 v9, 0x490

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-eq v7, v9, :cond_6

    move/from16 v7, v19

    goto :goto_4

    :cond_6
    move/from16 v7, v18

    :goto_4
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v15, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_b

    sget-object v7, Lg1/v0;->a:Ll0/l1;

    const/4 v7, 0x0

    const/16 v9, 0x18

    const/high16 v10, 0x3e800000    # 0.25f

    invoke-static {v10, v10, v10, v7, v9}, Li2/w0;->f(FFFFI)J

    move-result-wide v9

    const/16 v16, 0x6

    const/16 v17, 0xe

    move v11, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move/from16 v20, v13

    const-wide/16 v13, 0x0

    move/from16 v2, v20

    invoke-static/range {v7 .. v17}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v13

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-direct {v3, v7}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;->h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    and-int/lit16 v7, v0, 0x380

    if-ne v7, v2, :cond_7

    move/from16 v2, v19

    goto :goto_5

    :cond_7
    move/from16 v2, v18

    :goto_5
    and-int/lit8 v0, v0, 0x70

    const/16 v7, 0x20

    if-ne v0, v7, :cond_8

    move/from16 v18, v19

    :cond_8
    or-int v0, v2, v18

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_9

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_a

    :cond_9
    new-instance v2, Ll01/q;

    const/16 v0, 0x11

    invoke-direct {v2, v6, v5, v0}, Ll01/q;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v7, v2

    check-cast v7, Lc93/a;

    new-instance v0, Lih1/f;

    const/16 v2, 0x14

    invoke-direct {v0, v2, v3, v5}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x77ca5f37

    invoke-static {v2, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/high16 v17, 0x30000000

    const/16 v18, 0x17c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v15

    move-object v15, v0

    invoke-static/range {v7 .. v18}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v16

    goto :goto_6

    :cond_b
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_c

    new-instance v0, Llf0/p1;

    const/16 v2, 0xa

    invoke-direct/range {v0 .. v6}, Llf0/p1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method
