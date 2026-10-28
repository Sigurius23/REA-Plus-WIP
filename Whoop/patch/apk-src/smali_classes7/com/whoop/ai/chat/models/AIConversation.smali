.class public final Lcom/whoop/ai/chat/models/AIConversation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/models/AIConversation$$serializer;,
        Lcom/whoop/ai/chat/models/AIConversation$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rBY\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJP\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010#J\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00100\u001a\u0004\u00086\u0010\u001f\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/AIConversation;",
        "",
        "Lcom/whoop/ai/chat/models/AIConversationMetadata;",
        "metadata",
        "",
        "Lcom/whoop/ai/chat/models/AITurn;",
        "turns",
        "Lcom/whoop/ai/chat/models/CoachVersionTag;",
        "tag",
        "",
        "header",
        "suggestions",
        "<init>",
        "(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/models/AIConversation;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/ai/chat/models/AIConversationMetadata;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/ai/chat/models/CoachVersionTag;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "copy",
        "(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/AIConversation;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/ai/chat/models/AIConversationMetadata;",
        "getMetadata",
        "Ljava/util/List;",
        "getTurns",
        "Lcom/whoop/ai/chat/models/CoachVersionTag;",
        "getTag",
        "Ljava/lang/String;",
        "getHeader",
        "getSuggestions",
        "Companion",
        "$serializer",
        "a",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/ai/chat/models/AIConversation$a;


# instance fields
.field private final header:Ljava/lang/String;

.field private final metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

.field private final suggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

.field private final turns:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/ai/chat/models/AIConversation$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/models/AIConversation$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/models/AIConversation;->Companion:Lcom/whoop/ai/chat/models/AIConversation$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/models/AIConversation;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lxa1/a;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lxa1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lxa1/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lxa1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/ai/chat/models/AIConversation;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xd

    const/16 v0, 0xd

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/ai/chat/models/AIConversation$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/AIConversation$$serializer;

    invoke-virtual {p7}, Lcom/whoop/ai/chat/models/AIConversation$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    and-int/lit8 p2, p1, 0x2

    sget-object p7, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_1

    iput-object p7, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    :goto_0
    iput-object p4, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    iput-object p5, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    iput-object p7, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/models/AIConversationMetadata;",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;",
            "Lcom/whoop/ai/chat/models/CoachVersionTag;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turns"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suggestions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    .line 4
    iput-object p2, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    .line 6
    iput-object p4, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    .line 8
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/ai/chat/models/AIConversation;-><init>(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/ai/chat/models/AITurn$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/AITurn$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/AIConversation;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ai/chat/models/AIConversation;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ai/chat/models/AIConversation;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/AIConversation;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/ai/chat/models/AIConversation;->copy(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/models/AIConversation;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/ai/chat/models/AIConversation;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/ai/chat/models/AIConversationMetadata$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/AIConversationMetadata$$serializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lcom/whoop/ai/chat/models/CoachVersionTag$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/CoachVersionTag$$serializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/ai/chat/models/AIConversationMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/ai/chat/models/CoachVersionTag;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/AIConversation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/models/AIConversationMetadata;",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;",
            "Lcom/whoop/ai/chat/models/CoachVersionTag;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/ai/chat/models/AIConversation;"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turns"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suggestions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ai/chat/models/AIConversation;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/ai/chat/models/AIConversation;-><init>(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/models/AIConversation;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/models/AIConversation;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/ai/chat/models/AIConversationMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    return-object v0
.end method

.method public final getSuggestions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    return-object v0
.end method

.method public final getTag()Lcom/whoop/ai/chat/models/CoachVersionTag;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    return-object v0
.end method

.method public final getTurns()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/models/AITurn;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/AIConversationMetadata;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/CoachVersionTag;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/ai/chat/models/AIConversation;->metadata:Lcom/whoop/ai/chat/models/AIConversationMetadata;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/AIConversation;->turns:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/AIConversation;->tag:Lcom/whoop/ai/chat/models/CoachVersionTag;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/AIConversation;->header:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/ai/chat/models/AIConversation;->suggestions:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AIConversation(metadata="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", turns="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tag="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", header="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", suggestions="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
