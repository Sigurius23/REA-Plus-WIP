.class public final Lio0/n$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio0/n;->interact(Lec3/l;)Lec3/l;
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
    c = "com.whoop.clinicianintheloop.domain.ClinicianVideoSchedulingFormInteractor$interact$$inlined$flatMapLatest$1"
    f = "ClinicianVideoSchedulingFormInteractor.kt"
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

.field final synthetic z:Lio0/n;


# direct methods
.method public constructor <init>(Lq83/d;Lio0/n;)V
    .locals 0

    iput-object p2, p0, Lio0/n$d;->z:Lio0/n;

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
            "Lio0/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio0/n$d;

    iget-object v1, p0, Lio0/n$d;->z:Lio0/n;

    invoke-direct {v0, p3, v1}, Lio0/n$d;-><init>(Lq83/d;Lio0/n;)V

    iput-object p1, v0, Lio0/n$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lio0/n$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio0/n$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio0/n$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio0/n$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio0/n$d;->x:Ljava/lang/Object;

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

    iget-object p1, p0, Lio0/n$d;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lio0/n$d;->y:Ljava/lang/Object;

    check-cast v1, Lio0/l;

    instance-of v3, v1, Lio0/l$a;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget-object v3, p0, Lio0/n$d;->z:Lio0/n;

    check-cast v1, Lio0/l$a;

    invoke-virtual {v1}, Lio0/l$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio0/l$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v5, v1}, Lio0/n;->e(Lio0/n;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto :goto_0

    :cond_2
    instance-of v3, v1, Lio0/l$c;

    if-eqz v3, :cond_3

    new-instance v3, Lio0/n$e;

    invoke-direct {v3, v1, v4}, Lio0/n$e;-><init>(Lio0/l;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_3
    instance-of v3, v1, Lio0/l$d;

    if-eqz v3, :cond_4

    new-instance v3, Lio0/n$f;

    invoke-direct {v3, v1, v4}, Lio0/n$f;-><init>(Lio0/l;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v3}, Lec3/s1;-><init>(Lc93/m;)V

    goto :goto_0

    :cond_4
    instance-of v3, v1, Lio0/l$b;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lio0/n$d;->z:Lio0/n;

    check-cast v1, Lio0/l$b;

    invoke-virtual {v1}, Lio0/l$b;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio0/l$b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lio0/l$b;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lio0/l$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v5, v6, v7, v1}, Lio0/n;->f(Lio0/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    :goto_0
    iput-object v4, p0, Lio0/n$d;->x:Ljava/lang/Object;

    iput-object v4, p0, Lio0/n$d;->y:Ljava/lang/Object;

    iput v2, p0, Lio0/n$d;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
