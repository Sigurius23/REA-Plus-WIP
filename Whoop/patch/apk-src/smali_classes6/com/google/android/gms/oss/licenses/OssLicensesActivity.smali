.class public final Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
.super Lm/m;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:Lt9/u;

.field public G:Lso/q;

.field public w:Lpp/d;

.field public x:Ljava/lang/String;

.field public y:Landroid/widget/ScrollView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm/m;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->x:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->y:Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:I

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lrg/a;->v(Lm/m;)V

    const p1, 0x7f0d02f5

    invoke-virtual {p0, p1}, Lm/m;->setContentView(I)V

    const p1, 0x7f0a0830

    invoke-virtual {p0, p1}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    const v0, 0x7f14078f

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lt9/u;->i(Landroid/content/Context;)Lt9/u;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Lt9/u;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "license"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lpp/d;

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->w:Lpp/d;

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->w:Lpp/d;

    iget-object v0, v0, Lpp/d;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lm/b;->w(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    invoke-virtual {p1}, Lm/b;->q()V

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lm/b;->o(Z)V

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object p1

    invoke-virtual {p1}, Lm/b;->t()V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Lt9/u;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt9/u;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lt9/u;->j(Landroid/content/Context;Ljava/lang/String;)Lso/q;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Lso/q;

    iget-object v0, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    iget-object p1, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const-string v1, "license_activity_scrollview"

    const-string v2, "id"

    invoke-virtual {v0, v1, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->y:Landroid/widget/ScrollView;

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->G:Lso/q;

    iget-object v0, p1, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    iget-object p1, p1, Lso/q;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    const-string v1, "license_activity_textview"

    invoke-virtual {v0, v1, v2, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Lm/m;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->F:Lt9/u;

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->w:Lpp/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object p1, p1, Lt9/u;->w:Ljava/lang/Object;

    check-cast p1, Lyp/d;

    new-instance v1, Lto/j0;

    invoke-direct {v1, p1, v0}, Lto/j0;-><init>(Lyp/d;Lpp/d;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lpp/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lpp/b;->M:Lcom/google/android/gms/tasks/Task;

    sget-object v1, Lpp/r;->w:Lpp/r;

    new-instance v2, Lla/b;

    const/16 v3, 0x1a

    invoke-direct {v2, v0, v3}, Lla/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2, p1}, Lpp/b;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    const-string v0, "OssLicenses"

    const-string v1, "Failed to get license detail from OssLicensesClient"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    :goto_1
    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->x:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->w:Lpp/d;

    iget-wide v0, p1, Lpp/d;->x:J

    iget p1, p1, Lpp/d;->y:I

    const-string v2, "third_party_licenses"

    invoke-static {p0, v2, v0, v1, p1}, Lo73/a;->b0(Landroid/content/Context;Ljava/lang/String;JI)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->x:Ljava/lang/String;

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->x:Ljava/lang/String;

    if-nez p1, :cond_3

    const p1, 0x7f14078e

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->x:Ljava/lang/String;

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:I

    if-nez p1, :cond_4

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->y:Landroid/widget/ScrollView;

    new-instance v0, Lyp/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lyp/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    const-string v0, "scroll_pos"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->E:I

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lg/l;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->y:Landroid/widget/ScrollView;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->y:Landroid/widget/ScrollView;

    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/text/Layout;->getLineStart(I)I

    move-result v0

    const-string v1, "scroll_pos"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method
