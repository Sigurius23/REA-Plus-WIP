.class public final Lh61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u0011\u0010\u001f\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001eR\u0011\u0010 \u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u001eR\u0011\u0010!\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u001eR\u0011\u0010#\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010\u001eR\u0011\u0010%\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\u001e\u00a8\u0006&"
    }
    d2 = {
        "Lh61/a;",
        "",
        "Lh71/k;",
        "state",
        "",
        "axisScale",
        "<init>",
        "(Lh71/k;F)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lh71/k;",
        "getState",
        "()Lh71/k;",
        "b",
        "F",
        "getAxisScale",
        "()F",
        "c",
        "f",
        "startVerticalAxisSize",
        "Lh2/c;",
        "()Lh2/c;",
        "scaledInsets",
        "bottomHorizontalAxisRect",
        "contentRect",
        "e",
        "startVerticalAxisRect",
        "d",
        "scrubberRect",
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
.field private final a:Lh71/k;

.field private final b:F

.field private final c:F


# direct methods
.method public constructor <init>(Lh71/k;F)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh61/a;->a:Lh71/k;

    .line 3
    iput p2, p0, Lh61/a;->b:F

    .line 4
    invoke-virtual {p1}, Lh71/k;->g()Lg61/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg61/b;->h()F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lh61/a;->c:F

    return-void
.end method

.method public synthetic constructor <init>(Lh71/k;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/high16 p2, 0x3f800000    # 1.0f

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lh61/a;-><init>(Lh71/k;F)V

    return-void
.end method


# virtual methods
.method public final a()Lh2/c;
    .locals 5

    new-instance v0, Lh2/c;

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->a:F

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v2

    iget v2, v2, Lh2/c;->c:F

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v2, v3, v2

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v4

    iget v4, v4, Lh2/c;->d:F

    sub-float/2addr v3, v4

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v1, v4, v2, v3}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public final b()Lh2/c;
    .locals 6

    new-instance v0, Lh2/c;

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->a:F

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v2

    iget v2, v2, Lh2/c;->b:F

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->c:F

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v4, v3

    invoke-virtual {p0}, Lh61/a;->a()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->d:F

    const v5, 0x3dcccccd    # 0.1f

    sub-float/2addr v3, v5

    invoke-direct {v0, v1, v2, v4, v3}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public final c()Lh2/c;
    .locals 2

    iget-object v0, p0, Lh61/a;->a:Lh71/k;

    invoke-virtual {v0}, Lh71/k;->e()Lh2/c;

    move-result-object v0

    iget v1, p0, Lh61/a;->b:F

    invoke-static {v0, v1}, Ll91/a;->a(Lh2/c;F)Lh2/c;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lh2/c;
    .locals 5

    new-instance v0, Lh2/c;

    invoke-virtual {p0}, Lh61/a;->b()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->a:F

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v2

    iget v2, v2, Lh2/c;->b:F

    invoke-virtual {p0}, Lh61/a;->b()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->c:F

    invoke-virtual {p0}, Lh61/a;->b()Lh2/c;

    move-result-object v4

    iget v4, v4, Lh2/c;->d:F

    invoke-direct {v0, v1, v2, v3, v4}, Lh2/c;-><init>(FFFF)V

    return-object v0
.end method

.method public final e()Lh2/c;
    .locals 5

    iget-object v0, p0, Lh61/a;->a:Lh71/k;

    invoke-virtual {v0}, Lh71/k;->g()Lg61/b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lh2/c;

    invoke-virtual {p0}, Lh61/a;->c()Lh2/c;

    move-result-object v1

    iget v1, v1, Lh2/c;->b:F

    iget v2, p0, Lh61/a;->c:F

    invoke-virtual {p0}, Lh61/a;->b()Lh2/c;

    move-result-object v3

    iget v3, v3, Lh2/c;->d:F

    const/4 v4, 0x0

    invoke-direct {v0, v4, v1, v2, v3}, Lh2/c;-><init>(FFFF)V

    return-object v0

    :cond_0
    sget-object v0, Lh2/c;->e:Lh2/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh61/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh61/a;

    iget-object v1, p0, Lh61/a;->a:Lh71/k;

    iget-object v3, p1, Lh61/a;->a:Lh71/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lh61/a;->b:F

    iget p1, p1, Lh61/a;->b:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lh61/a;->c:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lh61/a;->a:Lh71/k;

    invoke-virtual {v0}, Lh71/k;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lh61/a;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lh61/a;->a:Lh71/k;

    iget v1, p0, Lh61/a;->b:F

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ScrollableGraphPlaneGeometry(state="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", axisScale="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
