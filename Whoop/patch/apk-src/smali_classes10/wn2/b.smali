.class final Lwn2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lio2/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lwn2/b;",
        "Lm91/f;",
        "Lio2/h;",
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
        "(Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "universal-checkout_release"
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

.method public static synthetic a(Lwn2/b;Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwn2/b;->c(Lwn2/b;Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lwn2/b;Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lwn2/b;->b(Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lio2/h;

    invoke-virtual/range {p0 .. p5}, Lwn2/b;->b(Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lio2/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move v7, p5

    const-string v1, "modifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p4

    check-cast v8, Lp1/q;

    const v1, 0x6660ae18

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v2, v7, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, v7, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, v7, 0x180

    if-nez v2, :cond_6

    invoke-virtual {v8, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_6
    move v9, v1

    and-int/lit16 v1, v9, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x1

    if-eq v1, v2, :cond_7

    move v1, v3

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    :goto_5
    and-int/lit8 v2, v9, 0x1

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    int-to-float v1, v3

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v2, v1

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit16 v0, v0, 0x180

    shr-int/lit8 v2, v9, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v0, v2

    shl-int/lit8 v2, v9, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int v5, v0, v2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p2

    move-object v3, p3

    move-object v4, v8

    invoke-static/range {v0 .. v6}, Lio2/g;->e(Lio2/h;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_8
    move-object v4, v8

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lwn2/a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v5}, Lwn2/a;-><init>(Lwn2/b;Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
