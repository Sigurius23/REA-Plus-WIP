.class final Lwz0/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwz0/d;->k(Landroidx/compose/ui/Modifier;Lwz0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.animatedsequence.AnimatedSequenceKt$AnimatedSequence$3$1"
    f = "AnimatedSequence.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lwz0/f;

.field final synthetic F:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic J:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:I

.field final synthetic y:Lwz0/e;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ILwz0/e;ZLwz0/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lwz0/e;",
            "Z",
            "Lwz0/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lwz0/d$b;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lwz0/d$b;->x:I

    iput-object p2, p0, Lwz0/d$b;->y:Lwz0/e;

    iput-boolean p3, p0, Lwz0/d$b;->z:Z

    iput-object p4, p0, Lwz0/d$b;->E:Lwz0/f;

    iput-object p5, p0, Lwz0/d$b;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lwz0/d$b;->G:Lp1/c1;

    iput-object p7, p0, Lwz0/d$b;->H:Lp1/c1;

    iput-object p8, p0, Lwz0/d$b;->I:Lp1/c1;

    iput-object p9, p0, Lwz0/d$b;->J:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11
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

    new-instance v0, Lwz0/d$b;

    iget v1, p0, Lwz0/d$b;->x:I

    iget-object v2, p0, Lwz0/d$b;->y:Lwz0/e;

    iget-boolean v3, p0, Lwz0/d$b;->z:Z

    iget-object v4, p0, Lwz0/d$b;->E:Lwz0/f;

    iget-object v5, p0, Lwz0/d$b;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lwz0/d$b;->G:Lp1/c1;

    iget-object v7, p0, Lwz0/d$b;->H:Lp1/c1;

    iget-object v8, p0, Lwz0/d$b;->I:Lp1/c1;

    iget-object v9, p0, Lwz0/d$b;->J:Lp1/c1;

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lwz0/d$b;-><init>(ILwz0/e;ZLwz0/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lwz0/d$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwz0/d$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwz0/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwz0/d$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lwz0/d$b;->w:I

    if-nez v0, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwz0/d$b;->G:Lp1/c1;

    invoke-static {p1}, Lwz0/d;->M(Lp1/c1;)Z

    move-result p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    iget p1, p0, Lwz0/d$b;->x:I

    iget-object v1, p0, Lwz0/d$b;->y:Lwz0/e;

    invoke-virtual {v1}, Lwz0/e;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    iget-object v2, p0, Lwz0/d$b;->y:Lwz0/e;

    invoke-virtual {v2}, Lwz0/e;->c()Li51/a;

    move-result-object v2

    iget-object v3, p0, Lwz0/d$b;->H:Lp1/c1;

    invoke-static {v3}, Lwz0/d;->O(Lp1/c1;)Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_2

    iget-boolean v3, p0, Lwz0/d$b;->z:Z

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move v3, v4

    :goto_1
    iget-object v5, p0, Lwz0/d$b;->I:Lp1/c1;

    invoke-static {v5}, Lwz0/d;->I(Lp1/c1;)Z

    move-result v5

    invoke-static {p1, v1, v2, v3, v5}, Lwz0/a;->b(IILi51/a;ZZ)Lwz0/g;

    move-result-object p1

    sget-object v1, Lwz0/g;->WAIT:Lwz0/g;

    if-ne p1, v1, :cond_3

    return-object v0

    :cond_3
    iget-object v1, p0, Lwz0/d$b;->E:Lwz0/f;

    invoke-virtual {v1}, Lwz0/f;->d()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v2, p0, Lwz0/d$b;->F:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object v1, Lwz0/g;->NEXT:Lwz0/g;

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lwz0/d$b;->J:Lp1/c1;

    invoke-static {p1}, Lwz0/d;->K(Lp1/c1;)I

    move-result p1

    iget-object v1, p0, Lwz0/d$b;->J:Lp1/c1;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v1, v2}, Lwz0/d;->L(Lp1/c1;I)V

    invoke-static {p1}, Lhg3/i;->v(I)Ljava/lang/Integer;

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lwz0/d$b;->G:Lp1/c1;

    invoke-static {p1, v4}, Lwz0/d;->N(Lp1/c1;Z)V

    iget-object p1, p0, Lwz0/d$b;->y:Lwz0/e;

    invoke-virtual {p1}, Lwz0/e;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v1, p0, Lwz0/d$b;->F:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_2
    return-object v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
