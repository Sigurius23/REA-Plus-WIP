.class public final Lg40/v3;
.super Lg40/w3;
.source "SourceFile"


# instance fields
.field public final b:Z


# direct methods
.method public synthetic constructor <init>(IILjava/util/List;)V
    .locals 1

    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    .line 3
    :goto_0
    invoke-direct {p0, p1, p3, p2}, Lg40/v3;-><init>(ILjava/util/List;Z)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;Z)V
    .locals 1

    .line 4
    new-instance v0, Lg40/f1;

    invoke-direct {v0, p1, p2}, Lg40/f1;-><init>(ILjava/util/List;)V

    .line 5
    invoke-direct {p0, v0}, Lg40/w3;-><init>(Lg40/h1;)V

    .line 6
    iput-boolean p3, p0, Lg40/v3;->b:Z

    return-void
.end method

.method public constructor <init>(Lg40/h1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lg40/w3;-><init>(Lg40/h1;)V

    .line 2
    iput-boolean p2, p0, Lg40/v3;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(ZZ)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lg40/v3;->b:Z

    return v0
.end method
