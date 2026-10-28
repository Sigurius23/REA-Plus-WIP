.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EmptyFunctions"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;",
        "",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "",
        "ONE_PARAM",
        "Lkotlin/jvm/functions/Function1;",
        "getONE_PARAM",
        "()Lkotlin/jvm/functions/Function1;",
        "Lkotlin/Function2;",
        "TWO_PARAM",
        "Lc93/m;",
        "getTWO_PARAM",
        "()Lc93/m;",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

.field private static final ONE_PARAM:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private static final TWO_PARAM:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->ONE_PARAM:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/x;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->TWO_PARAM:Lc93/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final ONE_PARAM$lambda$0(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final TWO_PARAM$lambda$1(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->ONE_PARAM$lambda$0(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->TWO_PARAM$lambda$1(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final getONE_PARAM()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->ONE_PARAM:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getTWO_PARAM()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->TWO_PARAM:Lc93/m;

    return-object v0
.end method
