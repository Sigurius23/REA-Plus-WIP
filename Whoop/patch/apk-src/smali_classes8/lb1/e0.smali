.class final Llb1/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0082\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001f\u001a\u0004\u0008\u001e\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Llb1/e0;",
        "",
        "Ly81/f;",
        "fillColor",
        "trackColor",
        "Lb91/a;",
        "labelTextStyle",
        "labelTextColor",
        "Ly3/f;",
        "ringDiameter",
        "<init>",
        "(Ly81/f;Ly81/f;Lb91/a;Ly81/f;FLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Ly81/f;",
        "()Ly81/f;",
        "b",
        "e",
        "c",
        "Lb91/a;",
        "()Lb91/a;",
        "d",
        "F",
        "()F",
        "design-models_release"
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

.field private final b:Ly81/f;

.field private final c:Lb91/a;

.field private final d:Ly81/f;

.field private final e:F


# direct methods
.method private constructor <init>(Ly81/f;Ly81/f;Lb91/a;Ly81/f;F)V
    .locals 1

    const-string v0, "fillColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelTextStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelTextColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llb1/e0;->a:Ly81/f;

    .line 4
    iput-object p2, p0, Llb1/e0;->b:Ly81/f;

    .line 5
    iput-object p3, p0, Llb1/e0;->c:Lb91/a;

    .line 6
    iput-object p4, p0, Llb1/e0;->d:Ly81/f;

    .line 7
    iput p5, p0, Llb1/e0;->e:F

    return-void
.end method

.method public synthetic constructor <init>(Ly81/f;Ly81/f;Lb91/a;Ly81/f;FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Llb1/e0;-><init>(Ly81/f;Ly81/f;Lb91/a;Ly81/f;F)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/e0;->a:Ly81/f;

    return-object v0
.end method

.method public final b()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/e0;->d:Ly81/f;

    return-object v0
.end method

.method public final c()Lb91/a;
    .locals 1

    iget-object v0, p0, Llb1/e0;->c:Lb91/a;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Llb1/e0;->e:F

    return v0
.end method

.method public final e()Ly81/f;
    .locals 1

    iget-object v0, p0, Llb1/e0;->b:Ly81/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Llb1/e0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Llb1/e0;

    iget-object v0, p0, Llb1/e0;->a:Ly81/f;

    iget-object v1, p1, Llb1/e0;->a:Ly81/f;

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Llb1/e0;->b:Ly81/f;

    iget-object v1, p1, Llb1/e0;->b:Ly81/f;

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Llb1/e0;->c:Lb91/a;

    iget-object v1, p1, Llb1/e0;->c:Lb91/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Llb1/e0;->d:Ly81/f;

    iget-object v1, p1, Llb1/e0;->d:Ly81/f;

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Llb1/e0;->e:F

    iget p1, p1, Llb1/e0;->e:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llb1/e0;->a:Ly81/f;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llb1/e0;->b:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Llb1/e0;->c:Lb91/a;

    invoke-static {v2, v0, v1}, Ldc/b;->c(Lb91/a;II)I

    move-result v0

    iget-object v2, p0, Llb1/e0;->d:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget v1, p0, Llb1/e0;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Llb1/e0;->a:Ly81/f;

    iget-object v1, p0, Llb1/e0;->b:Ly81/f;

    iget-object v2, p0, Llb1/e0;->c:Lb91/a;

    iget-object v3, p0, Llb1/e0;->d:Ly81/f;

    iget v4, p0, Llb1/e0;->e:F

    invoke-static {v4}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CircularProgressAppearance(fillColor="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", trackColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labelTextStyle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labelTextColor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ringDiameter="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
