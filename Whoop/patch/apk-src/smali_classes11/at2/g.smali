.class public final synthetic Lat2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;I)V
    .locals 0

    iput p2, p0, Lat2/g;->w:I

    iput-object p1, p0, Lat2/g;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lat2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/g;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    check-cast p1, Lws2/i;

    invoke-static {v0, p1}, Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;->A(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;Lws2/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat2/g;->x:Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;

    check-cast p1, Lls2/a;

    invoke-static {v0, p1}, Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;->z(Lcom/whoop/weeklyplan/customizeplan/view/CustomizePlanFragment;Lls2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
