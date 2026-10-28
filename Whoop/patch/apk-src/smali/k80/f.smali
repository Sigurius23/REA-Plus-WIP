.class public final synthetic Lk80/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/activation/view/ActivationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/activation/view/ActivationFragment;I)V
    .locals 0

    iput p2, p0, Lk80/f;->w:I

    iput-object p1, p0, Lk80/f;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lk80/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk80/f;->x:Lcom/whoop/activation/view/ActivationFragment;

    check-cast p1, Lh80/b;

    invoke-static {v0, p1}, Lcom/whoop/activation/view/ActivationFragment;->G(Lcom/whoop/activation/view/ActivationFragment;Lh80/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lk80/f;->x:Lcom/whoop/activation/view/ActivationFragment;

    check-cast p1, Lc93/a;

    invoke-static {v0, p1}, Lcom/whoop/activation/view/ActivationFragment;->z(Lcom/whoop/activation/view/ActivationFragment;Lc93/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lk80/f;->x:Lcom/whoop/activation/view/ActivationFragment;

    check-cast p1, Lj80/b;

    invoke-static {v0, p1}, Lcom/whoop/activation/view/ActivationFragment;->F(Lcom/whoop/activation/view/ActivationFragment;Lj80/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
