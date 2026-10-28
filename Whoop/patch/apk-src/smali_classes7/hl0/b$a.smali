.class public final Lhl0/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhl0/b;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.feedback.AiFeedbackInteractor$interact$$inlined$flatMapLatest$1"
    f = "AiFeedbackInteractor.kt"
    l = {
        0xbe,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lhl0/b;


# direct methods
.method public constructor <init>(Lq83/d;Lhl0/b;)V
    .locals 0

    iput-object p2, p0, Lhl0/b$a;->z:Lhl0/b;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lhl0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhl0/b$a;

    iget-object v1, p0, Lhl0/b$a;->z:Lhl0/b;

    invoke-direct {v0, p3, v1}, Lhl0/b$a;-><init>(Lq83/d;Lhl0/b;)V

    iput-object p1, v0, Lhl0/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lhl0/b$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lhl0/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lhl0/b$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lhl0/b$a;->w:I

    const/4 v2, 0x2

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lhl0/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, p0, Lhl0/b$a;->G:Ljava/lang/Object;

    check-cast v1, Lhl0/a;

    iget-object v6, p0, Lhl0/b$a;->F:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, p0, Lhl0/b$a;->E:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, p0, Lhl0/b$a;->x:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lhl0/b$a;->x:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lec3/m;

    iget-object v1, p0, Lhl0/b$a;->y:Ljava/lang/Object;

    check-cast v1, Lhl0/a;

    sget-object v7, Lu02/a;->a:Lu02/a$a;

    iget-object v8, p0, Lhl0/b$a;->z:Lhl0/b;

    invoke-static {v8}, Lhl0/b;->f(Lhl0/b;)Ltr2/n;

    move-result-object v8

    new-instance v11, Lhl0/b$b;

    iget-object v9, p0, Lhl0/b$a;->z:Lhl0/b;

    invoke-direct {v11, v9, v1, v5}, Lhl0/b$b;-><init>(Lhl0/b;Lhl0/a;Lq83/d;)V

    iput-object v5, p0, Lhl0/b$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Lhl0/b$a;->y:Ljava/lang/Object;

    iput-object v6, p0, Lhl0/b$a;->E:Ljava/lang/Object;

    iput-object v5, p0, Lhl0/b$a;->F:Ljava/lang/Object;

    iput-object v1, p0, Lhl0/b$a;->G:Ljava/lang/Object;

    const/4 v9, 0x0

    iput v9, p0, Lhl0/b$a;->H:I

    iput v4, p0, Lhl0/b$a;->w:I

    const/4 v9, 0x0

    const-string v10, "Failed to submit ai conversation feedback"

    const/4 v13, 0x2

    const/4 v14, 0x0

    move-object v12, p0

    invoke-static/range {v7 .. v14}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_3

    goto :goto_5

    :cond_3
    :goto_0
    check-cast v7, Lu02/a;

    instance-of v8, v7, Lu02/a$c;

    if-eqz v8, :cond_4

    iget-object v7, p0, Lhl0/b$a;->z:Lhl0/b;

    invoke-static {v7}, Lhl0/b;->e(Lhl0/b;)Lhl0/e;

    move-result-object v7

    invoke-virtual {v1}, Lhl0/a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lhl0/a;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v1

    invoke-virtual {v7, v9, v1}, Lhl0/e;->a(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V

    goto :goto_1

    :cond_4
    instance-of v1, v7, Lu02/a$b;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lhl0/b$a;->z:Lhl0/b;

    invoke-static {v1}, Lhl0/b;->c(Lhl0/b;)Lxk0/a;

    move-result-object v1

    check-cast v7, Lu02/a$b;

    const-string v9, "post_feedback"

    invoke-virtual {v1, v7, v9}, Lxk0/a;->L(Lu02/a$b;Ljava/lang/String;)V

    :goto_1
    if-eqz v8, :cond_5

    sget-object v1, Lhl0/d$b;->a:Lhl0/d$b;

    goto :goto_2

    :cond_5
    sget-object v1, Lhl0/d$a;->a:Lhl0/d$a;

    :goto_2
    iget-object v7, p0, Lhl0/b$a;->z:Lhl0/b;

    invoke-static {v7}, Lhl0/b;->e(Lhl0/b;)Lhl0/e;

    move-result-object v7

    invoke-virtual {v7}, Lhl0/e;->b()Ljava/util/Map;

    move-result-object v7

    new-instance v8, Lhl0/c;

    invoke-direct {v8, v7, v4, v1}, Lhl0/c;-><init>(Ljava/util/Map;ZLhl0/d;)V

    iput-object v5, p0, Lhl0/b$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Lhl0/b$a;->y:Ljava/lang/Object;

    iput-object v5, p0, Lhl0/b$a;->E:Ljava/lang/Object;

    iput-object v5, p0, Lhl0/b$a;->F:Ljava/lang/Object;

    iput-object v5, p0, Lhl0/b$a;->G:Ljava/lang/Object;

    iput v2, p0, Lhl0/b$a;->w:I

    invoke-static {v6}, Lec3/v;->y(Lec3/m;)V

    invoke-interface {v6, v8, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_6

    goto :goto_3

    :cond_6
    move-object v1, v3

    :goto_3
    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_7

    goto :goto_4

    :cond_7
    move-object v1, v3

    :goto_4
    if-ne v1, v0, :cond_8

    :goto_5
    return-object v0

    :cond_8
    :goto_6
    return-object v3

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
