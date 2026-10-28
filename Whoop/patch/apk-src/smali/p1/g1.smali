.class public final Lp1/g1;
.super Lz1/a0;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lp1/z0;
.implements Lz1/n;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lp1/g1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public x:Lp1/k2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp1/f1;-><init>(I)V

    sput-object v0, Lp1/g1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 4

    invoke-direct {p0}, Lz1/a0;-><init>()V

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    new-instance v1, Lp1/k2;

    invoke-virtual {v0}, Lz1/f;->g()J

    move-result-wide v2

    invoke-direct {v1, v2, v3, p1}, Lp1/k2;-><init>(JF)V

    instance-of v0, v0, Lz1/a;

    if-nez v0, :cond_0

    new-instance v0, Lp1/k2;

    const/4 v2, 0x1

    int-to-long v2, v2

    invoke-direct {v0, v2, v3, p1}, Lp1/k2;-><init>(JF)V

    iput-object v0, v1, Lz1/b0;->b:Lz1/b0;

    :cond_0
    iput-object v1, p0, Lp1/g1;->x:Lp1/k2;

    return-void
.end method


# virtual methods
.method public final N()Lz1/b0;
    .locals 1

    iget-object v0, p0, Lp1/g1;->x:Lp1/k2;

    return-object v0
.end method

.method public final S(Lz1/b0;Lz1/b0;Lz1/b0;)Lz1/b0;
    .locals 0

    move-object p1, p2

    check-cast p1, Lp1/k2;

    check-cast p3, Lp1/k2;

    iget p1, p1, Lp1/k2;->c:F

    iget p3, p3, Lp1/k2;->c:F

    cmpg-float p1, p1, p3

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()Lkotlin/jvm/functions/Function1;
    .locals 2

    new-instance v0, Lp1/j2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lp1/j2;-><init>(Lp1/g1;I)V

    return-object v0
.end method

.method public final h()Lp1/o2;
    .locals 1

    sget-object v0, Lp1/v0;->F:Lp1/v0;

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final m0(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/k2;

    iput-object p1, p0, Lp1/g1;->x:Lp1/k2;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lp1/g1;->x:Lp1/k2;

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/k2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MutableFloatState(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lp1/k2;->c:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

.method public final x()F
    .locals 1

    iget-object v0, p0, Lp1/g1;->x:Lp1/k2;

    invoke-static {v0, p0}, Lz1/l;->t(Lz1/b0;Lz1/z;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/k2;

    iget v0, v0, Lp1/k2;->c:F

    return v0
.end method

.method public final y(F)V
    .locals 4

    iget-object v0, p0, Lp1/g1;->x:Lp1/k2;

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/k2;

    iget v1, v0, Lp1/k2;->c:F

    cmpg-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lp1/g1;->x:Lp1/k2;

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v3

    invoke-static {v1, p0, v3, v0}, Lz1/l;->o(Lz1/b0;Lz1/a0;Lz1/f;Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/k2;

    iput p1, v0, Lp1/k2;->c:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-static {v3, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method
