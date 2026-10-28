.class public final Lb3/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# instance fields
.field public final w:Landroid/view/View;

.field public final x:Lq3/z;

.field public final y:Lbc3/c0;

.field public final z:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Landroid/view/View;Lq3/z;Lbc3/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/x0;->w:Landroid/view/View;

    iput-object p2, p0, Lb3/x0;->x:Lq3/z;

    iput-object p3, p0, Lb3/x0;->y:Lbc3/c0;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lb3/x0;->z:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Ld1/o;Ls83/c;)V
    .locals 5

    instance-of v0, p2, Lb3/w0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lb3/w0;

    iget v1, v0, Lb3/w0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb3/w0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb3/w0;

    invoke-direct {v0, p0, p2}, Lb3/w0;-><init>(Lb3/x0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lb3/w0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb3/w0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lb2/z;

    const/4 v2, 0x1

    invoke-direct {p2, v2, p1, p0}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Le;

    const/16 v2, 0xe

    const/4 v4, 0x0

    invoke-direct {p1, p0, v4, v2}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lb3/w0;->y:I

    new-instance v2, Lb2/y;

    iget-object v3, p0, Lb3/x0;->z:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, p2, v3, p1, v4}, Lb2/y;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/atomic/AtomicReference;Lc93/m;Lq83/d;)V

    invoke-static {v2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-void

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lb3/x0;->y:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method
