.class public final synthetic Lrf/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lrf/p;->w:I

    iput-object p1, p0, Lrf/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lrf/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lz82/a;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lz82/a;->m(Lz82/a;Lod1/u$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lz1/v;

    iget-object v1, v0, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Lz1/v;->i:Lz1/u;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v0, Lz1/u;->b:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v3, v0, Lz1/u;->d:I

    iget-object v4, v0, Lz1/u;->c:La0/m0;

    if-nez v4, :cond_0

    new-instance v4, La0/m0;

    invoke-direct {v4}, La0/m0;-><init>()V

    iput-object v4, v0, Lz1/u;->c:La0/m0;

    iget-object v5, v0, Lz1/u;->f:La0/v0;

    invoke-virtual {v5, v2, v4}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0, p1, v3, v2, v4}, Lz1/u;->c(Ljava/lang/Object;ILjava/lang/Object;La0/m0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :pswitch_1
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Ly1/d;

    iget-object v0, v0, Ly1/d;->y:Ly1/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ly1/f;->d(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lud3/l0;

    check-cast p1, Lz53/b;

    invoke-static {v0, p1}, Lx02/b;->a(Lud3/l0;Lz53/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lwc3/e;

    check-cast p1, Lyc3/a;

    const-string v1, "$this$buildSerialDescriptor"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "type"

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v2}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v2, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    const-string v1, "value"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "kotlinx.serialization.Polymorphic<"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v0, Lwc3/e;->a:Lj93/d;

    invoke-interface {v4}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3e

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lyc3/i;->a:Lyc3/i;

    new-array v5, v3, [Lyc3/g;

    invoke-static {v2, v4, v5}, Lvf3/b;->e(Ljava/lang/String;Lyc3/k;[Lyc3/g;)Lyc3/h;

    move-result-object v2

    invoke-virtual {p1, v1, v2, v3}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    iget-object v0, v0, Lwc3/e;->b:Ljava/util/List;

    const-string v1, "<set-?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Lyc3/a;->b:Ljava/util/List;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lwc3/a;

    check-cast p1, Lyc3/a;

    const-string v1, "$this$buildSerialDescriptor"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lwc3/a;->b:Lwc3/c;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lyc3/g;->getAnnotations()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_3
    iput-object v0, p1, Lyc3/a;->b:Ljava/util/List;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    check-cast p1, Ly2/y;

    invoke-static {v0, p1}, Lvy0/h0;->k(Lp1/z0;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lvn1/i;

    check-cast p1, Lc0/q;

    invoke-static {v0, p1}, Lvn1/p;->a(Lvn1/i;Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    check-cast p1, Lvn1/i;

    invoke-static {v0, p1}, Lum1/d;->c(Lld1/c;Lvn1/i;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Ljb1/a;

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;

    invoke-static {v0, p1}, Lto1/l;->r(Ljb1/a;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;)Lwo1/b0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lrv1/a;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lrv1/a;->a(Lrv1/a;Lod1/u$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lrf2/c;

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lrf2/c;->m(Lrf2/c;Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lrf/p;->x:Ljava/lang/Object;

    check-cast v0, Lrf/r;

    check-cast p1, Lpf/g;

    const-string v1, "<this>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpf/b;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, p1}, Lpf/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, p1, Lrf/q;

    if-eqz v1, :cond_4

    check-cast p1, Lrf/q;

    iget v0, v0, Lrf/r;->k:I

    new-instance v1, Ll83/t;

    invoke-direct {v1, v0}, Ll83/t;-><init>(I)V

    iput-object v1, p1, Lrf/q;->j:Ll83/t;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
