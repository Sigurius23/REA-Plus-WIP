.class public final Lxl1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxl1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0018B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lxl1/b;",
        "",
        "Lu92/d;",
        "sharedPreferences",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "onboardingStatusChecker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lu92/d;Lzr2/a;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "isJournalEnabled",
        "Ljava/time/LocalDate;",
        "requestDate",
        "",
        "cycleId",
        "memberCompletedJournalAlready",
        "Lxl1/a;",
        "displayCycleState",
        "autoPopJournal",
        "hasEnoughRecoveries",
        "Lxl1/c;",
        "a",
        "(ZLjava/time/LocalDate;JZLxl1/a;ZZ)Lxl1/c;",
        "Lu92/d;",
        "b",
        "Lzr2/a;",
        "c",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "e",
        "Ltr2/n;",
        "logger",
        "f",
        "home_release"
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
.field public static final f:Lxl1/b$a;

.field public static final g:I


# instance fields
.field private final a:Lu92/d;

.field private final b:Lzr2/a;

.field private final c:Lcom/whoop/data/onboarding/OnboardingStatusChecker;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final e:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxl1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxl1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxl1/b;->f:Lxl1/b$a;

    const/16 v0, 0x8

    sput v0, Lxl1/b;->g:I

    return-void
.end method

.method public constructor <init>(Lu92/d;Lzr2/a;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingStatusChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl1/b;->a:Lu92/d;

    iput-object p2, p0, Lxl1/b;->b:Lzr2/a;

    iput-object p3, p0, Lxl1/b;->c:Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    iput-object p4, p0, Lxl1/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "JournalDomainInteractor"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lxl1/b;->e:Ltr2/n;

    return-void
.end method


# virtual methods
.method public final a(ZLjava/time/LocalDate;JZLxl1/a;ZZ)Lxl1/c;
    .locals 4

    const-string p1, "requestDate"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "displayCycleState"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxl1/b;->b:Lzr2/a;

    invoke-interface {p1}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->getYear()I

    move-result p2

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->getMonthOfYear()I

    move-result p5

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->getDayOfMonth()I

    move-result p1

    invoke-static {p2, p5, p1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    iget-object p1, p0, Lxl1/b;->a:Lu92/d;

    const-string p2, "HasJournalBeenSeenForToday"

    const-wide/16 p5, -0x1

    invoke-virtual {p1, p2, p5, p6}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide p1

    cmp-long p5, p1, p3

    const/4 p6, 0x1

    const/4 p8, 0x0

    if-nez p5, :cond_0

    move p5, p6

    goto :goto_0

    :cond_0
    move p5, p8

    :goto_0
    iget-object v0, p0, Lxl1/b;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "prevent-journal-autopop-based-on-recovery-count"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    iget-object v0, p0, Lxl1/b;->e:Ltr2/n;

    const-string v1, ", haveAlreadyAutoPopped: "

    const-string v2, ", today cycleId: "

    const-string v3, "autoPop: shouldAutoPop: "

    invoke-static {v3, v1, v2, p7, p5}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ", lastJournalPopCycleId: "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, p8, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p7, :cond_1

    if-nez p5, :cond_1

    goto :goto_1

    :cond_1
    move p6, p8

    :goto_1
    iget-object p1, p0, Lxl1/b;->c:Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    sget-object p2, Lcom/whoop/data/onboarding/FeatureEducationType;->CUSTOMIZE_JOURNAL:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-interface {p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->shouldGoToFeatureEducation(Lcom/whoop/data/onboarding/FeatureEducationType;)Z

    move-result p1

    new-instance p2, Lxl1/c;

    invoke-direct {p2, p6, p1}, Lxl1/c;-><init>(ZZ)V

    return-object p2
.end method
