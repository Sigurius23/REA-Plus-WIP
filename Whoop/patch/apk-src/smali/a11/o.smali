.class public final synthetic La11/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p5, p0, La11/o;->w:I

    iput-object p1, p0, La11/o;->y:Ljava/lang/Object;

    iput-object p2, p0, La11/o;->z:Ljava/lang/Object;

    iput-object p3, p0, La11/o;->E:Ljava/lang/Object;

    iput p4, p0, La11/o;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, La11/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    check-cast v0, Ly1/d;

    iget-object v1, p0, La11/o;->E:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, La11/o;->x:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v2, p0, La11/o;->z:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1, p1, p2}, Ly1/d;->c(Ljava/lang/Object;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    check-cast v0, Lx1/b;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, La11/o;->x:I

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    or-int/lit8 p2, p2, 0x1

    iget-object v1, p0, La11/o;->z:Ljava/lang/Object;

    iget-object v2, p0, La11/o;->E:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, p1, p2}, Lx1/b;->d(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwm1/b;

    iget-object v0, p0, La11/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lwm1/c;

    iget-object v0, p0, La11/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, La11/o;->x:I

    invoke-static/range {v1 .. v6}, Lwm1/k;->g(Lwm1/b;Lwm1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp31/p$e;

    iget-object v0, p0, La11/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, La11/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, La11/o;->x:I

    invoke-static/range {v1 .. v6}, Lp31/n;->a(Lp31/p$e;Landroidx/compose/ui/Modifier;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, La11/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lik2/b;

    iget-object v0, p0, La11/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb91/a;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, La11/o;->x:I

    invoke-static/range {v1 .. v6}, Ljk2/c;->b(Lc93/a;Lik2/b;Lb91/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, La11/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lim1/d0;

    iget-object v0, p0, La11/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfm1/d;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, La11/o;->x:I

    invoke-static/range {v1 .. v6}, Lim1/b;->e(Ljava/util/List;Lim1/d0;Lfm1/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li61/b;

    iget-object v0, p0, La11/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj61/h;

    iget-object v0, p0, La11/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lf61/i;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, La11/o;->x:I

    invoke-static/range {v1 .. v6}, Le61/h;->k(Li61/b;Lj61/h;Lf61/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La11/o;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, La11/o;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, La11/o;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, La11/c;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v4, p0, La11/o;->x:I

    invoke-static/range {v1 .. v6}, La11/q;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;La11/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
