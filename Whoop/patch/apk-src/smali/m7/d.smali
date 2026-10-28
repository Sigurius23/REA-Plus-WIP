.class public final Lm7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e0;


# static fields
.field public static final h:Lr7/d;

.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/util/LinkedHashMap;

.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Lr7/d;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ln7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    sget-object v0, Lr7/d;->y:Ljava/util/LinkedHashMap;

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {v0, v1}, Lds/q;->D(D)Lr7/d;

    move-result-object v0

    sput-object v0, Lm7/d;->h:Lr7/d;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "general"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "after_meal"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ll83/k;

    const-string v6, "fasting"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v6, 0x3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Ll83/k;

    const-string v8, "before_meal"

    invoke-direct {v7, v8, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v3, v5, v7}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lm7/d;->i:Ljava/lang/Object;

    invoke-static {v1}, Ls2/e;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    sput-object v1, Lm7/d;->j:Ljava/util/LinkedHashMap;

    new-instance v7, Ll83/k;

    const-string v1, "interstitial_fluid"

    invoke-direct {v7, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v0, "capillary_blood"

    invoke-direct {v8, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const-string v0, "plasma"

    invoke-direct {v9, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v10, Ll83/k;

    const-string v1, "tears"

    invoke-direct {v10, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v11, Ll83/k;

    const-string v1, "whole_blood"

    invoke-direct {v11, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const-string v0, "serum"

    invoke-direct {v12, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v7 .. v12}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lm7/d;->k:Ljava/lang/Object;

    invoke-static {v0}, Ls2/e;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    sput-object v0, Lm7/d;->l:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/d;IIILn7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/d;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/d;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/d;->c:Lr7/d;

    iput p4, p0, Lm7/d;->d:I

    iput p5, p0, Lm7/d;->e:I

    iput p6, p0, Lm7/d;->f:I

    iput-object p7, p0, Lm7/d;->g:Ln7/c;

    invoke-virtual {p3}, Lr7/d;->b()Lr7/d;

    move-result-object p1

    const-string p2, "level"

    invoke-static {p3, p1, p2}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p1, Lm7/d;->h:Lr7/d;

    invoke-static {p3, p1, p2}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/d;->g:Ln7/c;

    return-object v0
.end method

.method public final d()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/d;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lm7/d;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type androidx.health.connect.client.records.BloodGlucoseRecord"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm7/d;

    iget-object v1, p0, Lm7/d;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/d;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lm7/d;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/d;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lm7/d;->c:Lr7/d;

    iget-object v3, p1, Lm7/d;->c:Lr7/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lm7/d;->d:I

    iget v3, p1, Lm7/d;->d:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lm7/d;->e:I

    iget v3, p1, Lm7/d;->e:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lm7/d;->f:I

    iget v3, p1, Lm7/d;->f:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lm7/d;->g:Ln7/c;

    iget-object p1, p1, Lm7/d;->g:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/d;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lm7/d;->a:Ljava/time/Instant;

    invoke-virtual {v0}, Ljava/time/Instant;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm7/d;->b:Ljava/time/ZoneOffset;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm7/d;->c:Lr7/d;

    invoke-virtual {v1}, Lr7/d;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lm7/d;->d:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lm7/d;->e:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lm7/d;->f:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lm7/d;->g:Ln7/c;

    invoke-virtual {v0}, Ln7/c;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
