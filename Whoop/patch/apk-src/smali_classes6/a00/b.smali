.class public final La00/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La00/d;


# instance fields
.field public final a:Lwz/n;


# direct methods
.method public constructor <init>(Lwz/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La00/b;->a:Lwz/n;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, La00/b;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, La00/b;

    iget-object v0, p0, La00/b;->a:Lwz/n;

    iget-object p1, p1, La00/b;->a:Lwz/n;

    invoke-virtual {v0, p1}, Lwz/n;->equals(Ljava/lang/Object;)Z

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

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, La00/b;->a:Lwz/n;

    invoke-virtual {v0}, Lwz/n;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Completed(linkActivityResult="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La00/b;->a:Lwz/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
