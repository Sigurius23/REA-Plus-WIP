.class public final synthetic Lh60/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V
    .locals 0

    iput p2, p0, Lh60/c;->w:I

    iput-object p1, p0, Lh60/c;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh60/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh60/c;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->C(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lh60/c;->x:Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->B(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Lj/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
