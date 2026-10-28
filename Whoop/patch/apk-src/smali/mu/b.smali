.class public final Lmu/b;
.super Log3/j;
.source "SourceFile"


# instance fields
.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmu/b;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    const-string v0, "org/threeten/bp/TZDB.dat"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lmu/b;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    new-instance v0, Log3/d;

    invoke-direct {v0, v1}, Log3/d;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    invoke-static {v0}, Log3/d;->c(Log3/d;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "org/threeten/bp/TZDB.dat missing from assets"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_1
    throw v0
.end method
