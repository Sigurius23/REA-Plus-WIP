.class final Lmk2/r$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmk2/r;->x(Lmk2/p$k;Lx90/d;Lha0/d;Lmk2/j;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.domain.TrackSessionMiniArchInteractor"
    f = "TrackSessionMiniArchInteractor.kt"
    l = {
        0x95,
        0x9c,
        0xa6,
        0xab
    }
    m = "connectToSession"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:J

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lmk2/r;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmk2/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmk2/r;",
            "Lq83/d<",
            "-",
            "Lmk2/r$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmk2/r$c;->I:Lmk2/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lmk2/r$c;->H:Ljava/lang/Object;

    iget p1, p0, Lmk2/r$c;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmk2/r$c;->J:I

    iget-object v0, p0, Lmk2/r$c;->I:Lmk2/r;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lmk2/r;->d(Lmk2/r;Lmk2/p$k;Lx90/d;Lha0/d;Lmk2/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
