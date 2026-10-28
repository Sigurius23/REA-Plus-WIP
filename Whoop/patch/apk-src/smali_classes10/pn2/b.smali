.class public final synthetic Lpn2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;I)V
    .locals 0

    iput p2, p0, Lpn2/b;->w:I

    iput-object p1, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpn2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->D(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->y(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;)Lj02/x0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->A(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->B(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->z(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lpn2/b;->x:Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;

    invoke-static {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;->C(Lcom/whoop/universalcheckout/features/UniversalCheckoutFragment;)Ljava/lang/String;

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
