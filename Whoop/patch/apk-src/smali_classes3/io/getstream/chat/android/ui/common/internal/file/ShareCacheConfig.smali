.class public final Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;",
        "",
        "cacheFilePrefix",
        "",
        "bitmapShareFilename",
        "bitmapQuality",
        "",
        "cacheTtlMs",
        "",
        "maxCacheSizeBytes",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;IJJ)V",
        "getCacheFilePrefix",
        "()Ljava/lang/String;",
        "getBitmapShareFilename",
        "getBitmapQuality",
        "()I",
        "getCacheTtlMs",
        "()J",
        "getMaxCacheSizeBytes",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final bitmapQuality:I

.field private final bitmapShareFilename:Ljava/lang/String;

.field private final cacheFilePrefix:Ljava/lang/String;

.field private final cacheTtlMs:J

.field private final maxCacheSizeBytes:J


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;-><init>(Ljava/lang/String;Ljava/lang/String;IJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IJJ)V
    .locals 1

    const-string v0, "cacheFilePrefix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapShareFilename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    .line 5
    iput p3, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    .line 6
    iput-wide p4, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    .line 7
    iput-wide p6, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IJJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 8
    const-string p1, "TMP"

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    .line 9
    const-string p2, "shared_image.png"

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const/16 p3, 0x5a

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const-wide/32 p4, 0x493e0

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    const-wide/32 p6, 0x1900000

    :cond_4
    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 10
    invoke-direct/range {p2 .. p9}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;Ljava/lang/String;Ljava/lang/String;IJJILjava/lang/Object;)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    iget-wide p6, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    :cond_4
    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->copy(Ljava/lang/String;Ljava/lang/String;IJJ)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IJJ)Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;
    .locals 9

    const-string v0, "cacheFilePrefix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapShareFilename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    iget v3, p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    iget-wide v5, p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    iget-wide v5, p1, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBitmapQuality()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    return v0
.end method

.method public final getBitmapShareFilename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    return-object v0
.end method

.method public final getCacheFilePrefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    return-object v0
.end method

.method public final getCacheTtlMs()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    return-wide v0
.end method

.method public final getMaxCacheSizeBytes()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheFilePrefix:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapShareFilename:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->bitmapQuality:I

    iget-wide v3, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->cacheTtlMs:J

    iget-wide v5, p0, Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;->maxCacheSizeBytes:J

    const-string v7, ", bitmapShareFilename="

    const-string v8, ", bitmapQuality="

    const-string v9, "ShareCacheConfig(cacheFilePrefix="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cacheTtlMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", maxCacheSizeBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
