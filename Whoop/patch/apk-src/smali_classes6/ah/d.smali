.class public abstract Lah/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Lah/m;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lah/d;->a:I

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "majorType is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lah/d;

    if-eqz v0, :cond_1

    check-cast p1, Lah/d;

    iget v0, p1, Lah/d;->a:I

    iget-object v1, p0, Lah/d;->b:Lah/m;

    iget v2, p0, Lah/d;->a:I

    if-eqz v1, :cond_0

    iget-object p1, p1, Lah/d;->b:Lah/m;

    invoke-virtual {v1, p1}, Lah/m;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-ne v2, v0, :cond_1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lah/d;->b:Lah/m;

    if-nez p1, :cond_1

    if-ne v2, v0, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lah/d;->b:Lah/m;

    iget v1, p0, Lah/d;->a:I

    invoke-static {v1}, Le4/p;->a(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
