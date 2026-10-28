.class public final synthetic Lvo1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;I)V
    .locals 0

    iput p2, p0, Lvo1/i;->w:I

    iput-object p1, p0, Lvo1/i;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvo1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvo1/i;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;->B(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvo1/i;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;->z(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvo1/i;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;->A(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
