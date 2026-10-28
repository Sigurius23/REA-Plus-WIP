.class public final Lg1/q7;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public synthetic x:Z

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/q7;->w:I

    .line 1
    iput-object p1, p0, Lg1/q7;->y:Ljava/lang/Object;

    iput-object p2, p0, Lg1/q7;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg1/q7;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(ZLbc3/c0;Ljava/util/List;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/q7;->w:I

    .line 2
    iput-boolean p1, p0, Lg1/q7;->x:Z

    iput-object p2, p0, Lg1/q7;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg1/q7;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Lg1/q7;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lg1/q7;

    iget-boolean v1, p0, Lg1/q7;->x:Z

    iget-object v2, p0, Lg1/q7;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, p0, Lg1/q7;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, p2}, Lg1/q7;-><init>(ZLbc3/c0;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lg1/q7;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lg1/q7;

    iget-object v1, p0, Lg1/q7;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lg1/q7;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-object v3, p0, Lg1/q7;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-direct {v0, v1, v2, v3, p2}, Lg1/q7;-><init>(Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lg1/q7;->x:Z

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/q7;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/r1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/q7;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/q7;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/q7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/q7;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/q7;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/q7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lg1/q7;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    iget-object v2, p0, Lg1/q7;->E:Ljava/lang/Object;

    iget-object v3, p0, Lg1/q7;->z:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/q7;->y:Ljava/lang/Object;

    check-cast p1, Lp1/r1;

    iget-boolean v0, p0, Lg1/q7;->x:Z

    if-nez v0, :cond_0

    check-cast v3, Lbc3/c0;

    new-instance v0, Lcz/d;

    check-cast v2, Ljava/util/List;

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-direct {v0, v2, p1, v5, v4}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v3, v5, v5, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lg1/q7;->x:Z

    iget-object v0, p0, Lg1/q7;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    sget v4, Lg1/r7;->a:F

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eq v0, p1, :cond_2

    check-cast v3, Lp1/c1;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v2, Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v2, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
