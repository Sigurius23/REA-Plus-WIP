.class public final Lg1/s;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/m;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lg1/s;->w:I

    iput-object p1, p0, Lg1/s;->z:Lc93/a;

    iput-object p2, p0, Lg1/s;->E:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Lg1/s;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lg1/s;

    iget-object v1, p0, Lg1/s;->E:Lc93/m;

    const/4 v2, 0x1

    iget-object v3, p0, Lg1/s;->z:Lc93/a;

    invoke-direct {v0, v3, v1, p2, v2}, Lg1/s;-><init>(Lc93/a;Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Lg1/s;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lg1/s;

    iget-object v1, p0, Lg1/s;->E:Lc93/m;

    const/4 v2, 0x0

    iget-object v3, p0, Lg1/s;->z:Lc93/a;

    invoke-direct {v0, v3, v1, p2, v2}, Lg1/s;-><init>(Lc93/a;Lc93/m;Lq83/d;I)V

    iput-object p1, v0, Lg1/s;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/s;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lg1/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lg1/s;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/s;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg1/s;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/s;->x:I

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

    iget-object p1, p0, Lg1/s;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, p0, Lg1/s;->z:Lc93/a;

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v3

    new-instance v4, Lg1/r;

    iget-object v5, p0, Lg1/s;->E:Lc93/m;

    const/4 v6, 0x1

    invoke-direct {v4, v1, p1, v5, v6}, Lg1/r;-><init>(Lkotlin/jvm/internal/g0;Lbc3/c0;Lc93/m;I)V

    iput v2, p0, Lg1/s;->x:I

    invoke-virtual {v3, v4, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

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

    iget v1, p0, Lg1/s;->x:I

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

    iget-object p1, p0, Lg1/s;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, p0, Lg1/s;->z:Lc93/a;

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object v3

    new-instance v4, Lg1/r;

    iget-object v5, p0, Lg1/s;->E:Lc93/m;

    const/4 v6, 0x0

    invoke-direct {v4, v1, p1, v5, v6}, Lg1/r;-><init>(Lkotlin/jvm/internal/g0;Lbc3/c0;Lc93/m;I)V

    iput v2, p0, Lg1/s;->x:I

    invoke-virtual {v3, v4, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
