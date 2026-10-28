.class public final Landroidx/room/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/g;
.implements Lub/f;


# static fields
.field public static final I:Ljava/util/TreeMap;


# instance fields
.field public final E:[Ljava/lang/String;

.field public final F:[[B

.field public final G:[I

.field public H:I

.field public final w:I

.field public volatile x:Ljava/lang/String;

.field public final y:[J

.field public final z:[D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    sput-object v0, Landroidx/room/n1;->I:Ljava/util/TreeMap;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/room/n1;->w:I

    add-int/lit8 p1, p1, 0x1

    new-array v0, p1, [I

    iput-object v0, p0, Landroidx/room/n1;->G:[I

    new-array v0, p1, [J

    iput-object v0, p0, Landroidx/room/n1;->y:[J

    new-array v0, p1, [D

    iput-object v0, p0, Landroidx/room/n1;->z:[D

    new-array v0, p1, [Ljava/lang/String;

    iput-object v0, p0, Landroidx/room/n1;->E:[Ljava/lang/String;

    new-array p1, p1, [[B

    iput-object p1, p0, Landroidx/room/n1;->F:[[B

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Landroidx/room/n1;->H:I

    return v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Landroidx/room/n1;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i(Lub/f;)V
    .locals 6

    iget v0, p0, Landroidx/room/n1;->H:I

    const/4 v1, 0x1

    if-gt v1, v0, :cond_7

    move v2, v1

    :goto_0
    iget-object v3, p0, Landroidx/room/n1;->G:[I

    aget v3, v3, v2

    if-eq v3, v1, :cond_6

    const/4 v4, 0x2

    if-eq v3, v4, :cond_5

    const/4 v4, 0x3

    if-eq v3, v4, :cond_4

    const/4 v4, 0x4

    const-string v5, "Required value was null."

    if-eq v3, v4, :cond_2

    const/4 v4, 0x5

    if-eq v3, v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Landroidx/room/n1;->F:[[B

    aget-object v3, v3, v2

    if-eqz v3, :cond_1

    invoke-interface {p1, v2, v3}, Lub/f;->q(I[B)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v3, p0, Landroidx/room/n1;->E:[Ljava/lang/String;

    aget-object v3, v3, v2

    if-eqz v3, :cond_3

    invoke-interface {p1, v2, v3}, Lub/f;->n0(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    iget-object v3, p0, Landroidx/room/n1;->z:[D

    aget-wide v3, v3, v2

    invoke-interface {p1, v3, v4, v2}, Lub/f;->t(DI)V

    goto :goto_1

    :cond_5
    iget-object v3, p0, Landroidx/room/n1;->y:[J

    aget-wide v3, v3, v2

    invoke-interface {p1, v2, v3, v4}, Lub/f;->p(IJ)V

    goto :goto_1

    :cond_6
    invoke-interface {p1, v2}, Lub/f;->u(I)V

    :goto_1
    if-eq v2, v0, :cond_7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final k()V
    .locals 4

    sget-object v0, Landroidx/room/n1;->I:Ljava/util/TreeMap;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/room/n1;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v1

    const/16 v2, 0xf

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0xa

    invoke-virtual {v0}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v3, "iterator(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v3

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final n0(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/room/n1;->G:[I

    const/4 v1, 0x4

    aput v1, v0, p1

    iget-object v0, p0, Landroidx/room/n1;->E:[Ljava/lang/String;

    aput-object p2, v0, p1

    return-void
.end method

.method public final p(IJ)V
    .locals 2

    iget-object v0, p0, Landroidx/room/n1;->G:[I

    const/4 v1, 0x2

    aput v1, v0, p1

    iget-object v0, p0, Landroidx/room/n1;->y:[J

    aput-wide p2, v0, p1

    return-void
.end method

.method public final q(I[B)V
    .locals 2

    iget-object v0, p0, Landroidx/room/n1;->G:[I

    const/4 v1, 0x5

    aput v1, v0, p1

    iget-object v0, p0, Landroidx/room/n1;->F:[[B

    aput-object p2, v0, p1

    return-void
.end method

.method public final t(DI)V
    .locals 2

    iget-object v0, p0, Landroidx/room/n1;->G:[I

    const/4 v1, 0x3

    aput v1, v0, p3

    iget-object v0, p0, Landroidx/room/n1;->z:[D

    aput-wide p1, v0, p3

    return-void
.end method

.method public final u(I)V
    .locals 2

    iget-object v0, p0, Landroidx/room/n1;->G:[I

    const/4 v1, 0x1

    aput v1, v0, p1

    return-void
.end method
