.class public final synthetic Lgo2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;I)V
    .locals 0

    iput p2, p0, Lgo2/a;->w:I

    iput-object p1, p0, Lgo2/a;->x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgo2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgo2/a;->x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->B(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lgo2/a;->x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->A(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lgo2/a;->x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->C(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lgo2/a;->x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->D(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lgo2/a;->x:Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;->z(Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;)Ljava/lang/String;

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
