.class public final Ld9/v;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld9/v;->a:I

    iput-object p1, p0, Ld9/v;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    iget p2, p0, Ld9/v;->a:I

    packed-switch p2, :pswitch_data_0

    iget-object p2, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p2, Ld9/w;

    iget-object p2, p2, Ld9/w;->d:Ljava/lang/Object;

    check-cast p2, Ltm/s;

    iget-object p2, p2, Ltm/s;->u:Landroid/media/AudioTrack;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->i(Z)V

    iget-object p1, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p1, Ld9/w;

    iget-object p1, p1, Ld9/w;->d:Ljava/lang/Object;

    check-cast p1, Ltm/s;

    iget-object p2, p1, Ltm/s;->r:Lq30/u0;

    if-eqz p2, :cond_1

    iget-boolean p1, p1, Ltm/s;->U:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Ltm/v;

    iget-object p1, p1, Ltm/v;->o1:Lrm/v;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lrm/v;->a:Lrm/z;

    iget-object p1, p1, Lrm/z;->H:Llo/v;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Llo/v;->c(I)Z

    :cond_1
    return-void

    :pswitch_0
    iget-object p2, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p2, Ld9/w;

    iget-object p2, p2, Ld9/w;->d:Ljava/lang/Object;

    check-cast p2, Ld9/x;

    iget-object p2, p2, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p1, Ld9/w;

    iget-object p1, p1, Ld9/w;->d:Ljava/lang/Object;

    check-cast p1, Ld9/x;

    iget-object p2, p1, Ld9/x;->r:Lro/i;

    if-eqz p2, :cond_3

    iget-boolean p1, p1, Ld9/x;->V:Z

    if-eqz p1, :cond_3

    iget-object p1, p2, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ld9/a0;

    iget-object p1, p1, Li9/o;->f0:Lb9/h0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lb9/h0;->a()V

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    iget v0, p0, Ld9/v;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/media/AudioTrack$StreamEventCallback;->onPresentationEnded(Landroid/media/AudioTrack;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast v0, Ld9/w;

    iget-object v0, v0, Ld9/w;->d:Ljava/lang/Object;

    check-cast v0, Ld9/x;

    iget-object v0, v0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p1, Ld9/w;

    iget-object p1, p1, Ld9/w;->d:Ljava/lang/Object;

    check-cast p1, Ld9/x;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ld9/x;->U:Z

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    iget v0, p0, Ld9/v;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast v0, Ld9/w;

    iget-object v0, v0, Ld9/w;->d:Ljava/lang/Object;

    check-cast v0, Ltm/s;

    iget-object v0, v0, Ltm/s;->u:Landroid/media/AudioTrack;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->i(Z)V

    iget-object p1, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p1, Ld9/w;

    iget-object p1, p1, Ld9/w;->d:Ljava/lang/Object;

    check-cast p1, Ltm/s;

    iget-object v0, p1, Ltm/s;->r:Lq30/u0;

    if-eqz v0, :cond_1

    iget-boolean p1, p1, Ltm/s;->U:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Ltm/v;

    iget-object p1, p1, Ltm/v;->o1:Lrm/v;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lrm/v;->a:Lrm/z;

    iget-object p1, p1, Lrm/z;->H:Llo/v;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Llo/v;->c(I)Z

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast v0, Ld9/w;

    iget-object v0, v0, Ld9/w;->d:Ljava/lang/Object;

    check-cast v0, Ld9/x;

    iget-object v0, v0, Ld9/x;->v:Landroid/media/AudioTrack;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Ld9/v;->b:Ljava/lang/Object;

    check-cast p1, Ld9/w;

    iget-object p1, p1, Ld9/w;->d:Ljava/lang/Object;

    check-cast p1, Ld9/x;

    iget-object v0, p1, Ld9/x;->r:Lro/i;

    if-eqz v0, :cond_3

    iget-boolean p1, p1, Ld9/x;->V:Z

    if-eqz p1, :cond_3

    iget-object p1, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ld9/a0;

    iget-object p1, p1, Li9/o;->f0:Lb9/h0;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lb9/h0;->a()V

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
