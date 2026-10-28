.class public final Lcom/whoop/service/push/PushService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/PushService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0011\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010*\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/service/push/PushService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "<init>",
        "()V",
        "Lzt/p;",
        "remoteMessage",
        "Ll83/a0;",
        "s",
        "(Lzt/p;)V",
        "h",
        "",
        "token",
        "j",
        "(Ljava/lang/String;)V",
        "onDestroy",
        "Lcom/whoop/service/push/b;",
        "H",
        "Ll83/h;",
        "r",
        "()Lcom/whoop/service/push/b;",
        "pushNotificationFactory",
        "Lcom/whoop/data/repositories/NotificationRepository;",
        "I",
        "q",
        "()Lcom/whoop/data/repositories/NotificationRepository;",
        "notificationRepository",
        "Liy1/c;",
        "J",
        "p",
        "()Liy1/c;",
        "metricWriter",
        "Lcom/whoop/service/push/c;",
        "K",
        "Lcom/whoop/service/push/c;",
        "pushServiceReporter",
        "Lbc3/u;",
        "L",
        "Lbc3/u;",
        "job",
        "Lbc3/c0;",
        "M",
        "Lbc3/c0;",
        "scope",
        "Ltr2/n;",
        "N",
        "Ltr2/n;",
        "logger",
        "O",
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
.field public static final O:Lcom/whoop/service/push/PushService$a;

.field public static final P:I


# instance fields
.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Lcom/whoop/service/push/c;

.field private final L:Lbc3/u;

.field private final M:Lbc3/c0;

.field private final N:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/service/push/PushService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/PushService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/PushService;->O:Lcom/whoop/service/push/PushService$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/PushService;->P:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/service/push/PushService$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/push/PushService$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/service/push/PushService;->H:Ll83/h;

    new-instance v1, Lcom/whoop/service/push/PushService$d;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/push/PushService$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/service/push/PushService;->I:Ll83/h;

    new-instance v1, Lcom/whoop/service/push/PushService$e;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/service/push/PushService$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/push/PushService;->J:Ll83/h;

    new-instance v0, Lcom/whoop/service/push/c;

    invoke-direct {v0}, Lcom/whoop/service/push/c;-><init>()V

    iput-object v0, p0, Lcom/whoop/service/push/PushService;->K:Lcom/whoop/service/push/c;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/push/PushService;->L:Lbc3/u;

    sget-object v1, Lbc3/q0;->a:Lkc3/e;

    sget-object v1, Lkc3/d;->w:Lkc3/d;

    invoke-virtual {v1, v0}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/push/PushService;->M:Lbc3/c0;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "PushService"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/push/PushService;->N:Ltr2/n;

    return-void
.end method

