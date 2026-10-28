.class public final Low/j;
.super Low/z;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Low/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Low/j;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lww/a;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lww/a;->nextDouble()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lww/a;->nextDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Low/j;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v1, v0

    invoke-static {v1, v2}, Low/m;->a(D)V

    instance-of v1, p2, Ljava/lang/Float;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Lww/b;->o0(Ljava/lang/Number;)V

    :goto_2
    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_3

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Low/m;->a(D)V

    invoke-virtual {p1, v0, v1}, Lww/b;->a0(D)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
