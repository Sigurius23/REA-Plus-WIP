.class public final Lkp0/j;
.super Lhj0/o;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkp0/j;",
        "Lhj0/o;",
        "Lz82/e;",
        "eventDispatcher",
        "Lsr2/y;",
        "urlProvider",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lz82/e;Lsr2/y;Lbc3/c0;)V",
        "",
        "source",
        "Ll83/a0;",
        "y",
        "(Ljava/lang/String;)V",
        "z",
        "()V",
        "E",
        "Lz82/e;",
        "F",
        "Lsr2/y;",
        "G",
        "Ljava/lang/String;",
        "o",
        "()Ljava/lang/String;",
        "logTag",
        "H",
        "w",
        "tonightsSleepUrl",
        "sleep-coach_release"
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
.field private final E:Lz82/e;

.field private final F:Lsr2/y;

.field private final G:Ljava/lang/String;

.field private final H:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lz82/e;Lsr2/y;Lbc3/c0;)V
    .locals 1

    const-string v0, "eventDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lhj0/o;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lkp0/j;->E:Lz82/e;

    .line 3
    iput-object p2, p0, Lkp0/j;->F:Lsr2/y;

    .line 4
    const-string p1, "OptimalSleepDialogViewModel"

    iput-object p1, p0, Lkp0/j;->G:Ljava/lang/String;

    .line 5
    invoke-virtual {p2}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p1

    const-string p2, "/url-mapping-service/v1/SLEEP_NEED_CALCULATED"

    .line 6
    invoke-static {p1, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    iput-object p1, p0, Lkp0/j;->H:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lz82/e;Lsr2/y;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 13
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lkp0/j;-><init>(Lz82/e;Lsr2/y;Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkp0/j;->G:Ljava/lang/String;

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkp0/j;->H:Ljava/lang/String;

    return-object v0
.end method

.method public final y(Ljava/lang/String;)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v0, "object"

    const-string v2, "Optimal Sleep"

    invoke-direct {p1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lkp0/j;->E:Lz82/e;

    const-string v1, "Sleep Coach - Close Optimal Sleep"

    const-string v2, ""

    const-string v3, "Close"

    invoke-virtual {v0, v3, v1, v2, p1}, Lz82/e;->l0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final z()V
    .locals 3

    iget-object v0, p0, Lkp0/j;->E:Lz82/e;

    const-string v1, "Optimal Sleep"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lz82/e;->d0(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
