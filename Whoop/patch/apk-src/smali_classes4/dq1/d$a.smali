.class Ldq1/d$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq1/d;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Ldq1/d;


# direct methods
.method public constructor <init>(Ldq1/d;)V
    .locals 0

    iput-object p1, p0, Ldq1/d$a;->a:Ldq1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Ldq1/a;)V
    .locals 3

    iget-object v0, p0, Ldq1/d$a;->a:Ldq1/d;

    invoke-static {v0}, Ldq1/d;->j(Ldq1/d;)Ldq1/e;

    move-result-object v0

    invoke-virtual {p2}, Ldq1/a;->c()Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldq1/e;->a(Lcom/whoop/hrZones/network/ZoneID;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Ldq1/a;->b()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Ldq1/a;->a()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x3

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ldq1/a;

    invoke-virtual {p0, p1, p2}, Ldq1/d$a;->a(Ltb/c;Ldq1/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_hr_zone_list` (`zone_id`,`min`,`max`) VALUES (?,?,?)"

    return-object v0
.end method
