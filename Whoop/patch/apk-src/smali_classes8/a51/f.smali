.class public final La51/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ2\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 \u00a8\u0006!"
    }
    d2 = {
        "La51/f;",
        "",
        "Lkotlin/time/Duration;",
        "emittingTime",
        "",
        "particlesPerSecond",
        "La51/d;",
        "animations",
        "<init>",
        "(Lkotlin/time/Duration;FLa51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "f",
        "()F",
        "a",
        "(Lkotlin/time/Duration;FLa51/d;)La51/f;",
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
        "Lkotlin/time/Duration;",
        "d",
        "()Lkotlin/time/Duration;",
        "b",
        "F",
        "e",
        "c",
        "La51/d;",
        "()La51/d;",
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
.field private final a:Lkotlin/time/Duration;

.field private final b:F

.field private final c:La51/d;


# direct methods
.method private constructor <init>(Lkotlin/time/Duration;FLa51/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La51/f;->a:Lkotlin/time/Duration;

    .line 4
    iput p2, p0, La51/f;->b:F

    .line 5
    iput-object p3, p0, La51/f;->c:La51/d;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/time/Duration;FLa51/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    const/4 p5, 0x0

    if-eqz p4, :cond_0

    move-object p3, p5

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p5}, La51/f;-><init>(Lkotlin/time/Duration;FLa51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/time/Duration;FLa51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, La51/f;-><init>(Lkotlin/time/Duration;FLa51/d;)V

    return-void
.end method

.method public static synthetic b(La51/f;Lkotlin/time/Duration;FLa51/d;ILjava/lang/Object;)La51/f;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, La51/f;->a:Lkotlin/time/Duration;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, La51/f;->b:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, La51/f;->c:La51/d;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, La51/f;->a(Lkotlin/time/Duration;FLa51/d;)La51/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lkotlin/time/Duration;FLa51/d;)La51/f;
    .locals 2

    new-instance v0, La51/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, La51/f;-><init>(Lkotlin/time/Duration;FLa51/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c()La51/d;
    .locals 1

    iget-object v0, p0, La51/f;->c:La51/d;

    return-object v0
.end method

.method public final d()Lkotlin/time/Duration;
    .locals 1

    iget-object v0, p0, La51/f;->a:Lkotlin/time/Duration;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, La51/f;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La51/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La51/f;

    iget-object v1, p0, La51/f;->a:Lkotlin/time/Duration;

    iget-object v3, p1, La51/f;->a:Lkotlin/time/Duration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, La51/f;->b:F

    iget v3, p1, La51/f;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, La51/f;->c:La51/d;

    iget-object p1, p1, La51/f;->c:La51/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()F
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, La51/f;->b:F

    div-float/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, La51/f;->a:Lkotlin/time/Duration;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget v3, p0, La51/f;->b:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, La51/f;->c:La51/d;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, La51/d;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, La51/f;->a:Lkotlin/time/Duration;

    iget v1, p0, La51/f;->b:F

    iget-object v2, p0, La51/f;->c:La51/d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EmitterConfig(emittingTime="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", particlesPerSecond="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", animations="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
