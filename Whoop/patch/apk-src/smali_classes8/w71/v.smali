.class public final Lw71/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0012\u001a\u0004\u0008\r\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lw71/v;",
        "",
        "",
        "increment",
        "min",
        "max",
        "preSetNumber",
        "<init>",
        "(IIILjava/lang/Integer;)V",
        "",
        "userSelectedValue",
        "d",
        "(F)I",
        "a",
        "I",
        "getIncrement",
        "()I",
        "b",
        "F",
        "c",
        "()F",
        "rangeMin",
        "rangeMax",
        "modifiedPreSetNumber",
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


# instance fields
.field private final a:I

.field private final b:F

.field private final c:F

.field private final d:F


# direct methods
.method public constructor <init>(IIILjava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw71/v;->a:I

    div-int/2addr p2, p1

    int-to-float p2, p2

    iput p2, p0, Lw71/v;->b:F

    div-int/2addr p3, p1

    int-to-float p2, p3

    iput p2, p0, Lw71/v;->c:F

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    div-int/2addr p2, p1

    int-to-float p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lw71/v;->d:F

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lw71/v;->d:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lw71/v;->c:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lw71/v;->b:F

    return v0
.end method

.method public final d(F)I
    .locals 1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    iget v0, p0, Lw71/v;->a:I

    mul-int/2addr p1, v0

    return p1
.end method
