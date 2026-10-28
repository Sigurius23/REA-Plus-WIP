.class public final Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$$serializer;,
        Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB{\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0016J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJx\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00103\u001a\u0004\u00085\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00086\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00087\u0010\u0016R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u00089\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008;\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u0008<\u0010\u0016R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00103\u001a\u0004\u0008=\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010:\u001a\u0004\u0008>\u0010\u001d\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;",
        "",
        "",
        "integrationId",
        "title",
        "heroImageUrl",
        "description",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "designItems",
        "footerDisclaimer",
        "connectionUrlBase",
        "connectionButtonText",
        "secondaryButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;",
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
        "write$Self$integrations_release",
        "(Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getIntegrationId",
        "getTitle",
        "getHeroImageUrl",
        "getDescription",
        "Ljava/util/List;",
        "getDesignItems",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getFooterDisclaimer",
        "getConnectionUrlBase",
        "getConnectionButtonText",
        "getSecondaryButton",
        "Companion",
        "$serializer",
        "integrations_release"
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

.field public static final Companion:Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$Companion;


# instance fields
.field private final connectionButtonText:Ljava/lang/String;

.field private final connectionUrlBase:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final designItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

.field private final heroImageUrl:Ljava/lang/String;

.field private final integrationId:Ljava/lang/String;

.field private final secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->Companion:Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ldq2/a;

    invoke-direct {v3, v0}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ldq2/a;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v6, Ldq2/a;

    const/16 v7, 0xa

    invoke-direct {v6, v7}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v3, v5, v6

    const/4 v3, 0x5

    aput-object v4, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    :goto_3
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_5

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-void

    :cond_5
    iput-object p10, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V
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
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")V"
        }
    .end annotation

    const-string v0, "integrationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heroImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "designItems"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    .line 10
    iput-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    .line 11
    iput-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 14
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p8

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object v2, p0

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    .line 15
    :goto_4
    invoke-direct/range {v2 .. v11}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$integrations_release(Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;
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
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")",
            "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;"
        }
    .end annotation

    const-string v0, "integrationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heroImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "designItems"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    iget-object p1, p1, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getConnectionButtonText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectionUrlBase()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDesignItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final getFooterDisclaimer()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getHeroImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntegrationId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSecondaryButton()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

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

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->integrationId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->heroImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->description:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->designItems:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->footerDisclaimer:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v6, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionUrlBase:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->connectionButtonText:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;->secondaryButton:Lcom/whoop/design/models/DesignSystemModel;

    const-string v9, ", title="

    const-string v10, ", heroImageUrl="

    const-string v11, "IntegrationsDisclaimerModel(integrationId="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    const-string v9, ", designItems="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footerDisclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionUrlBase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionButtonText="

    const-string v2, ", secondaryButton="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
