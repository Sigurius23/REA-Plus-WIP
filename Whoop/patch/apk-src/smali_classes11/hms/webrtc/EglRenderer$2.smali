.class Lhms/webrtc/EglRenderer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/EglRenderer;->init(Lhms/webrtc/EglBase$Context;[ILhms/webrtc/RendererCommon$GlDrawer;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/EglRenderer;


# direct methods
.method public constructor <init>(Lhms/webrtc/EglRenderer;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/EglRenderer$2;->this$0:Lhms/webrtc/EglRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lhms/webrtc/EglRenderer$2;->this$0:Lhms/webrtc/EglRenderer;

    invoke-static {v0}, Lhms/webrtc/EglRenderer;->l(Lhms/webrtc/EglRenderer;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhms/webrtc/EglRenderer$2;->this$0:Lhms/webrtc/EglRenderer;

    invoke-static {v1}, Lhms/webrtc/EglRenderer;->o(Lhms/webrtc/EglRenderer;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
