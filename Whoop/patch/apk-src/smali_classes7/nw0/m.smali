.class public final synthetic Lnw0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;I)V
    .locals 0

    iput p2, p0, Lnw0/m;->w:I

    iput-object p1, p0, Lnw0/m;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lnw0/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnw0/m;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    check-cast p1, Lbw0/c;

    invoke-static {v0, p1}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->K(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;Lbw0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lnw0/m;->x:Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;

    check-cast p1, Lmw0/g;

    invoke-static {v0, p1}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->I(Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;Lmw0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
