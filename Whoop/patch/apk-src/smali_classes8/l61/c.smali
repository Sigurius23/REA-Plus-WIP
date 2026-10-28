.class public final Ll61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u0016\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Ll61/c;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "contentDescription",
        "",
        "xPercent",
        "yPercentTop",
        "yPercentBot",
        "La71/a;",
        "dataScrubberDetails",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;FFFLa71/a;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "getContentDescription",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "F",
        "()F",
        "c",
        "d",
        "e",
        "La71/a;",
        "()La71/a;",
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:La71/a;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;)V
    .locals 1

    const-string v0, "contentDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataScrubberDetails"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll61/c;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput p2, p0, Ll61/c;->b:F

    .line 4
    iput p3, p0, Ll61/c;->c:F

    .line 5
    iput p4, p0, Ll61/c;->d:F

    .line 6
    iput-object p5, p0, Ll61/c;->e:La71/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    .line 7
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p6, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move/from16 v1, p2

    :goto_1
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v2, p4

    :goto_3
    and-int/lit8 v4, p6, 0x10

    if-eqz v4, :cond_4

    .line 8
    new-instance v5, La71/a;

    const/16 v18, 0xfff

    const/16 v19, 0x0

    const/4 v6, 0x0

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

    invoke-direct/range {v5 .. v19}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p6, v5

    :goto_4
    move-object/from16 p1, p0

    move-object/from16 p2, v0

    move/from16 p3, v1

    move/from16 p5, v2

    move/from16 p4, v3

    goto :goto_5

    :cond_4
    move-object/from16 p6, p5

    goto :goto_4

    .line 9
    :goto_5
    invoke-direct/range {p1 .. p6}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;)V

    return-void
.end method


# virtual methods
.method public final a()La71/a;
    .locals 1

    iget-object v0, p0, Ll61/c;->e:La71/a;

    return-object v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Ll61/c;->b:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Ll61/c;->d:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Ll61/c;->c:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll61/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll61/c;

    iget-object v1, p0, Ll61/c;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ll61/c;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ll61/c;->b:F

    iget v3, p1, Ll61/c;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ll61/c;->c:F

    iget v3, p1, Ll61/c;->c:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Ll61/c;->d:F

    iget v3, p1, Ll61/c;->d:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ll61/c;->e:La71/a;

    iget-object p1, p1, Ll61/c;->e:La71/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ll61/c;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ll61/c;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Ll61/c;->c:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Ll61/c;->d:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Ll61/c;->e:La71/a;

    invoke-virtual {v1}, La71/a;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Ll61/c;->a:Lcom/whoop/design/util/TextResource;

    iget v1, p0, Ll61/c;->b:F

    iget v2, p0, Ll61/c;->c:F

    iget v3, p0, Ll61/c;->d:F

    iget-object v4, p0, Ll61/c;->e:La71/a;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "BandPlotPointState(contentDescription="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", xPercent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", yPercentTop="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", yPercentBot="

    const-string v1, ", dataScrubberDetails="

    invoke-static {v5, v2, v0, v3, v1}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
