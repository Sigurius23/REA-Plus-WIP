.class public final Ln0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lp0/j0;

.field public c:Z

.field public d:I

.field public e:F


# direct methods
.method public static a(Ln0/n;Z)I
    .locals 0

    if-eqz p1, :cond_0

    iget-object p0, p0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/g;

    check-cast p0, Ln0/o;

    invoke-virtual {p0}, Ln0/o;->getIndex()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_0
    iget-object p0, p0, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/g;

    check-cast p0, Ln0/o;

    invoke-virtual {p0}, Ln0/o;->getIndex()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method
