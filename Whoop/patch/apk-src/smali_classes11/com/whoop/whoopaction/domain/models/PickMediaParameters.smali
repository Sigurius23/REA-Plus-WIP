.class public final Lcom/whoop/whoopaction/domain/models/PickMediaParameters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/OSActionParameters;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/PickMediaParameters$$serializer;,
        Lcom/whoop/whoopaction/domain/models/PickMediaParameters$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R&\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010-\u001a\u0004\u0008.\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00080\u0010\u001e\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/PickMediaParameters;",
        "Lcom/whoop/whoopaction/domain/models/OSActionParameters;",
        "",
        "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
        "mediaTypes",
        "Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
        "source",
        "",
        "stateKey",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/PickMediaParameters;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
        "component3",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/PickMediaParameters;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getMediaTypes",
        "getMediaTypes$annotations",
        "()V",
        "Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
        "getSource",
        "Ljava/lang/String;",
        "getStateKey",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/PickMediaParameters$Companion;


# instance fields
.field private final mediaTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;"
        }
    .end annotation
.end field

.field private final source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

.field private final stateKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/PickMediaParameters$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->Companion:Lcom/whoop/whoopaction/domain/models/PickMediaParameters$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/whoopaction/domain/models/PickMediaParameters$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/PickMediaParameters$$serializer;

    invoke-virtual {p5}, Lcom/whoop/whoopaction/domain/models/PickMediaParameters$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "mediaTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    .line 5
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.whoopaction.domain.models.PickMediaSource"

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/PickMediaSource;->values()[Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/PickMediaParameters;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/PickMediaParameters;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->copy(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMediaTypes$annotations()V
    .locals 0
    .annotation runtime Lwc3/i;
        with = Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/PickMediaParameters;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/whoopaction/domain/models/PickMediaSource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/PickMediaParameters;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/whoopaction/domain/models/PickMediaParameters;"
        }
    .end annotation

    const-string v0, "mediaTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;-><init>(Ljava/util/List;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMediaTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    return-object v0
.end method

.method public final getSource()Lcom/whoop/whoopaction/domain/models/PickMediaSource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    return-object v0
.end method

.method public final getStateKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->mediaTypes:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->source:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/PickMediaParameters;->stateKey:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PickMediaParameters(mediaTypes="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stateKey="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
