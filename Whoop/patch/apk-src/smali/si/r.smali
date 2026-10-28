.class public final Lsi/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsi/m;
.implements Lti/a;
.implements Lsi/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lqi/w;

.field public final e:Lti/m;

.field public f:Z

.field public final g:Lio/sentry/e2;


# direct methods
.method public constructor <init>(Lqi/w;Lzi/b;Lyi/o;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lsi/r;->a:Landroid/graphics/Path;

    new-instance v0, Lio/sentry/e2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/e2;-><init>(I)V

    iput-object v0, p0, Lsi/r;->g:Lio/sentry/e2;

    iget-object v0, p3, Lyi/o;->a:Ljava/lang/String;

    iput-object v0, p0, Lsi/r;->b:Ljava/lang/String;

    iget-boolean v0, p3, Lyi/o;->d:Z

    iput-boolean v0, p0, Lsi/r;->c:Z

    iput-object p1, p0, Lsi/r;->d:Lqi/w;

    iget-object p1, p3, Lyi/o;->c:Lxi/a;

    new-instance p3, Lti/m;

    iget-object p1, p1, Lal/a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-direct {p3, p1}, Lti/m;-><init>(Ljava/util/List;)V

    iput-object p3, p0, Lsi/r;->e:Lti/m;

    invoke-virtual {p2, p3}, Lzi/b;->f(Lti/d;)V

    invoke-virtual {p3, p0}, Lti/d;->a(Lti/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lsi/r;->f:Z

    iget-object v0, p0, Lsi/r;->d:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public final b(Ljava/util/List;Ljava/util/List;)V
    .locals 5

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    move-object v1, p1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsi/c;

    instance-of v2, v1, Lsi/t;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lsi/t;

    iget v3, v2, Lsi/t;->c:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    iget-object v1, p0, Lsi/r;->g:Lio/sentry/e2;

    iget-object v1, v1, Lio/sentry/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, p0}, Lsi/t;->d(Lti/a;)V

    goto :goto_1

    :cond_0
    instance-of v2, v1, Lsi/q;

    if-eqz v2, :cond_2

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    check-cast v1, Lsi/q;

    iget-object v2, v1, Lsi/q;->b:Lti/d;

    invoke-virtual {v2, p0}, Lti/d;->a(Lti/a;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lsi/r;->e:Lti/m;

    iput-object p2, p1, Lti/m;->m:Ljava/util/ArrayList;

    return-void
.end method

.method public final d(Lwi/e;ILjava/util/ArrayList;Lwi/e;)V
    .locals 0

    invoke-static {p1, p2, p3, p4, p0}, Ldj/g;->g(Lwi/e;ILjava/util/ArrayList;Lwi/e;Lsi/k;)V

    return-void
.end method

.method public final g(Ld1/j;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lqi/a0;->K:Landroid/graphics/Path;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lsi/r;->e:Lti/m;

    invoke-virtual {p2, p1}, Lti/d;->j(Ld1/j;)V

    :cond_0
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsi/r;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final getPath()Landroid/graphics/Path;
    .locals 4

    iget-boolean v0, p0, Lsi/r;->f:Z

    iget-object v1, p0, Lsi/r;->e:Lti/m;

    iget-object v2, p0, Lsi/r;->a:Landroid/graphics/Path;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lti/d;->e:Ld1/j;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v2

    :cond_1
    :goto_0
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget-boolean v0, p0, Lsi/r;->c:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    iput-boolean v3, p0, Lsi/r;->f:Z

    return-object v2

    :cond_2
    invoke-virtual {v1}, Lti/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    if-nez v0, :cond_3

    return-object v2

    :cond_3
    invoke-virtual {v2, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v2, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    iget-object v0, p0, Lsi/r;->g:Lio/sentry/e2;

    invoke-virtual {v0, v2}, Lio/sentry/e2;->a(Landroid/graphics/Path;)V

    iput-boolean v3, p0, Lsi/r;->f:Z

    return-object v2
.end method
