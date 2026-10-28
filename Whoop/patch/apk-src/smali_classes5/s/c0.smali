.class public final Ls/c0;
.super Ls/n1;
.source "SourceFile"


# instance fields
.field public final synthetic J:Ls/i0;

.field public final synthetic K:Ls/l0;


# direct methods
.method public constructor <init>(Ls/l0;Ls/l0;Ls/i0;)V
    .locals 0

    iput-object p1, p0, Ls/c0;->K:Ls/l0;

    iput-object p3, p0, Ls/c0;->J:Ls/i0;

    invoke-direct {p0, p2}, Ls/n1;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lr/b0;
    .locals 1

    iget-object v0, p0, Ls/c0;->J:Ls/i0;

    return-object v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Ls/c0;->K:Ls/l0;

    invoke-virtual {v0}, Ls/l0;->getInternalPopup()Ls/k0;

    move-result-object v1

    invoke-interface {v1}, Ls/k0;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Ls/l0;->F:Ls/k0;

    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    move-result v0

    invoke-interface {v1, v2, v0}, Ls/k0;->j(II)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
