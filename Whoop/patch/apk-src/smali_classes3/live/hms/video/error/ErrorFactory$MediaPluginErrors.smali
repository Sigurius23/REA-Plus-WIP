.class public final Llive/hms/video/error/ErrorFactory$MediaPluginErrors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/error/ErrorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaPluginErrors"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tJ\u0018\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/error/ErrorFactory$MediaPluginErrors;",
        "",
        "<init>",
        "()V",
        "PlatformNotSupported",
        "Llive/hms/video/error/HMSException;",
        "action",
        "Llive/hms/video/error/HMSAction;",
        "description",
        "",
        "InitFailed",
        "ProcessingFailed",
        "AddAlreadyInProgress",
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
.field public static final INSTANCE:Llive/hms/video/error/ErrorFactory$MediaPluginErrors;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;

    invoke-direct {v0}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;-><init>()V

    sput-object v0, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$MediaPluginErrors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic AddAlreadyInProgress$default(Llive/hms/video/error/ErrorFactory$MediaPluginErrors;Llive/hms/video/error/HMSAction;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->AddAlreadyInProgress(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic InitFailed$default(Llive/hms/video/error/ErrorFactory$MediaPluginErrors;Llive/hms/video/error/HMSAction;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->InitFailed(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic PlatformNotSupported$default(Llive/hms/video/error/ErrorFactory$MediaPluginErrors;Llive/hms/video/error/HMSAction;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->PlatformNotSupported(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ProcessingFailed$default(Llive/hms/video/error/ErrorFactory$MediaPluginErrors;Llive/hms/video/error/HMSAction;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/error/HMSException;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->ProcessingFailed(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final AddAlreadyInProgress(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/16 v2, 0x1b5c

    const-string v3, "AddAlreadyInProgress"

    const-string v5, "Plugin add already in progress"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final InitFailed(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/16 v2, 0x1b5a

    const-string v3, "InitFailed"

    const-string v5, "Plugin init failed"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final PlatformNotSupported(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/16 v2, 0x1b59

    const-string v3, "PlatformNotSupported"

    const-string v5, "Check HMS Docs to see the list of supported platforms"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final ProcessingFailed(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;
    .locals 12

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/error/HMSException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/16 v2, 0x1b5b

    const-string v3, "ProcessingFailed"

    const-string v5, "Plugin processing failed"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    invoke-direct/range {v1 .. v11}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
