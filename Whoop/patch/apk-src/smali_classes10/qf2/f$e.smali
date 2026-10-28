.class final Lqf2/f$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf2/f;->r(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepository"
    f = "SetSmartAlarmRepository.kt"
    l = {
        0x38,
        0x3b,
        0x45,
        0x47
    }
    m = "setExactTimeAlarmOnStrap"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Z

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqf2/f;


# direct methods
.method public constructor <init>(Lqf2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqf2/f;",
            "Lq83/d<",
            "-",
            "Lqf2/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqf2/f$e;->z:Lqf2/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqf2/f$e;->y:Ljava/lang/Object;

    iget p1, p0, Lqf2/f$e;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqf2/f$e;->E:I

    iget-object p1, p0, Lqf2/f$e;->z:Lqf2/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqf2/f;->r(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
