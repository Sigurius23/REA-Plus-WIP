.class final Lxq2/c1$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq2/c1;->T(Ljava/lang/Integer;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineSnapEffects$1$1"
    f = "YearInReviewTimeline.kt"
    l = {
        0x199
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lbc3/c0;

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

.field final synthetic x:Ljava/lang/Integer;

.field final synthetic y:I

.field final synthetic z:Lxq2/f0;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;ILxq2/f0;Lbc3/c0;IIILkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "I",
            "Lxq2/f0;",
            "Lbc3/c0;",
            "III",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lxq2/c1$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxq2/c1$d;->x:Ljava/lang/Integer;

    iput p2, p0, Lxq2/c1$d;->y:I

    iput-object p3, p0, Lxq2/c1$d;->z:Lxq2/f0;

    iput-object p4, p0, Lxq2/c1$d;->E:Lbc3/c0;

    iput p5, p0, Lxq2/c1$d;->F:I

    iput p6, p0, Lxq2/c1$d;->G:I

    iput p7, p0, Lxq2/c1$d;->H:I

    iput-object p8, p0, Lxq2/c1$d;->I:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Lxq2/c1$d;

    iget-object v1, p0, Lxq2/c1$d;->x:Ljava/lang/Integer;

    iget v2, p0, Lxq2/c1$d;->y:I

    iget-object v3, p0, Lxq2/c1$d;->z:Lxq2/f0;

    iget-object v4, p0, Lxq2/c1$d;->E:Lbc3/c0;

    iget v5, p0, Lxq2/c1$d;->F:I

    iget v6, p0, Lxq2/c1$d;->G:I

    iget v7, p0, Lxq2/c1$d;->H:I

    iget-object v8, p0, Lxq2/c1$d;->I:Lkotlin/jvm/functions/Function1;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lxq2/c1$d;-><init>(Ljava/lang/Integer;ILxq2/f0;Lbc3/c0;IIILkotlin/jvm/functions/Function1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxq2/c1$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxq2/c1$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxq2/c1$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxq2/c1$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lxq2/c1$d;->w:I

    const/4 v2, 0x1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

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

    iget-object p1, p0, Lxq2/c1$d;->x:Ljava/lang/Integer;

    if-eqz p1, :cond_6

    iget p1, p0, Lxq2/c1$d;->y:I

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lxq2/c1$d;->z:Lxq2/f0;

    invoke-virtual {p1}, Lxq2/f0;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lxq2/c1$d;->z:Lxq2/f0;

    invoke-virtual {p1}, Lxq2/f0;->f()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lxq2/c1$d;->z:Lxq2/f0;

    invoke-virtual {p1}, Lxq2/f0;->e()Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_5

    iput v2, p0, Lxq2/c1$d;->w:I

    invoke-static {p1, p0}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_0
    iget-object v5, p0, Lxq2/c1$d;->z:Lxq2/f0;

    iget-object p1, p0, Lxq2/c1$d;->E:Lbc3/c0;

    new-instance v4, Lxq2/c1$d$a;

    iget-object v6, p0, Lxq2/c1$d;->x:Ljava/lang/Integer;

    iget v7, p0, Lxq2/c1$d;->F:I

    iget v8, p0, Lxq2/c1$d;->G:I

    iget v9, p0, Lxq2/c1$d;->H:I

    iget-object v10, p0, Lxq2/c1$d;->I:Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v11}, Lxq2/c1$d$a;-><init>(Lxq2/f0;Ljava/lang/Integer;IIILkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v4, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    invoke-virtual {v5, p1}, Lxq2/f0;->l(Lbc3/k1;)V

    :cond_6
    :goto_1
    return-object v3
.end method
