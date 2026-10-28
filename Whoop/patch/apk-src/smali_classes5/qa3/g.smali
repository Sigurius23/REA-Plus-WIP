.class public final Lqa3/g;
.super Lwa3/k;
.source "SourceFile"

# interfaces
.implements Lwa3/w;


# instance fields
.field public E:I

.field public final synthetic x:I

.field public y:I

.field public z:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqa3/g;->x:I

    invoke-direct {p0}, Lwa3/k;-><init>()V

    return-void
.end method

.method public static l()Lqa3/g;
    .locals 2

    new-instance v0, Lqa3/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqa3/g;-><init>(I)V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/g;->z:Ljava/util/List;

    const/4 v1, -0x1

    iput v1, v0, Lqa3/g;->E:I

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqa3/g;->x:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lqa3/g;->l()Lqa3/g;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/g;->o(Lqa3/c1;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lqa3/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqa3/g;-><init>(I)V

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lqa3/g;->z:Ljava/util/List;

    invoke-virtual {p0}, Lqa3/g;->j()Lqa3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/g;->n(Lqa3/h;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Lwa3/v;
    .locals 2

    iget v0, p0, Lqa3/g;->x:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/c1;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lqa3/g;->j()Lqa3/h;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/h;->b()Z

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

    iget v0, p0, Lqa3/g;->x:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lqa3/c1;->H:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/c1;

    invoke-direct {v1, p1, p2}, Lqa3/c1;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/g;->o(Lqa3/c1;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/c1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lqa3/g;->o(Lqa3/c1;)V

    :cond_0
    throw p1

    :pswitch_0
    const/4 v0, 0x0

    :try_start_3
    sget-object v1, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v1, p1, p2}, Lqa3/a;->a(Lwa3/f;Lwa3/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqa3/h;
    :try_end_3
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p0, p1}, Lqa3/g;->n(Lqa3/h;)V

    return-object p0

    :catchall_2
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_4
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/h;
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

    invoke-virtual {p0, v0}, Lqa3/g;->n(Lqa3/h;)V

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

    iget v0, p0, Lqa3/g;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lqa3/c1;

    invoke-virtual {p0, p1}, Lqa3/g;->o(Lqa3/c1;)V

    return-object p0

    :pswitch_0
    check-cast p1, Lqa3/h;

    invoke-virtual {p0, p1}, Lqa3/g;->n(Lqa3/h;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j()Lqa3/h;
    .locals 4

    new-instance v0, Lqa3/h;

    invoke-direct {v0, p0}, Lqa3/h;-><init>(Lqa3/g;)V

    iget v1, p0, Lqa3/g;->y:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/g;->E:I

    iput v2, v0, Lqa3/h;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lqa3/g;->z:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lqa3/g;->z:Ljava/util/List;

    iget v1, p0, Lqa3/g;->y:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lqa3/g;->y:I

    :cond_1
    iget-object v1, p0, Lqa3/g;->z:Ljava/util/List;

    iput-object v1, v0, Lqa3/h;->z:Ljava/util/List;

    iput v3, v0, Lqa3/h;->x:I

    return-object v0
.end method

.method public k()Lqa3/c1;
    .locals 4

    new-instance v0, Lqa3/c1;

    invoke-direct {v0, p0}, Lqa3/c1;-><init>(Lqa3/g;)V

    iget v1, p0, Lqa3/g;->y:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lqa3/g;->z:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/g;->z:Ljava/util/List;

    iget v2, p0, Lqa3/g;->y:I

    and-int/lit8 v2, v2, -0x2

    iput v2, p0, Lqa3/g;->y:I

    :cond_0
    iget-object v2, p0, Lqa3/g;->z:Ljava/util/List;

    iput-object v2, v0, Lqa3/c1;->y:Ljava/util/List;

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget v1, p0, Lqa3/g;->E:I

    iput v1, v0, Lqa3/c1;->z:I

    iput v3, v0, Lqa3/c1;->x:I

    return-object v0
.end method

.method public n(Lqa3/h;)V
    .locals 3

    sget-object v0, Lqa3/h;->G:Lqa3/h;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/h;->x:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    iget v0, p1, Lqa3/h;->y:I

    iget v2, p0, Lqa3/g;->y:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/g;->y:I

    iput v0, p0, Lqa3/g;->E:I

    :cond_1
    iget-object v0, p1, Lqa3/h;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lqa3/h;->z:Ljava/util/List;

    iput-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    iget v0, p0, Lqa3/g;->y:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lqa3/g;->y:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lqa3/g;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/g;->z:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    iget v0, p0, Lqa3/g;->y:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/g;->y:I

    :cond_3
    iget-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    iget-object v1, p1, Lqa3/h;->z:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    :goto_0
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/h;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method

.method public o(Lqa3/c1;)V
    .locals 3

    sget-object v0, Lqa3/c1;->G:Lqa3/c1;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lqa3/c1;->y:Ljava/util/List;

    iput-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    iget v0, p0, Lqa3/g;->y:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lqa3/g;->y:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lqa3/g;->y:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/g;->z:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    iget v0, p0, Lqa3/g;->y:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/g;->y:I

    :cond_2
    iget-object v0, p0, Lqa3/g;->z:Ljava/util/List;

    iget-object v2, p1, Lqa3/c1;->y:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    iget v0, p1, Lqa3/c1;->x:I

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_4

    iget v0, p1, Lqa3/c1;->z:I

    iget v1, p0, Lqa3/g;->y:I

    or-int/lit8 v1, v1, 0x2

    iput v1, p0, Lqa3/g;->y:I

    iput v0, p0, Lqa3/g;->E:I

    :cond_4
    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/c1;->w:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
