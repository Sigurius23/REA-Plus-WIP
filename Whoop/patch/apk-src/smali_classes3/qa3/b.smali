.class public final Lqa3/b;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic x:I

.field public y:I

.field public z:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqa3/b;->x:I

    invoke-direct {p0}, Lwa3/k;-><init>()V

    return-void
.end method

.method public static j()Lqa3/b;
    .locals 2

    new-instance v0, Lqa3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/b;-><init>(I)V

    sget-object v1, Lwa3/e;->w:Lwa3/u;

    iput-object v1, v0, Lqa3/b;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public static k()Lqa3/b;
    .locals 2

    new-instance v0, Lqa3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqa3/b;-><init>(I)V

    sget-object v1, Lqa3/e;->P:Lqa3/e;

    iput-object v1, v0, Lqa3/b;->E:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqa3/b;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lqa3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/b;-><init>(I)V

    sget-object v1, Lwa3/e;->w:Lwa3/u;

    iput-object v1, v0, Lqa3/b;->E:Ljava/lang/Object;

    invoke-virtual {p0}, Lqa3/b;->n()Lqa3/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/b;->p(Lqa3/m;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lqa3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqa3/b;-><init>(I)V

    sget-object v1, Lqa3/e;->P:Lqa3/e;

    iput-object v1, v0, Lqa3/b;->E:Ljava/lang/Object;

    invoke-virtual {p0}, Lqa3/b;->l()Lqa3/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/b;->o(Lqa3/f;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Lwa3/v;
    .locals 2

    iget v0, p0, Lqa3/b;->x:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lqa3/b;->n()Lqa3/m;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/m;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lqa3/b;->l()Lqa3/f;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/f;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 2

    iget v0, p0, Lqa3/b;->x:I

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x0

    :try_start_0
    sget-object v0, Lqa3/m;->H:Lqa3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lqa3/m;

    invoke-direct {v0, p1}, Lqa3/m;-><init>(Lwa3/f;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lqa3/b;->p(Lqa3/m;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast v0, Lqa3/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lqa3/b;->p(Lqa3/m;)V

    :cond_0
    throw p1

    :pswitch_0
    const/4 v0, 0x0

    :try_start_3
    sget-object v1, Lqa3/f;->H:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/f;

    invoke-direct {v1, p1, p2}, Lqa3/f;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_3
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p0, v1}, Lqa3/b;->o(Lqa3/f;)V

    return-object p0

    :catchall_2
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_4
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/f;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception p1

    move-object v0, p2

    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lqa3/b;->o(Lqa3/f;)V

    :cond_1
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 1

    iget v0, p0, Lqa3/b;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lqa3/m;

    invoke-virtual {p0, p1}, Lqa3/b;->p(Lqa3/m;)V

    return-object p0

    :pswitch_0
    check-cast p1, Lqa3/f;

    invoke-virtual {p0, p1}, Lqa3/b;->o(Lqa3/f;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l()Lqa3/f;
    .locals 4

    new-instance v0, Lqa3/f;

    invoke-direct {v0, p0}, Lqa3/f;-><init>(Lqa3/b;)V

    iget v1, p0, Lqa3/b;->y:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/b;->z:I

    iput v2, v0, Lqa3/f;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v1, p0, Lqa3/b;->E:Ljava/lang/Object;

    check-cast v1, Lqa3/e;

    iput-object v1, v0, Lqa3/f;->z:Lqa3/e;

    iput v3, v0, Lqa3/f;->x:I

    return-object v0
.end method

.method public n()Lqa3/m;
    .locals 4

    new-instance v0, Lqa3/m;

    invoke-direct {v0, p0}, Lqa3/m;-><init>(Lqa3/b;)V

    iget v1, p0, Lqa3/b;->y:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/b;->z:I

    iput v2, v0, Lqa3/m;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v1, p0, Lqa3/b;->E:Ljava/lang/Object;

    check-cast v1, Lwa3/u;

    iput-object v1, v0, Lqa3/m;->z:Lwa3/u;

    iput v3, v0, Lqa3/m;->x:I

    return-object v0
.end method

.method public o(Lqa3/f;)V
    .locals 4

    sget-object v0, Lqa3/f;->G:Lqa3/f;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/f;->x:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/f;->y:I

    iget v3, p0, Lqa3/b;->y:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/b;->y:I

    iput v1, p0, Lqa3/b;->z:I

    :cond_1
    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lqa3/f;->z:Lqa3/e;

    iget v2, p0, Lqa3/b;->y:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_2

    iget-object v2, p0, Lqa3/b;->E:Ljava/lang/Object;

    check-cast v2, Lqa3/e;

    sget-object v3, Lqa3/e;->P:Lqa3/e;

    if-eq v2, v3, :cond_2

    invoke-static {v2}, Lqa3/e;->j(Lqa3/e;)Lqa3/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa3/c;->l(Lqa3/e;)V

    invoke-virtual {v2}, Lqa3/c;->j()Lqa3/e;

    move-result-object v0

    iput-object v0, p0, Lqa3/b;->E:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lqa3/b;->E:Ljava/lang/Object;

    :goto_0
    iget v0, p0, Lqa3/b;->y:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/b;->y:I

    :cond_3
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/f;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method

.method public p(Lqa3/m;)V
    .locals 4

    sget-object v0, Lqa3/m;->G:Lqa3/m;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/m;->x:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/m;->y:I

    iget v3, p0, Lqa3/b;->y:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/b;->y:I

    iput v1, p0, Lqa3/b;->z:I

    :cond_1
    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lqa3/m;->z:Lwa3/u;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, p0, Lqa3/b;->y:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/b;->y:I

    iput-object v0, p0, Lqa3/b;->E:Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/m;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
