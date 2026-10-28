.class public final synthetic Lsl0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lsl0/a0;->w:I

    iput-object p2, p0, Lsl0/a0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/a0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 2
    iput p4, p0, Lsl0/a0;->w:I

    iput-object p1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/a0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsl0/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lf0/r1;

    invoke-static {v0, v1}, Lsl0/s3;->a(Lbc3/c0;Lf0/r1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v0, Lq2/a;

    iget-object v1, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-static {v0, v1}, Lsl0/y2;->b(Lq2/a;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lnl0/i;

    invoke-static {v0, v1}, Lsl0/p1;->d(Lkotlin/jvm/functions/Function1;Lnl0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lg1/y3;

    invoke-static {v0, v1}, Lsl0/u0;->e(Lbc3/c0;Lg1/y3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lsl0/o0;->c(Lc93/m;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/bot/view/AiConversationFragment;->E(Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v0, Lsl0/q;

    iget-object v1, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v1, Lnl0/f;

    invoke-static {v0, v1}, Lsl0/w;->l(Lsl0/q;Lnl0/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lnl0/l;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lsl0/i;->q(Lnl0/l;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lnl0/l;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    invoke-static {v0, v1}, Lsl0/i;->g(Lnl0/l;Lc93/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Ly3/c;

    invoke-static {v0, v1}, Lsl0/o0$e;->f(Lp1/t2;Ly3/c;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lsl0/a0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lsl0/a0;->y:Ljava/lang/Object;

    check-cast v1, Lsl0/q;

    invoke-static {v0, v1}, Lsl0/w$l;->f(Lc93/a;Lsl0/q;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
