.class public final synthetic Ljp1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V
    .locals 0

    iput p2, p0, Ljp1/i;->w:I

    iput-object p1, p0, Ljp1/i;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljp1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljp1/i;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->B(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljp1/i;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->y(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ljp1/i;->x:Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;

    invoke-static {v0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->D(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
