.class public final synthetic Lln1/j;
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

    iput p2, p0, Lln1/j;->w:I

    iput-object p1, p0, Lln1/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lln1/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lln1/j;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;

    invoke-static {v0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->B(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lln1/j;->x:Ljava/lang/Object;

    check-cast v0, Lj31/k;

    invoke-static {v0}, Lln1/k$a;->f(Lj31/k;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
