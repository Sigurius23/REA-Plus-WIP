.class public final Lr63/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/d;
.implements Ls83/d;


# instance fields
.field public w:I

.field public final synthetic x:Lr63/k;


# direct methods
.method public constructor <init>(Lr63/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr63/j;->x:Lr63/k;

    const/high16 p1, -0x80000000

    iput p1, p0, Lr63/j;->w:I

    return-void
.end method


# virtual methods
.method public final getCallerFrame()Ls83/d;
    .locals 5

    sget-object v0, Lr63/i;->w:Lr63/i;

    iget v1, p0, Lr63/j;->w:I

    iget-object v2, p0, Lr63/j;->x:Lr63/k;

    const/high16 v3, -0x80000000

    if-ne v1, v3, :cond_0

    iget v1, v2, Lr63/k;->F:I

    iput v1, p0, Lr63/j;->w:I

    :cond_0
    iget v1, p0, Lr63/j;->w:I

    const/4 v4, 0x0

    if-gez v1, :cond_1

    iput v3, p0, Lr63/j;->w:I

    move-object v0, v4

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v2, v2, Lr63/k;->E:[Lq83/d;

    aget-object v2, v2, v1

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lr63/j;->w:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v2

    :catchall_0
    :goto_0
    instance-of v1, v0, Ls83/d;

    if-eqz v1, :cond_3

    move-object v4, v0

    check-cast v4, Ls83/d;

    :cond_3
    return-object v4
.end method

.method public final getContext()Lq83/j;
    .locals 2

    iget-object v0, p0, Lr63/j;->x:Lr63/k;

    iget-object v1, v0, Lr63/k;->E:[Lq83/d;

    iget v0, v0, Lr63/k;->F:I

    aget-object v0, v1, v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    instance-of v0, p1, Ll83/m;

    iget-object v1, p0, Lr63/j;->x:Lr63/k;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Lr63/k;->f(Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lr63/k;->e(Z)Z

    return-void
.end method
