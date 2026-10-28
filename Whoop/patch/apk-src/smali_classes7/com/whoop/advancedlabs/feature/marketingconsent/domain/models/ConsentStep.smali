.class public final Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$$serializer;,
        Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278B;\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBY\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!JN\u0010#\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001eR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u00082\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010!R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00085\u0010!\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;",
        "",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "itemsAboveToggle",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;",
        "toggle",
        "itemsBelowToggle",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
        "ctaWhenToggleOff",
        "ctaWhenToggleOn",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;",
        "component3",
        "component4",
        "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
        "component5",
        "copy",
        "(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getItemsAboveToggle",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;",
        "getToggle",
        "getItemsBelowToggle",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
        "getCtaWhenToggleOff",
        "getCtaWhenToggleOn",
        "Companion",
        "$serializer",
        "a",
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

.field public static final Companion:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$a;


# instance fields
.field private final ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

.field private final ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

.field private final itemsAboveToggle:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final itemsBelowToggle:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->Companion:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lnx1/a;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lnx1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lnx1/a;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lnx1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    const/4 v2, 0x2

    aput-object v0, v3, v2

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$$serializer;

    invoke-virtual {p7}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    iput-object p4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    iput-object p6, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
            ")V"
        }
    .end annotation

    const-string v0, "itemsAboveToggle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemsBelowToggle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaWhenToggleOff"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaWhenToggleOn"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    .line 7
    iput-object p5, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;ILjava/lang/Object;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->copy(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle$$serializer;

    iget-object v2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object p0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    return-object v0
.end method

.method public final component5()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;",
            ")",
            "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;"
        }
    .end annotation

    const-string v0, "itemsAboveToggle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemsBelowToggle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaWhenToggleOff"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaWhenToggleOn"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;-><init>(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    iget-object p1, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCtaWhenToggleOff()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    return-object v0
.end method

.method public final getCtaWhenToggleOn()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    return-object v0
.end method

.method public final getItemsAboveToggle()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    return-object v0
.end method

.method public final getItemsBelowToggle()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    return-object v0
.end method

.method public final getToggle()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsAboveToggle:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->toggle:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;

    iget-object v2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->itemsBelowToggle:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOff:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    iget-object v4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->ctaWhenToggleOn:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ConsentStep(itemsAboveToggle="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", toggle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", itemsBelowToggle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ctaWhenToggleOff="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ctaWhenToggleOn="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
