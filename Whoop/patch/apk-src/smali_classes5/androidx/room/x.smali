.class public final Landroidx/room/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/room/x;->w:I

    iput-object p2, p0, Landroidx/room/x;->x:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/x;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/b0;Lec3/m;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Landroidx/room/x;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/x;->y:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/room/x;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(ILq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lec3/c2;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lec3/c2;

    iget v1, v0, Lec3/c2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/c2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lec3/c2;

    invoke-direct {v0, p0, p2}, Lec3/c2;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lec3/c2;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/c2;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-lez p1, :cond_3

    iget-object p1, p0, Landroidx/room/x;->y:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/b0;

    iget-boolean p2, p1, Lkotlin/jvm/internal/b0;->w:Z

    if-nez p2, :cond_3

    iput-boolean v4, p1, Lkotlin/jvm/internal/b0;->w:Z

    iget-object p1, p0, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    sget-object p2, Lec3/y1;->w:Lec3/y1;

    iput v4, v0, Lec3/c2;->y:I

    invoke-interface {p1, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object v3
.end method

.method public c(Lh20/n0;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lh20/h0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/h0;

    iget v1, v0, Lh20/h0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/h0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/h0;

    invoke-direct {v0, p0, p2}, Lh20/h0;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh20/h0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/h0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh20/h0;->w:Landroidx/room/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    const-string v2, "result"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p1, Lh20/n0;->w:I

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    new-instance v5, Ll83/k;

    const-string v6, "extra_activity_result"

    invoke-direct {v5, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Landroidx/room/x;->y:Ljava/lang/Object;

    check-cast p1, Lh40/k;

    iput-object p0, v0, Lh20/h0;->w:Landroidx/room/x;

    iput v3, v0, Lh20/h0;->z:I

    invoke-virtual {p1, v0}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    iget-object p2, p1, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;->p()Lh20/w0;

    move-result-object p2

    iget-object p2, p2, Le30/c;->M:Lr20/d;

    iget-object p2, p2, Lr20/d;->f:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/io/Closeable;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_2

    :cond_5
    iget-object p1, p1, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;

    invoke-virtual {p1}, Lb30/j;->finish()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public e(Lh20/b4;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lh20/t3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/t3;

    iget v1, v0, Lh20/t3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/t3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/t3;

    invoke-direct {v0, p0, p2}, Lh20/t3;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh20/t3;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/t3;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh20/t3;->w:Landroidx/room/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    invoke-virtual {p2, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->r(Lh20/b4;)V

    iget-object p1, p0, Landroidx/room/x;->y:Ljava/lang/Object;

    check-cast p1, Lh40/k;

    iput-object p0, v0, Lh20/t3;->w:Landroidx/room/x;

    iput v3, v0, Lh20/t3;->z:I

    invoke-virtual {p1, v0}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    iget-object p2, p1, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;->p()Lh20/k4;

    move-result-object p2

    iget-object p2, p2, Le30/c;->M:Lr20/d;

    iget-object p2, p2, Lr20/d;->f:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/io/Closeable;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    goto :goto_2

    :cond_5
    iget-object p1, p1, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheetActivity;

    invoke-virtual {p1}, Lb30/j;->finish()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Landroidx/room/x;->w:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    const/high16 v9, -0x80000000

    const/4 v10, 0x1

    iget-object v11, v0, Landroidx/room/x;->y:Ljava/lang/Object;

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    iget-object v13, v0, Landroidx/room/x;->x:Ljava/lang/Object;

    packed-switch v3, :pswitch_data_0

    check-cast v11, Lxz/x;

    instance-of v3, v2, Lxz/u;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lxz/u;

    iget v4, v3, Lxz/u;->x:I

    and-int v14, v4, v9

    if-eqz v14, :cond_0

    sub-int/2addr v4, v9

    iput v4, v3, Lxz/u;->x:I

    goto :goto_0

    :cond_0
    new-instance v3, Lxz/u;

    invoke-direct {v3, v0, v2}, Lxz/u;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lxz/u;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v9, v3, Lxz/u;->x:I

    if-eqz v9, :cond_3

    if-eq v9, v10, :cond_2

    if-ne v9, v5, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lxz/u;->y:Lec3/m;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v13

    check-cast v2, Lec3/m;

    check-cast v1, Lwz/d;

    iget-object v8, v1, Lwz/d;->x:Lwz/c;

    sget-object v9, Lwz/c;->w:Lwz/c;

    if-ne v8, v9, :cond_4

    iget-object v8, v11, Lxz/x;->b:Lwz/g0;

    iget-boolean v8, v8, Lwz/g0;->X:Z

    if-nez v8, :cond_5

    :cond_4
    move v6, v10

    :cond_5
    iget-object v1, v1, Lwz/d;->w:Ld00/l;

    iput-object v2, v3, Lxz/u;->y:Lec3/m;

    iput v10, v3, Lxz/u;->x:I

    invoke-virtual {v11, v1, v6, v3}, Lxz/x;->f(Ld00/l;ZLs83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    goto :goto_2

    :cond_6
    move-object/from16 v17, v2

    move-object v2, v1

    move-object/from16 v1, v17

    :goto_1
    iput-object v7, v3, Lxz/u;->y:Lec3/m;

    iput v5, v3, Lxz/u;->x:I

    invoke-interface {v1, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    :goto_2
    move-object v12, v4

    :cond_7
    :goto_3
    return-object v12

    :pswitch_0
    check-cast v1, Lwz/q;

    invoke-virtual {v0, v1, v2}, Landroidx/room/x;->f(Lwz/q;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v11, Le33/u;

    instance-of v3, v2, Lw23/m;

    if-eqz v3, :cond_8

    move-object v3, v2

    check-cast v3, Lw23/m;

    iget v4, v3, Lw23/m;->x:I

    and-int v5, v4, v9

    if-eqz v5, :cond_8

    sub-int/2addr v4, v9

    iput v4, v3, Lw23/m;->x:I

    goto :goto_4

    :cond_8
    new-instance v3, Lw23/m;

    invoke-direct {v3, v0, v2}, Lw23/m;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_4
    iget-object v2, v3, Lw23/m;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lw23/m;->x:I

    if-eqz v5, :cond_a

    if-ne v5, v10, :cond_9

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lec3/m;

    check-cast v1, Lorg/webrtc/PeerConnection$PeerConnectionState;

    new-instance v2, Lw23/s;

    invoke-virtual {v11}, Ljava/lang/Object;->hashCode()I

    move-result v5

    iget-object v6, v11, Le33/u;->s:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/webrtc/PeerConnection$IceConnectionState;

    invoke-static {v6}, Lw23/v;->a(Lorg/webrtc/PeerConnection$IceConnectionState;)Lw23/t;

    move-result-object v6

    invoke-direct {v2, v5, v1, v6}, Lw23/s;-><init>(ILorg/webrtc/PeerConnection$PeerConnectionState;Lw23/t;)V

    iput v10, v3, Lw23/m;->x:I

    invoke-interface {v13, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_b

    move-object v12, v4

    :cond_b
    :goto_5
    return-object v12

    :pswitch_2
    instance-of v3, v2, Lw23/k;

    if-eqz v3, :cond_c

    move-object v3, v2

    check-cast v3, Lw23/k;

    iget v4, v3, Lw23/k;->x:I

    and-int v5, v4, v9

    if-eqz v5, :cond_c

    sub-int/2addr v4, v9

    iput v4, v3, Lw23/k;->x:I

    goto :goto_6

    :cond_c
    new-instance v3, Lw23/k;

    invoke-direct {v3, v0, v2}, Lw23/k;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_6
    iget-object v2, v3, Lw23/k;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lw23/k;->x:I

    if-eqz v5, :cond_e

    if-ne v5, v10, :cond_d

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lec3/m;

    move-object v2, v1

    check-cast v2, Lorg/webrtc/PeerConnection$PeerConnectionState;

    check-cast v11, Lw23/p;

    iget-object v5, v11, Lw23/p;->h:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5, v2}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    iput v10, v3, Lw23/k;->x:I

    invoke-interface {v13, v1, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_f

    move-object v12, v4

    :cond_f
    :goto_7
    return-object v12

    :pswitch_3
    instance-of v3, v2, Lw23/c;

    if-eqz v3, :cond_10

    move-object v3, v2

    check-cast v3, Lw23/c;

    iget v4, v3, Lw23/c;->x:I

    and-int v5, v4, v9

    if-eqz v5, :cond_10

    sub-int/2addr v4, v9

    iput v4, v3, Lw23/c;->x:I

    goto :goto_8

    :cond_10
    new-instance v3, Lw23/c;

    invoke-direct {v3, v0, v2}, Lw23/c;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_8
    iget-object v2, v3, Lw23/c;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lw23/c;->x:I

    if-eqz v5, :cond_12

    if-ne v5, v10, :cond_11

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_11
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lec3/m;

    check-cast v1, Lorg/webrtc/PeerConnection$PeerConnectionState;

    check-cast v11, Le33/v0;

    iput v10, v3, Lw23/c;->x:I

    invoke-interface {v13, v11, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_13

    move-object v12, v4

    :cond_13
    :goto_9
    return-object v12

    :pswitch_4
    check-cast v1, Ljava/lang/Boolean;

    check-cast v13, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v13, v1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->p(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Z)V

    invoke-virtual {v13}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->finish()V

    check-cast v11, Lp1/c1;

    invoke-interface {v11, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v12

    :pswitch_5
    check-cast v1, Lj0/h;

    check-cast v11, Lu0/t0;

    check-cast v13, La0/q0;

    instance-of v2, v1, Lj0/f;

    if-nez v2, :cond_18

    instance-of v2, v1, Lj0/d;

    if-nez v2, :cond_18

    instance-of v2, v1, Lj0/l;

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    instance-of v2, v1, Lj0/g;

    if-eqz v2, :cond_15

    check-cast v1, Lj0/g;

    iget-object v1, v1, Lj0/g;->a:Lj0/f;

    invoke-virtual {v13, v1}, La0/q0;->i(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    instance-of v2, v1, Lj0/e;

    if-eqz v2, :cond_16

    check-cast v1, Lj0/e;

    iget-object v1, v1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v13, v1}, La0/q0;->i(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_16
    instance-of v2, v1, Lj0/m;

    if-eqz v2, :cond_17

    check-cast v1, Lj0/m;

    iget-object v1, v1, Lj0/m;->a:Lj0/l;

    invoke-virtual {v13, v1}, La0/q0;->i(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_17
    instance-of v2, v1, Lj0/k;

    if-eqz v2, :cond_19

    check-cast v1, Lj0/k;

    iget-object v1, v1, Lj0/k;->a:Lj0/l;

    invoke-virtual {v13, v1}, La0/q0;->i(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_18
    :goto_a
    invoke-virtual {v13, v1}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_19
    :goto_b
    iget-object v1, v13, La0/q0;->a:[Ljava/lang/Object;

    iget v2, v13, La0/q0;->b:I

    move v3, v6

    :goto_c
    if-ge v6, v2, :cond_1d

    aget-object v4, v1, v6

    check-cast v4, Lj0/h;

    instance-of v5, v4, Lj0/f;

    if-eqz v5, :cond_1a

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 v3, v3, 0x2

    goto :goto_d

    :cond_1a
    instance-of v5, v4, Lj0/d;

    if-eqz v5, :cond_1b

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_1b
    instance-of v4, v4, Lj0/l;

    if-eqz v4, :cond_1c

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    or-int/lit8 v3, v3, 0x4

    :cond_1c
    :goto_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_c

    :cond_1d
    iget-object v1, v11, Lu0/t0;->b:Lp1/h1;

    invoke-virtual {v1, v3}, Lp1/h1;->y(I)V

    return-object v12

    :pswitch_6
    check-cast v1, Ljava/util/Map;

    check-cast v13, Lt23/s0;

    invoke-virtual {v13}, Lt23/s0;->b()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->x:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_20

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lt23/g2;

    iget-object v9, v9, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {v9}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt23/g2;

    iget-object v8, v8, Lt23/g2;->K:Lec3/r1;

    iget-object v8, v8, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v8}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt23/d2;

    if-eqz v8, :cond_1e

    iget-boolean v8, v8, Lt23/d2;->c:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    goto :goto_f

    :cond_1e
    move-object v8, v7

    :goto_f
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " - "

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_1f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v8, "[livestreamFlow] #track; participants: "

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " =>"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v4, v5, v1, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_20
    check-cast v11, Ldc3/u;

    invoke-static {v13, v11}, Lt23/k0;->f(Lt23/s0;Ldc3/u;)V

    return-object v12

    :pswitch_7
    instance-of v3, v2, Lt23/u;

    if-eqz v3, :cond_21

    move-object v3, v2

    check-cast v3, Lt23/u;

    iget v4, v3, Lt23/u;->x:I

    and-int v5, v4, v9

    if-eqz v5, :cond_21

    sub-int/2addr v4, v9

    iput v4, v3, Lt23/u;->x:I

    goto :goto_10

    :cond_21
    new-instance v3, Lt23/u;

    invoke-direct {v3, v0, v2}, Lt23/u;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_10
    iget-object v2, v3, Lt23/u;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lt23/u;->x:I

    if-eqz v5, :cond_23

    if-ne v5, v10, :cond_22

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_11

    :cond_22
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lec3/m;

    check-cast v1, Lorg/webrtc/PeerConnection$IceConnectionState;

    check-cast v11, Le33/n;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v11, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput v10, v3, Lt23/u;->x:I

    invoke-interface {v13, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_24

    move-object v12, v4

    :cond_24
    :goto_11
    return-object v12

    :pswitch_8
    check-cast v1, Lcom/google/android/gms/tasks/Task;

    if-eqz v1, :cond_25

    check-cast v13, Lj/d;

    invoke-virtual {v13, v1, v7}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    check-cast v11, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    sget v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->z:I

    invoke-virtual {v11}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->p()Lsz/z;

    move-result-object v1

    iget-object v2, v1, Lsz/z;->H:Landroidx/lifecycle/k1;

    const-string v3, "has_launched"

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v4, v3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lsz/z;->M:Lec3/w1;

    invoke-virtual {v1, v7}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_25
    return-object v12

    :pswitch_9
    check-cast v1, Lcom/mapbox/geojson/Point;

    check-cast v13, Lrv/m;

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v1}, [Lcom/mapbox/geojson/Point;

    move-result-object v1

    check-cast v11, Lm63/d;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v13, Lrv/m;->y:Lrv/r;

    if-eqz v2, :cond_26

    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/mapbox/geojson/Point;

    invoke-virtual {v2, v1}, Lrv/r;->e([Lcom/mapbox/geojson/Point;)V

    :cond_26
    return-object v12

    :pswitch_a
    check-cast v1, Lt23/d3;

    check-cast v13, La00/g;

    iget-object v2, v13, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->z:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_27

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "Ringing state: "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v5, v6, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_27
    iget-object v2, v13, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Lt23/b4;

    iget-object v3, v13, La00/g;->y:Ljava/lang/Object;

    check-cast v3, La30/w0;

    check-cast v11, Lj43/b;

    instance-of v5, v1, Lt23/z2;

    if-eqz v5, :cond_29

    check-cast v1, Lt23/z2;

    iget-boolean v1, v1, Lt23/z2;->a:Z

    if-nez v1, :cond_28

    iget-object v1, v2, Lt23/b4;->M:Lk53/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_30

    iget-object v1, v2, Lt23/b4;->L:Lk53/c;

    iget-object v1, v1, Lk53/c;->a:Ld1/j;

    iget-object v1, v1, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v3, v1}, La30/w0;->E(Landroid/net/Uri;)V

    goto :goto_12

    :cond_28
    if-eqz v3, :cond_30

    invoke-virtual {v3}, La30/w0;->I()V

    goto :goto_12

    :cond_29
    instance-of v5, v1, Lt23/a3;

    if-eqz v5, :cond_2b

    check-cast v1, Lt23/a3;

    iget-boolean v1, v1, Lt23/a3;->a:Z

    if-nez v1, :cond_2a

    if-eqz v3, :cond_30

    iget-object v1, v2, Lt23/b4;->L:Lk53/c;

    iget-object v1, v1, Lk53/c;->a:Ld1/j;

    iget-object v1, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v3, v1}, La30/w0;->E(Landroid/net/Uri;)V

    goto :goto_12

    :cond_2a
    if-eqz v3, :cond_30

    invoke-virtual {v3}, La30/w0;->I()V

    goto :goto_12

    :cond_2b
    instance-of v5, v1, Lt23/x2;

    if-eqz v5, :cond_2c

    if-eqz v3, :cond_30

    invoke-virtual {v3}, La30/w0;->I()V

    goto :goto_12

    :cond_2c
    instance-of v5, v1, Lt23/b3;

    if-eqz v5, :cond_2e

    iget-object v1, v2, Lt23/b4;->x:Lbc3/c0;

    new-instance v2, Lkd/f;

    const/16 v5, 0xd

    invoke-direct {v2, v13, v7, v5}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v7, v7, v2, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    if-eqz v3, :cond_2d

    invoke-virtual {v3}, La30/w0;->I()V

    :cond_2d
    invoke-virtual {v11}, Lj43/b;->invoke()Ljava/lang/Object;

    goto :goto_12

    :cond_2e
    instance-of v1, v1, Lt23/c3;

    if-eqz v1, :cond_2f

    if-eqz v3, :cond_30

    invoke-virtual {v3}, La30/w0;->I()V

    goto :goto_12

    :cond_2f
    if-eqz v3, :cond_30

    invoke-virtual {v3}, La30/w0;->I()V

    :cond_30
    :goto_12
    return-object v12

    :pswitch_b
    instance-of v3, v2, Ln00/h;

    if-eqz v3, :cond_31

    move-object v3, v2

    check-cast v3, Ln00/h;

    iget v4, v3, Ln00/h;->x:I

    and-int v5, v4, v9

    if-eqz v5, :cond_31

    sub-int/2addr v4, v9

    iput v4, v3, Ln00/h;->x:I

    goto :goto_13

    :cond_31
    new-instance v3, Ln00/h;

    invoke-direct {v3, v0, v2}, Ln00/h;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_13
    iget-object v2, v3, Ln00/h;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ln00/h;->x:I

    if-eqz v5, :cond_33

    if-ne v5, v10, :cond_32

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_15

    :cond_32
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_33
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lec3/m;

    check-cast v1, Lg40/s3;

    check-cast v11, Ln00/k;

    iget-object v2, v11, Ln00/k;->O:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln00/c;

    iget-boolean v2, v2, Ln00/c;->c:Z

    if-eqz v2, :cond_34

    invoke-interface {v1}, Lg40/s3;->isValid()Z

    move-result v1

    goto :goto_14

    :cond_34
    move v1, v10

    :goto_14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput v10, v3, Ln00/h;->x:I

    invoke-interface {v13, v1, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_35

    move-object v12, v4

    :cond_35
    :goto_15
    return-object v12

    :pswitch_c
    check-cast v1, Lj0/h;

    check-cast v13, Lkotlin/jvm/internal/e0;

    instance-of v2, v1, Lj0/l;

    if-eqz v2, :cond_36

    iget v1, v13, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr v1, v10

    iput v1, v13, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_16

    :cond_36
    instance-of v2, v1, Lj0/m;

    if-eqz v2, :cond_37

    iget v1, v13, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v13, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_16

    :cond_37
    instance-of v1, v1, Lj0/k;

    if-eqz v1, :cond_38

    iget v1, v13, Lkotlin/jvm/internal/e0;->w:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v13, Lkotlin/jvm/internal/e0;->w:I

    :cond_38
    :goto_16
    iget v1, v13, Lkotlin/jvm/internal/e0;->w:I

    if-lez v1, :cond_39

    move v6, v10

    :cond_39
    check-cast v11, Ll1/q4;

    iget-boolean v1, v11, Ll1/q4;->R:Z

    if-eq v1, v6, :cond_3a

    iput-boolean v6, v11, Ll1/q4;->R:Z

    invoke-static {v11}, La3/g;->i(La3/c0;)V

    :cond_3a
    return-object v12

    :pswitch_d
    check-cast v1, Lj0/h;

    check-cast v13, Ljava/util/ArrayList;

    instance-of v2, v1, Lj0/d;

    if-eqz v2, :cond_3b

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_3b
    instance-of v2, v1, Lj0/e;

    if-eqz v2, :cond_3c

    check-cast v1, Lj0/e;

    iget-object v1, v1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_3c
    :goto_17
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v10

    check-cast v11, Ll1/t1;

    iget-boolean v2, v11, Ll1/t1;->U:Z

    if-eq v1, v2, :cond_3d

    iput-boolean v1, v11, Ll1/t1;->U:Z

    invoke-virtual {v11}, Ll1/t1;->b1()V

    :cond_3d
    return-object v12

    :pswitch_e
    check-cast v1, Lj0/h;

    check-cast v13, Ljava/util/ArrayList;

    instance-of v2, v1, Lj0/d;

    if-eqz v2, :cond_3e

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_3e
    instance-of v2, v1, Lj0/e;

    if-eqz v2, :cond_3f

    check-cast v1, Lj0/e;

    iget-object v1, v1, Lj0/e;->a:Lj0/d;

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_3f
    :goto_18
    check-cast v11, Lp1/c1;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v10

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v11, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-object v12

    :pswitch_f
    check-cast v1, Lh20/b4;

    invoke-virtual {v0, v1, v2}, Landroidx/room/x;->e(Lh20/b4;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v1, Lh20/n0;

    invoke-virtual {v0, v1, v2}, Landroidx/room/x;->c(Lh20/n0;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v1, Lh2/b;

    iget-wide v7, v1, Lh2/b;->a:J

    move-object v6, v13

    check-cast v6, Ld0/e;

    invoke-virtual {v6}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v9, v1, Lh2/b;->a:J

    const-wide v13, 0x7fffffff7fffffffL

    and-long/2addr v9, v13

    const-wide v15, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v1, v9, v15

    if-eqz v1, :cond_41

    and-long v9, v7, v13

    cmp-long v1, v9, v15

    if-eqz v1, :cond_41

    invoke-virtual {v6}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/b;

    iget-wide v9, v1, Lh2/b;->a:J

    const-wide v13, 0xffffffffL

    and-long/2addr v9, v13

    long-to-int v1, v9

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    and-long v9, v7, v13

    long-to-int v3, v9

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    cmpg-float v1, v1, v3

    if-nez v1, :cond_40

    goto :goto_19

    :cond_40
    check-cast v11, Lbc3/c0;

    new-instance v5, Lb4/i;

    const/4 v10, 0x1

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v10}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    invoke-static {v11, v9, v9, v5, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1a

    :cond_41
    :goto_19
    new-instance v1, Lh2/b;

    invoke-direct {v1, v7, v8}, Lh2/b;-><init>(J)V

    invoke-virtual {v6, v1, v2}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_42

    move-object v12, v1

    :cond_42
    :goto_1a
    return-object v12

    :pswitch_12
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroidx/room/x;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    return-object v1

    :pswitch_13
    instance-of v3, v2, Lec3/b1;

    if-eqz v3, :cond_43

    move-object v3, v2

    check-cast v3, Lec3/b1;

    iget v4, v3, Lec3/b1;->y:I

    and-int v5, v4, v9

    if-eqz v5, :cond_43

    sub-int/2addr v4, v9

    iput v4, v3, Lec3/b1;->y:I

    goto :goto_1b

    :cond_43
    new-instance v3, Lec3/b1;

    invoke-direct {v3, v0, v2}, Lec3/b1;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_1b
    iget-object v2, v3, Lec3/b1;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lec3/b1;->y:I

    if-eqz v5, :cond_45

    if-ne v5, v10, :cond_44

    iget-object v1, v3, Lec3/b1;->E:Ljava/lang/Object;

    iget-object v3, v3, Lec3/b1;->w:Landroidx/room/x;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1c

    :cond_44
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_45
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lc93/m;

    iput-object v0, v3, Lec3/b1;->w:Landroidx/room/x;

    iput-object v1, v3, Lec3/b1;->E:Ljava/lang/Object;

    iput v10, v3, Lec3/b1;->y:I

    invoke-interface {v13, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_46

    move-object v12, v4

    goto :goto_1d

    :cond_46
    move-object v3, v0

    :goto_1c
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_47

    :goto_1d
    return-object v12

    :cond_47
    iget-object v2, v3, Landroidx/room/x;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v1, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    invoke-direct {v1, v3}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_14
    instance-of v3, v2, Lec3/t0;

    if-eqz v3, :cond_48

    move-object v3, v2

    check-cast v3, Lec3/t0;

    iget v4, v3, Lec3/t0;->x:I

    and-int v6, v4, v9

    if-eqz v6, :cond_48

    sub-int/2addr v4, v9

    iput v4, v3, Lec3/t0;->x:I

    goto :goto_1e

    :cond_48
    new-instance v3, Lec3/t0;

    invoke-direct {v3, v0, v2}, Lec3/t0;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_1e
    iget-object v2, v3, Lec3/t0;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v6, v3, Lec3/t0;->x:I

    if-eqz v6, :cond_4b

    if-eq v6, v10, :cond_4a

    if-ne v6, v5, :cond_49

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_49
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4a
    iget-object v1, v3, Lec3/t0;->y:Lec3/m;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_4b
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v13

    check-cast v2, Lec3/m;

    iput-object v2, v3, Lec3/t0;->y:Lec3/m;

    iput v10, v3, Lec3/t0;->x:I

    invoke-interface {v11, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4c

    goto :goto_20

    :cond_4c
    move-object/from16 v17, v2

    move-object v2, v1

    move-object/from16 v1, v17

    :goto_1f
    iput-object v7, v3, Lec3/t0;->y:Lec3/m;

    iput v5, v3, Lec3/t0;->x:I

    invoke-interface {v1, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4d

    :goto_20
    move-object v12, v4

    :cond_4d
    :goto_21
    return-object v12

    :pswitch_15
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v13, Le30/c;

    iget-object v1, v13, Le30/c;->T:Lh20/z;

    check-cast v11, Ld30/u;

    iget-object v2, v11, Ld30/u;->s:Ln53/e;

    iget-object v2, v2, Ln53/e;->y:Ll83/e;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld30/s0;

    iget-object v2, v2, Ld30/s0;->f:Lzy/c;

    invoke-virtual {v1, v2, v10}, Lh20/z;->a(Lzy/c;Z)V

    return-object v12

    :pswitch_16
    instance-of v3, v2, Landroidx/room/w;

    if-eqz v3, :cond_4e

    move-object v3, v2

    check-cast v3, Landroidx/room/w;

    iget v4, v3, Landroidx/room/w;->x:I

    and-int v5, v4, v9

    if-eqz v5, :cond_4e

    sub-int/2addr v4, v9

    iput v4, v3, Landroidx/room/w;->x:I

    goto :goto_22

    :cond_4e
    new-instance v3, Landroidx/room/w;

    invoke-direct {v3, v0, v2}, Landroidx/room/w;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_22
    iget-object v2, v3, Landroidx/room/w;->w:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Landroidx/room/w;->x:I

    if-eqz v5, :cond_50

    if-ne v5, v10, :cond_4f

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_26

    :cond_4f
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_50
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v13, Lec3/m;

    check-cast v1, Ljava/util/Set;

    new-instance v2, Ln83/i;

    invoke-direct {v2}, Ln83/i;-><init>()V

    check-cast v11, [Ljava/lang/String;

    array-length v5, v11

    :goto_23
    if-ge v6, v5, :cond_53

    aget-object v8, v11, v6

    move-object v9, v1

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_51
    :goto_24
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_52

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-static {v8, v14, v10}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_51

    invoke-virtual {v2, v8}, Ln83/i;->add(Ljava/lang/Object;)Z

    goto :goto_24

    :cond_52
    add-int/lit8 v6, v6, 0x1

    goto :goto_23

    :cond_53
    invoke-static {v2}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v1

    iget-object v2, v1, Ln83/i;->w:Ln83/f;

    invoke-virtual {v2}, Ln83/f;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_54

    goto :goto_25

    :cond_54
    move-object v7, v1

    :goto_25
    if-eqz v7, :cond_55

    iput v10, v3, Landroidx/room/w;->x:I

    invoke-interface {v13, v7, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_55

    move-object v12, v4

    :cond_55
    :goto_26
    return-object v12

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

.method public f(Lwz/q;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lwz/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwz/j;

    iget v1, v0, Lwz/j;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwz/j;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwz/j;

    invoke-direct {v0, p0, p2}, Lwz/j;-><init>(Landroidx/room/x;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwz/j;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwz/j;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwz/j;->x:Lwz/q;

    iget-object v0, v0, Lwz/j;->w:Landroidx/room/x;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/room/x;->x:Ljava/lang/Object;

    check-cast p2, Lh40/k;

    iput-object p0, v0, Lwz/j;->w:Landroidx/room/x;

    iput-object p1, v0, Lwz/j;->x:Lwz/q;

    iput v3, v0, Lwz/j;->E:I

    invoke-virtual {p2, v0}, Lh40/k;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Landroidx/room/x;->y:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/link/LinkActivity;

    sget v0, Lcom/stripe/android/link/LinkActivity;->E:I

    new-instance v0, Ll83/k;

    const-string v1, "com.stripe.android.link.LinkActivityContract.extra_result"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const v0, 0x11f5b

    invoke-virtual {p2, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkActivity;->finish()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
