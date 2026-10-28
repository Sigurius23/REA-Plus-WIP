.class public final Lec3/g;
.super Lfc3/d;
.source "SourceFile"


# static fields
.field public static final synthetic F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final E:Z

.field private volatile synthetic consumed$volatile:I

.field public final z:Ldc3/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lec3/g;

    const-string v1, "consumed$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lec3/g;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public synthetic constructor <init>(Ldc3/w;Z)V
    .locals 6

    const/4 v4, -0x3

    .line 1
    sget-object v5, Ldc3/a;->w:Ldc3/a;

    .line 2
    sget-object v3, Lq83/k;->w:Lq83/k;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lec3/g;-><init>(Ldc3/w;ZLq83/j;ILdc3/a;)V

    return-void
.end method

.method public constructor <init>(Ldc3/w;ZLq83/j;ILdc3/a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p3, p4, p5}, Lfc3/d;-><init>(Lq83/j;ILdc3/a;)V

    .line 4
    iput-object p1, p0, Lec3/g;->z:Ldc3/w;

    .line 5
    iput-boolean p2, p0, Lec3/g;->E:Z

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "channel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lec3/g;->z:Ldc3/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lfc3/d;->x:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lec3/g;->E:Z

    if-eqz v0, :cond_1

    sget-object v1, Lec3/g;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    move-result v1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ReceiveChannel.consumeAsFlow can be collected just once"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, p0, Lec3/g;->z:Ldc3/w;

    invoke-static {p1, v1, v0, p2}, Lec3/v;->x(Lec3/m;Ldc3/w;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_2
    invoke-super {p0, p1, p2}, Lfc3/d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lfc3/w;

    invoke-direct {v0, p1}, Lfc3/w;-><init>(Ldc3/u;)V

    iget-object p1, p0, Lec3/g;->z:Ldc3/w;

    iget-boolean v1, p0, Lec3/g;->E:Z

    invoke-static {v0, p1, v1, p2}, Lec3/v;->x(Lec3/m;Ldc3/w;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final f(Lq83/j;ILdc3/a;)Lfc3/d;
    .locals 6

    new-instance v0, Lec3/g;

    iget-object v1, p0, Lec3/g;->z:Ldc3/w;

    iget-boolean v2, p0, Lec3/g;->E:Z

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lec3/g;-><init>(Ldc3/w;ZLq83/j;ILdc3/a;)V

    return-object v0
.end method

.method public final g()Lec3/l;
    .locals 3

    new-instance v0, Lec3/g;

    iget-object v1, p0, Lec3/g;->z:Ldc3/w;

    iget-boolean v2, p0, Lec3/g;->E:Z

    invoke-direct {v0, v1, v2}, Lec3/g;-><init>(Ldc3/w;Z)V

    return-object v0
.end method

.method public final h(Lbc3/c0;)Ldc3/w;
    .locals 2

    iget-boolean v0, p0, Lec3/g;->E:Z

    if-eqz v0, :cond_1

    sget-object v0, Lec3/g;->F:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ReceiveChannel.consumeAsFlow can be collected just once"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget v0, p0, Lfc3/d;->x:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_2

    iget-object p1, p0, Lec3/g;->z:Ldc3/w;

    return-object p1

    :cond_2
    invoke-super {p0, p1}, Lfc3/d;->h(Lbc3/c0;)Ldc3/w;

    move-result-object p1

    return-object p1
.end method
