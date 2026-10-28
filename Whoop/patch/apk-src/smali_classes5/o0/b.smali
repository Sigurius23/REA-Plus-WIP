.class public final Lo0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo0/b;->a:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, "Provided count should be larger than zero"

    invoke-static {p1}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lo0/b;

    if-eqz v0, :cond_0

    check-cast p1, Lo0/b;

    iget p1, p1, Lo0/b;->a:I

    iget v0, p0, Lo0/b;->a:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lo0/b;->a:I

    neg-int v0, v0

    return v0
.end method
