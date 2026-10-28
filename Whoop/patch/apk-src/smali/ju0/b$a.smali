.class Lju0/b$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lju0/b;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lju0/b;


# direct methods
.method public constructor <init>(Lju0/b;)V
    .locals 0

    iput-object p1, p0, Lju0/b$a;->a:Lju0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Liu0/a;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Liu0/a;->a()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Liu0/a;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Liu0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Liu0/a;->c()[B

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_1
    invoke-virtual {p2}, Liu0/a;->c()[B

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->q(I[B)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Liu0/a;

    invoke-virtual {p0, p1, p2}, Lju0/b$a;->a(Ltb/c;Liu0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `memfault_packets` (`id`,`serial_number`,`value`) VALUES (nullif(?, 0),?,?)"

    return-object v0
.end method
