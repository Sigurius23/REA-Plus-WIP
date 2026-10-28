.class public final Lio/sentry/u6;
.super Li63/j;
.source "SourceFile"


# static fields
.field public static final v:Ljava/util/List;


# instance fields
.field public volatile d:Z

.field public e:Ljava/lang/Double;

.field public f:Ljava/lang/Double;

.field public g:Lio/sentry/t6;

.field public h:I

.field public i:J

.field public j:J

.field public k:J

.field public l:Z

.field public m:Lio/sentry/protocol/t;

.field public n:Z

.field public o:Lio/sentry/j4;

.field public p:Z

.field public q:Ljava/util/List;

.field public r:Ljava/util/List;

.field public s:Z

.field public t:Ljava/util/List;

.field public u:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "Content-Length"

    const-string v1, "Accept"

    const-string v2, "Content-Type"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio/sentry/u6;->v:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lio/sentry/u6;->e()V

    :cond_0
    invoke-super {p0, p1}, Li63/j;->c(Z)V

    return-void
.end method

.method public final d(Z)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lio/sentry/u6;->e()V

    :cond_0
    invoke-super {p0, p1}, Li63/j;->d(Z)V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-boolean v0, p0, Lio/sentry/u6;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/u6;->d:Z

    const-string v0, "ReplayCustomMasking"

    invoke-static {v0}, Ljc/x;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/u6;->q:Ljava/util/List;

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/u6;->r:Ljava/util/List;

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/u6;->t:Ljava/util/List;

    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/u6;->u:Ljava/util/List;

    return-object v0
.end method

.method public final j()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/u6;->f:Ljava/lang/Double;

    return-object v0
.end method

.method public final k()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/u6;->e:Ljava/lang/Double;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/u6;->p:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/u6;->s:Z

    return v0
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/u6;->p:Z

    return-void
.end method

.method public final o(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/u6;->n:Z

    return-void
.end method

.method public final p(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/u6;->s:Z

    return-void
.end method

.method public final q(Ljava/util/ArrayList;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/u6;->q:Ljava/util/List;

    return-void
.end method

.method public final r(Ljava/util/ArrayList;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/u6;->r:Ljava/util/List;

    return-void
.end method

.method public final s(Ljava/util/ArrayList;)V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lio/sentry/u6;->v:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/u6;->t:Ljava/util/List;

    return-void
.end method

.method public final t(Ljava/util/ArrayList;)V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lio/sentry/u6;->v:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/u6;->u:Ljava/util/List;

    return-void
.end method

.method public final u(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/u6;->f:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/u6;->e:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
