.class final Lzu1/d$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzu1/d;->k(ZLjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.limitedtimeoffer.domain.LimitedTimeOfferInteractor"
    f = "LimitedTimeOfferInteractor.kt"
    l = {
        0x6c
    }
    m = "loadLimitedTimeOfferCache"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lzu1/d;

.field F:I

.field w:Z

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lzu1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzu1/d;",
            "Lq83/d<",
            "-",
            "Lzu1/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzu1/d$h;->E:Lzu1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lzu1/d$h;->z:Ljava/lang/Object;

    iget p1, p0, Lzu1/d$h;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lzu1/d$h;->F:I

    iget-object p1, p0, Lzu1/d$h;->E:Lzu1/d;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1, p0}, Lzu1/d;->g(Lzu1/d;ZLjava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
