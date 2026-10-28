.class final Lx82/i$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx82/i;->G(JLq83/d;)Ljava/lang/Object;
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
        0x11f
    }
    m = "shouldShowBatteryNotification"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lx82/i;

.field F:I

.field w:J

.field x:I

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx82/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx82/i;",
            "Lq83/d<",
            "-",
            "Lx82/i$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx82/i$d;->E:Lx82/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lx82/i$d;->z:Ljava/lang/Object;

    iget p1, p0, Lx82/i$d;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx82/i$d;->F:I

    iget-object p1, p0, Lx82/i$d;->E:Lx82/i;

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p0}, Lx82/i;->o(Lx82/i;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
