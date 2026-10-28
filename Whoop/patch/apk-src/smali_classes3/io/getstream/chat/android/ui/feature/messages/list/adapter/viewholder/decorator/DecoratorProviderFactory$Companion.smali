.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;",
        "",
        "<init>",
        "()V",
        "defaultFactory",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;",
        "predicate",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "",
        "stream-chat-android-ui-components_release"
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;->defaultFactory$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;)Z

    return-void
.end method

.method public static synthetic defaultFactory$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p2, 0x15

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;->defaultFactory(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;

    move-result-object p0

    return-object p0
.end method

.method private static final defaultFactory$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final defaultFactory(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method
