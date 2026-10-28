.class public final Lln1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lln1/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lln1/b;",
        "Lm91/f;",
        "Lln1/d;",
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
        "(Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "home-customization_release"
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

.method public static synthetic a(Lln1/b;Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lln1/b;->c(Lln1/b;Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lln1/b;Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lln1/b;->b(Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lln1/d;

    invoke-virtual/range {p0 .. p5}, Lln1/b;->b(Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public b(Landroidx/compose/ui/Modifier;Lln1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lln1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p5

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p4

    check-cast v8, Lp1/q;

    const p4, -0x704ba7d9

    invoke-virtual {v8, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, v1, 0x6

    if-nez p4, :cond_1

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, v1

    goto :goto_1

    :cond_1
    move p4, v1

    :goto_1
    and-int/lit8 v0, v1, 0x30

    if-nez v0, :cond_4

    and-int/lit8 v0, v1, 0x40

    if-nez v0, :cond_2

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_2

    :cond_2
    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p4, v0

    :cond_4
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_6

    invoke-virtual {v8, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x100

    goto :goto_4

    :cond_5
    const/16 v0, 0x80

    :goto_4
    or-int/2addr p4, v0

    :cond_6
    and-int/lit16 v0, p4, 0x93

    const/16 v2, 0x92

    if-eq v0, v2, :cond_7

    const/4 v0, 0x1

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    and-int/lit8 v2, p4, 0x1

    invoke-virtual {v8, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lln1/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lln1/d;->c()Z

    move-result v4

    invoke-virtual {p2}, Lln1/d;->a()Lgz0/m0;

    move-result-object v5

    invoke-virtual {p2}, Lln1/d;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    and-int/lit8 v0, p4, 0xe

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr v0, v2

    shl-int/lit8 p4, p4, 0x9

    const/high16 v2, 0x70000

    and-int/2addr p4, v2

    or-int v9, v0, p4

    const/4 v10, 0x0

    move-object v2, p1

    move-object v7, p3

    invoke-static/range {v2 .. v10}, Lln1/c;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLgz0/m0;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_8
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_9

    new-instance v0, Llf0/p1;

    const/16 v2, 0xd

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Llf0/p1;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
