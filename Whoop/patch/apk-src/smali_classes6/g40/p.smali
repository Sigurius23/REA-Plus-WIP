.class public final Lg40/p;
.super Lvd/f;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 15

    new-instance v0, Ll83/k;

    const-string v1, "AB"

    const-string v2, "Alberta"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "BC"

    const-string v3, "British Columbia"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "MB"

    const-string v4, "Manitoba"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "NB"

    const-string v5, "New Brunswick"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "NL"

    const-string v6, "Newfoundland and Labrador"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "NT"

    const-string v7, "Northwest Territories"

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "NS"

    const-string v8, "Nova Scotia"

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v8, "NU"

    const-string v9, "Nunavut"

    invoke-direct {v7, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v9, "ON"

    const-string v10, "Ontario"

    invoke-direct {v8, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ll83/k;

    const-string v10, "PE"

    const-string v11, "Prince Edward Island"

    invoke-direct {v9, v10, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ll83/k;

    const-string v11, "QC"

    const-string v12, "Quebec"

    invoke-direct {v10, v11, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v11, Ll83/k;

    const-string v12, "SK"

    const-string v13, "Saskatchewan"

    invoke-direct {v11, v12, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const-string v13, "YT"

    const-string v14, "Yukon"

    invoke-direct {v12, v13, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v12}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v1, 0x7f140f92

    iput v1, p0, Lg40/p;->a:I

    iput-object v0, p0, Lg40/p;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lg40/p;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lg40/p;

    iget v0, p0, Lg40/p;->a:I

    iget v1, p1, Lg40/p;->a:I

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lg40/p;->b:Ljava/util/List;

    iget-object p1, p1, Lg40/p;->b:Ljava/util/List;

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

    iget v0, p0, Lg40/p;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg40/p;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lg40/p;->b:Ljava/util/List;

    return-object v0
.end method

.method public final t()I
    .locals 1

    iget v0, p0, Lg40/p;->a:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Canada(label="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lg40/p;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", administrativeAreas="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg40/p;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
