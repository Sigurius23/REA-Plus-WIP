.class public final synthetic Lea0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/add/activity/view/AddActivityFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/add/activity/view/AddActivityFragment;I)V
    .locals 0

    iput p2, p0, Lea0/a;->w:I

    iput-object p1, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lea0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->C(Lcom/whoop/add/activity/view/AddActivityFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->H(Lcom/whoop/add/activity/view/AddActivityFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->F(Lcom/whoop/add/activity/view/AddActivityFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->y(Lcom/whoop/add/activity/view/AddActivityFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->B(Lcom/whoop/add/activity/view/AddActivityFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lea0/a;->x:Lcom/whoop/add/activity/view/AddActivityFragment;

    invoke-static {v0}, Lcom/whoop/add/activity/view/AddActivityFragment;->E(Lcom/whoop/add/activity/view/AddActivityFragment;)Luf3/a;

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
