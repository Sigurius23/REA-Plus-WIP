.class public final Lb3/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/s;
.implements Landroidx/lifecycle/e0;


# instance fields
.field public E:Lc93/m;

.field public final w:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final x:Lp1/w;

.field public y:Z

.field public z:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Lp1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/w3;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Lb3/w3;->x:Lp1/w;

    sget-object p1, Lb3/u1;->a:Lx1/b;

    iput-object p1, p0, Lb3/w3;->E:Lc93/m;

    return-void
.end method


# virtual methods
.method public final a(Lc93/m;)V
    .locals 2

    new-instance v0, Lb3/t0;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0, p1}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lb3/w3;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setOnViewTreeOwnersAvailable(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final dispose()V
    .locals 3

    iget-boolean v0, p0, Lb3/w3;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb3/w3;->y:Z

    iget-object v0, p0, Lb3/w3;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0dcb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lb3/w3;->z:Landroidx/lifecycle/x;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_0
    iget-object v0, p0, Lb3/w3;->x:Lp1/w;

    invoke-virtual {v0}, Lp1/w;->dispose()V

    return-void
.end method

.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    sget-object p1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lb3/w3;->dispose()V

    return-void

    :cond_0
    sget-object p1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_1

    iget-boolean p1, p0, Lb3/w3;->y:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lb3/w3;->E:Lc93/m;

    invoke-virtual {p0, p1}, Lb3/w3;->a(Lc93/m;)V

    :cond_1
    return-void
.end method
