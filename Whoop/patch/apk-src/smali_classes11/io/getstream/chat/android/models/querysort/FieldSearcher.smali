.class public final Lio/getstream/chat/android/models/querysort/FieldSearcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JC\u0010\r\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\n\u0018\u00010\t\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/models/querysort/FieldSearcher;",
        "",
        "<init>",
        "()V",
        "T",
        "",
        "fieldName",
        "Lj93/d;",
        "kClass",
        "Lj93/w;",
        "",
        "findComparableMemberProperty$stream_chat_android_core",
        "(Ljava/lang/String;Lj93/d;)Lj93/w;",
        "findComparableMemberProperty",
        "any",
        "findComparable$stream_chat_android_core",
        "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;",
        "findComparable",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final findComparable$stream_chat_android_core(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Comparable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "any"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getMembers()Ljava/util/Collection;

    move-result-object v0

    invoke-static {p2}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->snakeToLowerCamelCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->lowerCamelCaseToGetter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lj93/c;

    invoke-interface {v4}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {v4}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :cond_2
    :goto_0
    check-cast v2, Lj93/c;

    if-eqz v2, :cond_3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v2, p1}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v3

    :goto_1
    instance-of p2, p1, Ljava/lang/Comparable;

    if-eqz p2, :cond_4

    check-cast p1, Ljava/lang/Comparable;

    return-object p1

    :cond_4
    return-object v3
.end method

.method public final findComparableMemberProperty$stream_chat_android_core(Ljava/lang/String;Lj93/d;)Lj93/w;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lj93/d;",
            ")",
            "Lj93/w;"
        }
    .end annotation

    const-string v0, "fieldName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lj93/d;->getMembers()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lj93/w;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->snakeToLowerCamelCase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/extensions/StringExtensionsKt;->lowerCamelCaseToGetter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj93/w;

    invoke-interface {v2}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {v2}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_1
    check-cast v1, Lj93/w;

    return-object v1
.end method
