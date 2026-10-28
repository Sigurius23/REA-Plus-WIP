.class public final Log3/g;
.super Log3/h;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Ljg3/p;


# direct methods
.method public constructor <init>(Ljg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log3/g;->w:Ljg3/p;

    return-void
.end method


# virtual methods
.method public final a(Ljg3/c;)Ljg3/p;
    .locals 0

    iget-object p1, p0, Log3/g;->w:Ljg3/p;

    return-object p1
.end method

.method public final b(Ljg3/e;)Log3/e;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Ljg3/e;)Ljava/util/List;
    .locals 0

    iget-object p1, p0, Log3/g;->w:Ljg3/p;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljg3/e;Ljg3/p;)Z
    .locals 0

    iget-object p1, p0, Log3/g;->w:Ljg3/p;

    invoke-virtual {p1, p2}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Log3/g;

    iget-object v2, p0, Log3/g;->w:Ljg3/p;

    if-eqz v1, :cond_1

    check-cast p1, Log3/g;

    iget-object p1, p1, Log3/g;->w:Ljg3/p;

    invoke-virtual {v2, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    instance-of v1, p1, Log3/b;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Log3/b;

    invoke-virtual {p1}, Log3/b;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Ljg3/c;->H:Ljg3/c;

    invoke-virtual {p1, v1}, Log3/b;->a(Ljg3/c;)Ljg3/p;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v3
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Log3/g;->w:Ljg3/p;

    iget v0, v0, Ljg3/p;->x:I

    add-int/lit8 v1, v0, 0x1f

    add-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FixedRules:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Log3/g;->w:Ljg3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
