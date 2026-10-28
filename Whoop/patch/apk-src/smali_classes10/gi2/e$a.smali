.class final Lgi2/e$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi2/e;->f(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.strava.domain.StravaInteractor"
    f = "StravaInteractor.kt"
    l = {
        0x3a
    }
    m = "authorize"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lgi2/e;

.field z:I


# direct methods
.method public constructor <init>(Lgi2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/e;",
            "Lq83/d<",
            "-",
            "Lgi2/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgi2/e$a;->y:Lgi2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgi2/e$a;->x:Ljava/lang/Object;

    iget p1, p0, Lgi2/e$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgi2/e$a;->z:I

    iget-object p1, p0, Lgi2/e$a;->y:Lgi2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lgi2/e;->a(Lgi2/e;Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
