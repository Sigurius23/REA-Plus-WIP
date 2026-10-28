.class public final synthetic Lsg2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;II)V
    .locals 0

    .line 1
    iput p5, p0, Lsg2/o;->w:I

    iput-object p1, p0, Lsg2/o;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lsg2/o;->x:Z

    iput-object p3, p0, Lsg2/o;->E:Ljava/lang/Object;

    iput p4, p0, Lsg2/o;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p5, p0, Lsg2/o;->w:I

    iput-boolean p1, p0, Lsg2/o;->x:Z

    iput-object p2, p0, Lsg2/o;->z:Ljava/lang/Object;

    iput-object p3, p0, Lsg2/o;->E:Ljava/lang/Object;

    iput p4, p0, Lsg2/o;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsg2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwb0/c;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lyb0/g;->d(Lwb0/c;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    check-cast v0, Lx30/n1;

    iget-object v1, p0, Lsg2/o;->E:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lsg2/o;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lsg2/o;->x:Z

    invoke-static {v2, v0, v1, p1, p2}, Ls3/d;->c(ZLx30/n1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    check-cast v0, Lx30/i1;

    iget-object v1, p0, Lsg2/o;->E:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lsg2/o;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lsg2/o;->x:Z

    invoke-static {v2, v0, v1, p1, p2}, Ls2/d;->i(ZLx30/i1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    check-cast v0, Lx30/c;

    iget-object v1, p0, Lsg2/o;->E:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lsg2/o;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v2, p0, Lsg2/o;->x:Z

    invoke-static {v2, v0, v1, p1, p2}, Lrg/a;->a(ZLx30/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvt1/e;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lwt1/a;->f(Lvt1/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lmj0/e;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lvx0/c;->h(Lmj0/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/e;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lvp1/d;->b(Ltp1/e;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Ltj1/b;->a(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsz0/h;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lsz0/e;->e(Lsz0/h;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lsl0/u2;->q(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lsg2/o;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrg2/n;

    iget-object v0, p0, Lsg2/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v2, p0, Lsg2/o;->x:Z

    iget v4, p0, Lsg2/o;->y:I

    invoke-static/range {v1 .. v6}, Lsg2/p;->e(Lrg2/n;ZLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