.method public static synthetic l(Lcom/whoop/service/push/PushService;Lzt/p;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/service/push/PushService;->t(Lcom/whoop/service/push/PushService;Lzt/p;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Llq0/d;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/service/push/PushService;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lcom/whoop/service/push/PushService;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/service/push/PushService;->v(Lcom/whoop/service/push/PushService;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic o(Lcom/whoop/service/push/PushService;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/service/push/PushService;->q()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method

.method private final p()Liy1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    return-object v0
.end method

.method private final q()Lcom/whoop/data/repositories/NotificationRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/NotificationRepository;

    return-object v0
.end method

.method private final r()Lcom/whoop/service/push/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/push/b;

    return-object v0
.end method

.method private final s(Lzt/p;)V
    .locals 9

    invoke-virtual {p1}, Lzt/p;->f()Ljava/util/Map;

    move-result-object v0

    const-string v1, "getData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzt/p;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    new-instance v3, Ll83/k;

    const-string v4, "collapse_key"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v4, Lm92/f;

    invoke-direct {v4, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4}, Lm92/f;->c()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->M:Lbc3/c0;

    new-instance v2, Lcom/whoop/service/push/PushService$b;

    const/4 v3, 0x0

    invoke-direct {v2, v4, p0, v3}, Lcom/whoop/service/push/PushService$b;-><init>(Lm92/f;Lcom/whoop/service/push/PushService;Lq83/d;)V

    const/4 v6, 0x3

    invoke-static {v0, v3, v3, v2, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Lcom/whoop/service/push/PushService;->O:Lcom/whoop/service/push/PushService$a;

    invoke-virtual {v0, v5}, Lcom/whoop/service/push/PushService$a;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->N:Ltr2/n;

    const-string v1, "Processing Iterable in-app message"

    new-array v6, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p0, p1}, Lcom/iterable/iterableapi/IterableFirebaseMessagingService;->m(Lcom/google/firebase/messaging/FirebaseMessagingService;Lzt/p;)V

    goto :goto_0

    :cond_1
    const/4 v6, 0x1

    if-eqz v5, :cond_2

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->N:Ltr2/n;

    const-string v1, "Processing FCM data push: "

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v7, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v7}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :try_start_0
    invoke-static {p0}, Ls4/c;->getContextForLanguage(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContextForLanguage(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/service/push/PushService;->r()Lcom/whoop/service/push/b;

    move-result-object v1

    invoke-virtual {v1, v5, v4, v0}, Lcom/whoop/service/push/b;->b(Ljava/lang/String;Lm92/f;Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3
    :try_end_0
    .catch Lcom/whoop/service/push/InvalidPushDataException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move v7, v2

    move-object v8, v3

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/whoop/service/push/PushService;->N:Ltr2/n;

    const-string v7, "Error processing push"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v7, v0, v2}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    move-object v8, v3

    move v7, v6

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lzt/p;->h()Ldb/j0;

    move-result-object v0

    if-eqz v0, :cond_3

    move v0, v6

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    invoke-virtual {p1}, Lzt/p;->f()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, La0/f1;

    invoke-virtual {v7}, La0/f1;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v6

    iget-object v6, p0, Lcom/whoop/service/push/PushService;->N:Ltr2/n;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Received an unknown Firebase cloud message hasNotification="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " hasData="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {v6, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :goto_2
    iget-object v2, p0, Lcom/whoop/service/push/PushService;->K:Lcom/whoop/service/push/c;

    invoke-direct {p0}, Lcom/whoop/service/push/PushService;->p()Liy1/c;

    move-result-object v3

    move-object v6, p1

    invoke-virtual/range {v2 .. v8}, Lcom/whoop/service/push/c;->a(Liy1/c;Lm92/f;Ljava/lang/String;Lzt/p;ZLjava/lang/Boolean;)V

    return-void
.end method

.method private static final t(Lcom/whoop/service/push/PushService;Lzt/p;Z)Ll83/a0;
    .locals 8

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/service/push/PushService;->s(Lzt/p;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/service/push/PushService;->p()Liy1/c;

    move-result-object p0

    new-instance v0, Ljy1/a;

    const/16 v6, 0x15

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "push.receivedwhileunregistered"

    const/4 v3, 0x0

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Liy1/c;->b(Ljy1/a;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final v(Lcom/whoop/service/push/PushService;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/service/push/PushService;->p()Liy1/c;

    move-result-object p0

    new-instance v0, Ljy1/a;

    const/16 v6, 0x15

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "push.failedregistrationcheck"

    const/4 v3, 0x0

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method


# virtual methods
.method public h(Lzt/p;)V
    .locals 3

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v1, Lm92/j;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm92/j;

    invoke-virtual {v0}, Lm92/j;->s()Lxg3/p;

    move-result-object v0

    new-instance v1, Llq0/d;

    const/16 v2, 0x9

    invoke-direct {v1, v2, p0, p1}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lbl2/c;

    const/4 v2, 0x6

    invoke-direct {p1, v1, v2}, Lbl2/c;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lbl2/c;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lbl2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1, v1}, Lxg3/p;->d(Lbh3/b;Lbh3/b;)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 2

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v0, Lm92/j;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm92/j;

    invoke-virtual {p1}, Lm92/j;->D()V

    invoke-static {}, Lcom/iterable/iterableapi/IterableFirebaseMessagingService;->l()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "New Firebase Token generated: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "itblFCMMessagingService"

    invoke-static {v0, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/k;->k()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lzt/h;->onDestroy()V

    iget-object v0, p0, Lcom/whoop/service/push/PushService;->L:Lbc3/u;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
