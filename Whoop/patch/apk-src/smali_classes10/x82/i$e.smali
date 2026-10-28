.class final Lx82/i$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx82/i;->H(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.StrapBatteryMonitor"
    f = "StrapBatteryMonitor.kt"
    l = {
        0x105,
        0x108
    }
    m = "showFullBatteryNotification"
    v = 0x2
.end annotation


# instance fields
.field w:J

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lx82/i;

.field z:I


# direct methods
.method public constructor <init>(Lx82/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx82/i;",
            "Lq83/d<",
            "-",
            "Lx82/i$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx82/i$e;->y:Lx82/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx82/i$e;->x:Ljava/lang/Object;

    iget p1, p0, Lx82/i$e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx82/i$e;->z:I

    iget-object p1, p0, Lx82/i$e;->y:Lx82/i;

    invoke-static {p1, p0}, Lx82/i;->p(Lx82/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
