.class public final synthetic Lh02/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;I)V
    .locals 0

    iput p2, p0, Lh02/t;->w:I

    iput-object p1, p0, Lh02/t;->x:Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh02/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh02/t;->x:Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    invoke-static {v0}, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;->A(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh02/t;->x:Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    invoke-static {v0}, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;->D(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh02/t;->x:Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    invoke-static {v0}, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;->C(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lh02/t;->x:Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;

    invoke-static {v0}, Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;->B(Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
