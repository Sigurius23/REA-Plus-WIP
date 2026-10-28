.class public final Lcom/whoop/membership/returns/domain/models/ReturnResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/returns/domain/models/ReturnResponse$$serializer;,
        Lcom/whoop/membership/returns/domain/models/ReturnResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0081\u0008\u0018\u0000 A2\u00020\u0001:\u0002BAB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0081\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u0010\u0010(\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010!J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010!J\u0010\u0010*\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+Jv\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010+J\u0010\u0010/\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00105\u001a\u0004\u00086\u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00105\u001a\u0004\u00087\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00088\u0010!R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00089\u0010!R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008;\u0010&R \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008<\u0010&R\u001a\u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00105\u001a\u0004\u0008=\u0010!R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u00105\u001a\u0004\u0008>\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010?\u001a\u0004\u0008@\u0010+\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/membership/returns/domain/models/ReturnResponse;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "navbarTitle",
        "alertTitle",
        "alertSubtitle",
        "instructionsTitle",
        "",
        "Lcom/whoop/membership/returns/domain/models/Instruction;",
        "instructions",
        "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
        "buttons",
        "footerText",
        "policyCtaText",
        "",
        "policyCtaUrl",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$membership_release",
        "(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/String;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/ReturnResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getNavbarTitle",
        "getAlertTitle",
        "getAlertSubtitle",
        "getInstructionsTitle",
        "Ljava/util/List;",
        "getInstructions",
        "getButtons",
        "getFooterText",
        "getPolicyCtaText",
        "Ljava/lang/String;",
        "getPolicyCtaUrl",
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

.field public static final Companion:Lcom/whoop/membership/returns/domain/models/ReturnResponse$Companion;


# instance fields
.field private final alertSubtitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alert_subtitle"
    .end annotation
.end field

.field private final alertTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alert_title"
    .end annotation
.end field

.field private final buttons:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "buttons"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
            ">;"
        }
    .end annotation
.end field

.field private final footerText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "footer_text"
    .end annotation
.end field

.field private final instructions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "instructions"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/Instruction;",
            ">;"
        }
    .end annotation
.end field

.field private final instructionsTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "instructions_title"
    .end annotation
.end field

.field private final navbarTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "navbar_title"
    .end annotation
.end field

.field private final policyCtaText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "policy_cta_text"
    .end annotation
.end field

.field private final policyCtaUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "policy_cta_url"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/membership/returns/domain/models/ReturnResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/membership/returns/domain/models/ReturnResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->Companion:Lcom/whoop/membership/returns/domain/models/ReturnResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/design/models/modal/a;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lcom/whoop/design/models/modal/a;

    const/4 v6, 0x6

    invoke-direct {v5, v6}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x9

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v1, v5, v7

    const/4 v7, 0x3

    aput-object v1, v5, v7

    const/4 v7, 0x4

    aput-object v3, v5, v7

    aput-object v2, v5, v4

    aput-object v1, v5, v6

    const/4 v2, 0x7

    aput-object v1, v5, v2

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p11, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/membership/returns/domain/models/ReturnResponse$$serializer;->INSTANCE:Lcom/whoop/membership/returns/domain/models/ReturnResponse$$serializer;

    invoke-virtual {p11}, Lcom/whoop/membership/returns/domain/models/ReturnResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/Instruction;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "navbarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructionsTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaText"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaUrl"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object p8, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    .line 11
    iput-object p9, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/membership/returns/domain/models/Instruction$$serializer;->INSTANCE:Lcom/whoop/membership/returns/domain/models/Instruction$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/membership/returns/domain/models/DownloadButton$$serializer;->INSTANCE:Lcom/whoop/membership/returns/domain/models/DownloadButton$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/returns/domain/models/ReturnResponse;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/ReturnResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$membership_release(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-object p0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/Instruction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/ReturnResponse;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/Instruction;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/membership/returns/domain/models/ReturnResponse;"
        }
    .end annotation

    const-string v0, "navbarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructionsTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaUrl"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/whoop/membership/returns/domain/models/ReturnResponse;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;

    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAlertSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getAlertTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButton;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final getFooterText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getInstructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/Instruction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final getInstructionsTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getNavbarTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPolicyCtaText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPolicyCtaUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->navbarTitle:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertTitle:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->instructions:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->buttons:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->footerText:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaText:Lcom/whoop/design/util/TextResource;

    iget-object v8, p0, Lcom/whoop/membership/returns/domain/models/ReturnResponse;->policyCtaUrl:Ljava/lang/String;

    const-string v9, ", alertTitle="

    const-string v10, ", alertSubtitle="

    const-string v11, "ReturnResponse(navbarTitle="

    invoke-static {v11, v0, v9, v1, v10}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", instructionsTitle="

    const-string v9, ", instructions="

    invoke-static {v0, v2, v1, v3, v9}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", buttons="

    const-string v2, ", footerText="

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", policyCtaText="

    const-string v2, ", policyCtaUrl="

    invoke-static {v0, v6, v1, v7, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
