.class public final Lcom/whoop/navigation/AiAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/AiAction$$serializer;,
        Lcom/whoop/navigation/AiAction$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u0000 _2\u00020\u0001:\u0002`aB\u00c3\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u00cf\u0001\u0008\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010!J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010!J\u0010\u0010*\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010!J\u0012\u0010-\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u001c\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u00e2\u0001\u00107\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00142\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u00087\u00108J\u0010\u00109\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010!J\u0010\u0010:\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008:\u0010;J\u001a\u0010=\u001a\u00020\u000c2\u0008\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001\u00a2\u0006\u0004\u0008E\u0010FR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010H\u001a\u0004\u0008I\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010H\u001a\u0004\u0008J\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010H\u001a\u0004\u0008K\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010H\u001a\u0004\u0008L\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010H\u001a\u0004\u0008M\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010H\u001a\u0004\u0008N\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010H\u001a\u0004\u0008O\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010H\u001a\u0004\u0008P\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010H\u001a\u0004\u0008Q\u0010!R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010R\u001a\u0004\u0008S\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008T\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010U\u001a\u0004\u0008V\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010H\u001a\u0004\u0008W\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010H\u001a\u0004\u0008X\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010Y\u001a\u0004\u0008Z\u00102R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010[\u001a\u0004\u0008\\\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010]\u001a\u0004\u0008^\u00106\u00a8\u0006b"
    }
    d2 = {
        "Lcom/whoop/navigation/AiAction;",
        "",
        "",
        "source",
        "screenId",
        "sourceType",
        "sourceId",
        "agentId",
        "conversationSeedId",
        "fingerprint",
        "presetQuestion",
        "educationType",
        "",
        "shouldOpenFullSize",
        "entryText",
        "includeInitialMessage",
        "staticInitialMessage",
        "userMessage",
        "Lcom/whoop/navigation/ChatEntrypointExperience;",
        "entrypointExperience",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "args",
        "Lcom/whoop/navigation/DrawerPresentation;",
        "drawerPresentation",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "component10",
        "()Z",
        "component11",
        "component12",
        "()Ljava/lang/Boolean;",
        "component13",
        "component14",
        "component15",
        "()Lcom/whoop/navigation/ChatEntrypointExperience;",
        "component16",
        "()Ljava/util/Map;",
        "component17",
        "()Lcom/whoop/navigation/DrawerPresentation;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)Lcom/whoop/navigation/AiAction;",
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
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/AiAction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getSource",
        "getScreenId",
        "getSourceType",
        "getSourceId",
        "getAgentId",
        "getConversationSeedId",
        "getFingerprint",
        "getPresetQuestion",
        "getEducationType",
        "Z",
        "getShouldOpenFullSize",
        "getEntryText",
        "Ljava/lang/Boolean;",
        "getIncludeInitialMessage",
        "getStaticInitialMessage",
        "getUserMessage",
        "Lcom/whoop/navigation/ChatEntrypointExperience;",
        "getEntrypointExperience",
        "Ljava/util/Map;",
        "getArgs",
        "Lcom/whoop/navigation/DrawerPresentation;",
        "getDrawerPresentation",
        "Companion",
        "a",
        "$serializer",
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

.field public static final Companion:Lcom/whoop/navigation/AiAction$a;

.field private static final PREFIX:Ljava/lang/String; = "ai_action."

.field private static final json:Lad3/c;

.field private static final logger:Ltr2/n;


# instance fields
.field private final agentId:Ljava/lang/String;

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

.field private final conversationSeedId:Ljava/lang/String;

.field private final drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

.field private final educationType:Ljava/lang/String;

.field private final entryText:Ljava/lang/String;

.field private final entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

.field private final fingerprint:Ljava/lang/String;

.field private final includeInitialMessage:Ljava/lang/Boolean;

.field private final presetQuestion:Ljava/lang/String;

.field private final screenId:Ljava/lang/String;

.field private final shouldOpenFullSize:Z

.field private final source:Ljava/lang/String;

.field private final sourceId:Ljava/lang/String;

.field private final sourceType:Ljava/lang/String;

.field private final staticInitialMessage:Ljava/lang/String;

.field private final userMessage:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/navigation/AiAction$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/AiAction$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/AiAction;->Companion:Lcom/whoop/navigation/AiAction$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/AiAction;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lim1/l0;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lim1/l0;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lim1/l0;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lim1/l0;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lim1/l0;

    const/16 v6, 0x19

    invoke-direct {v5, v6}, Lim1/l0;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x11

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

    aput-object v1, v5, v6

    const/4 v6, 0x5

    aput-object v1, v5, v6

    const/4 v6, 0x6

    aput-object v1, v5, v6

    const/4 v6, 0x7

    aput-object v1, v5, v6

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    const/16 v0, 0xc

    aput-object v1, v5, v0

    const/16 v0, 0xd

    aput-object v1, v5, v0

    const/16 v0, 0xe

    aput-object v3, v5, v0

    const/16 v0, 0xf

    aput-object v4, v5, v0

    const/16 v0, 0x10

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/navigation/AiAction;->$childSerializers:[Ll83/h;

    new-instance v0, Lim1/p0;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/AiAction;->json:Lad3/c;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AiAction"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lcom/whoop/navigation/AiAction;->logger:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x1dfb

    const/16 v1, 0x1dfb

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/navigation/AiAction$$serializer;->INSTANCE:Lcom/whoop/navigation/AiAction$$serializer;

    invoke-virtual {v0}, Lcom/whoop/navigation/AiAction$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    const-string p2, ""

    .line 3
    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    :goto_0
    iput-object p5, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    goto :goto_1

    :cond_2
    iput-boolean p11, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    :goto_1
    iput-object p12, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x2000

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    :goto_2
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    goto :goto_3

    :cond_4
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    :goto_3
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_5

    .line 4
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 5
    :goto_4
    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    goto :goto_5

    :cond_5
    move-object/from16 p2, p17

    goto :goto_4

    :goto_5
    const/high16 p2, 0x10000

    and-int/2addr p1, p2

    if-nez p1, :cond_6

    iput-object p3, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    return-void

    :cond_6
    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)V
    .locals 2
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
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/ChatEntrypointExperience;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lcom/whoop/navigation/DrawerPresentation;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p16

    const-string v1, "sourceType"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "args"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    .line 12
    iput-object p6, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    .line 13
    iput-object p7, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    .line 14
    iput-object p8, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    .line 15
    iput-object p9, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    .line 16
    iput-boolean p10, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    .line 17
    iput-object p11, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    .line 18
    iput-object p12, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    .line 19
    iput-object p13, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    move-object/from16 p1, p14

    .line 20
    iput-object p1, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 21
    iput-object p1, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    .line 22
    iput-object v0, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    move-object/from16 p1, p17

    .line 23
    iput-object p1, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 24
    const-string v1, ""

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v12, v1

    goto :goto_1

    :cond_1
    move/from16 v12, p10

    :goto_1
    and-int/lit16 v1, v0, 0x2000

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object/from16 v16, v2

    goto :goto_2

    :cond_2
    move-object/from16 v16, p14

    :goto_2
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_3

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p15

    :goto_3
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    .line 25
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object/from16 v18, v1

    goto :goto_4

    :cond_4
    move-object/from16 v18, p16

    :goto_4
    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    move-object/from16 v19, v2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v2, p0

    goto :goto_5

    :cond_5
    move-object/from16 v19, p17

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    .line 26
    :goto_5
    invoke-direct/range {v2 .. v19}, Lcom/whoop/navigation/AiAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/ChatEntrypointExperience;->Companion:Lcom/whoop/navigation/ChatEntrypointExperience$a;

    invoke-virtual {v0}, Lcom/whoop/navigation/ChatEntrypointExperience$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/DrawerPresentation;->Companion:Lcom/whoop/navigation/DrawerPresentation$a;

    invoke-virtual {v0}, Lcom/whoop/navigation/DrawerPresentation$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/AiAction;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/AiAction;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static final synthetic access$getJson$cp()Lad3/c;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/AiAction;->json:Lad3/c;

    return-object v0
.end method

.method public static final synthetic access$getLogger$cp()Ltr2/n;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/AiAction;->logger:Ltr2/n;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/AiAction;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/navigation/AiAction;->json$lambda$0(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/AiAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;ILjava/lang/Object;)Lcom/whoop/navigation/AiAction;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    move-object/from16 p17, p2

    move-object/from16 p18, v1

    move-object/from16 p16, v2

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

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move-object/from16 p17, v1

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

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

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/navigation/AiAction;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)Lcom/whoop/navigation/AiAction;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/AiAction;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final json$lambda$0(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    iput-boolean v0, p0, Lad3/g;->g:Z

    iput-boolean v0, p0, Lad3/g;->l:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/AiAction;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/navigation/AiAction;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    const-string v4, ""

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    if-eqz v3, :cond_3

    :goto_1
    iget-boolean v3, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    const/16 v4, 0xb

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    if-eqz v3, :cond_5

    :goto_2
    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    if-eqz v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Lcom/whoop/navigation/ChatEntrypointExperience;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    return-object v0
.end method

.method public final component16()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final component17()Lcom/whoop/navigation/DrawerPresentation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)Lcom/whoop/navigation/AiAction;
    .locals 19
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
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/ChatEntrypointExperience;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Lcom/whoop/navigation/DrawerPresentation;",
            ")",
            "Lcom/whoop/navigation/AiAction;"
        }
    .end annotation

    const-string v0, "sourceType"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/navigation/AiAction;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/navigation/AiAction;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/AiAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/AiAction;

    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    iget-boolean v3, p1, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    iget-object p1, p1, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    if-eq v1, p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAgentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    return-object v0
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

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    return-object v0
.end method

.method public final getConversationSeedId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDrawerPresentation()Lcom/whoop/navigation/DrawerPresentation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    return-object v0
.end method

.method public final getEducationType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    return-object v0
.end method

.method public final getEntryText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    return-object v0
.end method

.method public final getEntrypointExperience()Lcom/whoop/navigation/ChatEntrypointExperience;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    return-object v0
.end method

.method public final getFingerprint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncludeInitialMessage()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getPresetQuestion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreenId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldOpenFullSize()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    return v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSourceType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public final getStaticInitialMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    if-nez v3, :cond_c

    move v3, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    invoke-static {v3, v0, v2}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    if-nez v2, :cond_d

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/navigation/AiAction;->source:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/navigation/AiAction;->screenId:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/navigation/AiAction;->sourceType:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/navigation/AiAction;->sourceId:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/navigation/AiAction;->agentId:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/navigation/AiAction;->conversationSeedId:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/navigation/AiAction;->fingerprint:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/navigation/AiAction;->presetQuestion:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/navigation/AiAction;->educationType:Ljava/lang/String;

    iget-boolean v10, v0, Lcom/whoop/navigation/AiAction;->shouldOpenFullSize:Z

    iget-object v11, v0, Lcom/whoop/navigation/AiAction;->entryText:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/navigation/AiAction;->includeInitialMessage:Ljava/lang/Boolean;

    iget-object v13, v0, Lcom/whoop/navigation/AiAction;->staticInitialMessage:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/navigation/AiAction;->userMessage:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/navigation/AiAction;->entrypointExperience:Lcom/whoop/navigation/ChatEntrypointExperience;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/navigation/AiAction;->args:Ljava/util/Map;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/navigation/AiAction;->drawerPresentation:Lcom/whoop/navigation/DrawerPresentation;

    const-string v0, ", screenId="

    move-object/from16 v18, v15

    const-string v15, ", sourceType="

    move-object/from16 v19, v13

    const-string v13, "AiAction(source="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sourceId="

    const-string v2, ", agentId="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", conversationSeedId="

    const-string v2, ", fingerprint="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", presetQuestion="

    const-string v2, ", educationType="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", shouldOpenFullSize="

    const-string v2, ", entryText="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", includeInitialMessage="

    const-string v2, ", staticInitialMessage="

    invoke-static {v12, v11, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", userMessage="

    const-string v2, ", entrypointExperience="

    move-object/from16 v3, v19

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", args="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", drawerPresentation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
