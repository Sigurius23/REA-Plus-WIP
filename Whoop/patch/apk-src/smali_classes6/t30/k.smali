.class public final synthetic Lt30/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt30/n;


# direct methods
.method public synthetic constructor <init>(Lt30/n;I)V
    .locals 0

    iput p2, p0, Lt30/k;->w:I

    iput-object p1, p0, Lt30/k;->x:Lt30/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget p1, p0, Lt30/k;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lt30/k;->x:Lt30/n;

    invoke-virtual {p1}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    sget-object v0, Lq30/g;->w:Lq30/g;

    invoke-virtual {p1, v0}, Lt30/g;->g(Lq30/h;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lt30/k;->x:Lt30/n;

    invoke-virtual {p1}, Lt30/n;->C()Lt30/g;

    move-result-object v0

    invoke-virtual {p1}, Lt30/n;->y()Lq30/h;

    move-result-object v1

    iget-object v0, v0, Lt30/g;->G:Landroidx/lifecycle/u0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lt30/n;->H:Lr30/e;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lr30/e;->E:Lr30/j;

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lt30/l;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-eq p1, v0, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_1
    return-void

    :cond_3
    const-string p1, "cresData"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_1
    iget-object p1, p0, Lt30/k;->x:Lt30/n;

    invoke-virtual {p1}, Lt30/n;->C()Lt30/g;

    move-result-object v0

    invoke-virtual {p1}, Lt30/n;->y()Lq30/h;

    move-result-object p1

    iget-object v0, v0, Lt30/g;->G:Landroidx/lifecycle/u0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
