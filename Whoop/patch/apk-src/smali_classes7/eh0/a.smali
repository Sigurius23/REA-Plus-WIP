.class public final Leh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Leh0/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Leh0/a;",
        "Lm91/f;",
        "Leh0/d;",
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
        "(Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "bot_release"
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

.method public static synthetic a(Leh0/a;Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Leh0/a;->c(Leh0/a;Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Leh0/a;Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Leh0/a;->b(Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Leh0/d;

    invoke-virtual/range {p0 .. p5}, Leh0/a;->b(Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Leh0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Leh0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v1, "modifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p4

    check-cast v5, Lp1/q;

    const v1, 0x4829c703

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p5

    goto :goto_1

    :cond_1
    move v1, p5

    :goto_1
    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-eq v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v3, v1, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    move v2, v1

    invoke-virtual {p2}, Leh0/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move v3, v2

    invoke-virtual {p2}, Leh0/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move v4, v3

    invoke-virtual {p2}, Leh0/d;->a()Lsz0/c0;

    move-result-object v3

    move v6, v4

    invoke-virtual {p2}, Leh0/d;->b()Ljava/util/List;

    move-result-object v4

    and-int/lit8 v6, v6, 0xe

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v7, 0x3

    or-int/2addr v6, v8

    shl-int/lit8 v7, v7, 0x6

    or-int/2addr v6, v7

    sget v7, Lsz0/c0;->k:I

    shl-int/lit8 v7, v7, 0x9

    or-int/2addr v6, v7

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Leh0/c;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_6

    new-instance v0, Le51/a;

    const/4 v2, 0x7

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move v1, p5

    invoke-direct/range {v0 .. v6}, Le51/a;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method
