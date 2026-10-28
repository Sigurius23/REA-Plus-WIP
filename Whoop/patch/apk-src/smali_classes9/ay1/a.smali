.class public final synthetic Lay1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/returns/view/ReturnsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/returns/view/ReturnsFragment;I)V
    .locals 0

    iput p2, p0, Lay1/a;->w:I

    iput-object p1, p0, Lay1/a;->x:Lcom/whoop/membership/returns/view/ReturnsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lay1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lay1/a;->x:Lcom/whoop/membership/returns/view/ReturnsFragment;

    check-cast p1, Lvx1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/returns/view/ReturnsFragment;->z(Lcom/whoop/membership/returns/view/ReturnsFragment;Lvx1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lay1/a;->x:Lcom/whoop/membership/returns/view/ReturnsFragment;

    check-cast p1, Lyx1/d;

    invoke-static {v0, p1}, Lcom/whoop/membership/returns/view/ReturnsFragment;->y(Lcom/whoop/membership/returns/view/ReturnsFragment;Lyx1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
