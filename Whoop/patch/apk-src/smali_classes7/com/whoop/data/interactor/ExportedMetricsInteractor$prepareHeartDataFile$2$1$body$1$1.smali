.class public final Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1;
.super Lud3/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "com/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1",
        "Lud3/v0;",
        "Lud3/h0;",
        "contentType",
        "()Lud3/h0;",
        "",
        "contentLength",
        "()J",
        "Lne3/i;",
        "sink",
        "Ll83/a0;",
        "writeTo",
        "(Lne3/i;)V",
        "feature_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lud3/h0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1;->contentType()Lud3/h0;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lne3/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lne3/u;

    invoke-direct {v0, p1}, Lne3/u;-><init>(Lne3/i;)V

    invoke-static {v0}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/data/interactor/ExportedMetricsInteractor$prepareHeartDataFile$2$1$body$1$1;->writeTo(Lne3/i;)V

    invoke-virtual {p1}, Lne3/h0;->close()V

    return-void
.end method
