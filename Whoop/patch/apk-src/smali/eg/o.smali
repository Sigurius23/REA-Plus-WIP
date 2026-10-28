.class public Leg/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lqt/e;


# instance fields
.field public final a:Lae3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Leg/o;->b:Lqt/e;

    return-void
.end method

.method public constructor <init>(Lae3/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leg/o;->a:Lae3/k;

    return-void
.end method

.method public static g(Leg/o;Lpg3/p;Lt23/u3;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Leg/m;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Leg/m;

    iget v1, v0, Leg/m;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leg/m;->J:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Leg/m;

    invoke-direct {v0, p0, p3}, Leg/m;-><init>(Leg/o;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Leg/m;->H:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Leg/m;->J:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget v4, v6, Leg/m;->G:I

    iget-object p0, v6, Leg/m;->F:Lgg/g;

    iget-object p1, v6, Leg/m;->E:Lkotlin/jvm/functions/Function1;

    iget-object p2, v6, Leg/m;->z:Leg/o;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, p0

    move-object v1, p2

    goto :goto_3

    :cond_3
    iget-object p2, v6, Leg/m;->y:Lt23/u3;

    iget-object p1, v6, Leg/m;->x:Lpg3/p;

    iget-object p0, v6, Leg/m;->w:Leg/o;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v6, Leg/m;->w:Leg/o;

    iput-object p1, v6, Leg/m;->x:Lpg3/p;

    iput-object p2, v6, Leg/m;->y:Lt23/u3;

    iput v4, v6, Leg/m;->J:I

    invoke-virtual {p0, v6}, Leg/o;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p3, v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    invoke-virtual {p0}, Leg/o;->e()Lae3/k;

    move-result-object p3

    iget-object p3, p3, Lae3/k;->d:Ljava/lang/Object;

    check-cast p3, Lfg/n;

    iput-object v5, v6, Leg/m;->w:Leg/o;

    iput-object v5, v6, Leg/m;->x:Lpg3/p;

    iput-object v5, v6, Leg/m;->y:Lt23/u3;

    iput-object p0, v6, Leg/m;->z:Leg/o;

    iput-object p2, v6, Leg/m;->E:Lkotlin/jvm/functions/Function1;

    iput-object p1, v6, Leg/m;->F:Lgg/g;

    iput v4, v6, Leg/m;->G:I

    iput v3, v6, Leg/m;->J:I

    check-cast p3, Lfg/u;

    invoke-virtual {p3, v6}, Lfg/u;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_6

    goto :goto_4

    :cond_6
    move-object v1, p0

    move-object v3, p1

    move-object p1, p2

    :goto_3
    check-cast p3, Lfg/q;

    iput-object v5, v6, Leg/m;->w:Leg/o;

    iput-object v5, v6, Leg/m;->x:Lpg3/p;

    iput-object v5, v6, Leg/m;->y:Lt23/u3;

    iput-object v5, v6, Leg/m;->z:Leg/o;

    iput-object v5, v6, Leg/m;->E:Lkotlin/jvm/functions/Function1;

    iput-object v5, v6, Leg/m;->F:Lgg/g;

    iput v2, v6, Leg/m;->J:I

    move-object v2, p1

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Leg/o;->d(Lkotlin/jvm/functions/Function1;Lgg/g;ILfg/q;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    return-object p0

    :goto_5
    invoke-virtual {p0, p1, v4, v5}, Leg/o;->i(Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;ILl83/n;)V

    throw v5
.end method


# virtual methods
.method public a(ILgg/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c(ILq83/d;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final d(Lkotlin/jvm/functions/Function1;Lgg/g;ILfg/q;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p5, Leg/l;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Leg/l;

    iget v1, v0, Leg/l;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leg/l;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, Leg/l;

    invoke-direct {v0, p0, p5}, Leg/l;-><init>(Leg/o;Ls83/c;)V

    :goto_0
    iget-object p5, v0, Leg/l;->I:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leg/l;->K:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v0, Leg/l;->F:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object p2, v0, Leg/l;->E:Ljava/lang/Object;

    check-cast p2, Lgg/e;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_1
    iget p1, v0, Leg/l;->H:I

    iget-object p2, v0, Leg/l;->G:Lfg/q;

    iget-object p3, v0, Leg/l;->F:Ljava/lang/Object;

    check-cast p3, Lgg/e;

    iget-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iget-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Leg/l;->y:Lfg/q;

    iget-object v5, v0, Leg/l;->x:Lgg/g;

    iget-object v6, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p5, p2

    move-object p3, v5

    move p2, p1

    move-object p1, v6

    goto/16 :goto_9

    :catchall_0
    move-exception p2

    move-object v9, p2

    move p2, p1

    move-object p1, v9

    goto/16 :goto_b

    :catch_0
    move-exception p2

    goto/16 :goto_e

    :pswitch_2
    iget p1, v0, Leg/l;->H:I

    iget-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    check-cast p2, Lgg/e;

    iget-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iget-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Leg/l;->y:Lfg/q;

    iget-object p2, v0, Leg/l;->x:Lgg/g;

    iget-object v5, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    :try_start_1
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_8

    :pswitch_3
    iget p1, v0, Leg/l;->H:I

    iget-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    check-cast p2, Lgg/e;

    iget-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iget-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Leg/l;->y:Lfg/q;

    iget-object v5, v0, Leg/l;->x:Lgg/g;

    iget-object v6, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    :try_start_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_7

    :pswitch_4
    iget p1, v0, Leg/l;->H:I

    iget-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    check-cast p2, Lgg/e;

    iget-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iget-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Leg/l;->y:Lfg/q;

    :try_start_3
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object p5

    :pswitch_5
    iget p1, v0, Leg/l;->H:I

    iget-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    check-cast p2, Lgg/e;

    iget-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iget-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Leg/l;->y:Lfg/q;

    iget-object v5, v0, Leg/l;->x:Lgg/g;

    iget-object v6, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    :try_start_4
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_6

    :pswitch_6
    iget p1, v0, Leg/l;->H:I

    iget-object p2, v0, Leg/l;->E:Ljava/lang/Object;

    check-cast p2, Leg/o;

    iget-object p2, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iget-object p3, v0, Leg/l;->y:Lfg/q;

    iget-object p4, v0, Leg/l;->x:Lgg/g;

    iget-object v2, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    :try_start_5
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p5

    goto :goto_3

    :pswitch_7
    invoke-static {p5}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p5

    iput-object p0, p5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move v9, p3

    move-object p3, p2

    move-object p2, p5

    move-object p5, p4

    move p4, v9

    :goto_1
    iget-object v2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :try_start_6
    check-cast v2, Leg/o;

    iput-object p1, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object p3, v0, Leg/l;->x:Lgg/g;

    iput-object p5, v0, Leg/l;->y:Lfg/q;

    iput-object p2, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object v4, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object v4, v0, Leg/l;->F:Ljava/lang/Object;

    iput-object v4, v0, Leg/l;->G:Lfg/q;

    iput p4, v0, Leg/l;->H:I

    iput v3, v0, Leg/l;->K:I

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-ne v2, v1, :cond_1

    goto/16 :goto_c

    :cond_1
    move-object v9, v2

    move-object v2, p1

    move p1, p4

    move-object p4, p3

    move-object p3, p5

    move-object p5, v9

    :goto_2
    move-object v5, p4

    move-object v6, v2

    move-object p4, p2

    move-object v2, p3

    move-object p3, p5

    goto :goto_4

    :catchall_2
    move-exception v2

    move-object v9, v2

    move-object v2, p1

    move p1, p4

    move-object p4, p3

    move-object p3, p5

    move-object p5, v9

    :goto_3
    invoke-static {p5}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p5

    goto :goto_2

    :goto_4
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    instance-of p5, p2, Ljava/util/concurrent/CancellationException;

    if-eqz p5, :cond_2

    check-cast p2, Ljava/util/concurrent/CancellationException;

    goto :goto_5

    :cond_2
    move-object p2, v4

    :goto_5
    if-nez p2, :cond_f

    invoke-interface {v5, p3}, Lgg/g;->b(Ljava/lang/Object;)Lgg/e;

    move-result-object p2

    :try_start_7
    iget-object p5, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p5, Leg/o;

    iput-object v6, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object v5, v0, Leg/l;->x:Lgg/g;

    iput-object v2, v0, Leg/l;->y:Lfg/q;

    iput-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    iput-object v4, v0, Leg/l;->G:Lfg/q;

    iput p1, v0, Leg/l;->H:I

    const/4 v7, 0x2

    iput v7, v0, Leg/l;->K:I

    invoke-virtual {p5, p1, p2, v0}, Leg/o;->a(ILgg/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_3

    goto/16 :goto_c

    :cond_3
    :goto_6
    instance-of p5, p2, Lgg/d;

    if-eqz p5, :cond_5

    iget-object p2, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Leg/o;

    iput-object v4, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object v4, v0, Leg/l;->x:Lgg/g;

    iput-object v2, v0, Leg/l;->y:Lfg/q;

    iput-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object v4, v0, Leg/l;->F:Ljava/lang/Object;

    iput p1, v0, Leg/l;->H:I

    const/4 p5, 0x3

    iput p5, v0, Leg/l;->K:I

    invoke-virtual {p2, v2, p1, p3, v0}, Leg/o;->h(Lfg/q;ILjava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_c

    :cond_4
    return-object p1

    :cond_5
    instance-of p5, p2, Lgg/c;

    if-nez p5, :cond_b

    instance-of p5, p2, Lgg/b;

    if-eqz p5, :cond_a

    iget-object p5, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p5, Leg/o;

    invoke-virtual {p5}, Leg/o;->e()Lae3/k;

    move-result-object p5

    iget p5, p5, Lae3/k;->b:I

    if-ge p1, p5, :cond_9

    iget-object p5, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p5, Leg/o;

    invoke-virtual {p5}, Leg/o;->e()Lae3/k;

    move-result-object p5

    iget-object p5, p5, Lae3/k;->c:Ljava/lang/Object;

    check-cast p5, Lfg/k;

    iput-object v6, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object v5, v0, Leg/l;->x:Lgg/g;

    iput-object v2, v0, Leg/l;->y:Lfg/q;

    iput-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    iput p1, v0, Leg/l;->H:I

    const/4 v7, 0x4

    iput v7, v0, Leg/l;->K:I

    invoke-virtual {p5, p1, v0}, Lfg/k;->a(ILeg/l;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_6

    goto/16 :goto_c

    :cond_6
    :goto_7
    move-object p5, p2

    check-cast p5, Lgg/b;

    invoke-virtual {p5}, Lgg/b;->a()Lgg/f;

    move-result-object p5

    iput-object v6, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object v5, v0, Leg/l;->x:Lgg/g;

    iput-object v2, v0, Leg/l;->y:Lfg/q;

    iput-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object p2, v0, Leg/l;->F:Ljava/lang/Object;

    iput p1, v0, Leg/l;->H:I

    const/4 p2, 0x5

    iput p2, v0, Leg/l;->K:I

    invoke-virtual {v2, p5, v0}, Lfg/q;->b(Lgg/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_7

    goto/16 :goto_c

    :cond_7
    move-object p2, v5

    move-object v5, v6

    :goto_8
    check-cast p5, Lfg/q;

    iget-object v6, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v6, Leg/o;

    add-int/lit8 v7, p1, 0x1

    iput-object v5, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, v0, Leg/l;->x:Lgg/g;

    iput-object v2, v0, Leg/l;->y:Lfg/q;

    iput-object p4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object p3, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object v4, v0, Leg/l;->F:Ljava/lang/Object;

    iput-object p5, v0, Leg/l;->G:Lfg/q;

    iput p1, v0, Leg/l;->H:I

    const/4 v8, 0x6

    iput v8, v0, Leg/l;->K:I

    invoke-virtual {v6, v7, v0}, Leg/o;->c(ILq83/d;)Ljava/lang/Object;

    move-result-object p3
    :try_end_7
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-ne p3, v1, :cond_8

    goto :goto_c

    :cond_8
    move-object p3, p2

    move p2, p1

    move-object p1, v5

    :goto_9
    iget-object v2, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Leg/o;

    add-int/2addr p2, v3

    iput-object v2, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v9, p4

    move p4, p2

    move-object p2, v9

    goto/16 :goto_1

    :cond_9
    :try_start_8
    iget-object p2, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Leg/o;

    invoke-virtual {p2, p1, p3}, Leg/o;->j(ILjava/lang/Object;)V

    throw v4

    :cond_a
    new-instance p2, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p2}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p2

    :cond_b
    iget-object p2, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Leg/o;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_d

    new-instance p2, Laws/smithy/kotlin/runtime/retries/RetryFailureException;

    instance-of p5, p3, Ll83/m;

    if-eqz p5, :cond_c

    move-object p5, v4

    goto :goto_a

    :cond_c
    move-object p5, p3

    :goto_a
    invoke-direct {p2, p1, p5}, Laws/smithy/kotlin/runtime/retries/RetryFailureException;-><init>(ILjava/lang/Object;)V

    throw p2

    :cond_d
    throw p2
    :try_end_8
    .catch Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_b
    iput-object v4, v0, Leg/l;->w:Lkotlin/jvm/functions/Function1;

    iput-object v4, v0, Leg/l;->x:Lgg/g;

    iput-object v4, v0, Leg/l;->y:Lfg/q;

    iput-object v4, v0, Leg/l;->z:Lkotlin/jvm/internal/g0;

    iput-object v4, v0, Leg/l;->E:Ljava/lang/Object;

    iput-object p1, v0, Leg/l;->F:Ljava/lang/Object;

    iput-object v4, v0, Leg/l;->G:Lfg/q;

    iput p2, v0, Leg/l;->H:I

    const/4 p2, 0x7

    iput p2, v0, Leg/l;->K:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-ne p2, v1, :cond_e

    :goto_c
    return-object v1

    :cond_e
    :goto_d
    throw p1

    :goto_e
    iget-object p4, p4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p4, Leg/o;

    new-instance p5, Ll83/n;

    invoke-direct {p5, p3}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p4, p2, p1, p5}, Leg/o;->i(Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;ILl83/n;)V

    throw v4

    :cond_f
    throw p2

    :pswitch_data_0
    .packed-switch 0x0
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

.method public e()Lae3/k;
    .locals 1

    iget-object v0, p0, Leg/o;->a:Lae3/k;

    return-object v0
.end method

.method public bridge f()Lae3/k;
    .locals 1

    invoke-virtual {p0}, Leg/o;->e()Lae3/k;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lfg/q;ILjava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p4, Leg/n;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Leg/n;

    iget v1, v0, Leg/n;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leg/n;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Leg/n;

    invoke-direct {v0, p0, p4}, Leg/n;-><init>(Leg/o;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Leg/n;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leg/n;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p2, v0, Leg/n;->x:I

    iget-object p3, v0, Leg/n;->w:Ljava/lang/Object;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p3, v0, Leg/n;->w:Ljava/lang/Object;

    iput p2, v0, Leg/n;->x:I

    iput v3, v0, Leg/n;->E:I

    invoke-virtual {p1, v0}, Lfg/q;->a(Leg/n;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p1, p3, Ll83/m;

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    move-object p1, p3

    :goto_2
    if-nez p1, :cond_5

    new-instance p1, Leg/g;

    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p1, p2, p3}, Leg/g;-><init>(ILjava/lang/Throwable;)V

    return-object p1

    :cond_5
    new-instance p3, Leg/h;

    invoke-direct {p3, p2, p1}, Leg/h;-><init>(ILjava/lang/Object;)V

    return-object p3
.end method

.method public final i(Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;ILl83/n;)V
    .locals 8

    const-string v0, "Insufficient client capacity to attempt retry, halting on attempt "

    const-string v1, " of "

    invoke-static {p2, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Leg/o;->e()Lae3/k;

    move-result-object v1

    iget v1, v1, Lae3/k;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object v1, p3, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    new-instance v2, Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;

    if-eqz p3, :cond_1

    iget-object v1, p3, Ll83/n;->w:Ljava/lang/Object;

    instance-of v4, v1, Ll83/m;

    if-eqz v4, :cond_2

    :cond_1
    move-object v6, v0

    goto :goto_1

    :cond_2
    move-object v6, v1

    :goto_1
    if-eqz p3, :cond_3

    iget-object p3, p3, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    :cond_3
    move-object v4, p1

    move v5, p2

    move-object v7, v0

    invoke-direct/range {v2 .. v7}, Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;-><init>(Ljava/lang/String;Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;ILjava/lang/Object;Ljava/lang/Throwable;)V

    throw v2

    :cond_4
    instance-of p1, v1, Laws/smithy/kotlin/runtime/ServiceException;

    if-eqz p1, :cond_6

    move-object p1, v1

    check-cast p1, Laws/smithy/kotlin/runtime/ServiceException;

    new-instance p2, Lte/a;

    invoke-direct {p2, v3}, Lte/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object p1

    invoke-virtual {p1}, Lte/c;->a()Lgf/c;

    move-result-object p1

    sget-object p3, Lte/c;->b:Lgf/a;

    invoke-static {}, Ls2/a;->j()Lgf/a;

    move-result-object p3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_5

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_5
    check-cast v0, Ljava/util/Collection;

    invoke-static {p2, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_6
    throw v1
.end method

.method public final j(ILjava/lang/Object;)V
    .locals 7

    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v1, Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Took more than "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Leg/o;->e()Lae3/k;

    move-result-object v2

    iget v2, v2, Lae3/k;->b:I

    const-string v3, " attempts to get a successful response"

    invoke-static {v0, v2, v3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    instance-of v0, p2, Ll83/m;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p2

    :goto_0
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    const/4 v3, 0x0

    move v4, p1

    invoke-direct/range {v1 .. v6}, Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;-><init>(Ljava/lang/String;Laws/smithy/kotlin/runtime/retries/delay/RetryCapacityExceededException;ILjava/lang/Object;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    throw v0
.end method
