.class public final synthetic Lkk1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/healthspan/view/HealthspanFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/healthspan/view/HealthspanFragment;I)V
    .locals 0

    iput p2, p0, Lkk1/a;->w:I

    iput-object p1, p0, Lkk1/a;->x:Lcom/whoop/healthspan/view/HealthspanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkk1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkk1/a;->x:Lcom/whoop/healthspan/view/HealthspanFragment;

    invoke-static {v0}, Lcom/whoop/healthspan/view/HealthspanFragment;->C(Lcom/whoop/healthspan/view/HealthspanFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkk1/a;->x:Lcom/whoop/healthspan/view/HealthspanFragment;

    invoke-static {v0}, Lcom/whoop/healthspan/view/HealthspanFragment;->z(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkk1/a;->x:Lcom/whoop/healthspan/view/HealthspanFragment;

    invoke-static {v0}, Lcom/whoop/healthspan/view/HealthspanFragment;->A(Lcom/whoop/healthspan/view/HealthspanFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
