.class public final synthetic Lam2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/trends/view/TrendsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/trends/view/TrendsFragment;I)V
    .locals 0

    iput p2, p0, Lam2/a0;->w:I

    iput-object p1, p0, Lam2/a0;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lam2/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/a0;->x:Lcom/whoop/trends/view/TrendsFragment;

    check-cast p1, Lcm2/y;

    invoke-static {v0, p1}, Lcom/whoop/trends/view/TrendsFragment;->J(Lcom/whoop/trends/view/TrendsFragment;Lcm2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam2/a0;->x:Lcom/whoop/trends/view/TrendsFragment;

    check-cast p1, Lcom/whoop/util/TrendKey;

    invoke-static {v0, p1}, Lcom/whoop/trends/view/TrendsFragment;->N(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lam2/a0;->x:Lcom/whoop/trends/view/TrendsFragment;

    check-cast p1, Lcom/whoop/util/TrendKey;

    invoke-static {v0, p1}, Lcom/whoop/trends/view/TrendsFragment;->M(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lam2/a0;->x:Lcom/whoop/trends/view/TrendsFragment;

    check-cast p1, Lcm2/w;

    invoke-static {v0, p1}, Lcom/whoop/trends/view/TrendsFragment;->P(Lcom/whoop/trends/view/TrendsFragment;Lcm2/w;)Ll83/a0;

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
