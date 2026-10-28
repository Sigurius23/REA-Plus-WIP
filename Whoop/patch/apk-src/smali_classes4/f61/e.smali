.class public final synthetic Lf61/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V
    .locals 0

    .line 1
    iput p3, p0, Lf61/e;->w:I

    iput-object p4, p0, Lf61/e;->E:Ljava/lang/Object;

    iput-object p5, p0, Lf61/e;->F:Ljava/lang/Object;

    iput-boolean p7, p0, Lf61/e;->x:Z

    iput-object p6, p0, Lf61/e;->G:Ljava/lang/Object;

    iput p1, p0, Lf61/e;->y:I

    iput p2, p0, Lf61/e;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lf61/i;Li61/b;Lg61/b;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lf61/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/e;->E:Ljava/lang/Object;

    iput-object p2, p0, Lf61/e;->F:Ljava/lang/Object;

    iput-object p3, p0, Lf61/e;->G:Ljava/lang/Object;

    iput-boolean p4, p0, Lf61/e;->x:Z

    iput p5, p0, Lf61/e;->y:I

    iput p6, p0, Lf61/e;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lf61/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lb2/h;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function3;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lf61/e;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v3, p0, Lf61/e;->x:Z

    iget v7, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v7}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lk71/m;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lf61/e;->x:Z

    iget v5, p0, Lf61/e;->y:I

    iget v6, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v8}, Lk71/j;->d(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lk01/e;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lf61/e;->x:Z

    iget v5, p0, Lf61/e;->y:I

    iget v6, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v8}, Lk01/d;->h(Landroidx/compose/ui/Modifier;Lk01/e;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lh01/a0;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lf61/e;->x:Z

    iget v5, p0, Lf61/e;->y:I

    iget v6, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v8}, Lh01/z;->f(Landroidx/compose/ui/Modifier;Lh01/a0;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lh01/q;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lf61/e;->x:Z

    iget v5, p0, Lf61/e;->y:I

    iget v6, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v8}, Lh01/p;->a(Landroidx/compose/ui/Modifier;Lh01/q;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lf61/e;->y:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v3, p0, Lf61/e;->x:Z

    iget v7, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v7}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lf61/e;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf61/i;

    iget-object v0, p0, Lf61/e;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Li61/b;

    iget-object v0, p0, Lf61/e;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg61/b;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v4, p0, Lf61/e;->x:Z

    iget v5, p0, Lf61/e;->y:I

    iget v6, p0, Lf61/e;->z:I

    invoke-static/range {v1 .. v8}, Lf61/i;->e(Lf61/i;Li61/b;Lg61/b;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
