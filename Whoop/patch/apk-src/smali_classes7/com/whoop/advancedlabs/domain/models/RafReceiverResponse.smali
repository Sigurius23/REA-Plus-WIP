.class public final Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$$serializer;,
        Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 B2\u00020\u0001:\u0002CBB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B{\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!Jv\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00087\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00088\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u00089\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00104\u001a\u0004\u0008:\u0010\u0017R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010;\u001a\u0004\u0008<\u0010\u001eR\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00104\u001a\u0004\u0008=\u0010\u0017R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010>\u0012\u0004\u0008@\u0010A\u001a\u0004\u0008?\u0010!\u00a8\u0006D"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;",
        "",
        "",
        "analyticsName",
        "analyticsActionName",
        "analyticsCategory",
        "imageUrl",
        "title",
        "subtitle",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "ctaText",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "component9",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;",
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
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getAnalyticsName",
        "getAnalyticsActionName",
        "getAnalyticsCategory",
        "getImageUrl",
        "getTitle",
        "getSubtitle",
        "Ljava/util/List;",
        "getItems",
        "getCtaText",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Companion",
        "$serializer",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$Companion;


# instance fields
.field private final analyticsActionName:Ljava/lang/String;

.field private final analyticsCategory:Ljava/lang/String;

.field private final analyticsName:Ljava/lang/String;

.field private final ctaText:Ljava/lang/String;

.field private final destination:Lcom/whoop/navigation/e;

.field private final imageUrl:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->Companion:Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ltb0/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ltb0/a;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Ltb0/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x9

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

    aput-object v3, v4, v5

    const/4 v3, 0x7

    aput-object v1, v4, v3

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    const-string v0, "analyticsName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    .line 10
    iput-object p8, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    :cond_8
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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;"
        }
    .end annotation

    const-string v0, "analyticsName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v10}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAnalyticsActionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    return-object v0
.end method

.method public final getAnalyticsCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    return-object v0
.end method

.method public final getAnalyticsName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsName:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsActionName:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->analyticsCategory:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->imageUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->title:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->subtitle:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->items:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->ctaText:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->destination:Lcom/whoop/navigation/e;

    const-string v9, ", analyticsActionName="

    const-string v10, ", analyticsCategory="

    const-string v11, "RafReceiverResponse(analyticsName="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl="

    const-string v9, ", title="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", subtitle="

    const-string v2, ", items="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", ctaText="

    const-string v2, ", destination="

    invoke-static {v1, v7, v2, v0, v6}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
