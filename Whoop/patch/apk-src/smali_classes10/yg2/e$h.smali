.class public final Lyg2/e$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg2/e;-><init>(Lci2/b;Lwu0/b;Lgt0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lrt0/c;Leq1/a;Lbc3/c0;Lfi0/a;Lus0/g;Ljt0/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.state.LiveHrStateCombiner$special$$inlined$flatMapLatest$1"
    f = "LiveHrStateCombiner.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lyg2/e;


# direct methods
.method public constructor <init>(Lq83/d;Lyg2/e;)V
    .locals 0

    iput-object p2, p0, Lyg2/e$h;->z:Lyg2/e;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lyg2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lyg2/e$h;

    iget-object v1, p0, Lyg2/e$h;->z:Lyg2/e;

    invoke-direct {v0, p3, v1}, Lyg2/e$h;-><init>(Lq83/d;Lyg2/e;)V

    iput-object p1, v0, Lyg2/e$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lyg2/e$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lyg2/e$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lyg2/e$h;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lyg2/e$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lyg2/e$h;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyg2/e$h;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lyg2/e$h;->y:Ljava/lang/Object;

    check-cast v1, Lyg2/b;

    instance-of v3, v1, Lyg2/b$b;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget-object v1, p0, Lyg2/e$h;->z:Lyg2/e;

    invoke-static {v1}, Lyg2/e;->e(Lyg2/e;)Lrt0/c;

    move-result-object v1

    const-class v3, Lrt0/b$a;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Lrt0/c;->a(Lj93/d;Z)Lec3/l;

    move-result-object v1

    new-instance v3, Lyg2/e$j;

    iget-object v5, p0, Lyg2/e$h;->z:Lyg2/e;

    invoke-direct {v3, v5, v4}, Lyg2/e$j;-><init>(Lyg2/e;Lq83/d;)V

    new-instance v5, Lec3/j1;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v3, v6}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v1, Lyg2/e$l;

    invoke-direct {v1, v5}, Lyg2/e$l;-><init>(Lec3/l;)V

    new-instance v3, Lyg2/e$m;

    invoke-direct {v3, v1}, Lyg2/e$m;-><init>(Lec3/l;)V

    goto :goto_0

    :cond_2
    instance-of v1, v1, Lyg2/b$a;

    if-eqz v1, :cond_4

    new-instance v1, Lyg2/e$k;

    iget-object v3, p0, Lyg2/e$h;->z:Lyg2/e;

    invoke-direct {v1, v3, v4}, Lyg2/e$k;-><init>(Lyg2/e;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    iput-object v4, p0, Lyg2/e$h;->x:Ljava/lang/Object;

    iput-object v4, p0, Lyg2/e$h;->y:Ljava/lang/Object;

    iput v2, p0, Lyg2/e$h;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
