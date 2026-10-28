.class public final Lrh/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lrh/t;

.field public final synthetic z:Lfi/i;


# direct methods
.method public synthetic constructor <init>(Lrh/t;Lfi/i;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lrh/r;->w:I

    iput-object p1, p0, Lrh/r;->y:Lrh/t;

    iput-object p2, p0, Lrh/r;->z:Lfi/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lrh/r;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lrh/r;

    iget-object v0, p0, Lrh/r;->z:Lfi/i;

    const/4 v1, 0x1

    iget-object v2, p0, Lrh/r;->y:Lrh/t;

    invoke-direct {p1, v2, v0, p2, v1}, Lrh/r;-><init>(Lrh/t;Lfi/i;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lrh/r;

    iget-object v0, p0, Lrh/r;->z:Lfi/i;

    const/4 v1, 0x0

    iget-object v2, p0, Lrh/r;->y:Lrh/t;

    invoke-direct {p1, v2, v0, p2, v1}, Lrh/r;-><init>(Lrh/t;Lfi/i;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrh/r;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lrh/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrh/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrh/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lrh/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrh/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrh/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lrh/r;->w:I

    iget-object v1, p0, Lrh/r;->z:Lfi/i;

    iget-object v2, p0, Lrh/r;->y:Lrh/t;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lrh/r;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Lrh/r;->x:I

    sget p1, Lrh/t;->f:I

    invoke-virtual {v2, v1, v4, p0}, Lrh/t;->b(Lfi/i;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    move-object p1, v0

    :cond_2
    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lrh/r;->x:I

    if-eqz v5, :cond_4

    if-ne v5, v4, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, p0, Lrh/r;->x:I

    sget p1, Lrh/t;->f:I

    const/4 p1, 0x0

    invoke-virtual {v2, v1, p1, p0}, Lrh/t;->b(Lfi/i;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object p1, v0

    :cond_5
    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
