.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt;->toUserLookupHandler(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;
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
.field final synthetic $this_toUserLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1;->$this_toUserLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleUserLookup(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1;->$this_toUserLookupHandler:Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;

    new-instance v1, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v2, 0x1

    invoke-direct {v1, v2, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v1}, Lbc3/m;->s()V

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1$1$cancelable$1;

    invoke-direct {p2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1$1$cancelable$1;-><init>(Lbc3/k;)V

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;->handleCompatUserLookup(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lc93/a;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1$1$1;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandlerKt$toUserLookupHandler$1$1$1;-><init>(Lc93/a;)V

    invoke-virtual {v1, p2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
