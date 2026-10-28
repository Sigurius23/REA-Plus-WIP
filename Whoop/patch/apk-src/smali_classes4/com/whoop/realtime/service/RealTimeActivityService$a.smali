.class Lcom/whoop/realtime/service/RealTimeActivityService$a;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/service/RealTimeActivityService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic f:Lcom/whoop/realtime/service/RealTimeActivityService;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService$a;->f:Lcom/whoop/realtime/service/RealTimeActivityService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/realtime/service/RealTimeActivityService;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService$a;->f:Lcom/whoop/realtime/service/RealTimeActivityService;

    return-object v0
.end method
