.class public final Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$$serializer;,
        Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 H2\u00020\u0001:\u0002IHBs\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0092\u0001\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u0008;\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00108\u001a\u0004\u0008<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u0008=\u0010\u0018R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008>\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u0008?\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u0008@\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u0008A\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010B\u0012\u0004\u0008D\u0010E\u001a\u0004\u0008C\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010F\u001a\u0004\u0008G\u0010$\u00a8\u0006J"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "paymentMethodImageUrl",
        "title",
        "subtitle",
        "suffixTitle",
        "suffixSubtitle",
        "leftIcon",
        "rightIcon",
        "trackingId",
        "style",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;",
        "menuItemState",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/navigation/e;",
        "component11",
        "()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getPaymentMethodImageUrl",
        "getTitle",
        "getSubtitle",
        "getSuffixTitle",
        "getSuffixSubtitle",
        "getLeftIcon",
        "getRightIcon",
        "getTrackingId",
        "getStyle",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;",
        "getMenuItemState",
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

.field public static final Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$Companion;


# instance fields
.field private final destination:Lcom/whoop/navigation/e;

.field private final leftIcon:Ljava/lang/String;

.field private final menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

.field private final paymentMethodImageUrl:Ljava/lang/String;

.field private final rightIcon:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final suffixSubtitle:Ljava/lang/String;

.field private final suffixTitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final trackingId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->Companion:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lno2/a;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lno2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lno2/a;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Lno2/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v4, 0xb

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v1, v4, v6

    const/4 v6, 0x2

    aput-object v1, v4, v6

    const/4 v6, 0x3

    aput-object v1, v4, v6

    const/4 v6, 0x4

    aput-object v1, v4, v6

    aput-object v1, v4, v3

    aput-object v1, v4, v5

    const/4 v3, 0x7

    aput-object v1, v4, v3

    const/16 v3, 0x8

    aput-object v1, v4, v3

    const/16 v1, 0x9

    aput-object v2, v4, v1

    const/16 v1, 0xa

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    iput-object p12, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    .line 13
    iput-object p11, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ItemVisibilityStateEnum"

    invoke-static {}, Lcom/whoop/design/models/items/ItemVisibilityStateEnum;->values()[Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$universal_checkout_release(Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;
    .locals 13

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    iget-object p1, p1, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getMenuItemState()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    return-object v0
.end method

.method public final getPaymentMethodImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffixSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffixTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    if-nez v2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->paymentMethodImageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixTitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->suffixSubtitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->leftIcon:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->rightIcon:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->trackingId:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->style:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v10, p0, Lcom/whoop/universalcheckout/features/checkout/domain/models/items/PaymentMethodMenuTileModel;->menuItemState:Lcom/whoop/design/models/items/ItemVisibilityStateEnum;

    const-string v11, ", title="

    const-string v12, ", subtitle="

    const-string v13, "PaymentMethodMenuTileModel(paymentMethodImageUrl="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", suffixTitle="

    const-string v11, ", suffixSubtitle="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", leftIcon="

    const-string v2, ", rightIcon="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trackingId="

    const-string v2, ", style="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", destination="

    const-string v2, ", menuItemState="

    invoke-static {v0, v8, v1, v9, v2}, Lq63/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
