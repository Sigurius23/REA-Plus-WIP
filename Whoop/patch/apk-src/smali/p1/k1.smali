.class public final Lp1/k1;
.super Lz1/a0;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lz1/n;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lp1/k1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final x:Lp1/o2;

.field public y:Lp1/n2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp1/j1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp1/k1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lp1/o2;)V
    .locals 3

    invoke-direct {p0}, Lz1/a0;-><init>()V

    iput-object p2, p0, Lp1/k1;->x:Lp1/o2;

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p2

    new-instance v0, Lp1/n2;

    invoke-virtual {p2}, Lz1/f;->g()J

    move-result-wide v1

    invoke-direct {v0, v1, v2, p1}, Lp1/n2;-><init>(JLjava/lang/Object;)V

    instance-of p2, p2, Lz1/a;

    if-nez p2, :cond_0

    new-instance p2, Lp1/n2;

    const/4 v1, 0x1

    int-to-long v1, v1

    invoke-direct {p2, v1, v2, p1}, Lp1/n2;-><init>(JLjava/lang/Object;)V

    iput-object p2, v0, Lz1/b0;->b:Lz1/b0;

    :cond_0
    iput-object v0, p0, Lp1/k1;->y:Lp1/n2;

    return-void
.end method


# virtual methods
.method public final N()Lz1/b0;
    .locals 1

    iget-object v0, p0, Lp1/k1;->y:Lp1/n2;

    return-object v0
.end method

.method public final S(Lz1/b0;Lz1/b0;Lz1/b0;)Lz1/b0;
    .locals 1

    check-cast p1, Lp1/n2;

    move-object p1, p2

    check-cast p1, Lp1/n2;

    check-cast p3, Lp1/n2;

    iget-object p1, p1, Lp1/n2;->c:Ljava/lang/Object;

    iget-object p3, p3, Lp1/n2;->c:Ljava/lang/Object;

    iget-object v0, p0, Lp1/k1;->x:Lp1/o2;

    invoke-interface {v0, p1, p3}, Lp1/o2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

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

    new-instance v0, Lno0/e0;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp1/k1;->y:Lp1/n2;

    invoke-static {v0, p0}, Lz1/l;->t(Lz1/b0;Lz1/z;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/n2;

    iget-object v0, v0, Lp1/n2;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final h()Lp1/o2;
    .locals 1

    iget-object v0, p0, Lp1/k1;->x:Lp1/o2;

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final m0(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/n2;

    iput-object p1, p0, Lp1/k1;->y:Lp1/n2;

    return-void
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lp1/k1;->y:Lp1/n2;

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/n2;

    iget-object v1, p0, Lp1/k1;->x:Lp1/o2;

    iget-object v2, v0, Lp1/n2;->c:Ljava/lang/Object;

    invoke-interface {v1, v2, p1}, Lp1/o2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lp1/k1;->y:Lp1/n2;

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v3

    invoke-static {v1, p0, v3, v0}, Lz1/l;->o(Lz1/b0;Lz1/a0;Lz1/f;Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/n2;

    iput-object p1, v0, Lp1/n2;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-static {v3, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lp1/k1;->y:Lp1/n2;

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/n2;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MutableState(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lp1/n2;->c:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    .locals 1

    invoke-virtual {p0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    sget-object p2, Lp1/v0;->y:Lp1/v0;

    iget-object v0, p0, Lp1/k1;->x:Lp1/o2;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget-object p2, Lp1/v0;->F:Lp1/v0;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    sget-object p2, Lp1/v0;->z:Lp1/v0;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Only known types of MutableState\'s SnapshotMutationPolicy are supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
