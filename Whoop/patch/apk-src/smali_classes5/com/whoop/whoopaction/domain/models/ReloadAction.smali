.class public final Lcom/whoop/whoopaction/domain/models/ReloadAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/Action;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/ReloadAction$$serializer;,
        Lcom/whoop/whoopaction/domain/models/ReloadAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB9\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010,\u001a\u0004\u0008-\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u0008/\u0010\u001d\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/ReloadAction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "request",
        "Lcom/whoop/whoopaction/domain/models/ReloadMode;",
        "reloadMode",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "cachePolicy",
        "<init>",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/ReloadAction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/navigation/models/ApiRequest;",
        "component2",
        "()Lcom/whoop/whoopaction/domain/models/ReloadMode;",
        "component3",
        "()Lcom/whoop/navigation/CachePolicyModel;",
        "copy",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)Lcom/whoop/whoopaction/domain/models/ReloadAction;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "getRequest",
        "Lcom/whoop/whoopaction/domain/models/ReloadMode;",
        "getReloadMode",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "getCachePolicy",
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

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/ReloadAction$Companion;


# instance fields
.field private final cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

.field private final reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

.field private final request:Lcom/whoop/navigation/models/ApiRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ReloadAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/ReloadAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->Companion:Lcom/whoop/whoopaction/domain/models/ReloadAction$Companion;

    sget v0, Lcom/whoop/navigation/CachePolicyModel;->$stable:I

    sget v2, Lcom/whoop/navigation/models/ApiRequest;->$stable:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v3, 0x15

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

    sput-object v2, Lcom/whoop/whoopaction/domain/models/ReloadAction;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/whoopaction/domain/models/ReloadAction$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/ReloadAction$$serializer;

    invoke-virtual {p5}, Lcom/whoop/whoopaction/domain/models/ReloadAction$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lcom/whoop/whoopaction/domain/models/ReloadMode;->PERSISTENT:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    .line 3
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reloadMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    .line 6
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    .line 7
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    sget-object p2, Lcom/whoop/whoopaction/domain/models/ReloadMode;->PERSISTENT:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/ReloadAction;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/ReloadMode;->Companion:Lcom/whoop/whoopaction/domain/models/ReloadMode$Companion;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/ReloadMode$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/ReloadAction;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/ReloadAction;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/ReloadAction;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/ReloadAction;->copy(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)Lcom/whoop/whoopaction/domain/models/ReloadAction;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/ReloadAction;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/navigation/models/ApiRequest$$serializer;->INSTANCE:Lcom/whoop/navigation/models/ApiRequest$$serializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    sget-object v3, Lcom/whoop/whoopaction/domain/models/ReloadMode;->PERSISTENT:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/whoop/navigation/CachePolicyModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CachePolicyModel$$serializer;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public final component2()Lcom/whoop/whoopaction/domain/models/ReloadMode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/CachePolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)Lcom/whoop/whoopaction/domain/models/ReloadAction;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reloadMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whoopaction/domain/models/ReloadAction;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/whoopaction/domain/models/ReloadAction;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/whoopaction/domain/models/ReloadMode;Lcom/whoop/navigation/CachePolicyModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/ReloadAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/ReloadAction;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCachePolicy()Lcom/whoop/navigation/CachePolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-object v0
.end method

.method public final getReloadMode()Lcom/whoop/whoopaction/domain/models/ReloadMode;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    return-object v0
.end method

.method public final getRequest()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/CachePolicyModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->request:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->reloadMode:Lcom/whoop/whoopaction/domain/models/ReloadMode;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/ReloadAction;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ReloadAction(request="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reloadMode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cachePolicy="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
