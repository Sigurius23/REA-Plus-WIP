.class final Lpt2/l$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpt2/l;->B(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$6$1$2$1$7$1$1$1"
    f = "HubAndSpokeBehaviorSelectionScreen.kt"
    l = {
        0x116
    }
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

.field w:I

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Lot2/c;

.field final synthetic z:Lv41/f$a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lot2/c;",
            "Lv41/f$a;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lpt2/l$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpt2/l$e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpt2/l$e;->y:Lot2/c;

    iput-object p3, p0, Lpt2/l$e;->z:Lv41/f$a;

    iput-object p4, p0, Lpt2/l$e;->E:Lp1/c1;

    iput-object p5, p0, Lpt2/l$e;->F:Lp1/c1;

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

    new-instance v0, Lpt2/l$e;

    iget-object v1, p0, Lpt2/l$e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lpt2/l$e;->y:Lot2/c;

    iget-object v3, p0, Lpt2/l$e;->z:Lv41/f$a;

    iget-object v4, p0, Lpt2/l$e;->E:Lp1/c1;

    iget-object v5, p0, Lpt2/l$e;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lpt2/l$e;-><init>(Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lpt2/l$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpt2/l$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpt2/l$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpt2/l$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpt2/l$e;->w:I

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

    iget-object p1, p0, Lpt2/l$e;->x:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lnt2/a$e;

    sget-object v3, Ljt2/c;->BEHAVIOR:Ljt2/c;

    invoke-direct {v1, v3}, Lnt2/a$e;-><init>(Ljt2/c;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lpt2/l$e;->E:Lp1/c1;

    sget-object v1, Lpt2/a$b;->a:Lpt2/a$b;

    invoke-static {p1, v1}, Lpt2/l;->X(Lp1/c1;Lpt2/a;)V

    iget-object p1, p0, Lpt2/l$e;->F:Lp1/c1;

    new-instance v3, Lv41/g;

    iget-object v1, p0, Lpt2/l$e;->y:Lot2/c;

    invoke-virtual {v1}, Lot2/c;->b()Lkm0/e;

    move-result-object v1

    invoke-virtual {v1}, Lkm0/e;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Ly71/g;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lyb0/f;->a(Lx81/d;)I

    move-result v1

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-direct {v5, v1, v7, v6, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x7c

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v3}, Lpt2/l;->Y(Lp1/c1;Lv41/g;)V

    iget-object p1, p0, Lpt2/l$e;->z:Lv41/f$a;

    invoke-virtual {p1}, Lv41/f$a;->a()Lg1/y3;

    move-result-object p1

    iput v2, p0, Lpt2/l$e;->w:I

    invoke-virtual {p1, p0}, Lg1/y3;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
