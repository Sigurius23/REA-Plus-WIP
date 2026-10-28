.class public final Lfw1/d$p;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw1/d;->v(Lec3/l;)Lec3/l;
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
    c = "com.whoop.membership.extensions.domain.ExtensionsInteractor$interact$$inlined$flatMapLatest$1"
    f = "ExtensionsInteractor.kt"
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

.field final synthetic z:Lfw1/d;


# direct methods
.method public constructor <init>(Lq83/d;Lfw1/d;)V
    .locals 0

    iput-object p2, p0, Lfw1/d$p;->z:Lfw1/d;

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
            "Lfw1/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lfw1/d$p;

    iget-object v1, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v0, p3, v1}, Lfw1/d$p;-><init>(Lq83/d;Lfw1/d;)V

    iput-object p1, v0, Lfw1/d$p;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfw1/d$p;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfw1/d$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfw1/d$p;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lfw1/d$p;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lfw1/d$p;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lfw1/d$p;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lfw1/d$p;->y:Ljava/lang/Object;

    check-cast v1, Lfw1/b;

    instance-of v3, v1, Lfw1/b$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    new-instance v3, Lfw1/d$s;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v5, v1, v4}, Lfw1/d$s;-><init>(Lfw1/d;Lfw1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_0

    :cond_2
    instance-of v3, v1, Lfw1/b$d;

    if-eqz v3, :cond_3

    new-instance v3, Lfw1/d$t;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v1, v5, v4}, Lfw1/d$t;-><init>(Lfw1/b;Lfw1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_0

    :cond_3
    instance-of v3, v1, Lfw1/b$b;

    if-eqz v3, :cond_4

    new-instance v3, Lfw1/d$u;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v1, v5, v4}, Lfw1/d$u;-><init>(Lfw1/b;Lfw1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_0

    :cond_4
    instance-of v3, v1, Lfw1/b$a;

    if-eqz v3, :cond_5

    new-instance v3, Lfw1/d$v;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v1, v5, v4}, Lfw1/d$v;-><init>(Lfw1/b;Lfw1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_0

    :cond_5
    instance-of v3, v1, Lfw1/b$k;

    if-eqz v3, :cond_6

    new-instance v3, Lfw1/d$w;

    invoke-direct {v3, v1, v4}, Lfw1/d$w;-><init>(Lfw1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_0

    :cond_6
    instance-of v3, v1, Lfw1/b$i;

    if-eqz v3, :cond_7

    new-instance v3, Lfw1/d$x;

    invoke-direct {v3, v1, v4}, Lfw1/d$x;-><init>(Lfw1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_7
    instance-of v3, v1, Lfw1/b$f;

    if-eqz v3, :cond_8

    iget-object v3, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-static {v3}, Lfw1/d;->h(Lfw1/d;)Lqw2/c;

    move-result-object v3

    new-instance v5, Lqw2/f;

    move-object v6, v1

    check-cast v6, Lfw1/b$f;

    invoke-virtual {v6}, Lfw1/b$f;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v6

    invoke-direct {v5, v6}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance v6, La6/u;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v6}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object v3

    new-instance v5, Lfw1/d$b0;

    iget-object v6, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v5, v3, v6, v1}, Lfw1/d$b0;-><init>(Lec3/l;Lfw1/d;Lfw1/b;)V

    move-object v1, v5

    goto :goto_0

    :cond_8
    instance-of v3, v1, Lfw1/b$g;

    if-eqz v3, :cond_9

    new-instance v3, Lfw1/d$y;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v1, v5, v4}, Lfw1/d$y;-><init>(Lfw1/b;Lfw1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_9
    instance-of v3, v1, Lfw1/b$e;

    if-eqz v3, :cond_a

    new-instance v3, Lfw1/d$z;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v5, v1, v4}, Lfw1/d$z;-><init>(Lfw1/d;Lfw1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_a
    instance-of v3, v1, Lfw1/b$j;

    if-eqz v3, :cond_b

    new-instance v3, Lfw1/d$q;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v5, v1, v4}, Lfw1/d$q;-><init>(Lfw1/d;Lfw1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_b
    instance-of v3, v1, Lfw1/b$h;

    if-eqz v3, :cond_d

    new-instance v3, Lfw1/d$r;

    iget-object v5, p0, Lfw1/d$p;->z:Lfw1/d;

    invoke-direct {v3, v5, v1, v4}, Lfw1/d$r;-><init>(Lfw1/d;Lfw1/b;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    iput-object v4, p0, Lfw1/d$p;->x:Ljava/lang/Object;

    iput-object v4, p0, Lfw1/d$p;->y:Ljava/lang/Object;

    iput v2, p0, Lfw1/d$p;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    return-object v0

    :cond_c
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
