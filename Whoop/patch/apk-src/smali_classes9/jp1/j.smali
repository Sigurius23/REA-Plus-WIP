.class public final synthetic Ljp1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V
    .locals 0

    iput p2, p0, Ljp1/j;->w:I

    iput-object p1, p0, Ljp1/j;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljp1/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp1/j;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    check-cast p1, Lhp1/f;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->z(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lhp1/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljp1/j;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->C(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
