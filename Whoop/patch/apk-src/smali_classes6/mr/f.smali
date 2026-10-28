.class public final Lmr/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;


# instance fields
.field public final synthetic w:Lmr/l;


# direct methods
.method public synthetic constructor <init>(Lmr/l;)V
    .locals 0

    iput-object p1, p0, Lmr/f;->w:Lmr/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object p1, p0, Lmr/f;->w:Lmr/l;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lmr/l;->a(I)V

    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

    invoke-virtual {p2}, Lh5/q1;->a()I

    move-result p1

    iget-object v0, p0, Lmr/f;->w:Lmr/l;

    iput p1, v0, Lmr/l;->n:I

    invoke-virtual {p2}, Lh5/q1;->b()I

    move-result p1

    iput p1, v0, Lmr/l;->o:I

    invoke-virtual {p2}, Lh5/q1;->c()I

    move-result p1

    iput p1, v0, Lmr/l;->p:I

    invoke-virtual {v0}, Lmr/l;->g()V

    return-object p2
.end method
