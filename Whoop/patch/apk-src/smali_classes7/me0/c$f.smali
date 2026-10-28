.class final Lme0/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lme0/c;->interact(Lec3/l;)Lec3/l;
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
        "Lme0/b;",
        "previous",
        "Lme0/a;",
        "action",
        "<anonymous>",
        "(Lme0/b;Lme0/a;)Lme0/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor$interact$2"
    f = "TestHistoryInteractor.kt"
    l = {
        0x1c,
        0x1f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lme0/c;


# direct methods
.method public constructor <init>(Lme0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lme0/c;",
            "Lq83/d<",
            "-",
            "Lme0/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lme0/c$f;->z:Lme0/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lme0/b;Lme0/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lme0/b;",
            "Lme0/a;",
            "Lq83/d<",
            "-",
            "Lme0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lme0/c$f;

    iget-object v1, p0, Lme0/c$f;->z:Lme0/c;

    invoke-direct {v0, v1, p3}, Lme0/c$f;-><init>(Lme0/c;Lq83/d;)V

    iput-object p1, v0, Lme0/c$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lme0/c$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lme0/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lme0/b;

    check-cast p2, Lme0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lme0/c$f;->f(Lme0/b;Lme0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lme0/c$f;->x:Ljava/lang/Object;

    check-cast v0, Lme0/b;

    iget-object v1, p0, Lme0/c$f;->y:Ljava/lang/Object;

    check-cast v1, Lme0/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lme0/c$f;->w:I

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

    instance-of p1, v1, Lme0/a$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lme0/c$f;->z:Lme0/c;

    iput-object v3, p0, Lme0/c$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lme0/c$f;->y:Ljava/lang/Object;

    iput v5, p0, Lme0/c$f;->w:I

    invoke-static {p1, p0}, Lme0/c;->c(Lme0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lme0/b;

    return-object p1

    :cond_4
    instance-of p1, v1, Lme0/a$b;

    if-eqz p1, :cond_6

    instance-of p1, v0, Lme0/b$c;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lme0/c$f;->z:Lme0/c;

    check-cast v0, Lme0/b$c;

    check-cast v1, Lme0/a$b;

    invoke-virtual {v1}, Lme0/a$b;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lme0/c$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lme0/c$f;->y:Ljava/lang/Object;

    iput v4, p0, Lme0/c$f;->w:I

    invoke-static {p1, v0, v1, p0}, Lme0/c;->d(Lme0/c;Lme0/b$c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_1
    return-object v2

    :cond_5
    :goto_2
    check-cast p1, Lme0/b;

    return-object p1

    :cond_6
    instance-of p1, v1, Lme0/a$c;

    if-eqz p1, :cond_8

    instance-of p1, v0, Lme0/b$d;

    if-eqz p1, :cond_7

    new-instance p1, Lme0/b$c;

    check-cast v0, Lme0/b$d;

    invoke-virtual {v0}, Lme0/b$d;->a()Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;

    move-result-object v0

    invoke-direct {p1, v0}, Lme0/b$c;-><init>(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;)V

    return-object p1

    :cond_7
    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
