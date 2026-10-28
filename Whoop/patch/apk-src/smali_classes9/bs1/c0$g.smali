.class final Lbs1/c0$g;
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
    c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$17$1"
    f = "JournalSurveyAnswerScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lg1/y3;

.field final synthetic y:Lds1/k;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg1/y3;Lds1/k;Lkotlin/jvm/functions/Function1;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/y3;",
            "Lds1/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lbs1/c0$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbs1/c0$g;->x:Lg1/y3;

    iput-object p2, p0, Lbs1/c0$g;->y:Lds1/k;

    iput-object p3, p0, Lbs1/c0$g;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lbs1/c0$g;->E:Lp1/t2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lbs1/c0$g;

    iget-object v1, p0, Lbs1/c0$g;->x:Lg1/y3;

    iget-object v2, p0, Lbs1/c0$g;->y:Lds1/k;

    iget-object v3, p0, Lbs1/c0$g;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lbs1/c0$g;->E:Lp1/t2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lbs1/c0$g;-><init>(Lg1/y3;Lds1/k;Lkotlin/jvm/functions/Function1;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbs1/c0$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbs1/c0$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbs1/c0$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lbs1/c0$g;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbs1/c0$g;->x:Lg1/y3;

    invoke-virtual {p1}, Lg1/y3;->c()Lg1/z3;

    move-result-object p1

    sget-object v0, Lg1/z3;->w:Lg1/z3;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lbs1/c0$g;->y:Lds1/k;

    invoke-virtual {p1}, Lds1/k;->f()Lds1/e;

    move-result-object p1

    invoke-virtual {p1}, Lds1/e;->r()Lds1/b;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lbs1/c0$g;->y:Lds1/k;

    invoke-virtual {p1}, Lds1/k;->f()Lds1/e;

    move-result-object p1

    invoke-virtual {p1}, Lds1/e;->r()Lds1/b;

    move-result-object p1

    invoke-virtual {p1}, Lds1/b;->c()Lds1/a;

    move-result-object p1

    instance-of p1, p1, Lds1/a$a;

    if-nez p1, :cond_0

    iget-object p1, p0, Lbs1/c0$g;->z:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lw71/d$h;

    const/4 v1, -0x1

    const-string v2, "25:25"

    invoke-direct {v0, v1, v2}, Lw71/d$h;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lbs1/c0$g;->E:Lp1/t2;

    invoke-static {p1}, Lbs1/c0;->t2(Lp1/t2;)Lb3/x2;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->a()V

    :cond_1
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
