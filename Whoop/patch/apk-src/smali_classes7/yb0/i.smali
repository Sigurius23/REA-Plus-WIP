.class public final synthetic Lyb0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;I)V
    .locals 0

    iput p2, p0, Lyb0/i;->w:I

    iput-object p1, p0, Lyb0/i;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyb0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyb0/i;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    check-cast p1, Lwb0/g;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->z(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;Lwb0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyb0/i;->x:Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;

    check-cast p1, Lkd0/a$c;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;->D(Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
