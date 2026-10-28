.class public final La3/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/q0;


# instance fields
.field public final synthetic w:I

.field public final x:Ly2/q0;

.field public final y:Ljava/lang/Enum;

.field public final z:Ljava/lang/Enum;


# direct methods
.method public synthetic constructor <init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V
    .locals 0

    iput p4, p0, La3/s1;->w:I

    iput-object p1, p0, La3/s1;->x:Ly2/q0;

    iput-object p2, p0, La3/s1;->y:Ljava/lang/Enum;

    iput-object p3, p0, La3/s1;->z:Ljava/lang/Enum;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final C(I)I
    .locals 1

    iget v0, p0, La3/s1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->C(I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->C(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final O(I)I
    .locals 1

    iget v0, p0, La3/s1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->O(I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->O(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final Q(I)I
    .locals 1

    iget v0, p0, La3/s1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->Q(I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->Q(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final T(J)Ly2/j1;
    .locals 5

    iget v0, p0, La3/s1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/s1;->y:Ljava/lang/Enum;

    check-cast v0, Ly2/s;

    iget-object v1, p0, La3/s1;->z:Ljava/lang/Enum;

    check-cast v1, Ly2/t;

    sget-object v2, Ly2/t;->w:Ly2/t;

    const/16 v3, 0x7fff

    iget-object v4, p0, La3/s1;->x:Ly2/q0;

    if-ne v1, v2, :cond_2

    sget-object v1, Ly2/s;->x:Ly2/s;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->Q(I)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->O(I)I

    move-result v0

    :goto_0
    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v3

    :cond_1
    new-instance p1, La3/t1;

    const/4 p2, 0x1

    invoke-direct {p1, v0, v3, p2}, La3/t1;-><init>(III)V

    goto :goto_2

    :cond_2
    sget-object v1, Ly2/s;->x:Ly2/s;

    if-ne v0, v1, :cond_3

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->b(I)I

    move-result v0

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->C(I)I

    move-result v0

    :goto_1
    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v3

    :cond_4
    new-instance p1, La3/t1;

    const/4 p2, 0x1

    invoke-direct {p1, v3, v0, p2}, La3/t1;-><init>(III)V

    :goto_2
    return-object p1

    :pswitch_0
    iget-object v0, p0, La3/s1;->y:Ljava/lang/Enum;

    check-cast v0, La3/u1;

    iget-object v1, p0, La3/s1;->z:Ljava/lang/Enum;

    check-cast v1, La3/v1;

    sget-object v2, La3/v1;->w:La3/v1;

    const/16 v3, 0x7fff

    iget-object v4, p0, La3/s1;->x:Ly2/q0;

    if-ne v1, v2, :cond_7

    sget-object v1, La3/u1;->x:La3/u1;

    if-ne v0, v1, :cond_5

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->Q(I)I

    move-result v0

    goto :goto_3

    :cond_5
    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->O(I)I

    move-result v0

    :goto_3
    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v3

    :cond_6
    new-instance p1, La3/t1;

    const/4 p2, 0x0

    invoke-direct {p1, v0, v3, p2}, La3/t1;-><init>(III)V

    goto :goto_5

    :cond_7
    sget-object v1, La3/u1;->x:La3/u1;

    if-ne v0, v1, :cond_8

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->b(I)I

    move-result v0

    goto :goto_4

    :cond_8
    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    invoke-interface {v4, v0}, Ly2/q0;->C(I)I

    move-result v0

    :goto_4
    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v3

    :cond_9
    new-instance p1, La3/t1;

    const/4 p2, 0x0

    invoke-direct {p1, v3, v0, p2}, La3/t1;-><init>(III)V

    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)I
    .locals 1

    iget v0, p0, La3/s1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->b(I)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0, p1}, Ly2/q0;->b(I)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La3/s1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La3/s1;->x:Ly2/q0;

    invoke-interface {v0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
