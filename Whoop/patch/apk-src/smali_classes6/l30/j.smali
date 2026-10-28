.class public final Ll30/j;
.super Ll30/m;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;

.field public static final c:Ll30/o;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-string v6, "/system/bin/failsafe/"

    const-string v7, "/data/local/"

    const-string v0, "/sbin/"

    const-string v1, "/system/bin/"

    const-string v2, "/system/xbin/"

    const-string v3, "/data/local/xbin/"

    const-string v4, "/data/local/bin/"

    const-string v5, "/system/sd/xbin/"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll30/j;->b:Ljava/util/List;

    new-instance v0, Ll30/o;

    const-string v1, "The device is jailbroken."

    sget-object v2, Ll30/n;->x:Ll30/n;

    const-string v3, "SW01"

    invoke-direct {v0, v3, v1, v2}, Ll30/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll30/n;)V

    sput-object v0, Ll30/j;->c:Ll30/o;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    sget-object v0, Ll30/j;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    const-string v3, "su"

    invoke-static {v1, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "/Superuser"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method
