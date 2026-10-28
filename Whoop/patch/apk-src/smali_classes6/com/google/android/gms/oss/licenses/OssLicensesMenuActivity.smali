.class public final Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;
.super Lm/m;
.source "SourceFile"


# static fields
.field public static y:Ljava/lang/String;


# instance fields
.field public w:Z

.field public x:Lt9/u;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm/m;-><init>()V

    return-void
.end method

.method public static o(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v2, 0x7f0a0832

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "raw"

    invoke-virtual {p0, p1, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return v1

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    throw p0

    :catch_2
    if-eqz v0, :cond_2

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_2
    return v1
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lt9/u;->i(Landroid/content/Context;)Lt9/u;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->x:Lt9/u;

    invoke-static {p0}, Lrg/a;->v(Lm/m;)V

    const v0, 0x7f0d02f7

    invoke-virtual {p0, v0}, Lm/m;->setContentView(I)V

    const-string v0, "third_party_licenses"

    invoke-static {p0, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->o(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "third_party_license_metadata"

    invoke-static {p0, v0}, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->o(Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->w:Z

    sget-object v0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->y:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->y:Ljava/lang/String;

    const-string v0, "OssLicensesMenuActivity"

    const-string v1, "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object v0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->y:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lm/m;->getSupportActionBar()Lm/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lm/b;->o(Z)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->x:Lt9/u;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt9/u;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lt9/u;->j(Landroid/content/Context;Ljava/lang/String;)Lso/q;

    move-result-object v1

    iget-object v3, v1, Lso/q;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v1, v1, Lso/q;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/Resources;

    iget-boolean v4, p0, Lcom/google/android/gms/oss/licenses/OssLicensesMenuActivity;->w:Z

    const-string v5, "id"

    const-string v6, "license_fragment_container"

    const/4 v7, 0x0

    if-eqz v4, :cond_6

    if-nez p1, :cond_5

    invoke-static {p0}, Lt9/u;->i(Landroid/content/Context;)Lt9/u;

    invoke-virtual {v1, v6, v5, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/o1;->D(I)Landroidx/fragment/app/m0;

    move-result-object v1

    check-cast v1, Lyp/f;

    if-nez v1, :cond_7

    new-instance v1, Lyp/f;

    invoke-direct {v1}, Lyp/f;-><init>()V

    if-eqz v0, :cond_4

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "license_activity_package_name"

    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-static {v0, v0}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v0

    invoke-virtual {v0, p1, v1, v7, v2}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    invoke-virtual {v0}, Landroidx/fragment/app/a;->l()V

    :cond_5
    return-void

    :cond_6
    if-nez p1, :cond_7

    invoke-static {p0}, Lt9/u;->i(Landroid/content/Context;)Lt9/u;

    invoke-virtual {v1, v6, v5, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/o1;->D(I)Landroidx/fragment/app/m0;

    move-result-object v0

    check-cast v0, Lyp/b;

    if-nez v0, :cond_7

    new-instance v0, Lyp/b;

    invoke-direct {v0}, Lyp/b;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    invoke-static {v1, v1}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v1

    invoke-virtual {v1, p1, v0, v7, v2}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    invoke-virtual {v1}, Landroidx/fragment/app/a;->l()V

    :cond_7
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
