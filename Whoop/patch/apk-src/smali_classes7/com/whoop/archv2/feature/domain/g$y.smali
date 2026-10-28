.class public final Lcom/whoop/archv2/feature/domain/g$y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/archv2/feature/domain/g;->z(Lec3/l;)Lec3/l;
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
    c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithSingleFlatMapLatest$$inlined$flatMapLatest$1"
    f = "GenericInteractor.kt"
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

.field final synthetic z:Lcom/whoop/archv2/feature/domain/g;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/archv2/feature/domain/g;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

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
            "Lcom/whoop/archv2/feature/domain/g$b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/archv2/feature/domain/g$y;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {v0, p3, v1}, Lcom/whoop/archv2/feature/domain/g$y;-><init>(Lq83/d;Lcom/whoop/archv2/feature/domain/g;)V

    iput-object p1, v0, Lcom/whoop/archv2/feature/domain/g$y;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/archv2/feature/domain/g$y;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/archv2/feature/domain/g$y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/g$y;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/archv2/feature/domain/g$y;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/g$y;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/archv2/feature/domain/g$y;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/g$y;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/archv2/feature/domain/g$b;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v3

    if-nez v3, :cond_2

    sget-object v1, Lcom/whoop/archv2/feature/domain/i$d;->a:Lcom/whoop/archv2/feature/domain/i$d;

    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_2
    instance-of v4, v3, Lcom/whoop/archv2/feature/domain/c$d;

    if-nez v4, :cond_9

    instance-of v4, v3, Lcom/whoop/archv2/feature/domain/c$n;

    if-eqz v4, :cond_3

    goto/16 :goto_0

    :cond_3
    instance-of v4, v3, Lcom/whoop/archv2/feature/domain/c$j;

    if-eqz v4, :cond_4

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v4

    check-cast v4, Lcom/whoop/archv2/feature/domain/c$j;

    invoke-virtual {v4}, Lcom/whoop/archv2/feature/domain/c$j;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->g()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lcom/whoop/archv2/feature/domain/g;->l(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;

    move-result-object v3

    goto/16 :goto_1

    :cond_4
    instance-of v4, v3, Lcom/whoop/archv2/feature/domain/c$k;

    if-eqz v4, :cond_5

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v4

    check-cast v4, Lcom/whoop/archv2/feature/domain/c$k;

    invoke-virtual {v4}, Lcom/whoop/archv2/feature/domain/c$k;->a()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->g()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    new-instance v5, Lcom/whoop/archv2/feature/domain/g$c0;

    iget-object v6, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {v5, v6}, Lcom/whoop/archv2/feature/domain/g$c0;-><init>(Ljava/lang/Object;)V

    invoke-static {v3, v4, v1, v5}, Lcom/whoop/archv2/feature/domain/g;->g(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_5
    instance-of v4, v3, Lcom/whoop/archv2/feature/domain/c$g;

    if-eqz v4, :cond_6

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v4

    check-cast v4, Lcom/whoop/archv2/feature/domain/c$g;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->g()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    new-instance v5, Lcom/whoop/archv2/feature/domain/g$d0;

    iget-object v6, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {v5, v6}, Lcom/whoop/archv2/feature/domain/g$d0;-><init>(Ljava/lang/Object;)V

    invoke-static {v3, v4, v1, v5}, Lcom/whoop/archv2/feature/domain/g;->i(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/archv2/feature/domain/c$g;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_6
    instance-of v4, v3, Lcom/whoop/archv2/feature/domain/c$f;

    if-eqz v4, :cond_7

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v4

    check-cast v4, Lcom/whoop/archv2/feature/domain/c$f;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->g()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    new-instance v5, Lcom/whoop/archv2/feature/domain/g$e0;

    iget-object v6, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-direct {v5, v6}, Lcom/whoop/archv2/feature/domain/g$e0;-><init>(Ljava/lang/Object;)V

    invoke-static {v3, v4, v1, v5}, Lcom/whoop/archv2/feature/domain/g;->h(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/archv2/feature/domain/c$f;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_7
    instance-of v3, v3, Lcom/whoop/archv2/feature/domain/c$e;

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/feature/domain/c$e;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/c$e;->a()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/whoop/archv2/feature/domain/g;->j(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_8
    new-instance v3, Lcom/whoop/archv2/feature/domain/i$c;

    invoke-virtual {v1}, Lcom/whoop/archv2/feature/domain/g$b;->c()Lcom/whoop/archv2/feature/domain/c;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/whoop/archv2/feature/domain/i$c;-><init>(Lcom/whoop/archv2/feature/domain/c;)V

    new-instance v1, La6/u;

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object v3, v1

    goto :goto_1

    :cond_9
    :goto_0
    iget-object v3, p0, Lcom/whoop/archv2/feature/domain/g$y;->z:Lcom/whoop/archv2/feature/domain/g;

    invoke-static {v3, v1}, Lcom/whoop/archv2/feature/domain/g;->c(Lcom/whoop/archv2/feature/domain/g;Lcom/whoop/archv2/feature/domain/g$b;)Lec3/l;

    move-result-object v3

    :goto_1
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whoop/archv2/feature/domain/g$y;->x:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/archv2/feature/domain/g$y;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/archv2/feature/domain/g$y;->w:I

    invoke-static {p1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
