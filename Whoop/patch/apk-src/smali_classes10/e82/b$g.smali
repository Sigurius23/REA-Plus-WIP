.class final Le82/b$g;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sdk.realtimeStream.RealTimeStreamSdkImpl$toggleRealtimeStream$1"
    f = "RealTimeStreamSdkImpl.kt"
    l = {
        0x83,
        0x28,
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:I

.field private synthetic G:Ljava/lang/Object;

.field final synthetic H:Le82/b;

.field final synthetic I:Z

.field final synthetic J:Lj93/d;
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
.method public constructor <init>(Le82/b;ZLj93/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le82/b;",
            "Z",
            "Lj93/d;",
            "Lq83/d<",
            "-",
            "Le82/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le82/b$g;->H:Le82/b;

    iput-boolean p2, p0, Le82/b$g;->I:Z

    iput-object p3, p0, Le82/b$g;->J:Lj93/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Le82/b$g;

    iget-object v1, p0, Le82/b$g;->H:Le82/b;

    iget-boolean v2, p0, Le82/b$g;->I:Z

    iget-object v3, p0, Le82/b$g;->J:Lj93/d;

    invoke-direct {v0, v1, v2, v3, p2}, Le82/b$g;-><init>(Le82/b;ZLj93/d;Lq83/d;)V

    iput-object p1, v0, Le82/b$g;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Le82/b$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le82/b$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le82/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le82/b$g;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Le82/b$g;->G:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Le82/b$g;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_2
    iget-object v2, p0, Le82/b$g;->y:Ljava/lang/Object;

    check-cast v2, Lj93/d;

    iget-object v7, p0, Le82/b$g;->x:Ljava/lang/Object;

    check-cast v7, Le82/b;

    iget-object v8, p0, Le82/b$g;->w:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le82/b$g;->H:Le82/b;

    invoke-static {p1}, Le82/b;->f(Le82/b;)Lmc3/a;

    move-result-object v8

    iget-object p1, p0, Le82/b$g;->H:Le82/b;

    iget-object v2, p0, Le82/b$g;->J:Lj93/d;

    iput-object v0, p0, Le82/b$g;->G:Ljava/lang/Object;

    iput-object v8, p0, Le82/b$g;->w:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->x:Ljava/lang/Object;

    iput-object v2, p0, Le82/b$g;->y:Ljava/lang/Object;

    iput v4, p0, Le82/b$g;->z:I

    iput v7, p0, Le82/b$g;->F:I

    invoke-interface {v8, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_4

    goto :goto_1

    :cond_4
    move-object v7, p1

    :goto_0
    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {v7}, Le82/b;->g()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    const-string v9, "null cannot be cast to non-null type kotlin.reflect.KClass<*>"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v2}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v8, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    iget-boolean v7, p0, Le82/b$g;->I:Z

    if-eqz v7, :cond_5

    if-eqz v2, :cond_5

    iget-object v5, p0, Le82/b$g;->H:Le82/b;

    invoke-static {v5}, Le82/b;->e(Le82/b;)Ltr2/n;

    move-result-object v5

    iget-object v7, p0, Le82/b$g;->J:Lj93/d;

    invoke-interface {v7}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v7

    const-string v8, " already enabled"

    invoke-static {v7, v8}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v5, v7, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v4, Le82/c$a;->a:Le82/c$a;

    iput-object p1, p0, Le82/b$g;->G:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->w:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->x:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->y:Ljava/lang/Object;

    iput-boolean v2, p0, Le82/b$g;->E:Z

    iput v6, p0, Le82/b$g;->F:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_1

    :cond_5
    iput-object p1, p0, Le82/b$g;->G:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->w:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->x:Ljava/lang/Object;

    iput-object p1, p0, Le82/b$g;->y:Ljava/lang/Object;

    iput-boolean v2, p0, Le82/b$g;->E:Z

    iput v5, p0, Le82/b$g;->F:I

    invoke-interface {v0, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    return-object v3

    :catchall_0
    move-exception v0

    invoke-interface {v8, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
