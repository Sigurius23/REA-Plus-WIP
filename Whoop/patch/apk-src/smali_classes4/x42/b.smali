.class public final Lx42/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J*\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0080@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0019\u0010\u0011J \u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ \u0010 \u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lx42/b;",
        "",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Liy1/c;)V",
        "Lkotlin/time/Duration;",
        "duration",
        "",
        "a",
        "(J)Ljava/lang/String;",
        "Lcom/whoop/puffin/sync/f$b;",
        "state",
        "k",
        "(Lcom/whoop/puffin/sync/f$b;)Ljava/lang/String;",
        "Ll83/a0;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "e",
        "Lc52/d;",
        "batteryPackMetadata",
        "d",
        "(Lcom/whoop/puffin/sync/f$b;JLc52/d;Lq83/d;)Ljava/lang/Object;",
        "h",
        "f",
        "j",
        "",
        "isConsole",
        "",
        "count",
        "i",
        "(ZILq83/d;)Ljava/lang/Object;",
        "g",
        "c",
        "(ZLq83/d;)Ljava/lang/Object;",
        "Liy1/c;",
        "puffin_release"
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
.field private final a:Liy1/c;


# direct methods
.method public constructor <init>(Liy1/c;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx42/b;->a:Liy1/c;

    return-void
.end method

.method private final a(J)Ljava/lang/String;
    .locals 2

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide p1

    const-wide/16 v0, 0xa

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    const-string p1, "0-9"

    return-object p1

    :cond_0
    const-wide/16 v0, 0x1e

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    const-string p1, "10-29"

    return-object p1

    :cond_1
    const-wide/16 v0, 0x3c

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    const-string p1, "30-59"

    return-object p1

    :cond_2
    const-wide/16 v0, 0x78

    cmp-long v0, p1, v0

    if-gez v0, :cond_3

    const-string p1, "60-119"

    return-object p1

    :cond_3
    const-wide/16 v0, 0x12c

    cmp-long v0, p1, v0

    if-gez v0, :cond_4

    const-string p1, "120-299"

    return-object p1

    :cond_4
    const-wide/16 v0, 0x258

    cmp-long v0, p1, v0

    if-gez v0, :cond_5

    const-string p1, "300-599"

    return-object p1

    :cond_5
    const-wide/16 v0, 0x708

    cmp-long v0, p1, v0

    if-gez v0, :cond_6

    const-string p1, "600-1799"

    return-object p1

    :cond_6
    const-wide/16 v0, 0xe10

    cmp-long p1, p1, v0

    if-gez p1, :cond_7

    const-string p1, "1800-3599"

    return-object p1

    :cond_7
    const-string p1, "3600+"

    return-object p1
.end method

.method private final k(Lcom/whoop/puffin/sync/f$b;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lcom/whoop/puffin/sync/f$b$c;

    if-eqz v0, :cond_0

    const-string p1, "success"

    return-object p1

    :cond_0
    instance-of v0, p1, Lcom/whoop/puffin/sync/f$b$a;

    if-eqz v0, :cond_1

    const-string p1, "error"

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/puffin/sync/f$b$d;

    if-eqz v0, :cond_2

    const-string p1, "timeout"

    return-object p1

    :cond_2
    instance-of p1, p1, Lcom/whoop/puffin/sync/f$b$b;

    if-eqz p1, :cond_3

    const-string p1, "metadata_event_while_not_syncing"

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "battery_pack.puffin.hps.failure_to_start"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c(ZLq83/d;)Ljava/lang/Object;
    .locals 9
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

    if-eqz p1, :cond_0

    const-string p1, "console"

    goto :goto_0

    :cond_0
    const-string p1, "firmware"

    :goto_0
    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const-string v2, "battery_pack.puffin.hps.upload."

    const-string v3, ".empty"

    invoke-static {v2, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final d(Lcom/whoop/puffin/sync/f$b;JLc52/d;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/f$b;",
            "J",
            "Lc52/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    invoke-static {p1}, Lcom/whoop/puffin/sync/g;->c(Lcom/whoop/puffin/sync/f;)I

    move-result v2

    int-to-double v2, v2

    new-instance v4, Ljava/lang/Double;

    invoke-direct {v4, v2, v3}, Ljava/lang/Double;-><init>(D)V

    invoke-direct {p0, p1}, Lx42/b;->k(Lcom/whoop/puffin/sync/f$b;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "outcome:"

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p3}, Lx42/b;->a(J)Ljava/lang/String;

    move-result-object p2

    const-string p3, "duration_bucket:"

    invoke-static {p3, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lc52/d;->a()Loh2/b;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p3}, Loh2/b;->a()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-string p4, "firmware_version:"

    invoke-static {p4, p3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "battery_pack.puffin.hps.outcome"

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p5}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "battery_pack.puffin.hps.start"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "battery_pack.puffin.hps.upload.delete_db_error"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g(ZILq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const-string p1, "console"

    goto :goto_0

    :cond_0
    const-string p1, "firmware"

    :goto_0
    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const-string v2, "battery_pack.puffin.hps.upload."

    const-string v3, ".failure"

    invoke-static {v2, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    int-to-double p1, p2

    new-instance v4, Ljava/lang/Double;

    invoke-direct {v4, p1, p2}, Ljava/lang/Double;-><init>(D)V

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final h(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "battery_pack.puffin.hps.upload.read_db_error"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final i(ZILq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const-string p1, "console"

    goto :goto_0

    :cond_0
    const-string p1, "firmware"

    :goto_0
    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const-string v2, "battery_pack.puffin.hps.upload."

    const-string v3, ".success"

    invoke-static {v2, p1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    int-to-double p1, p2

    new-instance v4, Ljava/lang/Double;

    invoke-direct {v4, p1, p2}, Ljava/lang/Double;-><init>(D)V

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final j(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lx42/b;->a:Liy1/c;

    new-instance v1, Ljy1/a;

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "battery_pack.puffin.hps.upload.write_file_error"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
