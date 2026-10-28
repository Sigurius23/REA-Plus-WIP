.class public final Lel/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxk/e;


# static fields
.field public static final K:[Ljava/lang/String;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:Lwk/h;

.field public final H:Ljava/lang/Class;

.field public volatile I:Z

.field public volatile J:Lxk/e;

.field public final w:Landroid/content/Context;

.field public final x:Ldl/t;

.field public final y:Ldl/t;

.field public final z:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "_data"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lel/e;->K:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldl/t;Ldl/t;Landroid/net/Uri;IILwk/h;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lel/e;->w:Landroid/content/Context;

    iput-object p2, p0, Lel/e;->x:Ldl/t;

    iput-object p3, p0, Lel/e;->y:Ldl/t;

    iput-object p4, p0, Lel/e;->z:Landroid/net/Uri;

    iput p5, p0, Lel/e;->E:I

    iput p6, p0, Lel/e;->F:I

    iput-object p7, p0, Lel/e;->G:Lwk/h;

    iput-object p8, p0, Lel/e;->H:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lel/e;->J:Lxk/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxk/e;->a()V

    :cond_0
    return-void
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lel/e;->H:Ljava/lang/Class;

    return-object v0
.end method

.method public final c()Lxk/e;
    .locals 13

    invoke-static {}, Landroid/os/Environment;->isExternalStorageLegacy()Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Lel/e;->G:Lwk/h;

    iget v3, p0, Lel/e;->F:I

    iget v4, p0, Lel/e;->E:I

    iget-object v5, p0, Lel/e;->w:Landroid/content/Context;

    if-eqz v0, :cond_3

    iget-object v7, p0, Lel/e;->z:Landroid/net/Uri;

    const-string v0, "Failed to media store entry for: "

    const-string v12, "File path was empty in media store for: "

    :try_start_0
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    sget-object v8, Lel/e;->K:[Ljava/lang/String;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v5, :cond_1

    :try_start_1
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v0, "_data"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    iget-object v0, p0, Lel/e;->x:Ldl/t;

    invoke-interface {v0, v6, v4, v3, v2}, Ldl/t;->b(Ljava/lang/Object;IILwk/h;)Ldl/s;

    move-result-object v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v5

    goto :goto_0

    :cond_0
    :try_start_2
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0

    :cond_3
    const-string v0, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-virtual {v5, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    iget-object v5, p0, Lel/e;->z:Landroid/net/Uri;

    if-nez v0, :cond_4

    invoke-static {v5}, Landroid/provider/MediaStore;->setRequireOriginal(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v5

    :cond_4
    iget-object v0, p0, Lel/e;->y:Ldl/t;

    invoke-interface {v0, v5, v4, v3, v2}, Ldl/t;->b(Ljava/lang/Object;IILwk/h;)Ldl/s;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_5

    iget-object v0, v0, Ldl/s;->c:Lxk/e;

    return-object v0

    :cond_5
    return-object v1
.end method

.method public final cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lel/e;->I:Z

    iget-object v0, p0, Lel/e;->J:Lxk/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxk/e;->cancel()V

    :cond_0
    return-void
.end method

.method public final d()Lwk/a;
    .locals 1

    sget-object v0, Lwk/a;->w:Lwk/a;

    return-object v0
.end method

.method public final e(Lcom/bumptech/glide/d;Lxk/d;)V
    .locals 2

    const-string v0, "Failed to build fetcher for: "

    :try_start_0
    invoke-virtual {p0}, Lel/e;->c()Lxk/e;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lel/e;->z:Landroid/net/Uri;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lxk/d;->c(Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lel/e;->J:Lxk/e;

    iget-boolean v0, p0, Lel/e;->I:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lel/e;->cancel()V

    return-void

    :cond_1
    invoke-interface {v1, p1, p2}, Lxk/e;->e(Lcom/bumptech/glide/d;Lxk/d;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    invoke-interface {p2, p1}, Lxk/d;->c(Ljava/lang/Exception;)V

    return-void
.end method
