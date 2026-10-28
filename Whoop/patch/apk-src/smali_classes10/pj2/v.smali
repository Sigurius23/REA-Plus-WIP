.class public final synthetic Lpj2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llj2/g;


# direct methods
.method public synthetic constructor <init>(Llj2/g;I)V
    .locals 0

    iput p2, p0, Lpj2/v;->w:I

    iput-object p1, p0, Lpj2/v;->x:Llj2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpj2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/v;->x:Llj2/g;

    check-cast p1, Llj2/f;

    invoke-static {v0, p1}, Lcom/whoop/stress/view/StressSessionFragment;->A(Llj2/g;Llj2/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpj2/v;->x:Llj2/g;

    check-cast p1, Llj2/e;

    invoke-static {v0, p1}, Lcom/whoop/stress/view/StressSessionFragment;->F(Llj2/g;Llj2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lpj2/v;->x:Llj2/g;

    check-cast p1, Llj2/e;

    invoke-static {v0, p1}, Lcom/whoop/stress/view/StressSessionFragment;->K(Llj2/g;Llj2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lpj2/v;->x:Llj2/g;

    invoke-static {v0, p1}, Lcom/whoop/stress/view/StressSessionFragment;->y(Llj2/g;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
