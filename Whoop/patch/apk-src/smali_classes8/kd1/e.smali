.class public abstract Lkd1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u001aA\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002(\u0010\u0008\u001a$\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013\u00b2\u0006.\u0010\u0012\u001a$\u0008\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/v;",
        "lifecycleEvent",
        "Lkotlin/Function3;",
        "Lbc3/c0;",
        "Landroidx/lifecycle/x;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "block",
        "d",
        "(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "",
        "predicate",
        "",
        "alphaWhenVisible",
        "j",
        "(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;",
        "latestEffectBlock",
        "design_release"
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
.method public static synthetic a(Landroidx/lifecycle/v;Lbc3/c0;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkd1/e;->g(Landroidx/lifecycle/v;Lbc3/c0;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static synthetic b(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkd1/e;->h(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;Lbc3/c0;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkd1/e;->f(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;Lbc3/c0;Lp1/t2;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/v;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "lifecycleEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0xd48d033

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p2, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v3, :cond_4

    move v2, v5

    goto :goto_3

    :cond_4
    move v2, v4

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v2

    invoke-virtual {p2, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroidx/lifecycle/g0;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_5

    invoke-static {p2}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v9, v2

    check-cast v9, Lbc3/c0;

    invoke-static {p1, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v10

    invoke-interface {v7}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v2

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v1, :cond_6

    move v4, v5

    :cond_6
    invoke-virtual {p2, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v4

    invoke-virtual {p2, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    if-ne v1, v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v8, p0

    goto :goto_5

    :cond_8
    :goto_4
    new-instance v6, Ljp2/l;

    const/4 v11, 0x2

    move-object v8, p0

    invoke-direct/range {v6 .. v11}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;I)V

    invoke-virtual {p2, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v6

    :goto_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_6

    :cond_9
    move-object v8, p0

    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance p2, Lig0/d;

    const/16 v0, 0x15

    invoke-direct {p2, v8, p1, p3, v0}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final e(Lp1/t2;)Lkotlin/jvm/functions/Function3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function3;

    return-object p0
.end method

.method private static final f(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;Lbc3/c0;Lp1/t2;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, Lh5/l;

    const/4 v0, 0x1

    invoke-direct {p4, p1, p2, p3, v0}, Lh5/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lkd1/e$b;

    invoke-direct {p1, p0, p4}, Lkd1/e$b;-><init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e0;)V

    return-object p1
.end method

.method private static final g(Landroidx/lifecycle/v;Lbc3/c0;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p4, p0, :cond_0

    new-instance p0, Lkd1/e$a;

    const/4 p4, 0x0

    invoke-direct {p0, p3, p2, p4}, Lkd1/e$a;-><init>(Landroidx/lifecycle/g0;Lp1/t2;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, p4, p4, p0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method private static final h(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkd1/e;->d(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic i(Lp1/t2;)Lkotlin/jvm/functions/Function3;
    .locals 0

    invoke-static {p0}, Lkd1/e;->e(Lp1/t2;)Lkotlin/jvm/functions/Function3;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p2, p0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/Modifier;ZFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/high16 p2, 0x3f800000    # 1.0f

    :cond_0
    invoke-static {p0, p1, p2}, Lkd1/e;->j(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
