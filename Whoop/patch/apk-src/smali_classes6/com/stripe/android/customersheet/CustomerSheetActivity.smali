.class public final Lcom/stripe/android/customersheet/CustomerSheetActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "Lcz/z0;",
        "result",
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

.field public final x:Lcz/c;

.field public final y:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lcz/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcz/c;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->w:Ll83/p;

    new-instance v0, Lcz/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcz/c;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    iput-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->x:Lcz/c;

    new-instance v0, Lcz/c;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lcz/c;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lcz/n0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lcz/f;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcz/f;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    new-instance v4, Lcz/f;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lcz/f;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->y:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final o(Lcz/z0;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ll83/k;

    const-string v2, "extra_activity_result"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->finish()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lpf/c;->V(Landroid/view/Window;Z)V

    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->w:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcz/g;

    if-nez p1, :cond_0

    new-instance p1, Lcz/y0;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No CustomerSheetContract.Args provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lcz/y0;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->o(Lcz/z0;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetActivity;->p()Lcz/n0;

    move-result-object p1

    iget-object p1, p1, Lcz/n0;->P:Le10/r0;

    invoke-virtual {p1, p0, p0}, Le10/r0;->f(Lj/c;Landroidx/lifecycle/g0;)V

    new-instance p1, Lcz/e;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lcz/e;-><init>(Lcom/stripe/android/customersheet/CustomerSheetActivity;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x23e57354

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method

.method public final p()Lcz/n0;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/n0;

    return-object v0
.end method
