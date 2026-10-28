.class Lcom/whoop/whooplive/selfie/SelfieActivity$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/whooplive/selfie/SelfieActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$a;->w:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$a;->w:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->x0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    return-void
.end method
