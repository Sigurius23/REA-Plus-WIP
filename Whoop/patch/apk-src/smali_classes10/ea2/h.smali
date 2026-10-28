.class public final synthetic Lea2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/GiftWhoopFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/GiftWhoopFragment;I)V
    .locals 0

    iput p2, p0, Lea2/h;->w:I

    iput-object p1, p0, Lea2/h;->x:Lcom/whoop/settings/GiftWhoopFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lea2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/h;->x:Lcom/whoop/settings/GiftWhoopFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->G(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lea2/h;->x:Lcom/whoop/settings/GiftWhoopFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->H(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lea2/h;->x:Lcom/whoop/settings/GiftWhoopFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->I(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
