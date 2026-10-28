.class public final Loc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final synthetic w:Loc3/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Loc3/a;->w:Loc3/a;

    iput-object v0, p0, Loc3/b;->w:Loc3/a;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Loc3/b;

    if-nez v0, :cond_1

    instance-of p1, p1, Loc3/a;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Loc3/b;->w:Loc3/a;

    invoke-virtual {v0, p1, p2}, Lq83/a;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    iget-object v0, p0, Loc3/b;->w:Loc3/a;

    invoke-virtual {v0, p1}, Lq83/a;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    iget-object v0, p0, Loc3/b;->w:Loc3/a;

    invoke-virtual {v0}, Lq83/a;->getKey()Lq83/i;

    move-result-object v0

    return-object v0
.end method

.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Loc3/b;->w:Loc3/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Loc3/a;->x:Ljava/lang/Object;

    monitor-enter p1

    monitor-exit p1

    return-void
.end method

.method public final hashCode()I
    .locals 1

    sget-object v0, Loc3/a;->w:Loc3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    iget-object v0, p0, Loc3/b;->w:Loc3/a;

    invoke-virtual {v0, p1}, Lq83/a;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    iget-object v0, p0, Loc3/b;->w:Loc3/a;

    invoke-virtual {v0, p1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method
