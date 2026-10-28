.class final Lqf2/g$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf2/g;->a(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.smart.alarm.data.repository.SetSmartAlarmRepositoryKt"
    f = "SetSmartAlarmRepository.kt"
    l = {
        0xbb,
        0xc1,
        0xc2
    }
    m = "obtainUserInfoRecord"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lqf2/g$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lqf2/g$a;->G:Ljava/lang/Object;

    iget p1, p0, Lqf2/g$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqf2/g$a;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lqf2/g;->a(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
