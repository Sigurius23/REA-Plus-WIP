.class public final Lio/sentry/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h2;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Z

.field public G:Z

.field public H:I

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Lio/sentry/r3;

.field public M:Ljava/util/concurrent/ConcurrentHashMap;

.field public w:Z

.field public x:Ljava/lang/Double;

.field public y:Z

.field public z:Ljava/lang/Double;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Laa3/i1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lio/sentry/p4;->y:Z

    iget-object v0, p2, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    iput-object v0, p0, Lio/sentry/p4;->z:Ljava/lang/Double;

    iget-object v0, p2, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lio/sentry/p4;->w:Z

    iget-object p2, p2, Laa3/i1;->f:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Double;

    iput-object p2, p0, Lio/sentry/p4;->x:Ljava/lang/Double;

    invoke-virtual {p1}, Lio/sentry/q6;->getInternalTracesSampler()Lio/sentry/l7;

    move-result-object p2

    invoke-static {}, Lio/sentry/util/k;->a()Lio/sentry/util/j;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/util/j;->c()D

    move-result-wide v0

    iget-object p2, p2, Lio/sentry/l7;->a:Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getProfileSessionSampleRate()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpg-double p2, v2, v0

    if-ltz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lio/sentry/p4;->I:Z

    invoke-virtual {p1}, Lio/sentry/q6;->getProfilingTracesDirPath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/p4;->E:Ljava/lang/String;

    invoke-virtual {p1}, Lio/sentry/q6;->isProfilingEnabled()Z

    move-result p2

    iput-boolean p2, p0, Lio/sentry/p4;->F:Z

    invoke-virtual {p1}, Lio/sentry/q6;->isContinuousProfilingEnabled()Z

    move-result p2

    iput-boolean p2, p0, Lio/sentry/p4;->G:Z

    invoke-virtual {p1}, Lio/sentry/q6;->getProfileLifecycle()Lio/sentry/r3;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/p4;->L:Lio/sentry/r3;

    invoke-virtual {p1}, Lio/sentry/q6;->getProfilingTracesHz()I

    move-result p2

    iput p2, p0, Lio/sentry/p4;->H:I

    invoke-virtual {p1}, Lio/sentry/q6;->isEnableAppStartProfiling()Z

    move-result p2

    iput-boolean p2, p0, Lio/sentry/p4;->J:Z

    invoke-virtual {p1}, Lio/sentry/q6;->isStartProfilerOnAppStart()Z

    move-result p1

    iput-boolean p1, p0, Lio/sentry/p4;->K:Z

    return-void
.end method


# virtual methods
.method public final serialize(Lio/sentry/k3;Lio/sentry/v0;)V
    .locals 3

    check-cast p1, Lwe/o;

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    const-string v0, "profile_sampled"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "profile_sample_rate"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p4;->x:Ljava/lang/Double;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "continuous_profile_sampled"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->I:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "trace_sampled"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "trace_sample_rate"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p4;->z:Ljava/lang/Double;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "profiling_traces_dir_path"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p4;->E:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "is_profiling_enabled"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->F:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "is_continuous_profiling_enabled"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->G:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "profile_lifecycle"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p4;->L:Lio/sentry/r3;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "profiling_traces_hz"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget v0, p0, Lio/sentry/p4;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "is_enable_app_start_profiling"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->J:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    const-string v0, "is_start_profiler_on_app_start"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-boolean v0, p0, Lio/sentry/p4;->K:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/p4;->M:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/p4;->M:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2, v1, p1, v1, p2}, Lih0/d0;->A(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/String;Lwe/o;Ljava/lang/String;Lio/sentry/v0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
