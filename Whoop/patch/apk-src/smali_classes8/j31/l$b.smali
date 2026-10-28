.class final Lj31/l$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/l;->a(Lc93/m;Ln0/u;Lc93/m;Lc93/m;FLj31/b;Landroidx/compose/runtime/Composer;II)Lj31/k;
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
    c = "com.whoop.design.atomic.molecule.reordable.ReorderableLazyListStateKt$rememberReorderableLazyListState$2$1"
    f = "ReorderableLazyListState.kt"
    l = {
        0x3d,
        0x3e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ln0/u;

.field final synthetic F:Z

.field final synthetic G:Lj31/k;

.field w:I

.field x:F

.field y:F

.field z:I


# direct methods
.method public constructor <init>(Ln0/u;ZLj31/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "Z",
            "Lj31/k;",
            "Lq83/d<",
            "-",
            "Lj31/l$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/l$b;->E:Ln0/u;

    iput-boolean p2, p0, Lj31/l$b;->F:Z

    iput-object p3, p0, Lj31/l$b;->G:Lj31/k;

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

    new-instance p1, Lj31/l$b;

    iget-object v0, p0, Lj31/l$b;->E:Ln0/u;

    iget-boolean v1, p0, Lj31/l$b;->F:Z

    iget-object v2, p0, Lj31/l$b;->G:Lj31/k;

    invoke-direct {p1, v0, v1, v2, p2}, Lj31/l$b;-><init>(Ln0/u;ZLj31/k;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lj31/l$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/l$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/l$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj31/l$b;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lj31/l$b;->x:F

    iget v4, p0, Lj31/l$b;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move p1, v4

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v1, p0, Lj31/l$b;->x:F

    iget v4, p0, Lj31/l$b;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj31/l$b;->E:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p0, Lj31/l$b;->F:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lj31/l$b;->E:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget-object p1, p1, Ln0/n;->o:Lh0/d2;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    if-eq p1, v1, :cond_4

    const/4 p1, 0x0

    goto :goto_0

    :cond_4
    move p1, v3

    :goto_0
    if-eqz p1, :cond_5

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_5
    const/high16 v1, -0x40800000    # -1.0f

    :goto_1
    iget-object v4, p0, Lj31/l$b;->G:Lj31/k;

    invoke-virtual {v4}, Lj31/m;->H()Ldc3/l;

    move-result-object v4

    iput p1, p0, Lj31/l$b;->w:I

    iput v1, p0, Lj31/l$b;->x:F

    iput v3, p0, Lj31/l$b;->z:I

    invoke-interface {v4, p0}, Ldc3/w;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_6

    goto :goto_3

    :cond_6
    move-object v7, v4

    move v4, p1

    move-object p1, v7

    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-object v5, p0, Lj31/l$b;->E:Ln0/u;

    mul-float v6, p1, v1

    iput v4, p0, Lj31/l$b;->w:I

    iput v1, p0, Lj31/l$b;->x:F

    iput p1, p0, Lj31/l$b;->y:F

    iput v2, p0, Lj31/l$b;->z:I

    invoke-static {v5, v6, p0}, Lh0/q3;->p(Lh0/x2;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    :goto_3
    return-object v0
.end method
