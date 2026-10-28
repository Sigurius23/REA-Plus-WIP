.class public final Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$$serializer;,
        Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JZ\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00084\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00085\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00106\u001a\u0004\u00087\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u00089\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
        "",
        "",
        "id",
        "imageUrl",
        "title",
        "subtitle",
        "Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "tile",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "progressButton",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "callout",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$access_release",
        "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "component6",
        "()Lcom/whoop/design/models/ProgressButtonModel;",
        "component7",
        "()Lcom/whoop/design/models/InfoCalloutTileModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getImageUrl",
        "getTitle",
        "getSubtitle",
        "Lcom/whoop/design/models/tiles/EmptyTileModel;",
        "getTile",
        "Lcom/whoop/design/models/ProgressButtonModel;",
        "getProgressButton",
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

.field public static final Companion:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$a;


# instance fields
.field private final callout:Lcom/whoop/design/models/InfoCalloutTileModel;

.field private final id:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final progressButton:Lcom/whoop/design/models/ProgressButtonModel;

.field private final subtitle:Ljava/lang/String;

.field private final tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->Companion:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$a;

    sget v0, Lcom/whoop/design/models/InfoCalloutTileModel;->$stable:I

    sget v1, Lcom/whoop/design/models/ProgressButtonModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/tiles/EmptyTileModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$$serializer;->INSTANCE:Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$$serializer;

    invoke-virtual {p9}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    iput-object p7, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    iput-object p8, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressButton"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;ILjava/lang/Object;)Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$access_release(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/tiles/EmptyTileModel$$serializer;

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/ProgressButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ProgressButtonModel$$serializer;

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    iget-object p0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressButton"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    iget-object v3, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v3, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    iget-object p1, p1, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressButton()Lcom/whoop/design/models/ProgressButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTile()Lcom/whoop/design/models/tiles/EmptyTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/tiles/EmptyTileModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/ProgressButtonModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/design/models/InfoCalloutTileModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->imageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->subtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->tile:Lcom/whoop/design/models/tiles/EmptyTileModel;

    iget-object v5, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->progressButton:Lcom/whoop/design/models/ProgressButtonModel;

    iget-object v6, p0, Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;->callout:Lcom/whoop/design/models/InfoCalloutTileModel;

    const-string v7, ", imageUrl="

    const-string v8, ", title="

    const-string v9, "ReconfirmLabsScreenResponse(id="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitle="

    const-string v7, ", tile="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressButton="

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
