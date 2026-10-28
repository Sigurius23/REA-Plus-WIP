.class public final Lg40/u3;
.super Lg40/w3;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 2

    new-instance v0, Lg40/f1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lg40/f1;-><init>(ILjava/util/List;)V

    invoke-direct {p0, v0}, Lg40/w3;-><init>(Lg40/h1;)V

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

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
