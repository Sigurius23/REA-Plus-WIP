.class public final La51/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "La51/c;",
        "",
        "",
        "baseValue",
        "Li93/f;",
        "duration",
        "Ld51/d;",
        "multiplierOvertime",
        "Ld0/z;",
        "easing",
        "<init>",
        "(FLi93/f;Ld51/d;Ld0/z;)V",
        "emitterAge",
        "a",
        "(F)Ljava/lang/Float;",
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
        "F",
        "getBaseValue",
        "()F",
        "b",
        "Li93/f;",
        "getDuration",
        "()Li93/f;",
        "c",
        "Ld51/d;",
        "getMultiplierOvertime",
        "()Ld51/d;",
        "d",
        "Ld0/z;",
        "getEasing",
        "()Ld0/z;",
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
.field private final a:F

.field private final b:Li93/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li93/f;"
        }
    .end annotation
.end field

.field private final c:Ld51/d;

.field private final d:Ld0/z;


# direct methods
.method public constructor <init>(FLi93/f;Ld51/d;Ld0/z;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Li93/f;",
            "Ld51/d;",
            "Ld0/z;",
            ")V"
        }
    .end annotation

    const-string v0, "duration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "multiplierOvertime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "easing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, La51/c;->a:F

    .line 3
    iput-object p2, p0, La51/c;->b:Li93/f;

    .line 4
    iput-object p3, p0, La51/c;->c:Ld51/d;

    .line 5
    iput-object p4, p0, La51/c;->d:Ld0/z;

    return-void
.end method

.method public constructor <init>(FLi93/f;Ld51/d;Ld0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    new-instance v0, Ld51/d;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Ld51/d;-><init>(FLjava/util/List;FLd0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    sget-object p4, Ld0/b0;->c:Lb23/h;

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, La51/c;-><init>(FLi93/f;Ld51/d;Ld0/z;)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 2

    iget-object v0, p0, La51/c;->b:Li93/f;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Li93/f;->c(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La51/c;->b:Li93/f;

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    sub-float/2addr p1, v1

    invoke-static {v0, p1}, Ld51/e;->a(Li93/f;F)F

    move-result p1

    iget-object v0, p0, La51/c;->d:Ld0/z;

    invoke-interface {v0, p1}, Ld0/z;->i(F)F

    move-result p1

    iget v0, p0, La51/c;->a:F

    iget-object v1, p0, La51/c;->c:Ld51/d;

    invoke-virtual {v1, p1}, Ld51/d;->d(F)F

    move-result p1

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La51/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La51/c;

    iget v1, p0, La51/c;->a:F

    iget v3, p1, La51/c;->a:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, La51/c;->b:Li93/f;

    iget-object v3, p1, La51/c;->b:Li93/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, La51/c;->c:Ld51/d;

    iget-object v3, p1, La51/c;->c:Ld51/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, La51/c;->d:Ld0/z;

    iget-object p1, p1, La51/c;->d:Ld0/z;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, La51/c;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La51/c;->b:Li93/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, La51/c;->c:Ld51/d;

    invoke-virtual {v0}, Ld51/d;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, La51/c;->d:Ld0/z;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, La51/c;->a:F

    iget-object v1, p0, La51/c;->b:Li93/f;

    iget-object v2, p0, La51/c;->c:Ld51/d;

    iget-object v3, p0, La51/c;->d:Ld0/z;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "EmitterAnimationAttribute(baseValue="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", multiplierOvertime="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", easing="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
