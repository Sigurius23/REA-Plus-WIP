.class public final Lcom/whoop/data/repositories/JournalRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/JournalRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 Y2\u00020\u0001:\u0001YBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J(\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008!\u0010\"J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001cH\u0086@\u00a2\u0006\u0004\u0008$\u0010%J(\u0010+\u001a\u00020*2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\'0&j\u0008\u0012\u0004\u0012\u00020\'`(H\u0086@\u00a2\u0006\u0004\u0008+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008/\u00100J\u0018\u00103\u001a\u00020*2\u0006\u00102\u001a\u000201H\u0086@\u00a2\u0006\u0004\u00083\u00104J\u0015\u00108\u001a\u0002072\u0006\u00106\u001a\u000205\u00a2\u0006\u0004\u00088\u00109J\u001a\u0010:\u001a\u0004\u0018\u0001052\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008:\u0010\u0019J\u0015\u0010<\u001a\u0002072\u0006\u0010;\u001a\u00020*\u00a2\u0006\u0004\u0008<\u0010=J\r\u0010>\u001a\u00020*\u00a2\u0006\u0004\u0008>\u0010?J\u0018\u0010A\u001a\u0002072\u0006\u0010@\u001a\u00020*H\u0086@\u00a2\u0006\u0004\u0008A\u0010BJ\u0010\u0010C\u001a\u00020*H\u0086@\u00a2\u0006\u0004\u0008C\u0010%J\u0018\u0010E\u001a\u0002072\u0006\u0010D\u001a\u00020*H\u0086@\u00a2\u0006\u0004\u0008E\u0010BJ\u0010\u0010F\u001a\u00020*H\u0086@\u00a2\u0006\u0004\u0008F\u0010%J\u0016\u0010H\u001a\u0008\u0012\u0004\u0012\u00020G0\u0016H\u0086@\u00a2\u0006\u0004\u0008H\u0010%J\u0018\u0010I\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008I\u0010\u0019J\u0015\u0010J\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008J\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010MR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010NR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010PR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010QR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0011\u0010X\u001a\u00020*8F\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010?\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/whoop/data/repositories/JournalRepository;",
        "",
        "Lin2/d;",
        "dispatcherFactory",
        "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;",
        "journalDao",
        "Lu92/d;",
        "sharedPreferences",
        "Lcom/whoop/service/network/JournalApi;",
        "journalApi",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lbc3/c0;",
        "applicationScope",
        "Lrr2/c;",
        "crashReporter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lin2/d;Lcom/whoop/data/local/room/dao/wipeable/JournalDao;Lu92/d;Lcom/whoop/service/network/JournalApi;Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "cycleId",
        "",
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;",
        "getUserJournalHistory",
        "(JLq83/d;)Ljava/lang/Object;",
        "",
        "date",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;",
        "fetchUserSelectedJournalQuestions",
        "(JLjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;",
        "fetchUserJournalEntryForDate",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/response/journal/JournalsBehaviorsListResponse;",
        "fetchJournalBehaviorsList",
        "(Lq83/d;)Ljava/lang/Object;",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "listOfSelectedJournals",
        "",
        "updateUserSelectedJournalList",
        "(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
        "trackerRequest",
        "saveJournalTrackerInputs",
        "(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;",
        "request",
        "savePartialJournalEntry",
        "(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
        "journalAnsweredDto",
        "Ll83/a0;",
        "saveJournalAnsweredInfo",
        "(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;)V",
        "getJournalAnsweredInfo",
        "showJournal",
        "saveUserJournalSettings",
        "(Z)V",
        "getUserSavedJournalSettings",
        "()Z",
        "enabledDefaultAnswer",
        "setStateOfUsersLastDefaultToggle",
        "(ZLq83/d;)Ljava/lang/Object;",
        "getLastStateOfUsersLastDefaultToggle",
        "showAgain",
        "setShouldShowDismissConfirmationDialog",
        "getShouldShowDismissConfirmationDialog",
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "getPreviouslySelectedBehaviors",
        "sendAutoPopEvent",
        "saveLocallyJournalHasBeenAutoPop",
        "(J)V",
        "Lin2/d;",
        "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;",
        "Lu92/d;",
        "Lcom/whoop/service/network/JournalApi;",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "Lbc3/c0;",
        "Lrr2/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "log",
        "Ltr2/n;",
        "getShouldShowJournal",
        "shouldShowJournal",
        "Companion",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/data/repositories/JournalRepository$Companion;

.field public static final KEY_ENABLED_DEFAULT_ANSWERS:Ljava/lang/String; = "EnabledDefaultAnswers"

.field public static final KEY_SHOULD_SHOW_JOURNAL_EXIT_PROMPT_AGAIN:Ljava/lang/String; = "DoNotShowJournalExitPromptAgain"


# instance fields
.field private final applicationScope:Lbc3/c0;

.field private final crashReporter:Lrr2/c;

.field private final dispatcherFactory:Lin2/d;

.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final journalApi:Lcom/whoop/service/network/JournalApi;

.field private final journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

.field private final log:Ltr2/n;

.field private final sharedPreferences:Lu92/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/JournalRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/repositories/JournalRepository;->Companion:Lcom/whoop/data/repositories/JournalRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lin2/d;Lcom/whoop/data/local/room/dao/wipeable/JournalDao;Lu92/d;Lcom/whoop/service/network/JournalApi;Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "dispatcherFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPreferences"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "journalApi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagRepository"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    iput-object p2, p0, Lcom/whoop/data/repositories/JournalRepository;->journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    iput-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->sharedPreferences:Lu92/d;

    iput-object p4, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput-object p5, p0, Lcom/whoop/data/repositories/JournalRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object p6, p0, Lcom/whoop/data/repositories/JournalRepository;->applicationScope:Lbc3/c0;

    iput-object p7, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    iput-object p8, p0, Lcom/whoop/data/repositories/JournalRepository;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "JournalRepository"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    return-void
.end method

.method public static final synthetic access$getCrashReporter$p(Lcom/whoop/data/repositories/JournalRepository;)Lrr2/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    return-object p0
.end method

.method public static final synthetic access$getDispatcherFactory$p(Lcom/whoop/data/repositories/JournalRepository;)Lin2/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    return-object p0
.end method

.method public static final synthetic access$getJournalApi$p(Lcom/whoop/data/repositories/JournalRepository;)Lcom/whoop/service/network/JournalApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    return-object p0
.end method

.method public static final synthetic access$getJournalDao$p(Lcom/whoop/data/repositories/JournalRepository;)Lcom/whoop/data/local/room/dao/wipeable/JournalDao;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/JournalRepository;->journalDao:Lcom/whoop/data/local/room/dao/wipeable/JournalDao;

    return-object p0
.end method

.method public static final synthetic access$getLog$p(Lcom/whoop/data/repositories/JournalRepository;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getSharedPreferences$p(Lcom/whoop/data/repositories/JournalRepository;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/JournalRepository;->sharedPreferences:Lu92/d;

    return-object p0
.end method

.method public static final synthetic access$getUserJournalHistory(Lcom/whoop/data/repositories/JournalRepository;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/repositories/JournalRepository;->getUserJournalHistory(JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic fetchUserSelectedJournalQuestions$default(Lcom/whoop/data/repositories/JournalRepository;JLjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-string p3, ""

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/repositories/JournalRepository;->fetchUserSelectedJournalQuestions(JLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getUserJournalHistory(JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviourTrackerHistory;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput-wide p1, v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;->J$0:J

    iput v3, v0, Lcom/whoop/data/repositories/JournalRepository$getUserJournalHistory$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lcom/whoop/service/network/JournalApi;->getUserJournalHistory(JLq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;->toBehaviourTrackerHistoryResponse()Lcom/whoop/data/remote/domain/response/journal/BehaviourTrackerHistoryResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/journal/BehaviourTrackerHistoryResponse;->getRecords()Ljava/util/List;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p2}, Ltr2/n$a;->c()Ltr2/n;

    move-result-object p2

    iget-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    const-string v0, "Failed to get previous answers"

    invoke-static {p1, v0, p2, p3}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method


# virtual methods
.method public final fetchJournalBehaviorsList(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalsBehaviorsListResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p1}, Ltr2/n$a;->c()Ltr2/n;

    move-result-object p1

    iget-object v3, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    new-instance v5, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$response$1;

    const/4 v4, 0x0

    invoke-direct {v5, p0, v4}, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$response$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    iput v2, v6, Lcom/whoop/data/repositories/JournalRepository$fetchJournalBehaviorsList$1;->label:I

    const-string v4, "failed to fetch journal behaviors list"

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;->toJournalsBehaviorsListResponse()Lcom/whoop/data/remote/domain/response/journal/JournalsBehaviorsListResponse;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final fetchUserJournalEntryForDate(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput-object p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserJournalEntryForDate$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/whoop/service/network/JournalApi;->getJournalEntryForDate(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;

    invoke-virtual {p2}, Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;->toJournalEntryWrapper()Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;

    move-result-object p2

    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {v0, p2}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    const-string v0, "Fetching journal entry for date "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    iget-object v1, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    invoke-static {p2, p1, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object v3

    sget-object v2, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    sget-object p1, Lcom/whoop/network/exception/DomainException;->x:Lcom/whoop/network/exception/DomainException$a;

    invoke-virtual {p1, p2}, Lcom/whoop/network/exception/DomainException$a;->a(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;

    move-result-object v6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method

.method public final fetchUserSelectedJournalQuestions(JLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;

    invoke-direct {v0, p0, p4}, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->J$0:J

    iget-object p3, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$0:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    :try_start_1
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :cond_3
    iget-wide p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->J$0:J

    iget-object p3, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$0:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    :try_start_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p4, p0, Lcom/whoop/data/repositories/JournalRepository;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "weekly-plan-in-journal-non-onboarding"

    invoke-interface {p4, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-lez p4, :cond_7

    iget-object p4, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput-object v6, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$0:Ljava/lang/Object;

    iput-wide p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->J$0:J

    iput v5, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->label:I

    invoke-interface {p4, p3, v0}, Lcom/whoop/service/network/JournalApi;->getUserSelectedJournalBehaviorsV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_6

    :cond_5
    :goto_1
    check-cast p4, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;->toJournalBehaviorTracker()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v2

    invoke-interface {p3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    :goto_3
    move-wide v7, p1

    move-object p1, p3

    move-wide p2, v7

    goto :goto_5

    :cond_7
    iget-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput-object v6, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$0:Ljava/lang/Object;

    iput-wide p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->J$0:J

    iput v4, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->label:I

    invoke-interface {p3, v0}, Lcom/whoop/service/network/JournalApi;->getUserSelectedJournalBehaviors(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_8

    goto :goto_6

    :cond_8
    :goto_4
    check-cast p4, Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;

    invoke-virtual {p4}, Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;->toUserSelectedJournalBehaviorResponse()Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalBehaviorResponse;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalBehaviorResponse;->getRecords()Ljava/util/List;

    move-result-object p3

    goto :goto_3

    :goto_5
    iput-object v6, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->L$1:Ljava/lang/Object;

    iput-wide p2, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->J$0:J

    iput v3, v0, Lcom/whoop/data/repositories/JournalRepository$fetchUserSelectedJournalQuestions$1;->label:I

    invoke-direct {p0, p2, p3, v0}, Lcom/whoop/data/repositories/JournalRepository;->getUserJournalHistory(JLq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_9

    :goto_6
    return-object v1

    :cond_9
    :goto_7
    check-cast p4, Ljava/util/List;

    new-instance p2, Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;

    invoke-direct {p2, p1, p4}, Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;-><init>(Ljava/util/List;Ljava/util/List;)V

    sget-object p1, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    invoke-virtual {p1, p2}, Lcom/whoop/data/remote/commons/Resource$Companion;->success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    :goto_8
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p2}, Ltr2/n$a;->c()Ltr2/n;

    move-result-object p2

    iget-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    const-string p4, "Failed to get selected behaviors"

    invoke-static {p1, p4, p2, p3}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    sget-object v0, Lcom/whoop/data/remote/commons/Resource;->Companion:Lcom/whoop/data/remote/commons/Resource$Companion;

    const-string p2, "Fetching journal questions error "

    invoke-static {p1, p2}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/whoop/data/remote/commons/Resource$Companion;->error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p1

    return-object p1
.end method

.method public final getJournalAnsweredInfo(JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    const-string v1, "New Journal getJournalAnswerInfo "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/whoop/data/repositories/JournalRepository$getJournalAnsweredInfo$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;JLq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getLastStateOfUsersLastDefaultToggle(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/JournalRepository$getLastStateOfUsersLastDefaultToggle$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/JournalRepository$getLastStateOfUsersLastDefaultToggle$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getPreviouslySelectedBehaviors(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput v3, v0, Lcom/whoop/data/repositories/JournalRepository$getPreviouslySelectedBehaviors$1;->label:I

    invoke-interface {p1, v0}, Lcom/whoop/service/network/JournalApi;->getUserSelectedJournalBehaviors(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;->toUserSelectedJournalBehaviorResponse()Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalBehaviorResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalBehaviorResponse;->getRecords()Ljava/util/List;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    iget-object v1, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    const-string v2, "Failed to fetch user tracked behaviors"

    invoke-static {p1, v2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getShouldShowDismissConfirmationDialog(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/JournalRepository$getShouldShowDismissConfirmationDialog$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/JournalRepository$getShouldShowDismissConfirmationDialog$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getShouldShowJournal()Z
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/data/repositories/JournalRepository;->getUserSavedJournalSettings()Z

    move-result v0

    return v0
.end method

.method public final getUserSavedJournalSettings()Z
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->sharedPreferences:Lu92/d;

    const-string v1, "Journal_Settings_Turn_Off_Or_On"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-string v1, "never-show-journal-intro"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final saveJournalAnsweredInfo(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;)V
    .locals 3

    const-string v0, "journalAnsweredDto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "New Journal saveJournalAnswerInfo "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/JournalRepository$saveJournalAnsweredInfo$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/JournalRepository$saveJournalAnsweredInfo$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final saveJournalTrackerInputs(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->label:I

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$2;

    const/4 p3, 0x0

    invoke-direct {v5, p0, p2, p1, p3}, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;Ljava/lang/String;Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)V

    iput-object p3, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->L$0:Ljava/lang/Object;

    iput-object p3, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->L$1:Ljava/lang/Object;

    iput v9, v6, Lcom/whoop/data/repositories/JournalRepository$saveJournalTrackerInputs$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_4

    const/4 v9, 0x0

    goto :goto_3

    :cond_4
    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_5

    :goto_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final saveLocallyJournalHasBeenAutoPop(J)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->sharedPreferences:Lu92/d;

    const-string v1, "HasJournalBeenSeenForToday"

    invoke-virtual {v0, v1, p1, p2}, Lu92/d;->u(Ljava/lang/String;J)V

    return-void
.end method

.method public final savePartialJournalEntry(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->label:I

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    new-instance v5, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$2;

    const/4 p2, 0x0

    invoke-direct {v5, p0, p1, p2}, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)V

    iput-object p2, v6, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->L$0:Ljava/lang/Object;

    iput v9, v6, Lcom/whoop/data/repositories/JournalRepository$savePartialJournalEntry$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_4

    const/4 v9, 0x0

    goto :goto_3

    :cond_4
    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_5

    :goto_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final saveUserJournalSettings(Z)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->sharedPreferences:Lu92/d;

    const-string v1, "Journal_Settings_Turn_Off_Or_On"

    invoke-virtual {v0, v1, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public final sendAutoPopEvent(JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->journalApi:Lcom/whoop/service/network/JournalApi;

    iput-wide p1, v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;->J$0:J

    iput v3, v0, Lcom/whoop/data/repositories/JournalRepository$sendAutoPopEvent$1;->label:I

    invoke-interface {p3, p1, p2, v3, v0}, Lcom/whoop/service/network/JournalApi;->setAutoPop(JZLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    iget-object p3, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    const-string v0, "Failed to fetch user tracked behaviors"

    invoke-static {p1, v0, p2, p3}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setShouldShowDismissConfirmationDialog(ZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/JournalRepository$setShouldShowDismissConfirmationDialog$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/JournalRepository$setShouldShowDismissConfirmationDialog$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;ZLq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setStateOfUsersLastDefaultToggle(ZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/JournalRepository;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/JournalRepository$setStateOfUsersLastDefaultToggle$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/JournalRepository$setStateOfUsersLastDefaultToggle$2;-><init>(Lcom/whoop/data/repositories/JournalRepository;ZLq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateUserSelectedJournalList(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;

    iget v1, v0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lcom/whoop/data/repositories/JournalRepository;->log:Ltr2/n;

    iget-object v3, p0, Lcom/whoop/data/repositories/JournalRepository;->crashReporter:Lrr2/c;

    new-instance v5, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;

    const/4 v4, 0x0

    invoke-direct {v5, p0, p1, v4}, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$response$1;-><init>(Lcom/whoop/data/repositories/JournalRepository;Ljava/util/ArrayList;Lq83/d;)V

    iput-object v4, v6, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->L$0:Ljava/lang/Object;

    iput p2, v6, Lcom/whoop/data/repositories/JournalRepository$updateUserSelectedJournalList$1;->label:I

    const-string v4, "Error updating selected journal behaviors"

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
