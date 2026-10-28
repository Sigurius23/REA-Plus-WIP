.class public final Lxn/i;
.super Lrm/d;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final M:Landroid/os/Handler;

.field public final N:Lrm/r;

.field public final O:Lxn/g;

.field public final P:Lxl/a;

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:I

.field public U:Lrm/c0;

.field public V:Lxn/f;

.field public W:Lxn/h;

.field public X:Lxn/c;

.field public Y:Lxn/c;

.field public Z:I

.field public a0:J


# direct methods
.method public constructor <init>(Lrm/r;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lrm/d;-><init>(I)V

    iput-object p1, p0, Lxn/i;->N:Lrm/r;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget p1, Llo/y;->a:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    :goto_0
    iput-object p1, p0, Lxn/i;->M:Landroid/os/Handler;

    sget-object p1, Lxn/g;->a:Lxn/g;

    iput-object p1, p0, Lxn/i;->O:Lxn/g;

    new-instance p1, Lxl/a;

    const/16 p2, 0x1d

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lxl/a;-><init>(IZ)V

    iput-object p1, p0, Lxn/i;->P:Lxl/a;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lxn/i;->a0:J

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/exoplayer2/text/SubtitleDecoderException;)V
    .locals 7

    iget-object v0, p0, Lxn/i;->U:Lrm/c0;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x27

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lxn/i;->M:Landroid/os/Handler;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lxn/i;->N:Lrm/r;

    iget-object v2, v2, Lrm/r;->w:Lrm/u;

    iput-object p1, v2, Lrm/u;->E0:Ljava/util/List;

    iget-object v2, v2, Lrm/u;->M:Ld9/p;

    new-instance v3, Lb9/a0;

    invoke-direct {v3, p1, v0}, Lb9/a0;-><init>(Ljava/util/List;I)V

    const/16 p1, 0x1b

    invoke-virtual {v2, p1, v3}, Ld9/p;->i(ILlo/h;)V

    :goto_0
    invoke-virtual {p0}, Lxn/i;->B()V

    iget-object p1, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lum/b;->release()V

    const/4 p1, 0x0

    iput-object p1, p0, Lxn/i;->V:Lxn/f;

    iput v1, p0, Lxn/i;->T:I

    iput-boolean v0, p0, Lxn/i;->S:Z

    iget-object p1, p0, Lxn/i;->U:Lrm/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lxn/i;->O:Lxn/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p1, Lrm/c0;->L:Ljava/lang/String;

    iget v3, p1, Lrm/c0;->d0:I

    iget-object p1, p1, Lrm/c0;->N:Ljava/util/List;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x6

    const/4 v6, -0x1

    sparse-switch v4, :sswitch_data_0

    :goto_1
    move v0, v6

    goto/16 :goto_2

    :sswitch_0
    const-string v0, "application/ttml+xml"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0xb

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "application/x-subrip"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/16 v0, 0xa

    goto/16 :goto_2

    :sswitch_2
    const-string v0, "application/cea-708"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/16 v0, 0x9

    goto/16 :goto_2

    :sswitch_3
    const-string v0, "application/cea-608"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    const/16 v0, 0x8

    goto/16 :goto_2

    :sswitch_4
    const-string v0, "text/x-exoplayer-cues"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v0, 0x7

    goto :goto_2

    :sswitch_5
    const-string v0, "application/x-mp4-cea-608"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    move v0, v5

    goto :goto_2

    :sswitch_6
    const-string v0, "text/x-ssa"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    const/4 v0, 0x5

    goto :goto_2

    :sswitch_7
    const-string v0, "application/x-quicktime-tx3g"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_1

    :cond_8
    const/4 v0, 0x4

    goto :goto_2

    :sswitch_8
    const-string v0, "text/vtt"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    const/4 v0, 0x3

    goto :goto_2

    :sswitch_9
    const-string v0, "application/x-mp4-vtt"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_1

    :cond_a
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_a
    const-string v1, "application/pgs"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "application/dvbsubs"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_1

    :cond_b
    move v0, v1

    :cond_c
    :goto_2
    packed-switch v0, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    new-instance p1, Lfo/d;

    invoke-direct {p1}, Lfo/d;-><init>()V

    goto :goto_4

    :pswitch_1
    new-instance p1, Leo/a;

    invoke-direct {p1}, Leo/a;-><init>()V

    goto :goto_4

    :pswitch_2
    new-instance v0, Lyn/f;

    invoke-direct {v0, v3, p1}, Lyn/f;-><init>(ILjava/util/List;)V

    :goto_3
    move-object p1, v0

    goto :goto_4

    :pswitch_3
    new-instance p1, Le73/b;

    invoke-direct {p1, v5}, Le73/b;-><init>(I)V

    goto :goto_4

    :pswitch_4
    new-instance p1, Lyn/c;

    invoke-direct {p1, v2, v3}, Lyn/c;-><init>(Ljava/lang/String;I)V

    goto :goto_4

    :pswitch_5
    new-instance v0, Lco/a;

    invoke-direct {v0, p1}, Lco/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :pswitch_6
    new-instance v0, Lgo/a;

    invoke-direct {v0, p1}, Lgo/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :pswitch_7
    new-instance p1, Lho/j;

    invoke-direct {p1}, Lho/j;-><init>()V

    goto :goto_4

    :pswitch_8
    new-instance p1, Lho/a;

    invoke-direct {p1}, Lho/a;-><init>()V

    goto :goto_4

    :pswitch_9
    new-instance p1, Lao/b;

    invoke-direct {p1}, Lao/b;-><init>()V

    goto :goto_4

    :pswitch_a
    new-instance v0, Lho/a;

    invoke-direct {v0, p1}, Lho/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :goto_4
    iput-object p1, p0, Lxn/i;->V:Lxn/f;

    return-void

    :cond_d
    :goto_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "Attempted to create decoder for unsupported MIME type: "

    if-eqz v1, :cond_e

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_e
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final B()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lxn/i;->W:Lxn/h;

    const/4 v1, -0x1

    iput v1, p0, Lxn/i;->Z:I

    iget-object v1, p0, Lxn/i;->X:Lxn/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lxn/c;->o()V

    iput-object v0, p0, Lxn/i;->X:Lxn/c;

    :cond_0
    iget-object v1, p0, Lxn/i;->Y:Lxn/c;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lxn/c;->o()V

    iput-object v0, p0, Lxn/i;->Y:Lxn/c;

    :cond_1
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lxn/i;->N:Lrm/r;

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iput-object p1, v0, Lrm/u;->E0:Ljava/util/List;

    iget-object v0, v0, Lrm/u;->M:Ld9/p;

    new-instance v1, Lb9/a0;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lb9/a0;-><init>(Ljava/util/List;I)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Ld9/p;->i(ILlo/h;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lxn/i;->R:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l()V
    .locals 6

    const/4 v0, 0x0

    iput-object v0, p0, Lxn/i;->U:Lrm/c0;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lxn/i;->a0:J

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v2, 0x0

    iget-object v3, p0, Lxn/i;->M:Landroid/os/Handler;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lxn/i;->N:Lrm/r;

    iget-object v3, v3, Lrm/r;->w:Lrm/u;

    iput-object v1, v3, Lrm/u;->E0:Ljava/util/List;

    iget-object v3, v3, Lrm/u;->M:Ld9/p;

    new-instance v4, Lb9/a0;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lb9/a0;-><init>(Ljava/util/List;I)V

    const/16 v1, 0x1b

    invoke-virtual {v3, v1, v4}, Ld9/p;->i(ILlo/h;)V

    :goto_0
    invoke-virtual {p0}, Lxn/i;->B()V

    iget-object v1, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Lum/b;->release()V

    iput-object v0, p0, Lxn/i;->V:Lxn/f;

    iput v2, p0, Lxn/i;->T:I

    return-void
.end method

.method public final n(JZ)V
    .locals 5

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 p2, 0x1

    const/4 p3, 0x0

    iget-object v0, p0, Lxn/i;->M:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxn/i;->N:Lrm/r;

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iput-object p1, v0, Lrm/u;->E0:Ljava/util/List;

    iget-object v0, v0, Lrm/u;->M:Ld9/p;

    new-instance v1, Lb9/a0;

    invoke-direct {v1, p1, p2}, Lb9/a0;-><init>(Ljava/util/List;I)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Ld9/p;->i(ILlo/h;)V

    :goto_0
    iput-boolean p3, p0, Lxn/i;->Q:Z

    iput-boolean p3, p0, Lxn/i;->R:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lxn/i;->a0:J

    iget p1, p0, Lxn/i;->T:I

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Lxn/i;->B()V

    iget-object p1, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lum/b;->release()V

    const/4 p1, 0x0

    iput-object p1, p0, Lxn/i;->V:Lxn/f;

    iput p3, p0, Lxn/i;->T:I

    iput-boolean p2, p0, Lxn/i;->S:Z

    iget-object p1, p0, Lxn/i;->U:Lrm/c0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lxn/i;->O:Lxn/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lrm/c0;->L:Ljava/lang/String;

    iget v1, p1, Lrm/c0;->d0:I

    iget-object p1, p1, Lrm/c0;->N:Ljava/util/List;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x6

    const/4 v4, -0x1

    sparse-switch v2, :sswitch_data_0

    :goto_1
    move p2, v4

    goto/16 :goto_2

    :sswitch_0
    const-string p2, "application/ttml+xml"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const/16 p2, 0xb

    goto/16 :goto_2

    :sswitch_1
    const-string p2, "application/x-subrip"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    const/16 p2, 0xa

    goto/16 :goto_2

    :sswitch_2
    const-string p2, "application/cea-708"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    const/16 p2, 0x9

    goto/16 :goto_2

    :sswitch_3
    const-string p2, "application/cea-608"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    const/16 p2, 0x8

    goto/16 :goto_2

    :sswitch_4
    const-string p2, "text/x-exoplayer-cues"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    const/4 p2, 0x7

    goto :goto_2

    :sswitch_5
    const-string p2, "application/x-mp4-cea-608"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    move p2, v3

    goto :goto_2

    :sswitch_6
    const-string p2, "text/x-ssa"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_1

    :cond_7
    const/4 p2, 0x5

    goto :goto_2

    :sswitch_7
    const-string p2, "application/x-quicktime-tx3g"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_1

    :cond_8
    const/4 p2, 0x4

    goto :goto_2

    :sswitch_8
    const-string p2, "text/vtt"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_1

    :cond_9
    const/4 p2, 0x3

    goto :goto_2

    :sswitch_9
    const-string p2, "application/x-mp4-vtt"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_1

    :cond_a
    const/4 p2, 0x2

    goto :goto_2

    :sswitch_a
    const-string p3, "application/pgs"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_c

    goto/16 :goto_1

    :sswitch_b
    const-string p2, "application/dvbsubs"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto/16 :goto_1

    :cond_b
    move p2, p3

    :cond_c
    :goto_2
    packed-switch p2, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    new-instance p1, Lfo/d;

    invoke-direct {p1}, Lfo/d;-><init>()V

    goto :goto_4

    :pswitch_1
    new-instance p1, Leo/a;

    invoke-direct {p1}, Leo/a;-><init>()V

    goto :goto_4

    :pswitch_2
    new-instance p2, Lyn/f;

    invoke-direct {p2, v1, p1}, Lyn/f;-><init>(ILjava/util/List;)V

    :goto_3
    move-object p1, p2

    goto :goto_4

    :pswitch_3
    new-instance p1, Le73/b;

    invoke-direct {p1, v3}, Le73/b;-><init>(I)V

    goto :goto_4

    :pswitch_4
    new-instance p1, Lyn/c;

    invoke-direct {p1, v0, v1}, Lyn/c;-><init>(Ljava/lang/String;I)V

    goto :goto_4

    :pswitch_5
    new-instance p2, Lco/a;

    invoke-direct {p2, p1}, Lco/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :pswitch_6
    new-instance p2, Lgo/a;

    invoke-direct {p2, p1}, Lgo/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :pswitch_7
    new-instance p1, Lho/j;

    invoke-direct {p1}, Lho/j;-><init>()V

    goto :goto_4

    :pswitch_8
    new-instance p1, Lho/a;

    invoke-direct {p1}, Lho/a;-><init>()V

    goto :goto_4

    :pswitch_9
    new-instance p1, Lao/b;

    invoke-direct {p1}, Lao/b;-><init>()V

    goto :goto_4

    :pswitch_a
    new-instance p2, Lho/a;

    invoke-direct {p2, p1}, Lho/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :goto_4
    iput-object p1, p0, Lxn/i;->V:Lxn/f;

    return-void

    :cond_d
    :goto_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    const-string v0, "Attempted to create decoder for unsupported MIME type: "

    if-eqz p3, :cond_e

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_6

    :cond_e
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-virtual {p0}, Lxn/i;->B()V

    iget-object p1, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lum/b;->flush()V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r([Lrm/c0;JJ)V
    .locals 3

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Lxn/i;->U:Lrm/c0;

    iget-object p3, p0, Lxn/i;->V:Lxn/f;

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iput p4, p0, Lxn/i;->T:I

    return-void

    :cond_0
    iput-boolean p4, p0, Lxn/i;->S:Z

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p0, Lxn/i;->O:Lxn/g;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p1, Lrm/c0;->L:Ljava/lang/String;

    iget p5, p1, Lrm/c0;->d0:I

    iget-object p1, p1, Lrm/c0;->N:Ljava/util/List;

    if-eqz p3, :cond_d

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x6

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    :goto_0
    move p2, v2

    goto/16 :goto_1

    :sswitch_0
    const-string p2, "application/ttml+xml"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/16 p2, 0xb

    goto/16 :goto_1

    :sswitch_1
    const-string p2, "application/x-subrip"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/16 p2, 0xa

    goto/16 :goto_1

    :sswitch_2
    const-string p2, "application/cea-708"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/16 p2, 0x9

    goto/16 :goto_1

    :sswitch_3
    const-string p2, "application/cea-608"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    const/16 p2, 0x8

    goto/16 :goto_1

    :sswitch_4
    const-string p2, "text/x-exoplayer-cues"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    const/4 p2, 0x7

    goto :goto_1

    :sswitch_5
    const-string p2, "application/x-mp4-cea-608"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_6
    move p2, v1

    goto :goto_1

    :sswitch_6
    const-string p2, "text/x-ssa"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_0

    :cond_7
    const/4 p2, 0x5

    goto :goto_1

    :sswitch_7
    const-string p2, "application/x-quicktime-tx3g"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_0

    :cond_8
    const/4 p2, 0x4

    goto :goto_1

    :sswitch_8
    const-string p2, "text/vtt"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_0

    :cond_9
    const/4 p2, 0x3

    goto :goto_1

    :sswitch_9
    const-string p2, "application/x-mp4-vtt"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_0

    :cond_a
    const/4 p2, 0x2

    goto :goto_1

    :sswitch_a
    const-string p2, "application/pgs"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto/16 :goto_0

    :cond_b
    move p2, p4

    goto :goto_1

    :sswitch_b
    const-string p4, "application/dvbsubs"

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_c

    goto/16 :goto_0

    :cond_c
    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    new-instance p1, Lfo/d;

    invoke-direct {p1}, Lfo/d;-><init>()V

    goto :goto_3

    :pswitch_1
    new-instance p1, Leo/a;

    invoke-direct {p1}, Leo/a;-><init>()V

    goto :goto_3

    :pswitch_2
    new-instance p2, Lyn/f;

    invoke-direct {p2, p5, p1}, Lyn/f;-><init>(ILjava/util/List;)V

    :goto_2
    move-object p1, p2

    goto :goto_3

    :pswitch_3
    new-instance p1, Le73/b;

    invoke-direct {p1, v1}, Le73/b;-><init>(I)V

    goto :goto_3

    :pswitch_4
    new-instance p1, Lyn/c;

    invoke-direct {p1, p3, p5}, Lyn/c;-><init>(Ljava/lang/String;I)V

    goto :goto_3

    :pswitch_5
    new-instance p2, Lco/a;

    invoke-direct {p2, p1}, Lco/a;-><init>(Ljava/util/List;)V

    goto :goto_2

    :pswitch_6
    new-instance p2, Lgo/a;

    invoke-direct {p2, p1}, Lgo/a;-><init>(Ljava/util/List;)V

    goto :goto_2

    :pswitch_7
    new-instance p1, Lho/j;

    invoke-direct {p1}, Lho/j;-><init>()V

    goto :goto_3

    :pswitch_8
    new-instance p1, Lho/a;

    invoke-direct {p1}, Lho/a;-><init>()V

    goto :goto_3

    :pswitch_9
    new-instance p1, Lao/b;

    invoke-direct {p1}, Lao/b;-><init>()V

    goto :goto_3

    :pswitch_a
    new-instance p2, Lho/a;

    invoke-direct {p2, p1}, Lho/a;-><init>(Ljava/util/List;)V

    goto :goto_2

    :goto_3
    iput-object p1, p0, Lxn/i;->V:Lxn/f;

    return-void

    :cond_d
    :goto_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    const-string p4, "Attempted to create decoder for unsupported MIME type: "

    if-eqz p3, :cond_e

    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_5

    :cond_e
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_5
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(JJ)V
    .locals 11

    iget-object p3, p0, Lxn/i;->P:Lxl/a;

    iget-boolean p4, p0, Lrm/d;->K:Z

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    iget-wide v1, p0, Lxn/i;->a0:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p4, v1, v3

    if-eqz p4, :cond_0

    cmp-long p4, p1, v1

    if-ltz p4, :cond_0

    invoke-virtual {p0}, Lxn/i;->B()V

    iput-boolean v0, p0, Lxn/i;->R:Z

    :cond_0
    iget-boolean p4, p0, Lxn/i;->R:Z

    if-eqz p4, :cond_1

    goto/16 :goto_c

    :cond_1
    iget-object p4, p0, Lxn/i;->Y:Lxn/c;

    if-nez p4, :cond_2

    iget-object p4, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p4, p1, p2}, Lxn/f;->a(J)V

    :try_start_0
    iget-object p4, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p4}, Lum/b;->b()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lxn/c;

    iput-object p4, p0, Lxn/i;->Y:Lxn/c;
    :try_end_0
    .catch Lcom/google/android/exoplayer2/text/SubtitleDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxn/i;->A(Lcom/google/android/exoplayer2/text/SubtitleDecoderException;)V

    return-void

    :cond_2
    :goto_0
    iget p4, p0, Lrm/d;->F:I

    const/4 v1, 0x2

    if-eq p4, v1, :cond_3

    goto/16 :goto_c

    :cond_3
    iget-object p4, p0, Lxn/i;->X:Lxn/c;

    const/4 v2, 0x0

    if-eqz p4, :cond_4

    invoke-virtual {p0}, Lxn/i;->z()J

    move-result-wide v3

    move p4, v2

    :goto_1
    cmp-long v3, v3, p1

    if-gtz v3, :cond_5

    iget p4, p0, Lxn/i;->Z:I

    add-int/2addr p4, v0

    iput p4, p0, Lxn/i;->Z:I

    invoke-virtual {p0}, Lxn/i;->z()J

    move-result-wide v3

    move p4, v0

    goto :goto_1

    :cond_4
    move p4, v2

    :cond_5
    iget-object v3, p0, Lxn/i;->Y:Lxn/c;

    const/4 v4, 0x0

    const/4 v5, 0x4

    if-eqz v3, :cond_17

    invoke-virtual {v3, v5}, La9/a;->f(I)Z

    move-result v6

    if-eqz v6, :cond_15

    if-nez p4, :cond_17

    invoke-virtual {p0}, Lxn/i;->z()J

    move-result-wide v6

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v3, v6, v8

    if-nez v3, :cond_17

    iget v3, p0, Lxn/i;->T:I

    if-ne v3, v1, :cond_14

    invoke-virtual {p0}, Lxn/i;->B()V

    iget-object v3, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Lum/b;->release()V

    iput-object v4, p0, Lxn/i;->V:Lxn/f;

    iput v2, p0, Lxn/i;->T:I

    iput-boolean v0, p0, Lxn/i;->S:Z

    iget-object v3, p0, Lxn/i;->U:Lrm/c0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, p0, Lxn/i;->O:Lxn/g;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v3, Lrm/c0;->L:Ljava/lang/String;

    iget v7, v3, Lrm/c0;->d0:I

    iget-object v3, v3, Lrm/c0;->N:Ljava/util/List;

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v9, 0x6

    const/4 v10, -0x1

    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v8, "application/ttml+xml"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_2

    :cond_6
    const/16 v10, 0xb

    goto/16 :goto_2

    :sswitch_1
    const-string v8, "application/x-subrip"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto/16 :goto_2

    :cond_7
    const/16 v10, 0xa

    goto/16 :goto_2

    :sswitch_2
    const-string v8, "application/cea-708"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_2

    :cond_8
    const/16 v10, 0x9

    goto/16 :goto_2

    :sswitch_3
    const-string v8, "application/cea-608"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto/16 :goto_2

    :cond_9
    const/16 v10, 0x8

    goto/16 :goto_2

    :sswitch_4
    const-string v8, "text/x-exoplayer-cues"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_2

    :cond_a
    const/4 v10, 0x7

    goto :goto_2

    :sswitch_5
    const-string v8, "application/x-mp4-cea-608"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_2

    :cond_b
    move v10, v9

    goto :goto_2

    :sswitch_6
    const-string v8, "text/x-ssa"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_2

    :cond_c
    const/4 v10, 0x5

    goto :goto_2

    :sswitch_7
    const-string v8, "application/x-quicktime-tx3g"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_2

    :cond_d
    move v10, v5

    goto :goto_2

    :sswitch_8
    const-string v8, "text/vtt"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto :goto_2

    :cond_e
    const/4 v10, 0x3

    goto :goto_2

    :sswitch_9
    const-string v8, "application/x-mp4-vtt"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_2

    :cond_f
    move v10, v1

    goto :goto_2

    :sswitch_a
    const-string v8, "application/pgs"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_2

    :cond_10
    move v10, v0

    goto :goto_2

    :sswitch_b
    const-string v8, "application/dvbsubs"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_2

    :cond_11
    move v10, v2

    :goto_2
    packed-switch v10, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    new-instance v3, Lfo/d;

    invoke-direct {v3}, Lfo/d;-><init>()V

    goto :goto_4

    :pswitch_1
    new-instance v3, Leo/a;

    invoke-direct {v3}, Leo/a;-><init>()V

    goto :goto_4

    :pswitch_2
    new-instance v6, Lyn/f;

    invoke-direct {v6, v7, v3}, Lyn/f;-><init>(ILjava/util/List;)V

    :goto_3
    move-object v3, v6

    goto :goto_4

    :pswitch_3
    new-instance v3, Le73/b;

    invoke-direct {v3, v9}, Le73/b;-><init>(I)V

    goto :goto_4

    :pswitch_4
    new-instance v3, Lyn/c;

    invoke-direct {v3, v6, v7}, Lyn/c;-><init>(Ljava/lang/String;I)V

    goto :goto_4

    :pswitch_5
    new-instance v6, Lco/a;

    invoke-direct {v6, v3}, Lco/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :pswitch_6
    new-instance v6, Lgo/a;

    invoke-direct {v6, v3}, Lgo/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :pswitch_7
    new-instance v3, Lho/j;

    invoke-direct {v3}, Lho/j;-><init>()V

    goto :goto_4

    :pswitch_8
    new-instance v3, Lho/a;

    invoke-direct {v3}, Lho/a;-><init>()V

    goto :goto_4

    :pswitch_9
    new-instance v3, Lao/b;

    invoke-direct {v3}, Lao/b;-><init>()V

    goto :goto_4

    :pswitch_a
    new-instance v6, Lho/a;

    invoke-direct {v6, v3}, Lho/a;-><init>(Ljava/util/List;)V

    goto :goto_3

    :goto_4
    iput-object v3, p0, Lxn/i;->V:Lxn/f;

    goto :goto_7

    :cond_12
    :goto_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    const-string p4, "Attempted to create decoder for unsupported MIME type: "

    if-eqz p3, :cond_13

    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_6

    :cond_13
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-virtual {p0}, Lxn/i;->B()V

    iput-boolean v0, p0, Lxn/i;->R:Z

    goto :goto_7

    :cond_15
    iget-wide v6, v3, Lxn/c;->y:J

    cmp-long v6, v6, p1

    if-gtz v6, :cond_17

    iget-object p4, p0, Lxn/i;->X:Lxn/c;

    if-eqz p4, :cond_16

    invoke-virtual {p4}, Lxn/c;->o()V

    :cond_16
    invoke-virtual {v3, p1, p2}, Lxn/c;->b(J)I

    move-result p4

    iput p4, p0, Lxn/i;->Z:I

    iput-object v3, p0, Lxn/i;->X:Lxn/c;

    iput-object v4, p0, Lxn/i;->Y:Lxn/c;

    move p4, v0

    :cond_17
    :goto_7
    if-eqz p4, :cond_19

    iget-object p4, p0, Lxn/i;->X:Lxn/c;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, p0, Lxn/i;->X:Lxn/c;

    invoke-virtual {p4, p1, p2}, Lxn/c;->d(J)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lxn/i;->M:Landroid/os/Handler;

    if-eqz p2, :cond_18

    invoke-virtual {p2, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_8

    :cond_18
    iget-object p2, p0, Lxn/i;->N:Lrm/r;

    iget-object p2, p2, Lrm/r;->w:Lrm/u;

    iput-object p1, p2, Lrm/u;->E0:Ljava/util/List;

    iget-object p2, p2, Lrm/u;->M:Ld9/p;

    new-instance p4, Lb9/a0;

    invoke-direct {p4, p1, v0}, Lb9/a0;-><init>(Ljava/util/List;I)V

    const/16 p1, 0x1b

    invoke-virtual {p2, p1, p4}, Ld9/p;->i(ILlo/h;)V

    :cond_19
    :goto_8
    iget p1, p0, Lxn/i;->T:I

    if-ne p1, v1, :cond_1a

    goto/16 :goto_c

    :cond_1a
    :goto_9
    :try_start_1
    iget-boolean p1, p0, Lxn/i;->Q:Z

    if-nez p1, :cond_21

    iget-object p1, p0, Lxn/i;->W:Lxn/h;

    if-nez p1, :cond_1c

    iget-object p1, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lum/b;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxn/h;

    if-nez p1, :cond_1b

    goto :goto_c

    :cond_1b
    iput-object p1, p0, Lxn/i;->W:Lxn/h;

    goto :goto_a

    :catch_1
    move-exception p1

    goto :goto_d

    :cond_1c
    :goto_a
    iget p2, p0, Lxn/i;->T:I

    if-ne p2, v0, :cond_1d

    iput v5, p1, La9/a;->x:I

    iget-object p2, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2, p1}, Lum/b;->d(Lxn/h;)V

    iput-object v4, p0, Lxn/i;->W:Lxn/h;

    iput v1, p0, Lxn/i;->T:I

    return-void

    :cond_1d
    invoke-virtual {p0, p3, p1, v2}, Lrm/d;->s(Lxl/a;Lum/c;I)I

    move-result p2

    const/4 p4, -0x4

    if-ne p2, p4, :cond_20

    invoke-virtual {p1, v5}, La9/a;->f(I)Z

    move-result p2

    if-eqz p2, :cond_1e

    iput-boolean v0, p0, Lxn/i;->Q:Z

    iput-boolean v2, p0, Lxn/i;->S:Z

    goto :goto_b

    :cond_1e
    iget-object p2, p3, Lxl/a;->y:Ljava/lang/Object;

    check-cast p2, Lrm/c0;

    if-nez p2, :cond_1f

    goto :goto_c

    :cond_1f
    iget-wide v6, p2, Lrm/c0;->P:J

    iput-wide v6, p1, Lxn/h;->I:J

    invoke-virtual {p1}, Lum/c;->r()V

    iget-boolean p2, p0, Lxn/i;->S:Z

    invoke-virtual {p1, v0}, La9/a;->f(I)Z

    move-result p4

    xor-int/2addr p4, v0

    and-int/2addr p2, p4

    iput-boolean p2, p0, Lxn/i;->S:Z

    :goto_b
    iget-boolean p2, p0, Lxn/i;->S:Z

    if-nez p2, :cond_1a

    iget-object p2, p0, Lxn/i;->V:Lxn/f;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2, p1}, Lum/b;->d(Lxn/h;)V

    iput-object v4, p0, Lxn/i;->W:Lxn/h;
    :try_end_1
    .catch Lcom/google/android/exoplayer2/text/SubtitleDecoderException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :cond_20
    const/4 p1, -0x3

    if-ne p2, p1, :cond_1a

    :cond_21
    :goto_c
    return-void

    :goto_d
    invoke-virtual {p0, p1}, Lxn/i;->A(Lcom/google/android/exoplayer2/text/SubtitleDecoderException;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_b
        -0x4a6813e3 -> :sswitch_a
        -0x3d28a9ba -> :sswitch_9
        -0x3be2f26c -> :sswitch_8
        0x2935f49f -> :sswitch_7
        0x310bebca -> :sswitch_6
        0x37713300 -> :sswitch_5
        0x47a1c707 -> :sswitch_4
        0x5d578071 -> :sswitch_3
        0x5d578432 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x(Lrm/c0;)I
    .locals 3

    iget-object v0, p0, Lxn/i;->O:Lxn/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lrm/c0;->L:Ljava/lang/String;

    const-string v1, "text/vtt"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const-string v1, "text/x-ssa"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/ttml+xml"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/x-mp4-vtt"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/x-subrip"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/x-quicktime-tx3g"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/x-mp4-cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/cea-708"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/dvbsubs"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "application/pgs"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "text/x-exoplayer-cues"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {p1}, Llo/m;->i(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-static {p1, v2, v2}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v2, v2, v2}, Lrm/d;->d(III)I

    move-result p1

    return p1

    :cond_2
    :goto_0
    iget p1, p1, Lrm/c0;->e0:I

    if-nez p1, :cond_3

    const/4 p1, 0x4

    goto :goto_1

    :cond_3
    const/4 p1, 0x2

    :goto_1
    invoke-static {p1, v2, v2}, Lrm/d;->d(III)I

    move-result p1

    return p1
.end method

.method public final z()J
    .locals 4

    iget v0, p0, Lxn/i;->Z:I

    const/4 v1, -0x1

    const-wide v2, 0x7fffffffffffffffL

    if-ne v0, v1, :cond_0

    return-wide v2

    :cond_0
    iget-object v0, p0, Lxn/i;->X:Lxn/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxn/i;->Z:I

    iget-object v1, p0, Lxn/i;->X:Lxn/c;

    invoke-virtual {v1}, Lxn/c;->j()I

    move-result v1

    if-lt v0, v1, :cond_1

    return-wide v2

    :cond_1
    iget-object v0, p0, Lxn/i;->X:Lxn/c;

    iget v1, p0, Lxn/i;->Z:I

    invoke-virtual {v0, v1}, Lxn/c;->h(I)J

    move-result-wide v0

    return-wide v0
.end method
