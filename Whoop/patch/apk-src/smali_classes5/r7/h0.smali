.class public final Lr7/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final y:Lr7/d0;

.field public static final z:Ljava/util/LinkedHashMap;


# instance fields
.field public final w:D

.field public final x:Lr7/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lr7/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr7/h0;->y:Lr7/d0;

    invoke-static {}, Lr7/g0;->values()[Lr7/g0;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    array-length v2, v0

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    new-instance v5, Lr7/h0;

    const-wide/16 v6, 0x0

    invoke-direct {v5, v6, v7, v4}, Lr7/h0;-><init>(DLr7/g0;)V

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v1, Lr7/h0;->z:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(DLr7/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lr7/h0;->w:D

    iput-object p3, p0, Lr7/h0;->x:Lr7/g0;

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 4

    iget-object v0, p0, Lr7/h0;->x:Lr7/g0;

    invoke-virtual {v0}, Lr7/g0;->b()D

    move-result-wide v0

    iget-wide v2, p0, Lr7/h0;->w:D

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public final b()Lr7/h0;
    .locals 2

    sget-object v0, Lr7/h0;->z:Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lr7/h0;->x:Lr7/g0;

    invoke-static {v1, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr7/h0;

    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lr7/h0;

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr7/h0;->x:Lr7/g0;

    iget-object v1, p1, Lr7/h0;->x:Lr7/g0;

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lr7/h0;->w:D

    iget-wide v2, p1, Lr7/h0;->w:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Lr7/h0;->a()D

    move-result-wide v0

    invoke-virtual {p1}, Lr7/h0;->a()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lr7/h0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lr7/h0;

    iget-object v1, p1, Lr7/h0;->x:Lr7/g0;

    iget-object v3, p0, Lr7/h0;->x:Lr7/g0;

    if-ne v3, v1, :cond_3

    iget-wide v3, p0, Lr7/h0;->w:D

    iget-wide v5, p1, Lr7/h0;->w:D

    cmpg-double p1, v3, v5

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2

    :cond_3
    invoke-virtual {p0}, Lr7/h0;->a()D

    move-result-wide v3

    invoke-virtual {p1}, Lr7/h0;->a()D

    move-result-wide v5

    cmpg-double p1, v3, v5

    if-nez p1, :cond_4

    return v0

    :cond_4
    return v2
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Lr7/h0;->a()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lr7/h0;->w:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr7/h0;->x:Lr7/g0;

    invoke-virtual {v1}, Lr7/g0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
