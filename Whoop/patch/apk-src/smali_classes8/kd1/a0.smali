.class public final Lkd1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/j3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001dR\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001d\u00a8\u0006$"
    }
    d2 = {
        "Lkd1/a0;",
        "Lb3/j3;",
        "viewConfiguration",
        "",
        "longPressTimeoutMillis",
        "doubleTapTimeoutMillis",
        "doubleTapMinTimeMillis",
        "",
        "touchSlop",
        "Ly3/h;",
        "minimumTouchTargetSize",
        "<init>",
        "(Lb3/j3;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Lb3/j3;",
        "b",
        "J",
        "c",
        "()J",
        "d",
        "e",
        "F",
        "g",
        "()F",
        "f",
        "design_release"
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
.field private final a:Lb3/j3;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:F

.field private final f:J


# direct methods
.method private constructor <init>(Lb3/j3;JJJFJ)V
    .locals 1

    const-string v0, "viewConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lkd1/a0;->a:Lb3/j3;

    .line 4
    iput-wide p2, p0, Lkd1/a0;->b:J

    .line 5
    iput-wide p4, p0, Lkd1/a0;->c:J

    .line 6
    iput-wide p6, p0, Lkd1/a0;->d:J

    .line 7
    iput p8, p0, Lkd1/a0;->e:F

    .line 8
    iput-wide p9, p0, Lkd1/a0;->f:J

    return-void
.end method

.method public synthetic constructor <init>(Lb3/j3;JJJFJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    and-int/lit8 v0, p11, 0x2

    if-eqz v0, :cond_0

    .line 9
    invoke-interface {p1}, Lb3/j3;->c()J

    move-result-wide v0

    move-wide v4, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p2

    :goto_0
    and-int/lit8 v0, p11, 0x4

    if-eqz v0, :cond_1

    .line 10
    invoke-interface {p1}, Lb3/j3;->a()J

    move-result-wide v0

    move-wide v6, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p4

    :goto_1
    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {p1}, Lb3/j3;->b()J

    move-result-wide v0

    move-wide v8, v0

    goto :goto_2

    :cond_2
    move-wide/from16 v8, p6

    :goto_2
    and-int/lit8 v0, p11, 0x10

    if-eqz v0, :cond_3

    .line 12
    invoke-interface {p1}, Lb3/j3;->g()F

    move-result v0

    move v10, v0

    goto :goto_3

    :cond_3
    move/from16 v10, p8

    :goto_3
    and-int/lit8 v0, p11, 0x20

    if-eqz v0, :cond_4

    .line 13
    invoke-interface {p1}, Lb3/j3;->e()J

    move-result-wide v0

    move-wide v11, v0

    goto :goto_4

    :cond_4
    move-wide/from16 v11, p9

    :goto_4
    const/4 v13, 0x0

    move-object v2, p0

    move-object v3, p1

    .line 14
    invoke-direct/range {v2 .. v13}, Lkd1/a0;-><init>(Lb3/j3;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lb3/j3;JJJFJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lkd1/a0;-><init>(Lb3/j3;JJJFJ)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lkd1/a0;->c:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lkd1/a0;->d:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lkd1/a0;->b:J

    return-wide v0
.end method

.method public bridge d()F
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lkd1/a0;->f:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lkd1/a0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lkd1/a0;

    iget-object v0, p0, Lkd1/a0;->a:Lb3/j3;

    iget-object v1, p1, Lkd1/a0;->a:Lb3/j3;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lkd1/a0;->b:J

    iget-wide v2, p1, Lkd1/a0;->b:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-wide v0, p0, Lkd1/a0;->c:J

    iget-wide v2, p1, Lkd1/a0;->c:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    iget-wide v0, p0, Lkd1/a0;->d:J

    iget-wide v2, p1, Lkd1/a0;->d:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Lkd1/a0;->e:F

    iget v1, p1, Lkd1/a0;->e:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    iget-wide v0, p0, Lkd1/a0;->f:J

    iget-wide v2, p1, Lkd1/a0;->f:J

    invoke-static {v0, v1, v2, v3}, Ly3/h;->a(JJ)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public bridge f()F
    .locals 1

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lkd1/a0;->e:F

    return v0
.end method

.method public bridge h()F
    .locals 1

    const/high16 v0, 0x41800000    # 16.0f

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lkd1/a0;->a:Lb3/j3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lkd1/a0;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lkd1/a0;->c:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lkd1/a0;->d:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lkd1/a0;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-wide v1, p0, Lkd1/a0;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lkd1/a0;->a:Lb3/j3;

    iget-wide v1, p0, Lkd1/a0;->b:J

    iget-wide v3, p0, Lkd1/a0;->c:J

    iget-wide v5, p0, Lkd1/a0;->d:J

    iget v7, p0, Lkd1/a0;->e:F

    iget-wide v8, p0, Lkd1/a0;->f:J

    invoke-static {v8, v9}, Ly3/h;->d(J)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ViewConfigurationDelegate(viewConfiguration="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", longPressTimeoutMillis="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", doubleTapTimeoutMillis="

    const-string v1, ", doubleTapMinTimeMillis="

    invoke-static {v9, v0, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", touchSlop="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", minimumTouchTargetSize="

    const-string v1, ")"

    invoke-static {v9, v0, v8, v1}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
