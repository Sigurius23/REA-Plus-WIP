.class final Lk42/g$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk42/g;->z(Z)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lk42/g$a;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$toggleRecommendation$1"
    f = "PrivacyConsentInteractor.kt"
    l = {
        0x80,
        0x82,
        0x84,
        0x86
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lk42/g;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLk42/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lk42/g;",
            "Lq83/d<",
            "-",
            "Lk42/g$j;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lk42/g$j;->z:Z

    iput-object p2, p0, Lk42/g$j;->E:Lk42/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lk42/g$j;

    iget-boolean v1, p0, Lk42/g$j;->z:Z

    iget-object v2, p0, Lk42/g$j;->E:Lk42/g;

    invoke-direct {v0, v1, v2, p2}, Lk42/g$j;-><init>(ZLk42/g;Lq83/d;)V

    iput-object p1, v0, Lk42/g$j;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lk42/g$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lk42/g$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lk42/g$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lk42/g$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lk42/g$j;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lk42/g$j;->x:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, p0, Lk42/g$j;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lk42/g$j;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lk42/g$j;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lk42/g$a$f;->a:Lk42/g$a$f;

    iput-object v8, p0, Lk42/g$j;->y:Ljava/lang/Object;

    iput v2, p0, Lk42/g$j;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    new-instance v0, Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;

    iget-boolean v2, p0, Lk42/g$j;->z:Z

    invoke-direct {v0, v2}, Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;-><init>(Z)V

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Lk42/g$j;->E:Lk42/g;

    invoke-static {v3}, Lk42/g;->f(Lk42/g;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lk42/g$j$a;

    iget-object v6, p0, Lk42/g$j;->E:Lk42/g;

    invoke-direct {v4, v6, v0, v12}, Lk42/g$j$a;-><init>(Lk42/g;Lcom/whoop/privacyconsent/api/AllowRecommendationRequest;Lq83/d;)V

    iput-object v8, p0, Lk42/g$j;->y:Ljava/lang/Object;

    iput-object v12, p0, Lk42/g$j;->w:Ljava/lang/Object;

    iput v1, p0, Lk42/g$j;->x:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const-string v3, "toggleRecommendation"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast v0, Lu02/a;

    new-instance v1, Lk42/g$j$b;

    invoke-direct {v1, v8, v12}, Lk42/g$j$b;-><init>(Lec3/m;Lq83/d;)V

    iput-object v8, p0, Lk42/g$j;->y:Ljava/lang/Object;

    iput-object v12, p0, Lk42/g$j;->w:Ljava/lang/Object;

    iput v11, p0, Lk42/g$j;->x:I

    invoke-static {v0, v1, p0}, Lu02/b;->f(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast v0, Lu02/a;

    new-instance v1, Lk42/g$j$c;

    invoke-direct {v1, v8, v12}, Lk42/g$j$c;-><init>(Lec3/m;Lq83/d;)V

    iput-object v12, p0, Lk42/g$j;->y:Ljava/lang/Object;

    iput-object v12, p0, Lk42/g$j;->w:Ljava/lang/Object;

    iput v10, p0, Lk42/g$j;->x:I

    invoke-static {v0, v1, p0}, Lu02/b;->g(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    :goto_3
    return-object v9

    :cond_8
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
