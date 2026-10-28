.class public final Llq2/p$a$d;
.super Llq2/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llq2/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Llq2/p$a$d;",
        "Llq2/p$a;",
        "Li2/x;",
        "color",
        "",
        "alpha",
        "radiusFraction",
        "vignetteStrength",
        "circleTopFeatherFraction",
        "<init>",
        "(JFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "c",
        "()J",
        "b",
        "F",
        "()F",
        "d",
        "e",
        "getCircleTopFeatherFraction",
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

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F


# direct methods
.method private constructor <init>(JFFFF)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Llq2/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-wide p1, p0, Llq2/p$a$d;->a:J

    .line 4
    iput p3, p0, Llq2/p$a$d;->b:F

    .line 5
    iput p4, p0, Llq2/p$a$d;->c:F

    .line 6
    iput p5, p0, Llq2/p$a$d;->d:F

    .line 7
    iput p6, p0, Llq2/p$a$d;->e:F

    return-void
.end method

.method public synthetic constructor <init>(JFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_0

    const p3, 0x3ecccccd    # 0.4f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x4

    if-eqz p3, :cond_1

    const p4, 0x3f933333    # 1.15f

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_2

    const p5, 0x3ee66666    # 0.45f

    :cond_2
    move v5, p5

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_3

    const p6, 0x3e23d70a    # 0.16f

    :cond_3
    move v6, p6

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    .line 8
    invoke-direct/range {v0 .. v7}, Llq2/p$a$d;-><init>(JFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(JFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Llq2/p$a$d;-><init>(JFFFF)V

    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    iget v0, p0, Llq2/p$a$d;->b:F

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Llq2/p$a$d;->a:J

    return-wide v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Llq2/p$a$d;->c:F

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Llq2/p$a$d;->d:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llq2/p$a$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llq2/p$a$d;

    iget-wide v3, p0, Llq2/p$a$d;->a:J

    iget-wide v5, p1, Llq2/p$a$d;->a:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llq2/p$a$d;->b:F

    iget v3, p1, Llq2/p$a$d;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llq2/p$a$d;->c:F

    iget v3, p1, Llq2/p$a$d;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llq2/p$a$d;->d:F

    iget v3, p1, Llq2/p$a$d;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Llq2/p$a$d;->e:F

    iget p1, p1, Llq2/p$a$d;->e:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Llq2/p$a$d;->a:J

    sget v2, Li2/x;->o:I

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llq2/p$a$d;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Llq2/p$a$d;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Llq2/p$a$d;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Llq2/p$a$d;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-wide v0, p0, Llq2/p$a$d;->a:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Llq2/p$a$d;->b:F

    iget v2, p0, Llq2/p$a$d;->c:F

    iget v3, p0, Llq2/p$a$d;->d:F

    iget v4, p0, Llq2/p$a$d;->e:F

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SingleGlowBottom(color="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", alpha="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", radiusFraction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", vignetteStrength="

    const-string v1, ", circleTopFeatherFraction="

    invoke-static {v5, v2, v0, v3, v1}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
