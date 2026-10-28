.class public final Loy1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loy1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Loy1/b;",
        "",
        "Lic/p0;",
        "workManager",
        "<init>",
        "(Lic/p0;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Lic/p0;",
        "b",
        "metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Loy1/b$a;


# instance fields
.field private final a:Lic/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loy1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Loy1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Loy1/b;->b:Loy1/b$a;

    return-void
.end method

.method public constructor <init>(Lic/p0;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loy1/b;->a:Lic/p0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Loy1/b;->a:Lic/p0;

    sget-object v1, Lic/k;->w:Lic/k;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v3, Lic/j0;

    const-class v4, Lcom/whoop/metrics/worker/StorageMetricsWorker;

    const-wide/16 v5, 0xf

    invoke-direct {v3, v4, v5, v6, v2}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {v3}, Lic/q0;->b()Lic/r0;

    move-result-object v2

    check-cast v2, Lic/k0;

    const-string v3, "PERIODIC_STORAGE_METRICS_WORK"

    invoke-virtual {v0, v3, v1, v2}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    return-void
.end method
