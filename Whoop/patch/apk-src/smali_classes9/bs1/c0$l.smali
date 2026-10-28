.class final Lbs1/c0$l;
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
    c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$19$2$6$3$1$1"
    f = "JournalSurveyAnswerScreen.kt"
    l = {
        0x1d9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lds1/k;

.field final synthetic y:Lg1/y3;


# direct methods
.method public constructor <init>(Lds1/k;Lg1/y3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lds1/k;",
            "Lg1/y3;",
            "Lq83/d<",
            "-",
            "Lbs1/c0$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbs1/c0$l;->x:Lds1/k;

    iput-object p2, p0, Lbs1/c0$l;->y:Lg1/y3;

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

    new-instance p1, Lbs1/c0$l;

    iget-object v0, p0, Lbs1/c0$l;->x:Lds1/k;

    iget-object v1, p0, Lbs1/c0$l;->y:Lg1/y3;

    invoke-direct {p1, v0, v1, p2}, Lbs1/c0$l;-><init>(Lds1/k;Lg1/y3;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbs1/c0$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbs1/c0$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbs1/c0$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$l;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbs1/c0$l;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbs1/c0$l;->x:Lds1/k;

    invoke-virtual {p1}, Lds1/k;->f()Lds1/e;

    move-result-object p1

    invoke-virtual {p1}, Lds1/e;->r()Lds1/b;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lbs1/c0$l;->y:Lg1/y3;

    invoke-virtual {p1}, Lg1/y3;->e()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lbs1/c0$l;->x:Lds1/k;

    invoke-virtual {p1}, Lds1/k;->f()Lds1/e;

    move-result-object p1

    invoke-virtual {p1}, Lds1/e;->r()Lds1/b;

    move-result-object p1

    invoke-virtual {p1}, Lds1/b;->c()Lds1/a;

    move-result-object p1

    instance-of p1, p1, Lds1/a$a;

    if-nez p1, :cond_2

    iget-object p1, p0, Lbs1/c0$l;->y:Lg1/y3;

    iput v2, p0, Lbs1/c0$l;->w:I

    invoke-virtual {p1, p0}, Lg1/y3;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
