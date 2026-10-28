.class final Lcom/whoop/ai/chat/domain/formwidget/f$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ai/chat/domain/formwidget/f;->y(Ljava/lang/String;)Lec3/l;
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
        "Lcom/whoop/ai/chat/domain/formwidget/f$b;",
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
    c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$refreshFlow$1"
    f = "FormWidgetInteractor.kt"
    l = {
        0x82,
        0x87
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lcom/whoop/ai/chat/domain/formwidget/f;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/ai/chat/domain/formwidget/f;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ai/chat/domain/formwidget/f$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->y:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->z:Lcom/whoop/ai/chat/domain/formwidget/f;

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

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$o;

    iget-object v1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->y:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->z:Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$o;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/domain/formwidget/f;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/f$o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$o;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

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

    sget-object p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$h;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$h;

    iput-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->w:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    new-instance p1, Lcom/whoop/ai/chat/domain/formwidget/GetFormWidgetRequest;

    const-string v2, "formKey"

    iget-object v4, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->y:Ljava/lang/String;

    invoke-static {v2, v4}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "ai-conversation-bff/v1/form"

    invoke-direct {p1, v4, v2}, Lcom/whoop/ai/chat/domain/formwidget/GetFormWidgetRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v2, La6/u;

    const/4 v4, 0x1

    invoke-direct {v2, p1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 p1, 0x3

    const/4 v4, 0x0

    invoke-static {v2, v4, v4, p1, v4}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->z:Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-static {v2}, Lcom/whoop/ai/chat/domain/formwidget/f;->f(Lcom/whoop/ai/chat/domain/formwidget/f;)Lnm0/e;

    move-result-object v2

    new-instance v5, Lcom/whoop/ai/chat/domain/formwidget/f$o$b;

    invoke-direct {v5, v4, v2}, Lcom/whoop/ai/chat/domain/formwidget/f$o$b;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v5}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->z:Lcom/whoop/ai/chat/domain/formwidget/f;

    iget-object v5, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->y:Ljava/lang/String;

    new-instance v6, Lcom/whoop/ai/chat/domain/formwidget/f$o$c;

    invoke-direct {v6, p1, v2, v5}, Lcom/whoop/ai/chat/domain/formwidget/f$o$c;-><init>(Lec3/l;Lcom/whoop/ai/chat/domain/formwidget/f;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/ai/chat/domain/formwidget/f$o$a;

    invoke-direct {p1, v0}, Lcom/whoop/ai/chat/domain/formwidget/f$o$a;-><init>(Lec3/m;)V

    iput-object v4, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/ai/chat/domain/formwidget/f$o;->w:I

    invoke-interface {v6, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
