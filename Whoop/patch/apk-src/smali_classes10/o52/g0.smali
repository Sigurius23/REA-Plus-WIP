.class public final synthetic Lo52/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/realtime/presentation/j;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/j;I)V
    .locals 0

    iput p2, p0, Lo52/g0;->w:I

    iput-object p1, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo52/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Z(Lcom/whoop/realtime/presentation/j;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/j;->I(Lcom/whoop/realtime/presentation/j;Landroidx/lifecycle/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/j;->Q(Lcom/whoop/realtime/presentation/j;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    check-cast p1, Lcom/whoop/realtime/presentation/c$a;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/j;->E(Lcom/whoop/realtime/presentation/j;Lcom/whoop/realtime/presentation/c$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    check-cast p1, Lcom/whoop/realtime/presentation/c$a;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/j;->P(Lcom/whoop/realtime/presentation/j;Lcom/whoop/realtime/presentation/c$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lo52/g0;->x:Lcom/whoop/realtime/presentation/j;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/j;->F(Lcom/whoop/realtime/presentation/j;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
