.class public final Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/helper/DateFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "context",
        "Landroid/content/Context;",
        "locale",
        "Ljava/util/Locale;",
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
.field static final synthetic $$INSTANCE:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic from$default(Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;Landroid/content/Context;Ljava/util/Locale;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    const-string p3, "getDefault(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->from(Landroid/content/Context;Ljava/util/Locale;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final from(Landroid/content/Context;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->from$default(Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;Landroid/content/Context;Ljava/util/Locale;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object p1

    return-object p1
.end method

.method public final from(Landroid/content/Context;Ljava/util/Locale;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    return-object v0
.end method
