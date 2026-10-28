.class public final Lgl/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/j;


# static fields
.field public static final d:Lwk/g;

.field public static final e:Lwk/g;

.field public static final f:Lio/sentry/hints/j;


# instance fields
.field public final a:Lgl/a0;

.field public final b:Lal/b;

.field public final c:Lio/sentry/hints/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Laj/d;

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Laj/d;-><init>(IZ)V

    new-instance v2, Lwk/g;

    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"

    invoke-direct {v2, v3, v0, v1}, Lwk/g;-><init>(Ljava/lang/String;Ljava/lang/Object;Lwk/f;)V

    sput-object v2, Lgl/b0;->d:Lwk/g;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lbu/c;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lbu/c;-><init>(I)V

    new-instance v2, Lwk/g;

    const-string v3, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"

    invoke-direct {v2, v3, v0, v1}, Lwk/g;-><init>(Ljava/lang/String;Ljava/lang/Object;Lwk/f;)V

    sput-object v2, Lgl/b0;->e:Lwk/g;

    new-instance v0, Lio/sentry/hints/j;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    sput-object v0, Lgl/b0;->f:Lio/sentry/hints/j;

    return-void
.end method

.method public constructor <init>(Lal/b;Lgl/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl/b0;->b:Lal/b;

    iput-object p2, p0, Lgl/b0;->a:Lgl/a0;

    sget-object p1, Lgl/b0;->f:Lio/sentry/hints/j;

    iput-object p1, p0, Lgl/b0;->c:Lio/sentry/hints/j;

    return-void
.end method

.method public static c(Landroid/media/MediaMetadataRetriever;JIIILgl/k;)Landroid/graphics/Bitmap;
    .locals 10

    move-object/from16 v3, p6

    const/4 v7, 0x0

    const/high16 v4, -0x80000000

    if-eq p4, v4, :cond_2

    if-eq p5, v4, :cond_2

    sget-object v4, Lgl/k;->e:Lgl/k;

    if-eq v3, v4, :cond_2

    const/16 v4, 0x12

    :try_start_0
    invoke-virtual {p0, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x13

    invoke-virtual {p0, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x18

    invoke-virtual {p0, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    const/16 v8, 0x5a

    if-eq v6, v8, :cond_0

    const/16 v8, 0x10e

    if-ne v6, v8, :cond_1

    :cond_0
    move v9, v5

    move v5, v4

    move v4, v9

    :cond_1
    invoke-virtual {v3, v4, v5, p4, p5}, Lgl/k;->b(IIII)F

    move-result v0

    int-to-float v2, v4

    mul-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v3, v5

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    move-object v1, p0

    move v4, p3

    move v5, v2

    move-wide v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const/4 v1, 0x3

    const-string v2, "VideoDecoder"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Exception trying to decode frame on oreo+"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    if-nez v7, :cond_3

    invoke-virtual/range {p0 .. p3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object v7

    :cond_3
    return-object v7
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILwk/h;)Lzk/z;
    .locals 8

    sget-object v0, Lgl/b0;->d:Lwk/g;

    invoke-virtual {p4, v0}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    const-wide/16 v0, -0x1

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "

    invoke-static {v2, v3, p2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object v0, Lgl/b0;->e:Lwk/g;

    invoke-virtual {p4, v0}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_2
    sget-object v1, Lgl/k;->g:Lwk/g;

    invoke-virtual {p4, v1}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lgl/k;

    if-nez p4, :cond_3

    sget-object p4, Lgl/k;->f:Lgl/k;

    :cond_3
    move-object v7, p4

    iget-object p4, p0, Lgl/b0;->c:Lio/sentry/hints/j;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    iget-object p4, p0, Lgl/b0;->a:Lgl/a0;

    invoke-interface {p4, v1, p1}, Lgl/a0;->e(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v5, p2

    move v6, p3

    invoke-static/range {v1 .. v7}, Lgl/b0;->c(Landroid/media/MediaMetadataRetriever;JIIILgl/k;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    iget-object p2, p0, Lgl/b0;->b:Lal/b;

    invoke-static {p2, p1}, Lgl/c;->b(Lal/b;Landroid/graphics/Bitmap;)Lgl/c;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    throw p1
.end method

.method public final b(Ljava/lang/Object;Lwk/h;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
