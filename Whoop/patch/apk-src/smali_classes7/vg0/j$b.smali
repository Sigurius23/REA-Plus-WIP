.class final Lvg0/j$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/j;->interact(Lec3/l;)Lec3/l;
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
        "Lvg0/k;",
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
    c = "com.whoop.ai.chat.domain.interactors.CommitRecommendationInteractor$interact$1$1"
    f = "CommitRecommendationInteractor.kt"
    l = {
        0x2d,
        0x32,
        0x36,
        0x3d,
        0x47,
        0x4a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/i;

.field final synthetic F:Lvg0/j;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvg0/i;Lvg0/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/i;",
            "Lvg0/j;",
            "Lq83/d<",
            "-",
            "Lvg0/j$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/j$b;->E:Lvg0/i;

    iput-object p2, p0, Lvg0/j$b;->F:Lvg0/j;

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

    new-instance v0, Lvg0/j$b;

    iget-object v1, p0, Lvg0/j$b;->E:Lvg0/i;

    iget-object v2, p0, Lvg0/j$b;->F:Lvg0/j;

    invoke-direct {v0, v1, v2, p2}, Lvg0/j$b;-><init>(Lvg0/i;Lvg0/j;Lq83/d;)V

    iput-object p1, v0, Lvg0/j$b;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/j$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/j$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/j$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/j$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvg0/j$b;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvg0/j$b;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lvg0/j$b;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lvg0/j$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_6

    :pswitch_1
    iget-object v2, p0, Lvg0/j$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_4

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvg0/j$b;->E:Lvg0/i;

    invoke-virtual {p1}, Lvg0/i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lvg0/k$a;

    const-string v2, "Conversation fingerprint is missing"

    invoke-direct {p1, v2}, Lvg0/k$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/j$b;->z:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lvg0/j$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_0
    move-object v11, p0

    goto/16 :goto_5

    :cond_0
    :goto_1
    return-object v3

    :cond_1
    iget-object p1, p0, Lvg0/j$b;->E:Lvg0/i;

    invoke-virtual {p1}, Lvg0/i;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lvg0/k$a;

    const-string v2, "Recommendation ID is missing"

    invoke-direct {p1, v2}, Lvg0/k$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/j$b;->z:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lvg0/j$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    return-object v3

    :cond_3
    sget-object p1, Lvg0/k$b;->a:Lvg0/k$b;

    iput-object v0, p0, Lvg0/j$b;->z:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lvg0/j$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_0

    :cond_4
    :goto_3
    new-instance p1, Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;

    iget-object v2, p0, Lvg0/j$b;->E:Lvg0/i;

    invoke-virtual {v2}, Lvg0/i;->a()Z

    move-result v2

    iget-object v5, p0, Lvg0/j$b;->E:Lvg0/i;

    invoke-virtual {v5}, Lvg0/i;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p1, v2, v5}, Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;-><init>(ZLjava/lang/String;)V

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lvg0/j$b;->F:Lvg0/j;

    invoke-static {v2}, Lvg0/j;->d(Lvg0/j;)Ltr2/n;

    move-result-object v7

    new-instance v10, Lvg0/j$b$a;

    iget-object v2, p0, Lvg0/j$b;->F:Lvg0/j;

    iget-object v5, p0, Lvg0/j$b;->E:Lvg0/i;

    invoke-direct {v10, v2, v5, p1, v4}, Lvg0/j$b$a;-><init>(Lvg0/j;Lvg0/i;Lcom/whoop/ai/chat/api/CommitRecommendationRequestBody;Lq83/d;)V

    iput-object v0, p0, Lvg0/j$b;->z:Ljava/lang/Object;

    iput-object v4, p0, Lvg0/j$b;->w:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lvg0/j$b;->y:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_6

    sget-object p1, Lvg0/k$c;->a:Lvg0/k$c;

    iput-object v4, v11, Lvg0/j$b;->z:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/j$b;->w:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/j$b;->x:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v11, Lvg0/j$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_6
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_8

    new-instance v2, Lvg0/k$a;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lvg0/k$a;-><init>(Ljava/lang/String;)V

    iput-object v4, v11, Lvg0/j$b;->z:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/j$b;->w:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/j$b;->x:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, v11, Lvg0/j$b;->y:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_5
    return-object v1

    :cond_7
    :goto_6
    return-object v3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
