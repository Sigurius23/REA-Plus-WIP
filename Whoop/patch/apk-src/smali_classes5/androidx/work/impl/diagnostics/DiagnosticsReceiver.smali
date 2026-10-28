.class public Landroidx/work/impl/diagnostics/DiagnosticsReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DiagnosticsRcvr"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/diagnostics/DiagnosticsReceiver;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p2

    const-string v0, "Requesting diagnostics"

    sget-object v1, Landroidx/work/impl/diagnostics/DiagnosticsReceiver;->a:Ljava/lang/String;

    invoke-virtual {p2, v1, v0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/v;->g(Landroid/content/Context;)Ljc/v;

    move-result-object p1

    const-class p2, Landroidx/work/impl/workers/DiagnosticsWorker;

    new-instance v0, Lic/z;

    invoke-direct {v0, p2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object p2

    check-cast p2, Lic/a0;

    invoke-virtual {p1, p2}, Lic/p0;->c(Lic/r0;)Lic/e0;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p2

    const-string v0, "WorkManager is not initialized"

    invoke-virtual {p2, v1, v0, p1}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
