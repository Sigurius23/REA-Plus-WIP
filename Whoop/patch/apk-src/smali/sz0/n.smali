.class public final Lsz0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lsz0/q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lsz0/n;",
        "Lm91/f;",
        "Lsz0/q;",
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
        "(Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lsz0/n;Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsz0/n;->e(Lsz0/n;Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lsz0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsz0/n;->d(Lkotlin/jvm/functions/Function1;Lsz0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lsz0/q;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lsz0/q;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lsz0/n;Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lsz0/n;->c(Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lsz0/q;

    invoke-virtual/range {p0 .. p5}, Lsz0/n;->c(Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lsz0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lsz0/q;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p5

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "itemState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v5, -0x5bcdaf71

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v6, v3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v3, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v5, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x0

    if-eq v6, v8, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v10

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v4, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v1}, Lsz0/q;->f()Lsz0/f1;

    move-result-object v6

    invoke-virtual {v1}, Lsz0/q;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lsz0/q;->g()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lsz0/q;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lsz0/q;->i()Lsz0/h1;

    move-result-object v12

    move-object v13, v6

    invoke-virtual {v1}, Lsz0/q;->l()Lsz0/g1;

    move-result-object v6

    invoke-virtual {v1}, Lsz0/q;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    move-object v15, v8

    invoke-virtual {v1}, Lsz0/q;->n()Z

    move-result v8

    invoke-virtual {v1}, Lsz0/q;->m()Ly81/f;

    move-result-object v9

    invoke-virtual {v9, v4, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    invoke-virtual {v1}, Lsz0/q;->k()Ly81/f;

    move-result-object v9

    invoke-virtual {v9, v4, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    move-wide/from16 v22, v16

    move/from16 v17, v10

    move-wide/from16 v9, v22

    invoke-virtual {v1}, Lsz0/q;->c()Z

    move-result v16

    and-int/lit16 v0, v5, 0x380

    if-ne v0, v7, :cond_7

    const/16 v17, 0x1

    :cond_7
    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int v0, v17, v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_8

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v7, v0, :cond_9

    :cond_8
    new-instance v7, Ls51/f;

    const/16 v0, 0xc

    invoke-direct {v7, v2, v1, v0}, Ls51/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    and-int/lit8 v0, v5, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x3800

    move-object v1, v13

    const/4 v13, 0x0

    move-object v7, v14

    const/4 v14, 0x0

    move-object v2, v15

    const/4 v15, 0x0

    move-object v5, v12

    move/from16 v22, v0

    move-object/from16 v0, p1

    move-wide/from16 v23, v18

    move/from16 v19, v22

    move-object/from16 v18, v4

    move-object v4, v11

    move-wide/from16 v11, v23

    invoke-static/range {v0 .. v21}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_a
    move-object/from16 v18, v4

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    :goto_5
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lsu1/d;

    const/4 v2, 0x6

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v1, p5

    invoke-direct/range {v0 .. v6}, Lsu1/d;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
