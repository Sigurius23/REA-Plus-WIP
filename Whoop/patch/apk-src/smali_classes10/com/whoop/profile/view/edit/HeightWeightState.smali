.class public final Lcom/whoop/profile/view/edit/HeightWeightState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/HeightWeightState;",
        "",
        "height",
        "",
        "weight",
        "<init>",
        "(FF)V",
        "getHeight",
        "()F",
        "getWeight",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "profile_release"
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
.field private final height:F

.field private final weight:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/whoop/profile/view/edit/HeightWeightState;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    .line 4
    iput p2, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    return-void
.end method

.method public synthetic constructor <init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/view/edit/HeightWeightState;-><init>(FF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/HeightWeightState;FFILjava/lang/Object;)Lcom/whoop/profile/view/edit/HeightWeightState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/HeightWeightState;->copy(FF)Lcom/whoop/profile/view/edit/HeightWeightState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    return v0
.end method

.method public final copy(FF)Lcom/whoop/profile/view/edit/HeightWeightState;
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/edit/HeightWeightState;

    invoke-direct {v0, p1, p2}, Lcom/whoop/profile/view/edit/HeightWeightState;-><init>(FF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/HeightWeightState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/HeightWeightState;

    iget v1, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    iget v3, p1, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    iget p1, p1, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    return v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->height:F

    iget v1, p0, Lcom/whoop/profile/view/edit/HeightWeightState;->weight:F

    const-string v2, ", weight="

    const-string v3, ")"

    const-string v4, "HeightWeightState(height="

    invoke-static {v4, v0, v2, v1, v3}, Lr80/c;->n(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
