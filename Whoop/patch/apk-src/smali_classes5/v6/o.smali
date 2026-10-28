.class public final Lv6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv6/o;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lv6/o;-><init>(FI)V

    return-void
.end method

.method public constructor <init>(FI)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    int-to-float p1, p1

    .line 3
    :cond_0
    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-direct {p0, p1, p2}, Lv6/o;-><init>(FLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(FLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lv6/o;->a:F

    iput-object p2, p0, Lv6/o;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lv6/o;)Lv6/o;
    .locals 3

    new-instance v0, Lv6/o;

    iget v1, p0, Lv6/o;->a:F

    iget v2, p1, Lv6/o;->a:F

    add-float/2addr v1, v2

    iget-object v2, p0, Lv6/o;->b:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    iget-object p1, p1, Lv6/o;->b:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v2, p1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lv6/o;-><init>(FLjava/util/List;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lv6/o;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lv6/o;

    iget v0, p0, Lv6/o;->a:F

    iget v1, p1, Lv6/o;->a:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lv6/o;->b:Ljava/util/List;

    iget-object p1, p1, Lv6/o;->b:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lv6/o;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv6/o;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PaddingDimension(dp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lv6/o;->a:F

    const-string v2, ", resourceIds="

    invoke-static {v1, v2, v0}, Lev/n;->s(FLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Lv6/o;->b:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
