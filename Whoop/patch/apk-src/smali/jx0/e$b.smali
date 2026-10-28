.class Ljx0/e$b;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljx0/e;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Ljx0/e;


# direct methods
.method public constructor <init>(Ljx0/e;)V
    .locals 0

    iput-object p1, p0, Ljx0/e$b;->a:Ljx0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Ljx0/a;)V
    .locals 2

    invoke-virtual {p2}, Ljx0/a;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_0
    invoke-virtual {p2}, Ljx0/a;->h()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljx0/a;

    invoke-virtual {p0, p1, p2}, Ljx0/e$b;->a(Ltb/c;Ljx0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `data_sync_work_db` WHERE `workerId` = ?"

    return-object v0
.end method
