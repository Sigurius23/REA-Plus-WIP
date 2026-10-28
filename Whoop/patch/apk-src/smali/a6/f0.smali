.class public final La6/f0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La6/i0;Lq83/j;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La6/f0;->w:I

    .line 1
    iput-object p1, p0, La6/f0;->z:Ljava/lang/Object;

    iput-object p2, p0, La6/f0;->E:Ljava/lang/Object;

    iput-object p3, p0, La6/f0;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(La6/r0;Ljava/lang/Object;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La6/f0;->w:I

    .line 2
    iput-object p1, p0, La6/f0;->F:Ljava/lang/Object;

    iput-object p2, p0, La6/f0;->y:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, La6/f0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La6/f0;

    iget-object v1, p0, La6/f0;->F:Ljava/lang/Object;

    check-cast v1, La6/r0;

    iget-object v2, p0, La6/f0;->y:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, p1}, La6/f0;-><init>(La6/r0;Ljava/lang/Object;Lq83/d;)V

    return-object v0

    :pswitch_0
    new-instance v0, La6/f0;

    iget-object v1, p0, La6/f0;->z:Ljava/lang/Object;

    check-cast v1, La6/i0;

    iget-object v2, p0, La6/f0;->E:Ljava/lang/Object;

    check-cast v2, Lq83/j;

    iget-object v3, p0, La6/f0;->F:Ljava/lang/Object;

    check-cast v3, Lc93/m;

    invoke-direct {v0, v1, v2, v3, p1}, La6/f0;-><init>(La6/i0;Lq83/j;Lc93/m;Lq83/d;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/f0;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, La6/f0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, La6/f0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, La6/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, La6/f0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La6/f0;->F:Ljava/lang/Object;

    check-cast v0, La6/r0;

    iget-object v1, v0, La6/k0;->a:Ljava/io/File;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La6/f0;->x:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v0, p0, La6/f0;->E:Ljava/lang/Object;

    check-cast v0, Ljava/io/FileOutputStream;

    iget-object v2, p0, La6/f0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/io/FileOutputStream;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iget-object v3, p0, La6/f0;->y:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget-object v0, v0, La6/k0;->b:La6/y0;

    new-instance v6, La6/i1;

    invoke-direct {v6, p1}, La6/i1;-><init>(Ljava/io/FileOutputStream;)V

    iput-object p1, p0, La6/f0;->z:Ljava/lang/Object;

    iput-object p1, p0, La6/f0;->E:Ljava/lang/Object;

    iput v5, p0, La6/f0;->x:I

    invoke-interface {v0, v6, v3}, La6/y0;->c(Ljava/io/OutputStream;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v4, v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p1

    move-object v2, v0

    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p1, 0x0

    :try_start_4
    invoke-static {v2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object v2, v4

    :goto_1
    return-object v2

    :catch_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, p1

    move-object p1, v0

    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-static {v2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :goto_3
    instance-of v0, p1, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ljava/io/FileNotFoundException;

    invoke-static {v0, p1}, Lse/h;->V(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    move-result-object p1

    :cond_3
    throw p1

    :pswitch_0
    iget-object v0, p0, La6/f0;->z:Ljava/lang/Object;

    check-cast v0, La6/i0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La6/f0;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_7

    if-eq v2, v5, :cond_6

    if-eq v2, v4, :cond_5

    if-ne v2, v3, :cond_4

    iget-object v1, p0, La6/f0;->y:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_7

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v2, p0, La6/f0;->y:Ljava/lang/Object;

    check-cast v2, La6/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v5, p0, La6/f0;->x:I

    invoke-static {v0, v5, p0}, La6/i0;->g(La6/i0;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_8
    :goto_4
    move-object v2, p1

    check-cast v2, La6/b;

    iget-object p1, p0, La6/f0;->E:Ljava/lang/Object;

    check-cast p1, Lq83/j;

    new-instance v6, La6/c;

    iget-object v7, p0, La6/f0;->F:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-direct {v6, v7, v2, v8, v9}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v2, p0, La6/f0;->y:Ljava/lang/Object;

    iput v4, p0, La6/f0;->x:I

    invoke-static {p1, v6, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_7

    :cond_9
    :goto_5
    iget-object v4, v2, La6/b;->b:Ljava/lang/Object;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_6

    :cond_a
    const/4 v4, 0x0

    :goto_6
    iget v6, v2, La6/b;->c:I

    if-ne v4, v6, :cond_c

    iget-object v2, v2, La6/b;->b:Ljava/lang/Object;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    iput-object p1, p0, La6/f0;->y:Ljava/lang/Object;

    iput v3, p0, La6/f0;->x:I

    invoke-virtual {v0, p1, v5, p0}, La6/i0;->j(Ljava/lang/Object;ZLs83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_b

    goto :goto_7

    :cond_b
    move-object v1, p1

    :goto_7
    return-object v1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
