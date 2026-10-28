.class final Lor2/d0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lor2/d0;->a(Landroidx/lifecycle/p0;Lq83/j;)Lec3/l;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "Ldc3/u;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.util.FlowLiveDataKt$asFlow$1"
    f = "FlowLiveData.kt"
    l = {
        0x16,
        0x1b,
        0x1c,
        0x1e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lq83/j;

.field final synthetic F:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/j;Landroidx/lifecycle/p0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/j;",
            "Landroidx/lifecycle/p0;",
            "Lq83/d<",
            "-",
            "Lor2/d0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lor2/d0$a;->E:Lq83/j;

    iput-object p2, p0, Lor2/d0$a;->F:Landroidx/lifecycle/p0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ldc3/u;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lor2/d0$a;->h(Ldc3/u;Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Ldc3/u;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ldc3/t;

    invoke-virtual {p0, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lor2/d0$a;

    iget-object v1, p0, Lor2/d0$a;->E:Lq83/j;

    iget-object v2, p0, Lor2/d0$a;->F:Landroidx/lifecycle/p0;

    invoke-direct {v0, v1, v2, p2}, Lor2/d0$a;-><init>(Lq83/j;Landroidx/lifecycle/p0;Lq83/d;)V

    iput-object p1, v0, Lor2/d0$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lor2/d0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lor2/d0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lor2/d0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lor2/d0$a;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lor2/d0$a;->z:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lor2/d0$a;->y:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lor2/d0$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v1, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/v0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    iget-object v0, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/v0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/v0;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/v0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lor2/c0;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2}, Lor2/c0;-><init>(Ljava/lang/Object;I)V

    iget-object v0, p0, Lor2/d0$a;->E:Lq83/j;

    new-instance v2, Lor2/d0$a$a;

    iget-object v8, p0, Lor2/d0$a;->F:Landroidx/lifecycle/p0;

    invoke-direct {v2, v8, p1, v7}, Lor2/d0$a$a;-><init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;Lq83/d;)V

    iput-object v7, p0, Lor2/d0$a;->z:Ljava/lang/Object;

    iput-object p1, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    iput v6, p0, Lor2/d0$a;->y:I

    invoke-static {v0, v2, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, p1

    :goto_0
    :try_start_2
    iget-object p1, p0, Lor2/d0$a;->E:Lq83/j;

    new-instance v2, Lor2/d0$a$b;

    iget-object v6, p0, Lor2/d0$a;->F:Landroidx/lifecycle/p0;

    invoke-direct {v2, v6, v0, v7}, Lor2/d0$a$b;-><init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;Lq83/d;)V

    iput-object v7, p0, Lor2/d0$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    iput v5, p0, Lor2/d0$a;->y:I

    invoke-static {p1, v2, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iput-object v7, p0, Lor2/d0$a;->z:Ljava/lang/Object;

    iput-object v0, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    iput v4, p0, Lor2/d0$a;->y:I

    invoke-static {p0}, Lbc3/m0;->a(Ls83/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v1

    :goto_2
    iget-object v2, p0, Lor2/d0$a;->E:Lq83/j;

    sget-object v4, Lbc3/y1;->w:Lbc3/y1;

    invoke-interface {v2, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    new-instance v4, Lor2/d0$a$c;

    iget-object v5, p0, Lor2/d0$a;->F:Landroidx/lifecycle/p0;

    invoke-direct {v4, v5, p1, v7}, Lor2/d0$a$c;-><init>(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;Lq83/d;)V

    iput-object v7, p0, Lor2/d0$a;->z:Ljava/lang/Object;

    iput-object v7, p0, Lor2/d0$a;->w:Ljava/lang/Object;

    iput-object v0, p0, Lor2/d0$a;->x:Ljava/lang/Object;

    iput v3, p0, Lor2/d0$a;->y:I

    invoke-static {v2, v4, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    throw v0
.end method
