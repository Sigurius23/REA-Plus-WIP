.class final Lzd1/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd1/c;->q(Lsp0/a;Lzd1/b$k;)V
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
    c = "com.whoop.edit.presentation.EditActivityViewModel$initialize$1"
    f = "EditActivityViewModel.kt"
    l = {
        0x79,
        0x7a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lzd1/c;

.field final synthetic y:Lsp0/a;

.field final synthetic z:Lzd1/b$k;


# direct methods
.method public constructor <init>(Lzd1/c;Lsp0/a;Lzd1/b$k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzd1/c;",
            "Lsp0/a;",
            "Lzd1/b$k;",
            "Lq83/d<",
            "-",
            "Lzd1/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzd1/c$b;->x:Lzd1/c;

    iput-object p2, p0, Lzd1/c$b;->y:Lsp0/a;

    iput-object p3, p0, Lzd1/c$b;->z:Lzd1/b$k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lzd1/c$b;

    iget-object v0, p0, Lzd1/c$b;->x:Lzd1/c;

    iget-object v1, p0, Lzd1/c$b;->y:Lsp0/a;

    iget-object v2, p0, Lzd1/c$b;->z:Lzd1/b$k;

    invoke-direct {p1, v0, v1, v2, p2}, Lzd1/c$b;-><init>(Lzd1/c;Lsp0/a;Lzd1/b$k;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lzd1/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzd1/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzd1/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzd1/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzd1/c$b;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzd1/c$b;->x:Lzd1/c;

    invoke-static {p1}, Lzd1/c;->g(Lzd1/c;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lzd1/b$o;

    iget-object v4, p0, Lzd1/c$b;->y:Lsp0/a;

    invoke-direct {v1, v4}, Lzd1/b$o;-><init>(Lsp0/a;)V

    iput v3, p0, Lzd1/c$b;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lzd1/c$b;->x:Lzd1/c;

    invoke-static {p1}, Lzd1/c;->g(Lzd1/c;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Lzd1/c$b;->z:Lzd1/b$k;

    iput v2, p0, Lzd1/c$b;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
