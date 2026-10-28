.class public final Lv00/e;
.super Lv00/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "ShippingAddress"

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lv00/c0;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p1, Lv00/c0;->z:Z

    if-eqz p2, :cond_0

    goto :goto_2

    :cond_0
    iget-object p1, p1, Lv00/c0;->w:Ly00/c8;

    instance-of p2, p1, Ly00/l3;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    check-cast p1, Ly00/l3;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p1, Ly00/l3;->T:Ly00/j3;

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_3

    iget-object v0, p1, Ly00/j3;->y:Ljava/lang/String;

    :cond_3
    if-eqz v0, :cond_4

    iget-object p1, p1, Ly00/j3;->w:Ly00/c;

    iget-object p2, p1, Ly00/c;->y:Ljava/lang/String;

    if-eqz p2, :cond_4

    iget-object p2, p1, Ly00/c;->x:Ljava/lang/String;

    if-eqz p2, :cond_4

    iget-object p1, p1, Ly00/c;->E:Ljava/lang/String;

    if-eqz p1, :cond_4

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
