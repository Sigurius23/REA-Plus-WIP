.class final Lw31/e$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw31/e;->j(ZZLw31/b;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.swipelayout.SwipeLayoutKt$SampleSwipeLayoutRightToReveal$1$2$1"
    f = "SwipeLayout.kt"
    l = {}
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

.field final synthetic x:Lg1/n7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/n7;"
        }
    .end annotation
.end field

.field final synthetic y:Z

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lg1/n7;ZZLp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/n7;",
            "ZZ",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lw31/e$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw31/e$e;->x:Lg1/n7;

    iput-boolean p2, p0, Lw31/e$e;->y:Z

    iput-boolean p3, p0, Lw31/e$e;->z:Z

    iput-object p4, p0, Lw31/e$e;->E:Lp1/c1;

    iput-object p5, p0, Lw31/e$e;->F:Lp1/c1;

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

    new-instance v0, Lw31/e$e;

    iget-object v1, p0, Lw31/e$e;->x:Lg1/n7;

    iget-boolean v2, p0, Lw31/e$e;->y:Z

    iget-boolean v3, p0, Lw31/e$e;->z:Z

    iget-object v4, p0, Lw31/e$e;->E:Lp1/c1;

    iget-object v5, p0, Lw31/e$e;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lw31/e$e;-><init>(Lg1/n7;ZZLp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lw31/e$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw31/e$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw31/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw31/e$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lw31/e$e;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lw31/e$e;->x:Lg1/n7;

    iget-object p1, p1, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lw31/b;->DEFAULT:Lw31/b;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lw31/e$e;->E:Lp1/c1;

    iget-boolean v0, p0, Lw31/e$e;->y:Z

    invoke-static {p1, v0}, Lw31/e;->v(Lp1/c1;Z)V

    iget-object p1, p0, Lw31/e$e;->F:Lp1/c1;

    iget-boolean v0, p0, Lw31/e$e;->z:Z

    invoke-static {p1, v0}, Lw31/e;->w(Lp1/c1;Z)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
