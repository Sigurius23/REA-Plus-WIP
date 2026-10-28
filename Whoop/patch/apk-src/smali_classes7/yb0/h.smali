.class public final synthetic Lyb0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;I)V
    .locals 0

    iput p2, p0, Lyb0/h;->w:I

    iput-object p1, p0, Lyb0/h;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyb0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyb0/h;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->A(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyb0/h;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->C(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lyb0/h;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->y(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
