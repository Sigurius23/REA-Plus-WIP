.class public final Llive/hms/video/utils/LayoutUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/utils/LayoutUtils;",
        "",
        "<init>",
        "()V",
        "",
        "token",
        "Llive/hms/video/signal/init/LayoutRequestOptions;",
        "layoutRequestOptions",
        "Llive/hms/video/utils/HMSAgentOs;",
        "agentOs",
        "Llive/hms/video/signal/init/HMSRoomLayout;",
        "getLayout",
        "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/init/HMSLayoutListener;",
        "hmsLayoutConfigListener",
        "Ll83/a0;",
        "getLayoutConfigByToken",
        "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;Llive/hms/video/utils/HMSAgentOs;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Llive/hms/video/utils/LayoutUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/utils/LayoutUtils;

    invoke-direct {v0}, Llive/hms/video/utils/LayoutUtils;-><init>()V

    sput-object v0, Llive/hms/video/utils/LayoutUtils;->INSTANCE:Llive/hms/video/utils/LayoutUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLayout(Llive/hms/video/utils/LayoutUtils;Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/utils/LayoutUtils;->getLayout(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLayout(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/init/LayoutRequestOptions;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/init/HMSRoomLayout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p4}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p4

    const/4 v1, 0x1

    invoke-direct {v0, v1, p4}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    sget-object p4, Llive/hms/video/events/HMSApiClient;->INSTANCE:Llive/hms/video/events/HMSApiClient;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Llive/hms/video/signal/init/LayoutRequestOptions;->getEndpoint()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p4, p1, p2, p3}, Llive/hms/video/events/HMSApiClient;->makeLayoutRequest$lib_release(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;

    move-result-object p1

    sget-object p2, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    invoke-virtual {p2}, Llive/hms/video/factories/OkHttpFactory;->getClient()Lud3/l0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    invoke-virtual {p1}, Lzd3/o;->e()Lud3/x0;

    move-result-object p1

    iget-object p2, p1, Lud3/x0;->G:Lud3/a1;

    :try_start_0
    iget-boolean p3, p1, Lud3/x0;->Q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p4, ""

    if-eqz p3, :cond_3

    :try_start_1
    iget v1, p1, Lud3/x0;->z:I

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p4, p2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_4

    :cond_2
    :goto_1
    sget-object p2, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p2}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p2

    const-class p3, Llive/hms/video/signal/init/HMSRoomLayout;

    invoke-virtual {p2, p4, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llive/hms/video/signal/init/HMSRoomLayout;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object p3, Llive/hms/video/utils/LayoutUtils$getLayout$2$1$1;->INSTANCE:Llive/hms/video/utils/LayoutUtils$getLayout$2$1$1;

    invoke-virtual {v0, p2, p3}, Lbc3/m;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    :cond_3
    if-nez p3, :cond_6

    if-eqz p2, :cond_6

    sget-object p3, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p3}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p3

    invoke-virtual {p2}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    move-object p2, p4

    :cond_4
    const-class v1, Llive/hms/video/signal/init/ErrorTokenResult;

    invoke-virtual {p3, p2, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llive/hms/video/signal/init/ErrorTokenResult;

    sget-object v1, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    iget v2, p1, Lud3/x0;->z:I

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->GET_LAYOUT_CONFIG:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {p2}, Llive/hms/video/signal/init/ErrorTokenResult;->getErrorMessage()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    move-object v4, p4

    goto :goto_2

    :cond_5
    move-object v4, p2

    :goto_2
    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Llive/hms/video/error/ErrorFactory$APIErrors;->HTTPError$default(Llive/hms/video/error/ErrorFactory$APIErrors;ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p2

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {v0, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->GET_LAYOUT_CONFIG:Llive/hms/video/error/ErrorFactory$Action;

    const-string v3, "An error occurred while fetching the layout config. Please look into logs for more details."

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p2

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {v0, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_3
    invoke-virtual {p1}, Lud3/x0;->close()V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1

    :goto_4
    :try_start_2
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object p3, v0

    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p3
.end method


# virtual methods
.method public final getLayoutConfigByToken(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;Llive/hms/video/utils/HMSAgentOs;)V
    .locals 7

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsLayoutConfigListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "agentOs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/utils/LayoutUtils$getLayoutConfigByToken$1;

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Llive/hms/video/utils/LayoutUtils$getLayoutConfigByToken$1;-><init>(Llive/hms/video/signal/init/HMSLayoutListener;Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
