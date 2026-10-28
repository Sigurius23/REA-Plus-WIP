.class public final Lcz/d0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lcz/n0;


# direct methods
.method public synthetic constructor <init>(Lcz/n0;Lq83/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcz/d0;->w:I

    iput-object p1, p0, Lcz/d0;->y:Lcz/n0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcz/n0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcz/d0;->w:I

    .line 2
    iput-object p1, p0, Lcz/d0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcz/d0;->y:Lcz/n0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lcz/d0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lcz/d0;

    iget-object v0, p0, Lcz/d0;->x:Ljava/lang/Object;

    iget-object v1, p0, Lcz/d0;->y:Lcz/n0;

    invoke-direct {p1, v0, v1, p2}, Lcz/d0;-><init>(Ljava/lang/Object;Lcz/n0;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance v0, Lcz/d0;

    iget-object v1, p0, Lcz/d0;->y:Lcz/n0;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lcz/d0;-><init>(Lcz/n0;Lq83/d;I)V

    iput-object p1, v0, Lcz/d0;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Lcz/d0;

    iget-object v1, p0, Lcz/d0;->y:Lcz/n0;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lcz/d0;-><init>(Lcz/n0;Lq83/d;I)V

    iput-object p1, v0, Lcz/d0;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcz/d0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Lcz/e0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    check-cast p1, Lcz/r0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcz/d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcz/d0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lcz/d0;->y:Lcz/n0;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcz/d0;->x:Ljava/lang/Object;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, v2, Lcz/n0;->N:Lec3/h2;

    :cond_0
    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcz/z0;

    new-instance v3, Lcz/y0;

    invoke-direct {v3, v0}, Lcz/y0;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v2, p1, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v1

    :cond_1
    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_0
    iget-object v0, v2, Lcz/n0;->Q:Lec3/h2;

    sget-object v2, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcz/d0;->x:Ljava/lang/Object;

    check-cast p1, Lcz/e0;

    iget-boolean p1, p1, Lcz/e0;->g:Z

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-object v1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcz/d0;->x:Ljava/lang/Object;

    check-cast p1, Lcz/r0;

    iget-object v0, v2, Lcz/n0;->L:Lec3/h2;

    :cond_3
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/r0;

    if-eqz v6, :cond_4

    move-object v5, p1

    :cond_4
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v2, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
