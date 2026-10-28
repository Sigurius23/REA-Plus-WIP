.class public final La30/s;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh53/f;Lb3/z0;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La30/s;->w:I

    .line 1
    iput-object p1, p0, La30/s;->F:Ljava/lang/Object;

    iput-object p2, p0, La30/s;->G:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, La30/s;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p8, p0, La30/s;->w:I

    iput-object p1, p0, La30/s;->y:Ljava/lang/Object;

    iput-object p2, p0, La30/s;->z:Ljava/lang/Object;

    iput-object p3, p0, La30/s;->E:Ljava/lang/Object;

    iput-object p4, p0, La30/s;->F:Ljava/lang/Object;

    iput-object p5, p0, La30/s;->G:Ljava/lang/Object;

    iput-object p6, p0, La30/s;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p7, p0, La30/s;->w:I

    iput-object p1, p0, La30/s;->z:Ljava/lang/Object;

    iput-object p2, p0, La30/s;->E:Ljava/lang/Object;

    iput-object p3, p0, La30/s;->F:Ljava/lang/Object;

    iput-object p4, p0, La30/s;->G:Ljava/lang/Object;

    iput-object p5, p0, La30/s;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 4
    iput p6, p0, La30/s;->w:I

    iput-object p1, p0, La30/s;->E:Ljava/lang/Object;

    iput-object p2, p0, La30/s;->F:Ljava/lang/Object;

    iput-object p3, p0, La30/s;->G:Ljava/lang/Object;

    iput-object p4, p0, La30/s;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    iget v0, p0, La30/s;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, La30/s;

    iget-object p1, p0, La30/s;->E:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ly00/o4;

    iget-object p1, p0, La30/s;->F:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lz20/g;

    iget-object p1, p0, La30/s;->G:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lz20/h;

    iget-object p1, p0, La30/s;->H:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/util/ArrayList;

    const/4 v7, 0x7

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v8, p2

    new-instance v2, La30/s;

    iget-object p1, p0, La30/s;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lp1/w;

    iget-object p1, p0, La30/s;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp6/l;

    iget-object p1, p0, La30/s;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Landroid/content/Context;

    iget-object p1, p0, La30/s;->G:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lp1/y1;

    iget-object p1, p0, La30/s;->H:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lx6/u;

    const/4 v9, 0x6

    invoke-direct/range {v2 .. v9}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v8, p2

    new-instance v2, La30/s;

    iget-object p1, p0, La30/s;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/internal/g0;

    iget-object p1, p0, La30/s;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lv10/g;

    iget-object p1, p0, La30/s;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, La30/s;->G:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lyy/f;

    iget-object p1, p0, La30/s;->H:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lkotlin/jvm/internal/f0;

    const/4 v9, 0x5

    invoke-direct/range {v2 .. v9}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_2
    move-object v8, p2

    new-instance v2, La30/s;

    iget-object p1, p0, La30/s;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;

    iget-object p1, p0, La30/s;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, La30/s;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lio/getstream/video/android/model/StreamCallId;

    iget-object p1, p0, La30/s;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Landroid/content/Context;

    iget-object p1, p0, La30/s;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Landroid/content/Intent;

    iget-object p1, p0, La30/s;->H:Ljava/lang/Object;

    check-cast p1, Landroid/content/BroadcastReceiver$PendingResult;

    const/4 v10, 0x4

    move-object v9, v8

    move-object v8, p1

    invoke-direct/range {v2 .. v10}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_3
    move-object v8, p2

    new-instance p1, La30/s;

    iget-object p2, p0, La30/s;->F:Ljava/lang/Object;

    check-cast p2, Lh53/f;

    iget-object v0, p0, La30/s;->G:Ljava/lang/Object;

    check-cast v0, Lb3/z0;

    iget-object v1, p0, La30/s;->H:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    invoke-direct {p1, p2, v0, v1, v8}, La30/s;-><init>(Lh53/f;Lb3/z0;Lc93/m;Lq83/d;)V

    return-object p1

    :pswitch_4
    move-object v8, p2

    new-instance v2, La30/s;

    iget-object p2, p0, La30/s;->z:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lu2/v;

    iget-object p2, p0, La30/s;->E:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function3;

    iget-object p2, p0, La30/s;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, La30/s;->G:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, La30/s;->H:Ljava/lang/Object;

    move-object v7, p2

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x2

    invoke-direct/range {v2 .. v9}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, La30/s;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_5
    move-object v8, p2

    new-instance v2, La30/s;

    iget-object p2, p0, La30/s;->E:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/internal/g0;

    iget-object p2, p0, La30/s;->F:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lbi/o;

    iget-object p2, p0, La30/s;->G:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lkotlin/jvm/internal/g0;

    iget-object p2, p0, La30/s;->H:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lbi/r;

    move-object v9, v8

    const/4 v8, 0x1

    move-object v7, v9

    invoke-direct/range {v2 .. v8}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, La30/s;->z:Ljava/lang/Object;

    return-object v2

    :pswitch_6
    move-object v8, p2

    new-instance v2, La30/s;

    iget-object p1, p0, La30/s;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, La30/a0;

    iget-object p1, p0, La30/s;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ly00/u1;

    iget-object p1, p0, La30/s;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lmy/a;

    iget-object p1, p0, La30/s;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, La30/k;

    iget-object p1, p0, La30/s;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, La30/t0;

    iget-object p1, p0, La30/s;->H:Ljava/lang/Object;

    check-cast p1, Ly00/n;

    const/4 v10, 0x0

    move-object v9, v8

    move-object v8, p1

    invoke-direct/range {v2 .. v10}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Landroid/os/Parcelable;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La30/s;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbi/s;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v3, p0

    iget v0, v3, La30/s;->w:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v7, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v3, La30/s;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v7, :cond_0

    iget-object v0, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v1, Ly00/o4;

    iget-object v1, v1, Ly00/o4;->w:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v4, v3, La30/s;->F:Ljava/lang/Object;

    check-cast v4, Lz20/g;

    iget-object v5, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v5, Lz20/h;

    iget-object v6, v3, La30/s;->H:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iput-object v6, v3, La30/s;->y:Ljava/lang/Object;

    iput-object v1, v3, La30/s;->z:Ljava/lang/Object;

    iput v7, v3, La30/s;->x:I

    invoke-virtual {v4, v5, v1, v2, v3}, Lz20/g;->a(Lz20/h;Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v0, v1

    move-object v1, v6

    :goto_0
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_3

    new-instance v5, Lz20/i;

    invoke-direct {v5, v0, v4}, Lz20/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v5, Ll83/n;

    invoke-direct {v5, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-object v5

    :pswitch_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v0, v3, La30/s;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    iget-object v0, v3, La30/s;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp6/l;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v3, La30/s;->x:I

    if-eqz v0, :cond_7

    if-eq v0, v7, :cond_6

    if-ne v0, v4, :cond_5

    iget-object v0, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v0, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v0, Lp1/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lp6/c;

    invoke-direct {v6, v2, v5}, Lp6/c;-><init>(Landroid/content/Context;Lp6/l;)V

    new-instance v9, Lx1/b;

    const v10, -0x26c6865e

    invoke-direct {v9, v6, v7, v10}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v9}, Lp1/w;->A(Lc93/m;)V

    iget-object v0, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v0, Lp1/y1;

    iput v7, v3, La30/s;->x:I

    invoke-virtual {v0, v3}, Lp1/y1;->H(Ls83/i;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v8, :cond_a

    goto :goto_3

    :goto_2
    iput-object v0, v3, La30/s;->y:Ljava/lang/Object;

    iput v4, v3, La30/s;->x:I

    iget-object v4, v5, Lp6/l;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v4, "GlanceAppWidget"

    const-string v6, "Error in Glance App Widget"

    invoke-static {v4, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-boolean v4, v5, Lp6/l;->i:Z

    if-eqz v4, :cond_9

    iget-object v4, v5, Lp6/l;->e:Lp6/g0;

    iget-object v5, v5, Lp6/l;->f:Lp6/b;

    iget v6, v5, Lp6/b;->a:I

    invoke-virtual {v4, v2, v5, v6, v0}, Lp6/g0;->i(Landroid/content/Context;Ln6/l;ILjava/lang/Throwable;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v8, :cond_8

    :goto_3
    move-object v1, v8

    goto :goto_5

    :cond_8
    :goto_4
    iget-object v2, v3, La30/s;->H:Ljava/lang/Object;

    check-cast v2, Lx6/u;

    const-string v4, "Error in recomposition coroutine"

    invoke-static {v4, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-static {v2, v0}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    goto :goto_5

    :cond_9
    throw v0

    :catch_0
    :cond_a
    :goto_5
    return-object v1

    :pswitch_1
    iget-object v0, v3, La30/s;->H:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/f0;

    iget-object v2, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v2, Lyy/f;

    iget-object v8, v3, La30/s;->F:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v9, Lv10/g;

    iget-object v10, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/g0;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v12, v3, La30/s;->x:I

    if-eqz v12, :cond_e

    if-eq v12, v7, :cond_d

    if-eq v12, v4, :cond_c

    if-ne v12, v1, :cond_b

    iget-object v6, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    check-cast v7, Ll83/n;

    iget-object v7, v7, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_9

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_d
    iget-object v6, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/g0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    check-cast v7, Ll83/n;

    iget-object v7, v7, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_6

    :cond_e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v6, Lv10/g;->f:Ljava/util/List;

    iput-object v10, v3, La30/s;->y:Ljava/lang/Object;

    iput v7, v3, La30/s;->x:I

    invoke-virtual {v9, v8, v2, v6, v3}, Lv10/g;->g(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_f

    goto :goto_a

    :cond_f
    move-object v6, v10

    :goto_6
    new-instance v12, Ll83/n;

    invoke-direct {v12, v7}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iput-object v12, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_7
    iget-object v6, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Ll83/n;

    invoke-static {v6}, Lv10/g;->h(Ll83/n;)Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v12, v0, Lkotlin/jvm/internal/f0;->w:J

    sub-long/2addr v6, v12

    const-wide/16 v12, 0x3e8

    sub-long/2addr v12, v6

    iput-object v5, v3, La30/s;->y:Ljava/lang/Object;

    iput v4, v3, La30/s;->x:I

    invoke-static {v12, v13, v3}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_10

    goto :goto_a

    :cond_10
    :goto_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v0, Lkotlin/jvm/internal/f0;->w:J

    sget-object v6, Lv10/g;->f:Ljava/util/List;

    iput-object v10, v3, La30/s;->y:Ljava/lang/Object;

    iput v1, v3, La30/s;->x:I

    invoke-virtual {v9, v8, v2, v6, v3}, Lv10/g;->g(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_11

    goto :goto_a

    :cond_11
    move-object v6, v10

    :goto_9
    new-instance v12, Ll83/n;

    invoke-direct {v12, v7}, Ll83/n;-><init>(Ljava/lang/Object;)V

    iput-object v12, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_7

    :cond_12
    sget-object v11, Ll83/a0;->a:Ll83/a0;

    :goto_a
    return-object v11

    :pswitch_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v3, La30/s;->x:I

    const/16 v4, 0xd

    if-eqz v2, :cond_14

    if-ne v2, v7, :cond_13

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_c

    :catchall_1
    move-exception v0

    goto :goto_b

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    sget-object v2, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/i3;->b:Lt23/j3;

    if-nez v2, :cond_15

    iget-object v0, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;

    sget v2, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->e:I

    invoke-virtual {v0}, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v6, "StreamVideo is not initialised. To handle notifications to initialise StreamVideo in Application.onCreate()."

    new-instance v7, La3/z0;

    invoke-direct {v7, v4, v2, v6}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->F:Lb23/g;

    iget-object v8, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v6, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_16

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v7}, La3/z0;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v2, v6, v0, v7, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_15
    iget-object v5, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v5, Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v5}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v6, Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v6}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v6

    check-cast v2, Lt23/b4;

    invoke-virtual {v2, v5, v6}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object v2

    iget-object v5, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v5, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;

    iget-object v6, v3, La30/s;->F:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    iget-object v8, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v8, Landroid/content/Intent;

    iput v7, v3, La30/s;->x:I

    invoke-virtual {v5, v2, v6, v8}, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->b(Lt23/c0;Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v1, v0, :cond_16

    move-object v1, v0

    goto :goto_d

    :goto_b
    iget-object v2, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v2, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;

    sget v5, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->e:I

    invoke-virtual {v2}, Lio/getstream/video/android/core/notifications/internal/receivers/LeaveCallBroadcastReceiver;->a()Lb23/k;

    move-result-object v2

    iget-object v5, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    new-instance v6, La3/z0;

    const-string v7, "An error occured while invoking the action."

    invoke-direct {v6, v4, v5, v7}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_16

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v6}, La3/z0;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v4, v5, v2, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_16
    :goto_c
    iget-object v0, v3, La30/s;->H:Ljava/lang/Object;

    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    :goto_d
    return-object v1

    :pswitch_3
    sget-object v8, Ll83/a0;->a:Ll83/a0;

    iget-object v0, v3, La30/s;->F:Ljava/lang/Object;

    check-cast v0, Lh53/f;

    iget-object v0, v0, Lh53/f;->c:Lh53/e;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v10, v3, La30/s;->x:I

    const/4 v11, 0x4

    if-eqz v10, :cond_1b

    if-eq v10, v7, :cond_1a

    if-eq v10, v4, :cond_19

    if-eq v10, v1, :cond_18

    if-ne v10, v11, :cond_17

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_13

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto/16 :goto_13

    :catchall_2
    move-exception v0

    goto/16 :goto_11

    :cond_19
    iget-object v0, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v2, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    check-cast v2, Lc93/m;

    iget-object v4, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_1a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_f

    :cond_1b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_6
    iput v7, v3, La30/s;->x:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lh53/a;

    invoke-direct {v6, v0, v5, v2}, Lh53/a;-><init>(Lh53/e;Lq83/d;I)V

    const-wide/16 v12, 0x2710

    invoke-static {v12, v13, v6, v3}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_1c

    goto :goto_e

    :cond_1c
    move-object v2, v8

    :goto_e
    if-ne v2, v9, :cond_1d

    goto :goto_12

    :cond_1d
    :goto_f
    iget-object v2, v0, Lh53/e;->m:Ljava/lang/Object;

    check-cast v2, Lqg3/d;

    invoke-virtual {v2}, Lqg3/d;->s()Ly43/b;

    move-result-object v2

    iget-object v2, v2, Ly43/b;->d:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li53/j;

    instance-of v2, v2, Li53/a;

    if-eqz v2, :cond_1f

    iget-object v0, v0, Lh53/e;->k:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-virtual {v0}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "getOrThrow(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    iget-object v2, v3, La30/s;->H:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    iput-object v0, v3, La30/s;->y:Ljava/lang/Object;

    iput-object v2, v3, La30/s;->z:Ljava/lang/Object;

    iput-object v0, v3, La30/s;->E:Ljava/lang/Object;

    iput v4, v3, La30/s;->x:I

    const-wide/16 v6, 0x1f4

    invoke-static {v6, v7, v3}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_1e

    goto :goto_12

    :cond_1e
    move-object v4, v0

    :goto_10
    iput-object v4, v3, La30/s;->y:Ljava/lang/Object;

    iput-object v5, v3, La30/s;->z:Ljava/lang/Object;

    iput-object v5, v3, La30/s;->E:Ljava/lang/Object;

    iput v1, v3, La30/s;->x:I

    invoke-interface {v2, v0, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_20

    goto :goto_12

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This state doesn\'t contain connectionId"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_11
    iget-object v1, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v1, Lb3/z0;

    iput-object v5, v3, La30/s;->y:Ljava/lang/Object;

    iput-object v5, v3, La30/s;->z:Ljava/lang/Object;

    iput-object v5, v3, La30/s;->E:Ljava/lang/Object;

    iput v11, v3, La30/s;->x:I

    invoke-virtual {v1, v0, v3}, Lb3/z0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-ne v8, v9, :cond_20

    :goto_12
    move-object v8, v9

    :cond_20
    :goto_13
    return-object v8

    :pswitch_4
    iget-object v0, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v3, La30/s;->x:I

    if-eqz v2, :cond_22

    if-ne v2, v7, :cond_21

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v3, La30/s;->y:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Lbc3/c0;

    new-instance v14, Lh0/h2;

    invoke-direct {v14, v0}, Lh0/h2;-><init>(Ly3/c;)V

    new-instance v8, Lh0/l3;

    iget-object v2, v3, La30/s;->E:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function3;

    iget-object v2, v3, La30/s;->F:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function1;

    iget-object v2, v3, La30/s;->G:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Lkotlin/jvm/functions/Function1;

    iget-object v2, v3, La30/s;->H:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v15}, Lh0/l3;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V

    iput v7, v3, La30/s;->x:I

    invoke-static {v0, v8, v3}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_23

    goto :goto_15

    :cond_23
    :goto_14
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_15
    return-object v1

    :pswitch_5
    iget-object v0, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/g0;

    iget-object v2, v3, La30/s;->F:Ljava/lang/Object;

    check-cast v2, Lbi/o;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, v3, La30/s;->x:I

    if-eqz v9, :cond_26

    if-eq v9, v7, :cond_25

    if-ne v9, v4, :cond_24

    iget-object v0, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v0, Lbi/s;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v0

    move-object/from16 v0, p1

    goto/16 :goto_18

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    iget-object v6, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/g0;

    iget-object v7, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v7, Lbi/s;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v6

    move-object v6, v7

    move-object/from16 v7, p1

    goto :goto_16

    :cond_26
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v6, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v6, Lbi/s;

    iget-object v9, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lth/g;

    iget-object v10, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Lbi/s;

    iput-object v6, v3, La30/s;->z:Ljava/lang/Object;

    iput-object v1, v3, La30/s;->y:Ljava/lang/Object;

    iput v7, v3, La30/s;->x:I

    invoke-static {v2, v9, v10, v6, v3}, Lbi/o;->c(Lbi/o;Lth/g;Lbi/s;Lbi/s;Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_27

    goto :goto_17

    :cond_27
    move-object v9, v1

    :goto_16
    iput-object v7, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v7, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v7, :cond_29

    check-cast v7, Lth/g;

    invoke-virtual {v2, v7}, Lbi/o;->i(Lth/g;)Lbi/s;

    move-result-object v4

    iput-object v4, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v4, Luh/h;

    iget-object v1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lth/g;

    invoke-virtual {v2, v1}, Lbi/o;->h(Lth/g;)Lsh/p;

    move-result-object v1

    iget-object v2, v2, Lbi/o;->a:Ljava/lang/String;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbi/s;

    if-eqz v0, :cond_28

    iget-object v0, v0, Lbi/s;->d:Lbi/q;

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Lbi/q;->a()Ljava/lang/String;

    move-result-object v5

    :cond_28
    invoke-static {v2, v5}, Lbi/o;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lsh/h;->z:Lsh/h;

    invoke-direct {v4, v1, v0, v2}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    move-object v5, v4

    goto :goto_19

    :cond_29
    iget-object v0, v6, Lbi/s;->e:Lbi/t;

    if-eqz v0, :cond_2c

    iput-object v6, v3, La30/s;->z:Ljava/lang/Object;

    iput-object v5, v3, La30/s;->y:Ljava/lang/Object;

    iput v4, v3, La30/s;->x:I

    invoke-static {v0, v3}, Lds/q;->E(Lbi/t;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_2a

    :goto_17
    move-object v5, v8

    goto :goto_19

    :cond_2a
    :goto_18
    check-cast v0, Lne3/h;

    iget-wide v7, v0, Lne3/h;->x:J

    const-wide/16 v9, 0x0

    cmp-long v1, v7, v9

    if-lez v1, :cond_2b

    new-instance v5, Luh/h;

    invoke-virtual {v2}, Lbi/o;->e()Lne3/p;

    move-result-object v1

    invoke-static {v0, v1}, Ls2/d;->h(Lne3/j;Lne3/p;)Lsh/s;

    move-result-object v0

    iget-object v1, v2, Lbi/o;->a:Ljava/lang/String;

    iget-object v2, v6, Lbi/s;->d:Lbi/q;

    invoke-virtual {v2}, Lbi/q;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lbi/o;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lsh/h;->z:Lsh/h;

    invoke-direct {v5, v0, v1, v2}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    :cond_2b
    :goto_19
    return-object v5

    :cond_2c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "body == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v3, La30/s;->x:I

    if-eqz v0, :cond_2e

    if-ne v0, v7, :cond_2d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1c

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v3, La30/s;->y:Ljava/lang/Object;

    check-cast v0, La30/a0;

    iget-object v0, v0, La30/a0;->j:La30/f;

    iget-object v1, v3, La30/s;->z:Ljava/lang/Object;

    check-cast v1, Ly00/u1;

    iget-object v2, v3, La30/s;->E:Ljava/lang/Object;

    check-cast v2, Lmy/a;

    iget-object v4, v3, La30/s;->F:Ljava/lang/Object;

    check-cast v4, La30/k;

    if-eqz v4, :cond_31

    new-instance v6, Lz20/h;

    invoke-interface {v4}, La30/k;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4}, La30/k;->a()Ljava/lang/String;

    move-result-object v10

    instance-of v11, v4, La30/i;

    if-eqz v11, :cond_2f

    check-cast v4, La30/i;

    goto :goto_1a

    :cond_2f
    move-object v4, v5

    :goto_1a
    if-eqz v4, :cond_30

    iget-object v5, v4, La30/i;->b:Ljava/lang/String;

    :cond_30
    invoke-direct {v6, v9, v10, v5}, Lz20/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1b

    :cond_31
    move-object v6, v5

    :goto_1b
    iget-object v4, v3, La30/s;->G:Ljava/lang/Object;

    check-cast v4, La30/t0;

    iget-object v5, v3, La30/s;->H:Ljava/lang/Object;

    check-cast v5, Ly00/n;

    iput v7, v3, La30/s;->x:I

    move-object/from16 v16, v5

    move-object v5, v1

    move-object v1, v4

    move-object/from16 v4, v16

    invoke-virtual/range {v0 .. v6}, La30/f;->b(La30/t0;Lmy/a;Ls83/c;Ly00/n;Ly00/u1;Lz20/h;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_32

    move-object v0, v8

    :cond_32
    :goto_1c
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
