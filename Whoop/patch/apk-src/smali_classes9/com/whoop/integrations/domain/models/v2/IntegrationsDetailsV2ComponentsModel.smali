.class public final Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$$serializer;,
        Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 J2\u00020\u0001:\u0002KJBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0080\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00108\u001a\u0004\u00089\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u0008;\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00108\u001a\u0004\u0008<\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008>\u0010?\u001a\u0004\u0008=\u0010\u0019R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00108\u0012\u0004\u0008A\u0010?\u001a\u0004\u0008@\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u0008B\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008D\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010E\u0012\u0004\u0008G\u0010?\u001a\u0004\u0008F\u0010#R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010H\u001a\u0004\u0008I\u0010%\u00a8\u0006L"
    }
    d2 = {
        "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;",
        "",
        "",
        "id",
        "reportingKey",
        "backgroundImageUrl",
        "iconUrl",
        "title",
        "description",
        "providerId",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "descriptionFootnote",
        "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
        "learnMoreButton",
        "",
        "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
        "connectionSections",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/design/models/MarkdownTextModel;",
        "component9",
        "()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
        "component10",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;",
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
        "(Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getReportingKey",
        "getBackgroundImageUrl",
        "getIconUrl",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getDescription",
        "getDescription$annotations",
        "getProviderId",
        "Lcom/whoop/design/models/MarkdownTextModel;",
        "getDescriptionFootnote",
        "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
        "getLearnMoreButton",
        "getLearnMoreButton$annotations",
        "Ljava/util/List;",
        "getConnectionSections",
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

.field public static final Companion:Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;

.field private final connectionSections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description_display"
    .end annotation
.end field

.field private final descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

.field private final iconUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "learn_more"
    .end annotation
.end field

.field private final providerId:Ljava/lang/String;

.field private final reportingKey:Ljava/lang/String;

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->Companion:Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lej1/a;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lej1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v2, v3, v0

    sput-object v3, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    iput-object p10, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    iput-object p11, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)V
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
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/MarkdownTextModel;",
            "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
            "Ljava/util/List<",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportingKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionSections"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    :cond_9
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

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description_display"
    .end annotation

    return-void
.end method

.method public static synthetic getLearnMoreButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "learn_more"
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

.method public static final synthetic write$Self$integrations_release(Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/MarkdownTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/MarkdownTextModel$$serializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;->INSTANCE:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/MarkdownTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/MarkdownTextModel;",
            "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;",
            "Ljava/util/List<",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
            ">;)",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportingKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImageUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionSections"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    iget-object v3, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectionSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionFootnote()Lcom/whoop/design/models/MarkdownTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreButton()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    return-object v0
.end method

.method public final getProviderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getReportingKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/MarkdownTextModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->reportingKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->iconUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->title:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->description:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->providerId:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->descriptionFootnote:Lcom/whoop/design/models/MarkdownTextModel;

    iget-object v8, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->learnMoreButton:Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;

    iget-object v9, p0, Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;->connectionSections:Ljava/util/List;

    const-string v10, ", reportingKey="

    const-string v11, ", backgroundImageUrl="

    const-string v12, "IntegrationsDetailsV2ComponentsModel(id="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    const-string v10, ", title="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", description="

    const-string v2, ", providerId="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionFootnote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", learnMoreButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectionSections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
