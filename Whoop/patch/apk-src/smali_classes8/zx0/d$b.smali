.class final Lzx0/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzx0/d;->interact(Lec3/l;)Lec3/l;
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
        "Lzx0/b$b;",
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
    c = "com.whoop.deepdive.domain.DeepDiveInteractor$interact$1$1$1"
    f = "DeepDiveInteractor.kt"
    l = {
        0x24
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lzx0/b;

.field final synthetic z:Lzx0/c;


# direct methods
.method public constructor <init>(Lzx0/b;Lzx0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzx0/b;",
            "Lzx0/c;",
            "Lq83/d<",
            "-",
            "Lzx0/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzx0/d$b;->y:Lzx0/b;

    iput-object p2, p0, Lzx0/d$b;->z:Lzx0/c;

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

    new-instance v0, Lzx0/d$b;

    iget-object v1, p0, Lzx0/d$b;->y:Lzx0/b;

    iget-object v2, p0, Lzx0/d$b;->z:Lzx0/c;

    invoke-direct {v0, v1, v2, p2}, Lzx0/d$b;-><init>(Lzx0/b;Lzx0/c;Lq83/d;)V

    iput-object p1, v0, Lzx0/d$b;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzx0/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzx0/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzx0/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzx0/d$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lzx0/d$b;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lzx0/d$b;->w:I

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

    new-instance p1, Lzx0/b$b;

    iget-object v2, p0, Lzx0/d$b;->y:Lzx0/b;

    check-cast v2, Lzx0/b$b;

    invoke-virtual {v2}, Lzx0/b$b;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lzx0/d$b;->y:Lzx0/b;

    check-cast v4, Lzx0/b$b;

    invoke-virtual {v4}, Lzx0/b$b;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lzx0/d$b;->z:Lzx0/c;

    iget-object v6, p0, Lzx0/d$b;->y:Lzx0/b;

    check-cast v6, Lzx0/b$b;

    invoke-virtual {v6}, Lzx0/b$b;->c()Z

    move-result v6

    invoke-direct {p1, v2, v4, v5, v6}, Lzx0/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lzx0/c;Z)V

    const/4 v2, 0x0

    iput-object v2, p0, Lzx0/d$b;->x:Ljava/lang/Object;

    iput v3, p0, Lzx0/d$b;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
