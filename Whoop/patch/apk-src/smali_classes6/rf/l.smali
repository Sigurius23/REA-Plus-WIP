.class public final Lrf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# instance fields
.field public final E:Lq83/j;

.field public final F:Lud3/j;

.field public final w:Lvf/a;

.field public final x:Lwf/a;

.field public final y:Lug/b;

.field public final z:Lug/b;


# direct methods
.method public constructor <init>(Lvf/a;Lwf/a;Lug/b;Lug/b;Lq83/j;Lud3/j;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/l;->w:Lvf/a;

    iput-object p2, p0, Lrf/l;->x:Lwf/a;

    iput-object p3, p0, Lrf/l;->y:Lug/b;

    iput-object p4, p0, Lrf/l;->z:Lug/b;

    iput-object p5, p0, Lrf/l;->E:Lq83/j;

    iput-object p6, p0, Lrf/l;->F:Lud3/j;

    return-void
.end method

.method public static b(Lrf/l;Lwf/a;)Lrf/l;
    .locals 7

    iget-object v1, p0, Lrf/l;->w:Lvf/a;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "request"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrf/l;

    iget-object v3, p0, Lrf/l;->y:Lug/b;

    iget-object v4, p0, Lrf/l;->z:Lug/b;

    iget-object v5, p0, Lrf/l;->E:Lq83/j;

    iget-object v6, p0, Lrf/l;->F:Lud3/j;

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lrf/l;-><init>(Lvf/a;Lwf/a;Lug/b;Lug/b;Lq83/j;Lud3/j;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lrf/l;->x:Lwf/a;

    iget-object v0, v0, Lwf/a;->c:Lmf/l;

    instance-of v1, v0, Lmf/n;

    if-eqz v1, :cond_0

    check-cast v0, Lmf/n;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lmf/n;->b:Lt9/u;

    invoke-virtual {v0}, Lt9/u;->cancel()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_1
    :goto_2
    iget-object v0, p0, Lrf/l;->F:Lud3/j;

    check-cast v0, Lzd3/o;

    invoke-virtual {v0}, Lzd3/o;->cancel()V

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lrf/l;->E:Lq83/j;

    return-object v0
.end method
