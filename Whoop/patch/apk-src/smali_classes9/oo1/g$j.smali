.class public final Loo1/g$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$$inlined$flatMapLatest$1"
    f = "MciOverviewInteractor.kt"
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

.field final synthetic z:Loo1/g;


# direct methods
.method public constructor <init>(Lq83/d;Loo1/g;)V
    .locals 0

    iput-object p2, p0, Loo1/g$j;->z:Loo1/g;

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
            "Loo1/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Loo1/g$j;

    iget-object v1, p0, Loo1/g$j;->z:Loo1/g;

    invoke-direct {v0, p3, v1}, Loo1/g$j;-><init>(Lq83/d;Loo1/g;)V

    iput-object p1, v0, Loo1/g$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Loo1/g$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Loo1/g$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Loo1/g$j;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Loo1/g$j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Loo1/g$j;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loo1/g$j;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Loo1/g$j;->y:Ljava/lang/Object;

    check-cast v1, Loo1/e;

    instance-of v3, v1, Loo1/e$d;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    check-cast v1, Loo1/e$d;

    invoke-virtual {v1}, Loo1/e$d;->c()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    iget-object v3, p0, Loo1/g$j;->z:Loo1/g;

    invoke-static {v3}, Loo1/g;->i(Loo1/g;)Lzr2/a;

    move-result-object v3

    invoke-interface {v3}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v3

    const-string v5, "yyyy-MM-dd"

    invoke-virtual {v3, v5}, Lorg/joda/time/LocalDate;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    iget-object v5, p0, Loo1/g$j;->z:Loo1/g;

    invoke-virtual {v1}, Loo1/e$d;->d()Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Loo1/e$d;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v6, v3, v1}, Loo1/g;->k(Loo1/g;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto/16 :goto_2

    :cond_3
    instance-of v3, v1, Loo1/e$e;

    if-eqz v3, :cond_5

    iget-object v3, p0, Loo1/g$j;->z:Loo1/g;

    check-cast v1, Loo1/e$e;

    invoke-static {v3, v1}, Loo1/g;->o(Loo1/g;Loo1/e$e;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Loo1/e$e;->b()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Loo1/g$j;->z:Loo1/g;

    invoke-static {v1, v3}, Loo1/g;->h(Loo1/g;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto/16 :goto_2

    :cond_4
    iget-object v1, p0, Loo1/g$j;->z:Loo1/g;

    invoke-static {v1, v3}, Loo1/g;->n(Loo1/g;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto/16 :goto_2

    :cond_5
    sget-object v3, Loo1/e$m;->a:Loo1/e$m;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    new-instance v1, Loo1/g$o;

    invoke-direct {v1, v4}, Loo1/g$o;-><init>(Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    :goto_0
    move-object v1, v3

    goto/16 :goto_2

    :cond_6
    instance-of v3, v1, Loo1/e$g;

    if-eqz v3, :cond_7

    new-instance v3, Loo1/g$p;

    iget-object v5, p0, Loo1/g$j;->z:Loo1/g;

    invoke-direct {v3, v5, v1, v4}, Loo1/g$p;-><init>(Loo1/g;Loo1/e;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto/16 :goto_2

    :cond_7
    sget-object v3, Loo1/e$f;->a:Loo1/e$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance v1, Loo1/g$q;

    iget-object v3, p0, Loo1/g$j;->z:Loo1/g;

    invoke-direct {v1, v3, v4}, Loo1/g$q;-><init>(Loo1/g;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_8
    instance-of v3, v1, Loo1/e$h;

    sget-object v5, Lec3/k;->w:Lec3/k;

    if-eqz v3, :cond_a

    check-cast v1, Loo1/e$h;

    invoke-virtual {v1}, Loo1/e$h;->a()Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/modal/DecodedGenericInteraction;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v1

    if-nez v1, :cond_9

    if-eqz v3, :cond_9

    new-instance v1, Loo1/g$d$a;

    new-instance v5, Loo1/f$c;

    invoke-direct {v5, v3}, Loo1/f$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-direct {v1, v5}, Loo1/g$d$a;-><init>(Loo1/f;)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_9
    :goto_1
    move-object v1, v5

    goto :goto_2

    :cond_a
    sget-object v3, Loo1/e$i;->a:Loo1/e$i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    new-instance v1, Loo1/g$r;

    iget-object v3, p0, Loo1/g$j;->z:Loo1/g;

    invoke-direct {v1, v3, v4}, Loo1/g$r;-><init>(Loo1/g;Lq83/d;)V

    new-instance v3, Lec3/s1;

    invoke-direct {v3, v1}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_b
    instance-of v3, v1, Loo1/e$l;

    if-eqz v3, :cond_c

    new-instance v3, Loo1/g$s;

    invoke-direct {v3, v1, v4}, Loo1/g$s;-><init>(Loo1/e;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_2

    :cond_c
    sget-object v3, Loo1/e$j;->a:Loo1/e$j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    instance-of v3, v1, Loo1/e$c;

    if-nez v3, :cond_9

    instance-of v3, v1, Loo1/e$k;

    if-nez v3, :cond_9

    instance-of v3, v1, Loo1/e$a;

    if-nez v3, :cond_9

    instance-of v1, v1, Loo1/e$b;

    if-eqz v1, :cond_d

    goto :goto_1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_2
    iput-object v4, p0, Loo1/g$j;->x:Ljava/lang/Object;

    iput-object v4, p0, Loo1/g$j;->y:Ljava/lang/Object;

    iput v2, p0, Loo1/g$j;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    return-object v0

    :cond_e
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
