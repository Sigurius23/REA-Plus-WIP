.class public final Lq30/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq30/v0;

.field public final b:Lr30/b;

.field public final c:J

.field public final d:Lec3/h2;

.field public final e:Lec3/h2;


# direct methods
.method public constructor <init>(ILq30/v0;Lr30/b;)V
    .locals 2

    const-string v0, "errorRequestExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq30/g0;->a:Lq30/v0;

    iput-object p3, p0, Lq30/g0;->b:Lr30/b;

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lq30/g0;->c:J

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lq30/g0;->d:Lec3/h2;

    iput-object p1, p0, Lq30/g0;->e:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lq30/f0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lq30/f0;

    iget v1, v0, Lq30/f0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq30/f0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq30/f0;

    invoke-direct {v0, p0, p1}, Lq30/f0;-><init>(Lq30/g0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lq30/f0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq30/f0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lq30/f0;->w:Lq30/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lq30/f0;->w:Lq30/g0;

    iput v3, v0, Lq30/f0;->z:I

    iget-wide v2, p0, Lq30/g0;->c:J

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lq30/g0;->a:Lq30/v0;

    new-instance v1, Lr30/g;

    iget-object v2, v0, Lq30/g0;->b:Lr30/b;

    move-object v3, v2

    iget-object v2, v3, Lr30/b;->x:Ljava/lang/String;

    move-object v4, v3

    iget-object v3, v4, Lr30/b;->y:Ljava/lang/String;

    sget-object v5, Lr30/i;->y:Lr30/i;

    const/16 v5, 0x192

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lr30/f;->x:Lng3/n;

    iget-object v8, v4, Lr30/b;->w:Ljava/lang/String;

    iget-object v9, v4, Lr30/b;->z:Lq30/q0;

    const/16 v10, 0x84

    move-object v4, v5

    const-string v5, "Transaction timed-out."

    const-string v6, "Timeout expiry reached for the transaction"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v10}, Lr30/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;I)V

    invoke-virtual {p1, v1}, Lq30/v0;->a(Lr30/g;)V

    iget-object p1, v0, Lq30/g0;->d:Lec3/h2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
