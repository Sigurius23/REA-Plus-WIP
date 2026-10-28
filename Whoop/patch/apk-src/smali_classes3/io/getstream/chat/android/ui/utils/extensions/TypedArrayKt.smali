.class public final Lio/getstream/chat/android/ui/utils/extensions/TypedArrayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0010\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\'\u0010\t\u001a\u0004\u0018\u00010\u0008*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a8\u0010\u000e\u001a\u00020\u000c*\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000c0\u000bH\u0080\u0008\u00f8\u0001\u0000\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a6\u0010\u0014\u001a\u00028\u0000\"\u0010\u0008\u0000\u0010\u0011\u0018\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0010*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0080\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroid/content/res/TypedArray;",
        "Landroid/content/Context;",
        "context",
        "",
        "id",
        "Landroid/graphics/drawable/Drawable;",
        "getDrawableCompat",
        "(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;",
        "Landroid/content/res/ColorStateList;",
        "getColorStateListCompat",
        "(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "block",
        "use",
        "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)V",
        "",
        "T",
        "index",
        "default",
        "getEnum",
        "(Landroid/content/res/TypedArray;ILjava/lang/Enum;)Ljava/lang/Enum;",
        "getColorOrNull",
        "(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;",
        "",
        "getDimensionOrNull",
        "(Landroid/content/res/TypedArray;I)Ljava/lang/Float;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getColorOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Integer;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Attribute not defined in set."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_1
    instance-of p1, p0, Ll83/m;

    if-eqz p1, :cond_1

    const/4 p0, 0x0

    :cond_1
    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static final getColorStateListCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1, p0}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final getDimensionOrNull(Landroid/content/res/TypedArray;I)Ljava/lang/Float;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Attribute not defined in set."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_1
    instance-of p1, p0, Ll83/m;

    if-eqz p1, :cond_1

    const/4 p0, 0x0

    :cond_1
    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method

.method public static final getDrawableCompat(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1, p0}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final getEnum(Landroid/content/res/TypedArray;ILjava/lang/Enum;)Ljava/lang/Enum;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Enum<",
            "TT;>;>(",
            "Landroid/content/res/TypedArray;",
            "ITT;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "default"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p0

    if-gez p0, :cond_0

    return-object p2

    :cond_0
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final use(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/TypedArray;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
