.class public final Lp6/f0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Lp6/l;

.field public synthetic z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lp6/f0;->w:I

    const/4 v0, 0x0

    const/4 v1, 0x4

    .line 1
    invoke-direct {p0, v1, v0}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(IILq83/d;)V
    .locals 0

    .line 2
    iput p2, p0, Lp6/f0;->w:I

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lp6/f0;->w:I

    check-cast p1, Lx6/k;

    check-cast p2, Lp6/l;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p4, Lq83/d;

    packed-switch v0, :pswitch_data_0

    new-instance p3, Lp6/f0;

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-direct {p3, v0, v1, p4}, Lp6/f0;-><init>(IILq83/d;)V

    iput-object p2, p3, Lp6/f0;->y:Lp6/l;

    iput-boolean p1, p3, Lp6/f0;->z:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p3, p1}, Lp6/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance p3, Lp6/f0;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p3, v0, v1, p4}, Lp6/f0;-><init>(IILq83/d;)V

    iput-object p2, p3, Lp6/f0;->y:Lp6/l;

    iput-boolean p1, p3, Lp6/f0;->z:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p3, p1}, Lp6/f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lp6/f0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp6/f0;->x:I

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

    iget-object p1, p0, Lp6/f0;->y:Lp6/l;

    iget-boolean v1, p0, Lp6/f0;->z:Z

    if-eqz v1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iput v2, p0, Lp6/f0;->x:I

    invoke-virtual {p1, p0}, Lp6/l;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    move-object p1, v0

    :cond_3
    :goto_0
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp6/f0;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4
    move-object v0, v2

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/f0;->y:Lp6/l;

    iget-boolean v1, p0, Lp6/f0;->z:Z

    if-eqz v1, :cond_4

    iput v3, p0, Lp6/f0;->x:I

    sget-object v1, Lp6/f;->a:Lp6/f;

    invoke-virtual {p1, v1, p0}, Lp6/l;->e(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_1

    :cond_7
    move-object p1, v2

    :goto_1
    if-ne p1, v0, :cond_4

    :goto_2
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
