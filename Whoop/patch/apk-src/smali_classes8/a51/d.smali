.class public final La51/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "La51/d;",
        "",
        "La51/g;",
        "magneticAnimation",
        "La51/c;",
        "stickyRadiusAnimation",
        "<init>",
        "(La51/g;La51/c;)V",
        "",
        "emitterAge",
        "Lb51/a;",
        "drawArea",
        "La51/e;",
        "a",
        "(FLb51/a;)La51/e;",
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
        "La51/g;",
        "getMagneticAnimation",
        "()La51/g;",
        "b",
        "La51/c;",
        "getStickyRadiusAnimation",
        "()La51/c;",
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
.field private final a:La51/g;

.field private final b:La51/c;


# direct methods
.method public constructor <init>(La51/g;La51/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La51/d;->a:La51/g;

    iput-object p2, p0, La51/d;->b:La51/c;

    return-void
.end method


# virtual methods
.method public final a(FLb51/a;)La51/e;
    .locals 4

    const-string v0, "drawArea"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La51/d;->a:La51/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La51/g;->b()La51/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La51/c;->a(F)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v2, p0, La51/d;->a:La51/g;

    invoke-virtual {v2}, La51/g;->a()Lz41/k;

    move-result-object v2

    invoke-static {v2, p2}, Lz41/h;->a(Lz41/k;Lb51/a;)Lz41/k$a;

    move-result-object p2

    new-instance v2, Lb51/d;

    invoke-virtual {p2}, Lz41/k$a;->a()F

    move-result v3

    invoke-virtual {p2}, Lz41/k$a;->b()F

    move-result p2

    invoke-direct {v2, v3, p2}, Lb51/d;-><init>(FF)V

    new-instance p2, Ll83/k;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p2, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    new-instance v0, La51/e;

    iget-object v2, p0, La51/d;->b:La51/c;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, La51/c;->a(F)Ljava/lang/Float;

    move-result-object v1

    :cond_1
    invoke-direct {v0, p2, v1}, La51/e;-><init>(Ll83/k;Ljava/lang/Float;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La51/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La51/d;

    iget-object v1, p0, La51/d;->a:La51/g;

    iget-object v3, p1, La51/d;->a:La51/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, La51/d;->b:La51/c;

    iget-object p1, p1, La51/d;->b:La51/c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, La51/d;->a:La51/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, La51/g;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, La51/d;->b:La51/c;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, La51/c;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, La51/d;->a:La51/g;

    iget-object v1, p0, La51/d;->b:La51/c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "EmitterAnimationConfig(magneticAnimation="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", stickyRadiusAnimation="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
