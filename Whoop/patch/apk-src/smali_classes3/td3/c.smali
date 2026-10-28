.class public final Ltd3/c;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# instance fields
.field public a:J

.field public final synthetic b:Ltd3/d;


# direct methods
.method public constructor <init>(Ltd3/d;)V
    .locals 0

    iput-object p1, p0, Ltd3/c;->b:Ltd3/d;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBatchScanResults(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Ltd3/c;->b:Ltd3/d;

    iget-object v0, v0, Ltd3/a;->i:Landroid/os/Handler;

    new-instance v1, Lr5/b;

    const/16 v2, 0xd

    invoke-direct {v1, v2, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onScanFailed(I)V
    .locals 3

    iget-object v0, p0, Ltd3/c;->b:Ltd3/d;

    iget-object v0, v0, Ltd3/a;->i:Landroid/os/Handler;

    new-instance v1, Lb9/g0;

    const/16 v2, 0x8

    invoke-direct {v1, p0, p1, v2}, Lb9/g0;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 3

    iget-object v0, p0, Ltd3/c;->b:Ltd3/d;

    iget-object v0, v0, Ltd3/a;->i:Landroid/os/Handler;

    new-instance v1, Landroidx/profileinstaller/a;

    const/4 v2, 0x5

    invoke-direct {v1, p0, p2, p1, v2}, Landroidx/profileinstaller/a;-><init>(Ljava/lang/Object;Landroid/os/Parcelable;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
