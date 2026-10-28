.class public final synthetic Lkq2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/user/journey/view/UserJourneyFragment;

.field public final synthetic y:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/user/journey/view/UserJourneyFragment;Lp1/t2;I)V
    .locals 0

    iput p3, p0, Lkq2/e;->w:I

    iput-object p1, p0, Lkq2/e;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    iput-object p2, p0, Lkq2/e;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkq2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkq2/e;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    iget-object v1, p0, Lkq2/e;->y:Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->E(Lcom/whoop/user/journey/view/UserJourneyFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkq2/e;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    iget-object v1, p0, Lkq2/e;->y:Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->L(Lcom/whoop/user/journey/view/UserJourneyFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lkq2/e;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    iget-object v1, p0, Lkq2/e;->y:Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->D(Lcom/whoop/user/journey/view/UserJourneyFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
