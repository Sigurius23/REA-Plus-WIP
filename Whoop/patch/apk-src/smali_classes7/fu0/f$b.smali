.class Lfu0/f$b;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfu0/f;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lfu0/f;


# direct methods
.method public constructor <init>(Lfu0/f;)V
    .locals 0

    iput-object p1, p0, Lfu0/f$b;->a:Lfu0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lgu0/c;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lgu0/c;->a()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lgu0/c;

    invoke-virtual {p0, p1, p2}, Lfu0/f$b;->a(Ltb/c;Lgu0/c;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `table_rev2_raw_data` WHERE `id` = ?"

    return-object v0
.end method
