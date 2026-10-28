.class final Lh31/s$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh31/s;->h(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.recommendationtile.RecommendationTileWrapperKt$RecommendationTileWrapper$3$1"
    f = "RecommendationTileWrapper.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic z:Lld1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lld1/c<",
            "Lh31/m;",
            "Lh31/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/t2;Lkotlin/jvm/functions/Function1;Lld1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lkotlin/jvm/functions/Function1;",
            "Lld1/c<",
            "Lh31/m;",
            "Lh31/o;",
            ">;",
            "Lq83/d<",
            "-",
            "Lh31/s$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh31/s$c;->x:Lp1/t2;

    iput-object p2, p0, Lh31/s$c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lh31/s$c;->z:Lld1/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lh31/s$c;

    iget-object v0, p0, Lh31/s$c;->x:Lp1/t2;

    iget-object v1, p0, Lh31/s$c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lh31/s$c;->z:Lld1/c;

    invoke-direct {p1, v0, v1, v2, p2}, Lh31/s$c;-><init>(Lp1/t2;Lkotlin/jvm/functions/Function1;Lld1/c;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lh31/s$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh31/s$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh31/s$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh31/s$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lh31/s$c;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh31/s$c;->x:Lp1/t2;

    invoke-static {p1}, Lh31/s;->n(Lp1/t2;)Lh31/m;

    move-result-object p1

    invoke-virtual {p1}, Lh31/m;->b()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lh31/s$c;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh31/s$c;->z:Lld1/c;

    new-instance v2, Lc91/a$b;

    invoke-direct {v2, p1}, Lc91/a$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lh31/o$a;->a:Lh31/o$a;

    invoke-virtual {v1, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
