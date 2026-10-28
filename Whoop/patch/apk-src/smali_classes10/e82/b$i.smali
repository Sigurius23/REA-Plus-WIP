.class final Le82/b$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le82/b;->a(Lj93/d;Z)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Le82/c;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Le82/c;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sdk.realtimeStream.RealTimeStreamSdkImpl$toggleRealtimeStream$3"
    f = "RealTimeStreamSdkImpl.kt"
    l = {
        0x83
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Le82/b;

.field final synthetic H:Lj93/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj93/d;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Le82/b;Lj93/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le82/b;",
            "Lj93/d;",
            "Lq83/d<",
            "-",
            "Le82/b$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le82/b$i;->G:Le82/b;

    iput-object p2, p0, Le82/b$i;->H:Lj93/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Le82/b$i;

    iget-object v1, p0, Le82/b$i;->G:Le82/b;

    iget-object v2, p0, Le82/b$i;->H:Lj93/d;

    invoke-direct {v0, v1, v2, p2}, Le82/b$i;-><init>(Le82/b;Lj93/d;Lq83/d;)V

    iput-object p1, v0, Le82/b$i;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Le82/c;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le82/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Le82/b$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le82/b$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le82/b$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le82/c;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le82/b$i;->f(Le82/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Le82/b$i;->F:Ljava/lang/Object;

    check-cast v0, Le82/c;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Le82/b$i;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, p0, Le82/b$i;->y:Ljava/lang/Object;

    check-cast v1, Lj93/d;

    iget-object v2, p0, Le82/b$i;->x:Ljava/lang/Object;

    check-cast v2, Le82/b;

    iget-object v3, p0, Le82/b$i;->w:Ljava/lang/Object;

    check-cast v3, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le82/b$i;->G:Le82/b;

    invoke-static {p1}, Le82/b;->f(Le82/b;)Lmc3/a;

    move-result-object p1

    iget-object v2, p0, Le82/b$i;->G:Le82/b;

    iget-object v4, p0, Le82/b$i;->H:Lj93/d;

    iput-object v0, p0, Le82/b$i;->F:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$i;->w:Ljava/lang/Object;

    iput-object v2, p0, Le82/b$i;->x:Ljava/lang/Object;

    iput-object v4, p0, Le82/b$i;->y:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Le82/b$i;->z:I

    iput v3, p0, Le82/b$i;->E:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    move-object v3, p1

    move-object v1, v4

    :goto_0
    const/4 p1, 0x0

    :try_start_0
    instance-of v4, v0, Le82/c$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "null cannot be cast to non-null type kotlin.reflect.KClass<com.whoop.connectivityCore.sdk.RealTimeDataType>"

    if-eqz v4, :cond_3

    :try_start_1
    invoke-virtual {v2}, Le82/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    instance-of v0, v0, Le82/c$d;

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Le82/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :goto_1
    invoke-interface {v3, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_2
    invoke-interface {v3, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
