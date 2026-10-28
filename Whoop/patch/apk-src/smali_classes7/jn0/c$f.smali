.class final Ljn0/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljn0/c;->k(Ljava/lang/String;Ljn0/b;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ljn0/b;",
        "<anonymous>",
        "(Lbc3/c0;)Ljn0/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.challengedetails.domain.ChallengeDetailsInteractor$joinChallenge$2"
    f = "ChallengeDetailsInteractor.kt"
    l = {
        0x68
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljn0/b;

.field final synthetic y:Ljn0/c;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljn0/b;Ljn0/c;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn0/b;",
            "Ljn0/c;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljn0/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljn0/c$f;->x:Ljn0/b;

    iput-object p2, p0, Ljn0/c$f;->y:Ljn0/c;

    iput-object p3, p0, Ljn0/c$f;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljn0/c$f;

    iget-object v0, p0, Ljn0/c$f;->x:Ljn0/b;

    iget-object v1, p0, Ljn0/c$f;->y:Ljn0/c;

    iget-object v2, p0, Ljn0/c$f;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Ljn0/c$f;-><init>(Ljn0/b;Ljn0/c;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ljn0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ljn0/c$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljn0/c$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljn0/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljn0/c$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v5, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v5, Ljn0/c$f;->w:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v10, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Ljn0/c$f;->x:Ljn0/b;

    instance-of v1, v0, Ljn0/b$c;

    if-eqz v1, :cond_5

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v5, Ljn0/c$f;->y:Ljn0/c;

    invoke-static {v1}, Ljn0/c;->c(Ljn0/c;)Ltr2/n;

    move-result-object v1

    new-instance v4, Ljn0/c$f$a;

    iget-object v2, v5, Ljn0/c$f;->y:Ljn0/c;

    iget-object v3, v5, Ljn0/c$f;->z:Ljava/lang/String;

    invoke-direct {v4, v2, v3, v9}, Ljn0/c$f$a;-><init>(Ljn0/c;Ljava/lang/String;Lq83/d;)V

    iput v10, v5, Ljn0/c$f;->w:I

    const/4 v2, 0x0

    const-string v3, "Failed to join challenge"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_2

    return-object v8

    :cond_2
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_3

    iget-object v1, v5, Ljn0/c$f;->x:Ljn0/b;

    check-cast v1, Ljn0/b$c;

    new-instance v11, Ljn0/d;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    invoke-virtual {v2}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    invoke-virtual {v2}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->getSubText()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    invoke-virtual {v2}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->getCtaText()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    invoke-virtual {v2}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->getCtaClose()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;

    invoke-virtual {v0}, Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;->getStatus()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;

    move-result-object v16

    invoke-direct/range {v11 .. v16}, Ljn0/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;)V

    invoke-static {v1, v9, v11, v10, v9}, Ljn0/b$c;->b(Ljn0/b$c;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Ljn0/d;ILjava/lang/Object;)Ljn0/b$c;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_4

    sget-object v0, Ljn0/b$a;->a:Ljn0/b$a;

    return-object v0

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    return-object v0
.end method
