.class public final synthetic Lek/d;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p7, p0, Lek/d;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lh0/w2;)V
    .locals 8

    const/4 v0, 0x2

    iput v0, p0, Lek/d;->w:I

    .line 2
    const-string v7, "onWheelScrollStopped-TH1AsA0(J)V"

    const/4 v3, 0x4

    const/4 v2, 0x2

    const-class v4, Lh0/w2;

    const-string v6, "onWheelScrollStopped"

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 7

    iput p2, p0, Lek/d;->w:I

    packed-switch p2, :pswitch_data_0

    .line 3
    const-string v6, "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;"

    const/16 v2, 0x8

    const/4 v1, 0x2

    const-class v3, Lgj/d;

    const-string v5, "track"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 4
    :pswitch_0
    const-string v6, "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;"

    const/16 v2, 0x8

    const/4 v1, 0x2

    const-class v3, Lgj/d;

    const-string v5, "track"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lek/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lwz/e1;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lwz/y;

    invoke-static {v0, p1, p2}, Lwz/y;->q(Lwz/y;Lwz/e1;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lw20/f;

    check-cast p2, Lq83/d;

    iget-object p2, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast p2, Lh20/k4;

    iget-object v0, p2, Le30/c;->P:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lq20/w;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lq20/w;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    instance-of v1, p1, Lw20/d;

    const/4 v3, 0x6

    if-eqz v1, :cond_1

    new-instance v1, Ly00/l5;

    check-cast p1, Lw20/d;

    iget-object p1, p1, Lw20/d;->a:Ljava/lang/String;

    invoke-direct {v1, v3, p1, v2}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    goto :goto_1

    :cond_1
    sget-object v1, Lw20/e;->a:Lw20/e;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance v1, Ly00/l5;

    const-string p1, ""

    invoke-direct {v1, v3, p1, v2}, Ly00/l5;-><init>(ILjava/lang/String;Ly00/o;)V

    :goto_1
    new-instance p1, Lq20/w;

    iget-object v2, v0, Lq20/w;->x:Ly00/o4;

    iget-object v0, v0, Lq20/w;->y:Lq20/u;

    invoke-direct {p1, v2, v0, v1}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    invoke-virtual {p2, p1}, Le30/c;->z(Lq20/y;)V

    goto :goto_2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ly3/q;

    iget-wide v2, p1, Ly3/q;->a:J

    check-cast p2, Lq83/d;

    iget-object p1, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lh0/w2;

    iget-object p1, v1, Lh0/w2;->b0:Lt2/d;

    invoke-virtual {p1}, Lt2/d;->c()Lbc3/c0;

    move-result-object p1

    new-instance v0, Lh0/s2;

    const/4 v5, 0x2

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lh0/s2;-><init>(Lh0/w2;JLq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v4, v4, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    const/4 v1, 0x4

    invoke-static {v0, p1, p2, v1}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    const/4 v1, 0x4

    invoke-static {v0, p1, p2, v1}, Lgj/d;->j(Lgj/d;Ljava/lang/String;Ljava/util/Map;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
