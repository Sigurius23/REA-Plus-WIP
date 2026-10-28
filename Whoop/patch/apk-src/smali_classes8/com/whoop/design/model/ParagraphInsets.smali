.class public final Lcom/whoop/design/model/ParagraphInsets;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/model/ParagraphInsets;",
        "",
        "top",
        "",
        "leading",
        "bottom",
        "trailing",
        "<init>",
        "(DDDD)V",
        "getTop",
        "()D",
        "getLeading",
        "getBottom",
        "getTrailing",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I


# instance fields
.field private final bottom:D

.field private final leading:D

.field private final top:D

.field private final trailing:D


# direct methods
.method public constructor <init>(DDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    iput-wide p3, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    iput-wide p5, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    iput-wide p7, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/model/ParagraphInsets;DDDDILjava/lang/Object;)Lcom/whoop/design/model/ParagraphInsets;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    :cond_2
    move-wide v5, p5

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    move-wide v7, p1

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_3
    move-wide/from16 v7, p7

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v8}, Lcom/whoop/design/model/ParagraphInsets;->copy(DDDD)Lcom/whoop/design/model/ParagraphInsets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    return-wide v0
.end method

.method public final copy(DDDD)Lcom/whoop/design/model/ParagraphInsets;
    .locals 9

    new-instance v0, Lcom/whoop/design/model/ParagraphInsets;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move-wide/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/whoop/design/model/ParagraphInsets;-><init>(DDDD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/model/ParagraphInsets;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/model/ParagraphInsets;

    iget-wide v3, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    iget-wide v5, p1, Lcom/whoop/design/model/ParagraphInsets;->top:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    iget-wide v5, p1, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    iget-wide v5, p1, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    iget-wide v5, p1, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBottom()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    return-wide v0
.end method

.method public final getLeading()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    return-wide v0
.end method

.method public final getTop()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    return-wide v0
.end method

.method public final getTrailing()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/whoop/design/model/ParagraphInsets;->top:D

    iget-wide v2, p0, Lcom/whoop/design/model/ParagraphInsets;->leading:D

    iget-wide v4, p0, Lcom/whoop/design/model/ParagraphInsets;->bottom:D

    iget-wide v6, p0, Lcom/whoop/design/model/ParagraphInsets;->trailing:D

    const-string v8, "ParagraphInsets(top="

    const-string v9, ", leading="

    invoke-static {v8, v0, v1, v9}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", bottom="

    const-string v2, ", trailing="

    invoke-static {v0, v1, v4, v5, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v7, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
