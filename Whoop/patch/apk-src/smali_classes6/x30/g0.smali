.class public final synthetic Lx30/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx30/p0;


# direct methods
.method public synthetic constructor <init>(Lx30/p0;I)V
    .locals 0

    iput p2, p0, Lx30/g0;->w:I

    iput-object p1, p0, Lx30/g0;->x:Lx30/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lx30/g0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly00/i;

    check-cast p2, Ljava/util/List;

    const-string v0, "allChoices"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/g0;->x:Lx30/p0;

    iget-object v1, v0, Lx30/p0;->d:Lux/a;

    iget-object v0, v0, Lx30/p0;->q:Ljava/util/List;

    const-string v2, "cardBrandFilter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "preferredBrands"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ly00/i;

    invoke-interface {v1, v6}, Lux/a;->o(Ly00/i;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v4, 0x1

    if-ne v1, v4, :cond_2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v4, :cond_2

    invoke-static {v3}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/i;

    goto :goto_2

    :cond_2
    sget-object v1, Ly00/i;->X:Ly00/i;

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v2, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-nez p1, :cond_7

    move-object p1, v1

    goto :goto_2

    :cond_4
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ly00/i;

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    move-object p1, v0

    check-cast p1, Ly00/i;

    if-nez p1, :cond_7

    sget-object p1, Ly00/i;->X:Ly00/i;

    :cond_7
    :goto_2
    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_8
    sget-object p2, Ly00/i;->M:Lt9/c0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lt9/c0;->h(Ljava/lang/String;)Ly00/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Ly00/i;->c(Ljava/lang/String;)I

    move-result p1

    :goto_3
    iget-object p2, p0, Lx30/g0;->x:Lx30/p0;

    iget-object p2, p2, Lx30/p0;->b:Lx30/y;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0xe

    if-eq p1, p2, :cond_a

    const/16 p2, 0xf

    if-eq p1, p2, :cond_a

    const/16 p2, 0x13

    if-eq p1, p2, :cond_9

    new-instance p1, Lx30/a0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    :cond_9
    new-instance p1, Lx30/c0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_4

    :cond_a
    new-instance p1, Lx30/b0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
