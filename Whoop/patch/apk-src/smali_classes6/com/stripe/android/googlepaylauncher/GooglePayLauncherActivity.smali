.class public final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "payments-core_release"
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
.field public final w:Landroidx/lifecycle/y1;

.field public final x:Ll83/p;

.field public y:Lsz/t;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lsz/p;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lsz/p;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lsz/z;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lsz/s;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lsz/s;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;I)V

    new-instance v4, Lsz/s;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lsz/s;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->w:Landroidx/lifecycle/y1;

    new-instance v0, Lsz/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lsz/p;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->x:Ll83/p;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final o(Lsz/o;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Ll83/k;

    const-string v2, "extra_result"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->finish()V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/r0;->onActivityResult(IILandroid/content/Intent;)V

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object v1

    if-nez p3, :cond_0

    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3}, Landroid/content/Intent;-><init>()V

    :cond_0
    move-object v3, p3

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    iget-object p3, v1, Lsz/z;->J:Lq83/j;

    new-instance v0, Lmj/b;

    const/4 v5, 0x2

    const/4 v4, 0x0

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lmj/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    invoke-static {p2, p3, v4, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :pswitch_data_0
    .packed-switch 0xc350
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "getIntent(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extra_args"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lsz/t;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "GooglePayLauncherActivity was started without arguments."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    check-cast p1, Lsz/t;

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->y:Lsz/t;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v0, Lsz/q;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentDataResult;

    invoke-direct {p1}, Lcom/google/android/gms/wallet/contract/TaskResultContracts$GetPaymentDataResult;-><init>()V

    new-instance v0, Laq0/o;

    const/16 v3, 0xe

    invoke-direct {v0, p0, v3}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1, v0}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v3, Lsz/r;

    const/4 v4, 0x1

    invoke-direct {v3, p0, p1, v2, v4}, Lsz/r;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;Lj/d;Lq83/d;I)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    new-instance p1, Lsz/n;

    invoke-direct {p1, v0}, Lsz/n;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->o(Lsz/o;)V

    return-void
.end method

.method public final p()Lsz/z;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->w:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsz/z;

    return-object v0
.end method
