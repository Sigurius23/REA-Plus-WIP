.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;",
        "Lm/m;",
        "<init>",
        "()V",
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
.field public static final synthetic y:I


# instance fields
.field public final w:Ll83/p;

.field public final x:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Li20/w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li20/w;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->w:Ll83/p;

    new-instance v0, Li20/w;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Li20/w;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Li20/v0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li20/y;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Li20/y;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;I)V

    new-instance v4, Li20/y;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Li20/y;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->x:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final o(Li20/f0;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Ll83/k;

    const-string v2, "com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_result"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->w:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li20/c0;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lpf/c;->V(Landroid/view/Window;Z)V

    iget-object v0, p1, Li20/c0;->z:Li20/b0;

    invoke-interface {v0}, Li20/b0;->e0()V

    new-instance v1, Lg1/f;

    const/4 v2, 0x6

    invoke-direct {v1, p0, p1, v0, v2}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p1, Lx1/b;

    const/4 v0, 0x1

    const v2, -0x32f4ea68

    invoke-direct {p1, v1, v0, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p1}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final onStop()V
    .locals 3

    invoke-super {p0}, Lm/m;->onStop()V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Li20/d0;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->w:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/c0;

    if-eqz v1, :cond_0

    iget-object v1, v1, Li20/c0;->w:Ljava/lang/String;

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li20/d0;-><init>(Ljava/lang/String;Lh20/x0;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->o(Li20/f0;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_2
    return-void
.end method
