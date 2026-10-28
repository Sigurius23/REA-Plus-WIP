.class public final Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0084\u0001\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008;\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008<\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008=\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008>\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008?\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00109\u001a\u0004\u0008@\u0010\u001aR\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00109\u001a\u0004\u0008A\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00109\u001a\u0004\u0008B\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010C\u001a\u0004\u0008D\u0010$\u00a8\u0006G"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;",
        "",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "navigationBar",
        "",
        "imageUrl",
        "title",
        "subtitle",
        "nameLabel",
        "nameValue",
        "dateLabel",
        "dateIcon",
        "timeLabel",
        "dateTimeValue",
        "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "button",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "copy",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/lang/String;",
        "getImageUrl",
        "getTitle",
        "getSubtitle",
        "getNameLabel",
        "getNameValue",
        "getDateLabel",
        "getDateIcon",
        "getTimeLabel",
        "getDateTimeValue",
        "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;",
        "getButton",
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$Companion;


# instance fields
.field private final button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

.field private final dateIcon:Ljava/lang/String;

.field private final dateLabel:Ljava/lang/String;

.field private final dateTimeValue:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final nameLabel:Ljava/lang/String;

.field private final nameValue:Ljava/lang/String;

.field private final navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

.field private final subtitle:Ljava/lang/String;

.field private final timeLabel:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v1, v0

    sget v2, Lcom/whoop/design/models/items/TagModel;->$stable:I

    or-int/2addr v1, v2

    or-int/2addr v0, v1

    sput v0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$$serializer;

    invoke-virtual {p13}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)V
    .locals 1

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameLabel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateLabel"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeLabel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    const/16 v1, 0xa

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;
    .locals 13

    const-string v0, "navigationBar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameLabel"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateLabel"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeLabel"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "button"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;-><init>(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getButton()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    return-object v0
.end method

.method public final getDateIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateTimeValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getNameLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getNameValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->navigationBar:Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->imageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->subtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameLabel:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->nameValue:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateLabel:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateIcon:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->timeLabel:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->dateTimeValue:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->button:Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "TestInputScreenResponse(navigationBar="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", imageUrl="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    const-string v1, ", nameLabel="

    invoke-static {v11, v2, v0, v3, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", nameValue="

    const-string v1, ", dateLabel="

    invoke-static {v11, v4, v0, v5, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", dateIcon="

    const-string v1, ", timeLabel="

    invoke-static {v11, v6, v0, v7, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", dateTimeValue="

    const-string v1, ", button="

    invoke-static {v11, v8, v0, v9, v1}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
