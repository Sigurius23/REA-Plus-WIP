.class public final Ldh1/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldh1/d;->l(Ldh1/b$a;Ljava/lang/String;)Lec3/l;
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
    c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$performAction$$inlined$flatMapLatest$1"
    f = "GiftedInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldh1/d;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lq83/d;Ljava/lang/String;Ldh1/d;)V
    .locals 0

    iput-object p2, p0, Ldh1/d$h;->z:Ljava/lang/String;

    iput-object p3, p0, Ldh1/d$h;->E:Ldh1/d;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ldh1/d$h;

    iget-object v1, p0, Ldh1/d$h;->z:Ljava/lang/String;

    iget-object v2, p0, Ldh1/d$h;->E:Ldh1/d;

    invoke-direct {v0, p3, v1, v2}, Ldh1/d$h;-><init>(Lq83/d;Ljava/lang/String;Ldh1/d;)V

    iput-object p1, v0, Ldh1/d$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldh1/d$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldh1/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldh1/d$h;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldh1/d$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ldh1/d$h;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Ldh1/d$h;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Ldh1/d$h;->y:Ljava/lang/Object;

    check-cast v1, Lqw2/b;

    instance-of v3, v1, Lqw2/b$f;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    iget-object v1, p0, Ldh1/d$h;->z:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v3, p0, Ldh1/d$h;->E:Ldh1/d;

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v3, v1, v5, v6, v4}, Ldh1/d;->k(Ldh1/d;Ljava/lang/String;ZILjava/lang/Object;)Lec3/l;

    move-result-object v1

    new-instance v3, Ldh1/d$i;

    invoke-direct {v3, v1}, Ldh1/d$i;-><init>(Lec3/l;)V

    goto/16 :goto_3

    :cond_2
    new-instance v1, Ldh1/e$c;

    sget-object v3, Ldh1/a$d;->a:Ldh1/a$d;

    invoke-direct {v1, v3}, Ldh1/e$c;-><init>(Ldh1/a;)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_3

    :cond_3
    instance-of v3, v1, Lqw2/b$c;

    if-eqz v3, :cond_4

    new-instance v1, Ldh1/e$c;

    sget-object v3, Ldh1/a$b;->a:Ldh1/a$b;

    invoke-direct {v1, v3}, Ldh1/e$c;-><init>(Ldh1/a;)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_3

    :cond_4
    instance-of v3, v1, Lqw2/b$i;

    if-eqz v3, :cond_5

    new-instance v1, Ldh1/e$c;

    sget-object v3, Ldh1/a$b;->a:Ldh1/a$b;

    invoke-direct {v1, v3}, Ldh1/e$c;-><init>(Ldh1/a;)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_3

    :cond_5
    instance-of v3, v1, Lqw2/b$n;

    if-eqz v3, :cond_6

    new-instance v1, Ldh1/e$c;

    sget-object v3, Ldh1/a$e;->a:Ldh1/a$e;

    invoke-direct {v1, v3}, Ldh1/e$c;-><init>(Ldh1/a;)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_3

    :cond_6
    instance-of v3, v1, Lqw2/b$d;

    if-eqz v3, :cond_7

    new-instance v3, Ldh1/e$b;

    new-instance v5, Ldh1/c;

    new-instance v10, Lgh1/b$b;

    check-cast v1, Lqw2/b$d;

    invoke-virtual {v1}, Lqw2/b$d;->b()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v10, v1}, Lgh1/b$b;-><init>(Lcom/whoop/navigation/e;)V

    const/16 v12, 0x2f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Ldh1/c;-><init>(Ldh1/a;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;ZZLgh1/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v5}, Ldh1/e$b;-><init>(Ldh1/c;)V

    new-instance v1, La6/u;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v3, v1

    goto :goto_3

    :cond_7
    instance-of v3, v1, Lqw2/b$a;

    if-eqz v3, :cond_9

    check-cast v1, Lqw2/b$a;

    invoke-virtual {v1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v3, "network"

    invoke-static {v1, v3, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Ldh1/a$c;->a:Ldh1/a$c;

    goto :goto_1

    :cond_8
    sget-object v1, Ldh1/a$d;->a:Ldh1/a$d;

    :goto_1
    new-instance v3, Ldh1/e$c;

    invoke-direct {v3, v1}, Ldh1/e$c;-><init>(Ldh1/a;)V

    new-instance v1, La6/u;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_9
    instance-of v3, v1, Lqw2/b$m;

    if-nez v3, :cond_b

    instance-of v3, v1, Lqw2/b$l;

    if-nez v3, :cond_b

    instance-of v3, v1, Lqw2/b$k;

    if-nez v3, :cond_b

    instance-of v3, v1, Lqw2/b$j;

    if-nez v3, :cond_b

    instance-of v3, v1, Lqw2/b$g;

    if-nez v3, :cond_b

    instance-of v3, v1, Lqw2/b$e;

    if-nez v3, :cond_b

    instance-of v3, v1, Lqw2/b$h;

    if-nez v3, :cond_b

    instance-of v1, v1, Lqw2/b$b;

    if-eqz v1, :cond_a

    goto :goto_2

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_2
    new-instance v1, Ldh1/e$c;

    invoke-direct {v1, v4}, Ldh1/e$c;-><init>(Ldh1/a;)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_3
    iput-object v4, p0, Ldh1/d$h;->x:Ljava/lang/Object;

    iput-object v4, p0, Ldh1/d$h;->y:Ljava/lang/Object;

    iput v2, p0, Ldh1/d$h;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    return-object v0

    :cond_c
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
