.class public final synthetic Lhe1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;I)V
    .locals 0

    iput p2, p0, Lhe1/c;->w:I

    iput-object p1, p0, Lhe1/c;->x:Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhe1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhe1/c;->x:Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;

    invoke-static {v0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->A(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhe1/c;->x:Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;

    invoke-static {v0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->C(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
