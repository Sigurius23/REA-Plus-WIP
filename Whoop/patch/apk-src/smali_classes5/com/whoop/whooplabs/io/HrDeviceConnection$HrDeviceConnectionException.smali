.class public final Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HrDeviceConnectionException"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "Lcom/whoop/design/util/TextResource;",
        "error",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;)V",
        "w",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "()Lcom/whoop/design/util/TextResource;",
        "whooplabs_release"
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
.field private final w:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;->w:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;->w:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method
