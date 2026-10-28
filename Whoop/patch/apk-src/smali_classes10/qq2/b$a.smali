.class final Lqq2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqq2/b;->l(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.user.journey.view.components.shared.AnimateTextTypingKt$AnimateTextTyping$2$1"
    f = "AnimateTextTyping.kt"
    l = {
        0x22
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:J

.field H:I

.field I:I

.field J:I

.field final synthetic K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic L:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic M:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic N:J

.field final synthetic O:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;JLp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "J",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lqq2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqq2/b$a;->K:Ljava/util/List;

    iput-object p2, p0, Lqq2/b$a;->L:Lc93/a;

    iput-object p3, p0, Lqq2/b$a;->M:Lkotlin/jvm/functions/Function1;

    iput-wide p4, p0, Lqq2/b$a;->N:J

    iput-object p6, p0, Lqq2/b$a;->O:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lqq2/b$a;

    iget-object v1, p0, Lqq2/b$a;->K:Ljava/util/List;

    iget-object v2, p0, Lqq2/b$a;->L:Lc93/a;

    iget-object v3, p0, Lqq2/b$a;->M:Lkotlin/jvm/functions/Function1;

    iget-wide v4, p0, Lqq2/b$a;->N:J

    iget-object v6, p0, Lqq2/b$a;->O:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lqq2/b$a;-><init>(Ljava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;JLp1/c1;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lqq2/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqq2/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqq2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqq2/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lqq2/b$a;->J:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lqq2/b$a;->H:I

    iget-wide v4, p0, Lqq2/b$a;->G:J

    iget-object v6, p0, Lqq2/b$a;->F:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, p0, Lqq2/b$a;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, p0, Lqq2/b$a;->y:Ljava/lang/Object;

    check-cast v7, Lp1/c1;

    iget-object v8, p0, Lqq2/b$a;->x:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lqq2/b$a;->w:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqq2/b$a;->K:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lqq2/b$a;->M:Lkotlin/jvm/functions/Function1;

    iget-wide v4, p0, Lqq2/b$a;->N:J

    iget-object v6, p0, Lqq2/b$a;->O:Lp1/c1;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v8, v1

    move v1, v2

    move-object v7, v6

    move-object v6, p1

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v7}, Lqq2/b;->q(Lp1/c1;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v7, p1}, Lqq2/b;->r(Lp1/c1;Ljava/lang/String;)V

    invoke-static {v7}, Lqq2/b;->q(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v8, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lqq2/b$a;->w:Ljava/lang/Object;

    iput-object v8, p0, Lqq2/b$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lqq2/b$a;->y:Ljava/lang/Object;

    iput-object v6, p0, Lqq2/b$a;->z:Ljava/lang/Object;

    iput-object p1, p0, Lqq2/b$a;->E:Ljava/lang/Object;

    iput-object p1, p0, Lqq2/b$a;->F:Ljava/lang/Object;

    iput-wide v4, p0, Lqq2/b$a;->G:J

    iput v1, p0, Lqq2/b$a;->H:I

    iput v2, p0, Lqq2/b$a;->I:I

    iput v3, p0, Lqq2/b$a;->J:I

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    iget-object p1, p0, Lqq2/b$a;->L:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
