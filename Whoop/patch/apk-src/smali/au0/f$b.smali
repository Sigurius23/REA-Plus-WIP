.class Lau0/f$b;
.super Landroidx/room/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lau0/f;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Lau0/f;


# direct methods
.method public constructor <init>(Lau0/f;)V
    .locals 0

    iput-object p1, p0, Lau0/f$b;->a:Lau0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lbu0/a;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lbu0/a;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lbu0/a;->c()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x2

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lbu0/a;

    invoke-virtual {p0, p1, p2}, Lau0/f$b;->a(Ltb/c;Lbu0/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM `table_strap_firmware_events` WHERE `timestamp` = ? AND `type` = ?"

    return-object v0
.end method
