.class public final synthetic Lam2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/trends/view/TrendsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/trends/view/TrendsFragment;I)V
    .locals 0

    iput p2, p0, Lam2/z;->w:I

    iput-object p1, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lam2/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0}, Lcom/whoop/trends/view/TrendsFragment;->O(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0}, Lcom/whoop/trends/view/TrendsFragment;->L(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0}, Lcom/whoop/trends/view/TrendsFragment;->G(Lcom/whoop/trends/view/TrendsFragment;)Lcom/whoop/util/TrendKey;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0}, Lcom/whoop/trends/view/TrendsFragment;->H(Lcom/whoop/trends/view/TrendsFragment;)Lyl2/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0}, Lcom/whoop/trends/view/TrendsFragment;->Q(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lam2/z;->x:Lcom/whoop/trends/view/TrendsFragment;

    invoke-static {v0}, Lcom/whoop/trends/view/TrendsFragment;->E(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
