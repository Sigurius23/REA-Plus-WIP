.class public final Lp1/b2;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final synthetic w:La2/c;

.field public final synthetic x:Lp1/c2;


# direct methods
.method public constructor <init>(La2/c;Lp1/c2;)V
    .locals 0

    iput-object p1, p0, Lp1/b2;->w:La2/c;

    iput-object p2, p0, Lp1/b2;->x:Lp1/c2;

    sget-object p1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {p0, p1}, Lq83/a;-><init>(Lq83/i;)V

    return-void
.end method


# virtual methods
.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 4

    new-instance v0, Li;

    const/4 v1, 0x2

    iget-object v2, p0, Lp1/b2;->w:La2/c;

    iget-object v3, p0, Lp1/b2;->x:Lp1/c2;

    invoke-direct {v0, v1, v2, v3}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, v0}, Ldt/b;->Y(Ljava/lang/Throwable;Lc93/a;)Z

    sget-object v0, Lbc3/a0;->w:Lbc3/a0;

    iget-object v1, v3, Lp1/c2;->w:Lq83/j;

    invoke-interface {v1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/CoroutineExceptionHandler;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/CoroutineExceptionHandler;->handleException(Lq83/j;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    throw p2
.end method
