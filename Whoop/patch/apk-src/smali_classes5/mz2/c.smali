.class public final Lmz2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001b\u0010,\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u00060"
    }
    d2 = {
        "Lmz2/c;",
        "Lof3/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lq83/j;",
        "maintenanceContext",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;)V",
        "",
        "p",
        "()Z",
        "Lmz2/d;",
        "hrDeviceScanner",
        "Ll83/a0;",
        "s",
        "(Lmz2/d;)V",
        "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
        "hrDeviceConnection",
        "q",
        "(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V",
        "r",
        "()V",
        "w",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "x",
        "Lq83/j;",
        "Ltr2/n;",
        "y",
        "Ltr2/n;",
        "m",
        "()Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "z",
        "Lbc3/c0;",
        "waitAndRescanScope",
        "E",
        "connectionMaintenanceScope",
        "F",
        "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
        "G",
        "Ll83/h;",
        "l",
        "()Lmz2/d;",
        "hrDeviceScannerLegacy",
        "H",
        "Lmz2/d;",
        "activeRescanScanner",
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


# instance fields
.field private E:Lbc3/c0;

.field private F:Lcom/whoop/whooplabs/io/HrDeviceConnection;

.field private final G:Ll83/h;

.field private H:Lmz2/d;

.field private final w:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final x:Lq83/j;

.field private final y:Ltr2/n;

.field private z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maintenanceContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmz2/c;->w:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Lmz2/c;->x:Lq83/j;

    .line 4
    const-string p1, "HrConnectionMaintainer"

    invoke-static {p1}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lmz2/c;->y:Ltr2/n;

    .line 5
    new-instance p1, Lmz2/b;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lmz2/b;-><init>(Lmz2/c;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lmz2/c;->G:Ll83/h;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 6
    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    .line 7
    sget-object p2, Lkc3/d;->w:Lkc3/d;

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lmz2/c;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/j;)V

    return-void
.end method

.method public static synthetic a(Lmz2/c;)Lmz2/d;
    .locals 0

    invoke-static {p0}, Lmz2/c;->n(Lmz2/c;)Lmz2/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmz2/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lmz2/c;->o(Lmz2/c;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lmz2/c;)Lmz2/d;
    .locals 0

    iget-object p0, p0, Lmz2/c;->H:Lmz2/d;

    return-object p0
.end method

.method public static final synthetic d(Lmz2/c;)Lcom/whoop/whooplabs/io/HrDeviceConnection;
    .locals 0

    iget-object p0, p0, Lmz2/c;->F:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    return-object p0
.end method

.method public static final synthetic e(Lmz2/c;)Lmz2/d;
    .locals 0

    invoke-direct {p0}, Lmz2/c;->l()Lmz2/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lmz2/c;)Lq83/j;
    .locals 0

    iget-object p0, p0, Lmz2/c;->x:Lq83/j;

    return-object p0
.end method

.method public static final synthetic g(Lmz2/c;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Lmz2/c;->z:Lbc3/c0;

    return-object p0
.end method

.method public static final synthetic h(Lmz2/c;)Z
    .locals 0

    invoke-direct {p0}, Lmz2/c;->p()Z

    move-result p0

    return p0
.end method

.method public static final synthetic i(Lmz2/c;Lmz2/d;)V
    .locals 0

    iput-object p1, p0, Lmz2/c;->H:Lmz2/d;

    return-void
.end method

.method public static final synthetic j(Lmz2/c;Lbc3/c0;)V
    .locals 0

    iput-object p1, p0, Lmz2/c;->z:Lbc3/c0;

    return-void
.end method

.method public static final synthetic k(Lmz2/c;Lmz2/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lmz2/c;->s(Lmz2/d;)V

    return-void
.end method

.method private final l()Lmz2/d;
    .locals 1

    iget-object v0, p0, Lmz2/c;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmz2/d;

    return-object v0
.end method

.method private static final n(Lmz2/c;)Lmz2/d;
    .locals 3

    new-instance v0, Lmz2/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lmz2/b;-><init>(Lmz2/c;I)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p0

    iget-object p0, p0, Lnf3/a;->a:Lwf3/a;

    iget-object p0, p0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Lmz2/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmz2/d;

    return-object p0
.end method

.method private static final o(Lmz2/c;)Luf3/a;
    .locals 0

    iget-object p0, p0, Lmz2/c;->z:Lbc3/c0;

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final p()Z
    .locals 2

    iget-object v0, p0, Lmz2/c;->w:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "dwl-android-connection-maintainer-fix"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private final s(Lmz2/d;)V
    .locals 4

    iget-object v0, p0, Lmz2/c;->y:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "going to waitAndRescan"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lmz2/c;->z:Lbc3/c0;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v3, Lmz2/c$b;

    invoke-direct {v3, p1, p0, v2}, Lmz2/c$b;-><init>(Lmz2/d;Lmz2/c;Lq83/d;)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iget-object v0, p0, Lmz2/c;->z:Lbc3/c0;

    if-eqz v0, :cond_1

    new-instance v3, Lmz2/c$c;

    invoke-direct {v3, p0, p1, v2}, Lmz2/c$c;-><init>(Lmz2/c;Lmz2/d;Lq83/d;)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    return-void
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public final m()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lmz2/c;->y:Ltr2/n;

    return-object v0
.end method

.method public final q(Lcom/whoop/whooplabs/io/HrDeviceConnection;)V
    .locals 3

    const-string v0, "hrDeviceConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmz2/c;->F:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object v0, p0, Lmz2/c;->E:Lbc3/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lmz2/c;->x:Lq83/j;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v2

    invoke-interface {v0, v2}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v2, Lmz2/c$a;

    invoke-direct {v2, p1, p0, v1}, Lmz2/c$a;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lmz2/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput-object v0, p0, Lmz2/c;->E:Lbc3/c0;

    return-void
.end method

.method public final r()V
    .locals 3

    invoke-direct {p0}, Lmz2/c;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lmz2/c;->H:Lmz2/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lmz2/d;->p()V

    :cond_0
    iget-object v1, p0, Lmz2/c;->E:Lbc3/c0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v1, p0, Lmz2/c;->z:Lbc3/c0;

    if-eqz v1, :cond_2

    invoke-static {v1, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_2
    if-eqz v0, :cond_3

    iput-object v2, p0, Lmz2/c;->z:Lbc3/c0;

    iput-object v2, p0, Lmz2/c;->H:Lmz2/d;

    :cond_3
    return-void
.end method
