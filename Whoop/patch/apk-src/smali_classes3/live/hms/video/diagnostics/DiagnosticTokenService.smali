.class public final Llive/hms/video/diagnostics/DiagnosticTokenService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ$\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Llive/hms/video/diagnostics/DiagnosticTokenService;",
        "",
        "<init>",
        "()V",
        "",
        "region",
        "userId",
        "Lud3/o0;",
        "makeDiagnosticTokenRequest",
        "(Ljava/lang/String;Ljava/lang/String;)Lud3/o0;",
        "Llive/hms/video/diagnostics/models/DiagnosticTokenResponse;",
        "getDiagnosticRoomToken",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "TAG",
        "Ljava/lang/String;",
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
.field public static final INSTANCE:Llive/hms/video/diagnostics/DiagnosticTokenService;

.field private static final TAG:Ljava/lang/String; = "GetDiagnosticTokenService"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/diagnostics/DiagnosticTokenService;

    invoke-direct {v0}, Llive/hms/video/diagnostics/DiagnosticTokenService;-><init>()V

    sput-object v0, Llive/hms/video/diagnostics/DiagnosticTokenService;->INSTANCE:Llive/hms/video/diagnostics/DiagnosticTokenService;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final makeDiagnosticTokenRequest(Ljava/lang/String;Ljava/lang/String;)Lud3/o0;
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "https://api.100ms.live/v2/diagnostics/token?region="

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "https://api.100ms.live/v2/diagnostics/token"

    :goto_1
    new-instance p2, Lud3/n0;

    invoke-direct {p2}, Lud3/n0;-><init>()V

    invoke-virtual {p2, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    const-string p1, "Accept-Type"

    const-string v0, "application/json"

    invoke-virtual {p2, p1, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, p2}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Request to get diagnostic token: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "GetDiagnosticTokenService"

    invoke-static {v0, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final getDiagnosticRoomToken(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/diagnostics/models/DiagnosticTokenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Llive/hms/video/diagnostics/DiagnosticTokenService;->makeDiagnosticTokenRequest(Ljava/lang/String;Ljava/lang/String;)Lud3/o0;

    move-result-object p1

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    sget-object v0, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    invoke-virtual {v0}, Llive/hms/video/factories/OkHttpFactory;->getClient()Lud3/l0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    new-instance v0, Llive/hms/video/diagnostics/DiagnosticTokenService$getDiagnosticRoomToken$2;

    invoke-direct {v0, p2}, Llive/hms/video/diagnostics/DiagnosticTokenService$getDiagnosticRoomToken$2;-><init>(Lbc3/s;)V

    invoke-virtual {p1, v0}, Lzd3/o;->d(Lud3/k;)V

    invoke-virtual {p2, p3}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
