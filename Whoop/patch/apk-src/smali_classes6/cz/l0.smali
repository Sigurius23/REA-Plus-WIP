.class public final Lcz/l0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Boolean;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lcz/n0;

.field public final synthetic z:Lq20/w;


# direct methods
.method public synthetic constructor <init>(Lcz/n0;Lq20/w;Ljava/lang/Boolean;Lq83/d;I)V
    .locals 0

    iput p5, p0, Lcz/l0;->w:I

    iput-object p1, p0, Lcz/l0;->y:Lcz/n0;

    iput-object p2, p0, Lcz/l0;->z:Lq20/w;

    iput-object p3, p0, Lcz/l0;->E:Ljava/lang/Boolean;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lcz/l0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lcz/l0;

    iget-object v3, p0, Lcz/l0;->E:Ljava/lang/Boolean;

    const/4 v5, 0x1

    iget-object v1, p0, Lcz/l0;->y:Lcz/n0;

    iget-object v2, p0, Lcz/l0;->z:Lq20/w;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcz/l0;-><init>(Lcz/n0;Lq20/w;Ljava/lang/Boolean;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v4, p2

    new-instance v1, Lcz/l0;

    move-object v5, v4

    iget-object v4, p0, Lcz/l0;->E:Ljava/lang/Boolean;

    const/4 v6, 0x0

    iget-object v2, p0, Lcz/l0;->y:Lcz/n0;

    iget-object v3, p0, Lcz/l0;->z:Lq20/w;

    invoke-direct/range {v1 .. v6}, Lcz/l0;-><init>(Lcz/n0;Lq20/w;Ljava/lang/Boolean;Lq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcz/l0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lcz/l0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/l0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lcz/l0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcz/l0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcz/l0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lcz/l0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/l0;->x:I

    const/4 v2, 0x1

    const/4 v7, 0x0

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

    iget-object v4, p0, Lcz/l0;->y:Lcz/n0;

    iget-object p1, v4, Lcz/n0;->F:Lq83/j;

    new-instance v3, Lcz/l0;

    iget-object v6, p0, Lcz/l0;->E:Ljava/lang/Boolean;

    const/4 v8, 0x0

    iget-object v5, p0, Lcz/l0;->z:Lq20/w;

    invoke-direct/range {v3 .. v8}, Lcz/l0;-><init>(Lcz/n0;Lq20/w;Ljava/lang/Boolean;Lq83/d;I)V

    iput v2, p0, Lcz/l0;->x:I

    invoke-static {p1, v3, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    if-nez p1, :cond_3

    invoke-static {}, Lcom/squareup/wire/n;->x()V

    throw v7

    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcz/l0;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-eq v1, v3, :cond_5

    if-ne v1, v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lcz/l0;->x:I

    iget-object p1, p0, Lcz/l0;->y:Lcz/n0;

    iget-object p1, p1, Lcz/n0;->y:Lhm/d;

    invoke-virtual {p1, p0}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    move-object p1, v0

    :goto_1
    return-object p1

    :cond_7
    :goto_2
    if-nez p1, :cond_a

    iget-object p1, p0, Lcz/l0;->z:Lq20/w;

    if-eqz p1, :cond_9

    iget-object p1, p1, Lq20/w;->x:Ly00/o4;

    iget-object v0, p1, Ly00/o4;->w:Ljava/lang/String;

    invoke-virtual {p1}, Ly00/o4;->f()Z

    move-result v1

    if-nez v1, :cond_8

    iget-boolean p1, p1, Ly00/o4;->S:Z

    :cond_8
    const-string p1, "id"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    iget-object p1, p0, Lcz/l0;->E:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    iput v2, p0, Lcz/l0;->x:I

    const/4 p1, 0x0

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
