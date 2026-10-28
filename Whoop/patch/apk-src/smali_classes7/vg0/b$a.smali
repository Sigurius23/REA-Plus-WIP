.class final Lvg0/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/b;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lvg0/a;",
        "action",
        "Lec3/l;",
        "",
        "Lxg0/c;",
        "<anonymous>",
        "(Lvg0/a;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.AiChatFileInteractor$interact$1"
    f = "AiChatFileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lvg0/b;


# direct methods
.method public constructor <init>(Lvg0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/b;",
            "Lq83/d<",
            "-",
            "Lvg0/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/b$a;->y:Lvg0/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lvg0/b$a;

    iget-object v1, p0, Lvg0/b$a;->y:Lvg0/b;

    invoke-direct {v0, v1, p2}, Lvg0/b$a;-><init>(Lvg0/b;Lq83/d;)V

    iput-object p1, v0, Lvg0/b$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lvg0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/a;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lvg0/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/b$a;->f(Lvg0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvg0/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lvg0/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvg0/b$a;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lvg0/a$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvg0/b$a;->y:Lvg0/b;

    check-cast v0, Lvg0/a$b;

    invoke-static {p1, v0}, Lvg0/b;->i(Lvg0/b;Lvg0/a$b;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lvg0/a$a;

    if-eqz p1, :cond_1

    new-instance p1, Lvg0/b$a$a;

    iget-object v1, p0, Lvg0/b$a;->y:Lvg0/b;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v0, v2}, Lvg0/b$a$a;-><init>(Lvg0/b;Lvg0/a;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
