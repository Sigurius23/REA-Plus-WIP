.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Lx20/p;",
        "uiState",
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
.field public final w:Ll83/p;

.field public final x:La20/h;

.field public final y:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lx20/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx20/g;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->w:Ll83/p;

    new-instance v0, La20/h;

    new-instance v1, Lx20/g;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lx20/g;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->x:La20/h;

    new-instance v0, Lx20/g;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lx20/g;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lx20/w;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lx20/i;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lx20/i;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    new-instance v4, Lx20/i;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lx20/i;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->y:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final o()Lx20/k;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx20/k;

    return-object v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "getIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extra_args"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lx20/k;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lpf/c;->V(Landroid/view/Window;Z)V

    new-instance p1, Lx20/h;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lx20/h;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, -0x28d32873

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->finish()V

    return-void
.end method
