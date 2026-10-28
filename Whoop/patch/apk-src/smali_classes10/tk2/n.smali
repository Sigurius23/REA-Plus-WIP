.class public final Ltk2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0018\u001a\u0004\u0008\u001a\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001c\u001a\u0004\u0008\u001f\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u0013R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010#\u001a\u0004\u0008\u0017\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Ltk2/n;",
        "",
        "",
        "currentProgress",
        "totalSteps",
        "Ly81/f;",
        "fillColorKey",
        "unfilledColorKey",
        "",
        "unfilledAlpha",
        "heightDp",
        "",
        "addBorders",
        "<init>",
        "(IILy81/f;Ly81/f;FIZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "b",
        "e",
        "c",
        "Ly81/f;",
        "()Ly81/f;",
        "d",
        "g",
        "F",
        "f",
        "()F",
        "Z",
        "()Z",
        "track-activity_release"
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
.field private final a:I

.field private final b:I

.field private final c:Ly81/f;

.field private final d:Ly81/f;

.field private final e:F

.field private final f:I

.field private final g:Z


# direct methods
.method public constructor <init>(IILy81/f;Ly81/f;FIZ)V
    .locals 1

    const-string v0, "fillColorKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unfilledColorKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ltk2/n;->a:I

    .line 3
    iput p2, p0, Ltk2/n;->b:I

    .line 4
    iput-object p3, p0, Ltk2/n;->c:Ly81/f;

    .line 5
    iput-object p4, p0, Ltk2/n;->d:Ly81/f;

    .line 6
    iput p5, p0, Ltk2/n;->e:F

    .line 7
    iput p6, p0, Ltk2/n;->f:I

    .line 8
    iput-boolean p7, p0, Ltk2/n;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(IILy81/f;Ly81/f;FIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    .line 9
    sget-object p4, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p8, 0x10

    if-eqz p4, :cond_1

    const p5, 0x3dcccccd    # 0.1f

    :cond_1
    move v5, p5

    and-int/lit8 p4, p8, 0x20

    if-eqz p4, :cond_2

    const/4 p6, 0x2

    :cond_2
    move v6, p6

    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_3

    const/4 p4, 0x0

    move v7, p4

    :goto_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    goto :goto_1

    :cond_3
    move v7, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v0 .. v7}, Ltk2/n;-><init>(IILy81/f;Ly81/f;FIZ)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ltk2/n;->g:Z

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Ltk2/n;->a:I

    return v0
.end method

.method public final c()Ly81/f;
    .locals 1

    iget-object v0, p0, Ltk2/n;->c:Ly81/f;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Ltk2/n;->f:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ltk2/n;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltk2/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltk2/n;

    iget v1, p0, Ltk2/n;->a:I

    iget v3, p1, Ltk2/n;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ltk2/n;->b:I

    iget v3, p1, Ltk2/n;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ltk2/n;->c:Ly81/f;

    iget-object v3, p1, Ltk2/n;->c:Ly81/f;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ltk2/n;->d:Ly81/f;

    iget-object v3, p1, Ltk2/n;->d:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Ltk2/n;->e:F

    iget v3, p1, Ltk2/n;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Ltk2/n;->f:I

    iget v3, p1, Ltk2/n;->f:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Ltk2/n;->g:Z

    iget-boolean p1, p1, Ltk2/n;->g:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Ltk2/n;->e:F

    return v0
.end method

.method public final g()Ly81/f;
    .locals 1

    iget-object v0, p0, Ltk2/n;->d:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ltk2/n;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ltk2/n;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Ltk2/n;->c:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Ltk2/n;->d:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget v2, p0, Ltk2/n;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Ltk2/n;->f:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Ltk2/n;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Ltk2/n;->a:I

    iget v1, p0, Ltk2/n;->b:I

    iget-object v2, p0, Ltk2/n;->c:Ly81/f;

    iget-object v3, p0, Ltk2/n;->d:Ly81/f;

    iget v4, p0, Ltk2/n;->e:F

    iget v5, p0, Ltk2/n;->f:I

    iget-boolean v6, p0, Ltk2/n;->g:Z

    const-string v7, ", totalSteps="

    const-string v8, ", fillColorKey="

    const-string v9, "TrackSessionProgressBarViewState(currentProgress="

    invoke-static {v0, v1, v9, v7, v8}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unfilledColorKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", unfilledAlpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", heightDp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", addBorders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
