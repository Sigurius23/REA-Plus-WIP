.class public final Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$$serializer;,
        Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eBe\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0010\u0010$\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ^\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\n2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00082\u0010\u001eR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00085\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u0010%R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010/\u001a\u0004\u00088\u0010\u001e\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;",
        "",
        "",
        "icon",
        "title",
        "subtitle",
        "",
        "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;",
        "items",
        "analyticsCategory",
        "",
        "receivedKit",
        "upcycleOffer",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "()Z",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getIcon",
        "getTitle",
        "getSubtitle",
        "Ljava/util/List;",
        "getItems",
        "getAnalyticsCategory",
        "Z",
        "getReceivedKit",
        "getUpcycleOffer",
        "Companion",
        "$serializer",
        "membership_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$Companion;


# instance fields
.field private final analyticsCategory:Ljava/lang/String;

.field private final icon:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;",
            ">;"
        }
    .end annotation
.end field

.field private final receivedKit:Z

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final upcycleOffer:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->Companion:Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lut2/a;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lut2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$$serializer;->INSTANCE:Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    iput-object p8, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsCategory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upcycleOffer"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/membership/domain/upcycle/models/UpcycleContent$$serializer;->INSTANCE:Lcom/whoop/membership/domain/upcycle/models/UpcycleContent$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    :cond_6
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;"
        }
    .end annotation

    const-string v0, "icon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsCategory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upcycleOffer"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;

    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    iget-boolean v3, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAnalyticsCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getReceivedKit()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    return v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpcycleOffer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->icon:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->items:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->analyticsCategory:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->receivedKit:Z

    iget-object v6, p0, Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;->upcycleOffer:Ljava/lang/String;

    const-string v7, ", title="

    const-string v8, ", subtitle="

    const-string v9, "UpcycleLandingModel(icon="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", items="

    const-string v7, ", analyticsCategory="

    invoke-static {v2, v1, v7, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", receivedKit="

    const-string v2, ", upcycleOffer="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
