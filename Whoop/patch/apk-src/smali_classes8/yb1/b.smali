.class public abstract Lyb1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyb1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;",
        "style",
        "Lk61/a;",
        "k",
        "(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/a;",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->t(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->l(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->m(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->n(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->u(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->s(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->p(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->r(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->q(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lyb1/b;->o(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/a;
    .locals 3

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyb1/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    return-object v1

    :pswitch_1
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$q;->w:Lyb1/b$q;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_2
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$p;->w:Lyb1/b$p;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_3
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$o;->w:Lyb1/b$o;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_4
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$n;->w:Lyb1/b$n;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_5
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$m;->w:Lyb1/b$m;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_6
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$l;->w:Lyb1/b$l;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_7
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$k;->w:Lyb1/b$k;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_8
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$j;->w:Lyb1/b$j;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_9
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$i;->w:Lyb1/b$i;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_a
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$h;->w:Lyb1/b$h;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_b
    new-instance p0, Lk61/a;

    sget-object v2, Lyb1/b$g;->w:Lyb1/b$g;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    invoke-direct {p0, v2, v1, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :pswitch_c
    new-instance p0, Lk61/a;

    new-instance v0, Lyb1/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Lyb1/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lyb1/a;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_d
    new-instance p0, Lk61/a;

    new-instance v0, Lyb1/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lyb1/a;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Lyb1/a;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lyb1/a;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_e
    new-instance p0, Lk61/a;

    sget-object v0, Lyb1/b$e;->w:Lyb1/b$e;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Lyb1/b$f;->w:Lyb1/b$f;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_f
    new-instance p0, Lk61/a;

    sget-object v0, Lyb1/b$c;->w:Lyb1/b$c;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Lyb1/b$d;->w:Lyb1/b$d;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_10
    new-instance p0, Lk61/a;

    sget-object v0, Lyb1/b$t;->w:Lyb1/b$t;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Lyb1/b$b;->w:Lyb1/b$b;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_11
    new-instance p0, Lk61/a;

    sget-object v0, Lyb1/b$r;->w:Lyb1/b$r;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sget-object v1, Lyb1/b$s;->w:Lyb1/b$s;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_12
    new-instance p0, Lk61/a;

    new-instance v0, Ly41/b;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Lyb1/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lyb1/a;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_13
    new-instance p0, Lk61/a;

    new-instance v0, Ly41/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Ly41/b;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ly41/b;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_14
    new-instance p0, Lk61/a;

    new-instance v0, Ly41/b;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ly41/b;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    new-instance v1, Ly41/b;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ly41/b;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static final l(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->b1()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->b1()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->q0()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->q0()J

    move-result-wide v1

    const v3, 0x3dcccccd    # 0.1f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v2

    const v0, 0x3e4ccccd    # 0.2f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final u(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v2

    const v0, 0x3e4ccccd    # 0.2f

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f0()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
