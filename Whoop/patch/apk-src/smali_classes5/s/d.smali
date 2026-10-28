.class public final Ls/d;
.super Lr/v;
.source "SourceFile"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:Ls/h;


# direct methods
.method public constructor <init>(Ls/h;Landroid/content/Context;Lr/d0;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Ls/d;->l:I

    .line 8
    iput-object p1, p0, Ls/d;->m:Ls/h;

    const v6, 0x7f040023

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 9
    invoke-direct/range {v1 .. v7}, Lr/v;-><init>(Landroid/content/Context;Lr/l;Landroid/view/View;ZII)V

    .line 10
    iget-object p2, v3, Lr/d0;->B:Lr/n;

    .line 11
    iget p2, p2, Lr/n;->y:I

    const/16 p3, 0x20

    and-int/2addr p2, p3

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, Ls/h;->I:Ls/g;

    if-nez p2, :cond_1

    .line 13
    iget-object p2, p1, Ls/h;->H:Lr/z;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_1
    iput-object p2, v1, Lr/v;->e:Landroid/view/View;

    .line 16
    :goto_0
    iget-object p1, p1, Ls/h;->W:Lq30/u0;

    .line 17
    iput-object p1, v1, Lr/v;->h:Lr/w;

    .line 18
    iget-object p2, v1, Lr/v;->i:Lr/t;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, Lr/x;->h(Lr/w;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Ls/h;Landroid/content/Context;Lr/l;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Ls/d;->l:I

    .line 1
    iput-object p1, p0, Ls/d;->m:Ls/h;

    const v6, 0x7f040023

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v1 .. v7}, Lr/v;-><init>(Landroid/content/Context;Lr/l;Landroid/view/View;ZII)V

    const p2, 0x800005

    .line 3
    iput p2, v1, Lr/v;->f:I

    .line 4
    iget-object p1, p1, Ls/h;->W:Lq30/u0;

    .line 5
    iput-object p1, v1, Lr/v;->h:Lr/w;

    .line 6
    iget-object p2, v1, Lr/v;->i:Lr/t;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, Lr/x;->h(Lr/w;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget v0, p0, Ls/d;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls/d;->m:Ls/h;

    iget-object v1, v0, Ls/h;->y:Lr/l;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lr/l;->d(Z)V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Ls/h;->S:Ls/d;

    invoke-super {p0}, Lr/v;->c()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Ls/d;->m:Ls/h;

    iput-object v0, v1, Ls/h;->T:Ls/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0}, Lr/v;->c()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
