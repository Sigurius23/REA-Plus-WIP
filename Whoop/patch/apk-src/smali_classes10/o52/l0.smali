.class public final synthetic Lo52/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/realtime/presentation/StartActivityActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V
    .locals 0

    iput p2, p0, Lo52/l0;->w:I

    iput-object p1, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lo52/l0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {p1, v0, v1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->e0(Lcom/whoop/realtime/presentation/StartActivityActivity;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->i0(Lcom/whoop/realtime/presentation/StartActivityActivity;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Lpg3/v0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->V(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Lpg3/v0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->m0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Ltp/k;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->R(Lcom/whoop/realtime/presentation/StartActivityActivity;Ltp/k;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Lo52/t0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->s0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lo52/t0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Llm2/b;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->W(Lcom/whoop/realtime/presentation/StartActivityActivity;Llm2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->T(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {p1, v0, v1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->b0(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lo52/l0;->x:Lcom/whoop/realtime/presentation/StartActivityActivity;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->O(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p1

    return-object p1

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
