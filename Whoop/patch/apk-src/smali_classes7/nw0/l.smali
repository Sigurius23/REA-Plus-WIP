.class public final synthetic Lnw0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;I)V
    .locals 0

    iput p2, p0, Lnw0/l;->w:I

    iput-object p1, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnw0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->H(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->M(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->E(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->G(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->J(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lnw0/l;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-static {v0}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->F(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

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
