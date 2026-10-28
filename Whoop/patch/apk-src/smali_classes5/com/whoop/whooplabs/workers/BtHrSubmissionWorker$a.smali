.class public final Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;",
        "",
        "<init>",
        "()V",
        "Lc12/d;",
        "b",
        "()Lc12/d;",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/NotificationManager;",
        "manager",
        "Ll83/a0;",
        "c",
        "(Landroid/content/Context;Landroid/app/NotificationManager;)V",
        "whooplabs_release"
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
    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;)Lc12/d;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;->b()Lc12/d;

    move-result-object p0

    return-object p0
.end method

.method private final b()Lc12/d;
    .locals 4

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->LOW:Lc12/b;

    const-string v2, "06625_WhoopLabs"

    sget v3, Lyw2/e;->v:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final c(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;->b()Lc12/d;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    return-void
.end method
