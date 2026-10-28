.class final Lzp2/f$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp2/f;->interact(Lec3/l;)Lec3/l;
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
        "Lzp2/c;",
        "result",
        "Lzp2/e;",
        "action",
        "<anonymous>",
        "(Lzp2/c;Lzp2/e;)Lzp2/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.user.journey.domain.UserJourneyDomainCombiner$interact$1"
    f = "UserJourneyDomainCombiner.kt"
    l = {
        0x1b,
        0x1e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzp2/f;


# direct methods
.method public constructor <init>(Lzp2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzp2/f;",
            "Lq83/d<",
            "-",
            "Lzp2/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzp2/f$d;->z:Lzp2/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lzp2/c;Lzp2/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzp2/c;",
            "Lzp2/e;",
            "Lq83/d<",
            "-",
            "Lzp2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzp2/f$d;

    iget-object v1, p0, Lzp2/f$d;->z:Lzp2/f;

    invoke-direct {v0, v1, p3}, Lzp2/f$d;-><init>(Lzp2/f;Lq83/d;)V

    iput-object p1, v0, Lzp2/f$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzp2/f$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzp2/f$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzp2/c;

    check-cast p2, Lzp2/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzp2/f$d;->f(Lzp2/c;Lzp2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lzp2/f$d;->x:Ljava/lang/Object;

    check-cast v0, Lzp2/c;

    iget-object v1, p0, Lzp2/f$d;->y:Ljava/lang/Object;

    check-cast v1, Lzp2/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lzp2/f$d;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lzp2/e$c;

    if-eqz p1, :cond_3

    sget-object p1, Lzp2/c$b;->a:Lzp2/c$b;

    return-object p1

    :cond_3
    instance-of p1, v1, Lzp2/e$d;

    const/4 v3, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lzp2/f$d;->z:Lzp2/f;

    check-cast v1, Lzp2/e$d;

    invoke-virtual {v1}, Lzp2/e$d;->a()I

    move-result v1

    iput-object v3, p0, Lzp2/f$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzp2/f$d;->y:Ljava/lang/Object;

    iput v5, p0, Lzp2/f$d;->w:I

    invoke-static {p1, v0, v1, p0}, Lzp2/f;->d(Lzp2/f;Lzp2/c;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast p1, Lzp2/c;

    return-object p1

    :cond_5
    instance-of p1, v1, Lzp2/e$e;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lzp2/f$d;->z:Lzp2/f;

    check-cast v1, Lzp2/e$e;

    iput-object v3, p0, Lzp2/f$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lzp2/f$d;->y:Ljava/lang/Object;

    iput v4, p0, Lzp2/f$d;->w:I

    invoke-static {p1, v0, v1, p0}, Lzp2/f;->e(Lzp2/f;Lzp2/c;Lzp2/e$e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_1
    return-object v2

    :cond_6
    :goto_2
    check-cast p1, Lzp2/c;

    return-object p1

    :cond_7
    iget-object p1, p0, Lzp2/f$d;->z:Lzp2/f;

    invoke-static {p1, v0, v1}, Lzp2/f;->c(Lzp2/f;Lzp2/c;Lzp2/e;)Lzp2/c;

    move-result-object p1

    return-object p1
.end method
