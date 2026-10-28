.class public final synthetic Ldk2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/tiltgraph/view/TiltGraphFragment;I)V
    .locals 0

    iput p2, p0, Ldk2/f;->w:I

    iput-object p1, p0, Ldk2/f;->x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldk2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldk2/f;->x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-static {v0}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->B(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldk2/f;->x:Lcom/whoop/tiltgraph/view/TiltGraphFragment;

    invoke-static {v0}, Lcom/whoop/tiltgraph/view/TiltGraphFragment;->C(Lcom/whoop/tiltgraph/view/TiltGraphFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
