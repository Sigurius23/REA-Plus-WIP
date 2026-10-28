.class public final Ltc0/c$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltc0/c;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$interact$$inlined$flatMapLatest$1"
    f = "InsightsDeepDiveInteractor.kt"
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

.field final synthetic z:Ltc0/c;


# direct methods
.method public constructor <init>(Lq83/d;Ltc0/c;)V
    .locals 0

    iput-object p2, p0, Ltc0/c$h;->z:Ltc0/c;

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
            "Ltc0/c$a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ltc0/c$h;

    iget-object v1, p0, Ltc0/c$h;->z:Ltc0/c;

    invoke-direct {v0, p3, v1}, Ltc0/c$h;-><init>(Lq83/d;Ltc0/c;)V

    iput-object p1, v0, Ltc0/c$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Ltc0/c$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ltc0/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ltc0/c$h;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ltc0/c$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ltc0/c$h;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltc0/c$h;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Ltc0/c$h;->y:Ljava/lang/Object;

    check-cast v1, Ltc0/c$a;

    invoke-virtual {v1}, Ltc0/c$a;->a()Ltc0/a;

    move-result-object v3

    invoke-virtual {v1}, Ltc0/c$a;->b()Ljava/lang/String;

    move-result-object v1

    instance-of v4, v3, Ltc0/a$c;

    if-nez v4, :cond_6

    instance-of v4, v3, Ltc0/a$e;

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    instance-of v1, v3, Ltc0/a$b;

    if-eqz v1, :cond_3

    check-cast v3, Ltc0/a$b;

    invoke-virtual {v3}, Ltc0/a$b;->a()Ltc0/b;

    move-result-object v1

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_3
    instance-of v1, v3, Ltc0/a$a;

    if-nez v1, :cond_5

    instance-of v1, v3, Ltc0/a$d;

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    sget-object v3, Lec3/k;->w:Lec3/k;

    goto :goto_3

    :cond_6
    :goto_1
    if-eqz v1, :cond_8

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    :cond_7
    iget-object v3, p0, Ltc0/c$h;->z:Ltc0/c;

    invoke-static {v3, v1}, Ltc0/c;->c(Ltc0/c;Ljava/lang/String;)Lec3/l;

    move-result-object v3

    goto :goto_3

    :cond_8
    :goto_2
    iget-object v1, p0, Ltc0/c$h;->z:Ltc0/c;

    invoke-static {v1}, Ltc0/c;->e(Ltc0/c;)Ltr2/n;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Refresh/LoadData action without valid insightsId"

    invoke-interface {v1, v4, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v1, Ltc0/b$a;->a:Ltc0/b$a;

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_3
    const/4 v1, 0x0

    iput-object v1, p0, Ltc0/c$h;->x:Ljava/lang/Object;

    iput-object v1, p0, Ltc0/c$h;->y:Ljava/lang/Object;

    iput v2, p0, Ltc0/c$h;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    return-object v0

    :cond_9
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
