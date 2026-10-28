.class public final synthetic Lbf0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;I)V
    .locals 0

    iput p2, p0, Lbf0/d;->w:I

    iput-object p1, p0, Lbf0/d;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbf0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbf0/d;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    check-cast p1, Lkd0/a$c;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;->A(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbf0/d;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;->C(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbf0/d;->x:Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;->E(Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;Lj/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
