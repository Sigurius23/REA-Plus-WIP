.class public final Lk91/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk91/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0019B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lk91/a;",
        "",
        "Ly3/f;",
        "topStart",
        "topEnd",
        "bottomEnd",
        "bottomStart",
        "<init>",
        "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "Lt0/i;",
        "c",
        "()Lt0/i;",
        "Lk91/b;",
        "d",
        "()Lk91/b;",
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
        "getTopStart-D9Ej5fM",
        "()F",
        "b",
        "getTopEnd-D9Ej5fM",
        "e",
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


# static fields
.field public static final e:Lk91/a$a;

.field public static final f:I


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk91/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk91/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lk91/a;->e:Lk91/a$a;

    return-void
.end method

.method private constructor <init>(FFFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lk91/a;->a:F

    .line 4
    iput p2, p0, Lk91/a;->b:F

    .line 5
    iput p3, p0, Lk91/a;->c:F

    .line 6
    iput p4, p0, Lk91/a;->d:F

    return-void
.end method

.method public constructor <init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    int-to-float p1, v0

    :cond_0
    move v2, p1

    and-int/lit8 p1, p5, 0x2

    if-eqz p1, :cond_1

    int-to-float p2, v0

    :cond_1
    move v3, p2

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_2

    int-to-float p3, v0

    :cond_2
    move v4, p3

    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_3

    int-to-float p4, v0

    :cond_3
    move v5, p4

    const/4 v6, 0x0

    move-object v1, p0

    .line 7
    invoke-direct/range {v1 .. v6}, Lk91/a;-><init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lk91/a;-><init>(FFFF)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lk91/a;->c:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lk91/a;->d:F

    return v0
.end method

.method public final c()Lt0/i;
    .locals 4

    iget v0, p0, Lk91/a;->a:F

    iget v1, p0, Lk91/a;->b:F

    iget v2, p0, Lk91/a;->c:F

    iget v3, p0, Lk91/a;->d:F

    invoke-static {v0, v1, v2, v3}, Lt0/j;->f(FFFF)Lt0/i;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lk91/b;
    .locals 4

    new-instance v0, Lk91/b;

    invoke-virtual {p0}, Lk91/a;->c()Lt0/i;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lk91/b;-><init>(Lt0/i;Li2/s0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lk91/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lk91/a;

    iget v0, p0, Lk91/a;->a:F

    iget v1, p1, Lk91/a;->a:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lk91/a;->b:F

    iget v1, p1, Lk91/a;->b:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lk91/a;->c:F

    iget v1, p1, Lk91/a;->c:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Lk91/a;->d:F

    iget p1, p1, Lk91/a;->d:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lk91/a;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lk91/a;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lk91/a;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lk91/a;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lk91/a;->a:F

    invoke-static {v0}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lk91/a;->b:F

    invoke-static {v1}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lk91/a;->c:F

    invoke-static {v2}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lk91/a;->d:F

    invoke-static {v3}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v3

    const-string v4, ", topEnd="

    const-string v5, ", bottomEnd="

    const-string v6, "RoundedCorners(topStart="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bottomStart="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
