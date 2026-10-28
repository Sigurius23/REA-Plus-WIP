.class public abstract Lm/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static E:Ljava/lang/Boolean;

.field public static F:Z

.field public static final G:La0/h;

.field public static final H:Ljava/lang/Object;

.field public static final I:Ljava/lang/Object;

.field public static final w:Landroidx/room/u1;

.field public static final x:I

.field public static y:Lb5/g;

.field public static z:Lb5/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/room/u1;

    new-instance v1, Lcq/r;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcq/r;-><init>(I)V

    invoke-direct {v0, v1}, Landroidx/room/u1;-><init>(Lcq/r;)V

    sput-object v0, Lm/q;->w:Landroidx/room/u1;

    const/16 v0, -0x64

    sput v0, Lm/q;->x:I

    const/4 v0, 0x0

    sput-object v0, Lm/q;->y:Lb5/g;

    sput-object v0, Lm/q;->z:Lb5/g;

    sput-object v0, Lm/q;->E:Ljava/lang/Boolean;

    const/4 v0, 0x0

    sput-boolean v0, Lm/q;->F:Z

    new-instance v1, La0/h;

    invoke-direct {v1, v0}, La0/h;-><init>(I)V

    sput-object v1, Lm/q;->G:La0/h;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm/q;->H:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lm/q;->I:Ljava/lang/Object;

    return-void
.end method

.method public static c()V
    .locals 5

    sget-object v0, Lm/q;->G:La0/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/b;

    invoke-direct {v1, v0}, La0/b;-><init>(La0/h;)V

    :cond_0
    :goto_0
    invoke-virtual {v1}, La0/m;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, La0/m;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/q;

    if-eqz v0, :cond_0

    check-cast v0, Lm/a0;

    iget-object v2, v0, Lm/a0;->K:Landroid/content/Context;

    invoke-static {v2}, Lm/q;->h(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lm/q;->y:Lb5/g;

    if-eqz v3, :cond_1

    sget-object v4, Lm/q;->z:Lb5/g;

    invoke-virtual {v3, v4}, Lb5/g;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Llr/e;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Llr/e;-><init>(Ljava/lang/Object;I)V

    sget-object v2, Lm/q;->w:Landroidx/room/u1;

    invoke-virtual {v2, v3}, Landroidx/room/u1;->execute(Ljava/lang/Runnable;)V

    :cond_1
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v2}, Lm/a0;->s(ZZ)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static d()Lb5/g;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Lm/q;->e()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lm/p;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lm/q;->y:Lb5/g;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lb5/g;->b:Lb5/g;

    return-object v0
.end method

.method public static e()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lm/q;->G:La0/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, La0/b;

    invoke-direct {v1, v0}, La0/b;-><init>(La0/h;)V

    :cond_0
    invoke-virtual {v1}, La0/m;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, La0/m;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/q;

    if-eqz v0, :cond_0

    check-cast v0, Lm/a0;

    iget-object v0, v0, Lm/a0;->K:Landroid/content/Context;

    if-eqz v0, :cond_0

    const-string v1, "locale"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 4

    sget-object v0, Lm/q;->E:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    :try_start_0
    sget v0, Landroidx/appcompat/app/AppLocalesMetadataHolderService;->w:I

    invoke-static {}, Lm/g0;->a()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    new-instance v2, Landroid/content/ComponentName;

    const-class v3, Landroidx/appcompat/app/AppLocalesMetadataHolderService;

    invoke-direct {v2, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_0

    const-string v0, "autoStoreLocales"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Lm/q;->E:Ljava/lang/Boolean;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "AppCompatDelegate"

    const-string v0, "Checking for metadata for AppLocalesMetadataHolderService : Service not found"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Lm/q;->E:Ljava/lang/Boolean;

    :cond_0
    :goto_0
    sget-object p0, Lm/q;->E:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static k(Lm/a0;)V
    .locals 3

    sget-object v0, Lm/q;->H:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm/q;->G:La0/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, La0/b;

    invoke-direct {v2, v1}, La0/b;-><init>(La0/h;)V

    :cond_0
    :goto_0
    invoke-virtual {v2}, La0/m;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v2}, La0/m;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/q;

    if-eq v1, p0, :cond_1

    if-nez v1, :cond_0

    :cond_1
    invoke-virtual {v2}, La0/m;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static r(Landroid/content/Context;)V
    .locals 3

    invoke-static {p0}, Lm/q;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_2

    sget-boolean v0, Lm/q;->F:Z

    if-nez v0, :cond_1

    sget-object v0, Lm/q;->w:Landroidx/room/u1;

    new-instance v1, Landroidx/profileinstaller/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Landroidx/profileinstaller/e;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/room/u1;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    sget-object v0, Lm/q;->I:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lm/q;->y:Lb5/g;

    if-nez v1, :cond_5

    sget-object v1, Lm/q;->z:Lb5/g;

    if-nez v1, :cond_3

    invoke-static {p0}, Landroidx/core/app/AppLocalesStorageHelper;->readLocales(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lb5/g;->a(Ljava/lang/String;)Lb5/g;

    move-result-object p0

    sput-object p0, Lm/q;->z:Lb5/g;

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_3
    :goto_1
    sget-object p0, Lm/q;->z:Lb5/g;

    invoke-virtual {p0}, Lb5/g;->c()Z

    move-result p0

    if-eqz p0, :cond_4

    monitor-exit v0

    return-void

    :cond_4
    sget-object p0, Lm/q;->z:Lb5/g;

    sput-object p0, Lm/q;->y:Lb5/g;

    goto :goto_2

    :cond_5
    sget-object v2, Lm/q;->z:Lb5/g;

    invoke-virtual {v1, v2}, Lb5/g;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    sget-object v1, Lm/q;->y:Lb5/g;

    sput-object v1, Lm/q;->z:Lb5/g;

    invoke-virtual {v1}, Lb5/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/core/app/AppLocalesStorageHelper;->persistLocales(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public abstract l(I)Z
.end method

.method public abstract m(I)V
.end method

.method public abstract n(Landroid/view/View;)V
.end method

.method public abstract o(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract p(Ljava/lang/CharSequence;)V
.end method

.method public abstract q(Lq/a;)Lq/b;
.end method
