.class Lrf2/c$b;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf2/c;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lrf2/c;


# direct methods
.method public constructor <init>(Lrf2/c;)V
    .locals 0

    iput-object p1, p0, Lrf2/c$b;->a:Lrf2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lsf2/a;)V
    .locals 2

    invoke-virtual {p2}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_0
    invoke-virtual {p2}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lsf2/a;

    invoke-virtual {p0, p1, p2}, Lrf2/c$b;->a(Ltb/c;Lsf2/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_smart_alarm_triggered` (`composite_id`) VALUES (?)"

    return-object v0
.end method
