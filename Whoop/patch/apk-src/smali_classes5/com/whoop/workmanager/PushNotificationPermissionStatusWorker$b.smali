.class final Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;->j(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.workmanager.PushNotificationPermissionStatusWorker"
    f = "PushNotificationPermissionStatusWorker.kt"
    l = {
        0x20
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;->y:Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;->x:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;->z:I

    iget-object p1, p0, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker$b;->y:Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
