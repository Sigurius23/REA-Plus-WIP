.class public final Lzq2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loq2/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Loq2/c<",
        "Lzq2/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzq2/l;",
        "Loq2/c;",
        "Lzq2/f;",
        "<init>",
        "()V",
        "state",
        "",
        "isCurrentStep",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzq2/l;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzq2/l;Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzq2/l;->h(Lzq2/l;Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzq2/l;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lzq2/l;Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lzq2/l;->e(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Llr2/d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p1, Lzq2/f;

    invoke-virtual/range {p0 .. p5}, Lzq2/l;->e(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public e(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq2/f;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, -0x475e2f43

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p4, p2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    const/16 v2, 0x100

    if-nez v1, :cond_5

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v3, 0x92

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_6

    move v1, v4

    goto :goto_4

    :cond_6
    move v1, v5

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p4, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {p4, v5}, Lkr2/b;->y(Landroidx/compose/runtime/Composer;I)Z

    move-result v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_a

    const v1, -0x295be563

    invoke-virtual {p4, v1}, Lp1/q;->e0(I)V

    and-int/lit16 v1, v0, 0x380

    if-ne v1, v2, :cond_7

    goto :goto_5

    :cond_7
    move v4, v5

    :goto_5
    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_8

    if-ne v1, v3, :cond_9

    :cond_8
    new-instance v1, Lwo1/h;

    const/16 v2, 0x1a

    invoke-direct {v1, p3, v2}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p1, p2, v1, p4, v0}, Lzq2/k;->j(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v1, -0x2959bf61

    invoke-virtual {p4, v1}, Lp1/q;->e0(I)V

    and-int/lit16 v1, v0, 0x380

    if-ne v1, v2, :cond_b

    goto :goto_6

    :cond_b
    move v4, v5

    :goto_6
    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_c

    if-ne v1, v3, :cond_d

    :cond_c
    new-instance v1, Lwo1/h;

    const/16 v2, 0x1b

    invoke-direct {v1, p3, v2}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v1, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p1, p2, v1, p4, v0}, Lzq2/i;->k(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_f

    new-instance v0, Lrq2/w;

    const/16 v2, 0xe

    move-object v3, p0

    move-object v4, p1

    move v6, p2

    move-object v5, p3

    move v1, p5

    invoke-direct/range {v0 .. v6}, Lrq2/w;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method
