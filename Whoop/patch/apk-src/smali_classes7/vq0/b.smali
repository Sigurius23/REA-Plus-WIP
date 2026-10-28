.class public final Lvq0/b;
.super Landroid/text/style/MetricAffectingSpan;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lvq0/b;",
        "Landroid/text/style/MetricAffectingSpan;",
        "Landroid/graphics/Typeface;",
        "typeface",
        "",
        "letterSpacing",
        "<init>",
        "(Landroid/graphics/Typeface;F)V",
        "Landroid/graphics/Paint;",
        "paint",
        "tf",
        "spacing",
        "Ll83/a0;",
        "a",
        "(Landroid/graphics/Paint;Landroid/graphics/Typeface;F)V",
        "Landroid/text/TextPaint;",
        "ds",
        "updateDrawState",
        "(Landroid/text/TextPaint;)V",
        "updateMeasureState",
        "w",
        "Landroid/graphics/Typeface;",
        "x",
        "F",
        "community_release"
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
.field private final w:Landroid/graphics/Typeface;

.field private final x:F


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;F)V
    .locals 1

    const-string v0, "typeface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 2
    iput-object p1, p0, Lvq0/b;->w:Landroid/graphics/Typeface;

    .line 3
    iput p2, p0, Lvq0/b;->x:F

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/Typeface;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lvq0/b;-><init>(Landroid/graphics/Typeface;F)V

    return-void
.end method

.method private final a(Landroid/graphics/Paint;Landroid/graphics/Typeface;F)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    return-void
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    const-string v0, "ds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvq0/b;->w:Landroid/graphics/Typeface;

    iget v1, p0, Lvq0/b;->x:F

    invoke-direct {p0, p1, v0, v1}, Lvq0/b;->a(Landroid/graphics/Paint;Landroid/graphics/Typeface;F)V

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 2

    const-string v0, "paint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvq0/b;->w:Landroid/graphics/Typeface;

    iget v1, p0, Lvq0/b;->x:F

    invoke-direct {p0, p1, v0, v1}, Lvq0/b;->a(Landroid/graphics/Paint;Landroid/graphics/Typeface;F)V

    return-void
.end method
