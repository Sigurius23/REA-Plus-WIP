.class public final Lbu2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0017\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001f\u001a\u0004\u0008\u001c\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001f\u001a\u0004\u0008!\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lbu2/q;",
        "Lm91/u;",
        "",
        "fillPercentage",
        "minFillPercentage",
        "maxFillPercentage",
        "Li2/x;",
        "backgroundColor",
        "foregroundColor",
        "sliderHandleColor",
        "<init>",
        "(FFFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "F",
        "b",
        "()F",
        "f",
        "c",
        "e",
        "d",
        "J",
        "()J",
        "g",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:J

.field private final e:J

.field private final f:J


# direct methods
.method private constructor <init>(FFFJJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lbu2/q;->a:F

    .line 4
    iput p2, p0, Lbu2/q;->b:F

    .line 5
    iput p3, p0, Lbu2/q;->c:F

    .line 6
    iput-wide p4, p0, Lbu2/q;->d:J

    .line 7
    iput-wide p6, p0, Lbu2/q;->e:J

    .line 8
    iput-wide p8, p0, Lbu2/q;->f:J

    return-void
.end method

.method public synthetic constructor <init>(FFFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lbu2/q;-><init>(FFFJJJ)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lbu2/q;->d:J

    return-wide v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lbu2/q;->a:F

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lbu2/q;->e:J

    return-wide v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lbu2/q;->c:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbu2/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbu2/q;

    iget v1, p0, Lbu2/q;->a:F

    iget v3, p1, Lbu2/q;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lbu2/q;->b:F

    iget v3, p1, Lbu2/q;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lbu2/q;->c:F

    iget v3, p1, Lbu2/q;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lbu2/q;->d:J

    iget-wide v5, p1, Lbu2/q;->d:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lbu2/q;->e:J

    iget-wide v5, p1, Lbu2/q;->e:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lbu2/q;->f:J

    iget-wide v5, p1, Lbu2/q;->f:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lbu2/q;->b:F

    return v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lbu2/q;->f:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lbu2/q;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lbu2/q;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lbu2/q;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v2, p0, Lbu2/q;->d:J

    sget v4, Li2/x;->o:I

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lbu2/q;->e:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lbu2/q;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lbu2/q;->a:F

    iget v1, p0, Lbu2/q;->b:F

    iget v2, p0, Lbu2/q;->c:F

    iget-wide v3, p0, Lbu2/q;->d:J

    invoke-static {v3, v4}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Lbu2/q;->e:J

    invoke-static {v4, v5}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v4

    iget-wide v5, p0, Lbu2/q;->f:J

    invoke-static {v5, v6}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v5

    const-string v6, ", minFillPercentage="

    const-string v7, ", maxFillPercentage="

    const-string v8, "SliderItemState(fillPercentage="

    invoke-static {v8, v0, v6, v1, v7}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", foregroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sliderHandleColor="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
