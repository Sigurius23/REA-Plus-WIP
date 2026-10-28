.class final Lvg0/v$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/v;->interact(Lec3/l;)Lec3/l;
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
        "Lvg0/w;",
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
    c = "com.whoop.ai.chat.domain.interactors.GetConversationMetadataInteractor$interact$1$1"
    f = "GetConversationMetadataInteractor.kt"
    l = {
        0x2c,
        0x30,
        0x32,
        0x37,
        0x38
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/v;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvg0/u;


# direct methods
.method public constructor <init>(Lvg0/u;Lvg0/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/u;",
            "Lvg0/v;",
            "Lq83/d<",
            "-",
            "Lvg0/v$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/v$b;->z:Lvg0/u;

    iput-object p2, p0, Lvg0/v$b;->E:Lvg0/v;

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

    new-instance v0, Lvg0/v$b;

    iget-object v1, p0, Lvg0/v$b;->z:Lvg0/u;

    iget-object v2, p0, Lvg0/v$b;->E:Lvg0/v;

    invoke-direct {v0, v1, v2, p2}, Lvg0/v$b;-><init>(Lvg0/u;Lvg0/v;Lq83/d;)V

    iput-object p1, v0, Lvg0/v$b;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/v$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/v$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/v$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/v$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvg0/v$b;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvg0/v$b;->x:I

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v12, :cond_0

    if-ne v0, v11, :cond_1

    :cond_0
    iget-object v0, p0, Lvg0/v$b;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lvg0/v$b;->z:Lvg0/u;

    invoke-virtual {v0}, Lvg0/u;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lvg0/w$a;

    const-string v1, "Conversation fingerprint is missing"

    invoke-direct {v0, v1}, Lvg0/w$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/v$b;->y:Ljava/lang/Object;

    iput v3, p0, Lvg0/v$b;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_2

    :cond_6
    sget-object v0, Lvg0/w$b;->a:Lvg0/w$b;

    iput-object v8, p0, Lvg0/v$b;->y:Ljava/lang/Object;

    iput v2, p0, Lvg0/v$b;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_2

    :cond_7
    :goto_0
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lvg0/v$b;->E:Lvg0/v;

    invoke-static {v2}, Lvg0/v;->d(Lvg0/v;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lvg0/v$b$a;

    iget-object v3, p0, Lvg0/v$b;->E:Lvg0/v;

    iget-object v6, p0, Lvg0/v$b;->z:Lvg0/u;

    invoke-direct {v4, v3, v6, v13}, Lvg0/v$b$a;-><init>(Lvg0/v;Lvg0/u;Lq83/d;)V

    iput-object v8, p0, Lvg0/v$b;->y:Ljava/lang/Object;

    iput v1, p0, Lvg0/v$b;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto :goto_2

    :cond_8
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_9

    new-instance v1, Lvg0/w$c;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ai/chat/models/AIConversationMetadata;

    invoke-direct {v1, v0}, Lvg0/w$c;-><init>(Lcom/whoop/ai/chat/models/AIConversationMetadata;)V

    iput-object v13, p0, Lvg0/v$b;->y:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/v$b;->w:Ljava/lang/Object;

    iput v12, p0, Lvg0/v$b;->x:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_2

    :cond_9
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_b

    new-instance v1, Lvg0/w$a;

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lvg0/w$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/v$b;->y:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/v$b;->w:Ljava/lang/Object;

    iput v11, p0, Lvg0/v$b;->x:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    :goto_2
    return-object v9

    :cond_a
    return-object v10

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
