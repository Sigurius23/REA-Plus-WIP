.class public final Lm7/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/g0;


# static fields
.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Ljava/time/Instant;

.field public final d:Ljava/time/ZoneOffset;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;

.field public final h:Ln7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    invoke-static {}, Lvd/e;->s()V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "awake"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "sleeping"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "out_of_bed"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "light"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v5, Ll83/k;

    const-string v6, "deep"

    invoke-direct {v5, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "rem"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "awake_in_bed"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v8, Ll83/k;

    const-string v9, "unknown"

    invoke-direct {v8, v9, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v8}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lm7/x0;->i:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sput-object v2, Lm7/x0;->j:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/x0;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/x0;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/x0;->c:Ljava/time/Instant;

    iput-object p4, p0, Lm7/x0;->d:Ljava/time/ZoneOffset;

    iput-object p5, p0, Lm7/x0;->e:Ljava/lang/String;

    iput-object p6, p0, Lm7/x0;->f:Ljava/lang/String;

    iput-object p7, p0, Lm7/x0;->g:Ljava/util/List;

    iput-object p8, p0, Lm7/x0;->h:Ln7/c;

    invoke-virtual {p1, p3}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p1

    if-eqz p1, :cond_5

    move-object p1, p7

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    check-cast p7, Ljava/lang/Iterable;

    new-instance p1, Lm3/g;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, Lm3/g;-><init>(I)V

    invoke-static {p7, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    const-string p4, "Failed requirement."

    if-ge p3, p2, :cond_1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lm7/w0;

    invoke-virtual {p5}, Lm7/w0;->a()Ljava/time/Instant;

    move-result-object p5

    add-int/lit8 p3, p3, 0x1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lm7/w0;

    invoke-virtual {p6}, Lm7/w0;->b()Ljava/time/Instant;

    move-result-object p6

    invoke-virtual {p5, p6}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p5

    if-nez p5, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lm7/w0;

    invoke-virtual {p2}, Lm7/w0;->b()Ljava/time/Instant;

    move-result-object p2

    iget-object p3, p0, Lm7/x0;->a:Ljava/time/Instant;

    invoke-virtual {p2, p3}, Ljava/time/Instant;->isBefore(Ljava/time/Instant;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm7/w0;

    invoke-virtual {p1}, Lm7/w0;->a()Ljava/time/Instant;

    move-result-object p1

    iget-object p2, p0, Lm7/x0;->c:Ljava/time/Instant;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->isAfter(Ljava/time/Instant;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startTime must be before endTime."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/x0;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/x0;->h:Ln7/c;

    return-object v0
.end method

.method public final e()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/x0;->c:Ljava/time/Instant;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/x0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/x0;

    iget-object v1, p1, Lm7/x0;->e:Ljava/lang/String;

    iget-object v3, p0, Lm7/x0;->e:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/x0;->f:Ljava/lang/String;

    iget-object v3, p1, Lm7/x0;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/x0;->g:Ljava/util/List;

    iget-object v3, p1, Lm7/x0;->g:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/x0;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/x0;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm7/x0;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/x0;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm7/x0;->c:Ljava/time/Instant;

    iget-object v3, p1, Lm7/x0;->c:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lm7/x0;->d:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/x0;->d:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lm7/x0;->h:Ln7/c;

    iget-object p1, p1, Lm7/x0;->h:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/x0;->d:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final getStartTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/x0;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lm7/x0;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/x0;->f:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/x0;->g:Ljava/util/List;

    invoke-static {v1, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v1

    iget-object v3, p0, Lm7/x0;->b:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Lm7/x0;->c:Ljava/time/Instant;

    invoke-static {v3, v1, v2}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v1

    iget-object v3, p0, Lm7/x0;->d:Ljava/time/ZoneOffset;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v0

    :cond_3
    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lm7/x0;->h:Ln7/c;

    invoke-virtual {v0}, Ln7/c;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
