.class public final Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;
.super Lhj0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;",
        "Lhj0/q;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "q",
        "()Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;",
        "realtime-activity_release"
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
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-direct {p0, p1, v0}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final q()Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$b;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isDiscard"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method
