.class public final synthetic Lsl0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lsl0/u;->w:I

    iput-object p2, p0, Lsl0/u;->x:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/u;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsl0/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/u;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lsl0/u;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/models/feedback/FeedbackReason;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lsl0/u2;->i(Lkotlin/jvm/functions/Function1;Lcom/whoop/bot/models/feedback/FeedbackReason;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/u;->x:Ljava/lang/Object;

    check-cast v0, Liz0/m;

    iget-object v1, p0, Lsl0/u;->y:Ljava/lang/Object;

    check-cast v1, Lzk0/i0;

    check-cast p1, Lk2/e;

    invoke-static {v0, v1, p1}, Lsl0/l2;->k(Liz0/m;Lzk0/i0;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/u;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lsl0/u;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, p1}, Lsl0/p1;->b(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsl0/u;->x:Ljava/lang/Object;

    check-cast v0, Lsl0/q;

    iget-object v1, p0, Lsl0/u;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    check-cast p1, Lp1/i0;

    invoke-static {v0, v1, p1}, Lsl0/w;->g(Lsl0/q;Lbc3/c0;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsl0/u;->x:Ljava/lang/Object;

    check-cast v0, Lsl0/q;

    iget-object v1, p0, Lsl0/u;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Lml0/a;

    invoke-static {v0, v1, p1}, Lsl0/w;->q(Lsl0/q;Lc93/a;Lml0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
