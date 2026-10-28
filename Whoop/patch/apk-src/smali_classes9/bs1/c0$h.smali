.class final Lbs1/c0$h;
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
    c = "com.whoop.journal.view.screen.JournalSurveyAnswerScreenKt$SurveyAnswerScreen$18$1"
    f = "JournalSurveyAnswerScreen.kt"
    l = {
        0x131
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lds1/k;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lv41/f$a;

.field final synthetic z:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv41/f$a;Lc93/m;Lds1/k;Lp1/c1;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv41/f$a;",
            "Lc93/m;",
            "Lds1/k;",
            "Lp1/c1;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lbs1/c0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbs1/c0$h;->y:Lv41/f$a;

    iput-object p2, p0, Lbs1/c0$h;->z:Lc93/m;

    iput-object p3, p0, Lbs1/c0$h;->E:Lds1/k;

    iput-object p4, p0, Lbs1/c0$h;->F:Lp1/c1;

    iput-object p5, p0, Lbs1/c0$h;->G:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lv41/f$a;)Lg1/z3;
    .locals 0

    invoke-static {p0}, Lbs1/c0$h;->h(Lv41/f$a;)Lg1/z3;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lv41/f$a;)Lg1/z3;
    .locals 0

    invoke-virtual {p0}, Lv41/f$a;->a()Lg1/y3;

    move-result-object p0

    invoke-virtual {p0}, Lg1/y3;->b()Lg1/z3;

    move-result-object p0

    return-object p0
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

    new-instance v0, Lbs1/c0$h;

    iget-object v1, p0, Lbs1/c0$h;->y:Lv41/f$a;

    iget-object v2, p0, Lbs1/c0$h;->z:Lc93/m;

    iget-object v3, p0, Lbs1/c0$h;->E:Lds1/k;

    iget-object v4, p0, Lbs1/c0$h;->F:Lp1/c1;

    iget-object v5, p0, Lbs1/c0$h;->G:Lc93/a;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lbs1/c0$h;-><init>(Lv41/f$a;Lc93/m;Lds1/k;Lp1/c1;Lc93/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbs1/c0$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbs1/c0$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbs1/c0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbs1/c0$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbs1/c0$h;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lbs1/c0$h;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v7

    iget-object p1, p0, Lbs1/c0$h;->y:Lv41/f$a;

    new-instance v1, Lbs1/q;

    const/4 v3, 0x2

    invoke-direct {v1, p1, v3}, Lbs1/q;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v3, Lbs1/c0$h$a;

    iget-object v4, p0, Lbs1/c0$h;->z:Lc93/m;

    iget-object v5, p0, Lbs1/c0$h;->E:Lds1/k;

    iget-object v6, p0, Lbs1/c0$h;->F:Lp1/c1;

    iget-object v8, p0, Lbs1/c0$h;->G:Lc93/a;

    invoke-direct/range {v3 .. v8}, Lbs1/c0$h$a;-><init>(Lc93/m;Lds1/k;Lp1/c1;Lkotlin/jvm/internal/g0;Lc93/a;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lbs1/c0$h;->w:Ljava/lang/Object;

    iput v2, p0, Lbs1/c0$h;->x:I

    invoke-virtual {p1, v3, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
