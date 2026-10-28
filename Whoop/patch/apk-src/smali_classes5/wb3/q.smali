.class public final Lwb3/q;
.super Lwb3/a;
.source "SourceFile"


# instance fields
.field public final E:Ljava/util/List;

.field public final F:Lj93/a0;

.field public final G:Z

.field public final H:Z

.field public final I:Z

.field public final J:Lj93/d;

.field public final x:Lj93/e;

.field public final y:Ljava/util/List;

.field public final z:Z


# direct methods
.method public constructor <init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V
    .locals 1

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p10}, Lwb3/a;-><init>(Lc93/a;)V

    iput-object p1, p0, Lwb3/q;->x:Lj93/e;

    iput-object p2, p0, Lwb3/q;->y:Ljava/util/List;

    iput-boolean p3, p0, Lwb3/q;->z:Z

    iput-object p4, p0, Lwb3/q;->E:Ljava/util/List;

    iput-object p5, p0, Lwb3/q;->F:Lj93/a0;

    iput-boolean p6, p0, Lwb3/q;->G:Z

    iput-boolean p7, p0, Lwb3/q;->H:Z

    iput-boolean p8, p0, Lwb3/q;->I:Z

    iput-object p9, p0, Lwb3/q;->J:Lj93/d;

    return-void
.end method


# virtual methods
.method public final a()Lj93/a0;
    .locals 1

    iget-object v0, p0, Lwb3/q;->F:Lj93/a0;

    return-object v0
.end method

.method public final b()Lj93/d;
    .locals 1

    iget-object v0, p0, Lwb3/q;->J:Lj93/d;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lwb3/q;->G:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lwb3/q;->H:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lwb3/q;->I:Z

    return v0
.end method

.method public final g()Lwb3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/q;->E:Ljava/util/List;

    return-object v0
.end method

.method public final getArguments()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lwb3/q;->y:Ljava/util/List;

    return-object v0
.end method

.method public final getClassifier()Lj93/e;
    .locals 1

    iget-object v0, p0, Lwb3/q;->x:Lj93/e;

    return-object v0
.end method

.method public final h(Z)Lwb3/a;
    .locals 11

    new-instance v0, Lwb3/q;

    iget-boolean v1, p0, Lwb3/q;->z:Z

    if-eqz v1, :cond_0

    if-nez p1, :cond_0

    const/4 v1, 0x1

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget-object v9, p0, Lwb3/q;->J:Lj93/d;

    const/4 v10, 0x0

    iget-object v1, p0, Lwb3/q;->x:Lj93/e;

    iget-object v2, p0, Lwb3/q;->y:Ljava/util/List;

    iget-object v4, p0, Lwb3/q;->E:Ljava/util/List;

    iget-object v5, p0, Lwb3/q;->F:Lj93/a0;

    iget-boolean v7, p0, Lwb3/q;->H:Z

    iget-boolean v8, p0, Lwb3/q;->I:Z

    move v6, p1

    invoke-direct/range {v0 .. v10}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v0
.end method

.method public final i(Z)Lwb3/a;
    .locals 11

    new-instance v0, Lwb3/q;

    iget-object v9, p0, Lwb3/q;->J:Lj93/d;

    const/4 v10, 0x0

    iget-object v1, p0, Lwb3/q;->x:Lj93/e;

    iget-object v2, p0, Lwb3/q;->y:Ljava/util/List;

    iget-object v4, p0, Lwb3/q;->E:Ljava/util/List;

    iget-object v5, p0, Lwb3/q;->F:Lj93/a0;

    const/4 v6, 0x0

    iget-boolean v7, p0, Lwb3/q;->H:Z

    iget-boolean v8, p0, Lwb3/q;->I:Z

    move v3, p1

    invoke-direct/range {v0 .. v10}, Lwb3/q;-><init>(Lj93/e;Ljava/util/List;ZLjava/util/List;Lj93/a0;ZZZLj93/d;Lc93/a;)V

    return-object v0
.end method

.method public final isMarkedNullable()Z
    .locals 1

    iget-boolean v0, p0, Lwb3/q;->z:Z

    return v0
.end method

.method public final j()Lwb3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
