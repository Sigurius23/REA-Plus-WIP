.class public final Lwd/a;
.super Lrv/n;
.source "SourceFile"


# instance fields
.field public final b:Lve/e;


# direct methods
.method public constructor <init>(Lve/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/a;->b:Lve/e;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lwd/a;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lwd/a;

    iget-object v0, p0, Lwd/a;->b:Lve/e;

    iget-object p1, p1, Lwd/a;->b:Lve/e;

    invoke-virtual {v0, p1}, Lve/e;->equals(Ljava/lang/Object;)Z

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

    iget-object v0, p0, Lwd/a;->b:Lve/e;

    invoke-virtual {v0}, Lve/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public final m()Lve/e;
    .locals 1

    iget-object v0, p0, Lwd/a;->b:Lve/e;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessKey(credentials="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwd/a;->b:Lve/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
