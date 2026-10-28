.class final Lrk2/i$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrk2/i;->o(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler"
    f = "TrackActivityLogoutLifecycleHandler.kt"
    l = {
        0x1c,
        0x1d,
        0x1e
    }
    m = "clearTrackActivityStateOnLogout"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lrk2/i;

.field y:I


# direct methods
.method public constructor <init>(Lrk2/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrk2/i;",
            "Lq83/d<",
            "-",
            "Lrk2/i$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrk2/i$f;->x:Lrk2/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lrk2/i$f;->w:Ljava/lang/Object;

    iget p1, p0, Lrk2/i$f;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrk2/i$f;->y:I

    iget-object p1, p0, Lrk2/i$f;->x:Lrk2/i;

    invoke-static {p1, p0}, Lrk2/i;->d(Lrk2/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
