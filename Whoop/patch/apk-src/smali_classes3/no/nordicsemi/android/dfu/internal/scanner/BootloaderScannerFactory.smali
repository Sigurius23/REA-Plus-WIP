.class public final Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ADDRESS_DIFF:I = 0x1


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getIncrementedAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0xf

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/16 v2, 0x10

    invoke-static {p0, v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    and-int/lit16 p0, p0, 0xff

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v2, "%02X"

    invoke-static {v1, v2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getScanner(Ljava/lang/String;)Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScanner;
    .locals 2

    invoke-static {p0}, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerFactory;->getIncrementedAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerLollipop;

    invoke-direct {v1, p0, v0}, Lno/nordicsemi/android/dfu/internal/scanner/BootloaderScannerLollipop;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
