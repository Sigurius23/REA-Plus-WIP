.class final Lu31/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
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
    c = "com.whoop.design.atomic.molecule.spinnerselector.WhoopSpinnerSelectorKt$WhoopSpinnerSelector$4$1"
    f = "WhoopSpinnerSelector.kt"
    l = {
        0x5a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lq0/y;

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLq0/y;Lp1/t2;Lp1/t2;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq0/y;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lu31/e$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lu31/e$b;->x:Z

    iput-object p2, p0, Lu31/e$b;->y:Lq0/y;

    iput-object p3, p0, Lu31/e$b;->z:Lp1/t2;

    iput-object p4, p0, Lu31/e$b;->E:Lp1/t2;

    iput-object p5, p0, Lu31/e$b;->F:Lp1/t2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lq0/y;)I
    .locals 0

    invoke-static {p0}, Lu31/e$b;->h(Lq0/y;)I

    move-result p0

    return p0
.end method

.method private static final h(Lq0/y;)I
    .locals 0

    invoke-virtual {p0}, Lq0/y;->p()I

    move-result p0

    return p0
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

    new-instance v0, Lu31/e$b;

    iget-boolean v1, p0, Lu31/e$b;->x:Z

    iget-object v2, p0, Lu31/e$b;->y:Lq0/y;

    iget-object v3, p0, Lu31/e$b;->z:Lp1/t2;

    iget-object v4, p0, Lu31/e$b;->E:Lp1/t2;

    iget-object v5, p0, Lu31/e$b;->F:Lp1/t2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lu31/e$b;-><init>(ZLq0/y;Lp1/t2;Lp1/t2;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lu31/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu31/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu31/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lu31/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lu31/e$b;->w:I

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

    iget-object p1, p0, Lu31/e$b;->y:Lq0/y;

    new-instance v1, Lu31/f;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lu31/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    iget-boolean v1, p0, Lu31/e$b;->x:Z

    invoke-static {p1, v1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v1, Lu31/e$b$a;

    iget-object v3, p0, Lu31/e$b;->z:Lp1/t2;

    iget-object v4, p0, Lu31/e$b;->E:Lp1/t2;

    iget-object v5, p0, Lu31/e$b;->F:Lp1/t2;

    invoke-direct {v1, v3, v4, v5}, Lu31/e$b$a;-><init>(Lp1/t2;Lp1/t2;Lp1/t2;)V

    iput v2, p0, Lu31/e$b;->w:I

    invoke-virtual {p1, v1, p0}, Lec3/h0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
