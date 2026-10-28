.class public final Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$$serializer;,
        Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>?BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBW\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JV\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\"R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00088\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008:\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010\'\u00a8\u0006@"
    }
    d2 = {
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;",
        "label",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;",
        "badge",
        "backgroundImageUrl",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;",
        "footer",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_highlights_release",
        "(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;",
        "component3",
        "()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;",
        "component4",
        "component5",
        "()Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;",
        "component6",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;",
        "getLabel",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;",
        "getBadge",
        "getBackgroundImageUrl",
        "Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;",
        "getFooter",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "Companion",
        "$serializer",
        "a",
        "community-highlights_release"
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

.field public static final Companion:Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$a;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

.field private final footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

.field private final id:Ljava/lang/String;

.field private final interaction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->Companion:Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$a;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$$serializer;->INSTANCE:Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    iput-object p4, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    iput-object p5, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    iput-object p7, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->copy(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_highlights_release(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel$$serializer;->INSTANCE:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel$$serializer;

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel$$serializer;->INSTANCE:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel$$serializer;

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel$$serializer;->INSTANCE:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel$$serializer;

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;
    .locals 8

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;-><init>(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    iget-object v3, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    iget-object v3, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    iget-object v3, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBadge()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getLabel()Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->label:Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;

    iget-object v2, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->badge:Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;

    iget-object v3, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->footer:Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;

    iget-object v5, p0, Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "HighlightCardModel(id="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", badge="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImageUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", interaction="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
