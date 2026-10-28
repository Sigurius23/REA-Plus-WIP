.class final Lbs1/c0$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbs1/c0;->r1(Lds1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;ZLm12/e;Lc93/n;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;ZILkotlin/jvm/functions/Function1;ZLc93/a;JLc93/m;Landroidx/compose/runtime/Composer;IIII)V
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
    c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$12$1"
    f = "JournalSurveyAnswerScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh11/h;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;JLc93/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lh11/h;",
            ">;J",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lbs1/c0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbs1/c0$d;->x:Ljava/lang/String;

    iput-object p2, p0, Lbs1/c0$d;->y:Ljava/util/List;

    iput-wide p3, p0, Lbs1/c0$d;->z:J

    iput-object p5, p0, Lbs1/c0$d;->E:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lbs1/c0$d;

    iget-object v1, p0, Lbs1/c0$d;->x:Ljava/lang/String;

    iget-object v2, p0, Lbs1/c0$d;->y:Ljava/util/List;

    iget-wide v3, p0, Lbs1/c0$d;->z:J

    iget-object v5, p0, Lbs1/c0$d;->E:Lc93/m;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lbs1/c0$d;-><init>(Ljava/lang/String;Ljava/util/List;JLc93/m;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbs1/c0$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbs1/c0$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbs1/c0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lbs1/c0$d;->w:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbs1/c0$d;->x:Ljava/lang/String;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lbs1/c0$d;->y:Ljava/util/List;

    iget-wide v1, p0, Lbs1/c0$d;->z:J

    iget-object v3, p0, Lbs1/c0$d;->E:Lc93/m;

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lh11/h;

    invoke-virtual {v6}, Lh11/h;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    check-cast v4, Lh11/h;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lh11/h;->e()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v4, v6, v8

    if-eqz v4, :cond_2

    move-object v5, v0

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_3
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    invoke-interface {v3, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
