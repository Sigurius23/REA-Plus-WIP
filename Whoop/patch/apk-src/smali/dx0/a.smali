.class public final Ldx0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt0/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R \u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0013\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Ldx0/a;",
        "Ldt0/d;",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ldx0/b;",
        "dataSyncServiceManager",
        "Lmx0/c;",
        "highWatermarkHelper",
        "<init>",
        "(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Ldx0/b;Lmx0/c;)V",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "triggerSource",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Ltr2/n;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ldx0/b;",
        "d",
        "Lmx0/c;",
        "Lec3/f2;",
        "",
        "e",
        "Lec3/f2;",
        "()Lec3/f2;",
        "highWaterMark",
        "data-sync-service_release"
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
.field private final a:Ltr2/n;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ldx0/b;

.field private final d:Lmx0/c;

.field private final e:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Ldx0/b;Lmx0/c;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncServiceManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highWatermarkHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldx0/a;->a:Ltr2/n;

    iput-object p2, p0, Ldx0/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Ldx0/a;->c:Ldx0/b;

    iput-object p4, p0, Ldx0/a;->d:Lmx0/c;

    invoke-virtual {p4}, Lmx0/c;->f()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Ldx0/a;->e:Lec3/f2;

    return-void
.end method


# virtual methods
.method public a()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Ldx0/a;->e:Lec3/f2;

    return-object v0
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ldx0/a;->d:Lmx0/c;

    invoke-virtual {v0, p1}, Lmx0/c;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V
    .locals 3

    const-string v0, "triggerSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldx0/a;->a:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Sending sync event from source: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Ldx0/a;->c:Ldx0/b;

    invoke-virtual {v0, p1}, Ldx0/b;->p(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V

    return-void
.end method
