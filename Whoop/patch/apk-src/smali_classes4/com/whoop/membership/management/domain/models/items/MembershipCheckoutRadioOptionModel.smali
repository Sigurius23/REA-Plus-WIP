.class public final Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$$serializer;,
        Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 H2\u00020\u0001:\u0002IHBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0087\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u008a\u0001\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010.\u001a\u00020\u00072\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001\u00a2\u0006\u0004\u00086\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00109\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00109\u001a\u0004\u0008;\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00109\u001a\u0004\u0008<\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008=\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010>\u001a\u0004\u0008?\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00109\u001a\u0004\u0008@\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00109\u001a\u0004\u0008A\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00109\u001a\u0004\u0008B\u0010\u0019R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010C\u001a\u0004\u0008D\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00109\u001a\u0004\u0008E\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010F\u001a\u0004\u0008G\u0010&\u00a8\u0006J"
    }
    d2 = {
        "Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "price",
        "strikethroughPrice",
        "priceSubtitle",
        "",
        "selected",
        "trackingLabel",
        "radioGroup",
        "disclaimer",
        "Lcom/whoop/navigation/e;",
        "destination",
        "tag",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Z",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/navigation/e;",
        "component10",
        "component11",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;",
        "toString",
        "hashCode",
        "()I",
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
        "write$Self$membership_release",
        "(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getPrice",
        "getStrikethroughPrice",
        "getPriceSubtitle",
        "Z",
        "getSelected",
        "getTrackingLabel",
        "getRadioGroup",
        "getDisclaimer",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getTag",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getAction",
        "Companion",
        "$serializer",
        "membership_release"
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

.field public static final Companion:Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$Companion;


# instance fields
.field private final action:Lcom/whoop/whoopaction/domain/models/Action;

.field private final destination:Lcom/whoop/navigation/e;

.field private final disclaimer:Ljava/lang/String;

.field private final price:Ljava/lang/String;

.field private final priceSubtitle:Ljava/lang/String;

.field private final radioGroup:Ljava/lang/String;

.field private final selected:Z

.field private final strikethroughPrice:Ljava/lang/String;

.field private final tag:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final trackingLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->Companion:Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lhb1/l;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lhb1/l;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lhb1/l;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lhb1/l;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xb

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v5, 0x7

    aput-object v1, v4, v5

    aput-object v3, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$$serializer;->INSTANCE:Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$$serializer;

    invoke-virtual {p13}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    iput-object p7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    iput-object p11, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    .line 12
    iput-object p10, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ILjava/lang/Object;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-boolean p5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-boolean v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;
    .locals 13

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    iget-boolean v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object p1, p1, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final getPriceSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRadioGroup()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    return v0
.end method

.method public final getStrikethroughPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->price:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->strikethroughPrice:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->priceSubtitle:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->selected:Z

    iget-object v5, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->trackingLabel:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->radioGroup:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->disclaimer:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->destination:Lcom/whoop/navigation/e;

    iget-object v9, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->tag:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/membership/management/domain/models/items/MembershipCheckoutRadioOptionModel;->action:Lcom/whoop/whoopaction/domain/models/Action;

    const-string v11, ", price="

    const-string v12, ", strikethroughPrice="

    const-string v13, "MembershipCheckoutRadioOptionModel(title="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", priceSubtitle="

    const-string v11, ", selected="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trackingLabel="

    const-string v2, ", radioGroup="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disclaimer="

    const-string v2, ", destination="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
