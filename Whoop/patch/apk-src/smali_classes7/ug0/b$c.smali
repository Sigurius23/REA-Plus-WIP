.class final Lug0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->K(Ltg0/a;Lec3/l;Ltg0/b;)Lec3/l;
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
        "Ltg0/b;",
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
    c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$buildConversationPipeline$1"
    f = "AiChatConversationCombiner.kt"
    l = {
        0xb0
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ltg0/b;

.field final synthetic F:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lug0/b;

.field final synthetic z:Ltg0/a;


# direct methods
.method public constructor <init>(Lug0/b;Ltg0/a;Ltg0/b;Lec3/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug0/b;",
            "Ltg0/a;",
            "Ltg0/b;",
            "Lec3/l;",
            "Lq83/d<",
            "-",
            "Lug0/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$c;->y:Lug0/b;

    iput-object p2, p0, Lug0/b$c;->z:Ltg0/a;

    iput-object p3, p0, Lug0/b$c;->E:Ltg0/b;

    iput-object p4, p0, Lug0/b$c;->F:Lec3/l;

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

    new-instance v0, Lug0/b$c;

    iget-object v1, p0, Lug0/b$c;->y:Lug0/b;

    iget-object v2, p0, Lug0/b$c;->z:Ltg0/a;

    iget-object v3, p0, Lug0/b$c;->E:Ltg0/b;

    iget-object v4, p0, Lug0/b$c;->F:Lec3/l;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lug0/b$c;-><init>(Lug0/b;Ltg0/a;Ltg0/b;Lec3/l;Lq83/d;)V

    iput-object p1, v0, Lug0/b$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lug0/b$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug0/b$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lug0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lug0/b$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lug0/b$c;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lec3/m;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug0/b$c;->w:I

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v8, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lug0/b$c;->y:Lug0/b;

    invoke-static {p1}, Lug0/b;->l(Lug0/b;)Lvg0/i0;

    move-result-object p1

    iget-object v1, p0, Lug0/b$c;->z:Ltg0/a;

    invoke-virtual {p1, v1}, Lvg0/i0;->c(Ltg0/a;)V

    new-instance v1, Lug0/b$c$a;

    iget-object v2, p0, Lug0/b$c;->z:Ltg0/a;

    iget-object v3, p0, Lug0/b$c;->y:Lug0/b;

    iget-object v5, p0, Lug0/b$c;->E:Ltg0/b;

    iget-object v6, p0, Lug0/b$c;->F:Lec3/l;

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Lug0/b$c$a;-><init>(Ltg0/a;Lug0/b;Lec3/m;Ltg0/b;Lec3/l;Lq83/d;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lug0/b$c;->x:Ljava/lang/Object;

    iput v8, p0, Lug0/b$c;->w:I

    invoke-static {v1, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
