.class public final Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$$serializer;,
        Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002ONBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0091\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001aJ\u0094\u0001\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u0010/\u001a\u00020\u00072\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008<\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010:\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008=\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010:\u0012\u0004\u0008A\u0010?\u001a\u0004\u0008@\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010B\u001a\u0004\u0008C\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008D\u0010\u001aR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010:\u0012\u0004\u0008F\u0010?\u001a\u0004\u0008E\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008G\u0010\u001aR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008H\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010I\u001a\u0004\u0008J\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010K\u001a\u0004\u0008L\u0010\'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010:\u001a\u0004\u0008M\u0010\u001a\u00a8\u0006P"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;",
        "",
        "",
        "title",
        "price",
        "strikethroughPrice",
        "priceSubtitle",
        "",
        "selected",
        "trackingLabel",
        "ctaTitle",
        "secondaryCtaTitle",
        "disclaimer",
        "Lcom/whoop/navigation/e;",
        "checkout",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "tag",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "component10",
        "()Lcom/whoop/navigation/e;",
        "component11",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;",
        "toString",
        "hashCode",
        "()I",
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
        "(Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getPrice",
        "getStrikethroughPrice",
        "getStrikethroughPrice$annotations",
        "()V",
        "getPriceSubtitle",
        "getPriceSubtitle$annotations",
        "Z",
        "getSelected",
        "getTrackingLabel",
        "getCtaTitle",
        "getCtaTitle$annotations",
        "getSecondaryCtaTitle",
        "getDisclaimer",
        "Lcom/whoop/navigation/e;",
        "getCheckout",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getAction",
        "getTag",
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

.field public static final Companion:Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$Companion;


# instance fields
.field private final action:Lcom/whoop/whoopaction/domain/models/Action;

.field private final checkout:Lcom/whoop/navigation/e;

.field private final ctaTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_title"
    .end annotation
.end field

.field private final disclaimer:Ljava/lang/String;

.field private final price:Ljava/lang/String;

.field private final priceSubtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "price_subtitle"
    .end annotation
.end field

.field private final secondaryCtaTitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "secondary_cta_title"
    .end annotation
.end field

.field private final selected:Z

.field private final strikethroughPrice:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strikethrough_price"
    .end annotation
.end field

.field private final tag:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final trackingLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->Companion:Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lgw1/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lgw1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lgw1/a;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lgw1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xc

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/4 v4, 0x3

    aput-object v1, v5, v4

    const/4 v4, 0x4

    aput-object v1, v5, v4

    const/4 v4, 0x5

    aput-object v1, v5, v4

    const/4 v4, 0x6

    aput-object v1, v5, v4

    const/4 v4, 0x7

    aput-object v1, v5, v4

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v3, v5, v0

    const/16 v0, 0xa

    aput-object v2, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$$serializer;->INSTANCE:Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$$serializer;

    invoke-virtual {p14}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    iput-object p7, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    iput-object p12, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iput-object p13, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaTitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkout"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    .line 13
    iput-object p11, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    .line 14
    iput-object p12, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

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

    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-boolean p5, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCtaTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_title"
    .end annotation

    return-void
.end method

.method public static synthetic getPriceSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "price_subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getStrikethroughPrice$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "strikethrough_price"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-boolean v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xb

    iget-object p0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component11()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;
    .locals 14

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingLabel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaTitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkout"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;

    move-object v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    iget-boolean v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final getCheckout()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    return-object v0
.end method

.method public final getPriceSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecondaryCtaTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    return v0
.end method

.method public final getStrikethroughPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->price:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->strikethroughPrice:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->priceSubtitle:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->selected:Z

    iget-object v5, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->trackingLabel:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->ctaTitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->secondaryCtaTitle:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->disclaimer:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->checkout:Lcom/whoop/navigation/e;

    iget-object v10, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v11, p0, Lcom/whoop/membership/extensions/domain/models/ExtensionsV2LandingOption;->tag:Ljava/lang/String;

    const-string v12, ", price="

    const-string v13, ", strikethroughPrice="

    const-string v14, "ExtensionsV2LandingOption(title="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", priceSubtitle="

    const-string v12, ", selected="

    invoke-static {v0, v2, v1, v3, v12}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trackingLabel="

    const-string v2, ", ctaTitle="

    invoke-static {v0, v4, v1, v5, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", secondaryCtaTitle="

    const-string v2, ", disclaimer="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", checkout="

    const-string v2, ", action="

    invoke-static {v0, v8, v1, v9, v2}, Lq63/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
