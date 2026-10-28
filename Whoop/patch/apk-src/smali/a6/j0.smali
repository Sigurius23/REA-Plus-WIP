.class public final La6/j0;
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
.method public constructor <init>(La6/k0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La6/j0;->w:I

    .line 1
    iput-object p1, p0, La6/j0;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p4, p0, La6/j0;->w:I

    iput-object p1, p0, La6/j0;->y:Ljava/lang/Object;

    iput-object p2, p0, La6/j0;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, La6/j0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/j0;

    iget-object v1, p0, La6/j0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/room/z0;

    iget-object v2, p0, La6/j0;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, p1, v3}, La6/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, La6/j0;

    iget-object v1, p0, La6/j0;->y:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, p0, La6/j0;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, p1, v3}, La6/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_1
    new-instance v0, La6/j0;

    iget-object v1, p0, La6/j0;->z:Ljava/lang/Object;

    check-cast v1, La6/k0;

    invoke-direct {v0, v1, p1}, La6/j0;-><init>(La6/k0;Lq83/d;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/j0;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, La6/j0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/j0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, La6/j0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/j0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1}, La6/j0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/j0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, La6/j0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La6/j0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/j0;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/room/z0;

    iget-object v1, p0, La6/j0;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v3, Landroidx/lifecycle/e1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v1, v4}, Landroidx/lifecycle/e1;-><init>(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput v2, p0, La6/j0;->x:I

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v3, p0}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, La6/j0;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/j0;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-ne v2, v4, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/j0;->y:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    sget-object v2, Lfc3/b;->b:Lhc3/x;

    iget-object v5, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-ne v5, v2, :cond_5

    move-object v5, v3

    :cond_5
    iput v4, p0, La6/j0;->x:I

    invoke-interface {p1, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    iput-object v3, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v1

    :pswitch_1
    iget-object v0, p0, La6/j0;->z:Ljava/lang/Object;

    check-cast v0, La6/k0;

    iget-object v1, v0, La6/k0;->b:La6/y0;

    iget-object v0, v0, La6/k0;->a:Ljava/io/File;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La6/j0;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_9

    if-eq v3, v5, :cond_8

    if-ne v3, v4, :cond_7

    iget-object v1, p0, La6/j0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/io/FileInputStream;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception p1

    goto :goto_7

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object v3, p0, La6/j0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/io/FileInputStream;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_5

    :cond_9
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    iput-object v3, p0, La6/j0;->y:Ljava/lang/Object;

    iput v5, p0, La6/j0;->x:I

    invoke-interface {v1, v3}, La6/y0;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p1, v2, :cond_a

    goto :goto_9

    :cond_a
    :goto_3
    :try_start_4
    invoke-static {v3, v6}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_4
    move-object v2, p1

    goto :goto_9

    :goto_5
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v5

    :try_start_6
    invoke-static {v3, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_d

    :try_start_7
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    :try_start_8
    iput-object p1, p0, La6/j0;->y:Ljava/lang/Object;

    iput v4, p0, La6/j0;->x:I

    invoke-interface {v1, p1}, La6/y0;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-ne v1, v2, :cond_b

    goto :goto_9

    :cond_b
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_6
    :try_start_9
    invoke-static {v1, v6}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_8

    :catchall_3
    move-exception v1

    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_7
    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v2

    :try_start_b
    invoke-static {v1, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    :goto_8
    instance-of v1, p1, Ljava/io/FileNotFoundException;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ljava/io/FileNotFoundException;

    invoke-static {v0, p1}, Lse/h;->V(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    move-result-object p1

    :cond_c
    throw p1

    :cond_d
    invoke-interface {v1}, La6/y0;->a()Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    :goto_9
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
