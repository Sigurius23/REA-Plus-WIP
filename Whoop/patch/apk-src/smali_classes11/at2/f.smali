.class public final synthetic Lat2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;I)V
    .locals 0

    iput p2, p0, Lat2/f;->w:I

    iput-object p1, p0, Lat2/f;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lat2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/f;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;->D(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/f;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;->C(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lat2/f;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;->B(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
