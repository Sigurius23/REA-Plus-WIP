.class public final Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;
.super Lno/nordicsemi/android/dfu/DfuBaseService;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u0004H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;",
        "Lno/nordicsemi/android/dfu/DfuBaseService;",
        "<init>",
        "()V",
        "Ljava/lang/Class;",
        "Landroid/app/Activity;",
        "getNotificationTarget",
        "()Ljava/lang/Class;",
        "",
        "isDebug",
        "()Z",
        "Lhj0/u;",
        "w",
        "Ll83/h;",
        "i",
        "()Lhj0/u;",
        "whoopConfig",
        "firmware-update-service_release"
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
.field private final w:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lno/nordicsemi/android/dfu/DfuBaseService;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/firmwareUpdateService/strategy/NewDfuService$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/firmwareUpdateService/strategy/NewDfuService$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;->w:Ll83/h;

    return-void
.end method

.method private final i()Lhj0/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhj0/u;

    return-object v0
.end method


# virtual methods
.method public getNotificationTarget()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/strategy/NewDfuService;->i()Lhj0/u;

    move-result-object v0

    invoke-interface {v0}, Lhj0/u;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public isDebug()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
