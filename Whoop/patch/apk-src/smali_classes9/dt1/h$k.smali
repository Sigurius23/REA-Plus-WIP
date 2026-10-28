.class public final Ldt1/h$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/h;->y(Lec3/l;)Lec3/l;
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
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsInteractor$interact$$inlined$flatMapLatest$1"
    f = "LabradorDetailsInteractor.kt"
    l = {
        0xc4,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldt1/h;


# direct methods
.method public constructor <init>(Lq83/d;Ldt1/h;)V
    .locals 0

    iput-object p2, p0, Ldt1/h$k;->z:Ldt1/h;

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
            "Ldt1/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ldt1/h$k;

    iget-object v1, p0, Ldt1/h$k;->z:Ldt1/h;

    invoke-direct {v0, p3, v1}, Ldt1/h$k;-><init>(Lq83/d;Ldt1/h;)V

    iput-object p1, v0, Ldt1/h$k;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldt1/h$k;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldt1/h$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldt1/h$k;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldt1/h$k;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ldt1/h$k;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ldt1/h$k;->G:Ljava/lang/Object;

    check-cast v1, Ldt1/e;

    iget-object v1, p0, Ldt1/h$k;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Ldt1/h$k;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Ldt1/h$k;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldt1/h$k;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Ldt1/h$k;->y:Ljava/lang/Object;

    check-cast p1, Ldt1/e;

    instance-of v5, p1, Ldt1/e$e;

    if-eqz v5, :cond_3

    iget-object v3, p0, Ldt1/h$k;->z:Ldt1/h;

    check-cast p1, Ldt1/e$e;

    invoke-virtual {p1}, Ldt1/e$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Ldt1/h;->m(Ldt1/h;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    goto/16 :goto_1

    :cond_3
    instance-of v5, p1, Ldt1/e$h;

    if-eqz v5, :cond_4

    iget-object v3, p0, Ldt1/h$k;->z:Ldt1/h;

    check-cast p1, Ldt1/e$h;

    invoke-virtual {p1}, Ldt1/e$h;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ldt1/e$h;->d()Ljava/time/Instant;

    move-result-object v6

    invoke-virtual {p1}, Ldt1/e$h;->c()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Ldt1/e$h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v5, v6, v7, p1}, Ldt1/h;->p(Ldt1/h;Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    goto/16 :goto_1

    :cond_4
    instance-of v5, p1, Ldt1/e$b;

    if-eqz v5, :cond_5

    iget-object v3, p0, Ldt1/h$k;->z:Ldt1/h;

    check-cast p1, Ldt1/e$b;

    invoke-virtual {p1}, Ldt1/e$b;->b()Ljava/time/Instant;

    move-result-object v5

    invoke-virtual {p1}, Ldt1/e$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v5, p1}, Ldt1/h;->b(Ldt1/h;Ljava/time/Instant;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    goto :goto_1

    :cond_5
    sget-object v5, Ldt1/e$c;->a:Ldt1/e$c;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    sget-object p1, Ldt1/b$e;->a:Ldt1/b$e;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object p1, v3

    goto :goto_1

    :cond_6
    instance-of v5, p1, Ldt1/e$g;

    if-eqz v5, :cond_7

    sget-object p1, Ldt1/b$n;->a:Ldt1/b$n;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_7
    sget-object v5, Ldt1/e$d;->a:Ldt1/e$d;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object p1, p0, Ldt1/h$k;->z:Ldt1/h;

    iput-object v4, p0, Ldt1/h$k;->x:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->y:Ljava/lang/Object;

    iput-object v1, p0, Ldt1/h$k;->E:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->F:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->G:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Ldt1/h$k;->H:I

    iput v3, p0, Ldt1/h$k;->w:I

    invoke-static {p1, p0}, Ldt1/h;->o(Ldt1/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_2

    :cond_8
    sget-object v3, Ldt1/e$f;->a:Ldt1/e$f;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object p1, Ldt1/b$k;->a:Ldt1/b$k;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_9
    sget-object v3, Ldt1/e$a;->a:Ldt1/e$a;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    sget-object p1, Ldt1/b$a;->a:Ldt1/b$a;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_a
    :goto_1
    check-cast p1, Lec3/l;

    iput-object v4, p0, Ldt1/h$k;->x:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->y:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->E:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->F:Ljava/lang/Object;

    iput-object v4, p0, Ldt1/h$k;->G:Ljava/lang/Object;

    iput v2, p0, Ldt1/h$k;->w:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_2
    return-object v0

    :cond_b
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
