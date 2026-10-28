.class public final Lg1/x;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ll83/e;


# direct methods
.method public constructor <init>(Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/x;->w:I

    .line 1
    iput-object p1, p0, Lg1/x;->z:Ll83/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lg1/z;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/x;->w:I

    .line 2
    iput-object p1, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lg1/x;->z:Ll83/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lg1/z;Lc93/m;Lq83/d;B)V
    .locals 0

    const/4 p4, 0x2

    iput p4, p0, Lg1/x;->w:I

    .line 3
    iput-object p1, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lg1/x;->z:Ll83/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg1/x;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm1/f;

    check-cast p2, Lm1/b0;

    check-cast p3, Lq83/d;

    new-instance p1, Lg1/x;

    iget-object p2, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p2, Lg1/z;

    iget-object v0, p0, Lg1/x;->z:Ll83/e;

    check-cast v0, Ls83/i;

    const/4 v1, 0x0

    invoke-direct {p1, p2, v0, p3, v1}, Lg1/x;-><init>(Lg1/z;Lc93/m;Lq83/d;B)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly00/o4;

    check-cast p2, Lh20/a;

    check-cast p3, Lq83/d;

    new-instance p1, Lg1/x;

    iget-object v0, p0, Lg1/x;->z:Ll83/e;

    check-cast v0, Lc93/m;

    invoke-direct {p1, v0, p3}, Lg1/x;-><init>(Lc93/m;Lq83/d;)V

    iput-object p2, p1, Lg1/x;->y:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lg1/w;

    check-cast p2, Lg1/k3;

    check-cast p3, Lq83/d;

    new-instance p1, Lg1/x;

    iget-object p2, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p2, Lg1/z;

    iget-object v0, p0, Lg1/x;->z:Ll83/e;

    check-cast v0, Ls83/i;

    invoke-direct {p1, p2, v0, p3}, Lg1/x;-><init>(Lg1/z;Lc93/m;Lq83/d;)V

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg1/x;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/x;->x:I

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

    iget-object p1, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p1, Lg1/z;

    iget-object p1, p1, Lg1/z;->b:Lh0/g1;

    check-cast p1, Lg1/y;

    iget-object v1, p0, Lg1/x;->z:Ll83/e;

    check-cast v1, Ls83/i;

    iput v2, p0, Lg1/x;->x:I

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/x;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p1, Lh20/a;

    iget-object v1, p0, Lg1/x;->z:Ll83/e;

    check-cast v1, Lc93/m;

    iput v2, p0, Lg1/x;->x:I

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    move-object p1, v0

    :cond_5
    :goto_2
    return-object p1

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/x;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/x;->y:Ljava/lang/Object;

    check-cast p1, Lg1/z;

    iget-object p1, p1, Lg1/z;->b:Lh0/g1;

    check-cast p1, Lg1/y;

    iget-object v1, p0, Lg1/x;->z:Ll83/e;

    check-cast v1, Ls83/i;

    iput v2, p0, Lg1/x;->x:I

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
