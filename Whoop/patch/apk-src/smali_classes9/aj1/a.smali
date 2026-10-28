.class public final synthetic Laj1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/health/monitor/view/HeartScreenerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/health/monitor/view/HeartScreenerFragment;I)V
    .locals 0

    iput p2, p0, Laj1/a;->w:I

    iput-object p1, p0, Laj1/a;->x:Lcom/whoop/health/monitor/view/HeartScreenerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laj1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laj1/a;->x:Lcom/whoop/health/monitor/view/HeartScreenerFragment;

    invoke-static {v0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->A(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laj1/a;->x:Lcom/whoop/health/monitor/view/HeartScreenerFragment;

    invoke-static {v0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->y(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
