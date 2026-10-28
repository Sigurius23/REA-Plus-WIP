.class final Ltc0/c$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltc0/c;->j(Lec3/l;)Lec3/l;
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
        "Ltc0/c$a;",
        "accumulator",
        "Ltc0/a;",
        "domainAction",
        "<anonymous>",
        "(Ltc0/c$a;Ltc0/a;)Ltc0/c$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.insightsdeepdive.domain.InsightsDeepDiveInteractor$saveInsightsIdForRefresh$1"
    f = "InsightsDeepDiveInteractor.kt"
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
            "Ltc0/c$j;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ltc0/c$a;Ltc0/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltc0/c$a;",
            "Ltc0/a;",
            "Lq83/d<",
            "-",
            "Ltc0/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ltc0/c$j;

    invoke-direct {v0, p3}, Ltc0/c$j;-><init>(Lq83/d;)V

    iput-object p1, v0, Ltc0/c$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Ltc0/c$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ltc0/c$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltc0/c$a;

    check-cast p2, Ltc0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ltc0/c$j;->f(Ltc0/c$a;Ltc0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ltc0/c$j;->x:Ljava/lang/Object;

    check-cast v0, Ltc0/c$a;

    iget-object v1, p0, Ltc0/c$j;->y:Ljava/lang/Object;

    check-cast v1, Ltc0/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ltc0/c$j;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ltc0/c$a;

    instance-of v2, v1, Ltc0/a$c;

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Ltc0/a$c;

    invoke-virtual {v2}, Ltc0/a$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ltc0/a$c;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ltc0/c$a;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ltc0/c$a;->c()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-direct {p1, v1, v0}, Ltc0/c$a;-><init>(Ltc0/a;Ljava/lang/String;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
