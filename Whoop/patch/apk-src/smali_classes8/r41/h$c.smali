.class public final Lr41/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr41/h;->O(Ljava/lang/CharSequence;)Lq3/r;
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
        "r41/h$c",
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


# instance fields
.field final synthetic w:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lr41/h$c;->w:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public n(I)I
    .locals 0

    iget-object p1, p0, Lr41/h$c;->w:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    return p1
.end method

.method public x(I)I
    .locals 1

    iget-object p1, p0, Lr41/h$c;->w:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x3

    if-le p1, v0, :cond_0

    iget-object p1, p0, Lr41/h$c;->w:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x4

    return p1
.end method
