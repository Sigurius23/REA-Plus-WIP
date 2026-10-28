.class Lmu0/e$b;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmu0/e;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lmu0/e;


# direct methods
.method public constructor <init>(Lmu0/e;)V
    .locals 0

    iput-object p1, p0, Lmu0/e$b;->a:Lmu0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lnu0/a;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lnu0/a;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lnu0/a;

    invoke-virtual {p0, p1, p2}, Lmu0/e$b;->a(Ltb/c;Lnu0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `table_metrics_data` WHERE `timestamp` = ?"

    return-object v0
.end method
