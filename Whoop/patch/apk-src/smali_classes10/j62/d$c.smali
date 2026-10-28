.class public final Lj62/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj62/d;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.referafriend.domain.ReferAFriendInteractor$interact$$inlined$flatMapLatest$1"
    f = "ReferAFriendInteractor.kt"
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


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lj62/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lj62/d$c;

    invoke-direct {v0, p3}, Lj62/d$c;-><init>(Lq83/d;)V

    iput-object p1, v0, Lj62/d$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lj62/d$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lj62/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lj62/d$c;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj62/d$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lj62/d$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj62/d$c;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lj62/d$c;->y:Ljava/lang/Object;

    check-cast v1, Lj62/a;

    instance-of v3, v1, Lj62/a$c;

    if-eqz v3, :cond_2

    new-instance v3, Lj62/e$c;

    check-cast v1, Lj62/a$c;

    invoke-virtual {v1}, Lj62/a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Lj62/e$c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lj62/e;

    sget-object v4, Lj62/e$d;->a:Lj62/e$d;

    const/4 v5, 0x0

    aput-object v4, v1, v5

    aput-object v3, v1, v2

    new-instance v3, Lbm/g;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_2
    sget-object v3, Lj62/a$d;->a:Lj62/a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v1, Lj62/e$e;->a:Lj62/e$e;

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_3
    sget-object v3, Lj62/a$e;->a:Lj62/a$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v1, Lj62/e$f;->a:Lj62/e$f;

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_4
    sget-object v3, Lj62/a$a;->a:Lj62/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v1, Lj62/e$a;->a:Lj62/e$a;

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_5
    sget-object v3, Lj62/a$b;->a:Lj62/a$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v1, Lj62/e$b;->a:Lj62/e$b;

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_6
    sget-object v3, Lj62/a$f;->a:Lj62/a$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lj62/e$g;->a:Lj62/e$g;

    new-instance v3, La6/u;

    invoke-direct {v3, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lj62/d$c;->x:Ljava/lang/Object;

    iput-object v1, p0, Lj62/d$c;->y:Ljava/lang/Object;

    iput v2, p0, Lj62/d$c;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
