.class final Lz82/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz82/a;->C(Ljava/lang/Integer;Lcom/whoop/data/repositories/RestingHeartRate;Lcom/whoop/domain/model/User;Lfi0/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.service.analytics.AmplitudeAnalyticsManager"
    f = "AmplitudeAnalyticsManager.kt"
    l = {
        0xfd
    }
    m = "buildUserTraits"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lz82/a;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz82/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz82/a;",
            "Lq83/d<",
            "-",
            "Lz82/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz82/a$c;->G:Lz82/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lz82/a$c;->F:Ljava/lang/Object;

    iget p1, p0, Lz82/a$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz82/a$c;->H:I

    iget-object v0, p0, Lz82/a$c;->G:Lz82/a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lz82/a;->p(Lz82/a;Ljava/lang/Integer;Lcom/whoop/data/repositories/RestingHeartRate;Lcom/whoop/domain/model/User;Lfi0/d;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
