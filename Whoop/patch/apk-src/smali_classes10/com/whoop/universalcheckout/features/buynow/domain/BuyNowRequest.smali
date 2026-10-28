.class public final Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$$serializer;,
        Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@ABm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0016J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0016J\u008a\u0001\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00103\u001a\u0004\u00085\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00086\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00087\u0010\u0016R\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u00089\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u0008:\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u0008;\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008<\u0010\u0016R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u0008=\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00103\u001a\u0004\u0008>\u0010\u0016\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;",
        "",
        "",
        "idempotencyKey",
        "storeDomain",
        "sku",
        "packSku",
        "",
        "childItemSkus",
        "wywSku",
        "bandSku",
        "claspSku",
        "hookSku",
        "fastLinkSku",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;",
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
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getIdempotencyKey",
        "getStoreDomain",
        "getSku",
        "getPackSku",
        "Ljava/util/List;",
        "getChildItemSkus",
        "getWywSku",
        "getBandSku",
        "getClaspSku",
        "getHookSku",
        "getFastLinkSku",
        "Companion",
        "$serializer",
        "a",
        "universal-checkout_release"
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$a;


# instance fields
.field private final bandSku:Ljava/lang/String;

.field private final childItemSkus:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final claspSku:Ljava/lang/String;

.field private final fastLinkSku:Ljava/lang/String;

.field private final hookSku:Ljava/lang/String;

.field private final idempotencyKey:Ljava/lang/String;

.field private final packSku:Ljava/lang/String;

.field private final sku:Ljava/lang/String;

.field private final storeDomain:Ljava/lang/String;

.field private final wywSku:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->Companion:Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lsl0/a1;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lsl0/a1;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v2, v3, v4

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$$serializer;

    invoke-virtual {p12}, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "idempotencyKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeDomain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x9

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;"
        }
    .end annotation

    const-string v0, "idempotencyKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeDomain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBandSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getChildItemSkus()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    return-object v0
.end method

.method public final getClaspSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getFastLinkSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getHookSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getIdempotencyKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getPackSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public final getStoreDomain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    return-object v0
.end method

.method public final getWywSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->idempotencyKey:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->storeDomain:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->sku:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->packSku:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->childItemSkus:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->wywSku:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->bandSku:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->claspSku:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->hookSku:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/universalcheckout/features/buynow/domain/BuyNowRequest;->fastLinkSku:Ljava/lang/String;

    const-string v10, ", storeDomain="

    const-string v11, ", sku="

    const-string v12, "BuyNowRequest(idempotencyKey="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", packSku="

    const-string v10, ", childItemSkus="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", wywSku="

    const-string v2, ", bandSku="

    invoke-static {v1, v5, v2, v0, v4}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", claspSku="

    const-string v2, ", hookSku="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", fastLinkSku="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
