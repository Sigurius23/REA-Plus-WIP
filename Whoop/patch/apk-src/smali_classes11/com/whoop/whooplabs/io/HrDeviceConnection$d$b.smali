.class final Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final w:Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;

    invoke-direct {v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;-><init>()V

    sput-object v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;->w:Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
