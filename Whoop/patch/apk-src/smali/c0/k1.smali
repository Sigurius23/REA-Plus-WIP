.class public abstract Lc0/k1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public final synthetic O:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/k1;->O:I

    invoke-direct {p0}, Lb2/v;-><init>()V

    return-void
.end method


# virtual methods
.method public E(La3/w0;Ly2/q0;I)I
    .locals 0

    iget p1, p0, Lc0/k1;->O:I

    packed-switch p1, :pswitch_data_0

    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {p2, p3}, Ly2/q0;->b(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public abstract X0(Ly2/q0;J)J
.end method

.method public abstract Y0()Z
.end method

.method public b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 3

    invoke-virtual {p0, p2, p3, p4}, Lc0/k1;->X0(Ly2/q0;J)J

    move-result-wide v0

    invoke-virtual {p0}, Lc0/k1;->Y0()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p3, p4, v0, v1}, Ly3/b;->e(JJ)J

    move-result-wide v0

    :cond_0
    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Le1/m;

    const/4 v1, 0x4

    invoke-direct {v0, p2, v1}, Le1/m;-><init>(Ly2/j1;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

.method public g0(La3/w0;Ly2/q0;I)I
    .locals 0

    iget p1, p0, Lc0/k1;->O:I

    packed-switch p1, :pswitch_data_0

    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {p2, p3}, Ly2/q0;->O(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public o(La3/w0;Ly2/q0;I)I
    .locals 0

    iget p1, p0, Lc0/k1;->O:I

    packed-switch p1, :pswitch_data_0

    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {p2, p3}, Ly2/q0;->Q(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public y(La3/w0;Ly2/q0;I)I
    .locals 0

    iget p1, p0, Lc0/k1;->O:I

    packed-switch p1, :pswitch_data_0

    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1

    :pswitch_0
    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
