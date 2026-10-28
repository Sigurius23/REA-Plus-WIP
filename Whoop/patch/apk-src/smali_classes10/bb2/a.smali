.class public final synthetic Lbb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(JJI)V
    .locals 0

    iput p5, p0, Lbb2/a;->w:I

    iput-wide p1, p0, Lbb2/a;->x:J

    iput-wide p3, p0, Lbb2/a;->y:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lbb2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Lf2/d;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lvs2/e;->f(JJLf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Lk2/e;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lu41/c;->b(JJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Lf2/d;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lqt2/o;->c(JJLf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Ltb/a;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->c(JJLtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Ltb/a;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->e(JJLtb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Ltb/a;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->f(JJLtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Lk2/e;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lbm0/a;->a(JJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-wide v0, p0, Lbb2/a;->y:J

    check-cast p1, Lk2/c;

    iget-wide v2, p0, Lbb2/a;->x:J

    invoke-static {v2, v3, v0, v1, p1}, Lbb2/b;->b(JJLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
