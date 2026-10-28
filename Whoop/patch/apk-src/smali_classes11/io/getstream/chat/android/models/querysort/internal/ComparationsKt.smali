.class public final Lio/getstream/chat/android/models/querysort/internal/ComparationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "compare",
        "",
        "first",
        "",
        "",
        "second",
        "sortDirection",
        "Lio/getstream/chat/android/models/querysort/SortDirection;",
        "stream-chat-android-core"
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
.method public static final compare(Ljava/lang/Comparable;Ljava/lang/Comparable;Lio/getstream/chat/android/models/querysort/SortDirection;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Comparable<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Comparable<",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/querysort/SortDirection;",
            ")I"
        }
    .end annotation

    const-string v0, "sortDirection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result p0

    mul-int/lit8 p0, p0, -0x1

    return p0

    :cond_1
    if-eqz p0, :cond_2

    if-nez p1, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result p0

    return p0

    :cond_2
    if-eqz p0, :cond_3

    if-eqz p1, :cond_3

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/querysort/SortDirection;->getValue()I

    move-result p1

    mul-int/2addr p1, p0

    return p1

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Impossible case!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
