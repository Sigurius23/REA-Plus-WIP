.class public final Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$$serializer;,
        Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000245BA\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bBa\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJX\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010+\u001a\u0004\u00080\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010+\u001a\u0004\u00081\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010+\u001a\u0004\u00082\u0010\u001b\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;",
        "",
        "",
        "cartId",
        "wywSku",
        "bandSku",
        "claspSku",
        "hookSku",
        "fastLinkSku",
        "storeDomain",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getCartId",
        "getWywSku",
        "getBandSku",
        "getClaspSku",
        "getHookSku",
        "getFastLinkSku",
        "getStoreDomain",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$a;


# instance fields
.field private final bandSku:Ljava/lang/String;

.field private final cartId:Ljava/lang/String;

.field private final claspSku:Ljava/lang/String;

.field private final fastLinkSku:Ljava/lang/String;

.field private final hookSku:Ljava/lang/String;

.field private final storeDomain:Ljava/lang/String;

.field private final wywSku:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->Companion:Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$$serializer;

    invoke-virtual {p9}, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "wywSku"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bandSku"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "claspSku"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hookSku"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fastLinkSku"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeDomain"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;
    .locals 9

    const-string v0, "wywSku"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bandSku"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "claspSku"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hookSku"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fastLinkSku"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storeDomain"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBandSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getCartId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    return-object v0
.end method

.method public final getClaspSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getFastLinkSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getHookSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    return-object v0
.end method

.method public final getStoreDomain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    return-object v0
.end method

.method public final getWywSku()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->cartId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->wywSku:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->bandSku:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->claspSku:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->hookSku:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->fastLinkSku:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/AddWhoopYourWayToCartRequest;->storeDomain:Ljava/lang/String;

    const-string v7, ", wywSku="

    const-string v8, ", bandSku="

    const-string v9, "AddWhoopYourWayToCartRequest(cartId="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", claspSku="

    const-string v7, ", hookSku="

    invoke-static {v0, v2, v1, v3, v7}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", fastLinkSku="

    const-string v2, ", storeDomain="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
