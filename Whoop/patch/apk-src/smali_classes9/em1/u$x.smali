.class public final Lem1/u$x;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lem1/u;-><init>(Lgm1/f;Lil1/r;Lkl1/c;Lil1/p;Lsl1/d;Lul1/a;Lol1/b;Lam1/a;Lil1/i;Lil1/e;Lvl1/b;Ltl1/c;Lcm1/b;Lbm1/d;Ljl1/b;Lwl1/c;Lpl1/b;Lvh2/d;Lrg1/d;Lil1/w;Lll1/c;Lu92/c;Lz92/a;Lgt0/e;Lgl1/b;Lcom/whoop/data/repositories/NotificationRepository;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Lj02/r;Lbc3/c0;Lgm1/e;Lhj0/d;)V
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
    c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$flatMapLatest$2"
    f = "HomeViewModel.kt"
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

.field final synthetic z:Lem1/u;


# direct methods
.method public constructor <init>(Lq83/d;Lem1/u;)V
    .locals 0

    iput-object p2, p0, Lem1/u$x;->z:Lem1/u;

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
            "Ljava/lang/Boolean;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lem1/u$x;

    iget-object v1, p0, Lem1/u$x;->z:Lem1/u;

    invoke-direct {v0, p3, v1}, Lem1/u$x;-><init>(Lq83/d;Lem1/u;)V

    iput-object p1, v0, Lem1/u$x;->x:Ljava/lang/Object;

    iput-object p2, v0, Lem1/u$x;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lem1/u$x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lem1/u$x;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lem1/u$x;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lem1/u$x;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lem1/u$x;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lem1/u$x;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    sget-object v1, Lec3/k;->w:Lec3/k;

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lem1/u$x;->z:Lem1/u;

    invoke-static {v1}, Lem1/u;->l(Lem1/u;)Lec3/o1;

    move-result-object v1

    new-instance v4, Lem1/u$b;

    invoke-direct {v4, v3}, Lem1/u$b;-><init>(Lq83/d;)V

    new-instance v5, Lec3/a0;

    invoke-direct {v5, v4, v1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    move-object v1, v5

    :goto_0
    iput-object v3, p0, Lem1/u$x;->x:Ljava/lang/Object;

    iput-object v3, p0, Lem1/u$x;->y:Ljava/lang/Object;

    iput v2, p0, Lem1/u$x;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
