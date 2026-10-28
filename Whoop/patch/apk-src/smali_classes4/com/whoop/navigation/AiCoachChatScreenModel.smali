.class public final Lcom/whoop/navigation/AiCoachChatScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/AiCoachChatScreenModel$$serializer;,
        Lcom/whoop/navigation/AiCoachChatScreenModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 N2\u00020\u0001:\u0002OPB\u00b3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00b3\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0010\u0010+\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010(J\u0010\u0010,\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010(J\u0010\u0010-\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u00c2\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010\u001dJ\u0010\u00101\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u00020\u000e2\u0008\u00104\u001a\u0004\u0018\u000103H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010@\u001a\u0004\u0008A\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008B\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010@\u001a\u0004\u0008C\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010@\u001a\u0004\u0008D\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010@\u001a\u0004\u0008E\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008F\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010@\u001a\u0004\u0008G\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010@\u001a\u0004\u0008H\u0010\u001dR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008J\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010K\u001a\u0004\u0008L\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010@\u001a\u0004\u0008M\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010K\u001a\u0004\u0008\u0011\u0010(R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010K\u001a\u0004\u0008\u0012\u0010(R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010K\u001a\u0004\u0008\u0013\u0010(R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010K\u001a\u0004\u0008\u0014\u0010(\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/whoop/navigation/AiCoachChatScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "",
        "fingerprint",
        "sourceId",
        "sourceType",
        "staticInitialMessage",
        "userMessage",
        "onboardingAnalyticSource",
        "educationType",
        "presetQuestionKey",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "args",
        "",
        "shouldOpenFullSize",
        "coachEverywhereMainContent",
        "isCoachEverywhereDetailScreen",
        "isPrefetchEnabled",
        "isPushNavigationEnabled",
        "isWhoopCoachEverywhere",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Ljava/util/Map;",
        "component10",
        "()Z",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)Lcom/whoop/navigation/AiCoachChatScreenModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/AiCoachChatScreenModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getFingerprint",
        "getSourceId",
        "getSourceType",
        "getStaticInitialMessage",
        "getUserMessage",
        "getOnboardingAnalyticSource",
        "getEducationType",
        "getPresetQuestionKey",
        "Ljava/util/Map;",
        "getArgs",
        "Z",
        "getShouldOpenFullSize",
        "getCoachEverywhereMainContent",
        "Companion",
        "$serializer",
        "a",
        "navigation_release"
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

.field public static final Companion:Lcom/whoop/navigation/AiCoachChatScreenModel$a;


# instance fields
.field private final args:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final coachEverywhereMainContent:Ljava/lang/String;

.field private final educationType:Ljava/lang/String;

.field private final fingerprint:Ljava/lang/String;

.field private final isCoachEverywhereDetailScreen:Z

.field private final isPrefetchEnabled:Z

.field private final isPushNavigationEnabled:Z

.field private final isWhoopCoachEverywhere:Z

.field private final onboardingAnalyticSource:Ljava/lang/String;

.field private final presetQuestionKey:Ljava/lang/String;

.field private final shouldOpenFullSize:Z

.field private final sourceId:Ljava/lang/String;

.field private final sourceType:Ljava/lang/String;

.field private final staticInitialMessage:Ljava/lang/String;

.field private final userMessage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/navigation/AiCoachChatScreenModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/AiCoachChatScreenModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->Companion:Lcom/whoop/navigation/AiCoachChatScreenModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lim1/l0;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lim1/l0;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xf

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

    aput-object v2, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    const/16 v0, 0xe

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/navigation/AiCoachChatScreenModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x7

    const/4 v1, 0x7

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/navigation/AiCoachChatScreenModel$$serializer;->INSTANCE:Lcom/whoop/navigation/AiCoachChatScreenModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p7, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    :goto_3
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p9, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_6

    .line 2
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 3
    iput-object p2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    goto :goto_5

    :cond_6
    iput-object p10, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    :goto_5
    and-int/lit16 p2, p1, 0x200

    const/4 p4, 0x0

    if-nez p2, :cond_7

    iput-boolean p4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    goto :goto_6

    :cond_7
    iput-boolean p11, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    :goto_6
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p12, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_9

    iput-boolean p4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    goto :goto_8

    :cond_9
    iput-boolean p13, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    :goto_8
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_a

    const/4 p2, 0x1

    :goto_9
    iput-boolean p2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    goto :goto_a

    :cond_a
    move/from16 p2, p14

    goto :goto_9

    :goto_a
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_b

    iput-boolean p4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    goto :goto_b

    :cond_b
    move/from16 p2, p15

    iput-boolean p2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    :goto_b
    and-int/lit16 p1, p1, 0x4000

    if-nez p1, :cond_c

    iput-boolean p4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    return-void

    :cond_c
    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)V
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
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;Z",
            "Ljava/lang/String;",
            "ZZZZ)V"
        }
    .end annotation

    const-string v0, "fingerprint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    .line 14
    iput-boolean p10, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    .line 15
    iput-object p11, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    .line 16
    iput-boolean p12, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    .line 17
    iput-boolean p13, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    .line 18
    iput-boolean p14, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    move/from16 p1, p15

    .line 19
    iput-boolean p1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    .line 20
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object v12, v1

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    move v13, v3

    goto :goto_6

    :cond_6
    move/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move v15, v3

    goto :goto_8

    :cond_8
    move/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    move/from16 v16, v1

    goto :goto_9

    :cond_9
    move/from16 v16, p13

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move/from16 v17, v3

    goto :goto_a

    :cond_a
    move/from16 v17, p14

    :goto_a
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_b

    move/from16 v18, v3

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v3, p0

    goto :goto_b

    :cond_b
    move/from16 v18, p15

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    .line 21
    :goto_b
    invoke-direct/range {v3 .. v18}, Lcom/whoop/navigation/AiCoachChatScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/AiCoachChatScreenModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/AiCoachChatScreenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZILjava/lang/Object;)Lcom/whoop/navigation/AiCoachChatScreenModel;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-boolean v1, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    move/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    goto :goto_f

    :cond_e
    move/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/whoop/navigation/AiCoachChatScreenModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)Lcom/whoop/navigation/AiCoachChatScreenModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/AiCoachChatScreenModel;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v4}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    if-eqz v4, :cond_1

    :goto_0
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    if-eqz v4, :cond_3

    :goto_1
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    if-eqz v4, :cond_5

    :goto_2
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    if-eqz v4, :cond_7

    :goto_3
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v2, 0x7

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    if-eqz v4, :cond_9

    :goto_4
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_5

    :cond_a
    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    sget-object v5, Lm83/z;->w:Lm83/z;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :goto_5
    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    invoke-interface {p1, p2, v2, v0, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-boolean v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    if-eqz v2, :cond_d

    :goto_6
    iget-boolean v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    invoke-interface {p1, p2, v0, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_d
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    if-eqz v1, :cond_11

    :goto_8
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_11
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    if-eq v1, v3, :cond_13

    :goto_9
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_13
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    if-eqz v1, :cond_15

    :goto_a
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_15
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    if-eqz v1, :cond_17

    :goto_b
    iget-boolean p0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    return v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)Lcom/whoop/navigation/AiCoachChatScreenModel;
    .locals 17
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
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;Z",
            "Ljava/lang/String;",
            "ZZZZ)",
            "Lcom/whoop/navigation/AiCoachChatScreenModel;"
        }
    .end annotation

    const-string v0, "fingerprint"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceType"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/navigation/AiCoachChatScreenModel;

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/whoop/navigation/AiCoachChatScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/AiCoachChatScreenModel;

    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    iget-boolean p1, p1, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    if-eq v1, p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getArgs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final getCoachEverywhereMainContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getEducationType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    return-object v0
