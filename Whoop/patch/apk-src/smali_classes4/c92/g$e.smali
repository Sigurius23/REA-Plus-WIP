.class Lc92/g$e;
.super Lu92/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc92/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private d:Ljava/lang/Long;

.field private e:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lod1/u;)V
    .locals 1

    const-string v0, "BluetoothSyncManager"

    invoke-direct {p0, p1, v0, p2}, Lu92/f;-><init>(Landroid/content/Context;Ljava/lang/String;Lod1/u;)V

    return-void
.end method


# virtual methods
.method public A()J
    .locals 3

    iget-object v0, p0, Lc92/g$e;->d:Ljava/lang/Long;

    if-nez v0, :cond_0

    const-string v0, "HighWatermark"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lc92/g$e;->d:Ljava/lang/Long;

    :cond_0
    iget-object v0, p0, Lc92/g$e;->d:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public B()J
    .locals 3

    iget-object v0, p0, Lc92/g$e;->e:Ljava/lang/Long;

    if-nez v0, :cond_0

    const-string v0, "LastFullSyncTimestamp"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lc92/g$e;->e:Ljava/lang/Long;

    :cond_0
    iget-object v0, p0, Lc92/g$e;->e:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public C()Z
    .locals 2

    const-string v0, "IsExtremelyLagged"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public D()Z
    .locals 2

    const-string v0, "IsLagged"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public E()Z
    .locals 2

    const-string v0, "IsVeryLagged"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lu92/d;->e(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public F(Z)V
    .locals 1

    const-string v0, "IsExtremelyLagged"

    invoke-virtual {p0, v0, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public G(Z)V
    .locals 1

    const-string v0, "IsLagged"

    invoke-virtual {p0, v0, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public H(Z)V
    .locals 1

    const-string v0, "IsVeryLagged"

    invoke-virtual {p0, v0, p1}, Lu92/d;->q(Ljava/lang/String;Z)V

    return-void
.end method

.method public I(J)V
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lc92/g$e;->e:Ljava/lang/Long;

    const-string v0, "LastFullSyncTimestamp"

    invoke-virtual {p0, v0, p1, p2}, Lu92/d;->u(Ljava/lang/String;J)V

    return-void
.end method
