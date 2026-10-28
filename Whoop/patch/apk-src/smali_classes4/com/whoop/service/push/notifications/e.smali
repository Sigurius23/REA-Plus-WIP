.class public final Lcom/whoop/service/push/notifications/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 62\u00020\u0001:\u00017BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/e;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroid/content/Context;",
        "context",
        "Let0/a;",
        "dorsetDetectionMonitor",
        "Ljs0/c;",
        "configRepo",
        "Luu0/a;",
        "analyticsHelper",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lbc3/c0;",
        "backgroundScope",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "log",
        "<init>",
        "(Landroid/content/Context;Let0/a;Ljs0/c;Luu0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Ljava/time/Clock;Ltr2/n;)V",
        "",
        "l",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "j",
        "()V",
        "w",
        "Landroid/content/Context;",
        "x",
        "Let0/a;",
        "y",
        "Ljs0/c;",
        "z",
        "Luu0/a;",
        "E",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "F",
        "Lbc3/c0;",
        "G",
        "Ljava/time/Clock;",
        "H",
        "Ltr2/n;",
        "Lmc3/a;",
        "I",
        "Lmc3/a;",
        "coolOffMutex",
        "Ljava/time/Instant;",
        "J",
        "Ljava/time/Instant;",
        "lastNotifiedAt",
        "K",
        "a",
        "app_prodStandardRelease"
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
.field public static final K:Lcom/whoop/service/push/notifications/e$a;

.field public static final L:I

.field private static final M:J

.field private static final N:J

.field public static final O:Lc12/d;


# instance fields
.field private final E:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final F:Lbc3/c0;

.field private final G:Ljava/time/Clock;

.field private final H:Ltr2/n;

.field private final I:Lmc3/a;

.field private J:Ljava/time/Instant;

.field private final w:Landroid/content/Context;

.field private final x:Let0/a;

.field private final y:Ljs0/c;

.field private final z:Luu0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/service/push/notifications/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/e;->K:Lcom/whoop/service/push/notifications/e$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/e;->L:I

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v0, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    const/16 v1, 0x1e

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    sput-wide v1, Lcom/whoop/service/push/notifications/e;->M:J

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    sput-wide v2, Lcom/whoop/service/push/notifications/e;->N:J

    new-instance v0, Lc12/d;

    sget-object v2, Lc12/b;->MAX:Lc12/b;

    const-string v3, "07800_DorsetDetection"

    sget v4, Lhi0/j;->S:I

    invoke-direct {v0, v2, v3, v4}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/service/push/notifications/e;->O:Lc12/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Let0/a;Ljs0/c;Luu0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Ljava/time/Clock;Ltr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dorsetDetectionMonitor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configRepo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundScope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/whoop/service/push/notifications/e;->x:Let0/a;

    .line 4
    iput-object p3, p0, Lcom/whoop/service/push/notifications/e;->y:Ljs0/c;

    .line 5
    iput-object p4, p0, Lcom/whoop/service/push/notifications/e;->z:Luu0/a;

    .line 6
    iput-object p5, p0, Lcom/whoop/service/push/notifications/e;->E:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 7
    iput-object p6, p0, Lcom/whoop/service/push/notifications/e;->F:Lbc3/c0;

    .line 8
    iput-object p7, p0, Lcom/whoop/service/push/notifications/e;->G:Ljava/time/Clock;

    .line 9
    iput-object p8, p0, Lcom/whoop/service/push/notifications/e;->H:Ltr2/n;

    .line 10
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/service/push/notifications/e;->I:Lmc3/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Let0/a;Ljs0/c;Luu0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Ljava/time/Clock;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    .line 11
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v1

    const-string v2, "systemUTC(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    .line 12
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DorsetDetectedNotification"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    move-object v11, v0

    :goto_1
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    goto :goto_2

    :cond_1
    move-object/from16 v11, p8

    goto :goto_1

    .line 13
    :goto_2
    invoke-direct/range {v3 .. v11}, Lcom/whoop/service/push/notifications/e;-><init>(Landroid/content/Context;Let0/a;Ljs0/c;Luu0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Ljava/time/Clock;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/service/push/notifications/e;)Luu0/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/e;->z:Luu0/a;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/service/push/notifications/e;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/e;->G:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/service/push/notifications/e;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/e;->E:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/service/push/notifications/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/e;->H:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e()J
    .locals 2

    sget-wide v0, Lcom/whoop/service/push/notifications/e;->N:J

    return-wide v0
.end method

.method public static final synthetic f()J
    .locals 2

    sget-wide v0, Lcom/whoop/service/push/notifications/e;->M:J

    return-wide v0
.end method

