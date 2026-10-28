.class final Lp01/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp01/f;->i(Landroidx/compose/ui/Modifier;Lp01/b;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.molecule.circularprogressindicator.CircularProgressIndicatorKt$CircularProgressIndicator$1$1"
    f = "CircularProgressIndicator.kt"
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

.field final synthetic F:Lbc3/c0;

.field w:I

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp01/b;


# direct methods
.method public constructor <init>(Lp1/c1;Lp1/c1;Lp01/b;Lp1/c1;Lbc3/c0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp01/b;",
            "Lp1/c1;",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lp01/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp01/f$a;->x:Lp1/c1;

    iput-object p2, p0, Lp01/f$a;->y:Lp1/c1;

    iput-object p3, p0, Lp01/f$a;->z:Lp01/b;

    iput-object p4, p0, Lp01/f$a;->E:Lp1/c1;

    iput-object p5, p0, Lp01/f$a;->F:Lbc3/c0;

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

    new-instance v0, Lp01/f$a;

    iget-object v1, p0, Lp01/f$a;->x:Lp1/c1;

    iget-object v2, p0, Lp01/f$a;->y:Lp1/c1;

    iget-object v3, p0, Lp01/f$a;->z:Lp01/b;

    iget-object v4, p0, Lp01/f$a;->E:Lp1/c1;

    iget-object v5, p0, Lp01/f$a;->F:Lbc3/c0;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lp01/f$a;-><init>(Lp1/c1;Lp1/c1;Lp01/b;Lp1/c1;Lbc3/c0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lp01/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp01/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp01/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp01/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lp01/f$a;->w:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp01/f$a;->x:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lp01/f$a;->y:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lp01/f$a;->z:Lp01/b;

    invoke-virtual {p1}, Lp01/b;->v()Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lp01/f$a;->E:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object p1, p0, Lp01/f$a;->E:Lp1/c1;

    iget-object v1, p0, Lp01/f$a;->F:Lbc3/c0;

    new-instance v2, Lp01/f$a$a;

    iget-object v3, p0, Lp01/f$a;->x:Lp1/c1;

    iget-object v4, p0, Lp01/f$a;->z:Lp01/b;

    invoke-direct {v2, v3, v4, v0}, Lp01/f$a$a;-><init>(Lp1/c1;Lp01/b;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v1, v0, v0, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lp01/f$a;->y:Lp1/c1;

    iget-object v0, p0, Lp01/f$a;->z:Lp01/b;

    invoke-virtual {v0}, Lp01/b;->v()Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
