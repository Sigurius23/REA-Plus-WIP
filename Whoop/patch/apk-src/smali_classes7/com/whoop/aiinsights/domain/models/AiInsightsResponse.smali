.class public final Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$$serializer;,
        Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 U2\u00020\u0001:\u0002VWB\u0091\u0001\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010&J\u009a\u0001\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010:\u0012\u0004\u0008<\u0010=\u001a\u0004\u0008;\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010:\u0012\u0004\u0008?\u0010=\u001a\u0004\u0008>\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010:\u0012\u0004\u0008A\u0010=\u001a\u0004\u0008@\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010:\u0012\u0004\u0008C\u0010=\u001a\u0004\u0008B\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010:\u0012\u0004\u0008E\u0010=\u001a\u0004\u0008D\u0010\u001aR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010:\u0012\u0004\u0008G\u0010=\u001a\u0004\u0008F\u0010\u001aR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010H\u0012\u0004\u0008J\u0010=\u001a\u0004\u0008I\u0010!R\"\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010:\u0012\u0004\u0008L\u0010=\u001a\u0004\u0008K\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010M\u0012\u0004\u0008O\u0010=\u001a\u0004\u0008N\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010P\u0012\u0004\u0008R\u0010=\u001a\u0004\u0008Q\u0010&R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010P\u0012\u0004\u0008T\u0010=\u001a\u0004\u0008S\u0010&\u00a8\u0006X"
    }
    d2 = {
        "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;",
        "",
        "",
        "conversationSeedId",
        "sourceType",
        "header",
        "rightIcon",
        "title",
        "message",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "content",
        "displayStyle",
        "Lcom/whoop/aiinsights/domain/models/SecondaryButton;",
        "contentActionButton",
        "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
        "leftButton",
        "rightButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "()Lcom/whoop/aiinsights/domain/models/SecondaryButton;",
        "component10",
        "()Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
        "component11",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;",
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
        "write$Self$ai_insights_release",
        "(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getConversationSeedId",
        "getConversationSeedId$annotations",
        "()V",
        "getSourceType",
        "getSourceType$annotations",
        "getHeader",
        "getHeader$annotations",
        "getRightIcon",
        "getRightIcon$annotations",
        "getTitle",
        "getTitle$annotations",
        "getMessage",
        "getMessage$annotations",
        "Ljava/util/List;",
        "getContent",
        "getContent$annotations",
        "getDisplayStyle",
        "getDisplayStyle$annotations",
        "Lcom/whoop/aiinsights/domain/models/SecondaryButton;",
        "getContentActionButton",
        "getContentActionButton$annotations",
        "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
        "getLeftButton",
        "getLeftButton$annotations",
        "getRightButton",
        "getRightButton$annotations",
        "Companion",
        "$serializer",
        "a",
        "ai-insights_release"
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

.field public static final Companion:Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$a;


# instance fields
.field private final content:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

.field private final conversationSeedId:Ljava/lang/String;

.field private final displayStyle:Ljava/lang/String;

.field private final header:Ljava/lang/String;

.field private final leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

.field private final message:Ljava/lang/String;

.field private final rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

.field private final rightIcon:Ljava/lang/String;

.field private final sourceType:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->Companion:Lcom/whoop/aiinsights/domain/models/AiInsightsResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ltb0/b;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Ltb0/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xb

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

    aput-object v2, v3, v4

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    const/4 v0, 0x0

    if-nez p13, :cond_0

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    goto :goto_8

    :cond_8
    iput-object p10, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    :goto_8
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    goto :goto_9

    :cond_9
    iput-object p11, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    :goto_9
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_a

    iput-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-void

    :cond_a
    iput-object p12, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)V
    .locals 0
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
            "Lcom/whoop/aiinsights/domain/models/SecondaryButton;",
            "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
            "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    .line 10
    iput-object p7, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    .line 11
    iput-object p8, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    .line 12
    iput-object p9, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    .line 13
    iput-object p10, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    .line 14
    iput-object p11, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move-object p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move-object p12, v0

    :goto_0
    move-object p11, p10

    move-object p10, p9

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

    :cond_a
    move-object p12, p11

    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)V

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;ILjava/lang/Object;)Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

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

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getContent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "content"
    .end annotation

    return-void
.end method

.method public static synthetic getContentActionButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "contentActionButton"
    .end annotation

    return-void
.end method

.method public static synthetic getConversationSeedId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "conversation_seed_id"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "displayStyle"
    .end annotation

    return-void
.end method

.method public static synthetic getHeader$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header"
    .end annotation

    return-void
.end method

.method public static synthetic getLeftButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "leftButton"
    .end annotation

    return-void
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "message"
    .end annotation

    return-void
.end method

.method public static synthetic getRightButton$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "rightButton"
    .end annotation

    return-void
.end method

.method public static synthetic getRightIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "rightIcon"
    .end annotation

    return-void
.end method

.method public static synthetic getSourceType$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "source_type"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$ai_insights_release(Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lcom/whoop/aiinsights/domain/models/SecondaryButton$$serializer;->INSTANCE:Lcom/whoop/aiinsights/domain/models/SecondaryButton$$serializer;

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    if-eqz v1, :cond_13

    :goto_9
    sget-object v1, Lcom/whoop/aiinsights/domain/models/PrimaryButton$$serializer;->INSTANCE:Lcom/whoop/aiinsights/domain/models/PrimaryButton$$serializer;

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    if-eqz v1, :cond_15

    :goto_a
    sget-object v1, Lcom/whoop/aiinsights/domain/models/PrimaryButton$$serializer;->INSTANCE:Lcom/whoop/aiinsights/domain/models/PrimaryButton$$serializer;

    iget-object p0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/whoop/aiinsights/domain/models/PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-object v0
.end method

.method public final component11()Lcom/whoop/aiinsights/domain/models/PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/aiinsights/domain/models/SecondaryButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;
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
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/aiinsights/domain/models/SecondaryButton;",
            "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
            "Lcom/whoop/aiinsights/domain/models/PrimaryButton;",
            ")",
            "Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/aiinsights/domain/models/SecondaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;Lcom/whoop/aiinsights/domain/models/PrimaryButton;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;

    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    iget-object v3, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    iget-object p1, p1, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getContent()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    return-object v0
.end method

.method public final getContentActionButton()Lcom/whoop/aiinsights/domain/models/SecondaryButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    return-object v0
.end method

.method public final getConversationSeedId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeftButton()Lcom/whoop/aiinsights/domain/models/PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightButton()Lcom/whoop/aiinsights/domain/models/PrimaryButton;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/aiinsights/domain/models/SecondaryButton;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/aiinsights/domain/models/PrimaryButton;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/aiinsights/domain/models/PrimaryButton;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->conversationSeedId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->sourceType:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->header:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightIcon:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->title:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->message:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->content:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->displayStyle:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->contentActionButton:Lcom/whoop/aiinsights/domain/models/SecondaryButton;

    iget-object v9, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->leftButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    iget-object v10, p0, Lcom/whoop/aiinsights/domain/models/AiInsightsResponse;->rightButton:Lcom/whoop/aiinsights/domain/models/PrimaryButton;

    const-string v11, ", sourceType="

    const-string v12, ", header="

    const-string v13, "AiInsightsResponse(conversationSeedId="

    invoke-static {v13, v0, v11, v1, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rightIcon="

    const-string v11, ", title="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", message="

    const-string v2, ", content="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", displayStyle="

    const-string v2, ", contentActionButton="

    invoke-static {v1, v7, v2, v0, v6}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", leftButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rightButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
