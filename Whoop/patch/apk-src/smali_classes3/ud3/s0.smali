.class public final Lud3/s0;
.super Lud3/v0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lud3/h0;

.field public final synthetic b:Ljava/io/FileDescriptor;


# direct methods
.method public constructor <init>(Ljava/io/FileDescriptor;Lud3/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lud3/s0;->a:Lud3/h0;

    iput-object p1, p0, Lud3/s0;->b:Ljava/io/FileDescriptor;

    return-void
.end method


# virtual methods
.method public final contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lud3/s0;->a:Lud3/h0;

    return-object v0
.end method

.method public final isOneShot()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final writeTo(Lne3/i;)V
    .locals 2

    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lud3/s0;->b:Ljava/io/FileDescriptor;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    :try_start_0
    invoke-interface {p1}, Lne3/i;->f()Lne3/h;

    move-result-object p1

    invoke-static {v0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v1

    invoke-virtual {p1, v1}, Lne3/h;->N0(Lne3/p0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
