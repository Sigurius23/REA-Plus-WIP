.class public final synthetic Lyw1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyw1/e;->w:I

    iput-object p1, p0, Lyw1/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lyw1/e;->z:Ljava/lang/Object;

    iput-object p3, p0, Lyw1/e;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lyw1/e;->w:I

    iput-object p1, p0, Lyw1/e;->y:Ljava/lang/Object;

    iput-object p2, p0, Lyw1/e;->x:Ljava/lang/Object;

    iput-object p3, p0, Lyw1/e;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lyw1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyw1/e;->x:Ljava/lang/Object;

    iput-object p2, p0, Lyw1/e;->y:Ljava/lang/Object;

    iput-object p3, p0, Lyw1/e;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lyw1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyw1/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/c1;

    iget-object v0, p0, Lyw1/e;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzc1/f4;

    iget-object v0, p0, Lyw1/e;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Ll0/s1;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lzc1/e4;->a(Lp1/c1;Lzc1/f4;Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyw1/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lza2/j;

    iget-object v0, p0, Lyw1/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lyw1/e;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/t2;

    move-object v4, p1

    check-cast v4, Lza2/m;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-static/range {v1 .. v6}, Lza2/j;->E(Lza2/j;Lkotlin/jvm/functions/Function1;Lp1/t2;Lza2/m;IZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lyw1/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lx22/c$c;

    iget-object v0, p0, Lyw1/e;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx22/c;

    iget-object v0, p0, Lyw1/e;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lz22/g;->c(Lx22/c$c;Lx22/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lyw1/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luw1/d$a;

    iget-object v0, p0, Lyw1/e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lyw1/e;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Luw1/d;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lyw1/o;->e(Luw1/d$a;Lkotlin/jvm/functions/Function1;Luw1/d;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lyw1/e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lyw1/e;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lyw1/e;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lyw1/i;->i(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lyw1/e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luw1/c$a;

    iget-object v0, p0, Lyw1/e;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luw1/c;

    iget-object v0, p0, Lyw1/e;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v1 .. v6}, Lyw1/h;->e(Luw1/c$a;Luw1/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
