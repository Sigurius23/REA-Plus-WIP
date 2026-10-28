.class public abstract Lhj0/g;
.super Landroidx/fragment/app/y;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public E:Lz82/b;

.field private w:Lcom/whoop/ui/l;

.field private x:Lcom/whoop/ui/l;

.field private y:Lz82/e;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    new-instance v0, Lcom/whoop/ui/l;

    invoke-direct {v0}, Lcom/whoop/ui/l;-><init>()V

    iput-object v0, p0, Lhj0/g;->w:Lcom/whoop/ui/l;

    new-instance v0, Lcom/whoop/ui/l;

    invoke-direct {v0}, Lcom/whoop/ui/l;-><init>()V

    iput-object v0, p0, Lhj0/g;->x:Lcom/whoop/ui/l;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->b()Lz82/b;

    move-result-object v0

    invoke-interface {v0}, Lz82/b;->l()Lz82/e;

    move-result-object v0

    iput-object v0, p0, Lhj0/g;->y:Lz82/e;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->b()Lz82/b;

    move-result-object v0

    iput-object v0, p0, Lhj0/g;->E:Lz82/b;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    return-void
.end method

.method private C()V
    .locals 2

    invoke-virtual {p0}, Lhj0/g;->A()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->b()Lz82/b;

    move-result-object v1

    invoke-interface {v1, v0}, Lfi0/a;->g(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public B()Landroidx/fragment/app/r0;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    return-object v0
.end method

.method public D()V
    .locals 1

    iget-object v0, p0, Lhj0/g;->x:Lcom/whoop/ui/l;

    invoke-virtual {v0}, Lcom/whoop/ui/l;->b()V

    return-void
.end method

.method public getEventDispatcher()Lz82/e;
    .locals 1

    iget-object v0, p0, Lhj0/g;->y:Lz82/e;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhj0/g;->z:Z

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    iget-object v0, p0, Lhj0/g;->w:Lcom/whoop/ui/l;

    invoke-virtual {v0}, Lcom/whoop/ui/l;->b()V

    return-void
.end method

.method public onDestroyView()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/y;->onDestroyView()V

    invoke-virtual {p0}, Lhj0/g;->D()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lhj0/g;->C()V

    :cond_0
    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->setUserVisibleHint(Z)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lhj0/g;->C()V

    :cond_0
    return-void
.end method

.method public z(Lxg3/t;)V
    .locals 1

    iget-object v0, p0, Lhj0/g;->x:Lcom/whoop/ui/l;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    return-void
.end method
