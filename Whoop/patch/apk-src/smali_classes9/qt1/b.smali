.class public final Lqt1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010\u0014R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010 \u001a\u0004\u0008!\u0010\u0014R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010$R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010%\u001a\u0004\u0008\u001b\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lqt1/b;",
        "",
        "Ly81/f;",
        "color",
        "",
        "strokeWidth",
        "",
        "fadePercent",
        "fadeStartIndex",
        "",
        "Lqt1/a;",
        "graphPoints",
        "",
        "drawCircles",
        "<init>",
        "(Ly81/f;FII[Lqt1/a;Z)V",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "a",
        "Ly81/f;",
        "()Ly81/f;",
        "b",
        "F",
        "f",
        "()F",
        "c",
        "I",
        "d",
        "e",
        "[Lqt1/a;",
        "()[Lqt1/a;",
        "Z",
        "()Z",
        "labrador_release"
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
.field private final a:Ly81/f;

.field private final b:F

.field private final c:I

.field private final d:I

.field private final e:[Lqt1/a;

.field private final f:Z


# direct methods
.method public constructor <init>(Ly81/f;FII[Lqt1/a;Z)V
    .locals 1

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphPoints"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqt1/b;->a:Ly81/f;

    .line 3
    iput p2, p0, Lqt1/b;->b:F

    .line 4
    iput p3, p0, Lqt1/b;->c:I

    .line 5
    iput p4, p0, Lqt1/b;->d:I

    .line 6
    iput-object p5, p0, Lqt1/b;->e:[Lqt1/a;

    .line 7
    iput-boolean p6, p0, Lqt1/b;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Ly81/f;FII[Lqt1/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_1

    move p7, p6

    move-object p6, p5

    move p5, v0

    :goto_0
    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move p7, p6

    move-object p6, p5

    move p5, p4

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p7}, Lqt1/b;-><init>(Ly81/f;FII[Lqt1/a;Z)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Lqt1/b;->a:Ly81/f;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lqt1/b;->f:Z

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lqt1/b;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lqt1/b;->d:I

    return v0
.end method

.method public final e()[Lqt1/a;
    .locals 1

    iget-object v0, p0, Lqt1/b;->e:[Lqt1/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
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
    const-class v2, Lqt1/b;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.whoop.labrador.feature.reading.domain.models.LabradorReadingLineGraph"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lqt1/b;

    iget-object v1, p0, Lqt1/b;->a:Ly81/f;

    iget-object v3, p1, Lqt1/b;->a:Ly81/f;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lqt1/b;->b:F

    iget v3, p1, Lqt1/b;->b:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_8

    iget v1, p0, Lqt1/b;->c:I

    iget v3, p1, Lqt1/b;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lqt1/b;->d:I

    iget v3, p1, Lqt1/b;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lqt1/b;->e:[Lqt1/a;

    iget-object v3, p1, Lqt1/b;->e:[Lqt1/a;

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lqt1/b;->f:Z

    iget-boolean p1, p1, Lqt1/b;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0

    :cond_8
    return v2
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lqt1/b;->b:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqt1/b;->a:Ly81/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lqt1/b;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lqt1/b;->c:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lqt1/b;->d:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lqt1/b;->e:[Lqt1/a;

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lqt1/b;->f:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lqt1/b;->a:Ly81/f;

    iget v1, p0, Lqt1/b;->b:F

    iget v2, p0, Lqt1/b;->c:I

    iget v3, p0, Lqt1/b;->d:I

    iget-object v4, p0, Lqt1/b;->e:[Lqt1/a;

    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-boolean v5, p0, Lqt1/b;->f:Z

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "LabradorReadingLineGraph(color="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strokeWidth="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", fadePercent="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fadeStartIndex="

    const-string v1, ", graphPoints="

    invoke-static {v6, v2, v0, v3, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v0, ", drawCircles="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
