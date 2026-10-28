.class public final synthetic Lsl0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lsl0/f;->w:I

    iput-object p1, p0, Lsl0/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    check-cast p1, Lq3/y;

    invoke-static {v0, p1}, Lsl0/p3;->f(Lp1/t2;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Lql0/c;

    check-cast p1, Lp1/i0;

    invoke-static {v0, p1}, Lsl0/p3;->h(Lql0/c;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lsl0/g3;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/models/feedback/FeedbackReason;

    check-cast p1, Lcom/whoop/bot/models/feedback/FeedbackReason;

    invoke-static {v0, p1}, Lsl0/u2;->g(Lcom/whoop/bot/models/feedback/FeedbackReason;Lcom/whoop/bot/models/feedback/FeedbackReason;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    check-cast p1, Lcom/whoop/bot/models/feedback/FeedbackReason;

    invoke-static {v0, p1}, Lsl0/u2;->l(Lz1/p;Lcom/whoop/bot/models/feedback/FeedbackReason;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lsl0/p2;->f(Lc93/m;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lsl0/f;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    check-cast p1, Lu0/p0;

    invoke-static {v0, p1}, Lsl0/i;->a(Lc93/a;Lu0/p0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
