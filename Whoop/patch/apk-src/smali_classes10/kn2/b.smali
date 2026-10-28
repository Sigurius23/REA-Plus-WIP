.class public final synthetic Lkn2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/ui/views/LiveHeartRateView;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V
    .locals 0

    iput p2, p0, Lkn2/b;->w:I

    iput-object p1, p0, Lkn2/b;->x:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lkn2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkn2/b;->x:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-static {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->b(Lcom/whoop/ui/views/LiveHeartRateView;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lkn2/b;->x:Lcom/whoop/ui/views/LiveHeartRateView;

    check-cast p1, Lsj0/a;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->s(Lsj0/a;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lkn2/b;->x:Lcom/whoop/ui/views/LiveHeartRateView;

    check-cast p1, Lkk0/b;

    invoke-static {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->c(Lcom/whoop/ui/views/LiveHeartRateView;Lkk0/b;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lkn2/b;->x:Lcom/whoop/ui/views/LiveHeartRateView;

    check-cast p1, Ljava/lang/Byte;

    invoke-static {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->a(Lcom/whoop/ui/views/LiveHeartRateView;Ljava/lang/Byte;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
