.class public final synthetic Lhc2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly71/o;

.field public final synthetic y:Lcom/whoop/settings/myaccount/MyAccountFragment;


# direct methods
.method public synthetic constructor <init>(Ly71/o;Lcom/whoop/settings/myaccount/MyAccountFragment;I)V
    .locals 0

    iput p3, p0, Lhc2/f;->w:I

    iput-object p1, p0, Lhc2/f;->x:Ly71/o;

    iput-object p2, p0, Lhc2/f;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhc2/f;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhc2/f;->x:Ly71/o;

    iget-object v1, p0, Lhc2/f;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->Y(Ly71/o;Lcom/whoop/settings/myaccount/MyAccountFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhc2/f;->x:Ly71/o;

    iget-object v1, p0, Lhc2/f;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->C(Ly71/o;Lcom/whoop/settings/myaccount/MyAccountFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhc2/f;->x:Ly71/o;

    iget-object v1, p0, Lhc2/f;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->g0(Ly71/o;Lcom/whoop/settings/myaccount/MyAccountFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhc2/f;->x:Ly71/o;

    iget-object v1, p0, Lhc2/f;->y:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->Z(Ly71/o;Lcom/whoop/settings/myaccount/MyAccountFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
