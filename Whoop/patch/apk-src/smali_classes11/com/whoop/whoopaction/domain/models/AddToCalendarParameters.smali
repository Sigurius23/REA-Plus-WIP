.class public final Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/OSActionParameters;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$$serializer;,
        Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u0008\u0012\u0019\u0010\n\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBW\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010 \u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J#\u0010\"\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001fJx\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u001b\u0008\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u00082\u001b\u0008\u0002\u0010\n\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001fR3\u0010\t\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00102\u0012\u0004\u00084\u00105\u001a\u0004\u00083\u0010!R3\u0010\n\u001a\u00150\u0004j\u0002`\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00102\u0012\u0004\u00087\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00100\u001a\u0004\u00088\u0010\u001fR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00100\u001a\u0004\u00089\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00100\u001a\u0004\u0008:\u0010\u001f\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;",
        "Lcom/whoop/whoopaction/domain/models/OSActionParameters;",
        "",
        "title",
        "Ljava/util/Date;",
        "Lcom/whoop/serialization/Date;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "startDate",
        "endDate",
        "location",
        "notes",
        "url",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/Date;",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/Date;",
        "getStartDate",
        "getStartDate$annotations",
        "()V",
        "getEndDate",
        "getEndDate$annotations",
        "getLocation",
        "getNotes",
        "getUrl",
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

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$Companion;


# instance fields
.field private final endDate:Ljava/util/Date;

.field private final location:Ljava/lang/String;

.field private final notes:Ljava/lang/String;

.field private final startDate:Ljava/util/Date;

.field private final title:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->Companion:Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$$serializer;

    invoke-virtual {p8}, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    return-void

    :cond_3
    iput-object p7, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endDate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    .line 5
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    .line 6
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x8

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_2

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p7, p6

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->copy(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getEndDate$annotations()V
    .locals 0
    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static synthetic getStartDate$annotations()V
    .locals 0
    .annotation runtime Lwc3/i;
        with = Lu82/b;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lu82/b;->a:Lu82/b;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endDate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEndDate()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getLocation()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartDate()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    invoke-static {v2, v0, v1}, Ly00/t7;->c(Ljava/util/Date;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->startDate:Ljava/util/Date;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->endDate:Ljava/util/Date;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->location:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->notes:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;->url:Ljava/lang/String;

    const-string v6, ", startDate="

    const-string v7, ", endDate="

    const-string v8, "AddToCalendarParameters(title="

    invoke-static {v8, v0, v6, v1, v7}, Lc13/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", location="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
