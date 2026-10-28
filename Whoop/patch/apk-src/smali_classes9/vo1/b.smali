.class public final synthetic Lvo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;I)V
    .locals 0

    iput p2, p0, Lvo1/b;->w:I

    iput-object p1, p0, Lvo1/b;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvo1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvo1/b;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->C(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvo1/b;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->B(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvo1/b;->x:Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;->y(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
