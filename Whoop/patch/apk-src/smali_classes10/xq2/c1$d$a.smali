.class final Lxq2/c1$d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq2/c1$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineSnapEffects$1$1$1"
    f = "YearInReviewTimeline.kt"
    l = {
        0x19b,
        0x1a3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/Integer;

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:I

.field x:I

.field y:I

.field final synthetic z:Lxq2/f0;


# direct methods
.method public constructor <init>(Lxq2/f0;Ljava/lang/Integer;IIILkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxq2/f0;",
            "Ljava/lang/Integer;",
            "III",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lxq2/c1$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxq2/c1$d$a;->z:Lxq2/f0;

    iput-object p2, p0, Lxq2/c1$d$a;->E:Ljava/lang/Integer;

    iput p3, p0, Lxq2/c1$d$a;->F:I

    iput p4, p0, Lxq2/c1$d$a;->G:I

    iput p5, p0, Lxq2/c1$d$a;->H:I

    iput-object p6, p0, Lxq2/c1$d$a;->I:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lxq2/c1$d$a;->h(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lxq2/c1$d$a;

    iget-object v1, p0, Lxq2/c1$d$a;->z:Lxq2/f0;

    iget-object v2, p0, Lxq2/c1$d$a;->E:Ljava/lang/Integer;

    iget v3, p0, Lxq2/c1$d$a;->F:I

    iget v4, p0, Lxq2/c1$d$a;->G:I

    iget v5, p0, Lxq2/c1$d$a;->H:I

    iget-object v6, p0, Lxq2/c1$d$a;->I:Lkotlin/jvm/functions/Function1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lxq2/c1$d$a;-><init>(Lxq2/f0;Ljava/lang/Integer;IIILkotlin/jvm/functions/Function1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxq2/c1$d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxq2/c1$d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxq2/c1$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxq2/c1$d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lxq2/c1$d$a;->y:I

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v11

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lxq2/c1$d$a;->y:I

    const-wide/16 v3, 0xfa

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    iget-object v0, p0, Lxq2/c1$d$a;->z:Lxq2/f0;

    invoke-virtual {v0}, Lxq2/f0;->c()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lxq2/c1$d$a;->z:Lxq2/f0;

    invoke-virtual {v0}, Lxq2/f0;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lxq2/c1$d$a;->E:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v3, p0, Lxq2/c1$d$a;->F:I

    div-int/2addr v0, v3

    mul-int/2addr v0, v3

    iget v3, p0, Lxq2/c1$d$a;->G:I

    sub-int v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v4, p0, Lxq2/c1$d$a;->G:I

    if-eq v0, v4, :cond_6

    iget-object v4, p0, Lxq2/c1$d$a;->z:Lxq2/f0;

    invoke-virtual {v4}, Lxq2/f0;->d()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v0, v4, :cond_6

    :goto_1
    if-lt v3, v2, :cond_6

    iget-object v2, p0, Lxq2/c1$d$a;->z:Lxq2/f0;

    move-object v4, v2

    iget v2, p0, Lxq2/c1$d$a;->H:I

    iget-object v5, p0, Lxq2/c1$d$a;->I:Lkotlin/jvm/functions/Function1;

    move-object v6, v4

    new-instance v4, Lxq2/f1;

    invoke-direct {v4, v5, v0}, Lxq2/f1;-><init>(Lkotlin/jvm/functions/Function1;I)V

    iput v0, p0, Lxq2/c1$d$a;->w:I

    iput v3, p0, Lxq2/c1$d$a;->x:I

    iput v1, p0, Lxq2/c1$d$a;->y:I

    const/4 v3, 0x1

    const/4 v5, 0x0

    move v1, v0

    move-object v0, v6

    const/4 v6, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v9}, Lxq2/f0;->h(Lxq2/f0;IIZLc93/a;ZLbc3/c0;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_6

    :goto_2
    return-object v10

    :cond_6
    :goto_3
    return-object v11
.end method
