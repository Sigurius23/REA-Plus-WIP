.class final Lqj0/g$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/g;->a0(Lmj0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ble.device.WhoopDeviceBle"
    f = "WhoopDeviceBle.kt"
    l = {
        0xb5,
        0xb6
    }
    m = "failed"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lqj0/g;

.field z:I


# direct methods
.method public constructor <init>(Lqj0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj0/g;",
            "Lq83/d<",
            "-",
            "Lqj0/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj0/g$c;->y:Lqj0/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqj0/g$c;->x:Ljava/lang/Object;

    iget p1, p0, Lqj0/g$c;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqj0/g$c;->z:I

    iget-object p1, p0, Lqj0/g$c;->y:Lqj0/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lqj0/g;->a(Lqj0/g;Lmj0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
