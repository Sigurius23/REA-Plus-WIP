.class final Lwg0/f$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg0/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lwg0/h;",
        "Lwg0/g;",
        "request",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Lwg0/g;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interpolation.TurnInterpolationInteractor$interact$1$1"
    f = "TurnInterpolationInteractor.kt"
    l = {
        0x3d,
        0x46,
        0x49
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic F:Lwg0/e;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lwg0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lwg0/e;",
            "Lq83/d<",
            "-",
            "Lwg0/f$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwg0/f$a$a;->E:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lwg0/f$a$a;->F:Lwg0/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lec3/m;Lwg0/g;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lwg0/g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lwg0/f$a$a;

    iget-object v1, p0, Lwg0/f$a$a;->E:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lwg0/f$a$a;->F:Lwg0/e;

    invoke-direct {v0, v1, v2, p3}, Lwg0/f$a$a;-><init>(Lkotlin/jvm/internal/g0;Lwg0/e;Lq83/d;)V

    iput-object p1, v0, Lwg0/f$a$a;->y:Ljava/lang/Object;

    iput-object p2, v0, Lwg0/f$a$a;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lwg0/f$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lec3/m;

    check-cast p2, Lwg0/g;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lwg0/f$a$a;->f(Lec3/m;Lwg0/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lwg0/f$a$a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lwg0/f$a$a;->z:Ljava/lang/Object;

    check-cast v1, Lwg0/g;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lwg0/f$a$a;->x:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lwg0/f$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lwg0/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    :goto_0
    iget-object v1, p0, Lwg0/f$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lwg0/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwg0/f$a$a;->E:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lwg0/i;

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Lwg0/g;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v3

    invoke-virtual {p1, v3}, Lwg0/i;->e(Lcom/whoop/ai/chat/models/AITurn;)Lwg0/i;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object v1, p1

    goto :goto_3

    :cond_5
    :goto_2
    sget-object p1, Lwg0/i;->f:Lwg0/i$a;

    invoke-virtual {v1}, Lwg0/g;->a()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v1

    iget-object v3, p0, Lwg0/f$a$a;->F:Lwg0/e;

    invoke-virtual {v3}, Lwg0/e;->getGranularity()Lwg0/c;

    move-result-object v3

    iget-object v8, p0, Lwg0/f$a$a;->F:Lwg0/e;

    invoke-virtual {v8}, Lwg0/e;->getCharsPerStep()I

    move-result v8

    invoke-virtual {p1, v1, v3, v8}, Lwg0/i$a;->d(Lcom/whoop/ai/chat/models/AITurn;Lwg0/c;I)Lwg0/i;

    move-result-object p1

    goto :goto_1

    :goto_3
    iget-object p1, p0, Lwg0/f$a$a;->E:Lkotlin/jvm/internal/g0;

    iput-object v1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance p1, Lwg0/h;

    invoke-virtual {v1}, Lwg0/i;->f()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v3

    invoke-virtual {v1}, Lwg0/i;->d()Z

    move-result v8

    invoke-direct {p1, v3, v8}, Lwg0/h;-><init>(Lcom/whoop/ai/chat/models/AITurn;Z)V

    iput-object v0, p0, Lwg0/f$a$a;->y:Ljava/lang/Object;

    iput-object v7, p0, Lwg0/f$a$a;->z:Ljava/lang/Object;

    iput-object v1, p0, Lwg0/f$a$a;->w:Ljava/lang/Object;

    iput v6, p0, Lwg0/f$a$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_6

    :cond_6
    :goto_4
    invoke-virtual {v1}, Lwg0/i;->d()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lwg0/f$a$a;->F:Lwg0/e;

    invoke-virtual {p1}, Lwg0/e;->getDelayMillis()J

    move-result-wide v8

    iput-object v0, p0, Lwg0/f$a$a;->y:Ljava/lang/Object;

    iput-object v7, p0, Lwg0/f$a$a;->z:Ljava/lang/Object;

    iput-object v1, p0, Lwg0/f$a$a;->w:Ljava/lang/Object;

    iput v5, p0, Lwg0/f$a$a;->x:I

    invoke-static {v8, v9, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    invoke-virtual {v1}, Lwg0/i;->c()Lwg0/i;

    move-result-object v1

    iget-object p1, p0, Lwg0/f$a$a;->E:Lkotlin/jvm/internal/g0;

    iput-object v1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance p1, Lwg0/h;

    invoke-virtual {v1}, Lwg0/i;->f()Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v3

    invoke-virtual {v1}, Lwg0/i;->d()Z

    move-result v6

    invoke-direct {p1, v3, v6}, Lwg0/h;-><init>(Lcom/whoop/ai/chat/models/AITurn;Z)V

    iput-object v0, p0, Lwg0/f$a$a;->y:Ljava/lang/Object;

    iput-object v7, p0, Lwg0/f$a$a;->z:Ljava/lang/Object;

    iput-object v1, p0, Lwg0/f$a$a;->w:Ljava/lang/Object;

    iput v4, p0, Lwg0/f$a$a;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_6
    return-object v2

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
