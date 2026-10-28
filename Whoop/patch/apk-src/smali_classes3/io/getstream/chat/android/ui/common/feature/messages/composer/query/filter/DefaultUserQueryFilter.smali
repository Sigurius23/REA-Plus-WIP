.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter<",
        "Lio/getstream/chat/android/models/User;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J+\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;",
        "Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;",
        "transliterator",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V",
        "",
        "items",
        "",
        "query",
        "filter",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;",
        "queryFormatter",
        "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final logger$delegate:Ll83/h;

.field private final queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V
    .locals 5

    const-string v0, "transliterator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "Chat:QueryFilter"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;->logger$delegate:Ll83/h;

    .line 4
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;

    .line 5
    new-instance v1, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Lowercase;

    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;

    invoke-direct {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/IgnoreDiacritics;-><init>()V

    .line 8
    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;

    invoke-direct {v3, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Transliterate;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V

    const/4 p1, 0x3

    new-array p1, p1, [Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;

    const/4 v4, 0x0

    aput-object v1, p1, v4

    const/4 v1, 0x1

    aput-object v2, p1, v1

    const/4 v1, 0x2

    aput-object v3, p1, v1

    .line 9
    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;-><init>([Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;->queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 10
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/DefaultStreamTransliterator;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/transliteration/StreamTransliterator;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final filter(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const-string v5, "[filter] query: \""

    const-string v6, "\", items.size: "

    invoke-static {v1, v5, p2, v6}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;->queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/User;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter;->queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/Combine;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    const/4 v5, 0x0

    invoke-static {v2, p2, v5, v5, v3}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v2

    if-ltz v2, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    move-object v3, v4

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/DefaultUserQueryFilter$filter$$inlined$sortedBy$1;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/k;

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    return-object p2
.end method
