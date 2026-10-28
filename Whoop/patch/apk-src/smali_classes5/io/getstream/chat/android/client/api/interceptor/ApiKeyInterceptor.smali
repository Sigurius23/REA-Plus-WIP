.class public final Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor;",
        "Lud3/g0;",
        "",
        "apiKey",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lud3/f0;",
        "chain",
        "Lud3/x0;",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "Ljava/lang/String;",
        "Companion",
        "stream-chat-android-client_release"
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
.field public static final Companion:Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor$Companion;

.field private static final PARAM_API_KEY:Ljava/lang/String; = "api_key"


# instance fields
.field private final apiKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor;->Companion:Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "apiKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor;->apiKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 4

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    iget-object v1, v0, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v1}, Lud3/e0;->g()Lcom/iterable/iterableapi/v;

    move-result-object v1

    const-string v2, "api_key"

    iget-object v3, p0, Lio/getstream/chat/android/client/api/interceptor/ApiKeyInterceptor;->apiKey:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/iterable/iterableapi/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v1

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    iput-object v1, v0, Lud3/n0;->a:Lud3/e0;

    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p1, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method
