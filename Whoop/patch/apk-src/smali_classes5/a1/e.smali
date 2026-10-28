.class public final synthetic La1/e;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, La1/e;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ltg/g;I)V
    .locals 7

    iput p2, p0, La1/e;->w:I

    packed-switch p2, :pswitch_data_0

    const-string v6, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 2
    const-class v3, Ltg/e;

    const-string v5, "encodableFromDecoded"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :pswitch_0
    const-string v6, "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 4
    const-class v3, Ltg/e;

    const-string v5, "encodableFromEncoded"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, La1/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lg40/z1;

    invoke-virtual {v0, p1}, Lg40/z1;->v(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lg40/z1;

    invoke-virtual {v0, p1}, Lg40/z1;->v(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lg40/m1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lg40/m1;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lg40/m1;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v1, 0x6

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    iget-object v1, v0, Lg40/m1;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lg40/m1;->a(ILjava/lang/String;)I

    const-string p1, ""

    iput-object p1, v0, Lg40/m1;->a:Ljava/lang/String;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lg40/d0;

    iget-boolean v1, v0, Lg40/d0;->b:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg40/d0;->b:Z

    :cond_1
    iget-object v0, v0, Lg40/d0;->c:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Le10/i;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Le10/r0;

    instance-of v1, p1, Le10/g;

    if-eqz v1, :cond_2

    iget-object v1, v0, Le10/r0;->c:Landroidx/lifecycle/k1;

    const-string v2, "AwaitingConfirmationResult"

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    iget-object v1, v0, Le10/r0;->b:Lbc3/c0;

    new-instance v2, Ld30/o;

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Le10/h;

    if-eqz v1, :cond_3

    new-instance v1, Le10/w;

    check-cast p1, Le10/h;

    iget-object v2, p1, Le10/h;->a:Ly00/c8;

    iget-object v3, p1, Le10/h;->b:Ln10/c0;

    iget-boolean p1, p1, Le10/h;->c:Z

    invoke-direct {v1, v2, v3, p1}, Le10/w;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_0

    :cond_3
    instance-of v1, p1, Le10/f;

    if-eqz v1, :cond_4

    check-cast p1, Le10/f;

    iget-object v1, p1, Le10/f;->a:Ljava/lang/Throwable;

    iget-object v2, p1, Le10/f;->c:Le10/u;

    iget-object p1, p1, Le10/f;->b:Lzy/c;

    new-instance v3, Le10/v;

    invoke-direct {v3, v1, p1, v2}, Le10/v;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    move-object v1, v3

    goto :goto_0

    :cond_4
    instance-of v1, p1, Le10/e;

    if-eqz v1, :cond_5

    new-instance v1, Le10/n;

    check-cast p1, Le10/e;

    iget-object p1, p1, Le10/e;->a:Le10/m;

    invoke-direct {v1, p1}, Le10/n;-><init>(Le10/m;)V

    :goto_0
    invoke-virtual {v0, v1}, Le10/r0;->e(Le10/x;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_4
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/d;

    invoke-virtual {v0, p1}, Lk20/d;->b(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    invoke-virtual {v0, p1}, Lk20/a;->o(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    invoke-virtual {v0, p1}, Lk20/a;->r(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Lq20/y;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Le30/c;

    invoke-virtual {v0, p1}, Le30/c;->z(Lq20/y;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Ltg/e;

    invoke-interface {v0, p1}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Ltg/e;

    invoke-interface {v0, p1}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Ltg/e;

    invoke-interface {v0, p1}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Ltg/e;

    invoke-interface {v0, p1}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lyy/a;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lk20/a;->g:Lq83/j;

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    new-instance v2, Landroidx/room/e;

    const/16 v3, 0x12

    const/4 v4, 0x0

    invoke-direct {v2, v0, p1, v4, v3}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Ly00/i;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lk20/l;

    invoke-direct {v1, p1}, Lk20/l;-><init>(Ly00/i;)V

    invoke-static {v0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lk20/i;

    invoke-direct {v1, p1}, Lk20/i;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lbk/e;

    monitor-enter v2

    :try_start_0
    iget p1, v2, Lbk/e;->z:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x4

    if-ge p1, v3, :cond_6

    monitor-exit v2

    goto :goto_2

    :cond_6
    :try_start_1
    const-string p1, "identify_interceptor"

    invoke-virtual {v2, v0, v1, p1}, Lbk/e;->J(JLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :pswitch_10
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lbk/e;

    monitor-enter v2

    :try_start_3
    const-string p1, "identifys"

    invoke-virtual {v2, v0, v1, p1}, Lbk/e;->J(JLjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v2

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :pswitch_11
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lbk/e;

    monitor-enter v2

    :try_start_5
    const-string p1, "events"

    invoke-virtual {v2, v0, v1, p1}, Lbk/e;->J(JLjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit v2

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_2
    move-exception v0

    move-object p1, v0

    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :pswitch_12
    check-cast p1, Lq83/d;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lbe/k;

    invoke-virtual {v0, p1}, Lbe/k;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lh20/l;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/z4;

    invoke-virtual {v0, p1}, Lh20/z4;->f(Lh20/l;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/a;

    invoke-virtual {v0, p1}, Lk20/a;->r(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lk20/d;

    invoke-virtual {v0, p1}, Lk20/d;->b(Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    invoke-virtual {v0, p1}, Lh20/g;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lh20/g;

    invoke-virtual {v0, p1}, Lh20/g;->a(Ljava/lang/String;)Ls20/a;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, La30/a0;

    iget-object v1, v0, La30/a0;->f:Lqy/d;

    const-string v2, "Failure loading PaymentSheetState"

    invoke-virtual {v1, v2, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v0, La30/a0;->g:Lk20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lk20/a;->e:Lbz/c;

    sget-object v2, Lbz/b;->w:Lbz/b;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v2}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v1

    new-instance v2, Lk20/n;

    const/4 v3, 0x5

    invoke-direct {v2, v1, p1, v3}, Lk20/n;-><init>(Lkotlin/time/Duration;Ljava/lang/Throwable;I)V

    const/4 p1, 0x0

    invoke-virtual {v0, v2, p1}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    check-cast p1, Ljz/o;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, La20/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, La20/j;->F:Landroidx/lifecycle/k1;

    const-string v2, "key_has_launched"

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Le;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v2, p1, v0, v4, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    check-cast p1, Lkz/n;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, La20/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, La20/j;->F:Landroidx/lifecycle/k1;

    const-string v2, "key_has_launched"

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v3, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Le;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v2, p1, v0, v4, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1b
    check-cast p1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lw0/a;

    iget-object v0, v0, Lw0/a;->b:La0/q0;

    invoke-virtual {v0, p1}, La0/q0;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1c
    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    iget-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, La1/i;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lb1/i;->a:Lp1/b0;

    invoke-static {v3, p1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lb1/g;

    if-nez v4, :cond_7

    goto :goto_3

    :cond_7
    new-instance v5, La1/g;

    invoke-direct {v5, v3, v0, v1}, La1/g;-><init>(La1/i;J)V

    invoke-virtual {v3}, Lb2/v;->L0()Lbc3/c0;

    move-result-object p1

    new-instance v2, La1/h;

    const/4 v7, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v7}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v6, v6, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
