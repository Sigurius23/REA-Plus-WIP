.class public final Lio/getstream/chat/android/ui/common/extensions/internal/AnyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\u001a\u001a\u0010\u0000\u001a\u0002H\u0001\"\u0006\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0080\u0008\u00a2\u0006\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u0004\u0018\u0001H\u0001\"\u0006\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0080\u0008\u00a2\u0006\u0002\u0010\u0003\u001a!\u0010\u0005\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u0001*\u0004\u0018\u0001H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0000\u00a2\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0008\u001a\u00020\t\"\u0004\u0008\u0000\u0010\u0001*\u0004\u0018\u0001H\u0001H\u0000\u00a2\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\u00010\u000c\"\u0004\u0008\u0000\u0010\u0001*\u0002H\u0001H\u0000\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "cast",
        "AnyT",
        "",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "safeCast",
        "getOrDefault",
        "default",
        "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "isNotNull",
        "",
        "(Ljava/lang/Object;)Z",
        "singletonList",
        "",
        "(Ljava/lang/Object;)Ljava/util/List;",
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
.method public static final cast(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<AnyT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TAnyT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<AnyT:",
            "Ljava/lang/Object;",
            ">(TAnyT;TAnyT;)TAnyT;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static final isNotNull(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<AnyT:",
            "Ljava/lang/Object;",
            ">(TAnyT;)Z"
        }
    .end annotation

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final safeCast(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<AnyT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TAnyT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final singletonList(Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<AnyT:",
            "Ljava/lang/Object;",
            ">(TAnyT;)",
            "Ljava/util/List<",
            "TAnyT;>;"
        }
    .end annotation

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
