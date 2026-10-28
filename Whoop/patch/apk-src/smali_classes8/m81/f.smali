.class public final Lm81/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0017\u001a\u0004\u0008\u001c\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0017\u001a\u0004\u0008\u001a\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lm81/f;",
        "",
        "Ly81/e;",
        "contentColor",
        "backgroundColor",
        "iconColor",
        "borderColor",
        "Ly3/f;",
        "borderWidth",
        "cornerRadius",
        "<init>",
        "(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "Ly81/e;",
        "d",
        "()Ly81/e;",
        "b",
        "c",
        "f",
        "e",
        "F",
        "()F",
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
.field public static final g:I


# instance fields
.field private final a:Ly81/e;

.field private final b:Ly81/e;

.field private final c:Ly81/e;

.field private final d:Ly81/e;

.field private final e:F

.field private final f:F


# direct methods
.method private constructor <init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FF)V
    .locals 1

    const-string v0, "contentColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundColor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lm81/f;->a:Ly81/e;

    .line 4
    iput-object p2, p0, Lm81/f;->b:Ly81/e;

    .line 5
    iput-object p3, p0, Lm81/f;->c:Ly81/e;

    .line 6
    iput-object p4, p0, Lm81/f;->d:Ly81/e;

    .line 7
    iput p5, p0, Lm81/f;->e:F

    .line 8
    iput p6, p0, Lm81/f;->f:F

    return-void
.end method

.method public constructor <init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_0

    move-object v4, p1

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v5, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p3, 0x1

    int-to-float p5, p3

    :cond_2
    move v6, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    const/4 p3, 0x3

    int-to-float p3, p3

    const/4 p4, 0x4

    int-to-float p4, p4

    mul-float p6, p3, p4

    :cond_3
    move v7, p6

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 9
    invoke-direct/range {v1 .. v8}, Lm81/f;-><init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lm81/f;-><init>(Ly81/e;Ly81/e;Ly81/e;Ly81/e;FF)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/e;
    .locals 1

    iget-object v0, p0, Lm81/f;->b:Ly81/e;

    return-object v0
.end method

.method public final b()Ly81/e;
    .locals 1

    iget-object v0, p0, Lm81/f;->d:Ly81/e;

    return-object v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lm81/f;->e:F

    return v0
.end method

.method public final d()Ly81/e;
    .locals 1

    iget-object v0, p0, Lm81/f;->a:Ly81/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lm81/f;->f:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lm81/f;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lm81/f;

    iget-object v0, p0, Lm81/f;->a:Ly81/e;

    iget-object v1, p1, Lm81/f;->a:Ly81/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lm81/f;->b:Ly81/e;

    iget-object v1, p1, Lm81/f;->b:Ly81/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lm81/f;->c:Ly81/e;

    iget-object v1, p1, Lm81/f;->c:Ly81/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lm81/f;->d:Ly81/e;

    iget-object v1, p1, Lm81/f;->d:Ly81/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Lm81/f;->e:F

    iget v1, p1, Lm81/f;->e:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget v0, p0, Lm81/f;->f:F

    iget p1, p1, Lm81/f;->f:F

    invoke-static {v0, p1}, Ly3/f;->b(FF)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Ly81/e;
    .locals 1

    iget-object v0, p0, Lm81/f;->c:Ly81/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lm81/f;->a:Ly81/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm81/f;->b:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-object v2, p0, Lm81/f;->c:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-object v2, p0, Lm81/f;->d:Ly81/e;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm81/f;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lm81/f;->f:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lm81/f;->a:Ly81/e;

    iget-object v1, p0, Lm81/f;->b:Ly81/e;

    iget-object v2, p0, Lm81/f;->c:Ly81/e;

    iget-object v3, p0, Lm81/f;->d:Ly81/e;

    iget v4, p0, Lm81/f;->e:F

    invoke-static {v4}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lm81/f;->f:F

    invoke-static {v5}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SelectorButtonStyle(contentColor="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", iconColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", borderColor="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", borderWidth="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cornerRadius="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
