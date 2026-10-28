.class final Lzg0/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg0/h;-><init>(Lor2/m;Lrg0/b;Lug0/c;Lbh0/a;Ljava/util/List;)V
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
        "Lzg0/g;",
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
    c = "com.whoop.ai.chat.presentation.AiChatViewModel$viewState$1"
    f = "AiChatViewModel.kt"
    l = {
        0x2c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzg0/g;",
            ">;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lzg0/g;",
            ">;",
            "Lq83/d<",
            "-",
            "Lzg0/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzg0/h$c;->I:Ljava/util/List;

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

    new-instance v0, Lzg0/h$c;

    iget-object v1, p0, Lzg0/h$c;->I:Ljava/util/List;

    invoke-direct {v0, v1, p2}, Lzg0/h$c;-><init>(Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Lzg0/h$c;->H:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzg0/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzg0/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzg0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzg0/h$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lzg0/h$c;->H:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lzg0/h$c;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget v2, p0, Lzg0/h$c;->E:I

    iget-object v5, p0, Lzg0/h$c;->z:Ljava/lang/Object;

    check-cast v5, Lzg0/g;

    iget-object v5, p0, Lzg0/h$c;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, p0, Lzg0/h$c;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzg0/h$c;->I:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v5, p1

    move v2, v3

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzg0/g;

    iput-object v0, p0, Lzg0/h$c;->H:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, p0, Lzg0/h$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lzg0/h$c;->x:Ljava/lang/Object;

    iput-object v6, p0, Lzg0/h$c;->y:Ljava/lang/Object;

    iput-object v6, p0, Lzg0/h$c;->z:Ljava/lang/Object;

    iput v2, p0, Lzg0/h$c;->E:I

    iput v3, p0, Lzg0/h$c;->F:I

    iput v4, p0, Lzg0/h$c;->G:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
