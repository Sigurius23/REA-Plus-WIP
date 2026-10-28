.class public final Lcom/whoop/util/LocalLogExportFileWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/util/LocalLogExportFileWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/util/LocalLogExportFileWorker$a;",
        "",
        "<init>",
        "()V",
        "Lic/k0;",
        "a",
        "()Lic/k0;",
        "Lic/p0;",
        "workManager",
        "Lic/e0;",
        "b",
        "(Lic/p0;)Lic/e0;",
        "",
        "WORK_NAME",
        "Ljava/lang/String;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/util/LocalLogExportFileWorker$a;-><init>()V

    return-void
.end method

.method private final a()Lic/k0;
    .locals 3

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/time/Duration;->ofDays(J)Ljava/time/Duration;

    move-result-object v0

    const-string v1, "ofDays(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/util/LocalLogExportFileWorker;

    invoke-direct {v1, v2, v0}, Lic/j0;-><init>(Ljava/lang/Class;Ljava/time/Duration;)V

    invoke-virtual {v1}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    return-object v0
.end method


# virtual methods
.method public final b(Lic/p0;)Lic/e0;
    .locals 3

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/k;->w:Lic/k;

    invoke-direct {p0}, Lcom/whoop/util/LocalLogExportFileWorker$a;->a()Lic/k0;

    move-result-object v1

    const-string v2, "delete-past-log-export-files"

    invoke-virtual {p1, v2, v0, v1}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    move-result-object p1

    return-object p1
.end method
