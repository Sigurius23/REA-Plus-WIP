.class public final Lpq/m;
.super Landroidx/datastore/preferences/protobuf/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public final G:[I

.field public final z:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/datastore/preferences/protobuf/l;-><init>(I)V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lpq/m;->G:[I

    iput-object p1, p0, Lpq/m;->z:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final g(Lh5/d1;)V
    .locals 1

    iget-object p1, p0, Lpq/m;->z:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lpq/m;->z:Landroid/view/View;

    iget-object v1, p0, Lpq/m;->G:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v0, 0x1

    aget v0, v1, v0

    iput v0, p0, Lpq/m;->E:I

    return-void
.end method

.method public final i(Lh5/q1;Ljava/util/List;)Lh5/q1;
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/d1;

    iget-object v1, v0, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v1}, Lh5/c1;->c()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget p2, p0, Lpq/m;->F:I

    iget-object v0, v0, Lh5/d1;->a:Lh5/c1;

    invoke-virtual {v0}, Lh5/c1;->b()F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Lkq/a;->c(FII)I

    move-result p2

    int-to-float p2, p2

    iget-object v0, p0, Lpq/m;->z:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-object p1
.end method

.method public final j(Lh5/d1;Lio/sentry/internal/debugmeta/c;)Lio/sentry/internal/debugmeta/c;
    .locals 2

    iget-object p1, p0, Lpq/m;->z:Landroid/view/View;

    iget-object v0, p0, Lpq/m;->G:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v1, 0x1

    aget v0, v0, v1

    iget v1, p0, Lpq/m;->E:I

    sub-int/2addr v1, v0

    iput v1, p0, Lpq/m;->F:I

    int-to-float v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-object p2
.end method
