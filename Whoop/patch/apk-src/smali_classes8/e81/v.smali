.class public abstract Le81/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a%\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "response",
        "c",
        "(F)F",
        "dampingRatio",
        "Ld0/l;",
        "b",
        "(FF)Ld0/l;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(FF)Ld0/l;
    .locals 0

    invoke-static {p0, p1}, Le81/v;->b(FF)Ld0/l;

    move-result-object p0

    return-object p0
.end method

.method private static final b(FF)Ld0/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "Ld0/l;"
        }
    .end annotation

    invoke-static {p0}, Le81/v;->c(F)F

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p1, p0, v1, v0}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p0

    return-object p0
.end method

.method public static final c(F)F
    .locals 1

    const v0, 0x40c90fdb

    div-float/2addr v0, p0

    mul-float/2addr v0, v0

    return v0
.end method
