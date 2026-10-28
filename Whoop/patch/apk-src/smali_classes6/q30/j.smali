.class public final Lq30/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq30/k;


# static fields
.field public static final e:J


# instance fields
.field public final a:Lr30/b;

.field public final b:Ln30/d;

.field public final c:Lq30/t0;

.field public final d:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lq30/j;->e:J

    return-void
.end method

.method public constructor <init>(Lr30/b;Ln30/d;Lq30/r0;Lq83/j;)V
    .locals 1

    const-string v0, "creqData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p2, p4}, Lq30/r0;->a(Ln30/d;Lq83/j;)Lq30/t0;

    move-result-object p3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/j;->a:Lr30/b;

    iput-object p2, p0, Lq30/j;->b:Ln30/d;

    iput-object p3, p0, Lq30/j;->c:Lq30/t0;

    iput-object p4, p0, Lq30/j;->d:Lq83/j;

    return-void
.end method

.method public static final a(Lq30/j;Lr30/b;Ls83/c;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p2, Lq30/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq30/i;

    iget v1, v0, Lq30/i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq30/i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq30/i;

    invoke-direct {v0, p0, p2}, Lq30/i;-><init>(Lq30/j;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lq30/i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq30/i;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lq30/i;->x:Lr30/b;

    iget-object p1, v0, Lq30/i;->w:Lq30/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Lq30/i;->x:Lr30/b;

    iget-object p0, v0, Lq30/i;->w:Lq30/j;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lq30/i;->w:Lq30/j;

    iput-object p1, v0, Lq30/i;->x:Lr30/b;

    iput v4, v0, Lq30/i;->E:I

    sget-wide v4, Lq30/j;->e:J

    invoke-static {v4, v5, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    :try_start_1
    iget-object p2, p0, Lq30/j;->c:Lq30/t0;

    iput-object p0, v0, Lq30/i;->w:Lq30/j;

    iput-object p1, v0, Lq30/i;->x:Lr30/b;

    iput v3, v0, Lq30/i;->E:I

    invoke-virtual {p2, p1, v0}, Lq30/t0;->b(Lr30/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_3
    :try_start_2
    check-cast p2, Lq30/t;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception p2

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_4
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_5
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lq30/j;->b:Ln30/d;

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    const/16 v3, 0xf5f

    invoke-static {p0, v2, v2, v2, v3}, Lr30/b;->b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\n                            Failed to execute challenge request.\n\n                            CReq = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\n                        "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p1, Ln30/c;

    invoke-virtual {p1, v1}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_7

    goto :goto_6

    :cond_7
    new-instance p2, Lq30/q;

    invoke-direct {p2, p0}, Lq30/q;-><init>(Ljava/lang/Throwable;)V

    :goto_6
    return-object p2
.end method
