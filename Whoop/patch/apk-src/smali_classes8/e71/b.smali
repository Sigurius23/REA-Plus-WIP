.class public final Le71/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001BO\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000c2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0019\u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\"\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010$\u001a\u0004\u0008\u001f\u0010%R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010&\u001a\u0004\u0008#\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Le71/b;",
        "",
        "",
        "yPercent",
        "heightPercent",
        "Li91/a;",
        "background",
        "Ly3/f;",
        "topCornerRadius",
        "bottomCornerRadius",
        "La71/a;",
        "dataScrubberDetails",
        "",
        "showDashedBorder",
        "<init>",
        "(FFLi91/a;FFLa71/a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
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
        "F",
        "g",
        "()F",
        "b",
        "d",
        "c",
        "Li91/a;",
        "()Li91/a;",
        "f",
        "e",
        "La71/a;",
        "()La71/a;",
        "Z",
        "()Z",
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

.field private final b:F

.field private final c:Li91/a;

.field private final d:F

.field private final e:F

.field private final f:La71/a;

.field private final g:Z


# direct methods
.method private constructor <init>(FFLi91/a;FFLa71/a;Z)V
    .locals 1

    const-string v0, "dataScrubberDetails"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Le71/b;->a:F

    .line 4
    iput p2, p0, Le71/b;->b:F

    .line 5
    iput-object p3, p0, Le71/b;->c:Li91/a;

    .line 6
    iput p4, p0, Le71/b;->d:F

    .line 7
    iput p5, p0, Le71/b;->e:F

    .line 8
    iput-object p6, p0, Le71/b;->f:La71/a;

    .line 9
    iput-boolean p7, p0, Le71/b;->g:Z

    return-void
.end method

.method public constructor <init>(FFLi91/a;FFLa71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    and-int/lit8 v0, p8, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move/from16 v0, p1

    :goto_0
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p8, 0x8

    const/4 v5, 0x4

    if-eqz v4, :cond_3

    const/high16 v4, 0x3f800000    # 1.0f

    int-to-float v6, v5

    mul-float/2addr v4, v6

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_4

    int-to-float v5, v5

    mul-float/2addr v1, v5

    goto :goto_4

    :cond_4
    move/from16 v1, p5

    :goto_4
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_5

    .line 10
    new-instance v6, La71/a;

    const/16 v19, 0xfff

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v20}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v5, p8, 0x40

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_6

    :cond_6
    move/from16 v5, p7

    :goto_6
    const/4 v7, 0x0

    move-object/from16 p1, p0

    move/from16 p2, v0

    move/from16 p6, v1

    move/from16 p3, v2

    move-object/from16 p4, v3

    move/from16 p5, v4

    move/from16 p8, v5

    move-object/from16 p7, v6

    move-object/from16 p9, v7

    .line 11
    invoke-direct/range {p1 .. p9}, Le71/b;-><init>(FFLi91/a;FFLa71/a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FFLi91/a;FFLa71/a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Le71/b;-><init>(FFLi91/a;FFLa71/a;Z)V

    return-void
.end method


# virtual methods
.method public final a()Li91/a;
    .locals 1

    iget-object v0, p0, Le71/b;->c:Li91/a;

    return-object v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Le71/b;->e:F

    return v0
.end method

.method public final c()La71/a;
    .locals 1

    iget-object v0, p0, Le71/b;->f:La71/a;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Le71/b;->b:F

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Le71/b;->g:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Le71/b;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Le71/b;

    iget v0, p0, Le71/b;->a:F

    iget v1, p1, Le71/b;->a:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Le71/b;->b:F

    iget v1, p1, Le71/b;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Le71/b;->c:Li91/a;

    iget-object v1, p1, Le71/b;->c:Li91/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Le71/b;->d:F

    iget v1, p1, Le71/b;->d:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Le71/b;->e:F

    iget v1, p1, Le71/b;->e:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Le71/b;->f:La71/a;

    iget-object v1, p1, Le71/b;->f:La71/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-boolean v0, p0, Le71/b;->g:Z

    iget-boolean p1, p1, Le71/b;->g:Z

    if-eq v0, p1, :cond_8

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

    iget v0, p0, Le71/b;->d:F

    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Le71/b;->a:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Le71/b;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Le71/b;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Le71/b;->c:Li91/a;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Le71/b;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Le71/b;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Le71/b;->f:La71/a;

    invoke-virtual {v2}, La71/a;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Le71/b;->g:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Le71/b;->a:F

    iget v1, p0, Le71/b;->b:F

    iget-object v2, p0, Le71/b;->c:Li91/a;

    iget v3, p0, Le71/b;->d:F

    invoke-static {v3}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Le71/b;->e:F

    invoke-static {v4}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Le71/b;->f:La71/a;

    iget-boolean v6, p0, Le71/b;->g:Z

    const-string v7, ", heightPercent="

    const-string v8, ", background="

    const-string v9, "VerticalBarState(yPercent="

    invoke-static {v9, v0, v7, v1, v8}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", topCornerRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bottomCornerRadius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dataScrubberDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showDashedBorder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
