.class public final Lbc3/l2;
.super Lbc3/z;
.source "SourceFile"


# static fields
.field public static final w:Lbc3/l2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbc3/l2;

    invoke-direct {v0}, Lbc3/z;-><init>()V

    sput-object v0, Lbc3/l2;->w:Lbc3/l2;

    return-void
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Lbc3/p2;->x:Lbc3/j1;

    invoke-interface {p1, p2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/p2;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lbc3/p2;->w:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "limitedParallelism is not supported for Dispatchers.Unconfined"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method
