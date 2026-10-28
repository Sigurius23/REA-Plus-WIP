.class public final Li2/c1;
.super Li2/t;
.source "SourceFile"


# instance fields
.field public final c:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Li2/t;-><init>()V

    iput-wide p1, p0, Li2/c1;->c:J

    return-void
.end method


# virtual methods
.method public final a(JLi2/q0;F)V
    .locals 2

    check-cast p3, Li2/h;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p3, p1}, Li2/h;->c(F)V

    cmpg-float p1, p4, p1

    iget-wide v0, p0, Li2/c1;->c:J

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Li2/x;->e(J)F

    move-result p1

    mul-float/2addr p1, p4

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    :goto_0
    invoke-virtual {p3, v0, v1}, Li2/h;->e(J)V

    iget-object p1, p3, Li2/h;->c:Landroid/graphics/Shader;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Li2/h;->i(Landroid/graphics/Shader;)V

    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li2/c1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li2/c1;

    iget-wide v3, p1, Li2/c1;->c:J

    iget-wide v5, p0, Li2/c1;->c:J

    invoke-static {v5, v6, v3, v4}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    sget v0, Li2/x;->o:I

    iget-wide v0, p0, Li2/c1;->c:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SolidColor(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Li2/c1;->c:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
