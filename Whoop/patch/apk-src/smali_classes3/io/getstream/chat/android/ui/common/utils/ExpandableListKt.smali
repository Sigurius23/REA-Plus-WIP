.class public final Lio/getstream/chat/android/ui/common/utils/ExpandableListKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0012\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u001a2\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\u0008\u0000\u0010\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "emptyExpandableList",
        "Lio/getstream/chat/android/ui/common/utils/ExpandableList;",
        "T",
        "canExpand",
        "",
        "items",
        "",
        "minimumVisibleItems",
        "",
        "visibleItems",
        "isCollapsed",
        "stream-chat-android-ui-common_release"
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
.method public static final synthetic access$canExpand(Ljava/util/List;I)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/utils/ExpandableListKt;->canExpand(Ljava/util/List;I)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$visibleItems(Ljava/util/List;IZ)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/ExpandableListKt;->visibleItems(Ljava/util/List;IZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final canExpand(Ljava/util/List;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;I)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-le p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final emptyExpandableList()Lio/getstream/chat/android/ui/common/utils/ExpandableList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/getstream/chat/android/ui/common/utils/ExpandableList<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/ExpandableList;

    const/4 v4, 0x6

    const/4 v5, 0x0

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/utils/ExpandableList;-><init>(Ljava/util/List;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final visibleItems(Ljava/util/List;IZ)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;IZ)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/utils/ExpandableListKt;->canExpand(Ljava/util/List;I)Z

    move-result p2

    if-eqz p2, :cond_0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, p1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    :cond_0
    return-object p0
.end method
