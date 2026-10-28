.class final Lvg0/h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/h;->interact(Lec3/l;)Lec3/l;
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
        "Lvg0/g;",
        "action",
        "Lec3/l;",
        "",
        "Lxg0/c;",
        "<anonymous>",
        "(Lvg0/g;)Lec3/l;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$interact$1"
    f = "AiChatImageInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lvg0/h;


# direct methods
.method public constructor <init>(Lvg0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/h;",
            "Lq83/d<",
            "-",
            "Lvg0/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/h$a;->y:Lvg0/h;

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

    new-instance v0, Lvg0/h$a;

    iget-object v1, p0, Lvg0/h$a;->y:Lvg0/h;

    invoke-direct {v0, v1, p2}, Lvg0/h$a;-><init>(Lvg0/h;Lq83/d;)V

    iput-object p1, v0, Lvg0/h$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lvg0/g;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/g;",
            "Lq83/d<",
            "-",
            "Lec3/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lvg0/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/g;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/h$a;->f(Lvg0/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvg0/h$a;->x:Ljava/lang/Object;

    check-cast v0, Lvg0/g;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvg0/h$a;->w:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lvg0/g$b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvg0/h$a;->y:Lvg0/h;

    check-cast v0, Lvg0/g$b;

    invoke-virtual {v0}, Lvg0/g$b;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lvg0/g$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lvg0/g$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v1, v2, v0}, Lvg0/h;->i(Lvg0/h;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of p1, v0, Lvg0/g$a;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvg0/h$a;->y:Lvg0/h;

    check-cast v0, Lvg0/g$a;

    invoke-virtual {v0}, Lvg0/g$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lvg0/h;->h(Lvg0/h;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1

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
