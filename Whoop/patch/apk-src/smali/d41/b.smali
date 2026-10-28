.class public final Ld41/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ld41/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ld41/b;",
        "Lm91/f;",
        "Ld41/h;",
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
        "(Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ld41/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld41/b;->d(Lkotlin/jvm/functions/Function1;Ld41/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ld41/b;Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ld41/b;->e(Ld41/b;Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ld41/h;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ld41/h;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ld41/b;Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ld41/b;->c(Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ld41/h;

    invoke-virtual/range {p0 .. p5}, Ld41/b;->c(Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ld41/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ld41/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p5

    const-string v1, "modifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v1, -0x147a1fb7

    invoke-virtual {v6, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eq v2, v4, :cond_6

    move v2, v7

    goto :goto_4

    :cond_6
    move v2, v5

    :goto_4
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v6, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v9}, Ld41/h;->c()Ld11/a;

    move-result-object v2

    invoke-virtual {v9}, Ld41/h;->f()Ld41/g;

    move-result-object v4

    invoke-virtual {v9}, Ld41/h;->g()Ld41/j;

    move-result-object v8

    move-object v12, v4

    invoke-virtual {v9}, Ld41/h;->e()Z

    move-result v4

    and-int/lit16 v13, v1, 0x380

    if-ne v13, v3, :cond_7

    move v5, v7

    :cond_7
    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_8

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_9

    :cond_8
    new-instance v5, Ld30/l;

    const/4 v3, 0x2

    invoke-direct {v5, v3, v10, v9}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lc93/a;

    and-int/lit8 v7, v1, 0xe

    move-object v3, v8

    const/4 v8, 0x0

    move-object v0, p1

    move-object v1, v12

    invoke-static/range {v0 .. v8}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_a
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lc41/f5;

    const/16 v6, 0x12

    move-object v1, p0

    move-object v2, p1

    move-object v3, v9

    move-object v4, v10

    move v5, v11

    invoke-direct/range {v0 .. v6}, Lc41/f5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
