.class public final Lp3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lp3/r;

.field public final c:Lp3/q;


# direct methods
.method public constructor <init>(ILp3/r;Lp3/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp3/x;->a:I

    iput-object p2, p0, Lp3/x;->b:Lp3/r;

    iput-object p3, p0, Lp3/x;->c:Lp3/q;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp3/x;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lp3/x;

    iget v1, p1, Lp3/x;->a:I

    iget v2, p0, Lp3/x;->a:I

    if-eq v2, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lp3/x;->b:Lp3/r;

    iget-object v2, p1, Lp3/x;->b:Lp3/r;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lp3/x;->c:Lp3/q;

    iget-object p1, p1, Lp3/x;->c:Lp3/q;

    invoke-virtual {v1, p1}, Lp3/q;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lp3/x;->a:I

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lp3/x;->b:Lp3/r;

    iget v2, v2, Lp3/r;->w:I

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lp3/x;->c:Lp3/q;

    iget-object v1, v1, Lp3/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResourceFont(resId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lp3/x;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp3/x;->b:Lp3/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-static {v1}, Lp3/n;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", loadingStrategy=Blocking)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
