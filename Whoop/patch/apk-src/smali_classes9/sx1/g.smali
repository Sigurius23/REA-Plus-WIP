.class public final synthetic Lsx1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;I)V
    .locals 0

    iput p2, p0, Lsx1/g;->w:I

    iput-object p1, p0, Lsx1/g;->x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsx1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsx1/g;->x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;

    invoke-static {v0}, Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;->z(Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsx1/g;->x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;

    invoke-static {v0}, Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;->A(Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
