.class public final synthetic Ldk2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/tiltgraph/view/TiltGraphFragment;I)V
    .locals 0

    iput p2, p0, Ldk2/g;->w:I

    iput-object p1, p0, Ldk2/g;->x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldk2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldk2/g;->x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    check-cast p1, Luj2/a;

    invoke-static {v0, p1}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->A(Lcom/whoop/tiltgraph/view/TiltGraphFragment;Luj2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldk2/g;->x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    check-cast p1, Lbk2/b;

    invoke-static {v0, p1}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->z(Lcom/whoop/tiltgraph/view/TiltGraphFragment;Lbk2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
