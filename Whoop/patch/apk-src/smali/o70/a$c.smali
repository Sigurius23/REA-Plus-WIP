.class final Lo70/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo70/a;->interact(Lec3/l;)Lec3/l;
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
        "Lo70/c;",
        "internalState",
        "Lo70/d;",
        "domainAction",
        "<anonymous>",
        "(Lo70/c;Lo70/d;)Lo70/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.terms.PrivacyConsentInteractor$interact$1"
    f = "PrivacyConsentInteractor.kt"
    l = {
        0x14
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lo70/a;


# direct methods
.method public constructor <init>(Lo70/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo70/a;",
            "Lq83/d<",
            "-",
            "Lo70/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo70/a$c;->z:Lo70/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lo70/c;Lo70/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo70/c;",
            "Lo70/d;",
            "Lq83/d<",
            "-",
            "Lo70/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lo70/a$c;

    iget-object v1, p0, Lo70/a$c;->z:Lo70/a;

    invoke-direct {v0, v1, p3}, Lo70/a$c;-><init>(Lo70/a;Lq83/d;)V

    iput-object p1, v0, Lo70/a$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lo70/a$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lo70/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo70/c;

    check-cast p2, Lo70/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lo70/a$c;->f(Lo70/c;Lo70/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lo70/a$c;->x:Ljava/lang/Object;

    check-cast v0, Lo70/c;

    iget-object v1, p0, Lo70/a$c;->y:Ljava/lang/Object;

    check-cast v1, Lo70/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lo70/a$c;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lo70/d$c;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lo70/a$c;->z:Lo70/a;

    move-object v3, v1

    check-cast v3, Lo70/d$c;

    invoke-virtual {v3}, Lo70/d$c;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v0, p0, Lo70/a$c;->x:Ljava/lang/Object;

    iput-object v1, p0, Lo70/a$c;->y:Ljava/lang/Object;

    iput v4, p0, Lo70/a$c;->w:I

    invoke-static {p1, v3, p0}, Lo70/a;->c(Lo70/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lr90/i;

    if-eqz p1, :cond_3

    iget-object v2, p0, Lo70/a$c;->z:Lo70/a;

    check-cast v1, Lo70/d$c;

    invoke-virtual {v1}, Lo70/d$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1, p1}, Lo70/a;->j(Lo70/a;Lo70/c;Ljava/lang/String;Lr90/i;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p1, p0, Lo70/a$c;->z:Lo70/a;

    check-cast v1, Lo70/d$c;

    invoke-virtual {v1}, Lo70/d$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo70/a;->i(Lo70/a;Lo70/c;Ljava/lang/String;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v1, Lo70/d$f;

    if-eqz p1, :cond_5

    check-cast v1, Lo70/d$f;

    invoke-virtual {v1}, Lo70/d$f;->a()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo70/c;->a(Ljava/util/List;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Lo70/d$e;->a:Lo70/d$e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lo70/a$c;->z:Lo70/a;

    invoke-static {p1, v0}, Lo70/a;->h(Lo70/a;Lo70/c;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_6
    sget-object p1, Lo70/d$b;->a:Lo70/d$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lo70/a$c;->z:Lo70/a;

    invoke-static {p1, v0}, Lo70/a;->f(Lo70/a;Lo70/c;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v1, Lo70/d$a;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lo70/a$c;->z:Lo70/a;

    check-cast v1, Lo70/d$a;

    invoke-virtual {v1}, Lo70/d$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo70/a;->e(Lo70/a;Lo70/c;Ljava/lang/String;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v1, Lo70/d$d;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lo70/a$c;->z:Lo70/a;

    check-cast v1, Lo70/d$d;

    invoke-virtual {v1}, Lo70/d$d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo70/a;->g(Lo70/a;Lo70/c;Ljava/lang/String;)Lo70/c;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
