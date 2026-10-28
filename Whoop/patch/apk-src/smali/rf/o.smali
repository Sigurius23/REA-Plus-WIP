.class public final Lrf/o;
.super Lpf/f;
.source "SourceFile"


# static fields
.field public static final synthetic H:I


# instance fields
.field public final E:Lud3/l0;

.field public final F:Lqf/b;

.field public final G:Ll83/p;

.field public final z:Lrf/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/room/u;

    return-void
.end method

.method public constructor <init>(Lrf/r;Lud3/l0;)V
    .locals 0

    invoke-direct {p0}, Lpf/f;-><init>()V

    iput-object p1, p0, Lrf/o;->z:Lrf/r;

    iput-object p2, p0, Lrf/o;->E:Lud3/l0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lqf/b;

    iget-object p1, p1, Lpf/i;->j:Lmg/h;

    invoke-direct {p2, p1}, Lqf/b;-><init>(Lmg/h;)V

    iput-object p2, p0, Lrf/o;->F:Lqf/b;

    new-instance p1, Lm83/p;

    const/16 p2, 0xc

    invoke-direct {p1, p0, p2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lrf/o;->G:Ll83/p;

    return-void
.end method


# virtual methods
.method public final getConfig()Lpf/i;
    .locals 1

    iget-object v0, p0, Lrf/o;->z:Lrf/r;

    return-object v0
.end method

.method public final shutdown()V
    .locals 2

    iget-object v0, p0, Lrf/o;->F:Lqf/b;

    invoke-virtual {v0}, Lqf/b;->close()V

    iget-object v0, p0, Lrf/o;->E:Lud3/l0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lrf/o;->G:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/l0;

    iget-object v1, v1, Lud3/l0;->F:Lud3/q;

    invoke-virtual {v1}, Lud3/q;->a()V

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/l0;

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v0}, Lud3/u;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :cond_0
    return-void
.end method

.method public final z0(Ldg/a;Lvf/h;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lrf/n;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lrf/n;

    iget v1, v0, Lrf/n;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrf/n;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrf/n;

    check-cast p3, Ls83/c;

    invoke-direct {v0, p0, p3}, Lrf/n;-><init>(Lrf/o;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lrf/n;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrf/n;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lrf/n;->z:Lzd3/o;

    iget-object p2, v0, Lrf/n;->y:Lq83/j;

    iget-object v0, v0, Lrf/n;->x:Lvf/a;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, p2

    move-object v3, v0

    :goto_1
    move-object v8, p1

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p2, v0, Lrf/n;->x:Lvf/a;

    iget-object p1, v0, Lrf/n;->w:Ldg/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lrf/n;->w:Ldg/a;

    iput-object p2, v0, Lrf/n;->x:Lvf/a;

    iput v4, v0, Lrf/n;->G:I

    invoke-static {v0}, Lse/g;->p(Lrf/n;)Lq83/j;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p3, Lq83/j;

    iget-object v2, p0, Lrf/o;->F:Lqf/b;

    invoke-static {p2, p1, p3, v2}, Lx43/j;->Y(Lvf/a;Ldg/a;Lq83/j;Lqf/b;)Lud3/o0;

    move-result-object p1

    iget-object v2, p0, Lrf/o;->G:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lud3/l0;

    invoke-virtual {v2, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    const/4 v2, 0x0

    :try_start_1
    iput-object v2, v0, Lrf/n;->w:Ldg/a;

    iput-object p2, v0, Lrf/n;->x:Lvf/a;

    iput-object p3, v0, Lrf/n;->y:Lq83/j;

    iput-object p1, v0, Lrf/n;->z:Lzd3/o;

    iput v3, v0, Lrf/n;->G:I

    invoke-static {p1, v0}, Ls6/a;->d(Lzd3/o;Lrf/n;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v3, p2

    move-object v7, p3

    move-object p3, v0

    goto :goto_1

    :goto_4
    check-cast p3, Lud3/x0;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {p3}, Lx43/j;->Z(Lud3/x0;)Lwf/a;

    move-result-object v4

    sget-object p1, Lug/b;->x:Lt9/p;

    iget-wide v0, p3, Lud3/x0;->L:J

    invoke-static {p1, v0, v1}, Lug/c;->a(Lt9/p;J)Lug/b;

    move-result-object v5

    iget-wide v0, p3, Lud3/x0;->M:J

    invoke-static {p1, v0, v1}, Lug/c;->a(Lt9/p;J)Lug/b;

    move-result-object v6

    new-instance v2, Lrf/l;

    invoke-direct/range {v2 .. v8}, Lrf/l;-><init>(Lvf/a;Lwf/a;Lug/b;Lug/b;Lq83/j;Lud3/j;)V

    invoke-static {v7}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    new-instance p2, Lq11/c;

    const/16 v0, 0x10

    invoke-direct {p2, v0, v2, p3}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    return-object v2

    :goto_5
    new-instance p2, Laws/smithy/kotlin/runtime/http/HttpException;

    invoke-static {p1}, Lx43/j;->u(Ljava/io/IOException;)Lmf/p;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Laws/smithy/kotlin/runtime/http/HttpException;-><init>(Ljava/io/IOException;Lmf/p;)V

    throw p2
.end method
