.class public final Lwb3/i;
.super Lwb3/a;
.source "SourceFile"


# instance fields
.field public final x:Lwb3/a;

.field public final y:Lwb3/a;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lwb3/a;Lwb3/a;ZLc93/a;)V
    .locals 0

    invoke-direct {p0, p4}, Lwb3/a;-><init>(Lc93/a;)V

    iput-object p1, p0, Lwb3/i;->x:Lwb3/a;

    iput-object p2, p0, Lwb3/i;->y:Lwb3/a;

    iput-boolean p3, p0, Lwb3/i;->z:Z

    return-void
.end method


# virtual methods
.method public final a()Lj93/a0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Lj93/d;
    .locals 1

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-virtual {v0}, Lwb3/a;->b()Lj93/d;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lwb3/i;->z:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()Lwb3/a;
    .locals 1

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    return-object v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-interface {v0}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getArguments()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-interface {v0}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getClassifier()Lj93/e;
    .locals 1

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-interface {v0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    return-object v0
.end method

.method public final h(Z)Lwb3/a;
    .locals 4

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-virtual {v0, p1}, Lwb3/a;->h(Z)Lwb3/a;

    move-result-object v0

    iget-object v1, p0, Lwb3/i;->y:Lwb3/a;

    invoke-virtual {v1, p1}, Lwb3/a;->h(Z)Lwb3/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lwb3/i;

    iget-boolean v2, p0, Lwb3/i;->z:Z

    const/4 v3, 0x0

    invoke-direct {v1, v0, p1, v2, v3}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    return-object v1
.end method

.method public final i(Z)Lwb3/a;
    .locals 4

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-virtual {v0, p1}, Lwb3/a;->i(Z)Lwb3/a;

    move-result-object v0

    iget-object v1, p0, Lwb3/i;->y:Lwb3/a;

    invoke-virtual {v1, p1}, Lwb3/a;->i(Z)Lwb3/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lwb3/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lwb3/i;

    iget-boolean v2, p0, Lwb3/i;->z:Z

    const/4 v3, 0x0

    invoke-direct {v1, v0, p1, v2, v3}, Lwb3/i;-><init>(Lwb3/a;Lwb3/a;ZLc93/a;)V

    return-object v1
.end method

.method public final isMarkedNullable()Z
    .locals 1

    iget-object v0, p0, Lwb3/i;->x:Lwb3/a;

    invoke-interface {v0}, Lj93/a0;->isMarkedNullable()Z

    move-result v0

    return v0
.end method

.method public final j()Lwb3/a;
    .locals 1

    iget-object v0, p0, Lwb3/i;->y:Lwb3/a;

    return-object v0
.end method
