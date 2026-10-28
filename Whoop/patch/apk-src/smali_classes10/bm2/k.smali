.class public final synthetic Lbm2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg1/n7;


# direct methods
.method public synthetic constructor <init>(Lg1/n7;I)V
    .locals 0

    iput p2, p0, Lbm2/k;->w:I

    iput-object p1, p0, Lbm2/k;->x:Lg1/n7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm2/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/k;->x:Lg1/n7;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lbm2/g0;->e(Lg1/n7;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm2/k;->x:Lg1/n7;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lbm2/m;->g(Lg1/n7;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
