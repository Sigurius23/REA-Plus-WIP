.class final Ldg0/d$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldg0/d;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldg0/c;",
        "previousState",
        "Ldg0/e;",
        "action",
        "<anonymous>",
        "(Ldg0/c;Ldg0/e;)Ldg0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$2"
    f = "UpdateTestsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldg0/d;


# direct methods
.method public constructor <init>(Ldg0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldg0/d;",
            "Lq83/d<",
            "-",
            "Ldg0/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldg0/d$d;->z:Ldg0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ldg0/c;Ldg0/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldg0/c;",
            "Ldg0/e;",
            "Lq83/d<",
            "-",
            "Ldg0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldg0/d$d;

    iget-object v1, p0, Ldg0/d$d;->z:Ldg0/d;

    invoke-direct {v0, v1, p3}, Ldg0/d$d;-><init>(Ldg0/d;Lq83/d;)V

    iput-object p1, v0, Ldg0/d$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldg0/d$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ldg0/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldg0/c;

    check-cast p2, Ldg0/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ldg0/d$d;->f(Ldg0/c;Ldg0/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ldg0/d$d;->x:Ljava/lang/Object;

    check-cast v0, Ldg0/c;

    iget-object v1, p0, Ldg0/d$d;->y:Ljava/lang/Object;

    check-cast v1, Ldg0/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldg0/d$d;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Ldg0/e$c;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ldg0/d$d;->z:Ldg0/d;

    check-cast v1, Ldg0/e$c;

    invoke-virtual {v1}, Ldg0/e$c;->a()Ldg0/b;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ldg0/d;->c(Ldg0/d;Ldg0/c;Ldg0/b;)Ldg0/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v1, Ldg0/e$b;

    if-eqz p1, :cond_1

    check-cast v1, Ldg0/e$b;

    invoke-virtual {v1}, Ldg0/e$b;->a()Ldg0/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Ldg0/e$a;

    if-eqz p1, :cond_2

    check-cast v1, Ldg0/e$a;

    invoke-virtual {v1}, Ldg0/e$a;->a()Ldg0/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
