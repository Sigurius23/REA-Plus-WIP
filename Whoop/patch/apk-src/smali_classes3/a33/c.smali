.class public final La33/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La6/i0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La33/c;->w:I

    .line 1
    iput-object p1, p0, La33/c;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, La33/c;->w:I

    .line 2
    iput-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, La33/c;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p4, p0, La33/c;->w:I

    iput-object p1, p0, La33/c;->y:Ljava/lang/Object;

    iput-object p2, p0, La33/c;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lt23/b4;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, La33/c;->w:I

    .line 4
    iput-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, La33/c;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, La33/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lz0/f;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lb1/f;

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lwc/x0;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lgf/b;

    const/16 v3, 0xe

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_1
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lwc/f0;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lgf/b;

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_2
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lve/b;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lgf/b;

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_3
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lt23/b4;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lio/getstream/android/video/generated/models/UserRequest;

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_4
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lt23/b4;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    invoke-direct {v0, v1, v2, p1}, La33/c;-><init>(Lt23/b4;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0

    :pswitch_5
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lm40/w;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_6
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lm1/g;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_7
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lh20/z4;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ly00/o4;

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_8
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lh0/p;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    invoke-direct {v0, v1, v2, p1}, La33/c;-><init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    return-object v0

    :pswitch_9
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lg1/a0;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_a
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Le33/n;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_b
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lbe/q;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Luf/u;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_c
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lb1/c;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lb1/b;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_d
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v1, La6/i0;

    invoke-direct {v0, v1, p1}, La33/c;-><init>(La6/i0;Lq83/d;)V

    return-object v0

    :pswitch_e
    new-instance v0, La33/c;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p1, v3}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La33/c;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0, p1}, La33/c;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La33/c;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La33/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, La33/c;->w:I

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lz0/f;

    iget-object v2, v1, Lz0/f;->e:Lz1/v;

    iget-object v7, v1, Lz0/f;->a:Landroid/view/View;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, p0, La33/c;->x:I

    if-eqz v9, :cond_1

    if-ne v9, v6, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lz0/e;

    invoke-direct {p1}, Lz0/e;-><init>()V

    iget-object v5, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v5, Lb1/f;

    new-instance v9, Lz0/d;

    new-instance v10, Lz0/b;

    invoke-direct {v10, v1, v5, v3}, Lz0/b;-><init>(Lz0/f;Lb1/f;I)V

    new-instance v3, Lz0/b;

    invoke-direct {v3, v1, v5, v6}, Lz0/b;-><init>(Lz0/f;Lb1/f;I)V

    invoke-direct {v9, p1, v10, v3, v7}, Lz0/d;-><init>(Lz0/e;Lz0/b;Lz0/b;Landroid/view/View;)V

    iget-object v3, v1, Lz0/f;->b:Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_3

    invoke-interface {v3, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz0/d;

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v9, v3

    :cond_3
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v7}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v5

    goto :goto_1

    :cond_4
    move-object v5, v4

    :goto_1
    if-eq v3, v5, :cond_6

    iget-object v3, v1, Lz0/f;->i:Landroidx/fragment/app/d;

    if-nez v3, :cond_5

    new-instance v3, Landroidx/fragment/app/d;

    const/16 v5, 0x17

    invoke-direct {v3, v1, v9, p1, v5}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v3, v1, Lz0/f;->i:Landroidx/fragment/app/d;

    :cond_5
    invoke-virtual {v7, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_6
    new-instance v3, Lz0/j;

    invoke-direct {v3, v9}, Lz0/j;-><init>(Lz0/d;)V

    invoke-virtual {v7, v3, v6}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    iput-object v3, v1, Lz0/f;->h:Landroid/view/ActionMode;

    :goto_2
    :try_start_1
    iput v6, p0, La33/c;->x:I

    iget-object p1, p1, Lz0/e;->a:Ldc3/h;

    invoke-virtual {p1, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v8, :cond_8

    goto :goto_3

    :cond_8
    move-object p1, v0

    :goto_3
    if-ne p1, v8, :cond_9

    move-object v0, v8

    goto :goto_5

    :cond_9
    :goto_4
    invoke-virtual {v2}, Lz1/v;->a()V

    iget-object p1, v1, Lz0/f;->h:Landroid/view/ActionMode;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    :cond_a
    iget-object p1, v1, Lz0/f;->i:Landroidx/fragment/app/d;

    if-eqz p1, :cond_b

    invoke-virtual {v7, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_b
    iput-object v4, v1, Lz0/f;->h:Landroid/view/ActionMode;

    :goto_5
    return-object v0

    :goto_6
    invoke-virtual {v2}, Lz1/v;->a()V

    iget-object v0, v1, Lz0/f;->h:Landroid/view/ActionMode;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    :cond_c
    iget-object v0, v1, Lz0/f;->i:Landroidx/fragment/app/d;

    if-eqz v0, :cond_d

    invoke-virtual {v7, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_d
    iput-object v4, v1, Lz0/f;->h:Landroid/view/ActionMode;

    throw p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_f

    if-ne v1, v6, :cond_e

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lwc/x0;

    iput v6, p0, La33/c;->x:I

    invoke-static {p1, p0}, Lwc/x0;->a(Lwc/x0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    move-object p1, v0

    :cond_10
    :goto_7
    return-object p1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_12

    if-ne v1, v6, :cond_11

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lwc/f0;

    iput v6, p0, La33/c;->x:I

    invoke-static {p1, p0}, Lwc/f0;->a(Lwc/f0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    move-object p1, v0

    :cond_13
    :goto_8
    return-object p1

    :pswitch_2
    iget-object v0, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v0, Lve/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La33/c;->x:I

    if-eqz v2, :cond_15

    if-ne v2, v6, :cond_14

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_14
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_15
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance v2, Lve/a;

    invoke-direct {v2, v3}, Lve/a;-><init>(I)V

    sget-object v3, Log/b;->E:Log/b;

    const-class v5, Lve/b;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-interface {v5}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-static {p1, v3, v5, v4, v2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    iget-object p1, v0, Lve/b;->w:Lve/g;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lgf/b;

    iput v6, p0, La33/c;->x:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v2, p0}, Lve/g;->h(Lve/g;Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_16

    goto :goto_a

    :cond_16
    :goto_9
    check-cast p1, Lve/e;

    iget-object v1, p1, Lve/e;->d:Lug/b;

    iget-object v2, v0, Lve/b;->y:Lug/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v2

    iget-wide v5, v0, Lve/b;->x:J

    invoke-virtual {v2, v5, v6}, Lug/b;->d(J)Lug/b;

    move-result-object v0

    filled-new-array {v1, v0}, [Lug/b;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->a1(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Lug/b;

    iget-object v1, p1, Lve/e;->d:Lug/b;

    if-nez v1, :cond_17

    move-object v1, v0

    :cond_17
    const/16 v2, 0x37

    invoke-static {p1, v1, v4, v2}, Ls7/a;->b(Lve/e;Lug/b;Lgf/c;I)Lve/e;

    move-result-object p1

    new-instance v1, Lvg/h;

    invoke-direct {v1, p1, v0}, Lvg/h;-><init>(Ljava/lang/Object;Lug/b;)V

    :goto_a
    return-object v1

    :cond_18
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_1a

    if-ne v1, v6, :cond_19

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_b

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lt23/b4;

    iget-object p1, p1, Lt23/b4;->E:Ly33/c;

    invoke-virtual {p1}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object p1

    new-instance v1, Lio/getstream/android/video/generated/models/CreateGuestRequest;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Lio/getstream/android/video/generated/models/UserRequest;

    invoke-direct {v1, v2}, Lio/getstream/android/video/generated/models/CreateGuestRequest;-><init>(Lio/getstream/android/video/generated/models/UserRequest;)V

    iput v6, p0, La33/c;->x:I

    invoke-interface {p1, v1, p0}, Lio/getstream/android/video/generated/apis/ProductvideoApi;->createGuest(Lio/getstream/android/video/generated/models/CreateGuestRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1b

    move-object p1, v0

    :cond_1b
    :goto_b
    return-object p1

    :pswitch_4
    iget-object v0, p0, La33/c;->z:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ls83/i;

    iget-object v0, p0, La33/c;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lt23/b4;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, La33/c;->x:I

    const/4 v10, 0x4

    if-eqz v0, :cond_20

    if-eq v0, v6, :cond_1f

    if-eq v0, v1, :cond_1e

    if-eq v0, v2, :cond_1d

    if-ne v0, v10, :cond_1c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_12

    :cond_1e
    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Lretrofit2/HttpException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_14

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_e

    :cond_1f
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_20
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v8, Lt23/b4;->W:Lbc3/j0;

    if-eqz p1, :cond_22

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v5, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-eq v0, p1, :cond_21

    goto :goto_c

    :cond_21
    move-object p1, v4

    :goto_c
    if-eqz p1, :cond_22

    iput v6, p0, La33/c;->x:I

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v9, :cond_22

    goto/16 :goto_13

    :cond_22
    :goto_d
    :try_start_3
    iput v1, p0, La33/c;->x:I

    invoke-interface {v7, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Lretrofit2/HttpException; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v9, :cond_2b

    goto/16 :goto_13

    :goto_e
    iget-object v0, p1, Lretrofit2/HttpException;->y:Lpg3/v0;

    if-eqz v0, :cond_23

    iget-object v0, v0, Lpg3/v0;->c:Lud3/a1;

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Lud3/a1;->h()[B

    move-result-object v4

    :cond_23
    const/16 v1, 0xc

    if-eqz v4, :cond_25

    :try_start_4
    new-instance v0, Ljava/lang/String;

    sget-object v5, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object v4, Lt23/l0;->S:Lt23/l0;

    sget-object v5, Lad3/c;->d:Lad3/b;

    invoke-static {v5, v4}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v4

    sget-object v5, Lio/getstream/video/android/core/socket/ErrorResponse;->Companion:Lio/getstream/video/android/core/socket/a;

    invoke-virtual {v5}, Lio/getstream/video/android/core/socket/a;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-virtual {v4, v5, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/video/android/core/socket/ErrorResponse;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-nez v0, :cond_24

    goto :goto_f

    :cond_24
    new-instance v1, Ln23/f;

    new-instance v3, Ln23/c;

    invoke-virtual {v0}, Lio/getstream/video/android/core/socket/ErrorResponse;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lio/getstream/video/android/core/socket/ErrorResponse;->getCode()I

    move-result v5

    invoke-virtual {v0}, Lio/getstream/video/android/core/socket/ErrorResponse;->getStatusCode()I

    move-result v6

    new-instance v11, Ljava/lang/Throwable;

    invoke-virtual {v0}, Lio/getstream/video/android/core/socket/ErrorResponse;->getMoreInfo()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, v5, v6, v11}, Ln23/c;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    invoke-direct {v1, v3}, Ln23/f;-><init>(Ln23/e;)V

    goto :goto_10

    :catch_1
    move-exception v0

    new-instance v4, Ln23/f;

    new-instance v5, Ln23/c;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v6, "failed to parse error response from server: "

    invoke-static {v6, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lu33/e;->y:Lt9/p;

    const/16 v6, 0x3e9

    invoke-direct {v5, v0, v6, v3, v1}, Ln23/c;-><init>(Ljava/lang/String;III)V

    invoke-direct {v4, v5}, Ln23/f;-><init>(Ln23/e;)V

    move-object v1, v4

    goto :goto_10

    :cond_25
    :goto_f
    new-instance v0, Ln23/f;

    new-instance v4, Ln23/c;

    const-string v5, "failed to parse error response from server"

    iget v6, p1, Lretrofit2/HttpException;->w:I

    invoke-direct {v4, v5, v6, v3, v1}, Ln23/c;-><init>(Ljava/lang/String;III)V

    invoke-direct {v0, v4}, Ln23/f;-><init>(Ln23/e;)V

    move-object v1, v0

    :goto_10
    iget-object v0, v1, Ln23/f;->a:Ln23/e;

    const-string v1, "null cannot be cast to non-null type io.getstream.result.Error.NetworkError"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln23/c;

    iget v0, v0, Ln23/c;->b:I

    sget-object v1, Lu33/e;->y:Lt9/p;

    const/4 v1, 0x5

    if-ne v0, v1, :cond_26

    goto :goto_11

    :cond_26
    const/16 v1, 0x28

    if-ne v0, v1, :cond_27

    goto :goto_11

    :cond_27
    const/16 v1, 0x29

    if-ne v0, v1, :cond_28

    goto :goto_11

    :cond_28
    const/16 v1, 0x2a

    if-ne v0, v1, :cond_29

    goto :goto_11

    :cond_29
    const/16 v1, 0x2b

    if-ne v0, v1, :cond_2c

    :goto_11
    iget-object p1, v8, Lt23/b4;->G:Le53/c;

    iput v2, p0, La33/c;->x:I

    invoke-interface {p1, p0}, Le53/c;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v9, :cond_2a

    goto :goto_13

    :cond_2a
    :goto_12
    check-cast p1, Ljava/lang/String;

    iget-object v0, v8, Lt23/b4;->F:Le53/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "token"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Le53/d;->a:Ljava/lang/Object;

    iput-object p1, v8, Lt23/b4;->z:Ljava/lang/String;

    iget-object v0, v8, Lt23/b4;->E:Ly33/c;

    invoke-virtual {v0, p1}, Ly33/c;->b(Ljava/lang/String;)V

    iput v10, p0, La33/c;->x:I

    invoke-interface {v7, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v9, :cond_2b

    :goto_13
    move-object p1, v9

    :cond_2b
    :goto_14
    return-object p1

    :cond_2c
    throw p1

    :pswitch_5
    iget-object v0, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, Lm40/w;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La33/c;->x:I

    if-eqz v3, :cond_2e

    if-ne v3, v6, :cond_2d

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_16

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lm40/w;->b(Lm40/w;Ljava/lang/String;)Ll83/n;

    move-result-object p1

    if-eqz p1, :cond_2f

    :goto_15
    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_16

    :cond_2f
    invoke-static {v1, v0}, Lm40/w;->a(Lm40/w;Ljava/lang/String;)Ll83/n;

    move-result-object p1

    if-eqz p1, :cond_30

    goto :goto_15

    :cond_30
    iput v6, p0, La33/c;->x:I

    invoke-static {v1, v0, p0}, Lm40/w;->d(Lm40/w;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_31

    goto :goto_17

    :cond_31
    :goto_16
    new-instance v2, Ll83/n;

    invoke-direct {v2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_17
    return-object v2

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_33

    if-ne v1, v6, :cond_32

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_18

    :cond_32
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_33
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lm1/g;

    new-instance v1, Lm1/c;

    invoke-direct {v1, p1, v2}, Lm1/c;-><init>(Lm1/g;I)V

    new-instance v2, Lg20/p;

    iget-object v3, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function3;

    const/16 v5, 0x18

    invoke-direct {v2, v3, p1, v4, v5}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v6, p0, La33/c;->x:I

    invoke-static {v1, v2, p0}, Landroidx/compose/material3/internal/a;->a(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_34

    goto :goto_19

    :cond_34
    :goto_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_19
    return-object v0

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_36

    if-ne v1, v6, :cond_35

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_35
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_36
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lh20/z4;

    iget-object v1, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v1, Ly00/o4;

    iput v6, p0, La33/c;->x:I

    invoke-virtual {p1, v1, p0}, Lh20/z4;->b(Ly00/o4;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    if-ne p1, v0, :cond_37

    move-object p1, v0

    :cond_37
    :goto_1a
    return-object p1

    :pswitch_8
    iget-object v0, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v0, Lh0/p;

    iget-object v1, v0, Lh0/p;->f:Lp1/g1;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La33/c;->x:I

    if-eqz v3, :cond_39

    if-ne v3, v6, :cond_38

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_38
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_39
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ld1/i;

    const/16 v3, 0x1c

    invoke-direct {p1, v0, v3}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lg20/p;

    iget-object v5, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v5, Ls83/i;

    invoke-direct {v3, v0, v5, v4}, Lg20/p;-><init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput v6, p0, La33/c;->x:I

    invoke-static {p1, v3, p0}, Landroidx/compose/foundation/gestures/a;->a(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3a

    goto :goto_1c

    :cond_3a
    :goto_1b
    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object p1

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v2

    check-cast p1, Lh0/x;

    invoke-virtual {p1, v2}, Lh0/x;->a(F)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3b

    invoke-virtual {v0}, Lh0/p;->c()Lh0/h1;

    move-result-object v2

    check-cast v2, Lh0/x;

    invoke-virtual {v2, p1}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v2

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_3b

    iget-object v1, v0, Lh0/p;->d:Lp1/k1;

    invoke-virtual {v1, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lh0/p;->g(Ljava/lang/Object;)V

    :cond_3b
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_1c
    return-object v2

    :pswitch_9
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_3d

    if-ne v1, v6, :cond_3c

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1d

    :cond_3c
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3d
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lg1/a0;

    new-instance v1, Lg1/t;

    invoke-direct {v1, p1, v2}, Lg1/t;-><init>(Lg1/a0;I)V

    new-instance v2, La1/h;

    iget-object v3, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function3;

    const/16 v5, 0x1a

    invoke-direct {v2, v3, p1, v4, v5}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v6, p0, La33/c;->x:I

    invoke-static {v1, v2, p0}, Lcom/squareup/wire/n;->j(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3e

    goto :goto_1e

    :cond_3e
    :goto_1d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1e
    return-object v0

    :pswitch_a
    iget-object v0, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v0, Le33/n;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La33/c;->x:I

    if-eqz v2, :cond_40

    if-ne v2, v6, :cond_3f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1f

    :cond_3f
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_40
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_41

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v3, "[restartIce] debugSource:"

    const-string v8, ", negotiate on Restarting ICE connection"

    invoke-static {v3, v2, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v7, v5, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_41
    iput v6, p0, La33/c;->x:I

    const-string p1, "[restartIce]"

    invoke-virtual {v0, p1, v6, p0}, Le33/n;->t(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_42

    goto :goto_20

    :cond_42
    :goto_1f
    new-instance v1, Ll83/n;

    invoke-direct {v1, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_20
    return-object v1

    :pswitch_b
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La33/c;->x:I

    if-eqz v1, :cond_44

    if-ne v1, v6, :cond_43

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_21

    :cond_43
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_44
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast p1, Lbe/q;

    iget-object v1, p1, Lbe/q;->z:Lug/a;

    iget-object v2, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v2, Luf/u;

    iput v6, p0, La33/c;->x:I

    invoke-static {p1, v1, v2, p0}, Lbe/q;->a(Lbe/q;Lug/a;Luf/u;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_45

    goto :goto_22

    :cond_45
    :goto_21
    check-cast p1, Lbe/n;

    new-instance v0, Lvg/h;

    iget-object v1, p1, Lbe/n;->b:Lug/b;

    invoke-direct {v0, p1, v1}, Lvg/h;-><init>(Ljava/lang/Object;Lug/b;)V

    :goto_22
    return-object v0

    :pswitch_c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v1, Lb1/b;

    iget-object v2, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v2, Lb1/c;

    iget-object v2, v2, Lb1/c;->c:Lp1/k1;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v7, p0, La33/c;->x:I

    if-eqz v7, :cond_47

    if-ne v7, v6, :cond_46

    :try_start_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_24

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_26

    :cond_46
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_47
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_6
    invoke-virtual {v2, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iput v6, p0, La33/c;->x:I

    iget-object p1, v1, Lb1/b;->b:Ldc3/h;

    invoke-virtual {p1, p0}, Ldc3/h;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-ne p1, v3, :cond_48

    goto :goto_23

    :cond_48
    move-object p1, v0

    :goto_23
    if-ne p1, v3, :cond_49

    move-object v0, v3

    goto :goto_25

    :cond_49
    :goto_24
    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_25
    return-object v0

    :goto_26
    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    throw p1

    :pswitch_d
    iget-object v0, p0, La33/c;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, La6/i0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v0, p0, La33/c;->x:I

    if-eqz v0, :cond_4c

    if-eq v0, v6, :cond_4b

    if-ne v0, v1, :cond_4a

    iget-object v0, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_29

    :cond_4a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4b
    :try_start_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_27

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_28

    :cond_4c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_8
    iput v6, p0, La33/c;->x:I

    invoke-static {v2, v6, p0}, La6/i0;->g(La6/i0;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_4d

    goto :goto_2b

    :cond_4d
    :goto_27
    check-cast p1, La6/e1;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_2a

    :goto_28
    invoke-virtual {v2}, La6/i0;->h()La6/d1;

    move-result-object p1

    iput-object v0, p0, La33/c;->y:Ljava/lang/Object;

    iput v1, p0, La33/c;->x:I

    invoke-virtual {p1}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object p1

    if-ne p1, v3, :cond_4e

    goto :goto_2b

    :cond_4e
    :goto_29
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v1, La6/v0;

    invoke-direct {v1, p1, v0}, La6/v0;-><init>(ILjava/lang/Throwable;)V

    move-object p1, v1

    :goto_2a
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2b
    return-object v3

    :pswitch_e
    iget-object v0, p0, La33/c;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, La33/c;->y:Ljava/lang/Object;

    check-cast v1, La33/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La33/c;->x:I

    if-eqz v3, :cond_50

    if-ne v3, v6, :cond_4f

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_4f
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_50
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v1, La33/d;->z:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v3, p1, Lb23/k;->c:Lb23/e;

    iget-object v5, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_51

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    move-object v8, v0

    check-cast v8, Ljava/lang/Iterable;

    sget-object v12, La33/b;->x:La33/b;

    const/16 v13, 0x1e

    const-string v9, ","

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v7, v5, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_51
    iget-object p1, v1, La33/d;->x:Ljava/lang/Object;

    check-cast p1, Lio/getstream/android/video/generated/apis/ProductvideoApi;

    new-instance v1, Lio/getstream/android/video/generated/models/ReportClientEventRequest;

    invoke-direct {v1, v0}, Lio/getstream/android/video/generated/models/ReportClientEventRequest;-><init>(Ljava/util/List;)V

    iput v6, p0, La33/c;->x:I

    invoke-interface {p1, v1, p0}, Lio/getstream/android/video/generated/apis/ProductvideoApi;->reportClientCallEvent(Lio/getstream/android/video/generated/models/ReportClientEventRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_52

    goto :goto_2d

    :cond_52
    :goto_2c
    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :goto_2d
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
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
