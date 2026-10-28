.class public final Lz51/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u0019\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008 \u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001e\u001a\u0004\u0008\u001d\u0010\u001fR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010\'\u001a\u0004\u0008+\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Lz51/r;",
        "Lm91/u;",
        "Lz51/s;",
        "type",
        "",
        "fillPercent",
        "Lcom/whoop/design/util/TextResource;",
        "score",
        "",
        "showOptimalStrain",
        "optimalStrainPercent",
        "",
        "onHelpClickedEvent",
        "onShareClickedEvent",
        "<init>",
        "(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lz51/s;",
        "f",
        "()Lz51/s;",
        "b",
        "F",
        "()F",
        "c",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "d",
        "Z",
        "e",
        "()Z",
        "Ljava/lang/Object;",
        "getOnHelpClickedEvent",
        "()Ljava/lang/Object;",
        "g",
        "getOnShareClickedEvent",
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
.field private final a:Lz51/s;

.field private final b:F

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Z

.field private final e:F

.field private final f:Ljava/lang/Object;

.field private final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "score"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onHelpClickedEvent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShareClickedEvent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz51/r;->a:Lz51/s;

    .line 3
    iput p2, p0, Lz51/r;->b:F

    .line 4
    iput-object p3, p0, Lz51/r;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-boolean p4, p0, Lz51/r;->d:Z

    .line 6
    iput p5, p0, Lz51/r;->e:F

    .line 7
    iput-object p6, p0, Lz51/r;->f:Ljava/lang/Object;

    .line 8
    iput-object p7, p0, Lz51/r;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p8, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    and-int/lit8 p4, p8, 0x20

    .line 9
    sget-object p5, Ll83/a0;->a:Ll83/a0;

    if-eqz p4, :cond_2

    move-object v6, p5

    goto :goto_0

    :cond_2
    move-object v6, p6

    :goto_0
    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_3

    move-object v7, p5

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    goto :goto_2

    :cond_3
    move-object v7, p7

    goto :goto_1

    :goto_2
    invoke-direct/range {v0 .. v7}, Lz51/r;-><init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lz51/r;->b:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lz51/r;->e:F

    return v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lz51/r;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lz51/r;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz51/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz51/r;

    iget-object v1, p0, Lz51/r;->a:Lz51/s;

    iget-object v3, p1, Lz51/r;->a:Lz51/s;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lz51/r;->b:F

    iget v3, p1, Lz51/r;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lz51/r;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lz51/r;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lz51/r;->d:Z

    iget-boolean v3, p1, Lz51/r;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lz51/r;->e:F

    iget v3, p1, Lz51/r;->e:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lz51/r;->f:Ljava/lang/Object;

    iget-object v3, p1, Lz51/r;->f:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lz51/r;->g:Ljava/lang/Object;

    iget-object p1, p1, Lz51/r;->g:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Lz51/s;
    .locals 1

    iget-object v0, p0, Lz51/r;->a:Lz51/s;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lz51/r;->a:Lz51/s;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lz51/r;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz51/r;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-boolean v2, p0, Lz51/r;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lz51/r;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lz51/r;->f:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lz51/r;->g:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lz51/r;->a:Lz51/s;

    iget v1, p0, Lz51/r;->b:F

    iget-object v2, p0, Lz51/r;->c:Lcom/whoop/design/util/TextResource;

    iget-boolean v3, p0, Lz51/r;->d:Z

    iget v4, p0, Lz51/r;->e:F

    iget-object v5, p0, Lz51/r;->f:Ljava/lang/Object;

    iget-object v6, p0, Lz51/r;->g:Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PillarGaugeState(type="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fillPercent="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showOptimalStrain="

    const-string v1, ", optimalStrainPercent="

    invoke-static {v2, v0, v1, v7, v3}, Lte0/d;->w(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", onHelpClickedEvent="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onShareClickedEvent="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v0, v6}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
