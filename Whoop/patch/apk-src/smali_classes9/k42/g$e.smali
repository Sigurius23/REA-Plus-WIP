.class final Lk42/g$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk42/g;->interact(Lec3/l;)Lec3/l;
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
        "Lk42/f;",
        "previousDomainState",
        "Lk42/g$a;",
        "action",
        "<anonymous>",
        "(Lk42/f;Lk42/g$a;)Lk42/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$interact$2"
    f = "PrivacyConsentInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lk42/g;


# direct methods
.method public constructor <init>(Lk42/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk42/g;",
            "Lq83/d<",
            "-",
            "Lk42/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lk42/g$e;->z:Lk42/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lk42/f;Lk42/g$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk42/f;",
            "Lk42/g$a;",
            "Lq83/d<",
            "-",
            "Lk42/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lk42/g$e;

    iget-object v1, p0, Lk42/g$e;->z:Lk42/g;

    invoke-direct {v0, v1, p3}, Lk42/g$e;-><init>(Lk42/g;Lq83/d;)V

    iput-object p1, v0, Lk42/g$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lk42/g$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lk42/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk42/f;

    check-cast p2, Lk42/g$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lk42/g$e;->f(Lk42/f;Lk42/g$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lk42/g$e;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lk42/f;

    iget-object v1, v0, Lk42/g$e;->y:Ljava/lang/Object;

    check-cast v1, Lk42/g$a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lk42/g$e;->w:I

    if-nez v3, :cond_b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lk42/g$a$f;->a:Lk42/g$a$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v14, 0x7f7

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_0
    sget-object v3, Lk42/g$a$d;->a:Lk42/g$a$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v1, v0, Lk42/g$e;->z:Lk42/g;

    invoke-static {v1, v2}, Lk42/g;->c(Lk42/g;Lk42/f;)Lk42/f;

    move-result-object v3

    const/16 v15, 0x7fe

    const/16 v16, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_1
    sget-object v3, Lk42/g$a$c;->a:Lk42/g$a$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v1, v0, Lk42/g$e;->z:Lk42/g;

    invoke-static {v1, v2}, Lk42/g;->c(Lk42/g;Lk42/f;)Lk42/f;

    move-result-object v3

    const/16 v15, 0x7fd

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_2
    sget-object v3, Lk42/g$a$i;->a:Lk42/g$a$i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v1, v0, Lk42/g$e;->z:Lk42/g;

    invoke-static {v1, v2}, Lk42/g;->c(Lk42/g;Lk42/f;)Lk42/f;

    move-result-object v3

    const/16 v15, 0x6ff

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v16}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_3
    instance-of v3, v1, Lk42/g$a$e;

    if-eqz v3, :cond_5

    check-cast v1, Lk42/g$a$e;

    invoke-virtual {v1}, Lk42/g$a$e;->b()Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;->getSearchable()Z

    move-result v8

    invoke-virtual {v1}, Lk42/g$a$e;->b()Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;->getMutualCommunitySharing()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_0
    move v9, v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lk42/g$a$e;->b()Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;->getAllowRecommendation()Ljava/lang/Boolean;

    move-result-object v10

    iget-object v2, v0, Lk42/g$e;->z:Lk42/g;

    invoke-virtual {v1}, Lk42/g$a$e;->a()Lcom/whoop/privacyconsent/api/DataSharingResponse;

    move-result-object v1

    invoke-virtual {v2, v1}, Lk42/g;->u(Lcom/whoop/privacyconsent/api/DataSharingResponse;)Lk42/d;

    move-result-object v13

    new-instance v3, Lk42/f;

    const/16 v15, 0x587

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v16}, Lk42/f;-><init>(ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_5
    instance-of v3, v1, Lk42/g$a$j;

    if-eqz v3, :cond_6

    iget-object v3, v0, Lk42/g$e;->z:Lk42/g;

    check-cast v1, Lk42/g$a$j;

    invoke-virtual {v1}, Lk42/g$a$j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Lk42/g;->p(Lk42/f;Ljava/lang/String;)Lk42/b;

    move-result-object v13

    const/16 v14, 0x3ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v2 .. v15}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lk42/g$a$b;

    if-eqz v3, :cond_7

    check-cast v1, Lk42/g$a$b;

    invoke-virtual {v1}, Lk42/g$a$b;->b()Z

    move-result v7

    invoke-virtual {v1}, Lk42/g$a$b;->a()Z

    move-result v8

    const/16 v14, 0x7c1

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v3, v1, Lk42/g$a$a;

    if-eqz v3, :cond_8

    check-cast v1, Lk42/g$a$a;

    invoke-virtual {v1}, Lk42/g$a$a;->b()Z

    move-result v7

    invoke-virtual {v1}, Lk42/g$a$a;->a()Z

    move-result v8

    const/16 v14, 0x7c9

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v3, v1, Lk42/g$a$h;

    if-eqz v3, :cond_9

    check-cast v1, Lk42/g$a$h;

    invoke-virtual {v1}, Lk42/g$a$h;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/16 v14, 0x637

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v3, v1, Lk42/g$a$g;

    if-eqz v3, :cond_a

    check-cast v1, Lk42/g$a$g;

    invoke-virtual {v1}, Lk42/g$a$g;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/16 v14, 0x63f

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lk42/f;->b(Lk42/f;ZZZZZZLjava/lang/Boolean;ZZLk42/d;Lk42/b;ILjava/lang/Object;)Lk42/f;

    move-result-object v1

    return-object v1

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
