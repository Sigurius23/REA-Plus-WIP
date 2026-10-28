.class final synthetic Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lkotlin/jvm/functions/Function3;"
    }
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Ljava/lang/Object;Ljava/lang/Object;)V"

    const/4 v5, 0x4

    const/4 v1, 0x3

    const-class v2, Ll83/k;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/ChannelData;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p3, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->Companion:Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion;

    .line 2
    new-instance p3, Ll83/k;

    invoke-direct {p3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    check-cast p2, Ljava/util/Date;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$5$3;->invoke(Lio/getstream/chat/android/models/ChannelData;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
