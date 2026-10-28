.class public final Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
.super Lhj0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/presentation/RealTimeRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0019\u0010\r\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010\"\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\"\u0010\tJ\r\u0010#\u001a\u00020\u0000\u00a2\u0006\u0004\u0008#\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "Lhj0/q;",
        "Landroid/content/Context;",
        "context",
        "Lp92/i;",
        "realTimeStreamController",
        "<init>",
        "(Landroid/content/Context;Lp92/i;)V",
        "y",
        "()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "x",
        "Lcom/whoop/service/network/model/Sport;",
        "sport",
        "z",
        "(Lcom/whoop/service/network/model/Sport;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "Landroid/content/Intent;",
        "f",
        "()Landroid/content/Intent;",
        "Llm2/b;",
        "activity",
        "u",
        "(Llm2/b;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "Lcom/whoop/domain/model/StrainRecoveryMapping;",
        "mapping",
        "w",
        "(Lcom/whoop/domain/model/StrainRecoveryMapping;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "",
        "strainGoal",
        "A",
        "(D)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "",
        "value",
        "v",
        "(Z)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;",
        "s",
        "r",
        "d",
        "Lp92/i;",
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
.field private final d:Lp92/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lp92/i;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realTimeStreamController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {p0, p1, v0}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->d:Lp92/i;

    invoke-virtual {p0}, Lhj0/q;->b()Lhj0/q;

    return-void
.end method

.method public static synthetic q(Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->t(Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;)V

    return-void
.end method

.method private static final t(Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;)V
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->d:Lp92/i;

    invoke-virtual {p0}, Lp92/i;->b()V

    return-void
.end method

.method private final x()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isForNap"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method private final y()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isForSleep"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method private final z(Lcom/whoop/service/network/model/Sport;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "sport"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object p0
.end method


# virtual methods
.method public final A(D)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "strainGoal"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    return-object p0
.end method

.method public f()Landroid/content/Intent;
    .locals 4

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "sport"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->d:Lp92/i;

    invoke-virtual {v0}, Lp92/i;->a()V

    invoke-static {}, Lx82/d;->a()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Llr/e;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Llr/e;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    invoke-super {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final r()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "end"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public final s()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "existingRecording"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public final u(Llm2/b;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llm2/c;

    if-eqz v0, :cond_1

    check-cast p1, Llm2/c;

    invoke-virtual {p1}, Llm2/c;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->x()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->y()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Llm2/d;

    if-eqz v0, :cond_2

    check-cast p1, Llm2/d;

    invoke-virtual {p1}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->z(Lcom/whoop/service/network/model/Sport;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "RealTimeRecordActIntentBuild"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unrecognized activity: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p0
.end method

.method public final v(Z)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isGps"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public final w(Lcom/whoop/domain/model/StrainRecoveryMapping;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "strainMapping"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method
