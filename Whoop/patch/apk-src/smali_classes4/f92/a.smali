.class public final Lf92/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lci2/b;
.implements Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R \u0010*\u001a\u000e\u0012\n\u0012\u0008\u0018\u00010&R\u00020\'0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010)R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014018\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\"\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014018\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u00103\u001a\u0004\u0008>\u00105R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\u00a8\u0006J"
    }
    d2 = {
        "Lf92/a;",
        "Lci2/b;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;",
        "Ltr2/n;",
        "logger",
        "Landroid/content/Context;",
        "context",
        "Lq92/h;",
        "whoopStrapSharedPrefs",
        "",
        "isTest",
        "Lbc3/c0;",
        "coroutineScope",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lec3/l;",
        "Lst0/f;",
        "connectionStateFlow",
        "<init>",
        "(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;)V",
        "Ljk0/d;",
        "whoopStrap",
        "Ll83/a0;",
        "n",
        "(Ljk0/d;)V",
        "m",
        "C",
        "q",
        "()V",
        "w",
        "Ltr2/n;",
        "x",
        "Lbc3/c0;",
        "y",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "z",
        "Ljk0/d;",
        "Lec3/p1;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService;",
        "E",
        "Lec3/p1;",
        "serviceBinderFlow",
        "F",
        "_currentWhoopStrapFlow",
        "Lec3/o1;",
        "G",
        "Lec3/o1;",
        "_newWhoopStrapFlow",
        "Lec3/f2;",
        "H",
        "Lec3/f2;",
        "c",
        "()Lec3/f2;",
        "currentWhoopStrapFlow",
        "Lec3/t1;",
        "I",
        "Lec3/t1;",
        "b",
        "()Lec3/t1;",
        "newWhoopStrapFlow",
        "J",
        "a",
        "commandCapableStrapFlow",
        "Lbc3/k1;",
        "K",
        "Lbc3/k1;",
        "detectStrapConnectionStatusJob",
        "Landroid/content/ServiceConnection;",
        "L",
        "Landroid/content/ServiceConnection;",
        "getServiceConnection$core_release",
        "()Landroid/content/ServiceConnection;",
        "serviceConnection",
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


# instance fields
.field private final E:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final F:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final G:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final H:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final I:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final J:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private K:Lbc3/k1;

.field private final L:Landroid/content/ServiceConnection;

.field private final w:Ltr2/n;

.field private final x:Lbc3/c0;

.field private final y:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private z:Ljk0/d;


# direct methods
.method public constructor <init>(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr2/n;",
            "Landroid/content/Context;",
            "Lq92/h;",
            "Z",
            "Lbc3/c0;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapSharedPrefs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionStateFlow"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf92/a;->w:Ltr2/n;

    .line 3
    iput-object p5, p0, Lf92/a;->x:Lbc3/c0;

    .line 4
    iput-object p6, p0, Lf92/a;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p6

    iput-object p6, p0, Lf92/a;->E:Lec3/p1;

    .line 6
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lf92/a;->F:Lec3/p1;

    .line 7
    sget-object v1, Ldc3/a;->x:Ldc3/a;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, v2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, p0, Lf92/a;->G:Lec3/o1;

    .line 8
    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lf92/a;->H:Lec3/f2;

    .line 9
    invoke-static {v1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    iput-object v0, p0, Lf92/a;->I:Lec3/t1;

    .line 10
    new-instance v0, Lf92/a$a;

    invoke-direct {v0, p1}, Lf92/a$a;-><init>(Lq83/d;)V

    .line 11
    new-instance v2, Lec3/a0;

    invoke-direct {v2, v0, v1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 12
    new-instance v0, Lf92/a$b;

    invoke-direct {v0, p0, p1}, Lf92/a$b;-><init>(Lf92/a;Lq83/d;)V

    invoke-static {p7, p6, v2, v0}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p6

    .line 13
    sget-object p7, Lec3/z1;->a:Lec3/b2;

    invoke-static {p6, p5, p7, p1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lf92/a;->J:Lec3/f2;

    .line 14
    new-instance p1, Lf92/a$c;

    invoke-direct {p1, p0}, Lf92/a$c;-><init>(Lf92/a;)V

    iput-object p1, p0, Lf92/a;->L:Landroid/content/ServiceConnection;

    if-nez p4, :cond_0

    .line 15
    sget-object p4, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->K:Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

    invoke-virtual {p3}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p4, p2, p1, p3}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;->a(Landroid/content/Context;Landroid/content/ServiceConnection;Landroid/bluetooth/BluetoothDevice;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Lq92/a;->w:Lq92/a;

    invoke-virtual {v0}, Lq92/a;->e()Lec3/f2;

    move-result-object v0

    move-object v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move-object/from16 v8, p7

    goto :goto_0

    .line 17
    :goto_1
    invoke-direct/range {v1 .. v8}, Lf92/a;-><init>(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;)V

    return-void
.end method

.method public static final synthetic d(Lf92/a;)Lci2/c;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic e(Lf92/a;)Lbc3/k1;
    .locals 0

    iget-object p0, p0, Lf92/a;->K:Lbc3/k1;

    return-object p0
.end method

.method public static final synthetic f(Lf92/a;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lf92/a;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic g(Lf92/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lf92/a;->w:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic h(Lf92/a;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lf92/a;->E:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic i(Lf92/a;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lf92/a;->F:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic j(Lf92/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lf92/a;->G:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic k(Lf92/a;Ljk0/d;)V
    .locals 0

    iput-object p1, p0, Lf92/a;->z:Ljk0/d;

    return-void
.end method

.method public static final synthetic l(Lf92/a;Ljk0/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lf92/a;->n(Ljk0/d;)V

    return-void
.end method

.method private final m(Ljk0/d;)V
    .locals 3

    iget-object v0, p0, Lf92/a;->x:Lbc3/c0;

    new-instance v1, Lf92/a$d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lf92/a$d;-><init>(Ljk0/d;Lf92/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lf92/a;->K:Lbc3/k1;

    return-void
.end method

.method private final n(Ljk0/d;)V
    .locals 3

    iget-object v0, p0, Lf92/a;->x:Lbc3/c0;

    new-instance v1, Lf92/a$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lf92/a$e;-><init>(Lf92/a;Ljk0/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public C(Ljk0/d;)V
    .locals 2

    const-string v0, "whoopStrap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf92/a;->z:Ljk0/d;

    iget-object v0, p0, Lf92/a;->F:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lf92/a;->n(Ljk0/d;)V

    :cond_0
    iget-object v0, p0, Lf92/a;->K:Lbc3/k1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    invoke-direct {p0, p1}, Lf92/a;->m(Ljk0/d;)V

    return-void
.end method

.method public a()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lf92/a;->J:Lec3/f2;

    return-object v0
.end method

.method public b()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lf92/a;->I:Lec3/t1;

    return-object v0
.end method

.method public c()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lf92/a;->H:Lec3/f2;

    return-object v0
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lf92/a;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Lost Whoop Strap"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lf92/a;->z:Ljk0/d;

    iget-object v1, p0, Lf92/a;->F:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v0}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lf92/a;->n(Ljk0/d;)V

    iget-object v1, p0, Lf92/a;->K:Lbc3/k1;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method
