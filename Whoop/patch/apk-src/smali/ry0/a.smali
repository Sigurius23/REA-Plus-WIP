.class public final Lry0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lry0/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lry0/a;",
        "Lm91/f;",
        "Lry0/d;",
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
        "(Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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

.method public static synthetic a(Lry0/a;Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lry0/a;->e(Lry0/a;Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lry0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry0/a;->d(Lkotlin/jvm/functions/Function1;Lry0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lry0/d;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, Lry0/d;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lry0/a;Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lry0/a;->c(Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lry0/d;

    invoke-virtual/range {p0 .. p5}, Lry0/a;->c(Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lry0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lry0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move v7, p5

    const-string v2, "modifier"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "itemState"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p4

    check-cast v4, Lp1/q;

    const v2, 0xeb88713

    invoke-virtual {v4, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v7, 0x180

    const/16 v5, 0x100

    if-nez v3, :cond_5

    invoke-virtual {v4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v2, 0x93

    const/16 v6, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v3, v6, :cond_6

    move v3, v9

    goto :goto_4

    :cond_6
    move v3, v8

    :goto_4
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v4, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    and-int/lit16 v3, v2, 0x380

    if-ne v3, v5, :cond_7

    move v8, v9

    :cond_7
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_8

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_9

    :cond_8
    new-instance v5, Lqt2/e;

    const/16 v3, 0x13

    invoke-direct {v5, v3, p3, p2}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lc93/a;

    and-int/lit8 v2, v2, 0x7e

    const/16 v6, 0x8

    const/4 v3, 0x0

    move-object v0, v5

    move v5, v2

    move-object v2, v0

    move-object v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Lry0/b;->f(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_b

    new-instance v0, Lr90/b;

    const/16 v6, 0x8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lr90/b;-><init>(Lm91/f;Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
