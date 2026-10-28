.class public Lze1/d;
.super Llh3/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Llh3/j;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final E:Ltr2/n;


# instance fields
.field private final z:Llh3/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/i;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SerializedReplaySubject"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lze1/d;->E:Ltr2/n;

    return-void
.end method

.method public constructor <init>(Llh3/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh3/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Llh3/j;-><init>(Llh3/k;)V

    iput-object p1, p0, Lze1/d;->z:Llh3/i;

    return-void
.end method

.method public static Y()Lze1/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lze1/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lze1/d;

    new-instance v1, Llh3/h;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Llh3/h;-><init>(I)V

    new-instance v2, Llh3/d;

    invoke-direct {v2, v1}, Llh3/d;-><init>(Llh3/h;)V

    new-instance v1, Llh3/i;

    invoke-direct {v1, v2}, Llh3/i;-><init>(Llh3/d;)V

    invoke-direct {v0, v1}, Lze1/d;-><init>(Llh3/i;)V

    return-object v0
.end method


# virtual methods
.method public Z()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lze1/d;->z:Llh3/i;

    iget-object v0, v0, Llh3/i;->x:Llh3/d;

    iget-object v0, v0, Llh3/d;->x:Ljava/lang/Object;

    check-cast v0, Llh3/h;

    iget-object v0, v0, Llh3/h;->b:Llh3/g;

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llh3/g;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Llh3/g;->w:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lze1/d;->E:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to retrieve value from ReplaySubject"

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 v0, 0x0

    return-object v0
.end method
