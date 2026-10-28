.class final Lcom/whoop/ai/chat/domain/formwidget/f$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ai/chat/domain/formwidget/f;->w(Lcom/whoop/ai/chat/domain/formwidget/c$d;)Lec3/l;
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
    c = "com.whoop.ai.chat.domain.formwidget.FormWidgetInteractor$persistFlow$1"
    f = "FormWidgetInteractor.kt"
    l = {
        0xa8,
        0xac,
        0xab
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/ai/chat/domain/formwidget/f;

.field final synthetic F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ai/chat/domain/formwidget/f;",
            "Lcom/whoop/ai/chat/domain/formwidget/c$d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ai/chat/domain/formwidget/f$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    iput-object p2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

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

    new-instance v0, Lcom/whoop/ai/chat/domain/formwidget/f$n;

    iget-object v1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$n;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/c$d;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ai/chat/domain/formwidget/f$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ai/chat/domain/formwidget/f$n;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const-string v5, ", questionId="

    const-string v6, "FormWidget"

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v9, :cond_2

    if-eq v2, v8, :cond_1

    if-ne v2, v7, :cond_0

    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/domain/formwidget/f$c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/domain/formwidget/c$d;->b()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v2

    iget-object v11, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-virtual {v11}, Lcom/whoop/ai/chat/domain/formwidget/c$d;->d()Ljava/util/List;

    move-result-object v11

    invoke-static {p1, v2, v11}, Lcom/whoop/ai/chat/domain/formwidget/f;->n(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/ai/chat/domain/formwidget/f$c;

    move-result-object p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-static {p1}, Lcom/whoop/ai/chat/domain/formwidget/f;->h(Lcom/whoop/ai/chat/domain/formwidget/f;)Ltr2/n;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/domain/formwidget/c$d;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v7, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-virtual {v7}, Lcom/whoop/ai/chat/domain/formwidget/c$d;->c()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Persist missing/invalid onAnswer action for formId="

    invoke-static {v8, v2, v5, v7}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {p1, v6, v2, v4}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$e;

    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->z:Ljava/lang/Object;

    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->w:Ljava/lang/Object;

    iput v9, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    return-object v3

    :cond_5
    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    new-instance v9, Lcom/whoop/ai/chat/domain/formwidget/f$n$a;

    invoke-direct {v9, v2, p1, v10}, Lcom/whoop/ai/chat/domain/formwidget/f$n$a;-><init>(Lcom/whoop/ai/chat/domain/formwidget/f;Lcom/whoop/ai/chat/domain/formwidget/f$c;Lq83/d;)V

    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->z:Ljava/lang/Object;

    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->w:Ljava/lang/Object;

    iput-object v0, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->x:Ljava/lang/Object;

    iput v8, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->y:I

    invoke-static {v2, v9, p0}, Lcom/whoop/ai/chat/domain/formwidget/f;->o(Lcom/whoop/ai/chat/domain/formwidget/f;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_7

    sget-object p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$d;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$d;

    goto :goto_2

    :cond_7
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->E:Lcom/whoop/ai/chat/domain/formwidget/f;

    invoke-static {v2}, Lcom/whoop/ai/chat/domain/formwidget/f;->h(Lcom/whoop/ai/chat/domain/formwidget/f;)Ltr2/n;

    move-result-object v2

    iget-object v8, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-virtual {v8}, Lcom/whoop/ai/chat/domain/formwidget/c$d;->a()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->F:Lcom/whoop/ai/chat/domain/formwidget/c$d;

    invoke-virtual {v9}, Lcom/whoop/ai/chat/domain/formwidget/c$d;->c()Ljava/lang/String;

    move-result-object v9

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    const-string v11, "Persist failed for formId="

    const-string v12, ". "

    invoke-static {v11, v8, v5, v9, v12}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v6, p1, v4}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/ai/chat/domain/formwidget/f$b$e;->a:Lcom/whoop/ai/chat/domain/formwidget/f$b$e;

    :goto_2
    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->z:Ljava/lang/Object;

    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->w:Ljava/lang/Object;

    iput-object v10, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->x:Ljava/lang/Object;

    iput v7, p0, Lcom/whoop/ai/chat/domain/formwidget/f$n;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    return-object v3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
