.class public final Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$$serializer;,
        Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JB\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\"J\u0010\u0010&\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001cR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010\"\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/models/cards/Header;",
        "header",
        "",
        "Lcom/whoop/design/models/cards/LineItem;",
        "lineItems",
        "Lcom/whoop/design/models/cards/Footer;",
        "footer",
        "",
        "status",
        "<init>",
        "(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/models/cards/Header;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/cards/Footer;",
        "component4",
        "()Ljava/lang/String;",
        "copy",
        "(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/models/cards/Header;",
        "getHeader",
        "Ljava/util/List;",
        "getLineItems",
        "Lcom/whoop/design/models/cards/Footer;",
        "getFooter",
        "Ljava/lang/String;",
        "getStatus",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$Companion;


# instance fields
.field private final footer:Lcom/whoop/design/models/cards/Footer;

.field private final header:Lcom/whoop/design/models/cards/Header;

.field private final lineItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/cards/LineItem;",
            ">;"
        }
    .end annotation
.end field

.field private final status:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->Companion:Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lt42/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lt42/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    iput-object p3, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    iput-object p5, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/cards/Header;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/cards/LineItem;",
            ">;",
            "Lcom/whoop/design/models/cards/Footer;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/cards/LineItem$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/LineItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->copy(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/design/models/cards/Header$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/Header$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/cards/Footer$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/Footer$$serializer;

    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/models/cards/Header;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/cards/LineItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/cards/Footer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/cards/Header;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/cards/LineItem;",
            ">;",
            "Lcom/whoop/design/models/cards/Footer;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;-><init>(Lcom/whoop/design/models/cards/Header;Ljava/util/List;Lcom/whoop/design/models/cards/Footer;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;

    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    iget-object v3, p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    iget-object v3, p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFooter()Lcom/whoop/design/models/cards/Footer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/cards/Header;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    return-object v0
.end method

.method public final getLineItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/cards/LineItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    invoke-virtual {v0}, Lcom/whoop/design/models/cards/Header;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/cards/Footer;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->header:Lcom/whoop/design/models/cards/Header;

    iget-object v1, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->lineItems:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->footer:Lcom/whoop/design/models/cards/Footer;

    iget-object v3, p0, Lcom/whoop/design/models/cards/AdvancedLabsSubscriptionCardModel;->status:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AdvancedLabsSubscriptionCardModel(header="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lineItems="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
