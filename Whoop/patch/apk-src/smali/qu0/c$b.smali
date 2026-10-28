.class Lqu0/c$b;
.super Landroidx/room/i;
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
        "Landroidx/room/i;"
    }
.end annotation


# instance fields
.field final synthetic a:Lqu0/c;


# direct methods
.method public constructor <init>(Lqu0/c;)V
    .locals 0

    iput-object p1, p0, Lqu0/c$b;->a:Lqu0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lru0/a;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lru0/a;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lru0/a;

    invoke-virtual {p0, p1, p2}, Lqu0/c$b;->a(Ltb/c;Lru0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `table_research_packets` WHERE `timestamp` = ?"

    return-object v0
.end method
