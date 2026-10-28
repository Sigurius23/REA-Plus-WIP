.class public final Ld30/e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ld30/h;


# direct methods
.method public synthetic constructor <init>(Ld30/h;Lq83/d;I)V
    .locals 0

    iput p3, p0, Ld30/e;->w:I

    iput-object p1, p0, Ld30/e;->y:Ld30/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    iget p1, p0, Ld30/e;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ld30/e;

    iget-object v0, p0, Ld30/e;->y:Ld30/h;

    const/4 v1, 0x1

    invoke-direct {p1, v0, p2, v1}, Ld30/e;-><init>(Ld30/h;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ld30/e;

    iget-object v0, p0, Ld30/e;->y:Ld30/h;

    const/4 v1, 0x0

    invoke-direct {p1, v0, p2, v1}, Ld30/e;-><init>(Ld30/h;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld30/e;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ld30/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld30/e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld30/e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld30/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ld30/e;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld30/e;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld30/e;->y:Ld30/h;

    iget-object v1, p1, Ld30/h;->b:Ljava/lang/Object;

    check-cast v1, Lec3/f2;

    new-instance v3, Ld30/d;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, Ld30/d;-><init>(Ld30/h;I)V

    iput v2, p0, Ld30/e;->x:I

    invoke-interface {v1, v3, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld30/e;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v2, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld30/e;->y:Ld30/h;

    iget-object v1, p1, Ld30/h;->j:Ljava/lang/Object;

    check-cast v1, Ln53/e;

    new-instance v3, Ld30/d;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Ld30/d;-><init>(Ld30/h;I)V

    iput v2, p0, Ld30/e;->x:I

    invoke-virtual {v1, v3, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
