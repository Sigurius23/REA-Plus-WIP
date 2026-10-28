.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 L2\u00020\u0001:\u0002MLB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u0093\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u009c\u0001\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010\u0019J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00109\u0012\u0004\u0008;\u0010<\u001a\u0004\u0008:\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u00109\u0012\u0004\u0008>\u0010<\u001a\u0004\u0008=\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00109\u0012\u0004\u0008@\u0010<\u001a\u0004\u0008?\u0010\u001bR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00109\u0012\u0004\u0008B\u0010<\u001a\u0004\u0008A\u0010\u001bR\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010C\u001a\u0004\u0008D\u0010 R\"\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u00109\u0012\u0004\u0008F\u0010<\u001a\u0004\u0008E\u0010\u001bR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010C\u001a\u0004\u0008G\u0010 R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u00109\u0012\u0004\u0008I\u0010<\u001a\u0004\u0008H\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00109\u001a\u0004\u0008J\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00109\u001a\u0004\u0008K\u0010\u001b\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;",
        "",
        "",
        "campaignId",
        "",
        "toolbarTitle",
        "title",
        "headerSubtitle",
        "headerIcon",
        "",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
        "contentBlocks",
        "description",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
        "documents",
        "alertTitle",
        "alertDisplay",
        "documentDisplay",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;",
        "toString",
        "hashCode",
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
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getCampaignId",
        "Ljava/lang/String;",
        "getToolbarTitle",
        "getToolbarTitle$annotations",
        "()V",
        "getTitle",
        "getTitle$annotations",
        "getHeaderSubtitle",
        "getHeaderSubtitle$annotations",
        "getHeaderIcon",
        "getHeaderIcon$annotations",
        "Ljava/util/List;",
        "getContentBlocks",
        "getDescription",
        "getDescription$annotations",
        "getDocuments",
        "getAlertTitle",
        "getAlertTitle$annotations",
        "getAlertDisplay",
        "getDocumentDisplay",
        "Companion",
        "$serializer",
        "whooplabs_release"
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

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$Companion;


# instance fields
.field private final alertDisplay:Ljava/lang/String;

.field private final alertTitle:Ljava/lang/String;

.field private final campaignId:I

.field private final contentBlocks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Ljava/lang/String;

.field private final documentDisplay:Ljava/lang/String;

.field private final documents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final headerIcon:Ljava/lang/String;

.field private final headerSubtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final toolbarTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ldq2/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ldq2/a;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Ldq2/a;-><init>(I)V

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

    aput-object v3, v4, v5

    const/4 v3, 0x6

    aput-object v1, v4, v3

    const/4 v3, 0x7

    aput-object v2, v4, v3

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7ff

    const/16 v0, 0x7ff

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$$serializer;

    invoke-virtual {p13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "contentBlocks"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

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

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAlertTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "alert_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description_display"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderSubtitle$annotations()V
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

.method public static synthetic getToolbarTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "page_title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x8

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;"
        }
    .end annotation

    const-string v0, "contentBlocks"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;

    move v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAlertDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAlertTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getCampaignId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    return v0
.end method

.method public final getContentBlocks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDocumentDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDocuments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    return-object v0
.end method

.method public final getHeaderIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getToolbarTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->campaignId:I

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->toolbarTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerSubtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->headerIcon:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->contentBlocks:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->description:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documents:Ljava/util/List;

    iget-object v8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertTitle:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->alertDisplay:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;->documentDisplay:Ljava/lang/String;

    const-string v11, ", toolbarTitle="

    const-string v12, ", title="

    const-string v13, "CampaignExtendedDetailsResponse(campaignId="

    invoke-static {v0, v13, v11, v1, v12}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headerSubtitle="

    const-string v11, ", headerIcon="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", contentBlocks="

    const-string v2, ", description="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", documents="

    const-string v2, ", alertTitle="

    invoke-static {v6, v1, v2, v0, v7}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", alertDisplay="

    const-string v2, ", documentDisplay="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v10, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
