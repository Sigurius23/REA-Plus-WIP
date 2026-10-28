.class public final Lp0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lab/h0;


# direct methods
.method public synthetic constructor <init>(Lab/h0;I)V
    .locals 0

    iput p2, p0, Lp0/x;->w:I

    iput-object p1, p0, Lp0/x;->x:Lab/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, Lp0/x;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lp0/e0;

    invoke-interface {p2}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lp0/x;->x:Lab/h0;

    invoke-virtual {v0, p2}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lp0/e0;

    invoke-interface {p1}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p2, Lp0/e0;

    invoke-interface {p2}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lp0/x;->x:Lab/h0;

    invoke-virtual {v0, p2}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lp0/e0;

    invoke-interface {p1}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, Lp0/e0;

    invoke-interface {p1}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lp0/x;->x:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lp0/e0;

    invoke-interface {p2}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p2}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Lp0/e0;

    invoke-interface {p1}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lp0/x;->x:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lp0/e0;

    invoke-interface {p2}, Lp0/e0;->getKey()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p2}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
