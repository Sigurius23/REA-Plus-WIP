.class final Ly42/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmd3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/d;->o0(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
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


# instance fields
.field final synthetic w:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ly42/d$d;->w:Lbc3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ly42/d$d;->w:Lbc3/k;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
