.class public final Lt23/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt23/c0;


# direct methods
.method public synthetic constructor <init>(Lt23/c0;I)V
    .locals 0

    iput p2, p0, Lt23/l;->w:I

    iput-object p1, p0, Lt23/l;->x:Lt23/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lt23/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    iget-object v0, v0, Lt23/x1;->g:Lt23/h3;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->i()Lt23/a2;

    move-result-object v1

    iget-object v1, v1, Lt23/a2;->l:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lkotlin/jvm/internal/m;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v0, Lt23/s0;->z:Lec3/h2;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lt23/s0;->q0:Lbc3/c2;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v3}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v1, v0, Lt23/s0;->d:Lhc3/d;

    new-instance v2, Lt23/p0;

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v4}, Lt23/p0;-><init>(Lt23/s0;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v1, v3, v3, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, Lt23/s0;->q0:Lbc3/c2;

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    iget-object v0, v0, Lt23/x1;->h:Lt23/f3;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->I:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/webrtc/EglBase;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    iget-object v0, v0, Lt23/x1;->f:Lt23/a2;

    iget-object v0, v0, Lt23/a2;->r:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/AudioBitrateProfile;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    iget-object v1, v0, Lt23/c0;->g:Lt23/b4;

    iget-object v1, v1, Lt23/b4;->K:Lbi/p;

    iget-object v0, v0, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v0

    iget v0, v0, Lj43/c;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    iget-object v0, v0, Lt23/c0;->g:Lt23/b4;

    iget-object v0, v0, Lt23/b4;->E:Ly33/c;

    iget-object v0, v0, Ly33/c;->h:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz33/b;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    iget-object v0, v0, Lt23/x1;->f:Lt23/a2;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    iget-object v1, v0, Lt23/c0;->g:Lt23/b4;

    iget-object v1, v1, Lt23/b4;->K:Lbi/p;

    iget-object v0, v0, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v0

    iget v0, v0, Lj43/c;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lt23/l;->x:Lt23/c0;

    invoke-virtual {v0}, Lt23/c0;->h()Lt23/x1;

    move-result-object v0

    iget-object v0, v0, Lt23/x1;->e:Lt23/e1;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
