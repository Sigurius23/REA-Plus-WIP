.class public abstract Ltw2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "longEdge",
        "maxEdge",
        "a",
        "(II)I",
        "whoop-action_release"
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
.method public static final a(II)I
    .locals 3

    const/4 v0, 0x1

    if-lez p0, :cond_1

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    mul-int/lit8 v1, v0, 0x2

    div-int v2, p0, v1

    if-lt v2, p1, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method
