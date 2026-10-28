.class public final synthetic Landroidx/profileinstaller/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Landroidx/profileinstaller/e;->w:I

    iput-object p1, p0, Landroidx/profileinstaller/e;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Landroidx/profileinstaller/e;->w:I

    packed-switch v0, :pswitch_data_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    iget-object v3, p0, Landroidx/profileinstaller/e;->x:Landroid/content/Context;

    invoke-direct {v0, v3, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v1

    if-eq v1, v2, :cond_1

    invoke-static {}, Lm/q;->d()Lb5/g;

    move-result-object v1

    invoke-virtual {v1}, Lb5/g;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v3}, Landroidx/core/app/AppLocalesStorageHelper;->readLocales(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "locale"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v1}, Lm/o;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v4, v1}, Lm/p;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    :cond_0
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    :cond_1
    sput-boolean v2, Lm/q;->F:Z

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/profileinstaller/e;->x:Landroid/content/Context;

    invoke-static {v0}, Landroidx/profileinstaller/ProfileInstallerInitializer;->a(Landroid/content/Context;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/profileinstaller/e;->x:Landroid/content/Context;

    invoke-static {v0}, Landroidx/profileinstaller/ProfileInstallerInitializer;->b(Landroid/content/Context;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
