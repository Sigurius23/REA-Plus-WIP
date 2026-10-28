.class public final Leu/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lp1/k1;

.field public final b:Lp1/k1;

.field public c:Lwp/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Leu/b;->a0:Leu/b;

    sget-object v1, Leu/c;->O:Leu/c;

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Leu/j0;->a:Lp1/k1;

    sget-object p1, Leu/j;->y:Leu/j;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Leu/j0;->b:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a(Lwp/h;)V
    .locals 1

    iget-object v0, p0, Leu/j0;->c:Lwp/h;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "MarkerState may only be associated with one Marker at a time."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Leu/j0;->c:Lwp/h;

    return-void
.end method
