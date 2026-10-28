.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt;->withQueryFormatter(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $delegate:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

.field final synthetic $queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;->$queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;->$delegate:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;->$queryFormatter:Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/query/formatter/QueryFormatter;->format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandlerKt$withQueryFormatter$1;->$delegate:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;->handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
