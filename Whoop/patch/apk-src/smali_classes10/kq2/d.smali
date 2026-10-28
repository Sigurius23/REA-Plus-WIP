.class public final synthetic Lkq2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/user/journey/view/UserJourneyFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/user/journey/view/UserJourneyFragment;I)V
    .locals 0

    iput p2, p0, Lkq2/d;->w:I

    iput-object p1, p0, Lkq2/d;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkq2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkq2/d;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    invoke-static {v0, p1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->I(Lcom/whoop/user/journey/view/UserJourneyFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkq2/d;->x:Lcom/whoop/user/journey/view/UserJourneyFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/user/journey/view/UserJourneyFragment;->F(Lcom/whoop/user/journey/view/UserJourneyFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
