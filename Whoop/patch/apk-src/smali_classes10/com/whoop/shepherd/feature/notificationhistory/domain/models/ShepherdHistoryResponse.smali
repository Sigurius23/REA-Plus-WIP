.class public final Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;,
        Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J>\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010-\u0012\u0004\u0008/\u00100\u001a\u0004\u0008.\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00101\u0012\u0004\u00083\u00100\u001a\u0004\u00082\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00104\u0012\u0004\u00086\u00100\u001a\u0004\u00085\u0010!\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "",
        "",
        "title",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;",
        "shepherdHistoryClearAll",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;",
        "shepherdEmptyHistory",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;",
        "shepherdPaginatedHistory",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$shepherd_release",
        "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;",
        "component3",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;",
        "component4",
        "()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;",
        "getShepherdHistoryClearAll",
        "getShepherdHistoryClearAll$annotations",
        "()V",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;",
        "getShepherdEmptyHistory",
        "getShepherdEmptyHistory$annotations",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;",
        "getShepherdPaginatedHistory",
        "getShepherdPaginatedHistory$annotations",
        "Companion",
        "$serializer",
        "shepherd_release"
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

.field public static final Companion:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$Companion;


# instance fields
.field private final shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "afib_empty_history"
    .end annotation
.end field

.field private final shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "afib_history_clear_all_box"
    .end annotation
.end field

.field private final shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "paginated_afib_history"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->Companion:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    iput-object p4, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    iput-object p5, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    .line 5
    iput-object p3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    .line 6
    iput-object p4, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->copy(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getShepherdEmptyHistory$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "afib_empty_history"
    .end annotation

    return-void
.end method

.method public static synthetic getShepherdHistoryClearAll$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "afib_history_clear_all_box"
    .end annotation

    return-void
.end method

.method public static synthetic getShepherdPaginatedHistory$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "paginated_afib_history"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$shepherd_release(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse$$serializer;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse$$serializer;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse$$serializer;

    iget-object p0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    return-object v0
.end method

.method public final component3()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    return-object v0
.end method

.method public final component4()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;-><init>(Ljava/lang/String;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    iget-object v3, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    iget-object p1, p1, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getShepherdEmptyHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    return-object v0
.end method

.method public final getShepherdHistoryClearAll()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    return-object v0
.end method

.method public final getShepherdPaginatedHistory()Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdHistoryClearAll:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryClearAllResponse;

    iget-object v2, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdEmptyHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdEmptyHistoryResponse;

    iget-object v3, p0, Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryResponse;->shepherdPaginatedHistory:Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ShepherdHistoryResponse(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shepherdHistoryClearAll="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shepherdEmptyHistory="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shepherdPaginatedHistory="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
