.class public final Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$$serializer;,
        Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>?BE\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\\\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u00089\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008:\u0010#R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010\'\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "icon",
        "title",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "tag",
        "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;",
        "start",
        "latest",
        "target",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "callout",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$access_release",
        "(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/design/models/items/ImpactModel;",
        "component4",
        "()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getTitle",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "getTag",
        "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;",
        "getStart",
        "getLatest",
        "getTarget",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "getCallout",
        "Companion",
        "$serializer",
        "a",
        "access_release"
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

.field public static final Companion:Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$a;


# instance fields
.field private final callout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final icon:Ljava/lang/String;

.field private final latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

.field private final start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

.field private final tag:Lcom/whoop/design/models/items/ImpactModel;

.field private final target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->Companion:Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$a;

    sget v0, Lcom/whoop/design/models/InfoCalloutTileModel;->$stable:I

    sget v1, Lcom/whoop/design/models/items/ImpactModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$$serializer;->INSTANCE:Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    iput-object p5, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iput-object p6, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iput-object p7, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iput-object p8, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;ILjava/lang/Object;)Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$access_release(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel$$serializer;->INSTANCE:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel$$serializer;

    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object p0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;
    .locals 9

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latest"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;

    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iget-object v3, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iget-object v3, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iget-object v3, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object p1, p1, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatest()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    return-object v0
.end method

.method public final getStart()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final getTarget()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/items/ImpactModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-virtual {v3}, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-virtual {v0}, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    invoke-virtual {v3}, Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v3, v1

    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->tag:Lcom/whoop/design/models/items/ImpactModel;

    iget-object v3, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->start:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iget-object v4, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->latest:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iget-object v5, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->target:Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;

    iget-object v6, p0, Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const-string v7, ", title="

    const-string v8, ", tag="

    const-string v9, "MeasurementProgressModel(icon="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", target="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", callout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
