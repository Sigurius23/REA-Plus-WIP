.class public abstract Llb1/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/d2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/IconSize;",
        "Ly3/f;",
        "a",
        "(Lcom/whoop/design/models/IconSize;)F",
        "design-models_release"
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
.method public static final a(Lcom/whoop/design/models/IconSize;)F
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/d2$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    if-eq p0, v2, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    const/16 p0, 0x8

    int-to-float p0, p0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/4 p0, 0x6

    int-to-float p0, p0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_2
    int-to-float p0, v2

    mul-float/2addr p0, p0

    return p0

    :cond_3
    int-to-float p0, v0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_4
    int-to-float p0, v1

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0
.end method
