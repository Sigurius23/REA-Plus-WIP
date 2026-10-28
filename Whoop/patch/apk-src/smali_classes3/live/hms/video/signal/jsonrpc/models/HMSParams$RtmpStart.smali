.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RtmpStart"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000e\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "meetingUrl",
        "",
        "rtmpUrls",
        "",
        "record",
        "",
        "resolution",
        "Llive/hms/video/media/settings/HMSRtmpVideoResolution;",
        "version",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)V",
        "getMeetingUrl",
        "()Ljava/lang/String;",
        "getRtmpUrls",
        "()Ljava/util/List;",
        "getRecord",
        "()Z",
        "getResolution",
        "()Llive/hms/video/media/settings/HMSRtmpVideoResolution;",
        "getVersion",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final meetingUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "meeting_url"
    .end annotation
.end field

.field private final record:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "record"
    .end annotation
.end field

.field private final resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resolution"
    .end annotation
.end field

.field private final rtmpUrls:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rtmp_urls"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "version"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Llive/hms/video/media/settings/HMSRtmpVideoResolution;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "rtmpUrls"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    .line 6
    iput-boolean p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    .line 7
    iput-object p4, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    .line 8
    iput-object p5, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 1
    const-string p5, "1.0"

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;-><init>(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->copy(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    return v0
.end method

.method public final component4()Llive/hms/video/media/settings/HMSRtmpVideoResolution;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Llive/hms/video/media/settings/HMSRtmpVideoResolution;",
            "Ljava/lang/String;",
            ")",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;"
        }
    .end annotation

    const-string v0, "rtmpUrls"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;-><init>(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    iget-boolean v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMeetingUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecord()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    return v0
.end method

.method public final getResolution()Llive/hms/video/media/settings/HMSRtmpVideoResolution;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    return-object v0
.end method

.method public final getRtmpUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSRtmpVideoResolution;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RtmpStart(meetingUrl="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->meetingUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rtmpUrls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->rtmpUrls:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", record="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->record:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->resolution:Llive/hms/video/media/settings/HMSRtmpVideoResolution;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$RtmpStart;->version:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
