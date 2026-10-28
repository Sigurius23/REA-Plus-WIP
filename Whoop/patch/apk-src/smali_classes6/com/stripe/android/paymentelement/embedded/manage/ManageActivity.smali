.class public final Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Lu10/p;",
        "screen",
        "",
        "hasResult",
        "Ly3/f;",
        "contentHeight",
        "Lb30/j3;",
        "topBarState",
        "Lzy/c;",
        "headerText",
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
.field public static final synthetic G:I


# instance fields
.field public E:Ls10/f;

.field public F:Lk20/a;

.field public final w:Ll83/p;

.field public final x:Landroidx/lifecycle/y1;

.field public y:Lh20/f;

.field public z:Lu10/q;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lu10/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu10/e;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->w:Ll83/p;

    new-instance v0, Lu10/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lu10/e;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lu10/v;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lu10/h;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lu10/h;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    new-instance v4, Lu10/h;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lu10/h;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->x:Landroidx/lifecycle/y1;

    return-void
.end method

.method public static final p(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Z)V
    .locals 4

    new-instance v0, Lu10/r;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->y:Lh20/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, v1, Lh20/f;->b:Lec3/r1;

    iget-object v1, v1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, La30/a;

    iget-object v3, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->E:Ls10/f;

    if-eqz v3, :cond_0

    iget-object v2, v3, Ls10/f;->b:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq20/y;

    invoke-direct {v0, v1, v2, p1}, Lu10/r;-><init>(La30/a;Lq20/y;Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "getIntent(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extra_activity_result"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "putExtra(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void

    :cond_0
    const-string p0, "selectionHolder"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const-string p0, "customerStateHolder"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final o(Lu10/q;Lu10/p;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, -0x1594304d

    invoke-virtual {v4, p3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p3, v0

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p3, v0

    and-int/lit16 p3, p3, 0x93

    const/16 v0, 0x92

    if-ne p3, v0, :cond_4

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_4
    :goto_3
    sget-object p3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly3/c;

    const v0, -0x39ffd6c2

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_5

    int-to-float v0, v1

    new-instance v3, Ly3/f;

    invoke-direct {v3, v0}, Ly3/f;-><init>(F)V

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lp1/c1;

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    invoke-static {v1, v4, v3}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    new-instance v5, Lg1/f;

    const/16 v6, 0xc

    invoke-direct {v5, p2, p1, p0, v6}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, -0x69f2616e

    invoke-static {v6, v4, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    new-instance v6, Lay/n;

    const/16 v7, 0xa

    invoke-direct {v6, p2, v7}, Lay/n;-><init>(Ljava/lang/Object;I)V

    const v7, 0x6941e3b1

    invoke-static {v7, v4, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v7, -0x39ff34cc

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_6

    if-ne v8, v2, :cond_7

    :cond_6
    new-instance v8, Lb30/s2;

    const/16 v2, 0xa

    invoke-direct {v8, p3, v0, v2}, Lb30/s2;-><init>(Ly3/c;Lp1/c1;I)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p3, v8}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v0, v5

    const/16 v5, 0x36

    move-object v1, v6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Ldp/d;->a(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_8

    new-instance v0, Ljp1/k;

    const/16 v5, 0x1a

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->w:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/i;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Le4/a;->P(Lg/l;)V

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {p1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/v;

    iget-object p1, p1, Lu10/v;->w:Lh53/e;

    iget-object v0, p1, Lh53/e;->e:Ljava/lang/Object;

    check-cast v0, Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/f;

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->y:Lh20/f;

    iget-object v0, p1, Lh53/e;->o:Ljava/lang/Object;

    check-cast v0, Lv03/b;

    invoke-virtual {v0}, Lv03/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu10/q;

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->z:Lu10/q;

    iget-object v0, p1, Lh53/e;->c:Ljava/lang/Object;

    check-cast v0, Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls10/f;

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->E:Ls10/f;

    iget-object p1, p1, Lh53/e;->m:Ljava/lang/Object;

    check-cast p1, Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk20/a;

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->F:Lk20/a;

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance v0, Lrq0/x;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lo73/a;->n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V

    new-instance p1, Lu10/g;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lu10/g;-><init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x223337bc

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 3

    invoke-super {p0}, Lm/m;->onDestroy()V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->F:Lk20/a;

    if-eqz v0, :cond_0

    new-instance v1, Lk20/k;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lk20/k;-><init>(I)V

    invoke-static {v0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_0
    return-void
.end method

.method public final r()Lu10/q;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->z:Lu10/q;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "manageNavigator"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
