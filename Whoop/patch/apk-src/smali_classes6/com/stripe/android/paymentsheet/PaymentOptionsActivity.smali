.class public final Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;
.super Lb30/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb30/j;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;",
        "Lb30/j;",
        "Lh20/n0;",
        "<init>",
        "()V",
        "",
        "isProcessing",
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
.field public static final synthetic z:I


# instance fields
.field public final w:La20/h;

.field public final x:Landroidx/lifecycle/y1;

.field public final y:Ll83/p;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, La20/h;

    new-instance v1, Lh20/g0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lh20/g0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->w:La20/h;

    new-instance v0, Lh20/g0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lh20/g0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lh20/w0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lh20/k0;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lh20/k0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    new-instance v4, Lh20/k0;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lh20/k0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->x:Landroidx/lifecycle/y1;

    new-instance v0, Lh20/g0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lh20/g0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->y:Ll83/p;

    return-void
.end method


# virtual methods
.method public final bridge synthetic o()Le30/c;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object v0

    return-object v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Lb30/j;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->y:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/f0;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lb30/j;->finish()V

    return-void

    :cond_0
    iget-object p1, p1, Lh20/f0;->x:Lh20/x1;

    iget-object p1, p1, Lh20/x1;->H:Lh20/h1;

    invoke-static {p1}, Luf/c0;->f0(Lh20/h1;)V

    invoke-static {p0}, Ldp/d;->n(Lb30/j;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object p1

    iget-object p1, p1, Le30/c;->Y:Lk20/d;

    invoke-virtual {p1}, Lk20/d;->a()V

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object v2

    iget-object p1, v2, Le30/c;->J:Li20/y0;

    invoke-virtual {p1, p0, p0}, Li20/y0;->a(Lg/l;Lg/l;)V

    iget-object p1, v2, Lh20/w0;->f0:Lwz/r0;

    new-instance v0, Lg40/f4;

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v1, 0x1

    const-class v3, Lh20/w0;

    const-string v4, "onLinkAuthenticationResult"

    const-string v5, "onLinkAuthenticationResult(Lcom/stripe/android/link/LinkActivityResult;)V"

    invoke-direct/range {v0 .. v7}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Lwz/r0;->b:Lcom/stripe/android/link/LinkActivityContract;

    new-instance v3, Lv10/p;

    const/4 v4, 0x2

    invoke-direct {v3, v4, p1, v0}, Lv10/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, v1, v3}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    iput-object v0, p1, Lwz/r0;->e:Lj/d;

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance v0, Le10/q0;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Le10/q0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lh20/j0;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lh20/j0;-><init>(Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, -0x6680c032

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final p()Lh20/w0;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/w0;

    return-object v0
.end method
