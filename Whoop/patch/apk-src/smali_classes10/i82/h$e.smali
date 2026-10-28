.class final Li82/h$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li82/h;->interact(Lec3/l;)Lec3/l;
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
        "Li82/h$a;",
        "carry",
        "Li82/f;",
        "action",
        "<anonymous>",
        "(Li82/h$a;Li82/f;)Li82/h$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.searcharchmini.domain.SearchArchMiniInteractor$interact$1"
    f = "SearchArchMiniInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Li82/h$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Li82/h$a;Li82/f;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li82/h$a;",
            "Li82/f;",
            "Lq83/d<",
            "-",
            "Li82/h$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Li82/h$e;

    invoke-direct {v0, p3}, Li82/h$e;-><init>(Lq83/d;)V

    iput-object p1, v0, Li82/h$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Li82/h$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Li82/h$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li82/h$a;

    check-cast p2, Li82/f;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Li82/h$e;->f(Li82/h$a;Li82/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Li82/h$e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li82/h$a;

    iget-object v0, p0, Li82/h$e;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li82/f;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Li82/h$e;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v2, Li82/f$c;

    if-eqz p1, :cond_1

    move-object p1, v2

    check-cast p1, Li82/f$c;

    invoke-virtual {p1}, Li82/f$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    new-instance v0, Li82/h$a;

    const-string v1, ""

    invoke-direct {v0, v2, p1, v1}, Li82/h$a;-><init>(Li82/f;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    instance-of p1, v2, Li82/f$e;

    if-eqz p1, :cond_2

    move-object p1, v2

    check-cast p1, Li82/f$e;

    invoke-virtual {p1}, Li82/f$e;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Li82/h$a;->b(Li82/h$a;Li82/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Li82/h$a;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Li82/h$a;->b(Li82/h$a;Li82/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Li82/h$a;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
