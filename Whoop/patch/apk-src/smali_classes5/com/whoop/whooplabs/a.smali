.class public final Lcom/whoop/whooplabs/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/whooplabs/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
        "campaign",
        "Lcom/whoop/whooplabs/WhoopLabsService;",
        "c",
        "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "Ltr2/n;",
        "b",
        "Ltr2/n;",
        "logger",
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


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplabs/a;->a:Landroid/content/Context;

    const-string p1, "WhoopLabsServiceConnector"

    invoke-static {p1}, Lnz2/b;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplabs/a;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/whooplabs/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/whooplabs/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplabs/a;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final c(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/WhoopLabsService;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/a;->b:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Starting BleDeviceScannerService service"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/whoop/whooplabs/a;->a:Landroid/content/Context;

    const-class v3, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v2, p0, Lcom/whoop/whooplabs/a;->b:Ltr2/n;

    const-string v3, "Calling startService"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v3, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v1, "labs_campaign"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/whoop/whooplabs/a;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    new-instance p1, Lcom/whoop/whooplabs/a$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/whoop/whooplabs/a$a;-><init>(Lcom/whoop/whooplabs/a;Lq83/d;)V

    const-wide/16 v0, 0x3e8

    invoke-static {v0, v1, p1, p2}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
