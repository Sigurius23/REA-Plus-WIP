.class public final Lm7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/e0;


# static fields
.field public static final h:Ljava/lang/Object;

.field public static final i:Ljava/util/LinkedHashMap;

.field public static final j:Ljava/lang/Object;

.field public static final k:Ljava/util/LinkedHashMap;

.field public static final l:Lr7/j0;

.field public static final m:Lr7/j0;

.field public static final n:Lr7/j0;

.field public static final o:Lr7/j0;


# instance fields
.field public final a:Ljava/time/Instant;

.field public final b:Ljava/time/ZoneOffset;

.field public final c:Lr7/j0;

.field public final d:Lr7/j0;

.field public final e:I

.field public final f:I

.field public final g:Ln7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "left_upper_arm"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ll83/k;

    const-string v5, "left_wrist"

    invoke-direct {v4, v5, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Ll83/k;

    const-string v8, "right_upper_arm"

    invoke-direct {v7, v8, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v8, 0x2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v10, Ll83/k;

    const-string v11, "right_wrist"

    invoke-direct {v10, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v4, v7, v10}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    sput-object v2, Lm7/e;->h:Ljava/lang/Object;

    invoke-static {v2}, Ls2/e;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    sput-object v2, Lm7/e;->i:Ljava/util/LinkedHashMap;

    new-instance v2, Ll83/k;

    const-string v4, "lying_down"

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v4, "reclining"

    invoke-direct {v1, v4, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v6, "sitting_down"

    invoke-direct {v4, v6, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "standing_up"

    invoke-direct {v6, v7, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v1, v4, v6}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lm7/e;->j:Ljava/lang/Object;

    invoke-static {v1}, Ls2/e;->d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    sput-object v1, Lm7/e;->k:Ljava/util/LinkedHashMap;

    const/16 v1, 0x14

    invoke-static {v1}, Lse/b;->F(I)Lr7/j0;

    move-result-object v1

    sput-object v1, Lm7/e;->l:Lr7/j0;

    const/16 v1, 0xc8

    invoke-static {v1}, Lse/b;->F(I)Lr7/j0;

    move-result-object v1

    sput-object v1, Lm7/e;->m:Lr7/j0;

    const/16 v1, 0xa

    invoke-static {v1}, Lse/b;->F(I)Lr7/j0;

    move-result-object v1

    sput-object v1, Lm7/e;->n:Lr7/j0;

    const/16 v1, 0xb4

    invoke-static {v1}, Lse/b;->F(I)Lr7/j0;

    move-result-object v1

    sput-object v1, Lm7/e;->o:Lr7/j0;

    new-instance v1, Lg40/f4;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lg40/f4;-><init>(I)V

    const-string v2, "BloodPressure"

    const-string v3, "systolic"

    invoke-static {v8, v2, v3, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lg40/f4;

    const/16 v4, 0x18

    invoke-direct {v1, v4}, Lg40/f4;-><init>(I)V

    invoke-static {v0, v2, v3, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lg40/f4;

    const/16 v4, 0x17

    invoke-direct {v1, v4}, Lg40/f4;-><init>(I)V

    invoke-static {v5, v2, v3, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lg40/f4;

    const/16 v3, 0x13

    invoke-direct {v1, v3}, Lg40/f4;-><init>(I)V

    const-string v3, "diastolic"

    invoke-static {v8, v2, v3, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lg40/f4;

    const/16 v4, 0x15

    invoke-direct {v1, v4}, Lg40/f4;-><init>(I)V

    invoke-static {v0, v2, v3, v1}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lg40/f4;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg40/f4;-><init>(I)V

    invoke-static {v5, v2, v3, v0}, Lvd/e;->q(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Ljava/time/Instant;Ljava/time/ZoneOffset;Lr7/j0;Lr7/j0;IILn7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/e;->a:Ljava/time/Instant;

    iput-object p2, p0, Lm7/e;->b:Ljava/time/ZoneOffset;

    iput-object p3, p0, Lm7/e;->c:Lr7/j0;

    iput-object p4, p0, Lm7/e;->d:Lr7/j0;

    iput p5, p0, Lm7/e;->e:I

    iput p6, p0, Lm7/e;->f:I

    iput-object p7, p0, Lm7/e;->g:Ln7/c;

    sget-object p1, Lm7/e;->l:Lr7/j0;

    const-string p2, "systolic"

    invoke-static {p3, p1, p2}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p1, Lm7/e;->m:Lr7/j0;

    invoke-static {p3, p1, p2}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p1, Lm7/e;->n:Lr7/j0;

    const-string p2, "diastolic"

    invoke-static {p4, p1, p2}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    sget-object p1, Lm7/e;->o:Lr7/j0;

    invoke-static {p4, p1, p2}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()Ln7/c;
    .locals 1

    iget-object v0, p0, Lm7/e;->g:Ln7/c;

    return-object v0
.end method

.method public final d()Ljava/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lm7/e;->b:Ljava/time/ZoneOffset;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm7/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lm7/e;

    iget-object v1, p1, Lm7/e;->c:Lr7/j0;

    iget-object v3, p0, Lm7/e;->c:Lr7/j0;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lm7/e;->d:Lr7/j0;

    iget-object v3, p1, Lm7/e;->d:Lr7/j0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lm7/e;->e:I

    iget v3, p1, Lm7/e;->e:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lm7/e;->f:I

    iget v3, p1, Lm7/e;->f:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lm7/e;->a:Ljava/time/Instant;

    iget-object v3, p1, Lm7/e;->a:Ljava/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lm7/e;->b:Ljava/time/ZoneOffset;

    iget-object v3, p1, Lm7/e;->b:Ljava/time/ZoneOffset;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lm7/e;->g:Ln7/c;

    iget-object p1, p1, Lm7/e;->g:Ln7/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getTime()Ljava/time/Instant;
    .locals 1

    iget-object v0, p0, Lm7/e;->a:Ljava/time/Instant;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lm7/e;->c:Lr7/j0;

    invoke-virtual {v0}, Lr7/j0;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm7/e;->d:Lr7/j0;

    invoke-virtual {v2}, Lr7/j0;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lm7/e;->e:I

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lm7/e;->f:I

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lm7/e;->a:Ljava/time/Instant;

    invoke-static {v0, v2, v1}, Ljh3/c;->b(Ljava/time/Instant;II)I

    move-result v0

    iget-object v2, p0, Lm7/e;->b:Ljava/time/ZoneOffset;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/time/ZoneOffset;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm7/e;->g:Ln7/c;

    invoke-virtual {v1}, Ln7/c;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
