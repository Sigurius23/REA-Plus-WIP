.class final Lbs1/c0$e;
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
    c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$13$1"
    f = "JournalSurveyAnswerScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lbc3/c0;

.field final synthetic H:Lv41/f$a;

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lds1/k;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLds1/k;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lds1/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lbc3/c0;",
            "Lv41/f$a;",
            "Lq83/d<",
            "-",
            "Lbs1/c0$e;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lbs1/c0$e;->x:Z

    iput-object p2, p0, Lbs1/c0$e;->y:Lds1/k;

    iput-object p3, p0, Lbs1/c0$e;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lbs1/c0$e;->E:Lp1/c1;

    iput-object p5, p0, Lbs1/c0$e;->F:Lp1/c1;

    iput-object p6, p0, Lbs1/c0$e;->G:Lbc3/c0;

    iput-object p7, p0, Lbs1/c0$e;->H:Lv41/f$a;

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

    new-instance v0, Lbs1/c0$e;

    iget-boolean v1, p0, Lbs1/c0$e;->x:Z

    iget-object v2, p0, Lbs1/c0$e;->y:Lds1/k;

    iget-object v3, p0, Lbs1/c0$e;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lbs1/c0$e;->E:Lp1/c1;

    iget-object v5, p0, Lbs1/c0$e;->F:Lp1/c1;

    iget-object v6, p0, Lbs1/c0$e;->G:Lbc3/c0;

    iget-object v7, p0, Lbs1/c0$e;->H:Lv41/f$a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lbs1/c0$e;-><init>(ZLds1/k;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbs1/c0$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbs1/c0$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbs1/c0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lbs1/c0$e;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v1, p0, Lbs1/c0$e;->x:Z

    iget-object p1, p0, Lbs1/c0$e;->y:Lds1/k;

    invoke-virtual {p1}, Lds1/k;->d()Z

    move-result v2

    iget-object v3, p0, Lbs1/c0$e;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lbs1/c0$e;->E:Lp1/c1;

    iget-object v5, p0, Lbs1/c0$e;->F:Lp1/c1;

    iget-object v6, p0, Lbs1/c0$e;->G:Lbc3/c0;

    iget-object v7, p0, Lbs1/c0$e;->H:Lv41/f$a;

    invoke-static/range {v1 .. v7}, Lbs1/c0;->x2(ZZLkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
