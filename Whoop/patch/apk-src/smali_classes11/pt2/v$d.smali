.class final Lpt2/v$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpt2/v;->f0(Lot2/m$i;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeLandingScreenKt$Success$6$3$2$1$3$1$3$1$1"
    f = "HubAndSpokeLandingScreen.kt"
    l = {
        0x165
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

.field w:I

.field final synthetic x:Ljava/lang/Object;

.field final synthetic y:Lv41/f$a;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lv41/f$a;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lpt2/v$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpt2/v$d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lpt2/v$d;->y:Lv41/f$a;

    iput-object p3, p0, Lpt2/v$d;->z:Lp1/c1;

    iput-object p4, p0, Lpt2/v$d;->E:Lp1/c1;

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

    new-instance v0, Lpt2/v$d;

    iget-object v1, p0, Lpt2/v$d;->x:Ljava/lang/Object;

    iget-object v2, p0, Lpt2/v$d;->y:Lv41/f$a;

    iget-object v3, p0, Lpt2/v$d;->z:Lp1/c1;

    iget-object v4, p0, Lpt2/v$d;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lpt2/v$d;-><init>(Ljava/lang/Object;Lv41/f$a;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lpt2/v$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpt2/v$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpt2/v$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lpt2/v$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpt2/v$d;->w:I

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

    iget-object p1, p0, Lpt2/v$d;->z:Lp1/c1;

    iget-object v1, p0, Lpt2/v$d;->x:Ljava/lang/Object;

    check-cast v1, Lf41/a;

    invoke-static {p1, v1}, Lpt2/v;->S0(Lp1/c1;Lf41/a;)V

    iget-object p1, p0, Lpt2/v$d;->E:Lp1/c1;

    new-instance v3, Lv41/g;

    iget-object v1, p0, Lpt2/v$d;->x:Ljava/lang/Object;

    check-cast v1, Lf41/a;

    invoke-virtual {v1}, Lf41/a;->a()Lcom/whoop/design/util/TextResource;

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

    invoke-static {p1, v3}, Lpt2/v;->R0(Lp1/c1;Lv41/g;)V

    iget-object p1, p0, Lpt2/v$d;->y:Lv41/f$a;

    invoke-virtual {p1}, Lv41/f$a;->a()Lg1/y3;

    move-result-object p1

    iput v2, p0, Lpt2/v$d;->w:I

    invoke-virtual {p1, p0}, Lg1/y3;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
