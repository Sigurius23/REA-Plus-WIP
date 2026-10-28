.class final Lzg0/h$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lzg0/i;",
        "state",
        "",
        "",
        "Lzg0/k;",
        "pending",
        "<anonymous>",
        "(Lzg0/i;Ljava/util/Map;)Lzg0/i;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.presentation.AiChatViewModel$viewState$5"
    f = "AiChatViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lzg0/h;


# direct methods
.method public constructor <init>(Lzg0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/h;",
            "Lq83/d<",
            "-",
            "Lzg0/h$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzg0/h$f;->z:Lzg0/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lzg0/i;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lzg0/k;",
            ">;",
            "Lq83/d<",
            "-",
            "Lzg0/i;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lzg0/h$f;

    iget-object v1, p0, Lzg0/h$f;->z:Lzg0/h;

    invoke-direct {v0, v1, p3}, Lzg0/h$f;-><init>(Lzg0/h;Lq83/d;)V

    iput-object p1, v0, Lzg0/h$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lzg0/h$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lzg0/h$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzg0/i;

    check-cast p2, Ljava/util/Map;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lzg0/h$f;->f(Lzg0/i;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lzg0/h$f;->x:Ljava/lang/Object;

    check-cast v0, Lzg0/i;

    iget-object v1, p0, Lzg0/h$f;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lzg0/h$f;->w:I

    if-nez v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzg0/h$f;->z:Lzg0/h;

    invoke-static {p1, v0, v1}, Lzg0/h;->l(Lzg0/h;Lzg0/i;Ljava/util/Map;)Lzg0/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
