.class public final Low/r;
.super Low/p;
.source "SourceFile"


# instance fields
.field public final w:Lqw/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqw/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqw/n;-><init>(Z)V

    iput-object v0, p0, Low/r;->w:Lqw/n;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Low/r;

    if-eqz v0, :cond_0

    check-cast p1, Low/r;

    iget-object p1, p1, Low/r;->w:Lqw/n;

    iget-object v0, p0, Low/r;->w:Lqw/n;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Low/r;->w:Lqw/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
