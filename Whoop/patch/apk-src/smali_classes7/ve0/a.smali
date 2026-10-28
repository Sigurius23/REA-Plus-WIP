.class public final synthetic Lve0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;I)V
    .locals 0

    iput p2, p0, Lve0/a;->w:I

    iput-object p1, p0, Lve0/a;->x:Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lve0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lve0/a;->x:Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;->z(Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lve0/a;->x:Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;->B(Lcom/whoop/advancedlabs/testresults/view/TestResultsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
