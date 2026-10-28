.class public final La6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La6/u;->w:I

    iput-object p1, p0, La6/u;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function3;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La6/u;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Ls83/i;

    iput-object p1, p0, La6/u;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, La6/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La6/u;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, Lfa3/u;

    const/16 v2, 0xa

    invoke-direct {v1, v0, v2}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    new-instance v2, La63/c;

    const/4 v3, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, La63/c;-><init>(IILq83/d;)V

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, La6/u;->x:Ljava/lang/Object;

    check-cast v0, Lec3/s1;

    new-instance v1, Lw;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lw;-><init>(Lec3/m;I)V

    invoke-virtual {v0, v1, p2}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_1
    new-instance v0, La6/v;

    iget-object v1, p0, La6/u;->x:Ljava/lang/Object;

    check-cast v1, Ls83/i;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, La6/v;-><init>(Lkotlin/jvm/functions/Function3;Lec3/m;Lq83/d;)V

    new-instance p1, Lbc3/d2;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p1, v1, p2, v2}, Lbc3/d2;-><init>(Lq83/j;Lq83/d;I)V

    const/4 p2, 0x1

    invoke-static {p1, p2, p1, v0}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object p1

    :pswitch_2
    iget-object v0, p0, La6/u;->x:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    goto :goto_3

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object p1

    :pswitch_3
    iget-object v0, p0, La6/u;->x:Ljava/lang/Object;

    check-cast v0, Lec3/a0;

    new-instance v1, La6/t;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, La6/t;-><init>(Lec3/m;I)V

    invoke-virtual {v0, v1, p2}, Lec3/a0;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    goto :goto_4

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
