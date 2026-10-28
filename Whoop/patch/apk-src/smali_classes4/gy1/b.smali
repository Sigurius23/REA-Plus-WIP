.class public final Lgy1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgy1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lgy1/b;",
        "Lfy1/l;",
        "Lgy1/c;",
        "screenStateMetricsHelper",
        "Lbc3/c0;",
        "coroutineScope",
        "Lfy1/g;",
        "nanoClock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lgy1/c;Lbc3/c0;Lfy1/g;Ltr2/n;)V",
        "",
        "screenTag",
        "Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V",
        "",
        "durationNanos",
        "transitionType",
        "e",
        "(Ljava/lang/String;JLjava/lang/String;)V",
        "a",
        "b",
        "(Ljava/lang/String;J)V",
        "Lgy1/c;",
        "Lbc3/c0;",
        "c",
        "Lfy1/g;",
        "Ltr2/n;",
        "Lfy1/f;",
        "Lfy1/f;",
        "latencyTrackingState",
        "metrics_release"
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
.field private final a:Lgy1/c;

.field private final b:Lbc3/c0;

.field private final c:Lfy1/g;

.field private final d:Ltr2/n;

.field private e:Lfy1/f;


# direct methods
.method public constructor <init>(Lgy1/c;Lbc3/c0;Lfy1/g;Ltr2/n;)V
    .locals 1

    const-string v0, "screenStateMetricsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nanoClock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgy1/b;->a:Lgy1/c;

    iput-object p2, p0, Lgy1/b;->b:Lbc3/c0;

    iput-object p3, p0, Lgy1/b;->c:Lfy1/g;

    iput-object p4, p0, Lgy1/b;->d:Ltr2/n;

    sget-object p1, Lfy1/f;->c:Lfy1/f$a;

    invoke-virtual {p1}, Lfy1/f$a;->a()Lfy1/f;

    move-result-object p1

    iput-object p1, p0, Lgy1/b;->e:Lfy1/f;

    return-void
.end method

.method public static final synthetic c(Lgy1/b;)Lgy1/c;
    .locals 0

    iget-object p0, p0, Lgy1/b;->a:Lgy1/c;

    return-object p0
.end method

.method private final d(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V
    .locals 3

    iget-object v0, p0, Lgy1/b;->b:Lbc3/c0;

    new-instance v1, Lgy1/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lgy1/b$b;-><init>(Lgy1/b;Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final e(Ljava/lang/String;JLjava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lgy1/b;->b:Lbc3/c0;

    new-instance v1, Lgy1/b$c;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lgy1/b$c;-><init>(Lgy1/b;Ljava/lang/String;JLjava/lang/String;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V
    .locals 4

    const-string v0, "screenTag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lgy1/b;->d(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V

    iget-object v0, p0, Lgy1/b;->e:Lfy1/f;

    sget-object v1, Lgy1/b$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_6

    const/4 v1, 0x2

    const-string v2, ", previous state was not LOADING."

    const/4 v3, 0x0

    if-eq p2, v1, :cond_4

    const/4 v1, 0x3

    if-eq p2, v1, :cond_2

    const/4 v1, 0x4

    if-eq p2, v1, :cond_1

    invoke-virtual {v0}, Lfy1/f;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lfy1/f;->c:Lfy1/f$a;

    invoke-virtual {p1}, Lfy1/f$a;->a()Lfy1/f;

    move-result-object p1

    iput-object p1, p0, Lgy1/b;->e:Lfy1/f;

    :cond_0
    return-void

    :cond_1
    iget-object p2, p0, Lgy1/b;->d:Ltr2/n;

    const-string v0, "ScreenStateTracker: CACHE_HIT for "

    const-string v1, ", keeping latency tracking."

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lfy1/f;->c()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0}, Lfy1/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_3

    iget-object v0, p0, Lgy1/b;->c:Lfy1/g;

    invoke-interface {v0}, Lfy1/g;->a()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-string p2, "ERROR"

    invoke-direct {p0, p1, v0, v1, p2}, Lgy1/b;->e(Ljava/lang/String;JLjava/lang/String;)V

    sget-object p1, Lfy1/f;->c:Lfy1/f$a;

    invoke-virtual {p1}, Lfy1/f$a;->a()Lfy1/f;

    move-result-object p1

    iput-object p1, p0, Lgy1/b;->e:Lfy1/f;

    return-void

    :cond_3
    iget-object p2, p0, Lgy1/b;->d:Ltr2/n;

    const-string v0, "ScreenStateTracker: Ignoring ERROR state for "

    invoke-static {v0, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_4
    invoke-virtual {v0}, Lfy1/f;->c()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0}, Lfy1/f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p2, :cond_5

    iget-object v0, p0, Lgy1/b;->c:Lfy1/g;

    invoke-interface {v0}, Lfy1/g;->a()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-string p2, "SUCCESS"

    invoke-direct {p0, p1, v0, v1, p2}, Lgy1/b;->e(Ljava/lang/String;JLjava/lang/String;)V

    sget-object p1, Lfy1/f;->c:Lfy1/f$a;

    invoke-virtual {p1}, Lfy1/f$a;->a()Lfy1/f;

    move-result-object p1

    iput-object p1, p0, Lgy1/b;->e:Lfy1/f;

    return-void

    :cond_5
    iget-object p2, p0, Lgy1/b;->d:Ltr2/n;

    const-string v0, "ScreenStateTracker: Ignoring SUCCESS state for "

    invoke-static {v0, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_6
    new-instance p2, Lfy1/f;

    iget-object v0, p0, Lgy1/b;->c:Lfy1/g;

    invoke-interface {v0}, Lfy1/g;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lfy1/f;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    iput-object p2, p0, Lgy1/b;->e:Lfy1/f;

    return-void
.end method

.method public b(Ljava/lang/String;J)V
    .locals 7

    const-string v0, "screenTag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgy1/b;->b:Lbc3/c0;

    new-instance v1, Lgy1/b$d;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Lgy1/b$d;-><init>(Lgy1/b;Ljava/lang/String;JLq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
