.class public final Lbd1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lbd1/y;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbd1/x;",
        "Lm91/f;",
        "Lbd1/y;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "b",
        "(Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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

.method public static synthetic a(Lbd1/x;Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbd1/x;->c(Lbd1/x;Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lbd1/x;Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lbd1/x;->b(Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lbd1/y;

    invoke-virtual/range {p0 .. p5}, Lbd1/x;->b(Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lbd1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lbd1/y;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    const-string v0, "modifier"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x30872d21

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x30

    const/16 v5, 0x10

    if-nez v1, :cond_2

    and-int/lit8 v1, p5, 0x40

    if-nez v1, :cond_0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    or-int v1, p5, v1

    goto :goto_2

    :cond_2
    move/from16 v1, p5

    :goto_2
    and-int/lit8 v6, v1, 0x11

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v5, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    move v6, v8

    :goto_3
    and-int/2addr v1, v7

    invoke-virtual {v0, v1, v6}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v3}, Lbd1/y;->a()Lkd1/h;

    move-result-object v1

    invoke-virtual {v1}, Lkd1/h;->a()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v25, v6

    check-cast v25, Lb91/a;

    invoke-virtual {v1}, Lkd1/h;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lkd1/h;->c()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, Lb91/b$d;->a:Lb91/b$d;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    sget-object v7, Lb91/b$g;->a:Lb91/b$g;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    sget-object v7, Lb91/b$h;->a:Lb91/b$h;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    sget-object v7, Lb91/b$c;->a:Lb91/b$c;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    :cond_4
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "toUpperCase(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    sget-object v7, Lb91/b$g;->a:Lb91/b$g;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    sget-object v7, Lb91/b$c;->a:Lb91/b$c;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    const v1, 0x2b70aa4b

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-static {v1, v0, v7, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    goto :goto_5

    :cond_7
    :goto_4
    const v1, 0x2b70a333

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v1, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v9

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    move-wide v7, v9

    :goto_5
    int-to-float v1, v5

    const/4 v5, 0x0

    const/4 v9, 0x2

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v1, v5, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v29, v5, 0x12

    const v30, 0x2fff8

    move-object v5, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x30

    move-object/from16 v27, v0

    move-object v0, v5

    move-object v5, v6

    move-object v6, v1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v27

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_6

    :cond_8
    move-object v1, v0

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_9

    new-instance v0, Lm;

    const/16 v6, 0x19

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
