.class public final Lsl1/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl1/d;->l(Lec3/l;)Lec3/l;
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
    c = "com.whoop.home.domain.connectivity.strap.StrapDomainInteractor$strapDomainActionHandler$$inlined$flatMapLatest$1"
    f = "StrapDomainInteractor.kt"
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

.field final synthetic z:Lsl1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lsl1/d;)V
    .locals 0

    iput-object p2, p0, Lsl1/d$h;->z:Lsl1/d;

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
            "Los0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lsl1/d$h;

    iget-object v1, p0, Lsl1/d$h;->z:Lsl1/d;

    invoke-direct {v0, p3, v1}, Lsl1/d$h;-><init>(Lq83/d;Lsl1/d;)V

    iput-object p1, v0, Lsl1/d$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lsl1/d$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsl1/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsl1/d$h;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl1/d$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lsl1/d$h;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lsl1/d$h;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lsl1/d$h;->y:Ljava/lang/Object;

    check-cast v1, Los0/b;

    sget-object v3, Los0/b$b;->a:Los0/b$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    new-instance v1, Lsl1/d$i;

    iget-object v3, p0, Lsl1/d$h;->z:Lsl1/d;

    invoke-direct {v1, v3, v4}, Lsl1/d$i;-><init>(Lsl1/d;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_2
    sget-object v3, Los0/b$c;->a:Los0/b$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v1, Lsl1/d$j;

    invoke-direct {v1, v4}, Lsl1/d$j;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_3
    sget-object v3, Los0/b$a;->a:Los0/b$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lsl1/d$k;

    invoke-direct {v1, v4}, Lsl1/d$k;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    iput-object v4, p0, Lsl1/d$h;->x:Ljava/lang/Object;

    iput-object v4, p0, Lsl1/d$h;->y:Ljava/lang/Object;

    iput v2, p0, Lsl1/d$h;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
