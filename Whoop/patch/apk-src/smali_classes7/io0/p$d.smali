.class public final Lio0/p$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/p;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingIntakeInteractor$interact$$inlined$flatMapLatest$1"
    f = "ClinicianVideoSchedulingIntakeInteractor.kt"
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

.field final synthetic z:Lio0/p;


# direct methods
.method public constructor <init>(Lq83/d;Lio0/p;)V
    .locals 0

    iput-object p2, p0, Lio0/p$d;->z:Lio0/p;

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
            "Lio0/o;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio0/p$d;

    iget-object v1, p0, Lio0/p$d;->z:Lio0/p;

    invoke-direct {v0, p3, v1}, Lio0/p$d;-><init>(Lq83/d;Lio0/p;)V

    iput-object p1, v0, Lio0/p$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lio0/p$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio0/p$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio0/p$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio0/p$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio0/p$d;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lio0/p$d;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lio0/p$d;->y:Ljava/lang/Object;

    check-cast v1, Lio0/o;

    instance-of v3, v1, Lio0/o$a;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio0/p$d;->z:Lio0/p;

    move-object v4, v1

    check-cast v4, Lio0/o$a;

    invoke-virtual {v4}, Lio0/o$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lio0/o$a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lio0/o$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v6, v4}, Lio0/p;->f(Lio0/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v3

    new-instance v4, Lio0/p$f;

    invoke-direct {v4, v3, v1}, Lio0/p$f;-><init>(Lec3/l;Lio0/o;)V

    goto/16 :goto_1

    :cond_2
    instance-of v3, v1, Lio0/o$b;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lio0/p$d;->z:Lio0/p;

    check-cast v1, Lio0/o$b;

    invoke-virtual {v1}, Lio0/o$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio0/o$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lio0/p;->j(Lio0/p;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v4

    goto/16 :goto_1

    :cond_3
    instance-of v3, v1, Lio0/o$d;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lio0/p$d;->z:Lio0/p;

    check-cast v1, Lio0/o$d;

    invoke-virtual {v1}, Lio0/o$d;->b()Lio0/u;

    move-result-object v4

    invoke-virtual {v1}, Lio0/o$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lio0/p;->k(Lio0/p;Lio0/u;Ljava/lang/String;)Lec3/l;

    move-result-object v4

    goto :goto_1

    :cond_4
    instance-of v3, v1, Lio0/o$c;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lio0/p$d;->z:Lio0/p;

    check-cast v1, Lio0/o$c;

    invoke-virtual {v1}, Lio0/o$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio0/o$c;->b()Ljava/util/List;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lio0/p;->i(Lio0/p;Ljava/lang/String;Ljava/util/List;)Lec3/l;

    move-result-object v4

    goto :goto_1

    :cond_5
    sget-object v3, Lio0/o$h;->a:Lio0/o$h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    sget-object v3, Lio0/o$i;->a:Lio0/o$i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    sget-object v3, Lio0/o$g;->a:Lio0/o$g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$e;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$f;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$l;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$m;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$o;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$n;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$k;

    if-nez v3, :cond_7

    instance-of v3, v1, Lio0/o$j;

    if-eqz v3, :cond_6

    goto :goto_0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    new-instance v3, Lio0/p$a$c;

    invoke-direct {v3, v1}, Lio0/p$a$c;-><init>(Lio0/o;)V

    new-instance v4, La6/u;

    const/4 v1, 0x1

    invoke-direct {v4, v3, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_1
    const/4 v1, 0x0

    iput-object v1, p0, Lio0/p$d;->x:Ljava/lang/Object;

    iput-object v1, p0, Lio0/p$d;->y:Ljava/lang/Object;

    iput v2, p0, Lio0/p$d;->w:I

    invoke-static {p1, v4, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
