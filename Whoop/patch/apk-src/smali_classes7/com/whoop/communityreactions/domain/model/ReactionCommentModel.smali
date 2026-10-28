.class public final Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$$serializer;,
        Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;<BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JZ\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010.\u001a\u00020-2\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00100\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00100\u001a\u0004\u00082\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00083\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00084\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00085\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u00089\u0010&\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "avatar",
        "name",
        "badge",
        "text",
        "Les0/a;",
        "renderStyle",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "longPressAction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_reactions_arch_mini_release",
        "(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "toString",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Les0/a;",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getAvatar",
        "getName",
        "getBadge",
        "getText",
        "Les0/a;",
        "getRenderStyle",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getLongPressAction",
        "Companion",
        "$serializer",
        "a",
        "community-reactions-arch-mini_release"
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

.field public static final Companion:Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$a;


# instance fields
.field private final avatar:Ljava/lang/String;

.field private final badge:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final name:Ljava/lang/String;

.field private final renderStyle:Les0/a;

.field private final text:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->Companion:Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$a;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lej1/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lej1/a;-><init>(I)V

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

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v0, v2, v3

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x5f

    const/16 v0, 0x5f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$$serializer;->INSTANCE:Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Les0/a;->TEXT:Les0/a;

    .line 3
    iput-object p1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    goto :goto_0

    :cond_1
    iput-object p7, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    :goto_0
    iput-object p8, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    .line 11
    iput-object p7, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    .line 12
    sget-object p6, Les0/a;->TEXT:Les0/a;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    .line 13
    invoke-direct/range {v0 .. v7}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.communityreactions.domain.model.ReactionRenderStyle"

    invoke-static {}, Les0/a;->values()[Les0/a;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_reactions_arch_mini_release(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    sget-object v3, Les0/a;->TEXT:Les0/a;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Les0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;
    .locals 9

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;

    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAvatar()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public final getBadge()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLongPressAction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRenderStyle()Les0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->avatar:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->badge:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->text:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->longPressAction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;->renderStyle:Les0/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ReactionCommentModel(id="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", renderStyle="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
