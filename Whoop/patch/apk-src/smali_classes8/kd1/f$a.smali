.class public final Lkd1/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd1/f;->a(Ll3/g;)Lq3/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "kd1/f$a",
        "Lq3/r;",
        "",
        "offset",
        "x",
        "(I)I",
        "n",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public n(I)I
    .locals 1

    const/4 v0, 0x4

    if-gt p1, v0, :cond_0

    return p1

    :cond_0
    const/16 v0, 0x9

    if-gt p1, v0, :cond_1

    add-int/lit8 p1, p1, -0x1

    return p1

    :cond_1
    const/16 v0, 0xe

    if-gt p1, v0, :cond_2

    add-int/lit8 p1, p1, -0x2

    return p1

    :cond_2
    const/16 v0, 0x13

    if-gt p1, v0, :cond_3

    add-int/lit8 p1, p1, -0x3

    return p1

    :cond_3
    const/16 p1, 0x10

    return p1
.end method

.method public x(I)I
    .locals 2

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    return p1

    :cond_0
    const/4 v1, 0x7

    if-gt p1, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    const/16 v1, 0xb

    if-gt p1, v1, :cond_2

    add-int/lit8 p1, p1, 0x2

    return p1

    :cond_2
    const/16 v1, 0x10

    if-gt p1, v1, :cond_3

    add-int/2addr p1, v0

    return p1

    :cond_3
    const/16 p1, 0x13

    return p1
.end method
