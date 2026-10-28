.class public final Lg20/o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg20/r;

.field public final synthetic y:Ljava/lang/Throwable;

.field public final synthetic z:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lg20/r;Ljava/lang/Throwable;Ljava/util/Map;Lq83/d;I)V
    .locals 0

    iput p5, p0, Lg20/o;->w:I

    iput-object p1, p0, Lg20/o;->x:Lg20/r;

    iput-object p2, p0, Lg20/o;->y:Ljava/lang/Throwable;

    iput-object p3, p0, Lg20/o;->z:Ljava/util/Map;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lg20/o;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lg20/o;

    iget-object v3, p0, Lg20/o;->z:Ljava/util/Map;

    const/4 v5, 0x1

    iget-object v1, p0, Lg20/o;->x:Lg20/r;

    iget-object v2, p0, Lg20/o;->y:Ljava/lang/Throwable;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lg20/o;-><init>(Lg20/r;Ljava/lang/Throwable;Ljava/util/Map;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v4, p2

    new-instance v1, Lg20/o;

    move-object v5, v4

    iget-object v4, p0, Lg20/o;->z:Ljava/util/Map;

    const/4 v6, 0x0

    iget-object v2, p0, Lg20/o;->x:Lg20/r;

    iget-object v3, p0, Lg20/o;->y:Ljava/lang/Throwable;

    invoke-direct/range {v1 .. v6}, Lg20/o;-><init>(Lg20/r;Ljava/lang/Throwable;Ljava/util/Map;Lq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg20/o;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lg20/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lg20/o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg20/o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg20/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg20/o;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x2

    iget-object v3, p0, Lg20/o;->z:Ljava/util/Map;

    const/4 v4, 0x0

    iget-object v5, p0, Lg20/o;->y:Ljava/lang/Throwable;

    iget-object v6, p0, Lg20/o;->x:Lg20/r;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lg20/c;

    invoke-direct {p1, v5}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v6, p1, v4, v3, v2}, Lg20/r;->l(Lg20/r;Lg20/d;Ly00/c8;Ljava/util/Map;I)V

    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lg20/c;

    invoke-direct {p1, v5}, Lg20/c;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v6, p1, v4, v3, v2}, Lg20/r;->l(Lg20/r;Lg20/d;Ly00/c8;Ljava/util/Map;I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
