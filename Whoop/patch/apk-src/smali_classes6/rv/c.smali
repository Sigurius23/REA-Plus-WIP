.class public final Lrv/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lrv/m;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lm63/d;

.field public final synthetic z:Lec3/l;


# direct methods
.method public constructor <init>(Lec3/l;Lrv/m;Lm63/d;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lrv/c;->w:I

    .line 1
    iput-object p1, p0, Lrv/c;->z:Lec3/l;

    iput-object p2, p0, Lrv/c;->E:Lrv/m;

    iput-object p3, p0, Lrv/c;->y:Lm63/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lm63/d;Lec3/l;Lrv/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrv/c;->w:I

    .line 2
    iput-object p1, p0, Lrv/c;->y:Lm63/d;

    iput-object p2, p0, Lrv/c;->z:Lec3/l;

    iput-object p3, p0, Lrv/c;->E:Lrv/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lrv/c;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lrv/c;

    iget-object v0, p0, Lrv/c;->z:Lec3/l;

    iget-object v1, p0, Lrv/c;->E:Lrv/m;

    iget-object v2, p0, Lrv/c;->y:Lm63/d;

    invoke-direct {p1, v2, v0, v1, p2}, Lrv/c;-><init>(Lm63/d;Lec3/l;Lrv/m;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lrv/c;

    iget-object v0, p0, Lrv/c;->E:Lrv/m;

    iget-object v1, p0, Lrv/c;->y:Lm63/d;

    iget-object v2, p0, Lrv/c;->z:Lec3/l;

    invoke-direct {p1, v2, v0, v1, p2}, Lrv/c;-><init>(Lec3/l;Lrv/m;Lm63/d;Lq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrv/c;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lrv/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrv/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrv/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lrv/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrv/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrv/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lrv/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lrv/c;->x:I

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

    iget-object p1, p0, Lrv/c;->y:Lm63/d;

    iget-object v1, p1, Lm63/d;->E:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    new-instance v3, Lrv/f;

    const/4 v4, 0x0

    iget-object v5, p0, Lrv/c;->z:Lec3/l;

    invoke-direct {v3, v4, p1, v5}, Lrv/f;-><init>(Lq83/d;Lm63/d;Lec3/l;)V

    invoke-static {v1, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v1, Lrv/d;

    iget-object v3, p0, Lrv/c;->E:Lrv/m;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lrv/d;-><init>(Lrv/m;I)V

    iput v2, p0, Lrv/c;->x:I

    invoke-virtual {p1, v1, p0}, Lfc3/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

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

    iget v1, p0, Lrv/c;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v3, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v0, v2

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Landroidx/room/x;

    iget-object v1, p0, Lrv/c;->y:Lm63/d;

    const/16 v4, 0xd

    iget-object v5, p0, Lrv/c;->E:Lrv/m;

    invoke-direct {p1, v4, v5, v1}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, p0, Lrv/c;->x:I

    new-instance v1, Lw;

    const/16 v3, 0xd

    invoke-direct {v1, p1, v3}, Lw;-><init>(Lec3/m;I)V

    iget-object p1, p0, Lrv/c;->z:Lec3/l;

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    move-object p1, v2

    :goto_2
    if-ne p1, v0, :cond_3

    :goto_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
