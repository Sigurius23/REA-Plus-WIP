.class Lqu0/c$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqu0/c;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lqu0/c;


# direct methods
.method public constructor <init>(Lqu0/c;)V
    .locals 0

    iput-object p1, p0, Lqu0/c$a;->a:Lqu0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lru0/a;)V
    .locals 3

    invoke-virtual {p2}, Lru0/a;->c()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lru0/a;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lru0/a;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p1, v1, v0}, Ltb/c;->q(I[B)V

    invoke-virtual {p2}, Lru0/a;->b()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x4

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lru0/a;

    invoke-virtual {p0, p1, p2}, Lqu0/c$a;->a(Ltb/c;Lru0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_research_packets` (`revision`,`timestamp`,`packetData`,`versionId`) VALUES (?,?,?,?)"

    return-object v0
.end method
