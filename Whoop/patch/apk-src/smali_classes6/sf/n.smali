.class public final Lsf/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/a;


# instance fields
.field public final a:Luf/t;

.field public final b:Lkotlin/time/TimeSource;

.field public c:Lkotlin/time/TimeMark;

.field public d:Lkotlin/time/TimeMark;

.field public e:Lkotlin/time/TimeMark;

.field public f:Lkotlin/time/TimeMark;

.field public final g:Lgf/c;


# direct methods
.method public constructor <init>(Luf/t;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    const-string v1, "metrics"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "timeSource"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsf/n;->a:Luf/t;

    iput-object v0, p0, Lsf/n;->b:Lkotlin/time/TimeSource;

    new-instance p1, Lgf/c;

    invoke-direct {p1}, Lgf/c;-><init>()V

    new-instance v0, Lgf/a;

    const-string v1, "rpc.service"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, p2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance p2, Lgf/a;

    const-string v0, "rpc.method"

    invoke-direct {p2, v0}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    iput-object p1, p0, Lsf/n;->g:Lgf/c;

    return-void
.end method


# virtual methods
.method public final b(Lsf/e;)V
    .locals 0

    iget-object p1, p0, Lsf/n;->b:Lkotlin/time/TimeSource;

    invoke-interface {p1}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p1

    iput-object p1, p0, Lsf/n;->f:Lkotlin/time/TimeMark;

    return-void
.end method

.method public final d(Lsf/c;)V
    .locals 0

    iget-object p1, p0, Lsf/n;->b:Lkotlin/time/TimeSource;

    invoke-interface {p1}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p1

    iput-object p1, p0, Lsf/n;->d:Lkotlin/time/TimeMark;

    return-void
.end method

.method public final f(Lsf/c;)V
    .locals 0

    iget-object p1, p0, Lsf/n;->b:Lkotlin/time/TimeSource;

    invoke-interface {p1}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p1

    iput-object p1, p0, Lsf/n;->c:Lkotlin/time/TimeMark;

    return-void
.end method

.method public final h(Lsf/d;)V
    .locals 3

    iget-object p1, p0, Lsf/n;->e:Lkotlin/time/TimeMark;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v0

    iget-object p1, p0, Lsf/n;->a:Luf/t;

    iget-object v2, p1, Luf/t;->h:Lqg/c;

    iget-object p1, p1, Luf/t;->a:Lmg/h;

    invoke-interface {p1}, Lmg/h;->b()Lng/d;

    move-result-object p1

    check-cast p1, Lng/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "$this$recordSeconds"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "attributes"

    iget-object v2, p0, Lsf/n;->g:Lgf/c;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeNanoseconds-impl(J)J

    :cond_0
    return-void
.end method

.method public final i(Lsf/f;)V
    .locals 0

    iget-object p1, p0, Lsf/n;->b:Lkotlin/time/TimeSource;

    invoke-interface {p1}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    move-result-object p1

    iput-object p1, p0, Lsf/n;->e:Lkotlin/time/TimeMark;

    return-void
.end method

.method public final j(Lsf/e;)V
    .locals 1

    iget-object v0, p0, Lsf/n;->a:Luf/t;

    iget-object v0, v0, Luf/t;->l:Lqg/c;

    iget-object p1, p1, Lsf/e;->b:Lvf/a;

    invoke-interface {p1}, Lvf/a;->getBody()Lmf/l;

    move-result-object p1

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Le4/a;->L(Lqg/c;Ljava/lang/Long;)V

    return-void
.end method

.method public final k(Lsf/a;)V
    .locals 7

    iget-object v0, p0, Lsf/n;->a:Luf/t;

    iget-object v1, v0, Luf/t;->c:Lqg/d;

    iget-object v2, v0, Luf/t;->a:Lmg/h;

    invoke-interface {v2}, Lmg/h;->b()Lng/d;

    move-result-object v3

    check-cast v3, Lng/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lsf/n;->g:Lgf/c;

    const-string v3, "attributes"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lsf/n;->f:Lkotlin/time/TimeMark;

    if-eqz v4, :cond_0

    invoke-interface {v4}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v4

    iget-object v6, v0, Luf/t;->e:Lqg/c;

    invoke-interface {v2}, Lmg/h;->b()Lng/d;

    move-result-object v2

    check-cast v2, Lng/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "$this$recordSeconds"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, Lkotlin/time/Duration;->getInWholeNanoseconds-impl(J)J

    iget-object p1, p1, Lsf/a;->e:Ldg/a;

    sget-object v2, Lpf/d;->a:Lgf/a;

    const-string v3, "<this>"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "key"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v3

    iget-object p1, p1, Ldg/a;->w:Lgf/c;

    invoke-virtual {p1, v2}, Lgf/c;->e(Lgf/a;)V

    check-cast v3, Lkotlin/time/Duration;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    iget-object p1, v0, Luf/t;->f:Lqg/c;

    invoke-static {v4, v5, v2, v3}, Lkotlin/time/Duration;->minus-LRDsOJo(JJ)J

    move-result-wide v2

    const/4 v0, 0x4

    invoke-static {p1, v2, v3, v1, v0}, Le4/a;->N(Lqg/c;JLgf/c;I)V

    :cond_0
    return-void
.end method

.method public final l(Lsf/b;)V
    .locals 7

    iget-object v0, p0, Lsf/n;->a:Luf/t;

    iget-object v1, v0, Luf/t;->a:Lmg/h;

    invoke-interface {v1}, Lmg/h;->b()Lng/d;

    move-result-object v1

    check-cast v1, Lng/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lsf/n;->c:Lkotlin/time/TimeMark;

    const-string v2, "attributes"

    iget-object v3, p0, Lsf/n;->g:Lgf/c;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v4

    iget-object v1, v0, Luf/t;->b:Lqg/c;

    const-string v6, "$this$recordSeconds"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, Lkotlin/time/Duration;->getInWholeNanoseconds-impl(J)J

    :cond_0
    iget-object p1, p1, Lsf/b;->b:Ljava/lang/Object;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v1, Lgf/c;

    invoke-direct {v1}, Lgf/c;-><init>()V

    new-instance v4, Lgf/a;

    const-string v5, "exception.type"

    invoke-direct {v4, v5}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4, p1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Ljc/x;->c0(Lgf/l;Lgf/b;)V

    move-object v3, v1

    :cond_1
    iget-object p1, v0, Luf/t;->d:Lqg/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final m(Lsf/f;)V
    .locals 1

    iget-object v0, p0, Lsf/n;->a:Luf/t;

    iget-object v0, v0, Luf/t;->m:Lqg/c;

    iget-object p1, p1, Lsf/f;->c:Lwf/a;

    iget-object p1, p1, Lwf/a;->c:Lmf/l;

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object p1

    invoke-static {v0, p1}, Le4/a;->L(Lqg/c;Ljava/lang/Long;)V

    return-void
.end method

.method public final n(Lsf/e;)V
    .locals 3

    iget-object p1, p0, Lsf/n;->d:Lkotlin/time/TimeMark;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v0

    iget-object p1, p0, Lsf/n;->a:Luf/t;

    iget-object v2, p1, Luf/t;->g:Lqg/c;

    iget-object p1, p1, Luf/t;->a:Lmg/h;

    invoke-interface {p1}, Lmg/h;->b()Lng/d;

    move-result-object p1

    check-cast p1, Lng/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "$this$recordSeconds"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "attributes"

    iget-object v2, p0, Lsf/n;->g:Lgf/c;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeNanoseconds-impl(J)J

    :cond_0
    return-void
.end method
