.class public final Lcom/whoop/data/interactor/ExportedMetricsInteractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/interactor/ExportedMetricsInteractor$Companion;,
        Lcom/whoop/data/interactor/ExportedMetricsInteractor$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001bR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/data/interactor/ExportedMetricsInteractor;",
        "",
        "Lca2/f;",
        "historySyncRouter",
        "Lbi2/d;",
        "heartDataStore",
        "Lin2/d;",
        "dispatcherFactory",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lca2/f;Lbi2/d;Lin2/d;Lbc3/c0;)V",
        "",
        "secondsRetrievedBeforeNow",
        "Lec3/l;",
        "Lcom/whoop/data/interactor/MetricHeartDataSyncState;",
        "startForcedSyncAndObserve",
        "(I)Lec3/l;",
        "prepareHeartDataFile",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/interactor/ExportedMetricsAction;",
        "action",
        "Ll83/a0;",
        "sendAction",
        "(Lcom/whoop/data/interactor/ExportedMetricsAction;Lq83/d;)Ljava/lang/Object;",
        "Lca2/f;",
        "Lbi2/d;",
        "Lin2/d;",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/o1;",
        "exportedHeartDataFlow",
        "Lec3/l;",
        "getExportedHeartDataFlow",
        "()Lec3/l;",
        "Companion",
        "feature_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/data/interactor/ExportedMetricsInteractor$Companion;

.field private static final JOB_TAG:Ljava/lang/String; = "ExportedMetricsInteractorJob"


# instance fields
.field private final dispatcherFactory:Lin2/d;

.field private final eventFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final exportedHeartDataFlow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final heartDataStore:Lbi2/d;

.field private final historySyncRouter:Lca2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->Companion:Lcom/whoop/data/interactor/ExportedMetricsInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lca2/f;Lbi2/d;Lin2/d;Lbc3/c0;)V
    .locals 1

    const-string v0, "historySyncRouter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartDataStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->historySyncRouter:Lca2/f;

    iput-object p2, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->heartDataStore:Lbi2/d;

    iput-object p3, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->dispatcherFactory:Lin2/d;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p2, p2, p3, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->eventFlow:Lec3/o1;

    new-instance v0, Lcom/whoop/data/interactor/ExportedMetricsInteractor$special$$inlined$flatMapLatest$1;

    invoke-direct {v0, p3, p0}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/data/interactor/ExportedMetricsInteractor;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object p3, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, p4, p3, p2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->exportedHeartDataFlow:Lec3/l;

    return-void
.end method

.method public static final synthetic access$getHeartDataStore$p(Lcom/whoop/data/interactor/ExportedMetricsInteractor;)Lbi2/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->heartDataStore:Lbi2/d;

    return-object p0
.end method

.method public static final synthetic access$prepareHeartDataFile(Lcom/whoop/data/interactor/ExportedMetricsInteractor;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->prepareHeartDataFile(ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$startForcedSyncAndObserve(Lcom/whoop/data/interactor/ExportedMetricsInteractor;I)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->startForcedSyncAndObserve(I)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final prepareHeartDataFile(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/interactor/MetricHeartDataSyncState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;-><init>(Lcom/whoop/data/interactor/ExportedMetricsInteractor;ILq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final startForcedSyncAndObserve(I)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->historySyncRouter:Lca2/f;

    const-string v1, "ExportedMetricsInteractorJob"

    invoke-interface {v0, v1}, Lca2/f;->e(Ljava/lang/String;)Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1;

    invoke-direct {v1, v0, p0, p1}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$startForcedSyncAndObserve$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/data/interactor/ExportedMetricsInteractor;I)V

    return-object v1
.end method


# virtual methods
.method public final getExportedHeartDataFlow()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->exportedHeartDataFlow:Lec3/l;

    return-object v0
.end method

.method public final sendAction(Lcom/whoop/data/interactor/ExportedMetricsAction;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/interactor/ExportedMetricsAction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/interactor/ExportedMetricsInteractor;->eventFlow:Lec3/o1;

    invoke-interface {v0, p1, p2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
