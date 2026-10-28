.class public final synthetic Lvo1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;I)V
    .locals 0

    iput p2, p0, Lvo1/v;->w:I

    iput-object p1, p0, Lvo1/v;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvo1/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvo1/v;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->y(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvo1/v;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;

    check-cast p1, Lro1/j;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->z(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lro1/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lvo1/v;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;

    check-cast p1, Lto1/m;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->D(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lto1/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
