.class final Lbs1/c0$c;
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
    c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$11$1"
    f = "JournalSurveyAnswerScreen.kt"
    l = {
        0xc6,
        0xcc
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lf0/r1;

.field final synthetic G:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic H:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic I:I

.field w:I

.field x:I

.field final synthetic y:Z

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLp1/c1;ZLf0/r1;Lkotlin/jvm/functions/Function1;Lc93/a;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lp1/c1;",
            "Z",
            "Lf0/r1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "I",
            "Lq83/d<",
            "-",
            "Lbs1/c0$c;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lbs1/c0$c;->y:Z

    iput-object p2, p0, Lbs1/c0$c;->z:Lp1/c1;

    iput-boolean p3, p0, Lbs1/c0$c;->E:Z

    iput-object p4, p0, Lbs1/c0$c;->F:Lf0/r1;

    iput-object p5, p0, Lbs1/c0$c;->G:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lbs1/c0$c;->H:Lc93/a;

    iput p7, p0, Lbs1/c0$c;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lbs1/c0$c;

    iget-boolean v1, p0, Lbs1/c0$c;->y:Z

    iget-object v2, p0, Lbs1/c0$c;->z:Lp1/c1;

    iget-boolean v3, p0, Lbs1/c0$c;->E:Z

    iget-object v4, p0, Lbs1/c0$c;->F:Lf0/r1;

    iget-object v5, p0, Lbs1/c0$c;->G:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lbs1/c0$c;->H:Lc93/a;

    iget v7, p0, Lbs1/c0$c;->I:I

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lbs1/c0$c;-><init>(ZLp1/c1;ZLf0/r1;Lkotlin/jvm/functions/Function1;Lc93/a;ILq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbs1/c0$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbs1/c0$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbs1/c0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbs1/c0$c;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, Lbs1/c0$c;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

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

    iget-boolean p1, p0, Lbs1/c0$c;->y:Z

    if-nez p1, :cond_3

    goto :goto_4

    :cond_3
    iget-object p1, p0, Lbs1/c0$c;->z:Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lbs1/c0$c;->E:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lbs1/c0$c;->F:Lf0/r1;

    iput v4, p0, Lbs1/c0$c;->x:I

    invoke-virtual {p1, v5, p0}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lbs1/c0$c;->G:Lkotlin/jvm/functions/Function1;

    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lbs1/c0$c;->H:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-object v2

    :cond_5
    iget p1, p0, Lbs1/c0$c;->I:I

    if-gez p1, :cond_6

    goto :goto_1

    :cond_6
    move v5, p1

    :goto_1
    iget-object p1, p0, Lbs1/c0$c;->F:Lf0/r1;

    iget-object p1, p1, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    if-eq p1, v5, :cond_8

    iget-object p1, p0, Lbs1/c0$c;->F:Lf0/r1;

    iput v5, p0, Lbs1/c0$c;->w:I

    iput v3, p0, Lbs1/c0$c;->x:I

    invoke-virtual {p1, v5, p0}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    move v0, v5

    :goto_3
    iget-object p1, p0, Lbs1/c0$c;->G:Lkotlin/jvm/functions/Function1;

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    :goto_4
    return-object v2
.end method
