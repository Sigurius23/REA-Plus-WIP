.class final Lsu0/b$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu0/b;->c(BZIILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.connectivityNotifications.deadbattery.DeadBatteryNotificationMonitorImpl"
    f = "DeadBatteryNotificationMonitorImpl.kt"
    l = {
        0x49,
        0x4d
    }
    m = "evaluateBatteryConditions"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lsu0/b;

.field H:I

.field w:B

.field x:Z

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lsu0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsu0/b;",
            "Lq83/d<",
            "-",
            "Lsu0/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsu0/b$b;->G:Lsu0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lsu0/b$b;->F:Ljava/lang/Object;

    iget p1, p0, Lsu0/b$b;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsu0/b$b;->H:I

    iget-object v0, p0, Lsu0/b$b;->G:Lsu0/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lsu0/b;->a(Lsu0/b;BZIILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
