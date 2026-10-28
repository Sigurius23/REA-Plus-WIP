.class public final synthetic Lno/nordicsemi/android/dfu/internal/scanner/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScanner;


# direct methods
.method public synthetic constructor <init>(Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScanner;JI)V
    .locals 0

    iput p4, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->w:I

    iput-object p1, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->y:Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScanner;

    iput-wide p2, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->x:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->y:Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScanner;

    check-cast v0, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerJB;

    iget-wide v1, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->x:J

    invoke-static {v0, v1, v2}, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerJB;->a(Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerJB;J)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->y:Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScanner;

    check-cast v0, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerLollipop;

    iget-wide v1, p0, Lno/nordicsemi/android/dfu/internal/scanner/a;->x:J

    invoke-static {v0, v1, v2}, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerLollipop;->a(Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerLollipop;J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
