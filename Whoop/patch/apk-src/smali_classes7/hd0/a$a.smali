.class final Lhd0/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd0/a;->e(Lec3/l;)Lec3/l;
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
        "Lgd0/c;",
        "currentState",
        "Ldd0/b;",
        "domainResult",
        "<anonymous>",
        "(Lgd0/c;Ldd0/b;)Lgd0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.multiconsentscreen.presentation.reducers.MultiConsentViewStateReducer$reduce$1"
    f = "MultiConsentViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lhd0/a;


# direct methods
.method public constructor <init>(Lhd0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd0/a;",
            "Lq83/d<",
            "-",
            "Lhd0/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhd0/a$a;->z:Lhd0/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lgd0/c;Ldd0/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd0/c;",
            "Ldd0/b;",
            "Lq83/d<",
            "-",
            "Lgd0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lhd0/a$a;

    iget-object v1, p0, Lhd0/a$a;->z:Lhd0/a;

    invoke-direct {v0, v1, p3}, Lhd0/a$a;-><init>(Lhd0/a;Lq83/d;)V

    iput-object p1, v0, Lhd0/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lhd0/a$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lhd0/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgd0/c;

    check-cast p2, Ldd0/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lhd0/a$a;->f(Lgd0/c;Ldd0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lhd0/a$a;->x:Ljava/lang/Object;

    check-cast v0, Lgd0/c;

    iget-object v1, p0, Lhd0/a$a;->y:Ljava/lang/Object;

    check-cast v1, Ldd0/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lhd0/a$a;->w:I

    if-nez v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Ldd0/b$c;

    if-eqz p1, :cond_0

    sget-object p1, Lgd0/c$b;->b:Lgd0/c$b;

    return-object p1

    :cond_0
    instance-of p1, v1, Ldd0/b$d;

    if-eqz p1, :cond_1

    sget-object p1, Lgd0/c$a;->b:Lgd0/c$a;

    return-object p1

    :cond_1
    instance-of p1, v1, Ldd0/b$f;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lhd0/a$a;->z:Lhd0/a;

    check-cast v1, Ldd0/b$f;

    invoke-static {p1, v1}, Lhd0/a;->a(Lhd0/a;Ldd0/b$f;)Lgd0/c$e;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Ldd0/b$b;

    if-eqz p1, :cond_3

    new-instance p1, Lgd0/c$d;

    check-cast v1, Ldd0/b$b;

    invoke-virtual {v1}, Ldd0/b$b;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-direct {p1, v0}, Lgd0/c$d;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_3
    instance-of p1, v1, Ldd0/b$a;

    if-eqz p1, :cond_4

    instance-of p1, v0, Lgd0/c$e;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lhd0/a$a;->z:Lhd0/a;

    check-cast v0, Lgd0/c$e;

    check-cast v1, Ldd0/b$a;

    invoke-static {p1, v0, v1}, Lhd0/a;->b(Lhd0/a;Lgd0/c$e;Ldd0/b$a;)Lgd0/c$e;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v1, Ldd0/b$e;

    if-eqz p1, :cond_6

    instance-of p1, v0, Lgd0/c$e;

    if-eqz p1, :cond_5

    move-object v2, v0

    check-cast v2, Lgd0/c$e;

    invoke-virtual {v2}, Lgd0/c$e;->f()I

    move-result p1

    check-cast v1, Ldd0/b$e;

    invoke-virtual {v1}, Ldd0/b$e;->a()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {v2}, Lgd0/c$e;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Le93/b;->n(III)I

    move-result v6

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lgd0/c$e;->c(Lgd0/c$e;Ljava/util/List;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;ILjava/util/Map;ILjava/lang/Object;)Lgd0/c$e;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
