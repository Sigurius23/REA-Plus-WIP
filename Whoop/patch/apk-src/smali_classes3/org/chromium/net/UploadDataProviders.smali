.class public final Lorg/chromium/net/UploadDataProviders;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/os/ParcelFileDescriptor;)Lorg/chromium/net/UploadDataProvider;
    .locals 2

    .line 2
    new-instance v0, Lpe3/d;

    new-instance v1, Lpe3/a;

    invoke-direct {v1, p0}, Lpe3/a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-direct {v0, v1}, Lpe3/d;-><init>(Lpe3/c;)V

    return-object v0
.end method

.method public static create(Ljava/io/File;)Lorg/chromium/net/UploadDataProvider;
    .locals 3

    .line 1
    new-instance v0, Lpe3/d;

    new-instance v1, Lla/b;

    const/16 v2, 0x17

    invoke-direct {v1, p0, v2}, Lla/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lpe3/d;-><init>(Lpe3/c;)V

    return-object v0
.end method

.method public static create(Ljava/nio/ByteBuffer;)Lorg/chromium/net/UploadDataProvider;
    .locals 1

    .line 4
    new-instance v0, Lpe3/b;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-direct {v0, p0}, Lpe3/b;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public static create([B)Lorg/chromium/net/UploadDataProvider;
    .locals 2

    const/4 v0, 0x0

    .line 5
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lse/b;->w([BII)Lpe3/b;

    move-result-object p0

    return-object p0
.end method

.method public static create([BII)Lorg/chromium/net/UploadDataProvider;
    .locals 0

    .line 3
    invoke-static {p0, p1, p2}, Lse/b;->w([BII)Lpe3/b;

    move-result-object p0

    return-object p0
.end method
