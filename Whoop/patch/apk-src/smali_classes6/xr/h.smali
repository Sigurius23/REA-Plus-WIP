.class public abstract Lxr/h;
.super Lxr/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# static fields
.field public static final synthetic y:I


# instance fields
.field public transient x:Lxr/i;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Ljava/util/Set;

    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0

    :catch_0
    :cond_3
    return v2
.end method
