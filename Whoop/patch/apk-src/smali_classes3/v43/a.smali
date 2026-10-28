.class public final Lv43/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv33/s;

.field public final b:Ljg3/i;


# direct methods
.method public constructor <init>(Lv33/s;Ljg3/i;)V
    .locals 1

    sget-object v0, Lv43/b;->w:Lv43/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv43/a;->a:Lv33/s;

    iput-object p2, p0, Lv43/a;->b:Ljg3/i;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv43/a;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lv43/a;

    iget-object v1, p0, Lv43/a;->a:Lv33/s;

    iget-object v2, p1, Lv43/a;->a:Lv33/s;

    invoke-virtual {v1, v2}, Lv33/s;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lv43/a;->b:Ljg3/i;

    iget-object p1, p1, Lv43/a;->b:Ljg3/i;

    invoke-virtual {v1, p1}, Ljg3/i;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    sget-object p1, Lv43/b;->w:Lv43/b;

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lv43/a;->a:Lv33/s;

    invoke-virtual {v0}, Lv33/s;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lv43/a;->b:Ljg3/i;

    invoke-static {v2, v0, v1}, Lc13/a;->f(Ljg3/i;II)I

    move-result v0

    sget-object v1, Lv43/b;->w:Lv43/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    sget-object v0, Lv43/b;->w:Lv43/b;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "PinEntry(pinTarget="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lv43/a;->a:Lv33/s;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", at="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lv43/a;->b:Ljg3/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", type="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
