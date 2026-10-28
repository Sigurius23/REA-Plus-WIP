.class public final Lr21/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lr21/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lr21/d;",
        "Lm91/f;",
        "Lr21/c;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
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
.field public static final a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lr21/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr21/d;->d(Lkotlin/jvm/functions/Function1;Lr21/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr21/d;Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lr21/d;->e(Lr21/d;Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lr21/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lr21/c;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lr21/d;Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lr21/d;->c(Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lr21/c;

    invoke-virtual/range {p0 .. p5}, Lr21/d;->c(Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lr21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lr21/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move/from16 v14, p5

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v1, 0x24fcaf64

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit16 v2, v14, 0x180

    const/16 v4, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v2, v5, :cond_6

    move v2, v7

    goto :goto_4

    :cond_6
    move v2, v6

    :goto_4
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v9, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v12}, Lr21/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v5, v2

    invoke-virtual {v12}, Lr21/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v12}, Lr21/c;->f()Lr21/a;

    move-result-object v8

    invoke-virtual {v12}, Lr21/c;->c()Ly71/g;

    move-result-object v10

    if-eqz v10, :cond_7

    new-instance v11, Lkd1/o$a;

    invoke-virtual {v10}, Ly71/g;->b()I

    move-result v10

    invoke-direct {v11, v10}, Lkd1/o$a;-><init>(I)V

    :goto_5
    move-object v10, v5

    goto :goto_6

    :cond_7
    const/4 v11, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual {v12}, Lr21/c;->b()Z

    move-result v5

    move v15, v6

    invoke-virtual {v12}, Lr21/c;->e()Lkd1/o;

    move-result-object v6

    move/from16 v16, v7

    invoke-virtual {v12}, Lr21/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    and-int/lit16 v15, v1, 0x380

    if-ne v15, v4, :cond_8

    move/from16 v4, v16

    goto :goto_7

    :cond_8
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v15, v1, 0x70

    if-ne v15, v3, :cond_9

    goto :goto_8

    :cond_9
    const/16 v16, 0x0

    :goto_8
    or-int v3, v4, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_b

    :cond_a
    new-instance v4, Lqt2/e;

    const/16 v3, 0x8

    invoke-direct {v4, v3, v13, v12}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lc93/a;

    and-int/lit8 v1, v1, 0xe

    move-object v3, v8

    move-object v8, v4

    move-object v4, v11

    const/4 v11, 0x0

    move-object/from16 v17, v10

    move v10, v1

    move-object/from16 v1, v17

    invoke-static/range {v0 .. v11}, Lr21/f;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lq51/a;

    const/16 v6, 0x17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v12

    move-object v4, v13

    move v5, v14

    invoke-direct/range {v0 .. v6}, Lq51/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method
