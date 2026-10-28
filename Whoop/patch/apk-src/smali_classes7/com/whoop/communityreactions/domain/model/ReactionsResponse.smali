.class public final Lcom/whoop/communityreactions/domain/model/ReactionsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/communityreactions/domain/model/ReactionsResponse$$serializer;,
        Lcom/whoop/communityreactions/domain/model/ReactionsResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000289BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eBY\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\r\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001fJR\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010#J\u0010\u0010(\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00102\u001a\u0004\u00083\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00085\u0010#R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00100\u001a\u0004\u00086\u0010\u001f\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;",
        "",
        "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;",
        "input",
        "",
        "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;",
        "quickReactions",
        "",
        "previewRotationSeconds",
        "",
        "previewSummaryLabel",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "<init>",
        "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$community_reactions_arch_mini_release",
        "(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/lang/Integer;",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "copy",
        "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityreactions/domain/model/ReactionsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;",
        "getInput",
        "Ljava/util/List;",
        "getQuickReactions",
        "Ljava/lang/Integer;",
        "getPreviewRotationSeconds",
        "Ljava/lang/String;",
        "getPreviewSummaryLabel",
        "getItems",
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

.field public static final Companion:Lcom/whoop/communityreactions/domain/model/ReactionsResponse$a;


# instance fields
.field private final input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final previewRotationSeconds:Ljava/lang/Integer;

.field private final previewSummaryLabel:Ljava/lang/String;

.field private final quickReactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->Companion:Lcom/whoop/communityreactions/domain/model/ReactionsResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lej1/a;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lej1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lej1/a;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lej1/a;-><init>(I)V

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

    sput-object v3, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xd

    const/16 v0, 0xd

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/communityreactions/domain/model/ReactionsResponse$$serializer;->INSTANCE:Lcom/whoop/communityreactions/domain/model/ReactionsResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    and-int/lit8 p2, p1, 0x2

    sget-object p7, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_1

    iput-object p7, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    :goto_0
    iput-object p4, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    iput-object p5, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    iput-object p7, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;",
            "Ljava/util/List<",
            "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quickReactions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    .line 6
    iput-object p4, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct/range {p1 .. p6}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;-><init>(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/communityreactions/domain/model/QuickReactionModel$$serializer;->INSTANCE:Lcom/whoop/communityreactions/domain/model/QuickReactionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/communityreactions/domain/model/ReactionsResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->copy(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$community_reactions_arch_mini_release(Lcom/whoop/communityreactions/domain/model/ReactionsResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/communityreactions/domain/model/ReactionsInputModel$$serializer;->INSTANCE:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel$$serializer;

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityreactions/domain/model/ReactionsResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;",
            "Ljava/util/List<",
            "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/communityreactions/domain/model/ReactionsResponse;"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quickReactions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;-><init>(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;

    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getInput()Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getPreviewRotationSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPreviewSummaryLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuickReactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    invoke-virtual {v0}, Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->input:Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;

    iget-object v1, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->quickReactions:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewRotationSeconds:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->previewSummaryLabel:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/communityreactions/domain/model/ReactionsResponse;->items:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ReactionsResponse(input="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", quickReactions="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", previewRotationSeconds="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", previewSummaryLabel="

    const-string v1, ", items="

    invoke-static {v2, v0, v3, v1, v5}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
