.class public final Lec3/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ll83/e;I)V
    .locals 0

    iput p3, p0, Lec3/j1;->w:I

    iput-object p1, p0, Lec3/j1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lec3/j1;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lec3/j1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lec3/j1;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, La63/j;

    iget-object v2, p0, Lec3/j1;->y:Ljava/lang/Object;

    check-cast v2, Lc93/p;

    const/4 v3, 0x7

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, La63/j;-><init>(Lq83/d;Ll83/e;I)V

    sget-object v2, Lec3/n1;->w:Lec3/n1;

    invoke-static {v2, p1, v1, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lec3/j1;->x:Ljava/lang/Object;

    check-cast v0, [Lec3/l;

    new-instance v1, La63/j;

    iget-object v2, p0, Lec3/j1;->y:Ljava/lang/Object;

    check-cast v2, Lc93/n;

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, La63/j;-><init>(Lq83/d;Ll83/e;I)V

    sget-object v2, Lec3/n1;->w:Lec3/n1;

    invoke-static {v2, p1, v1, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_1
    iget-object v0, p0, Lec3/j1;->x:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    new-instance v1, Lec3/e0;

    iget-object v2, p0, Lec3/j1;->y:Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-direct {v1, v3, p1, v2}, Lec3/e0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
