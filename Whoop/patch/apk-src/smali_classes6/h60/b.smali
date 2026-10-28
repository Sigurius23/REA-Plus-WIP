.class public final synthetic Lh60/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V
    .locals 0

    iput p2, p0, Lh60/b;->w:I

    iput-object p1, p0, Lh60/b;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh60/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh60/b;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-static {v0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->E(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh60/b;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-static {v0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->D(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh60/b;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-static {v0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->A(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lh60/b;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-static {v0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->z(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lh60/b;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-static {v0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->y(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
