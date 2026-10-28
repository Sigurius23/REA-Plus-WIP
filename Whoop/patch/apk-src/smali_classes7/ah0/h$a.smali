.class final Lah0/h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lah0/h;->n(Lah0/g;)V
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
    c = "com.whoop.ai.chat.presentation.formwidget.FormWidgetViewModel$sendViewEvent$1"
    f = "FormWidgetViewModel.kt"
    l = {
        0x23,
        0x25,
        0x27,
        0x32,
        0x3b,
        0x3d,
        0x3f,
        0x41
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lah0/g;

.field final synthetic y:Lah0/h;


# direct methods
.method public constructor <init>(Lah0/g;Lah0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lah0/g;",
            "Lah0/h;",
            "Lq83/d<",
            "-",
            "Lah0/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lah0/h$a;->x:Lah0/g;

    iput-object p2, p0, Lah0/h$a;->y:Lah0/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lah0/h$a;

    iget-object v0, p0, Lah0/h$a;->x:Lah0/g;

    iget-object v1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-direct {p1, v0, v1, p2}, Lah0/h$a;-><init>(Lah0/g;Lah0/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lah0/h$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lah0/h$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lah0/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lah0/h$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lah0/h$a;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lah0/h$a;->x:Lah0/g;

    instance-of v1, p1, Lah0/g$e;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/c$e;

    iget-object v2, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v2, Lah0/g$e;

    invoke-virtual {v2}, Lah0/g$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/ai/chat/domain/formwidget/c$e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto/16 :goto_0

    :cond_0
    instance-of v1, p1, Lah0/g$g;

    if-eqz v1, :cond_1

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/c$g;

    iget-object v2, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v2, Lah0/g$g;

    invoke-virtual {v2}, Lah0/g$g;->a()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/ai/chat/domain/formwidget/c$g;-><init>(Lcom/whoop/design/models/DesignSystemModel;)V

    const/4 v2, 0x2

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto/16 :goto_0

    :cond_1
    instance-of v1, p1, Lah0/g$h;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/c$h;

    iget-object v2, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v2, Lah0/g$h;

    invoke-virtual {v2}, Lah0/g$h;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v3, Lah0/g$h;

    invoke-virtual {v3}, Lah0/g$h;->d()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v4, Lah0/g$h;

    invoke-virtual {v4}, Lah0/g$h;->e()Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v5, Lah0/g$h;

    invoke-virtual {v5}, Lah0/g$h;->f()Z

    move-result v5

    iget-object v6, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v6, Lah0/g$h;

    invoke-virtual {v6}, Lah0/g$h;->b()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v6

    iget-object v7, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v7, Lah0/g$h;

    invoke-virtual {v7}, Lah0/g$h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lcom/whoop/ai/chat/domain/formwidget/c$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)V

    const/4 v2, 0x3

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto/16 :goto_0

    :cond_2
    instance-of v1, p1, Lah0/g$d;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lcom/whoop/ai/chat/domain/formwidget/c$d;

    iget-object v2, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v2, Lah0/g$d;

    invoke-virtual {v2}, Lah0/g$d;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v3, Lah0/g$d;

    invoke-virtual {v3}, Lah0/g$d;->c()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v4, Lah0/g$d;

    invoke-virtual {v4}, Lah0/g$d;->d()Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lah0/h$a;->x:Lah0/g;

    check-cast v5, Lah0/g$d;

    invoke-virtual {v5}, Lah0/g$d;->b()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/whoop/ai/chat/domain/formwidget/c$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;)V

    const/4 v2, 0x4

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_3
    instance-of v1, p1, Lah0/g$a;

    if-eqz v1, :cond_4

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lcom/whoop/ai/chat/domain/formwidget/c$b;->a:Lcom/whoop/ai/chat/domain/formwidget/c$b;

    const/4 v2, 0x5

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_4
    instance-of v1, p1, Lah0/g$c;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lcom/whoop/ai/chat/domain/formwidget/c$c;->a:Lcom/whoop/ai/chat/domain/formwidget/c$c;

    const/4 v2, 0x6

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_5
    instance-of v1, p1, Lah0/g$b;

    if-eqz v1, :cond_6

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lcom/whoop/ai/chat/domain/formwidget/c$a;->a:Lcom/whoop/ai/chat/domain/formwidget/c$a;

    const/4 v2, 0x7

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_0

    :cond_6
    instance-of p1, p1, Lah0/g$f;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lah0/h$a;->y:Lah0/h;

    invoke-static {p1}, Lah0/h;->j(Lah0/h;)Lec3/o1;

    move-result-object p1

    sget-object v1, Lcom/whoop/ai/chat/domain/formwidget/c$f;->a:Lcom/whoop/ai/chat/domain/formwidget/c$f;

    const/16 v2, 0x8

    iput v2, p0, Lah0/h$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_0
    return-object v0

    :cond_7
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
