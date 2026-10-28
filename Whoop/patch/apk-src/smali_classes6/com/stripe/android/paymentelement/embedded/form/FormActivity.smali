.class public final Lcom/stripe/android/paymentelement/embedded/form/FormActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Lt10/j;",
        "state",
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
.field public E:Lt10/e;

.field public F:Lt10/d;

.field public final w:Ll83/p;

.field public final x:Landroidx/lifecycle/y1;

.field public y:Ld30/v;

.field public z:Lk20/a;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lt10/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt10/g;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->w:Ll83/p;

    new-instance v0, Lt10/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lt10/g;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lt10/n;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lt10/i;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lt10/i;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    new-instance v4, Lt10/i;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lt10/i;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->x:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final o(Lt10/s;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "extra_activity_result"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "putExtra(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->w:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt10/p;

    if-nez p1, :cond_0

    sget-object p1, Lt10/q;->w:Lt10/q;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->o(Lt10/s;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Le4/a;->P(Lg/l;)V

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {p1}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt10/n;

    iget-object p1, p1, Lt10/n;->w:Lt10/b;

    iget-object p1, p1, Lt10/b;->a:Lt10/b;

    invoke-static {p0}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v8

    invoke-static {p0}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object v9

    iget-object v1, p1, Lt10/b;->e:Lv03/e;

    iget-object v2, p1, Lt10/b;->Z:Lv03/h;

    iget-object v3, p1, Lt10/b;->x:Lv03/e;

    iget-object v4, p1, Lt10/b;->d:Lv03/h;

    iget-object v5, p1, Lt10/b;->B:Lv03/h;

    iget-object v6, p1, Lt10/b;->y:Lv03/h;

    iget-object v7, p1, Lt10/b;->A:Lv03/h;

    iget-object v10, p1, Lt10/b;->b:Lv03/h;

    iget-object v11, p1, Lt10/b;->a0:Lv03/h;

    new-instance v0, Lcz/o0;

    invoke-direct/range {v0 .. v11}, Lcz/o0;-><init>(Lv03/e;Lv03/h;Lv03/e;Lv03/h;Lv03/h;Lv03/h;Lv03/h;Lv03/e;Lv03/e;Lv03/h;Lv03/h;)V

    invoke-static {v0}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object v0

    iget-object v1, p1, Lt10/b;->C:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld30/v;

    iput-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->y:Ld30/v;

    iget-object v1, p1, Lt10/b;->A:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk20/a;

    iput-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->z:Lk20/a;

    iget-object p1, p1, Lt10/b;->B:Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt10/e;

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->E:Lt10/e;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt10/d;

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->F:Lt10/d;

    new-instance p1, Lt10/h;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lt10/h;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x7ff6a7f

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 3

    invoke-super {p0}, Lm/m;->onDestroy()V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->z:Lk20/a;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    new-instance v1, Lk20/k;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lk20/k;-><init>(I)V

    invoke-static {v0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void

    :cond_0
    const-string v0, "eventReporter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method
