.class public final Lxq2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0018\u001a\u0004\u0008\u0013\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lxq2/x;",
        "",
        "Ly3/f;",
        "width",
        "height",
        "Ly81/f;",
        "color",
        "<init>",
        "(FFLy81/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "F",
        "c",
        "()F",
        "b",
        "Ly81/f;",
        "()Ly81/f;",
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
.field private final a:F

.field private final b:F

.field private final c:Ly81/f;


# direct methods
.method private constructor <init>(FFLy81/f;)V
    .locals 1

    const-string v0, "color"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lxq2/x;->a:F

    .line 4
    iput p2, p0, Lxq2/x;->b:F

    .line 5
    iput-object p3, p0, Lxq2/x;->c:Ly81/f;

    return-void
.end method

.method public synthetic constructor <init>(FFLy81/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxq2/x;-><init>(FFLy81/f;)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Lxq2/x;->c:Ly81/f;

    return-object v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lxq2/x;->b:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lxq2/x;->a:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lxq2/x;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lxq2/x;

    iget v0, p0, Lxq2/x;->a:F

    iget v1, p1, Lxq2/x;->a:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lxq2/x;->b:F

    iget v1, p1, Lxq2/x;->b:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lxq2/x;->c:Ly81/f;

    iget-object p1, p1, Lxq2/x;->c:Ly81/f;

    if-eq v0, p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lxq2/x;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lxq2/x;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lxq2/x;->c:Ly81/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lxq2/x;->a:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lxq2/x;->b:F

    invoke-static {v1}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lxq2/x;->c:Ly81/f;

    const-string v3, ", height="

    const-string v4, ", color="

    const-string v5, "TickSpec(width="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Ljh3/c;->i(Ljava/lang/StringBuilder;Ly81/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
