.class public final Landroidx/room/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Landroidx/room/y;->w:I

    iput-object p2, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Landroidx/room/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    new-instance v1, Landroidx/room/x;

    iget-object v2, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v2, Lxz/x;

    const/16 v3, 0x17

    invoke-direct {v1, v3, p1, v2}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, Lg40/a;

    const/16 v2, 0x10

    invoke-direct {v1, v0, v2}, Lg40/a;-><init>([Lec3/l;I)V

    new-instance v2, Lbe/d;

    iget-object v3, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v3, Lx30/t;

    const/16 v4, 0xa

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, Lg40/a;

    const/16 v2, 0xe

    invoke-direct {v1, v0, v2}, Lg40/a;-><init>([Lec3/l;I)V

    new-instance v2, Lbe/d;

    iget-object v3, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v3, Lc93/p;

    const/4 v4, 0x5

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object p1

    :pswitch_2
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, Lg40/a;

    const/16 v2, 0xd

    invoke-direct {v1, v0, v2}, Lg40/a;-><init>([Lec3/l;I)V

    new-instance v2, Lbe/d;

    iget-object v3, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v3, Lc93/o;

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    goto :goto_3

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object p1

    :pswitch_3
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    new-instance v1, Landroidx/room/x;

    iget-object v2, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v2, Ln00/k;

    const/16 v3, 0xb

    invoke-direct {v1, v3, p1, v2}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    goto :goto_4

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object p1

    :pswitch_4
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, Lg40/a;

    const/4 v2, 0x7

    invoke-direct {v1, v0, v2}, Lg40/a;-><init>([Lec3/l;I)V

    new-instance v2, Lbe/d;

    iget-object v3, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v3, La33/d;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    goto :goto_5

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object p1

    :pswitch_5
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, Lbe/d;

    iget-object v2, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lbe/d;-><init>(Lq83/d;Ljava/lang/Object;I)V

    sget-object v2, Lec3/n1;->w:Lec3/n1;

    invoke-static {v2, p1, v1, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_6

    goto :goto_6

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object p1

    :pswitch_6
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    new-instance v1, Landroidx/room/x;

    iget-object v2, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-direct {v1, v3, p1, v2}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_7

    goto :goto_7

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object p1

    :pswitch_7
    iget-object v0, p0, Landroidx/room/y;->x:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    new-instance v1, Landroidx/room/x;

    iget-object v2, p0, Landroidx/room/y;->y:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p1, v2}, Landroidx/room/x;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_8

    goto :goto_8

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_8
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
