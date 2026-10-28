.class public final synthetic Lbf0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;I)V
    .locals 0

    iput p2, p0, Lbf0/c;->w:I

    iput-object p1, p0, Lbf0/c;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbf0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbf0/c;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;->D(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbf0/c;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;->z(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
