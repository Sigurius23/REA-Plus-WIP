.class public final synthetic Lvp1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lvp1/i;->w:I

    iput-object p1, p0, Lvp1/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvp1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvp1/i;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;->A(Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvp1/i;->x:Ljava/lang/Object;

    check-cast v0, Lg1/y3;

    invoke-static {v0}, Lvp1/h$u;->f(Lg1/y3;)Lg1/z3;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
