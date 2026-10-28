.class public final Lyq1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lyq1/a;",
        "Lof3/a;",
        "",
        "buildFlavor",
        "Lor2/i;",
        "buildDistribution",
        "Lyq1/b;",
        "sentryInitializerWrapper",
        "<init>",
        "(Ljava/lang/String;Lor2/i;Lyq1/b;)V",
        "h",
        "(Ljava/lang/String;Lor2/i;)Ljava/lang/String;",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "d",
        "(Landroid/content/Context;)V",
        "w",
        "Ljava/lang/String;",
        "x",
        "Lor2/i;",
        "y",
        "Lyq1/b;",
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


# instance fields
.field private final w:Ljava/lang/String;

.field private final x:Lor2/i;

.field private final y:Lyq1/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lor2/i;Lyq1/b;)V
    .locals 1

    const-string v0, "buildFlavor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildDistribution"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sentryInitializerWrapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyq1/a;->w:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lyq1/a;->x:Lor2/i;

    .line 4
    iput-object p3, p0, Lyq1/a;->y:Lyq1/b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lor2/i;Lyq1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    const-string p1, "prodStandard"

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    const-string p2, "play_prod_member"

    invoke-static {p2}, Lor2/h;->c(Ljava/lang/String;)Lor2/i;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    new-instance p3, Lyq1/b;

    invoke-direct {p3}, Lyq1/b;-><init>()V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lyq1/a;-><init>(Ljava/lang/String;Lor2/i;Lyq1/b;)V

    return-void
.end method

.method public static synthetic a(Lio/sentry/y3;)Ljava/lang/Double;
    .locals 0

    invoke-static {p0}, Lyq1/a;->f(Lio/sentry/y3;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Lyq1/a;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lyq1/a;->e(Landroid/content/Context;Lyq1/a;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method

.method public static synthetic c(Lyq1/a;Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 0

    invoke-static {p0, p1, p2}, Lyq1/a;->g(Lyq1/a;Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Landroid/content/Context;Lyq1/a;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxs/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lxs/a;-><init>(I)V

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setTracesSampler(Lio/sentry/p6;)V

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lio/sentry/q6;->setCacheDirPath(Ljava/lang/String;)V

    iget-object p0, p1, Lyq1/a;->w:Ljava/lang/String;

    iget-object v0, p1, Lyq1/a;->x:Lor2/i;

    invoke-direct {p1, p0, v0}, Lyq1/a;->h(Ljava/lang/String;Lor2/i;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lio/sentry/q6;->setEnvironment(Ljava/lang/String;)V

    new-instance p0, Lvd1/c;

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p0}, Lio/sentry/q6;->setBeforeSend(Lio/sentry/d6;)V

    return-void
.end method

.method private static final f(Lio/sentry/y3;)Ljava/lang/Double;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrr2/j;->w:Lrr2/j;

    invoke-virtual {v0, p0}, Lrr2/j;->a(Lio/sentry/y3;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lyq1/a;Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/sentry/e5;->f()Lio/sentry/protocol/u;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p2, Lyq1/a$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, p1, v0}, Lyq1/a$a;-><init>(Lyq1/a;Lio/sentry/e5;Lq83/d;)V

    invoke-static {p2}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private final h(Ljava/lang/String;Lor2/i;)Ljava/lang/String;
    .locals 2

    const-string v0, "prod"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lor2/i;->PLAY_PROD_MEMBER:Lor2/i;

    if-ne p2, p1, :cond_0

    const-string p1, "production"

    return-object p1

    :cond_0
    const-string p1, "enterprise"

    return-object p1

    :cond_1
    const-string p1, "dev"

    return-object p1
.end method


# virtual methods
.method public final d(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyq1/a;->y:Lyq1/b;

    new-instance v1, Lbu/d;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p1, p0}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Lyq1/b;->a(Landroid/content/Context;Lio/sentry/n4;)V

    return-void
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
