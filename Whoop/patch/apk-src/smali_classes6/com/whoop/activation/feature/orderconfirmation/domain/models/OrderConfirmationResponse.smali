.class public final Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$$serializer;,
        Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u0081\u0001\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ~\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00088\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00089\u0010\u0017R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008;\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010<\u001a\u0004\u0008=\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u0008>\u0010\u0017R \u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010?\u0012\u0004\u0008A\u0010B\u001a\u0004\u0008@\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008C\u0010\u001c\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
        "",
        "",
        "imageName",
        "backgroundImageUrl",
        "header",
        "description",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "menuItems",
        "educationContent",
        "provisionalEmail",
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;",
        "cta",
        "footerButtons",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component7",
        "component8",
        "()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;",
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
        "write$Self$activation_release",
        "(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getImageName",
        "getBackgroundImageUrl",
        "getHeader",
        "getDescription",
        "Ljava/util/List;",
        "getMenuItems",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getEducationContent",
        "getProvisionalEmail",
        "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;",
        "getCta",
        "getCta$annotations",
        "()V",
        "getFooterButtons",
        "Companion",
        "$serializer",
        "activation_release"
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

.field public static final Companion:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

.field private final description:Ljava/lang/String;

.field private final educationContent:Lcom/whoop/design/models/DesignSystemModel;

.field private final footerButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final header:Ljava/lang/String;

.field private final imageName:Ljava/lang/String;

.field private final menuItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final provisionalEmail:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->Companion:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw70/a;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lw70/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw70/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lw70/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw70/a;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lw70/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x9

    new-array v7, v7, [Ll83/h;

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v1, v7, v8

    const/4 v4, 0x3

    aput-object v1, v7, v4

    const/4 v4, 0x4

    aput-object v3, v7, v4

    const/4 v3, 0x5

    aput-object v5, v7, v3

    const/4 v3, 0x6

    aput-object v1, v7, v3

    const/4 v3, 0x7

    aput-object v1, v7, v3

    aput-object v2, v7, v0

    sput-object v7, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0xfd

    const/16 v0, 0xfd

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$$serializer;->INSTANCE:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    :goto_0
    iput-object p4, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    iput-object p8, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_2

    iput-object p11, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    return-void

    :cond_2
    iput-object p10, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "imageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menuItems"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    .line 11
    iput-object p9, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_1

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)V

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
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

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

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCta$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$activation_release(Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta$$serializer;->INSTANCE:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta$$serializer;

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;"
        }
    .end annotation

    const-string v0, "imageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menuItems"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;

    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    iget-object v3, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCta()Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getEducationContent()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getFooterButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    return-object v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMenuItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    return-object v0
.end method

.method public final getProvisionalEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    invoke-virtual {v2}, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->imageName:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->backgroundImageUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->header:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->description:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->menuItems:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->educationContent:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v6, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->provisionalEmail:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->cta:Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationCta;

    iget-object v8, p0, Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;->footerButtons:Ljava/util/List;

    const-string v9, ", backgroundImageUrl="

    const-string v10, ", header="

    const-string v11, "OrderConfirmationResponse(imageName="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    const-string v9, ", menuItems="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", educationContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", provisionalEmail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerButtons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v8, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
