.class public final Lvg0/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u0015\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010(\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010!\u00a8\u0006)"
    }
    d2 = {
        "Lvg0/i0;",
        "",
        "Lvg0/h0;",
        "markTurnAsSeenInteractor",
        "Ljava/time/Clock;",
        "clock",
        "<init>",
        "(Lvg0/h0;Ljava/time/Clock;)V",
        "Ll83/a0;",
        "e",
        "()V",
        "",
        "drawerOpenedAtMs",
        "b",
        "(JLq83/d;)Ljava/lang/Object;",
        "a",
        "Ltg0/a;",
        "action",
        "c",
        "(Ltg0/a;)V",
        "",
        "fingerprint",
        "turnId",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lvg0/h0;",
        "Ljava/time/Clock;",
        "Ljava/lang/Long;",
        "drawerOpenTimeMs",
        "currentTtpiaStartTimeMs",
        "currentTtfmtStartTimeMs",
        "",
        "f",
        "Z",
        "hasMarkedSeenForCurrentSession",
        "Lvg0/n0;",
        "g",
        "Lvg0/n0;",
        "pendingSeenState",
        "h",
        "isDrawerOpen",
        "bot_release"
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
.field private final a:Lvg0/h0;

.field private final b:Ljava/time/Clock;

.field private c:Ljava/lang/Long;

.field private d:Ljava/lang/Long;

.field private e:Ljava/lang/Long;

.field private f:Z

.field private g:Lvg0/n0;

.field private h:Z


# direct methods
.method public constructor <init>(Lvg0/h0;Ljava/time/Clock;)V
    .locals 1

    const-string v0, "markTurnAsSeenInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvg0/i0;->a:Lvg0/h0;

    iput-object p2, p0, Lvg0/i0;->b:Ljava/time/Clock;

    return-void
.end method

.method private final e()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lvg0/i0;->c:Ljava/lang/Long;

    iput-object v0, p0, Lvg0/i0;->g:Lvg0/n0;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lvg0/i0;->f:Z

    iput-object v0, p0, Lvg0/i0;->d:Ljava/lang/Long;

    iput-object v0, p0, Lvg0/i0;->e:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvg0/i0;->h:Z

    return-void
.end method

.method public final b(JLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvg0/i0;->h:Z

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, p1, p2}, Ljava/lang/Long;-><init>(J)V

    iput-object v1, p0, Lvg0/i0;->c:Ljava/lang/Long;

    iget-object p1, p0, Lvg0/i0;->g:Lvg0/n0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lvg0/i0;->g:Lvg0/n0;

    iput-boolean v0, p0, Lvg0/i0;->f:Z

    iget-object v0, p0, Lvg0/i0;->a:Lvg0/h0;

    invoke-virtual {p1}, Lvg0/n0;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lvg0/n0;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lvg0/n0;->c()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {p1}, Lvg0/n0;->b()J

    move-result-wide v5

    sub-long/2addr v5, v1

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V

    move-object v7, p1

    goto :goto_0

    :cond_1
    move-object v7, v1

    :goto_0
    new-instance v2, Lvg0/g0;

    const-wide/16 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lvg0/g0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v2, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lvg0/h0;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    invoke-static {p1, p3}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lr83/a;->w:Lr83/a;

    if-ne p1, p3, :cond_2

    return-object p1

    :cond_2
    return-object p2
.end method

.method public final c(Ltg0/a;)V
    .locals 2

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ltg0/a$b;

    if-nez v0, :cond_3

    instance-of v0, p1, Ltg0/a$n;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ltg0/a$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvg0/i0;->f:Z

    iput-object v1, p0, Lvg0/i0;->g:Lvg0/n0;

    check-cast p1, Ltg0/a$d;

    invoke-virtual {p1}, Ltg0/a$d;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lvg0/i0;->d:Ljava/lang/Long;

    invoke-virtual {p1}, Ltg0/a$d;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lvg0/i0;->e:Ljava/lang/Long;

    return-void

    :cond_1
    sget-object v0, Ltg0/a$e;->a:Ltg0/a$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iput-object v1, p0, Lvg0/i0;->g:Lvg0/n0;

    :cond_2
    return-void

    :cond_3
    :goto_0
    invoke-direct {p0}, Lvg0/i0;->e()V

    iget-object p1, p0, Lvg0/i0;->b:Ljava/time/Clock;

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lvg0/i0;->d:Ljava/lang/Long;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lvg0/i0;->e:Ljava/lang/Long;

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-boolean v0, p0, Lvg0/i0;->f:Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean v0, p0, Lvg0/i0;->h:Z

    if-nez v0, :cond_1

    new-instance v2, Lvg0/n0;

    iget-object p3, p0, Lvg0/i0;->b:Ljava/time/Clock;

    invoke-virtual {p3}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    iget-object v7, p0, Lvg0/i0;->d:Ljava/lang/Long;

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v7}, Lvg0/n0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V

    iput-object v2, p0, Lvg0/i0;->g:Lvg0/n0;

    return-object v1

    :cond_1
    move-object v3, p1

    move-object v4, p2

    iget-object p1, p0, Lvg0/i0;->b:Ljava/time/Clock;

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide p1

    iget-object v0, p0, Lvg0/i0;->e:Ljava/lang/Long;

    if-nez v0, :cond_2

    iget-object v0, p0, Lvg0/i0;->c:Ljava/lang/Long;

    :cond_2
    if-eqz v0, :cond_4

    const/4 v2, 0x1

    iput-boolean v2, p0, Lvg0/i0;->f:Z

    iget-object v2, p0, Lvg0/i0;->a:Lvg0/h0;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long v5, p1, v5

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object v0, p0, Lvg0/i0;->d:Ljava/lang/Long;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    sub-long/2addr p1, v9

    invoke-static {v7, v8, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    :goto_0
    move-object v8, v0

    move-wide v6, v5

    move-object v5, v4

    move-object v4, v3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v3, Lvg0/g0;

    invoke-direct/range {v3 .. v8}, Lvg0/g0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v3, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, p1}, Lvg0/h0;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    invoke-static {p1, p3}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    return-object v1
.end method
