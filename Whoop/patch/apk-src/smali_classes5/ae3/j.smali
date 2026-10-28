.class public final Lae3/j;
.super Lud3/a1;
.source "SourceFile"


# instance fields
.field public final E:Lne3/j0;

.field public final y:Ljava/lang/String;

.field public final z:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLne3/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae3/j;->y:Ljava/lang/String;

    iput-wide p2, p0, Lae3/j;->z:J

    iput-object p4, p0, Lae3/j;->E:Lne3/j0;

    return-void
.end method


# virtual methods
.method public final d1()Lne3/j;
    .locals 1

    iget-object v0, p0, Lae3/j;->E:Lne3/j0;

    return-object v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lae3/j;->z:J

    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 2

    iget-object v0, p0, Lae3/j;->y:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lud3/h0;->e:Lyb3/p;

    invoke-static {v0}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
