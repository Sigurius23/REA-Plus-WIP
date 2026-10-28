.class public final Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010.\u001a\u0004\u0008/\u0010\u001f\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
        "",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "navigationBar",
        "",
        "title",
        "subtitle",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "paginatedRecords",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "getPaginatedRecords",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$Companion;


# instance fields
.field private final navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

.field private final paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)V
    .locals 1

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginatedRecords"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;
    .locals 1

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paginatedRecords"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final getPaginatedRecords()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;->paginatedRecords:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "TestHistoryResponse(navigationBar="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paginatedRecords="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
