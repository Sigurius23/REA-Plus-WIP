.class public final Lq00/s;
.super Lq00/v;
.source "SourceFile"


# instance fields
.field public final d:Lzy/b;


# direct methods
.method public constructor <init>(Lzy/b;)V
    .locals 2

    const-string v0, "WALLET_MENU_REMOVE_ITEM_TAG"

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lq00/v;-><init>(Lzy/b;Ljava/lang/String;Z)V

    iput-object p1, p0, Lq00/s;->d:Lzy/b;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lq00/s;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lq00/s;

    iget-object v0, p0, Lq00/s;->d:Lzy/b;

    iget-object p1, p1, Lq00/s;->d:Lzy/b;

    invoke-virtual {v0, p1}, Lzy/b;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getText()Lzy/c;
    .locals 1

    iget-object v0, p0, Lq00/s;->d:Lzy/b;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lq00/s;->d:Lzy/b;

    invoke-virtual {v0}, Lzy/b;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RemoveItem(text="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq00/s;->d:Lzy/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
