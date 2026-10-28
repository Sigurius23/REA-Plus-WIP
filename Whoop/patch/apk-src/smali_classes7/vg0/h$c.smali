.class final Lvg0/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/h;->k(Ljava/lang/String;)Lec3/l;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lec3/m;",
        "",
        "Lxg0/c;",
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
    c = "com.whoop.ai.chat.domain.interactors.AiChatImageInteractor$removeImage$1"
    f = "AiChatImageInteractor.kt"
    l = {
        0x81,
        0x88
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Ljava/lang/String;

.field final synthetic G:Lvg0/h;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lvg0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lvg0/h;",
            "Lq83/d<",
            "-",
            "Lvg0/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/h$c;->F:Ljava/lang/String;

    iput-object p2, p0, Lvg0/h$c;->G:Lvg0/h;

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

    new-instance v0, Lvg0/h$c;

    iget-object v1, p0, Lvg0/h$c;->F:Ljava/lang/String;

    iget-object v2, p0, Lvg0/h$c;->G:Lvg0/h;

    invoke-direct {v0, v1, v2, p2}, Lvg0/h$c;-><init>(Ljava/lang/String;Lvg0/h;Lq83/d;)V

    iput-object p1, v0, Lvg0/h$c;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/h$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvg0/h$c;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvg0/h$c;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lvg0/h$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, p0, Lvg0/h$c;->w:Ljava/lang/Object;

    check-cast v2, Lvg0/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvg0/h$c;->F:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lvg0/h$c;->G:Lvg0/h;

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    invoke-static {v2}, Lvg0/h;->f(Lvg0/h;)Ltr2/n;

    move-result-object v7

    new-instance v10, Lvg0/h$c$a;

    invoke-direct {v10, v2, p1, v5}, Lvg0/h$c$a;-><init>(Lvg0/h;Ljava/lang/String;Lq83/d;)V

    iput-object v0, p0, Lvg0/h$c;->E:Ljava/lang/Object;

    iput-object v2, p0, Lvg0/h$c;->w:Ljava/lang/Object;

    iput-object v5, p0, Lvg0/h$c;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lvg0/h$c;->y:I

    iput v4, p0, Lvg0/h$c;->z:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v4, p1, Lu02/a$b;

    if-eqz v4, :cond_5

    invoke-static {v2}, Lvg0/h;->c(Lvg0/h;)Lrg0/b;

    move-result-object v2

    check-cast p1, Lu02/a$b;

    const-string v4, "remove_image"

    invoke-virtual {v2, p1, v4}, Lrg0/b;->b(Lu02/a$b;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v11, p0

    :cond_5
    :goto_1
    iput-object v5, v11, Lvg0/h$c;->E:Ljava/lang/Object;

    iput-object v5, v11, Lvg0/h$c;->w:Ljava/lang/Object;

    iput-object v5, v11, Lvg0/h$c;->x:Ljava/lang/Object;

    iput v3, v11, Lvg0/h$c;->z:I

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
