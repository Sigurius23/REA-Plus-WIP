.class public final Lcom/whoop/integrations/domain/models/IntegrationTabModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/integrations/domain/models/IntegrationTabModel$$serializer;,
        Lcom/whoop/integrations/domain/models/IntegrationTabModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 K2\u00020\u0001:\u0002LKBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0093\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u0019J\u0098\u0001\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020\u000c2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010;\u001a\u0004\u0008<\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008=\u0010\u0019R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00108\u0012\u0004\u0008A\u0010?\u001a\u0004\u0008@\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u0008B\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u0008C\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u0008D\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010E\u001a\u0004\u0008F\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008G\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00108\u001a\u0004\u0008H\u0010\u0019R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u00108\u0012\u0004\u0008J\u0010?\u001a\u0004\u0008I\u0010\u0019\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/integrations/domain/models/IntegrationTabModel;",
        "",
        "",
        "id",
        "reportingKey",
        "Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;",
        "displayType",
        "title",
        "subtitle",
        "ctaText",
        "bannerImage",
        "iconImage",
        "",
        "connected",
        "connectedFrom3P",
        "screenName",
        "detailsUrl",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Boolean;",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/IntegrationTabModel;",
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
        "write$Self$integrations_release",
        "(Lcom/whoop/integrations/domain/models/IntegrationTabModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getReportingKey",
        "Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;",
        "getDisplayType",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getSubtitle",
        "getSubtitle$annotations",
        "getCtaText",
        "getBannerImage",
        "getIconImage",
        "Ljava/lang/Boolean;",
        "getConnected",
        "getConnectedFrom3P",
        "getScreenName",
        "getDetailsUrl",
        "getDetailsUrl$annotations",
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

.field public static final Companion:Lcom/whoop/integrations/domain/models/IntegrationTabModel$Companion;


# instance fields
.field private final bannerImage:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner_image"
    .end annotation
.end field

.field private final connected:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "connected"
    .end annotation
.end field

.field private final connectedFrom3P:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "connected_from3_p"
    .end annotation
.end field

.field private final ctaText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_text"
    .end annotation
.end field

.field private final detailsUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "url"
    .end annotation
.end field

.field private final displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "display_type"
    .end annotation
.end field

.field private final iconImage:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon_image"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final reportingKey:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "reporting_key"
    .end annotation
.end field

.field private final screenName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screen_name"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle_display"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/integrations/domain/models/IntegrationTabModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/integrations/domain/models/IntegrationTabModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->Companion:Lcom/whoop/integrations/domain/models/IntegrationTabModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ldq2/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ldq2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xc

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v0, v2, v4

    const/4 v0, 0x3

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    const/4 v0, 0x7

    aput-object v1, v2, v0

    const/16 v0, 0x8

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    const/16 v0, 0xb

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/integrations/domain/models/IntegrationTabModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationTabModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/integrations/domain/models/IntegrationTabModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    iput-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    iput-object p11, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    iput-object p12, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportingKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconImage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    .line 6
    iput-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    .line 12
    iput-object p10, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    .line 13
    iput-object p11, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;->Companion:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType$Companion;

    invoke-virtual {v0}, Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/integrations/domain/models/IntegrationTabModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/integrations/domain/models/IntegrationTabModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/IntegrationTabModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDetailsUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "url"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$integrations_release(Lcom/whoop/integrations/domain/models/IntegrationTabModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    iget-object p0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/integrations/domain/models/IntegrationTabModel;
    .locals 14

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportingKey"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayType"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconImage"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;

    move-object v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/integrations/domain/models/IntegrationTabModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBannerImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnected()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getConnectedFrom3P()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCtaText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailsUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayType()Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    return-object v0
.end method

.method public final getIconImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getReportingKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->reportingKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->displayType:Lcom/whoop/integrations/domain/models/IntegrationTabDisplayType;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->title:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->subtitle:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->ctaText:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->bannerImage:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->iconImage:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connected:Ljava/lang/Boolean;

    iget-object v9, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->connectedFrom3P:Ljava/lang/Boolean;

    iget-object v10, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->screenName:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/integrations/domain/models/IntegrationTabModel;->detailsUrl:Ljava/lang/String;

    const-string v12, ", reportingKey="

    const-string v13, ", displayType="

    const-string v14, "IntegrationTabModel(id="

    invoke-static {v14, v0, v12, v1, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ctaText="

    const-string v2, ", bannerImage="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", iconImage="

    const-string v2, ", connected="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", connectedFrom3P="

    const-string v2, ", screenName="

    invoke-static {v0, v8, v1, v9, v2}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v1, ", detailsUrl="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
