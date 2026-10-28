.class final Lxq2/c1$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq2/c1;->D(FZLkotlin/jvm/functions/Function1;IILxq2/f0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineInitialPositionEffect$1$1"
    f = "YearInReviewTimeline.kt"
    l = {
        0x1b9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:I

.field final synthetic G:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:F

.field final synthetic y:Z

.field final synthetic z:Lxq2/f0;


# direct methods
.method public constructor <init>(FZLxq2/f0;IILkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ",
            "Lxq2/f0;",
            "II",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lxq2/c1$b;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lxq2/c1$b;->x:F

    iput-boolean p2, p0, Lxq2/c1$b;->y:Z

    iput-object p3, p0, Lxq2/c1$b;->z:Lxq2/f0;

    iput p4, p0, Lxq2/c1$b;->E:I

    iput p5, p0, Lxq2/c1$b;->F:I

    iput-object p6, p0, Lxq2/c1$b;->G:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/c1$b;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lxq2/c1$b;

    iget v1, p0, Lxq2/c1$b;->x:F

    iget-boolean v2, p0, Lxq2/c1$b;->y:Z

    iget-object v3, p0, Lxq2/c1$b;->z:Lxq2/f0;

    iget v4, p0, Lxq2/c1$b;->E:I

    iget v5, p0, Lxq2/c1$b;->F:I

    iget-object v6, p0, Lxq2/c1$b;->G:Lkotlin/jvm/functions/Function1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lxq2/c1$b;-><init>(FZLxq2/f0;IILkotlin/jvm/functions/Function1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxq2/c1$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxq2/c1$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxq2/c1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxq2/c1$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lxq2/c1$b;->w:I

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

    iget p1, p0, Lxq2/c1$b;->x:F

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_2

    iget-boolean p1, p0, Lxq2/c1$b;->y:Z

    if-nez p1, :cond_2

    iget-object v3, p0, Lxq2/c1$b;->z:Lxq2/f0;

    iget v4, p0, Lxq2/c1$b;->E:I

    iget v5, p0, Lxq2/c1$b;->F:I

    iget-object p1, p0, Lxq2/c1$b;->G:Lkotlin/jvm/functions/Function1;

    new-instance v7, Lxq2/d1;

    const/4 v1, 0x0

    invoke-direct {v7, p1, v1}, Lxq2/d1;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lxq2/c1$b;->w:I

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x30

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v3 .. v12}, Lxq2/f0;->h(Lxq2/f0;IIZLc93/a;ZLbc3/c0;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
