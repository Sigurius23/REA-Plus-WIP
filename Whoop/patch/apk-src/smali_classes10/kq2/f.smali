.class public final synthetic Lkq2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/user/journey/view/UserJourneyFragment;

.field public final synthetic y:Lmq2/b;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/user/journey/view/UserJourneyFragment;Lmq2/b;Lp1/t2;I)V
    .locals 0

    iput p4, p0, Lkq2/f;->w:I

    iput-object p1, p0, Lkq2/f;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    iput-object p2, p0, Lkq2/f;->y:Lmq2/b;

    iput-object p3, p0, Lkq2/f;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkq2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkq2/f;->y:Lmq2/b;

    iget-object v1, p0, Lkq2/f;->z:Lp1/t2;

    iget-object v2, p0, Lkq2/f;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    invoke-static {v2, v0, v1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->H(Lcom/whoop/user/journey/view/UserJourneyFragment;Lmq2/b;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkq2/f;->y:Lmq2/b;

    iget-object v1, p0, Lkq2/f;->z:Lp1/t2;

    iget-object v2, p0, Lkq2/f;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    invoke-static {v2, v0, v1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->C(Lcom/whoop/user/journey/view/UserJourneyFragment;Lmq2/b;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkq2/f;->y:Lmq2/b;

    iget-object v1, p0, Lkq2/f;->z:Lp1/t2;

    iget-object v2, p0, Lkq2/f;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    invoke-static {v2, v0, v1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->K(Lcom/whoop/user/journey/view/UserJourneyFragment;Lmq2/b;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
