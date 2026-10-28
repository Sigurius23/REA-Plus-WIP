.class public final Leu/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Lp0/n0;


# instance fields
.field public final a:Lp1/k1;

.field public final b:Lp1/k1;

.field public final c:Lp1/k1;

.field public final d:Ljava/lang/Object;

.field public e:Lup/b;

.field public f:Leu/d;

.field public g:Lbc3/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Leu/b;->x:Leu/b;

    sget-object v1, Leu/c;->x:Leu/c;

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Leu/g;->h:Lp0/n0;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 4

    .line 7
    new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v2, v3, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V

    .line 8
    invoke-direct {p0, v0}, Leu/g;-><init>(Lcom/google/android/gms/maps/model/CameraPosition;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 1

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Leu/g;->a:Lp1/k1;

    .line 3
    sget-object v0, Leu/a;->y:Leu/a;

    .line 4
    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Leu/g;->b:Lp1/k1;

    .line 5
    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Leu/g;->c:Lp1/k1;

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leu/g;->d:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Leu/g;Lup/b;Lup/a;ILbc3/m;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Leu/f;

    const/4 v1, 0x0

    invoke-direct {v0, p4, v1}, Leu/f;-><init>(Lbc3/m;I)V

    const p4, 0x7fffffff

    const-string v1, "CameraUpdate must not be null."

    if-ne p3, p4, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-static {p2, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p1, Lup/b;->a:Lvp/e;

    iget-object p2, p2, Lup/a;->a:Lcp/a;

    new-instance p4, Lup/e;

    invoke-direct {p4, v0}, Lup/e;-><init>(Leu/f;)V

    invoke-virtual {p3}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-static {v0, p4}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p2, 0x6

    invoke-virtual {p3, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    invoke-static {p2, v1}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p1, Lup/b;->a:Lvp/e;

    iget-object p2, p2, Lup/a;->a:Lcp/a;

    new-instance v1, Lup/e;

    invoke-direct {v1, v0}, Lup/e;-><init>(Leu/f;)V

    invoke-virtual {p4}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p2}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, v1}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p2, 0x7

    invoke-virtual {p4, v0, p2}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    new-instance p2, Le10/k0;

    const/4 p3, 0x6

    invoke-direct {p2, p1, p3}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Leu/g;->f:Leu/d;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Leu/d;->d()V

    :cond_1
    iput-object p2, p0, Leu/g;->f:Leu/d;

    return-void

    :catch_1
    move-exception p0

    new-instance p1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final b(Lup/a;ILs83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Leu/e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Leu/e;

    iget v1, v0, Leu/e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Leu/e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Leu/e;

    invoke-direct {v0, p0, p3}, Leu/e;-><init>(Leu/g;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Leu/e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Leu/e;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Leu/e;->x:Lbc3/k1;

    iget-object p2, v0, Leu/e;->w:Leu/g;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p3

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p3

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p3, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p3

    check-cast p3, Lbc3/k1;

    :try_start_1
    iput-object p0, v0, Leu/e;->w:Leu/g;

    iput-object p3, v0, Leu/e;->x:Lbc3/k1;

    iput v4, v0, Leu/e;->E:I

    new-instance v2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    iget-object v0, p0, Leu/g;->d:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    iput-object p3, p0, Leu/g;->g:Lbc3/k1;

    iget-object v4, p0, Leu/g;->e:Lup/b;

    if-nez v4, :cond_4

    new-instance v4, Llo/r;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v2, v4, Llo/r;->y:Ljava/lang/Object;

    iput-object p0, v4, Llo/r;->z:Ljava/lang/Object;

    iput-object p1, v4, Llo/r;->w:Ljava/lang/Object;

    iput p2, v4, Llo/r;->x:I

    iget-object p1, p0, Leu/g;->f:Leu/d;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Leu/d;->d()V

    :cond_3
    iput-object v4, p0, Leu/g;->f:Leu/d;

    new-instance p1, Lb2/z;

    const/16 p2, 0x9

    invoke-direct {p1, p2, p0, v4}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-static {p0, v4, p1, p2, v2}, Leu/g;->a(Leu/g;Lup/b;Lup/a;ILbc3/m;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    :try_start_3
    monitor-exit v0

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object p2, p0

    move-object p1, p3

    :goto_2
    iget-object p3, p2, Leu/g;->d:Ljava/lang/Object;

    monitor-enter p3

    if-eqz p1, :cond_6

    :try_start_4
    iget-object v0, p2, Leu/g;->g:Lbc3/k1;

    if-ne v0, p1, :cond_6

    iput-object v3, p2, Leu/g;->g:Lbc3/k1;

    iget-object p1, p2, Leu/g;->e:Lup/b;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lup/b;->d()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    monitor-exit p3

    throw p1

    :cond_6
    :goto_3
    monitor-exit p3

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_3
    move-exception p1

    move-object p2, p3

    move-object p3, p1

    move-object p1, p2

    move-object p2, p0

    goto :goto_5

    :goto_4
    :try_start_5
    monitor-exit v0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :goto_5
    iget-object v0, p2, Leu/g;->d:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_7

    :try_start_6
    iget-object v1, p2, Leu/g;->g:Lbc3/k1;

    if-ne v1, p1, :cond_7

    iput-object v3, p2, Leu/g;->g:Lbc3/k1;

    iget-object p1, p2, Leu/g;->e:Lup/b;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lup/b;->d()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_7
    :goto_6
    monitor-exit v0

    throw p3
.end method

.method public final c(Lup/b;)V
    .locals 3

    iget-object v0, p0, Leu/g;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Leu/g;->e:Lup/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    if-nez p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    if-eqz v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "CameraPositionState may only be associated with one GoogleMap at a time"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    iput-object p1, p0, Leu/g;->e:Lup/b;

    if-nez p1, :cond_3

    iget-object v1, p0, Leu/g;->a:Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Leu/g;->c:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/CameraPosition;

    invoke-static {v1}, Ls30/e;->k(Lcom/google/android/gms/maps/model/CameraPosition;)Lup/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lup/b;->c(Lup/a;)V

    :goto_1
    iget-object v1, p0, Leu/g;->f:Leu/d;

    if-eqz v1, :cond_4

    const/4 v2, 0x0

    iput-object v2, p0, Leu/g;->f:Leu/d;

    invoke-interface {v1, p1}, Leu/d;->f(Lup/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method public final d(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 2

    iget-object v0, p0, Leu/g;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Leu/g;->e:Lup/b;

    if-nez v1, :cond_0

    iget-object v1, p0, Leu/g;->c:Lp1/k1;

    invoke-virtual {v1, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ls30/e;->k(Lcom/google/android/gms/maps/model/CameraPosition;)Lup/a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lup/b;->c(Lup/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
