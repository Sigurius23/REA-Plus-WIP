.class public final Lud3/d;
.super Lud3/a1;
.source "SourceFile"


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Lne3/j0;

.field public final y:Lxd3/d;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lxd3/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/d;->y:Lxd3/d;

    iput-object p2, p0, Lud3/d;->z:Ljava/lang/String;

    iput-object p3, p0, Lud3/d;->E:Ljava/lang/String;

    const/4 p2, 0x1

    iget-object p1, p1, Lxd3/d;->y:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne3/p0;

    new-instance p2, Lsh/b;

    invoke-direct {p2, p1, p0}, Lsh/b;-><init>(Lne3/p0;Lud3/d;)V

    invoke-static {p2}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1

    iput-object p1, p0, Lud3/d;->F:Lne3/j0;

    return-void
.end method


# virtual methods
.method public final d1()Lne3/j;
    .locals 1

    iget-object v0, p0, Lud3/d;->F:Lne3/j0;

    return-object v0
.end method

.method public final i()J
    .locals 4

    const-wide/16 v0, -0x1

    iget-object v2, p0, Lud3/d;->E:Ljava/lang/String;

    if-eqz v2, :cond_0

    sget-object v3, Lwd3/f;->a:[B

    :try_start_0
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 2

    iget-object v0, p0, Lud3/d;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lud3/h0;->e:Lyb3/p;

    invoke-static {v0}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
