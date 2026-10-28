.class public final Lx33/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "[^\\p{ASCII}]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lx33/a;->a:Lyb3/p;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "stream-video-android-1.28.0"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "|os=Android "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "|api_version="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "|device_model="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/i3;->b:Lt23/j3;

    instance-of v3, v2, Lt23/b4;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, Lt23/b4;

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    const-string v3, ""

    if-eqz v2, :cond_8

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/i3;->b:Lt23/j3;

    if-eqz v2, :cond_1

    check-cast v2, Lt23/b4;

    iget-object v2, v2, Lt23/b4;->w:Landroid/content/Context;

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lt23/i3;->b:Lt23/j3;

    if-eqz v1, :cond_2

    check-cast v1, Lt23/b4;

    iget-object v1, v1, Lt23/b4;->w:Landroid/content/Context;

    goto :goto_2

    :cond_2
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_3
    move-object v1, v4

    :goto_3
    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    invoke-virtual {v2, v1, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :cond_5
    :goto_4
    move-object v1, v4

    goto :goto_6

    :goto_5
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    :goto_6
    instance-of v2, v1, Ll83/m;

    if-eqz v2, :cond_6

    move-object v1, v4

    :cond_6
    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_7

    const-string v1, "nameNotFound"

    :cond_7
    const-string v2, "|app_version="

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    :cond_8
    move-object v1, v3

    :cond_9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/i3;->b:Lt23/j3;

    instance-of v5, v2, Lt23/b4;

    if-eqz v5, :cond_a

    check-cast v2, Lt23/b4;

    goto :goto_7

    :cond_a
    move-object v2, v4

    :goto_7
    if-eqz v2, :cond_10

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lt23/i3;->b:Lt23/j3;

    if-eqz v1, :cond_b

    check-cast v1, Lt23/b4;

    iget-object v4, v1, Lt23/b4;->w:Landroid/content/Context;

    :cond_b
    const-string v1, "UnknownApp"

    if-nez v4, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v5, v2, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-eqz v5, :cond_d

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_e

    goto :goto_8

    :cond_e
    move-object v1, v2

    :cond_f
    :goto_8
    const-string v2, "|app_name="

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_11

    :cond_10
    move-object v1, v3

    :cond_11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    invoke-static {v0, v1}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "normalize(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lx33/a;->a:Lyb3/p;

    invoke-virtual {v1, v0, v3}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
