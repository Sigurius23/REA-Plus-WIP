.class public final synthetic Lhc2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/myaccount/MyAccountFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/myaccount/MyAccountFragment;I)V
    .locals 0

    iput p2, p0, Lhc2/d;->w:I

    iput-object p1, p0, Lhc2/d;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhc2/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/navigation/e;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lhc2/d;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->O(Lcom/whoop/settings/myaccount/MyAccountFragment;Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lhc2/d;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->L(Lcom/whoop/settings/myaccount/MyAccountFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lhc2/d;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/settings/myaccount/MyAccountFragment;->P(Lcom/whoop/settings/myaccount/MyAccountFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
