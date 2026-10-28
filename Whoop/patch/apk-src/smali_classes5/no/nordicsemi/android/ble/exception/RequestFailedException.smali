.class public final Lno/nordicsemi/android/ble/exception/RequestFailedException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final w:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const-string v0, "Request failed with status "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput p1, p0, Lno/nordicsemi/android/ble/exception/RequestFailedException;->w:I

    return-void
.end method
