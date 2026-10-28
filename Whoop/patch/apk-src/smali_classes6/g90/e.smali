.class public final synthetic Lg90/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/lifecycle/g0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lg90/e;->w:I

    iput-object p1, p0, Lg90/e;->x:Landroidx/lifecycle/g0;

    iput-object p2, p0, Lg90/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg90/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg90/e;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lp1/i0;

    iget-object v1, p0, Lg90/e;->x:Landroidx/lifecycle/g0;

    invoke-static {v1, v0, p1}, Lcom/whoop/membership/management/navigation/a;->h(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg90/e;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lp1/i0;

    iget-object v1, p0, Lg90/e;->x:Landroidx/lifecycle/g0;

    invoke-static {v1, v0, p1}, Lcom/whoop/membership/management/navigation/a;->g(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lg90/e;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lp1/i0;

    iget-object v1, p0, Lg90/e;->x:Landroidx/lifecycle/g0;

    invoke-static {v1, v0, p1}, Lg90/f;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
