.class public final Ll0/v0;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Lh5/u;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public E:Z

.field public F:Z

.field public G:Lh5/q1;

.field public final z:Ll0/c2;


# direct methods
.method public constructor <init>(Ll0/c2;)V
    .locals 1

    iget-boolean v0, p1, Ll0/c2;->s:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/l;-><init>(I)V

    iput-object p1, p0, Ll0/v0;->z:Ll0/c2;

    return-void
.end method


# virtual methods
.method public final g(Lh5/d1;)V
    .locals 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll0/v0;->E:Z

    iput-boolean v0, p0, Ll0/v0;->F:Z

    iget-object v0, p0, Ll0/v0;->G:Lh5/q1;

    iget-object p1, p1, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {p1}, Lh5/c1;->a()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-lez p1, :cond_0

    if-eqz v0, :cond_0

    iget-object p1, v0, Lh5/q1;->a:Lh5/o1;

    iget-object v1, p0, Ll0/v0;->z:Ll0/c2;

    iget-object v2, v1, Ll0/c2;->r:Ll0/z1;

    const/16 v3, 0x8

    invoke-virtual {p1, v3}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v4

    invoke-virtual {v2, v4}, Ll0/z1;->f(Ll0/y0;)V

    iget-object v2, v1, Ll0/c2;->q:Ll0/z1;

    invoke-virtual {p1, v3}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p1

    invoke-static {p1}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll0/z1;->f(Ll0/y0;)V

    invoke-static {v1, v0}, Ll0/c2;->a(Ll0/c2;Lh5/q1;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Ll0/v0;->G:Lh5/q1;

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll0/v0;->E:Z

    iput-boolean v0, p0, Ll0/v0;->F:Z

    return-void
.end method

.method public final i(Lh5/q1;Ljava/util/List;)Lh5/q1;
    .locals 0

    iget-object p2, p0, Ll0/v0;->z:Ll0/c2;

    invoke-static {p2, p1}, Ll0/c2;->a(Ll0/c2;Lh5/q1;)V

    iget-boolean p2, p2, Ll0/c2;->s:Z

    if-eqz p2, :cond_0

    sget-object p1, Lh5/q1;->b:Lh5/q1;

    :cond_0
    return-object p1
.end method

.method public final j(Lh5/d1;Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll0/v0;->E:Z

    return-object p2
.end method

.method public final o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 5

    iput-object p2, p0, Ll0/v0;->G:Lh5/q1;

    iget-object v0, p0, Ll0/v0;->z:Ll0/c2;

    iget-object v1, v0, Ll0/c2;->q:Ll0/z1;

    iget-object v2, p2, Lh5/q1;->a:Lh5/o1;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll0/z1;->f(Ll0/y0;)V

    iget-boolean v1, p0, Ll0/v0;->E:Z

    if-eqz v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ne v1, v2, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Ll0/v0;->F:Z

    if-nez p1, :cond_1

    iget-object p1, v0, Ll0/c2;->r:Ll0/z1;

    invoke-virtual {v2, v3}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll0/z1;->f(Ll0/y0;)V

    invoke-static {v0, p2}, Ll0/c2;->a(Ll0/c2;Lh5/q1;)V

    :cond_1
    :goto_0
    iget-boolean p1, v0, Ll0/c2;->s:Z

    if-eqz p1, :cond_2

    sget-object p1, Lh5/q1;->b:Lh5/q1;

    return-object p1

    :cond_2
    return-object p2
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final run()V
    .locals 5

    iget-boolean v0, p0, Ll0/v0;->E:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll0/v0;->E:Z

    iput-boolean v0, p0, Ll0/v0;->F:Z

    iget-object v0, p0, Ll0/v0;->G:Lh5/q1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll0/v0;->z:Ll0/c2;

    iget-object v2, v1, Ll0/c2;->r:Ll0/z1;

    const/16 v3, 0x8

    iget-object v4, v0, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v4, v3}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->o(Lv4/b;)Ll0/y0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll0/z1;->f(Ll0/y0;)V

    invoke-static {v1, v0}, Ll0/c2;->a(Ll0/c2;Lh5/q1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ll0/v0;->G:Lh5/q1;

    :cond_0
    return-void
.end method
