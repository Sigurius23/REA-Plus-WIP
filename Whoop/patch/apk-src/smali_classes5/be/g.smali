.class public final Lbe/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe/m;


# instance fields
.field public final E:Lhm/d;

.field public final F:Lbe/k;

.field public final G:Lbe/q;

.field public final w:Lcf/c;

.field public final x:Lpf/a;

.field public final y:Lmf/u;

.field public final z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    new-instance v0, Lbe/c;

    invoke-direct {v0}, Lbe/c;-><init>()V

    invoke-direct {p0, v0}, Lbe/g;-><init>(Lbe/c;)V

    return-void
.end method

.method public constructor <init>(Lbe/c;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-wide v3, p1, Lbe/c;->a:J

    .line 3
    iget-object v5, p1, Lbe/c;->d:Lug/a;

    .line 4
    iget-object v0, p1, Lbe/c;->e:Lvg/n;

    .line 5
    iget-object v1, p1, Lbe/c;->b:Lcf/c;

    .line 6
    iput-object v1, p0, Lbe/g;->w:Lcf/c;

    .line 7
    iget-object p1, p1, Lbe/c;->c:Lpf/a;

    const/4 v1, 0x1

    if-nez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 8
    :goto_0
    iput-boolean v2, p0, Lbe/g;->z:Z

    const/4 v2, 0x0

    if-nez p1, :cond_1

    .line 9
    sget p1, Lrf/o;->H:I

    .line 10
    new-instance p1, Lrf/o;

    .line 11
    new-instance v6, Lrf/r;

    new-instance v7, Lrf/q;

    invoke-direct {v7}, Lrf/q;-><init>()V

    .line 12
    sget-object v8, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v8, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v8}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v9

    .line 13
    iput-wide v9, v7, Lpf/h;->c:J

    .line 14
    invoke-static {v1, v8}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v8

    .line 15
    iput-wide v8, v7, Lpf/h;->a:J

    .line 16
    sget-object v1, Lpf/s;->w:Llive/hms/video/factories/c;

    .line 17
    iput-object v1, v7, Lpf/h;->g:Lpf/t;

    .line 18
    invoke-direct {v6, v7}, Lrf/r;-><init>(Lrf/q;)V

    .line 19
    invoke-direct {p1, v6, v2}, Lrf/o;-><init>(Lrf/r;Lud3/l0;)V

    .line 20
    :cond_1
    iput-object p1, p0, Lbe/g;->x:Lpf/a;

    .line 21
    new-instance v1, Lmf/u;

    invoke-direct {v1, p1}, Lmf/u;-><init>(Lpf/a;)V

    iput-object v1, p0, Lbe/g;->y:Lmf/u;

    .line 22
    new-instance p1, Lhm/d;

    .line 23
    new-instance v6, Lge/a;

    const-string v7, "imds"

    const-string v8, "unknown"

    invoke-direct {v6, v7, v8}, Lge/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-static {v6, v2}, Lj93/l0;->v(Lge/a;Ljava/lang/String;)Lge/b;

    move-result-object v2

    .line 25
    invoke-direct {p1, v2}, Lhm/d;-><init>(Lge/b;)V

    iput-object p1, p0, Lbe/g;->E:Lhm/d;

    .line 26
    new-instance v2, Lbe/k;

    invoke-direct {v2, v0}, Lbe/k;-><init>(Lvg/n;)V

    iput-object v2, p0, Lbe/g;->F:Lbe/k;

    .line 27
    new-instance v0, Lbe/q;

    invoke-direct/range {v0 .. v5}, Lbe/q;-><init>(Lmf/u;Lbe/k;JLug/a;)V

    iput-object v0, p0, Lbe/g;->G:Lbe/q;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lbe/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v0, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v0

    const-class v2, Ll83/a0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v3, "inputType"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "outputType"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lb30/m;

    const/16 v3, 0x14

    invoke-direct {v10, v3}, Lb30/m;-><init>(I)V

    sget-object v3, Lmg/h;->a:Lmg/g;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lmg/g;->b:Lmg/f;

    iput-object v3, v10, Lb30/m;->x:Ljava/lang/Object;

    sget-object v3, Lrg/d;->x:Lrg/d;

    iput-object v3, v10, Lb30/m;->y:Ljava/lang/Object;

    sget-object v3, Lgf/i;->w:Lgf/i;

    iput-object v3, v10, Lb30/m;->z:Ljava/lang/Object;

    sget-object v3, Luf/t;->n:Luf/t;

    iput-object v3, v10, Lb30/m;->E:Ljava/lang/Object;

    new-instance v5, Lio/sentry/android/replay/video/d;

    const/4 v3, 0x4

    invoke-direct {v5, v3}, Lio/sentry/android/replay/video/d;-><init>(I)V

    new-instance v6, Ldg/a;

    invoke-direct {v6}, Ldg/a;-><init>()V

    new-instance v8, Lbe/f;

    invoke-direct {v8, v0}, Lbe/f;-><init>(Lgm/r;)V

    sget-object v0, Lcf/l;->d:Lgf/a;

    iget-object v3, p0, Lbe/g;->w:Lcf/c;

    invoke-virtual {v6, v0, v3}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    iget-object v0, p0, Lbe/g;->F:Lbe/k;

    iput-object v0, v5, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    if-eqz p1, :cond_0

    sget-object v0, Lcf/l;->a:Lgf/a;

    invoke-virtual {v6, v0, p1}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    sget-object v0, Lcf/l;->b:Lgf/a;

    const-string v3, "IMDS"

    invoke-virtual {v6, v0, v3}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v9, Luf/v;

    invoke-direct {v9, v2, v1}, Luf/v;-><init>(Lj93/d;Lj93/d;)V

    new-instance v4, Lm63/d;

    sget-object v7, Luf/k;->a:Luf/j;

    invoke-direct/range {v4 .. v10}, Lm63/d;-><init>(Lio/sentry/android/replay/video/d;Ldg/a;Luf/l;Luf/h;Luf/v;Lb30/m;)V

    new-instance v0, Lbe/l;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-direct {v0, v1}, Lbe/l;-><init>(Lq83/j;)V

    iput-object v0, v5, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    iget-object v0, p0, Lbe/g;->E:Lhm/d;

    invoke-virtual {v4, v0}, Lm63/d;->i(Luf/o;)V

    iget-object v0, p0, Lbe/g;->G:Lbe/q;

    invoke-virtual {v4, v0}, Lm63/d;->i(Luf/o;)V

    iget-object v0, v5, Lio/sentry/android/replay/video/d;->b:Ljava/lang/Object;

    check-cast v0, Lag/e;

    sget-object v1, Lag/f;->w:Lag/f;

    new-instance v2, Lbe/d;

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, p1, v3, v5}, Lbe/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lag/c;

    invoke-direct {p1, v2}, Lag/c;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {v0, p1, v1}, Lag/e;->c(Lag/b;Lag/f;)V

    iget-object p1, p0, Lbe/g;->y:Lmf/u;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v4, p1, v0, p2}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "operationName is a required HTTP execution attribute"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lbe/g;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbe/g;->x:Lpf/a;

    invoke-static {v0}, Lyf/j;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
