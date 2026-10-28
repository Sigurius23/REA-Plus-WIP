.class public final synthetic Lpj2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/stress/view/StressSessionFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stress/view/StressSessionFragment;I)V
    .locals 0

    iput p2, p0, Lpj2/u;->w:I

    iput-object p1, p0, Lpj2/u;->x:Lcom/whoop/stress/view/StressSessionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpj2/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/u;->x:Lcom/whoop/stress/view/StressSessionFragment;

    invoke-static {v0}, Lcom/whoop/stress/view/StressSessionFragment;->L(Lcom/whoop/stress/view/StressSessionFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpj2/u;->x:Lcom/whoop/stress/view/StressSessionFragment;

    invoke-static {v0}, Lcom/whoop/stress/view/StressSessionFragment;->M(Lcom/whoop/stress/view/StressSessionFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpj2/u;->x:Lcom/whoop/stress/view/StressSessionFragment;

    invoke-static {v0}, Lcom/whoop/stress/view/StressSessionFragment;->z(Lcom/whoop/stress/view/StressSessionFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
