.class final Lvi1/d$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi1/d;->t(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.health.monitor.medical.domain.HeartHealthInteractor"
    f = "HeartHealthInteractor.kt"
    l = {
        0xd1
    }
    m = "offlineLabradorEnabledCardModel"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lvi1/d;

.field y:I


# direct methods
.method public constructor <init>(Lvi1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi1/d;",
            "Lq83/d<",
            "-",
            "Lvi1/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvi1/d$h;->x:Lvi1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvi1/d$h;->w:Ljava/lang/Object;

    iget p1, p0, Lvi1/d$h;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvi1/d$h;->y:I

    iget-object p1, p0, Lvi1/d$h;->x:Lvi1/d;

    invoke-static {p1, p0}, Lvi1/d;->h(Lvi1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
