.class final Lcom/whoop/whooplabs/io/HrDeviceConnection$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection;->y(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.io.HrDeviceConnection"
    f = "HrDeviceConnection.kt"
    l = {
        0x105,
        0x60
    }
    m = "connectToDeviceWithFix"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcom/whoop/whooplabs/io/HrDeviceConnection;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->F:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->E:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->G:I

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$e;->F:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->d(Lcom/whoop/whooplabs/io/HrDeviceConnection;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
