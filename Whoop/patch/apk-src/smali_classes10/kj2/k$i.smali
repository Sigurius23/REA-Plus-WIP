.class final Lkj2/k$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->z(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lkj2/c$b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshStateFlow$1"
    f = "StressMonitorInteractor.kt"
    l = {
        0x74,
        0x76,
        0x81
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Lkj2/k;

.field final synthetic G:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkj2/k;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkj2/k;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lkj2/k$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$i;->E:Ljava/lang/String;

    iput-object p2, p0, Lkj2/k$i;->F:Lkj2/k;

    iput-object p3, p0, Lkj2/k$i;->G:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkj2/k$i;

    iget-object v1, p0, Lkj2/k$i;->E:Ljava/lang/String;

    iget-object v2, p0, Lkj2/k$i;->F:Lkj2/k;

    iget-object v3, p0, Lkj2/k$i;->G:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lkj2/k$i;-><init>(Ljava/lang/String;Lkj2/k;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lkj2/k$i;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lkj2/k$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkj2/k$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkj2/k$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkj2/k$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lkj2/k$i;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lkj2/k$i;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lkj2/k$i;->w:Ljava/lang/Object;

    check-cast v0, Lnj2/l;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lkj2/k$i;->x:I

    iget-object v4, p0, Lkj2/k$i;->w:Ljava/lang/Object;

    check-cast v4, Lnj2/l;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget v2, p0, Lkj2/k$i;->x:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj2/k$i;->E:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lkj2/k$i;->F:Lkj2/k;

    const-string v6, "yyyy-MM-dd"

    invoke-static {v6}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v6

    invoke-static {v2}, Lkj2/k;->d(Lkj2/k;)Lzr2/a;

    move-result-object v2

    invoke-interface {v2}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v6, v2}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_4
    move p1, v5

    :goto_0
    iget-object v2, p0, Lkj2/k$i;->F:Lkj2/k;

    iget-object v6, p0, Lkj2/k$i;->E:Ljava/lang/String;

    iput-object v0, p0, Lkj2/k$i;->z:Ljava/lang/Object;

    iput p1, p0, Lkj2/k$i;->x:I

    iput v5, p0, Lkj2/k$i;->y:I

    invoke-static {v2, p1, v6, p0}, Lkj2/k;->m(Lkj2/k;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v8, v2

    move v2, p1

    move-object p1, v8

    :goto_1
    check-cast p1, Lnj2/l;

    new-instance v5, Lkj2/c$b;

    invoke-direct {v5, p1}, Lkj2/c$b;-><init>(Lnj2/l;)V

    iput-object v0, p0, Lkj2/k$i;->z:Ljava/lang/Object;

    iput-object p1, p0, Lkj2/k$i;->w:Ljava/lang/Object;

    iput v2, p0, Lkj2/k$i;->x:I

    iput v4, p0, Lkj2/k$i;->y:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v4, p1

    :goto_2
    nop

    instance-of p1, v4, Lnj2/l$e;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lkj2/k$i;->F:Lkj2/k;

    invoke-static {p1}, Lkj2/k;->b(Lkj2/k;)Lfj2/a;

    move-result-object p1

    check-cast v4, Lnj2/l$e;

    invoke-virtual {v4}, Lnj2/l$e;->v()Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lnj2/l$e;->k()Lnj2/c;

    move-result-object v6

    invoke-virtual {v6}, Lnj2/c;->e()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lkj2/k$i;->G:Ljava/lang/String;

    invoke-virtual {p1, v5, v6, v7}, Lfj2/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lnj2/l$e;->k()Lnj2/c;

    move-result-object p1

    invoke-virtual {p1}, Lnj2/c;->g()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lkj2/k$i;->F:Lkj2/k;

    invoke-static {p1}, Lkj2/k;->f(Lkj2/k;)Ltr2/n;

    move-result-object p1

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    const-string v5, "start listening for forced strap sync"

    invoke-interface {p1, v5, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lkj2/k$i;->F:Lkj2/k;

    invoke-static {p1}, Lkj2/k;->k(Lkj2/k;)Lec3/l;

    move-result-object p1

    new-instance v4, Lkj2/k$i$a;

    invoke-direct {v4, p1}, Lkj2/k$i$a;-><init>(Lec3/l;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lkj2/k$i;->z:Ljava/lang/Object;

    iput-object p1, p0, Lkj2/k$i;->w:Ljava/lang/Object;

    iput v2, p0, Lkj2/k$i;->x:I

    iput v3, p0, Lkj2/k$i;->y:I

    invoke-static {v0, v4, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
