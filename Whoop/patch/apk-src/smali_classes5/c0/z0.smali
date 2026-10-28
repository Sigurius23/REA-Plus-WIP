.class public final Lc0/z0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc0/b1;

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lc0/b1;JI)V
    .locals 0

    iput p4, p0, Lc0/z0;->w:I

    iput-object p1, p0, Lc0/z0;->x:Lc0/b1;

    iput-wide p2, p0, Lc0/z0;->y:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lc0/z0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/q0;

    iget-object v0, p0, Lc0/z0;->x:Lc0/b1;

    iget-object v1, v0, Lc0/b1;->T:Lc0/c1;

    check-cast v1, Lc0/d1;

    iget-object v1, v1, Lc0/d1;->b:Lc0/u1;

    iget-object v1, v1, Lc0/u1;->b:Lc0/s1;

    iget-wide v2, p0, Lc0/z0;->y:J

    const-wide/16 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, Lc0/s1;->a:Lkotlin/jvm/internal/m;

    new-instance v6, Ly3/l;

    invoke-direct {v6, v2, v3}, Ly3/l;-><init>(J)V

    invoke-interface {v1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/j;

    iget-wide v6, v1, Ly3/j;->a:J

    goto :goto_0

    :cond_0
    move-wide v6, v4

    :goto_0
    iget-object v0, v0, Lc0/b1;->U:Lc0/e1;

    check-cast v0, Lc0/f1;

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    iget-object v0, v0, Lc0/u1;->b:Lc0/s1;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lc0/s1;->a:Lkotlin/jvm/internal/m;

    new-instance v1, Ly3/l;

    invoke-direct {v1, v2, v3}, Ly3/l;-><init>(J)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/j;

    iget-wide v0, v0, Ly3/j;->a:J

    goto :goto_1

    :cond_1
    move-wide v0, v4

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v2, 0x2

    if-ne p1, v2, :cond_2

    move-wide v4, v0

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    move-wide v4, v6

    :cond_4
    :goto_2
    new-instance p1, Ly3/j;

    invoke-direct {p1, v4, v5}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/q0;

    iget-object v0, p0, Lc0/z0;->x:Lc0/b1;

    iget-object v1, v0, Lc0/b1;->Y:Lb2/h;

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Lc0/b1;->Z0()Lb2/h;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, v0, Lc0/b1;->Y:Lb2/h;

    invoke-virtual {v0}, Lc0/b1;->Z0()Lb2/h;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_9

    const/4 v1, 0x1

    if-eq p1, v1, :cond_9

    const/4 v1, 0x2

    if-ne p1, v1, :cond_8

    iget-object p1, v0, Lc0/b1;->U:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->c:Lc0/k0;

    if-eqz p1, :cond_9

    iget-object p1, p1, Lc0/k0;->b:Lkotlin/jvm/functions/Function1;

    new-instance v1, Ly3/l;

    iget-wide v3, p0, Lc0/z0;->y:J

    invoke-direct {v1, v3, v4}, Ly3/l;-><init>(J)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/l;

    iget-wide v5, p1, Ly3/l;->a:J

    invoke-virtual {v0}, Lc0/b1;->Z0()Lb2/h;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v7, Ly3/m;->w:Ly3/m;

    invoke-interface/range {v2 .. v7}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v8

    iget-object v2, v0, Lc0/b1;->Y:Lb2/h;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface/range {v2 .. v7}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v0

    invoke-static {v8, v9, v0, v1}, Ly3/j;->c(JJ)J

    move-result-wide v0

    goto :goto_4

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_3
    const-wide/16 v0, 0x0

    :goto_4
    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_1
    check-cast p1, Lc0/q0;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iget-object v0, p0, Lc0/z0;->x:Lc0/b1;

    iget-wide v1, p0, Lc0/z0;->y:J

    if-eqz p1, :cond_b

    const/4 v3, 0x1

    if-eq p1, v3, :cond_c

    const/4 v3, 0x2

    if-ne p1, v3, :cond_a

    iget-object p1, v0, Lc0/b1;->U:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->c:Lc0/k0;

    if-eqz p1, :cond_c

    iget-object p1, p1, Lc0/k0;->b:Lkotlin/jvm/functions/Function1;

    new-instance v0, Ly3/l;

    invoke-direct {v0, v1, v2}, Ly3/l;-><init>(J)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/l;

    iget-wide v1, p1, Ly3/l;->a:J

    goto :goto_5

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    iget-object p1, v0, Lc0/b1;->T:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->c:Lc0/k0;

    if-eqz p1, :cond_c

    iget-object p1, p1, Lc0/k0;->b:Lkotlin/jvm/functions/Function1;

    new-instance v0, Ly3/l;

    invoke-direct {v0, v1, v2}, Ly3/l;-><init>(J)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/l;

    iget-wide v1, p1, Ly3/l;->a:J

    :cond_c
    :goto_5
    new-instance p1, Ly3/l;

    invoke-direct {p1, v1, v2}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
