.class public final Lcom/stripe/android/shoppay/ShopPayActivity;
.super Lg/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/ShopPayActivity;",
        "Lg/l;",
        "<init>",
        "()V",
        "Landroid/webkit/WebView;",
        "popupWebView",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic E:I


# instance fields
.field public final w:Ll8/d;

.field public final x:Landroidx/lifecycle/y1;

.field public final y:Lp1/k1;

.field public final z:Ll83/p;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lg/l;-><init>()V

    new-instance v0, Lb0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    new-instance v1, Lh00/l0;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lh00/l0;-><init>(I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lh30/l;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v4, v1}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lb0/b;->c()Ll8/d;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->w:Ll8/d;

    new-instance v0, Lh30/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lh30/a;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lh30/d;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lh30/d;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V

    new-instance v4, Lh30/d;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lh30/d;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->x:Landroidx/lifecycle/y1;

    const/4 v0, 0x0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->y:Lp1/k1;

    new-instance v0, Lh30/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lh30/a;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->z:Ll83/p;

    return-void
.end method


# virtual methods
.method public final m(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v8, p1

    check-cast v8, Lp1/q;

    const p1, -0x4bdb5766

    invoke-virtual {v8, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    const/4 v1, 0x3

    and-int/2addr p1, v1

    if-ne p1, v0, :cond_2

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object p1, p0

    goto/16 :goto_4

    :cond_2
    :goto_1
    const/4 v6, 0x0

    invoke-static {v6, v8, v1}, Lvd/e;->O(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh40/k;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_3

    invoke-static {v8}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object p1

    new-instance v1, Lp1/a0;

    invoke-direct {v1, p1}, Lp1/a0;-><init>(Lbc3/c0;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p1, v1

    :cond_3
    check-cast p1, Lp1/a0;

    iget-object v4, p1, Lp1/a0;->w:Lbc3/c0;

    const p1, 0x650e550e

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p1, v1

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p1, v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_5

    if-ne v1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    goto :goto_3

    :cond_5
    :goto_2
    new-instance v2, Lay/u;

    const/4 v7, 0x7

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object p1, v3

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v2

    :goto_3
    check-cast v1, Lc93/m;

    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v1, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ld40/p;->b:Ld40/n;

    new-instance v1, Lg1/f;

    const/4 v2, 0x3

    invoke-direct {v1, v5, v4, p0, v2}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0x645a33d0

    invoke-static {v2, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0xc00000

    const/16 v10, 0x7e

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v1, Lh30/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, v2}, Lh30/b;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public final n(Landroid/webkit/WebView;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    move-object v3, p2

    check-cast v3, Lp1/q;

    const p2, 0x515775d1

    invoke-virtual {v3, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 p2, p2, 0x3

    if-ne p2, v0, :cond_3

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object p2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v3, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/c1;

    invoke-virtual {p2}, Lg1/c1;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/w0;->H(J)I

    move-result p2

    const v0, -0x7dea034c

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v3, p2}, Lp1/q;->e(I)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_5

    :cond_4
    new-instance v1, Lcom/whoop/data/local/room/dao/wipeable/c;

    const/16 v0, 0x8

    invoke-direct {v1, p1, p2, v0}, Lcom/whoop/data/local/room/dao/wipeable/c;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v0, v1

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 p2, 0x0

    invoke-virtual {v3, p2}, Lp1/q;->q(Z)V

    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, p2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v4, 0x30

    const/4 v5, 0x4

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lf01/b;

    const/16 v1, 0xf

    invoke-direct {v0, p0, p1, p3, v1}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public final o(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, -0x27177db0

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v2, p1, 0x3

    if-ne v2, v0, :cond_2

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_2
    :goto_1
    const v0, -0x7f17903f

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->y:Lp1/k1;

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lp1/c1;

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->e:Ll0/h;

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v4, v5, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v6, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v5, v6, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    const v2, -0x5d226944

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    if-nez v0, :cond_7

    const/4 p1, 0x0

    goto :goto_3

    :cond_7
    shl-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0x70

    invoke-virtual {p0, v0, v6, p1}, Lcom/stripe/android/shoppay/ShopPayActivity;->n(Landroid/webkit/WebView;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    const v0, -0x5d2269f9

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    if-nez p1, :cond_8

    const/16 p1, 0x40

    int-to-float p1, p1

    invoke-static {p1, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-wide v2, Lh30/k;->a:J

    int-to-float v0, v1

    const-wide/16 v4, 0x0

    const/16 v1, 0x1b6

    invoke-static/range {v0 .. v7}, Ls4/g;->a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :cond_8
    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    const/4 p1, 0x1

    invoke-virtual {v6, p1}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lh30/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lh30/b;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lg/l;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->z:Ll83/p;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj30/a;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {p1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj30/a;
    :try_end_0
    .catch Lcom/stripe/android/shoppay/ShopPayViewModel$NoArgsException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    throw p1

    :catch_0
    new-instance p1, Lh30/h;

    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Failed to create ShopPayViewModel"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh30/h;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/ShopPayActivity;->p(Lh30/i;)V

    :goto_0
    new-instance p1, Lh30/c;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lh30/c;-><init>(Lcom/stripe/android/shoppay/ShopPayActivity;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x7ea3fae3

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lg/l;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/stripe/android/shoppay/ShopPayActivity;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj30/a;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    return-void
.end method

.method public final p(Lh30/i;)V
    .locals 2

    new-instance v0, Ll83/k;

    const-string v1, "com.stripe.android.shoppay.ShopPayActivityContract.extra_result"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const v0, 0xf894

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
