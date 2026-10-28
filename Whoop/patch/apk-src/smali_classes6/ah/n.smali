.class public final Lah/n;
.super Lah/c;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lah/c;-><init>(I)V

    iput-object p1, p0, Lah/n;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lah/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-super {p0, p1}, Lah/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p1, Lah/n;

    iget-object p1, p1, Lah/n;->d:Ljava/lang/String;

    iget-object v0, p0, Lah/n;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lah/n;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-super {p0}, Lah/c;->hashCode()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lah/n;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    :cond_0
    return-object v0
.end method
