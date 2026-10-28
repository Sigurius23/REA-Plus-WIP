.class public final Lc0/s0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc0/c1;

.field public final synthetic y:Lc0/e1;


# direct methods
.method public synthetic constructor <init>(Lc0/c1;Lc0/e1;I)V
    .locals 0

    iput p3, p0, Lc0/s0;->w:I

    iput-object p1, p0, Lc0/s0;->x:Lc0/c1;

    iput-object p2, p0, Lc0/s0;->y:Lc0/e1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc0/s0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/q0;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lc0/s0;->y:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_2

    iget v0, p1, Lc0/l1;->a:F

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lc0/s0;->x:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_2

    iget v0, p1, Lc0/l1;->a:F

    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ld0/t1;

    sget-object v0, Lc0/q0;->w:Lc0/q0;

    sget-object v1, Lc0/q0;->x:Lc0/q0;

    invoke-interface {p1, v0, v1}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lc0/s0;->x:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lc0/l1;->c:Ld0/c0;

    if-nez p1, :cond_7

    :cond_3
    sget-object p1, Lc0/w0;->b:Ld0/i1;

    goto :goto_1

    :cond_4
    sget-object v0, Lc0/q0;->y:Lc0/q0;

    invoke-interface {p1, v1, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lc0/s0;->y:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->d:Lc0/l1;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lc0/l1;->c:Ld0/c0;

    if-nez p1, :cond_7

    :cond_5
    sget-object p1, Lc0/w0;->b:Ld0/i1;

    goto :goto_1

    :cond_6
    sget-object p1, Lc0/w0;->b:Ld0/i1;

    :cond_7
    :goto_1
    return-object p1

    :pswitch_1
    check-cast p1, Lc0/q0;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_9

    const/4 v1, 0x1

    if-eq p1, v1, :cond_a

    const/4 v1, 0x2

    if-ne p1, v1, :cond_8

    iget-object p1, p0, Lc0/s0;->y:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->a:Lc0/g1;

    if-eqz p1, :cond_a

    iget v0, p1, Lc0/g1;->a:F

    goto :goto_2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    iget-object p1, p0, Lc0/s0;->x:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->a:Lc0/g1;

    if-eqz p1, :cond_a

    iget v0, p1, Lc0/g1;->a:F

    :cond_a
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ld0/t1;

    sget-object v0, Lc0/q0;->w:Lc0/q0;

    sget-object v1, Lc0/q0;->x:Lc0/q0;

    invoke-interface {p1, v0, v1}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object p1, p0, Lc0/s0;->x:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->a:Lc0/g1;

    if-eqz p1, :cond_b

    iget-object p1, p1, Lc0/g1;->b:Ld0/c0;

    if-nez p1, :cond_f

    :cond_b
    sget-object p1, Lc0/w0;->b:Ld0/i1;

    goto :goto_3

    :cond_c
    sget-object v0, Lc0/q0;->y:Lc0/q0;

    invoke-interface {p1, v1, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lc0/s0;->y:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->a:Lc0/g1;

    if-eqz p1, :cond_d

    iget-object p1, p1, Lc0/g1;->b:Ld0/c0;

    if-nez p1, :cond_f

    :cond_d
    sget-object p1, Lc0/w0;->b:Ld0/i1;

    goto :goto_3

    :cond_e
    sget-object p1, Lc0/w0;->b:Ld0/i1;

    :cond_f
    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
