.class public final Ljh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ljh0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ljh0/a;",
        "Lm91/f;",
        "Ljh0/c;",
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
        "(Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Ljh0/a;Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljh0/a;->e(Ljh0/a;Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljh0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljh0/a;->d(Lkotlin/jvm/functions/Function1;Ljh0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljh0/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ljh0/c;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljh0/a;Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ljh0/a;->c(Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ljh0/c;

    invoke-virtual/range {p0 .. p5}, Ljh0/a;->c(Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ljh0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljh0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v7, p3

    move/from16 v8, p5

    const-string v1, "modifier"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v1, 0x6a666267

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_4

    and-int/lit8 v2, v8, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, v8, 0x180

    const/16 v5, 0x100

    if-nez v2, :cond_6

    invoke-virtual {v4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move v2, v5

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_6
    and-int/lit16 v2, v1, 0x93

    const/16 v6, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v2, v6, :cond_7

    move v2, v10

    goto :goto_5

    :cond_7
    move v2, v9

    :goto_5
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p2}, Ljh0/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v6, v2

    invoke-virtual {p2}, Ljh0/c;->b()Ljava/lang/Integer;

    move-result-object v2

    and-int/lit16 v11, v1, 0x380

    if-ne v11, v5, :cond_8

    move v5, v10

    goto :goto_6

    :cond_8
    move v5, v9

    :goto_6
    and-int/lit8 v11, v1, 0x70

    if-eq v11, v3, :cond_9

    and-int/lit8 v3, v1, 0x40

    if-eqz v3, :cond_a

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    move v9, v10

    :cond_a
    or-int v3, v5, v9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_b

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_c

    :cond_b
    new-instance v5, Lj11/q;

    const/4 v3, 0x4

    invoke-direct {v5, v3, p3, p2}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v3, v5

    check-cast v3, Lc93/a;

    and-int/lit8 v1, v1, 0xe

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v5, v1

    move-object v1, v6

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Ljh0/b;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_d
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_e

    new-instance v0, Lj41/a;

    const/4 v6, 0x6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move v5, v8

    invoke-direct/range {v0 .. v6}, Lj41/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
