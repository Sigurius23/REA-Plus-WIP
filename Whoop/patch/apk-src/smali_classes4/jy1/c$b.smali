.class Ljy1/c$b;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljy1/c;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Ljy1/c;


# direct methods
.method public constructor <init>(Ljy1/c;)V
    .locals 0

    iput-object p1, p0, Ljy1/c$b;->a:Ljy1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Ljy1/a;)V
    .locals 2

    invoke-virtual {p2}, Ljy1/a;->c()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x1

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljy1/a;

    invoke-virtual {p0, p1, p2}, Ljy1/c$b;->a(Ltb/c;Ljy1/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `metrics_table` WHERE `id` = ?"

    return-object v0
.end method
