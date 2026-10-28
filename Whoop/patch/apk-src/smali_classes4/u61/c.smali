.class public final Lu61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lu61/c;",
        "",
        "Ly81/e;",
        "color",
        "Ly3/f;",
        "size",
        "Lu61/b;",
        "shape",
        "<init>",
        "(Ly81/e;FLu61/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "a",
        "(Ly81/e;FLu61/b;)Lu61/c;",
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
        "Ly81/e;",
        "b",
        "()Ly81/e;",
        "F",
        "d",
        "()F",
        "c",
        "Lu61/b;",
        "()Lu61/b;",
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
.field private final a:Ly81/e;

.field private final b:F

.field private final c:Lu61/b;


# direct methods
.method private constructor <init>(Ly81/e;FLu61/b;)V
    .locals 1

    const-string v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lu61/c;->a:Ly81/e;

    .line 4
    iput p2, p0, Lu61/c;->b:F

    .line 5
    iput-object p3, p0, Lu61/c;->c:Lu61/b;

    return-void
.end method

.method public constructor <init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/16 p2, 0xa

    int-to-float p2, p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 6
    sget-object p3, Lu61/b;->CIRCLE:Lu61/b;

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, v0}, Lu61/c;-><init>(Ly81/e;FLu61/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly81/e;FLu61/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lu61/c;-><init>(Ly81/e;FLu61/b;)V

    return-void
.end method


# virtual methods
.method public final a(Ly81/e;FLu61/b;)Lu61/c;
    .locals 2

    const-string v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu61/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lu61/c;-><init>(Ly81/e;FLu61/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final b()Ly81/e;
    .locals 1

    iget-object v0, p0, Lu61/c;->a:Ly81/e;

    return-object v0
.end method

.method public final c()Lu61/b;
    .locals 1

    iget-object v0, p0, Lu61/c;->c:Lu61/b;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lu61/c;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lu61/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lu61/c;

    iget-object v0, p0, Lu61/c;->a:Ly81/e;

    iget-object v1, p1, Lu61/c;->a:Ly81/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lu61/c;->b:F

    iget v1, p1, Lu61/c;->b:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lu61/c;->c:Lu61/b;

    iget-object p1, p1, Lu61/c;->c:Lu61/b;

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

    iget-object v0, p0, Lu61/c;->a:Ly81/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lu61/c;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lu61/c;->c:Lu61/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lu61/c;->a:Ly81/e;

    iget v1, p0, Lu61/c;->b:F

    invoke-static {v1}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lu61/c;->c:Lu61/b;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PointCircleState(color="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", size="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shape="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
