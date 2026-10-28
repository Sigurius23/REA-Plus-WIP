.class public final Lcom/mapbox/maps/UtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a9\u0010\u0005\u001a\u00028\u0001\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001aW\u0010\r\u001a\u00028\u0002\"\u0006\u0008\u0000\u0010\u0007\u0018\u0001\"\u0006\u0008\u0001\u0010\u0008\u0018\u0001\"\u0016\u0008\u0002\u0010\u0000\u0018\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001a\u0008\u0004\u0010\u000c\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0080H\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0000*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "T",
        "R",
        "Ljava/lang/ref/WeakReference;",
        "Lkotlin/Function1;",
        "method",
        "call",
        "(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "E",
        "V",
        "Lcom/mapbox/bindgen/Expected;",
        "Lq83/d;",
        "Lcom/mapbox/common/Cancelable;",
        "block",
        "suspendMapboxCancellableCoroutine",
        "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "",
        "Landroid/content/Context;",
        "context",
        "toDP",
        "(Ljava/lang/Number;Landroid/content/Context;)Ljava/lang/Number;",
        "maps-sdk_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final call(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/ref/WeakReference<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1;",
            ")TR;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method

.method public static final suspendMapboxCancellableCoroutine(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "T:",
            "Lcom/mapbox/bindgen/Expected<",
            "TE;TV;>;>(",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/mapbox/common/Cancelable;

    new-instance p1, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;

    invoke-direct {p1, p0}, Lcom/mapbox/maps/UtilsKt$suspendMapboxCancellableCoroutine$2$1;-><init>(Lcom/mapbox/common/Cancelable;)V

    invoke-virtual {v0, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static final toDP(Ljava/lang/Number;Landroid/content/Context;)Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Number;",
            ">(TT;",
            "Landroid/content/Context;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0, p0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method
