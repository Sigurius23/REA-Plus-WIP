.class public final Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$$serializer;,
        Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JKB\u0089\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u0019J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u0019J\u0092\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u0019J\u0010\u0010+\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010!J\u001a\u0010.\u001a\u00020\u000e2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008<\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010=\u001a\u0004\u0008>\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00109\u001a\u0004\u0008?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008@\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010A\u001a\u0004\u0008B\u0010!R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010A\u001a\u0004\u0008C\u0010!R\u0017\u0010\r\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010A\u001a\u0004\u0008D\u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010E\u001a\u0004\u0008F\u0010%R\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00109\u001a\u0004\u0008G\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00109\u001a\u0004\u0008H\u0010\u0019\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "subtitle",
        "image",
        "",
        "stackedImages",
        "price",
        "strikethroughPrice",
        "",
        "quantity",
        "minQuantity",
        "maxQuantity",
        "",
        "hideQuantity",
        "lineItemId",
        "analyticsLabel",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "component6",
        "component7",
        "()I",
        "component8",
        "component9",
        "component10",
        "()Z",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$universal_checkout_release",
        "(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "getImage",
        "Ljava/util/List;",
        "getStackedImages",
        "getPrice",
        "getStrikethroughPrice",
        "I",
        "getQuantity",
        "getMinQuantity",
        "getMaxQuantity",
        "Z",
        "getHideQuantity",
        "getLineItemId",
        "getAnalyticsLabel",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$a;


# instance fields
.field private final analyticsLabel:Ljava/lang/String;

.field private final hideQuantity:Z

.field private final image:Ljava/lang/String;

.field private final lineItemId:Ljava/lang/String;

.field private final maxQuantity:I

.field private final minQuantity:I

.field private final price:Ljava/lang/String;

.field private final quantity:I

.field private final stackedImages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final strikethroughPrice:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->Companion:Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcj0/f;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lcj0/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xc

    new-array v3, v3, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v3, v5

    const/4 v5, 0x1

    aput-object v1, v3, v5

    const/4 v5, 0x2

    aput-object v1, v3, v5

    const/4 v5, 0x3

    aput-object v2, v3, v5

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    aput-object v1, v3, v4

    const/16 v0, 0xb

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p14, p1, 0x1

    const-string v0, ""

    if-nez p14, :cond_0

    iput-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_6

    iput p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    goto :goto_6

    :cond_6
    iput p8, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    goto :goto_7

    :cond_7
    iput p9, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    goto :goto_8

    :cond_8
    iput p10, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-boolean p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    goto :goto_9

    :cond_9
    iput-boolean p11, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    :goto_9
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    goto :goto_a

    :cond_a
    iput-object p12, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    :goto_a
    and-int/lit16 p1, p1, 0x800

    if-nez p1, :cond_b

    iput-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    return-void

    :cond_b
    iput-object p13, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItemId"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsLabel"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    .line 8
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    .line 10
    iput p7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    .line 11
    iput p8, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    .line 12
    iput p9, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    .line 13
    iput-boolean p10, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    .line 14
    iput-object p11, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    .line 15
    iput-object p12, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    .line 16
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object p2, v2

    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    move-object v1, v2

    goto :goto_0

    :cond_2
    move-object v1, p3

    :goto_0
    and-int/lit8 v3, v0, 0x8

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    move-object v3, v4

    goto :goto_1

    :cond_3
    move-object v3, p4

    :goto_1
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    move-object v5, v2

    goto :goto_2

    :cond_4
    move-object/from16 v5, p5

    :goto_2
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    move-object/from16 v4, p6

    :goto_3
    and-int/lit8 v6, v0, 0x40

    const/4 v7, 0x0

    if-eqz v6, :cond_6

    move v6, v7

    goto :goto_4

    :cond_6
    move/from16 v6, p7

    :goto_4
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    move v8, v7

    goto :goto_5

    :cond_7
    move/from16 v8, p8

    :goto_5
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    move v9, v7

    goto :goto_6

    :cond_8
    move/from16 v9, p9

    :goto_6
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v7, p10

    :goto_7
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    move-object v10, v2

    goto :goto_8

    :cond_a
    move-object/from16 v10, p11

    :goto_8
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move-object/from16 p13, v2

    :goto_9
    move-object p3, p2

    move-object p4, v1

    move-object/from16 p5, v3

    move-object/from16 p7, v4

    move-object/from16 p6, v5

    move/from16 p8, v6

    move/from16 p11, v7

    move/from16 p9, v8

    move/from16 p10, v9

    move-object/from16 p12, v10

    move-object p2, p1

    move-object p1, p0

    goto :goto_a

    :cond_b
    move-object/from16 p13, p12

    goto :goto_9

    :goto_a
    invoke-direct/range {p1 .. p13}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)V

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

    invoke-static {}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-boolean p10, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :goto_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    if-eqz v1, :cond_b

    :goto_5
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    if-eqz v1, :cond_d

    :goto_6
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    if-eqz v1, :cond_f

    :goto_7
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    if-eqz v1, :cond_11

    :goto_8
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    if-eqz v1, :cond_13

    :goto_9
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :goto_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_15
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :goto_b
    iget-object p0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItemId"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsLabel"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    move-object v2, p1

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v13}, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    iget v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    iget v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    iget v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    iget-boolean v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAnalyticsLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getHideQuantity()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    return v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLineItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxQuantity()I
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    return v0
.end method

.method public final getMinQuantity()I
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    return v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuantity()I
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    return v0
.end method

.method public final getStackedImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    return-object v0
.end method

.method public final getStrikethroughPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

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

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->image:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->stackedImages:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->price:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->strikethroughPrice:Ljava/lang/String;

    iget v6, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->quantity:I

    iget v7, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->minQuantity:I

    iget v8, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->maxQuantity:I

    iget-boolean v9, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->hideQuantity:Z

    iget-object v10, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->lineItemId:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/universalcheckout/features/cart/domain/models/items/CartItemModel;->analyticsLabel:Ljava/lang/String;

    const-string v12, ", subtitle="

    const-string v13, ", image="

    const-string v14, "CartItemModel(title="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stackedImages="

    const-string v12, ", price="

    invoke-static {v2, v1, v12, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", strikethroughPrice="

    const-string v2, ", quantity="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", minQuantity="

    const-string v2, ", maxQuantity="

    invoke-static {v0, v6, v1, v7, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", hideQuantity="

    const-string v2, ", lineItemId="

    invoke-static {v8, v1, v2, v0, v9}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", analyticsLabel="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
