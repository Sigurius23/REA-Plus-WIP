.class public abstract La63/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo63/a;

.field public static final b:Lo63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo63/a;

    const-string v1, "UploadProgressListenerAttributeKey"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/e;->a:Lo63/a;

    new-instance v0, Lo63/a;

    const-string v1, "DownloadProgressListenerAttributeKey"

    invoke-direct {v0, v1}, Lo63/a;-><init>(Ljava/lang/String;)V

    sput-object v0, La63/e;->b:Lo63/a;

    return-void
.end method
