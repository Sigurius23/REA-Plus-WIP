.class public final Lnw/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Ljava/util/Date;

.field public final x:Lnw/f;


# direct methods
.method public constructor <init>(Ljava/util/Date;Lnw/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnw/g;->w:Ljava/util/Date;

    iput-object p2, p0, Lnw/g;->x:Lnw/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnw/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnw/g;

    iget-object v1, p0, Lnw/g;->w:Ljava/util/Date;

    iget-object v3, p1, Lnw/g;->w:Ljava/util/Date;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/g;->x:Lnw/f;

    iget-object p1, p1, Lnw/g;->x:Lnw/f;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lnw/g;->w:Ljava/util/Date;

    iget-object v1, p0, Lnw/g;->x:Lnw/f;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
