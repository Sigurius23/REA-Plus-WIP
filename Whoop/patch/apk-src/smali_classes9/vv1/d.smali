.class public final synthetic Lvv1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;I)V
    .locals 0

    iput p2, p0, Lvv1/d;->w:I

    iput-object p1, p0, Lvv1/d;->x:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvv1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvv1/d;->x:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    check-cast p1, Law1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->A(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvv1/d;->x:Lcom/whoop/membership/dunning/DunningBottomSheetFragment;

    check-cast p1, Law1/a;

    invoke-static {v0, p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->C(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
