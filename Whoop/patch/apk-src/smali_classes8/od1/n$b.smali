.class final Lod1/n$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod1/n;->interact(Lec3/l;)Lec3/l;
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
        "Lod1/m;",
        "previousState",
        "Lod1/i;",
        "internalAction",
        "<anonymous>",
        "(Lod1/m;Lod1/i;)Lod1/m;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.SelectActivityTypeInteractor$interact$2"
    f = "SelectActivityTypeInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lod1/n;


# direct methods
.method public constructor <init>(Lod1/n;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/n;",
            "Lq83/d<",
            "-",
            "Lod1/n$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lod1/n$b;->z:Lod1/n;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lod1/m;Lod1/i;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/m;",
            "Lod1/i;",
            "Lq83/d<",
            "-",
            "Lod1/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lod1/n$b;

    iget-object v1, p0, Lod1/n$b;->z:Lod1/n;

    invoke-direct {v0, v1, p3}, Lod1/n$b;-><init>(Lod1/n;Lq83/d;)V

    iput-object p1, v0, Lod1/n$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lod1/n$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lod1/n$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lod1/m;

    check-cast p2, Lod1/i;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lod1/n$b;->f(Lod1/m;Lod1/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lod1/n$b;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lod1/m;

    iget-object v0, p0, Lod1/n$b;->y:Ljava/lang/Object;

    check-cast v0, Lod1/i;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lod1/n$b;->w:I

    if-nez v2, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lod1/i$a;

    if-eqz p1, :cond_3

    check-cast v0, Lod1/i$a;

    invoke-virtual {v0}, Lod1/i$a;->a()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lod1/i$a;->d()Ln82/a;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Ln82/a;->ALL:Ln82/a;

    :cond_0
    invoke-static {p1, v2}, Lod1/o;->a(Ljava/util/List;Ln82/a;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lod1/i$a;->a()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Lod1/i$a;->c()Ln82/a;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Ln82/a;->ALL:Ln82/a;

    :cond_1
    move-object v6, p1

    invoke-virtual {v0}, Lod1/i$a;->d()Ln82/a;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, Ln82/a;->ALL:Ln82/a;

    :cond_2
    move-object v7, p1

    invoke-virtual {v0}, Lod1/i$a;->b()Ljava/util/List;

    move-result-object v5

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v9}, Lod1/m;->b(Lod1/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;ILjava/lang/Object;)Lod1/m;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lod1/i$b;

    if-eqz p1, :cond_7

    check-cast v0, Lod1/i$b;

    invoke-virtual {v0}, Lod1/i$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lod1/i$b;->a()Ln82/a;

    move-result-object p1

    if-nez p1, :cond_4

    sget-object p1, Ln82/a;->ALL:Ln82/a;

    :cond_4
    move-object v7, p1

    iget-object p1, p0, Lod1/n$b;->z:Lod1/n;

    invoke-static {p1}, Lod1/n;->d(Lod1/n;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lod1/i$b;->a()Ln82/a;

    move-result-object v3

    if-nez v3, :cond_5

    sget-object v3, Ln82/a;->ALL:Ln82/a;

    :cond_5
    invoke-static {p1, v3}, Lod1/o;->b(Ljava/util/List;Ln82/a;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Lod1/m;->c()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0}, Lod1/i$b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lod1/i$b;->a()Ln82/a;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object v0, Ln82/a;->ALL:Ln82/a;

    :cond_6
    iget-object v4, p0, Lod1/n$b;->z:Lod1/n;

    invoke-static {v4}, Lod1/n;->c(Lod1/n;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v4

    invoke-static {p1, v3, v0, v4}, Lod1/o;->d(Ljava/util/List;Ljava/lang/String;Ln82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljava/util/List;

    move-result-object v3

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lod1/m;->b(Lod1/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;ILjava/lang/Object;)Lod1/m;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
