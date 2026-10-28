.class public final Lfz0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008\u001b\u0010%R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010*\u001a\u0004\u0008+\u0010,R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010*\u001a\u0004\u0008#\u0010,R\u0017\u0010\u000e\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010*\u001a\u0004\u0008\u001f\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lfz0/d;",
        "Lm91/u;",
        "Lfz0/e;",
        "zoneType",
        "Lcom/whoop/design/util/TextResource;",
        "label",
        "Ly81/e;",
        "color",
        "",
        "showThumb",
        "",
        "percentage",
        "Ly3/f;",
        "height",
        "currentZoneCoveredAlpha",
        "<init>",
        "(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lfz0/e;",
        "h",
        "()Lfz0/e;",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "Ly81/e;",
        "()Ly81/e;",
        "d",
        "Z",
        "g",
        "()Z",
        "F",
        "f",
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
.field public static final h:I = 0x8


# instance fields
.field private final a:Lfz0/e;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Ly81/e;

.field private final d:Z

.field private final e:F

.field private final f:F

.field private final g:F


# direct methods
.method private constructor <init>(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFF)V
    .locals 1

    const-string v0, "zoneType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "color"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lfz0/d;->a:Lfz0/e;

    .line 4
    iput-object p2, p0, Lfz0/d;->b:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lfz0/d;->c:Ly81/e;

    .line 6
    iput-boolean p4, p0, Lfz0/d;->d:Z

    .line 7
    iput p5, p0, Lfz0/d;->e:F

    .line 8
    iput p6, p0, Lfz0/d;->f:F

    .line 9
    iput p7, p0, Lfz0/d;->g:F

    return-void
.end method

.method public constructor <init>(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    and-int/lit8 p5, p8, 0x20

    if-eqz p5, :cond_1

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float p5, v0

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p5, v0

    move v6, p5

    goto :goto_0

    :cond_1
    move v6, p6

    :goto_0
    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move/from16 v7, p7

    .line 10
    invoke-direct/range {v0 .. v8}, Lfz0/d;-><init>(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lfz0/d;-><init>(Lfz0/e;Lcom/whoop/design/util/TextResource;Ly81/e;ZFFF)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/e;
    .locals 1

    iget-object v0, p0, Lfz0/d;->c:Ly81/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lfz0/d;->g:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lfz0/d;->f:F

    return v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfz0/d;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lfz0/d;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lfz0/d;

    iget-object v0, p0, Lfz0/d;->a:Lfz0/e;

    iget-object v1, p1, Lfz0/d;->a:Lfz0/e;

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lfz0/d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v1, p1, Lfz0/d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lfz0/d;->c:Ly81/e;

    iget-object v1, p1, Lfz0/d;->c:Ly81/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Lfz0/d;->d:Z

    iget-boolean v1, p1, Lfz0/d;->d:Z

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Lfz0/d;->e:F

    iget v1, p1, Lfz0/d;->e:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    iget v0, p0, Lfz0/d;->f:F

    iget v1, p1, Lfz0/d;->f:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget v0, p0, Lfz0/d;->g:F

    iget p1, p1, Lfz0/d;->g:F

    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lfz0/d;->e:F

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lfz0/d;->d:Z

    return v0
.end method

.method public final h()Lfz0/e;
    .locals 1

    iget-object v0, p0, Lfz0/d;->a:Lfz0/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lfz0/d;->a:Lfz0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfz0/d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lfz0/d;->c:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-boolean v2, p0, Lfz0/d;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lfz0/d;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lfz0/d;->f:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v1, p0, Lfz0/d;->g:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lfz0/d;->a:Lfz0/e;

    iget-object v1, p0, Lfz0/d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lfz0/d;->c:Ly81/e;

    iget-boolean v3, p0, Lfz0/d;->d:Z

    iget v4, p0, Lfz0/d;->e:F

    iget v5, p0, Lfz0/d;->f:F

    invoke-static {v5}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Lfz0/d;->g:F

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "HrZoneState(zoneType="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showThumb="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", percentage="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", currentZoneCoveredAlpha="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