.method public static final synthetic g(Lcom/whoop/service/push/notifications/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/service/push/notifications/e;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lq83/d;)Ljava/lang/Object;
    .locals 11
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

    instance-of v0, p1, Lcom/whoop/service/push/notifications/e$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/service/push/notifications/e$c;

    iget v1, v0, Lcom/whoop/service/push/notifications/e$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/service/push/notifications/e$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/service/push/notifications/e$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/service/push/notifications/e$c;-><init>(Lcom/whoop/service/push/notifications/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/service/push/notifications/e$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/service/push/notifications/e$c;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/whoop/service/push/notifications/e$c;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e;->I:Lmc3/a;

    iput-object p1, v0, Lcom/whoop/service/push/notifications/e$c;->w:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/service/push/notifications/e$c;->x:I

    iput v4, v0, Lcom/whoop/service/push/notifications/e$c;->E:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/whoop/service/push/notifications/e;->J:Ljava/time/Instant;

    iget-object v2, p0, Lcom/whoop/service/push/notifications/e;->G:Ljava/time/Clock;

    invoke-virtual {v2}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object v2

    sget-object v5, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-object v5, p0, Lcom/whoop/service/push/notifications/e;->y:Ljs0/c;

    sget-object v6, Lcom/whoop/data/repositories/DorsetNotificationCoolOffMinutes;->INSTANCE:Lcom/whoop/data/repositories/DorsetNotificationCoolOffMinutes;

    invoke-virtual {v5}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v5

    invoke-virtual {v6}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v6

    const-class v8, Ljava/lang/Integer;

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_4
    move-object v5, p1

    goto/16 :goto_2

    :cond_5
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    goto :goto_2

    :cond_6
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    goto :goto_2

    :cond_7
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    goto :goto_2

    :cond_8
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_2

    :cond_9
    const-class v10, Ljava/lang/String;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_2

    :cond_a
    move-object v5, v6

    :goto_2
    if-nez v5, :cond_b

    goto :goto_3

    :cond_b
    move-object v6, v5

    :goto_3
    if-eqz v6, :cond_d

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    sget-object v6, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {v5, v6}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    if-eqz v1, :cond_c

    invoke-static {v1, v2}, Ljava/time/Duration;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;

    move-result-object v1

    const-string v7, "between(...)"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v7

    sget-object v9, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v7, v8, v9}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v7

    invoke-virtual {v1}, Ljava/time/Duration;->getNano()I

    move-result v1

    sget-object v9, Lkotlin/time/DurationUnit;->NANOSECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v9}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Lkotlin/time/Duration;->plus-LRDsOJo(JJ)J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result v1

    if-gez v1, :cond_c

    goto :goto_4

    :cond_c
    iput-object v2, p0, Lcom/whoop/service/push/notifications/e;->J:Ljava/time/Instant;

    move v3, v4

    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v1

    :cond_d
    :try_start_1
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v1
.end method


# virtual methods
.method public final j()V
    .locals 12

    iget-object v0, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    sget-object v1, Lcom/whoop/service/push/notifications/e;->O:Lc12/d;

    iget-object v2, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    iget-object v2, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    sget v3, Lhi0/j;->T:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    sget v5, Lhi0/j;->R:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lc12/e;->a:Lc12/e;

    iget-object v5, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    invoke-virtual {v3, v5}, Lc12/e;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    const/4 v5, 0x3

    invoke-virtual {v3, v5}, Landroidx/core/app/NotificationCompat$Builder;->setPriority(I)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    const-string v3, "setContentText(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    new-instance v1, Leb/j0;

    iget-object v3, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    invoke-direct {v1, v3}, Leb/j0;-><init>(Landroid/content/Context;)V

    sget v3, Lhi0/g;->a:I

    invoke-virtual {v1, v3}, Leb/j0;->g(I)V

    sget v3, Lhi0/e;->C2:I

    invoke-static {v1, v3}, Leb/j0;->f(Leb/j0;I)V

    iget-object v3, p0, Lcom/whoop/service/push/notifications/e;->y:Ljs0/c;

    sget-object v4, Lcom/whoop/data/repositories/DorsetLearnMoreUrl;->INSTANCE:Lcom/whoop/data/repositories/DorsetLearnMoreUrl;

    invoke-virtual {v3}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v3

    invoke-virtual {v4}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v7, Ljava/lang/String;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    invoke-virtual {v3, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_0

    :cond_0
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v3, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v10

    goto :goto_0

    :cond_1
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v3, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v10

    goto :goto_0

    :cond_2
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v3, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v10

    goto :goto_0

    :cond_3
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v3, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-static {v3}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_0

    :cond_4
    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v3, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_0

    :cond_5
    move-object v10, v4

    :cond_6
    :goto_0
    if-nez v10, :cond_7

    goto :goto_1

    :cond_7
    move-object v4, v10

    :goto_1
    if-eqz v4, :cond_8

    check-cast v4, Ljava/lang/String;

    new-instance v3, Ll83/k;

    const-string v5, "url"

    invoke-direct {v3, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v1, v3}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object v7

    sget-object v4, Lcom/whoop/service/push/notifications/NotificationClickedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;

    iget-object v5, p0, Lcom/whoop/service/push/notifications/e;->w:Landroid/content/Context;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const-string v6, "dorset_detection"

    const/16 v8, 0x7d

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;Landroid/content/Context;Ljava/lang/String;Landroid/app/PendingIntent;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v1, p0, Lcom/whoop/service/push/notifications/e;->H:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Showing dorset notification"

    invoke-interface {v1, v4, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const/16 v1, 0x7d

    invoke-virtual {v2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/service/push/notifications/e;->x:Let0/a;

    invoke-interface {p1}, Let0/a;->a()Lec3/f2;

    move-result-object p1

    new-instance v0, Lcom/whoop/service/push/notifications/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/service/push/notifications/e$b;-><init>(Lcom/whoop/service/push/notifications/e;Lq83/d;)V

    invoke-static {v0, p1}, Lec3/v;->I(Lc93/m;Lec3/l;)Lfc3/k;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/e;->F:Lbc3/c0;

    invoke-static {p1, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
