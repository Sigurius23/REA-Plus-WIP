.class public final Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;
.super Lxg3/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->e0(Lp92/e;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lxg3/s;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/whoop/realtime/presentation/RealTimeFinishPromptActivity$c",
        "Lxg3/s;",
        "",
        "Ll83/a0;",
        "onCompleted",
        "()V",
        "",
        "e",
        "onError",
        "(Ljava/lang/Throwable;)V",
        "aBoolean",
        "g",
        "(Z)V",
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


# instance fields
.field final synthetic E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

.field final synthetic F:Lp92/e;

.field final synthetic G:J


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;J)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iput-object p2, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->F:Lp92/e;

    iput-wide p3, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->G:J

    invoke-direct {p0}, Lxg3/s;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Z)V
    .locals 0

    return-void
.end method

.method public onCompleted()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->P(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;)Lp92/c;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->F:Lp92/e;

    invoke-virtual {v1}, Lp92/e;->c()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->G:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lp92/c;->d(JJ)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->S(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->Q(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Batch uploading of Gps data is completed"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->P(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;)Lp92/c;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->F:Lp92/e;

    invoke-virtual {v1}, Lp92/e;->c()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->G:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lp92/c;->i(JJ)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->S(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->E:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->Q(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Error occurred while uploading Gps data"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity$c;->g(Z)V

    return-void
.end method
