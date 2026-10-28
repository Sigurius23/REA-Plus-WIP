.class public final Llive/hms/video/error/ErrorFactory$AudioOutputErrors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/error/ErrorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioOutputErrors"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Llive/hms/video/error/ErrorFactory$AudioOutputErrors;",
        "",
        "<init>",
        "()V",
        "bluetoothScoInitFailure",
        "Llive/hms/video/error/HMSException;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Llive/hms/video/error/ErrorFactory$AudioOutputErrors;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/error/ErrorFactory$AudioOutputErrors;

    invoke-direct {v0}, Llive/hms/video/error/ErrorFactory$AudioOutputErrors;-><init>()V

    sput-object v0, Llive/hms/video/error/ErrorFactory$AudioOutputErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$AudioOutputErrors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bluetoothScoInitFailure()Llive/hms/video/error/HMSException;
    .locals 9

    new-instance v0, Llive/hms/video/error/HMSException;

    sget-object v1, Llive/hms/video/error/HMSAction;->AUDIO_OUTPUT:Llive/hms/video/error/HMSAction;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/Throwable;

    const-string v1, "Bluetooth Connection Init Failed"

    invoke-direct {v6, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x1b5d

    const-string v2, "BluetoothScoInitFailed"

    const-string v4, "Bluetooth Connection Init Failed"

    const-string v5, "bluetooth headset is not available or in a processing state"

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v8}, Llive/hms/video/error/HMSException;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZLjava/util/HashMap;)V

    return-object v0
.end method
