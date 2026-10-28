.class public final synthetic Ld30/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/u;


# direct methods
.method public synthetic constructor <init>(Ld30/u;I)V
    .locals 0

    iput p2, p0, Ld30/i;->w:I

    iput-object p1, p0, Ld30/i;->x:Ld30/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld30/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ly2/y;

    const-string v0, "itemCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld30/y0;

    invoke-direct {v0, p1, p2}, Ld30/y0;-><init>(Ljava/lang/String;Ly2/y;)V

    iget-object p1, p0, Ld30/i;->x:Ld30/u;

    invoke-virtual {p1, v0}, Ld30/u;->b(Ld30/z0;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    const-string v0, "visiblePaymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenPaymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld30/i;->x:Ld30/u;

    iget-object v0, v0, Ld30/u;->m:Lb30/h0;

    invoke-virtual {v0, p1, p2}, Lb30/h0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :pswitch_1
    check-cast p1, Ljava/util/List;

    check-cast p2, Ly00/o4;

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld30/i;->x:Ld30/u;

    iget-object v0, v0, Ld30/u;->a:Lv00/c0;

    if-nez p2, :cond_0

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ly00/o4;

    :cond_0
    const/4 p1, 0x0

    if-eqz p2, :cond_1

    invoke-static {p2, v0, p1}, Lse/b;->e0(Ly00/o4;Lv00/c0;Ljava/lang/String;)Lh20/l;

    move-result-object p1

    :cond_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
