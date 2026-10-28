.class Lha0/c$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lha0/c;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lha0/c;


# direct methods
.method public constructor <init>(Lha0/c;)V
    .locals 0

    iput-object p1, p0, Lha0/c$a;->a:Lha0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lha0/d;)V
    .locals 4

    invoke-virtual {p2}, Lha0/d;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lha0/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lha0/d;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lha0/d;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lha0/d;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lha0/d;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lha0/d;->b()Z

    move-result v0

    const/4 v1, 0x4

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lha0/d;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lha0/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lha0/c$a;->a:Lha0/c;

    invoke-static {v0}, Lha0/c;->j(Lha0/c;)Lha0/i;

    move-result-object v0

    invoke-virtual {p2}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lha0/i;->a(Lcom/whoop/addactivity/network/model/ScoreType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lha0/d;->d()Z

    move-result p2

    const/4 v0, 0x7

    int-to-long v1, p2

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lha0/d;

    invoke-virtual {p0, p1, p2}, Lha0/c$a;->a(Ltb/c;Lha0/d;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_activities_list` (`internal_name`,`display_name`,`icon_url`,`deleted`,`category`,`score_type`,`has_gps`) VALUES (?,?,?,?,?,?,?)"

    return-object v0
.end method
