.class public final Lx11/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lx11/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lx11/a;",
        "Lm91/f;",
        "Lx11/c;",
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
        "(Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lx11/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lx11/a;->d(Lkotlin/jvm/functions/Function1;Lx11/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lx11/a;Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lx11/a;->e(Lx11/a;Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lx11/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lx11/c;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lx11/a;Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lx11/a;->c(Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lx11/c;

    invoke-virtual/range {p0 .. p5}, Lx11/a;->c(Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lx11/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lx11/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p4

    check-cast v5, Lp1/q;

    const p4, -0x4a0d1fcf

    invoke-virtual {v5, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x30

    if-nez p4, :cond_1

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/16 p4, 0x20

    goto :goto_0

    :cond_0
    const/16 p4, 0x10

    :goto_0
    or-int/2addr p4, p5

    goto :goto_1

    :cond_1
    move p4, p5

    :goto_1
    and-int/lit16 v0, p5, 0x180

    const/16 v1, 0x100

    if-nez v0, :cond_3

    invoke-virtual {v5, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p4, v0

    :cond_3
    and-int/lit16 v0, p4, 0x91

    const/16 v2, 0x90

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v2, :cond_4

    move v0, v4

    goto :goto_3

    :cond_4
    move v0, v3

    :goto_3
    and-int/lit8 v2, p4, 0x1

    invoke-virtual {v5, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p2}, Lx11/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move v0, v3

    invoke-virtual {p2}, Lx11/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    and-int/lit16 p4, p4, 0x380

    if-ne p4, v1, :cond_5

    move v0, v4

    :cond_5
    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p4, v0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_6

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne v0, p4, :cond_7

    :cond_6
    new-instance v0, Lwr0/r;

    const/4 p4, 0x3

    invoke-direct {v0, p3, p2, p4}, Lwr0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v4, v0

    check-cast v4, Lc93/a;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x0

    invoke-static/range {v1 .. v7}, Lx11/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_8
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_9

    new-instance v0, Lwm1/e;

    const/16 v6, 0x17

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lwm1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
