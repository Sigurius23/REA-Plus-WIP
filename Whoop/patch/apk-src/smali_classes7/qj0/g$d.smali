.class final Lqj0/g$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/g;->f0(ZLq83/d;)Ljava/lang/Object;
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
        0x66,
        0x67,
        0x68,
        0x6e,
        0x71,
        0x73,
        0x74,
        0x79,
        0x7a,
        0x7d,
        0x82,
        0x83,
        0x84,
        0x88,
        0x89,
        0x8b,
        0x90,
        0x91,
        0x93
    }
    m = "runPhases"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lqj0/g;

.field J:I

.field w:Z

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqj0/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj0/g;",
            "Lq83/d<",
            "-",
            "Lqj0/g$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj0/g$d;->I:Lqj0/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqj0/g$d;->H:Ljava/lang/Object;

    iget p1, p0, Lqj0/g$d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqj0/g$d;->J:I

    iget-object p1, p0, Lqj0/g$d;->I:Lqj0/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lqj0/g;->s(Lqj0/g;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
