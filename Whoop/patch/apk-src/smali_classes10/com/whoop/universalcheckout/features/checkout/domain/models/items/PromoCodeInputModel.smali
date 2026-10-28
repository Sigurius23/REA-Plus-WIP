.class public final Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$$serializer;,
        Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\r\u0010\u000eB[\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JV\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010*\u001a\u00020)H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00100\u001a\u00020\u00082\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00102\u001a\u0004\u00084\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00102\u001a\u0004\u00085\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u00089\u0010$R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010&\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "placeholder",
        "expandedTitle",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;",
        "cta",
        "",
        "promoCodeApplied",
        "",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
        "promoCodeTags",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;",
        "component5",
        "()Z",
        "component6",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "getPlaceholder",
        "getExpandedTitle",
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;",
        "getCta",
        "Z",
        "getPromoCodeApplied",
        "Ljava/util/List;",
        "getPromoCodeTags",
        "Companion",
        "$serializer",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$Companion;


# instance fields
.field private final cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

.field private final expandedTitle:Lcom/whoop/design/util/TextResource;

.field private final placeholder:Lcom/whoop/design/util/TextResource;

.field private final promoCodeApplied:Z

.field private final promoCodeTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lno2/a;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lno2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

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

    const/4 v1, 0x5

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    iput-boolean p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    iput-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promoCodeTags"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel$$serializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;",
            "Z",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
            ">;)",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promoCodeTags"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;ZLjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    iget-boolean v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCta()Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    return-object v0
.end method

.method public final getExpandedTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPlaceholder()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPromoCodeApplied()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    return v0
.end method

.method public final getPromoCodeTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeTagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

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

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->placeholder:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->expandedTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->cta:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputCtaModel;

    iget-boolean v4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeApplied:Z

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PromoCodeInputModel;->promoCodeTags:Ljava/util/List;

    const-string v6, ", placeholder="

    const-string v7, ", expandedTitle="

    const-string v8, "PromoCodeInputModel(title="

    invoke-static {v8, v0, v6, v1, v7}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", promoCodeApplied="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", promoCodeTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
