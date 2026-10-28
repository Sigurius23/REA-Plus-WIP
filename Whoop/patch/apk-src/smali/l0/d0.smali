.class public final Ll0/d0;
.super Ll0/f;
.source "SourceFile"


# instance fields
.field public final e:Lb2/g;


# direct methods
.method public constructor <init>(Lb2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/d0;->e:Lb2/g;

    return-void
.end method


# virtual methods
.method public final d(ILy3/m;Ly2/j1;I)I
    .locals 0

    const/4 p2, 0x0

    iget-object p3, p0, Ll0/d0;->e:Lb2/g;

    check-cast p3, Lb2/l;

    invoke-virtual {p3, p2, p1}, Lb2/l;->a(II)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/d0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll0/d0;

    iget-object v1, p0, Ll0/d0;->e:Lb2/g;

    iget-object p1, p1, Ll0/d0;->e:Lb2/g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ll0/d0;->e:Lb2/g;

    check-cast v0, Lb2/l;

    iget v0, v0, Lb2/l;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VerticalCrossAxisAlignment(vertical="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll0/d0;->e:Lb2/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
