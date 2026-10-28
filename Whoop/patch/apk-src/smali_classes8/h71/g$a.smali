.class final Lh71/g$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh71/g;->l(Landroidx/compose/ui/Modifier;Lh71/j;Lh71/i;Li71/b;JLkotlin/jvm/functions/Function1;Lf0/r1;Ll0/k1;Ld61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.graph.scrollable.ScrollableGraphKt$ScrollableGraph$3$1"
    f = "ScrollableGraph.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lf0/r1;


# direct methods
.method public constructor <init>(Lp1/c1;Lf0/r1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lf0/r1;",
            "Lq83/d<",
            "-",
            "Lh71/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh71/g$a;->y:Lp1/c1;

    iput-object p2, p0, Lh71/g$a;->z:Lf0/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lh71/g$a;->h(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method private static final h(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lh71/g;->C(Lp1/c1;)Z

    move-result p0

    return p0
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

    new-instance v0, Lh71/g$a;

    iget-object v1, p0, Lh71/g$a;->y:Lp1/c1;

    iget-object v2, p0, Lh71/g$a;->z:Lf0/r1;

    invoke-direct {v0, v1, v2, p2}, Lh71/g$a;-><init>(Lp1/c1;Lf0/r1;Lq83/d;)V

    iput-object p1, v0, Lh71/g$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lh71/g$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh71/g$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh71/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh71/g$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lh71/g$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lh71/g$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh71/g$a;->y:Lp1/c1;

    new-instance v2, Lh71/f;

    invoke-direct {v2, p1}, Lh71/f;-><init>(Lp1/c1;)V

    invoke-static {v2}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v2, Lh71/g$a$a;

    iget-object v4, p0, Lh71/g$a;->z:Lf0/r1;

    iget-object v5, p0, Lh71/g$a;->y:Lp1/c1;

    invoke-direct {v2, v0, v4, v5}, Lh71/g$a$a;-><init>(Lbc3/c0;Lf0/r1;Lp1/c1;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lh71/g$a;->x:Ljava/lang/Object;

    iput v3, p0, Lh71/g$a;->w:I

    invoke-virtual {p1, v2, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
