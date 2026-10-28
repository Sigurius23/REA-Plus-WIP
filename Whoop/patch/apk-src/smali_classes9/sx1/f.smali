.class public final synthetic Lsx1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;I)V
    .locals 0

    iput p2, p0, Lsx1/f;->w:I

    iput-object p1, p0, Lsx1/f;->x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsx1/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/navigation/e;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lsx1/f;->x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;->B(Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lsx1/f;->x:Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;->y(Lcom/whoop/membership/reactivationmodal/ReactivationModalFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
