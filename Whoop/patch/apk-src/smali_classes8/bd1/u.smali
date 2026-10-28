.class public final Lbd1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001a\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lbd1/u;",
        "Lm91/u;",
        "Lkd1/h;",
        "Lf0/t;",
        "borderStrokeDescription",
        "Li2/z0;",
        "shadowDescription",
        "",
        "description",
        "Ly3/f;",
        "cornerRadius",
        "<init>",
        "(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Lkd1/h;",
        "()Lkd1/h;",
        "b",
        "e",
        "c",
        "Ljava/lang/String;",
        "d",
        "Ly3/f;",
        "()Ly3/f;",
        "design-showcase_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:I


# instance fields
.field private final a:Lkd1/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkd1/h<",
            "Lf0/t;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lkd1/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkd1/h<",
            "Li2/z0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Ly3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lkd1/h;->d:I

    sput v0, Lbd1/u;->e:I

    return-void
.end method

.method private constructor <init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/h<",
            "Lf0/t;",
            ">;",
            "Lkd1/h<",
            "Li2/z0;",
            ">;",
            "Ljava/lang/String;",
            "Ly3/f;",
            ")V"
        }
    .end annotation

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbd1/u;->a:Lkd1/h;

    .line 4
    iput-object p2, p0, Lbd1/u;->b:Lkd1/h;

    .line 5
    iput-object p3, p0, Lbd1/u;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lbd1/u;->d:Ly3/f;

    return-void
.end method

.method public synthetic constructor <init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    .line 7
    const-string p3, ""

    :cond_2
    move-object v4, p3

    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    move-object v5, v0

    goto :goto_2

    :cond_3
    move-object v5, p4

    :goto_2
    const/4 v6, 0x0

    move-object v1, p0

    .line 8
    invoke-direct/range {v1 .. v6}, Lbd1/u;-><init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lbd1/u;-><init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;)V

    return-void
.end method


# virtual methods
.method public final a()Lkd1/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkd1/h<",
            "Lf0/t;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbd1/u;->a:Lkd1/h;

    return-object v0
.end method

.method public final b()Ly3/f;
    .locals 1

    iget-object v0, p0, Lbd1/u;->d:Ly3/f;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbd1/u;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lkd1/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkd1/h<",
            "Li2/z0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbd1/u;->b:Lkd1/h;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbd1/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbd1/u;

    iget-object v1, p0, Lbd1/u;->a:Lkd1/h;

    iget-object v3, p1, Lbd1/u;->a:Lkd1/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lbd1/u;->b:Lkd1/h;

    iget-object v3, p1, Lbd1/u;->b:Lkd1/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lbd1/u;->c:Ljava/lang/String;

    iget-object v3, p1, Lbd1/u;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lbd1/u;->d:Ly3/f;

    iget-object p1, p1, Lbd1/u;->d:Ly3/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lbd1/u;->a:Lkd1/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lkd1/h;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lbd1/u;->b:Lkd1/h;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lkd1/h;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lbd1/u;->c:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lbd1/u;->d:Ly3/f;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    iget v1, v2, Ly3/f;->w:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lbd1/u;->a:Lkd1/h;

    iget-object v1, p0, Lbd1/u;->b:Lkd1/h;

    iget-object v2, p0, Lbd1/u;->c:Ljava/lang/String;

    iget-object v3, p0, Lbd1/u;->d:Ly3/f;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "GalleryStyleSwatchState(borderStrokeDescription="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shadowDescription="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cornerRadius="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
