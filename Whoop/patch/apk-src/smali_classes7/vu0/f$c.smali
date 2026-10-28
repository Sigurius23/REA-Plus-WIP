.class final Lvu0/f$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvu0/f;->c(Lb12/c;Lst0/v;Lb12/d;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.connectivityNotifications.lowbattery.StreakLowBatteryNotificationResolver"
    f = "StreakLowBatteryNotificationResolver.kt"
    l = {
        0x1a
    }
    m = "resolve"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lvu0/f;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lvu0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvu0/f;",
            "Lq83/d<",
            "-",
            "Lvu0/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvu0/f$c;->F:Lvu0/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvu0/f$c;->E:Ljava/lang/Object;

    iget p1, p0, Lvu0/f$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvu0/f$c;->G:I

    iget-object p1, p0, Lvu0/f$c;->F:Lvu0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lvu0/f;->c(Lb12/c;Lst0/v;Lb12/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
