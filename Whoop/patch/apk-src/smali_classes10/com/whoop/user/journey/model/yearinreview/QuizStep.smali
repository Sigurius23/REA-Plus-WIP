.class public final Lcom/whoop/user/journey/model/yearinreview/QuizStep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/user/journey/model/UserJourneyStep;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/user/journey/model/yearinreview/QuizStep$$serializer;,
        Lcom/whoop/user/journey/model/yearinreview/QuizStep$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0085\u0001\u0008\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u0018J|\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u0018J\u0010\u0010\'\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00084\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00107\u001a\u0004\u00088\u0010\u0018R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008:\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010;\u001a\u0004\u0008<\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008=\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u0008>\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u0008?\u0010\u0018R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008@\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00107\u001a\u0004\u0008A\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00107\u001a\u0004\u0008B\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00107\u001a\u0004\u0008C\u0010\u0018\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/user/journey/model/yearinreview/QuizStep;",
        "Lcom/whoop/user/journey/model/UserJourneyStep;",
        "",
        "whoopCoachQuestion",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;",
        "answerOptions",
        "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
        "whoopCoachIncorrectResponse",
        "whoopCoachCorrectResponse",
        "whoopCoachAnswerStatement",
        "avatarUrl",
        "correctResponseIconUrl",
        "name",
        "theme",
        "themeVariant",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/QuizStep;",
        "toString",
        "hashCode",
        "()I",
        "",
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
        "write$Self$user_journey_release",
        "(Lcom/whoop/user/journey/model/yearinreview/QuizStep;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getWhoopCoachQuestion",
        "Ljava/util/List;",
        "getAnswerOptions",
        "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
        "getWhoopCoachIncorrectResponse",
        "getWhoopCoachCorrectResponse",
        "getWhoopCoachAnswerStatement",
        "getAvatarUrl",
        "getCorrectResponseIconUrl",
        "getName",
        "getTheme",
        "getThemeVariant",
        "Companion",
        "$serializer",
        "user-journey_release"
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

.field public static final Companion:Lcom/whoop/user/journey/model/yearinreview/QuizStep$Companion;


# instance fields
.field private final answerOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;",
            ">;"
        }
    .end annotation
.end field

.field private final avatarUrl:Ljava/lang/String;

.field private final correctResponseIconUrl:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final theme:Ljava/lang/String;

.field private final themeVariant:Ljava/lang/String;

.field private final whoopCoachAnswerStatement:Ljava/lang/String;

.field private final whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

.field private final whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

.field private final whoopCoachQuestion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/user/journey/model/yearinreview/QuizStep$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/user/journey/model/yearinreview/QuizStep$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->Companion:Lcom/whoop/user/journey/model/yearinreview/QuizStep$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcq2/a;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lcq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xa

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v1, v3, v2

    const/4 v2, 0x6

    aput-object v1, v3, v2

    const/4 v2, 0x7

    aput-object v1, v3, v2

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x3ff

    const/16 v0, 0x3ff

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/user/journey/model/yearinreview/QuizStep$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/QuizStep$$serializer;

    invoke-virtual {p12}, Lcom/whoop/user/journey/model/yearinreview/QuizStep$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    iput-object p5, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    iput-object p6, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;",
            ">;",
            "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
            "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "whoopCoachQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCoachIncorrectResponse"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCoachCorrectResponse"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCoachAnswerStatement"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "correctResponseIconUrl"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeVariant"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    .line 6
    iput-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    .line 7
    iput-object p5, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/user/journey/model/yearinreview/QuizStep;Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/user/journey/model/yearinreview/QuizStep;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/QuizStep;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$user_journey_release(Lcom/whoop/user/journey/model/yearinreview/QuizStep;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse$$serializer;->INSTANCE:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse$$serializer;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object p0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    return-object v0
.end method

.method public final component4()Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/QuizStep;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;",
            ">;",
            "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
            "Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/user/journey/model/yearinreview/QuizStep;"
        }
    .end annotation

    const-string v0, "whoopCoachQuestion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answerOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCoachIncorrectResponse"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCoachCorrectResponse"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopCoachAnswerStatement"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "correctResponseIconUrl"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeVariant"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v11}, Lcom/whoop/user/journey/model/yearinreview/QuizStep;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAnswerOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/QuizAnswerOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCorrectResponseIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    return-object v0
.end method

.method public final getThemeVariant()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhoopCoachAnswerStatement()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    return-object v0
.end method

.method public final getWhoopCoachCorrectResponse()Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    return-object v0
.end method

.method public final getWhoopCoachIncorrectResponse()Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    return-object v0
.end method

.method public final getWhoopCoachQuestion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    invoke-virtual {v2}, Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    invoke-virtual {v0}, Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachQuestion:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->answerOptions:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachIncorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    iget-object v3, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachCorrectResponse:Lcom/whoop/user/journey/model/yearinreview/WhoopCoachResponse;

    iget-object v4, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->whoopCoachAnswerStatement:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->avatarUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->correctResponseIconUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->name:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->theme:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/user/journey/model/yearinreview/QuizStep;->themeVariant:Ljava/lang/String;

    const-string v10, ", answerOptions="

    const-string v11, ", whoopCoachIncorrectResponse="

    const-string v12, "QuizStep(whoopCoachQuestion="

    invoke-static {v12, v0, v10, v11, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", whoopCoachCorrectResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", whoopCoachAnswerStatement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", avatarUrl="

    const-string v2, ", correctResponseIconUrl="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", name="

    const-string v2, ", theme="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", themeVariant="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
