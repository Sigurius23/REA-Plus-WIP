.class public final Llq2/p$a$a;
.super Llq2/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llq2/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008!\u0010 R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001e\u001a\u0004\u0008\u001d\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Llq2/p$a$a;",
        "Llq2/p$a;",
        "Li2/x;",
        "start",
        "end",
        "",
        "startAlpha",
        "endAlpha",
        "bottomDark",
        "bottomDarkStartFraction",
        "<init>",
        "(JJFFJFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "J",
        "f",
        "()J",
        "b",
        "d",
        "c",
        "F",
        "g",
        "()F",
        "e",
        "user-journey_release"
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
.field private final a:J

.field private final b:J

.field private final c:F

.field private final d:F

.field private final e:J

.field private final f:F


# direct methods
.method private constructor <init>(JJFFJF)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Llq2/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-wide p1, p0, Llq2/p$a$a;->a:J

    .line 4
    iput-wide p3, p0, Llq2/p$a$a;->b:J

    .line 5
    iput p5, p0, Llq2/p$a$a;->c:F

    .line 6
    iput p6, p0, Llq2/p$a$a;->d:F

    .line 7
    iput-wide p7, p0, Llq2/p$a$a;->e:J

    .line 8
    iput p9, p0, Llq2/p$a$a;->f:F

    return-void
.end method

.method public synthetic constructor <init>(JJFFJFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p10, 0x4

    const/high16 v1, 0x3f000000    # 0.5f

    if-eqz v0, :cond_0

    move v7, v1

    goto :goto_0

    :cond_0
    move/from16 v7, p5

    :goto_0
    and-int/lit8 v0, p10, 0x8

    if-eqz v0, :cond_1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p6

    :goto_1
    and-int/lit8 v0, p10, 0x10

    if-eqz v0, :cond_2

    const-wide v2, 0xff101518L

    .line 9
    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    move-wide v9, v2

    goto :goto_2

    :cond_2
    move-wide/from16 v9, p7

    :goto_2
    and-int/lit8 v0, p10, 0x20

    if-eqz v0, :cond_3

    move v11, v1

    goto :goto_3

    :cond_3
    move/from16 v11, p9

    :goto_3
    const/4 v12, 0x0

    move-object v2, p0

    move-wide v3, p1

    move-wide/from16 v5, p3

    .line 10
    invoke-direct/range {v2 .. v12}, Llq2/p$a$a;-><init>(JJFFJFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JJFFJFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Llq2/p$a$a;-><init>(JJFFJF)V

    return-void
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, Llq2/p$a$a;->e:J

    return-wide v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Llq2/p$a$a;->f:F

    return v0
.end method

.method public final d()J
    .locals 2

    iget-wide v0, p0, Llq2/p$a$a;->b:J

    return-wide v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Llq2/p$a$a;->d:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llq2/p$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llq2/p$a$a;

    iget-wide v3, p0, Llq2/p$a$a;->a:J

    iget-wide v5, p1, Llq2/p$a$a;->a:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llq2/p$a$a;->b:J

    iget-wide v5, p1, Llq2/p$a$a;->b:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llq2/p$a$a;->c:F

    iget v3, p1, Llq2/p$a$a;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llq2/p$a$a;->d:F

    iget v3, p1, Llq2/p$a$a;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Llq2/p$a$a;->e:J

    iget-wide v5, p1, Llq2/p$a$a;->e:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Llq2/p$a$a;->f:F

    iget p1, p1, Llq2/p$a$a;->f:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Llq2/p$a$a;->a:J

    return-wide v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Llq2/p$a$a;->c:F

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llq2/p$a$a;->a:J

    sget v2, Li2/x;->o:I

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llq2/p$a$a;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Llq2/p$a$a;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Llq2/p$a$a;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v2, p0, Llq2/p$a$a;->e:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Llq2/p$a$a;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Llq2/p$a$a;->a:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Llq2/p$a$a;->b:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Llq2/p$a$a;->c:F

    iget v3, p0, Llq2/p$a$a;->d:F

    iget-wide v4, p0, Llq2/p$a$a;->e:J

    invoke-static {v4, v5}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Llq2/p$a$a;->f:F

    const-string v6, ", end="

    const-string v7, ", startAlpha="

    const-string v8, "DiagonalFadeBottom(start="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endAlpha="

    const-string v6, ", bottomDark="

    invoke-static {v0, v2, v1, v3, v6}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomDarkStartFraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
