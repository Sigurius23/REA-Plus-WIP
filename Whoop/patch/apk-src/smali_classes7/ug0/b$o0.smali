.class final Lug0/b$o0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->f0(Ltg0/b;Lbc3/c0;Ldc3/x;Lbc3/k1;Lq83/d;)Ljava/lang/Object;
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$launchRequestedSideEffects$3"
    f = "AiChatConversationCombiner.kt"
    l = {
        0x439
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ldc3/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/x;"
        }
    .end annotation
.end field

.field final synthetic F:Ljava/lang/String;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lug0/b;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lug0/b;Ljava/lang/String;Ldc3/x;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug0/b;",
            "Ljava/lang/String;",
            "Ldc3/x;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lug0/b$o0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$o0;->y:Lug0/b;

    iput-object p2, p0, Lug0/b$o0;->z:Ljava/lang/String;

    iput-object p3, p0, Lug0/b$o0;->E:Ldc3/x;

    iput-object p4, p0, Lug0/b$o0;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lug0/b$o0;

    iget-object v1, p0, Lug0/b$o0;->y:Lug0/b;

    iget-object v2, p0, Lug0/b$o0;->z:Ljava/lang/String;

    iget-object v3, p0, Lug0/b$o0;->E:Ldc3/x;

    iget-object v4, p0, Lug0/b$o0;->F:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lug0/b$o0;-><init>(Lug0/b;Ljava/lang/String;Ldc3/x;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lug0/b$o0;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lug0/b$o0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug0/b$o0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug0/b$o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug0/b$o0;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lug0/b$o0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lug0/b$o0;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lug0/b$o0;->y:Lug0/b;

    invoke-static {p1}, Lug0/b;->j(Lug0/b;)Lvg0/a0;

    move-result-object p1

    iget-object v2, p0, Lug0/b$o0;->z:Ljava/lang/String;

    new-instance v4, Ljava/lang/Long;

    const-wide/16 v5, 0x2710

    invoke-direct {v4, v5, v6}, Ljava/lang/Long;-><init>(J)V

    iput-object v0, p0, Lug0/b$o0;->x:Ljava/lang/Object;

    iput v3, p0, Lug0/b$o0;->w:I

    invoke-virtual {p1, v2, v4, p0}, Lvg0/a0;->d(Ljava/lang/String;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lug0/b$o0;->E:Ldc3/x;

    new-instance v1, Ltg0/a$q;

    iget-object v2, p0, Lug0/b$o0;->z:Ljava/lang/String;

    iget-object v3, p0, Lug0/b$o0;->F:Ljava/lang/String;

    invoke-direct {v1, v2, v3, p1}, Ltg0/a$q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
