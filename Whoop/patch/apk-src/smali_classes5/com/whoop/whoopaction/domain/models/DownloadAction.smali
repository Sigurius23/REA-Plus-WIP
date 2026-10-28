.class public final Lcom/whoop/whoopaction/domain/models/DownloadAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/Action;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/DownloadAction$$serializer;,
        Lcom/whoop/whoopaction/domain/models/DownloadAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010*\u001a\u0004\u0008,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001f\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/DownloadAction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "",
        "path",
        "filename",
        "",
        "timeoutMillis",
        "Lcom/whoop/analytics/MetricEventModel;",
        "metricEvent",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Ljava/lang/Long;",
        "component4",
        "()Lcom/whoop/analytics/MetricEventModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)Lcom/whoop/whoopaction/domain/models/DownloadAction;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPath",
        "getFilename",
        "Ljava/lang/Long;",
        "getTimeoutMillis",
        "Lcom/whoop/analytics/MetricEventModel;",
        "getMetricEvent",
        "Companion",
        "$serializer",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/DownloadAction$Companion;


# instance fields
.field private final filename:Ljava/lang/String;

.field private final metricEvent:Lcom/whoop/analytics/MetricEventModel;

.field private final path:Ljava/lang/String;

.field private final timeoutMillis:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/domain/models/DownloadAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/DownloadAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->Companion:Lcom/whoop/whoopaction/domain/models/DownloadAction$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/whoopaction/domain/models/DownloadAction$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/DownloadAction$$serializer;

    invoke-virtual {p6}, Lcom/whoop/whoopaction/domain/models/DownloadAction$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-void

    :cond_1
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    .line 6
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/models/DownloadAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/DownloadAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/DownloadAction;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)Lcom/whoop/whoopaction/domain/models/DownloadAction;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/analytics/MetricEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/MetricEventModel$$serializer;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    return-object v0
.end method

.method public final component4()Lcom/whoop/analytics/MetricEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)Lcom/whoop/whoopaction/domain/models/DownloadAction;
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/whoopaction/domain/models/DownloadAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/analytics/MetricEventModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFilename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricEvent()Lcom/whoop/analytics/MetricEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeoutMillis()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/analytics/MetricEventModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->path:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->filename:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->timeoutMillis:Ljava/lang/Long;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/DownloadAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    const-string v4, ", filename="

    const-string v5, ", timeoutMillis="

    const-string v6, "DownloadAction(path="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metricEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