.end method

.method public final getFingerprint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnboardingAnalyticSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    return-object v0
.end method

.method public final getPresetQuestionKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldOpenFullSize()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    return v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final getStaticInitialMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    if-nez v2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isCoachEverywhereDetailScreen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    return v0
.end method

.method public final isPrefetchEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    return v0
.end method

.method public final isPushNavigationEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    return v0
.end method

.method public final isWhoopCoachEverywhere()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->fingerprint:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceId:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->sourceType:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->staticInitialMessage:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->userMessage:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->onboardingAnalyticSource:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->educationType:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->presetQuestionKey:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->args:Ljava/util/Map;

    iget-boolean v10, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->shouldOpenFullSize:Z

    iget-object v11, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->coachEverywhereMainContent:Ljava/lang/String;

    iget-boolean v12, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isCoachEverywhereDetailScreen:Z

    iget-boolean v13, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPrefetchEnabled:Z

    iget-boolean v14, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isPushNavigationEnabled:Z

    iget-boolean v15, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;->isWhoopCoachEverywhere:Z

    const-string v0, ", sourceId="

    move/from16 v16, v15

    const-string v15, ", sourceType="

    move/from16 v17, v13

    const-string v13, "AiCoachChatScreenModel(fingerprint="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", staticInitialMessage="

    const-string v2, ", userMessage="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", onboardingAnalyticSource="

    const-string v2, ", educationType="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", presetQuestionKey="

    const-string v2, ", args="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldOpenFullSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", coachEverywhereMainContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isCoachEverywhereDetailScreen="

    const-string v2, ", isPrefetchEnabled="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", isPushNavigationEnabled="

    const-string v2, ", isWhoopCoachEverywhere="

    move/from16 v3, v17

    invoke-static {v0, v3, v1, v14, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    move/from16 v2, v16

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
