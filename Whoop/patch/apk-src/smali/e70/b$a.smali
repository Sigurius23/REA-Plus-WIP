.class final Le70/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le70/b;->a(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lf70/e;",
        "activationResult",
        "Lm70/b;",
        "paymentsResult",
        "Lo70/c;",
        "privacyFlow",
        "Le70/a;",
        "<anonymous>",
        "(Lf70/e;Lm70/b;Lo70/c;)Le70/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.combiner.ActivationDomainResultCombiner$combine$1"
    f = "ActivationDomainResultCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Le70/b$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lf70/e;Lm70/b;Lo70/c;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e;",
            "Lm70/b;",
            "Lo70/c;",
            "Lq83/d<",
            "-",
            "Le70/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Le70/b$a;

    invoke-direct {v0, p4}, Le70/b$a;-><init>(Lq83/d;)V

    iput-object p1, v0, Le70/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Le70/b$a;->y:Ljava/lang/Object;

    iput-object p3, v0, Le70/b$a;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Le70/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf70/e;

    check-cast p2, Lm70/b;

    check-cast p3, Lo70/c;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Le70/b$a;->f(Lf70/e;Lm70/b;Lo70/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Le70/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lf70/e;

    iget-object v1, p0, Le70/b$a;->y:Ljava/lang/Object;

    check-cast v1, Lm70/b;

    iget-object v2, p0, Le70/b$a;->z:Ljava/lang/Object;

    check-cast v2, Lo70/c;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, p0, Le70/b$a;->w:I

    if-nez v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Le70/a;

    invoke-direct {p1, v0, v1, v2}, Le70/a;-><init>(Lf70/e;Lm70/b;Lo70/c;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
