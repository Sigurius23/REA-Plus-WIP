.class public final synthetic Lib0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;I)V
    .locals 0

    iput p2, p0, Lib0/a;->w:I

    iput-object p1, p0, Lib0/a;->x:Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lib0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lib0/a;->x:Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;->C(Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lib0/a;->x:Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;->E(Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lib0/a;->x:Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;->z(Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
