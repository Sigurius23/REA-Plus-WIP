.class public final synthetic Lvo1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;I)V
    .locals 0

    iput p2, p0, Lvo1/e;->w:I

    iput-object p1, p0, Lvo1/e;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvo1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvo1/e;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;->y(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvo1/e;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;

    check-cast p1, Lso1/v;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;->A(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciCyclesFragment;Lso1/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
