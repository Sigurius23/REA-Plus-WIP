.class public final Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/querysort/QuerySortByField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0008\u0008\u0001\u0010\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007J \u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0008\u0008\u0001\u0010\u0006*\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007J*\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0008\u0008\u0001\u0010\u0006*\u00020\u0007*\u0008\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\u0008\u001a\u00020\tH\u0007J*\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0008\u0008\u0001\u0010\u0006*\u00020\u0007*\u0008\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\u0008\u001a\u00020\tH\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;",
        "",
        "<init>",
        "()V",
        "ascByName",
        "Lio/getstream/chat/android/models/querysort/QuerySortByField;",
        "R",
        "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
        "fieldName",
        "",
        "descByName",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/models/querysort/QuerySortByField$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final ascByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->asc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1
.end method

.method public final ascByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->asc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1
.end method

.method public final descByName(Lio/getstream/chat/android/models/querysort/QuerySortByField;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->desc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1
.end method

.method public final descByName(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;",
            ">(",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/querysort/QuerySortByField<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v0}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/models/querysort/QuerySortByField;->desc(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByField;

    move-result-object p1

    return-object p1
.end method
