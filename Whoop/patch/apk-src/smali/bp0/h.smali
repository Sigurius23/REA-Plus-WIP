.class public final synthetic Lbp0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lbp0/h;->w:I

    iput-object p2, p0, Lbp0/h;->x:Ljava/lang/Object;

    iput-object p3, p0, Lbp0/h;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbp0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/h;->x:Ljava/lang/Object;

    check-cast v0, Lg1/a2;

    iget-object v1, p0, Lbp0/h;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lvn1/s;->a(Lg1/a2;Lc93/m;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbp0/h;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbp0/h;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lun1/g;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbp0/h;->x:Ljava/lang/Object;

    check-cast v0, Landroid/text/Spannable;

    iget-object v1, p0, Lbp0/h;->y:Ljava/lang/Object;

    check-cast v1, Ll80/m;

    check-cast p1, Ll3/m0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    new-instance v2, Lo3/l;

    iget-object v3, p1, Ll3/m0;->f:Lp3/i;

    iget-object v4, p1, Ll3/m0;->c:Lp3/r;

    if-nez v4, :cond_0

    sget-object v4, Lp3/r;->F:Lp3/r;

    :cond_0
    iget-object v5, p1, Ll3/m0;->d:Lp3/n;

    if-eqz v5, :cond_1

    iget v5, v5, Lp3/n;->a:I

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    iget-object p1, p1, Ll3/m0;->e:Lp3/o;

    if-eqz p1, :cond_2

    iget p1, p1, Lp3/o;->a:I

    goto :goto_1

    :cond_2
    const p1, 0xffff

    :goto_1
    iget-object v1, v1, Ll80/m;->x:Ljava/lang/Object;

    check-cast v1, Lt3/c;

    iget-object v6, v1, Lt3/c;->e:Lp3/h;

    check-cast v6, Lp3/j;

    invoke-virtual {v6, v3, v4, v5, p1}, Lp3/j;->b(Lp3/i;Lp3/r;II)Lp3/e0;

    move-result-object p1

    instance-of v3, p1, Lp3/d0;

    if-nez v3, :cond_3

    new-instance v3, Lq30/w0;

    iget-object v4, v1, Lt3/c;->j:Lq30/w0;

    invoke-direct {v3, p1, v4}, Lq30/w0;-><init>(Lp3/e0;Lq30/w0;)V

    iput-object v3, v1, Lt3/c;->j:Lq30/w0;

    invoke-virtual {v3}, Lq30/w0;->v()Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2

    :cond_3
    check-cast p1, Lp3/d0;

    iget-object p1, p1, Lp3/d0;->w:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    :goto_2
    invoke-direct {v2, p1}, Lo3/l;-><init>(Landroid/graphics/Typeface;)V

    const/16 p1, 0x21

    invoke-interface {v0, v2, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbp0/h;->x:Ljava/lang/Object;

    check-cast v0, Lrz0/f;

    iget-object v1, p0, Lbp0/h;->y:Ljava/lang/Object;

    check-cast v1, Lt0/i;

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lrz0/e;->c(Lrz0/f;Lt0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbp0/h;->x:Ljava/lang/Object;

    check-cast v0, Lht2/a;

    iget-object v1, p0, Lbp0/h;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lht2/e;->t(Lht2/a;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbp0/h;->x:Ljava/lang/Object;

    check-cast v0, Lbp0/a;

    iget-object v1, p0, Lbp0/h;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lbp0/s;->t(Lbp0/a;Lp1/c1;Ljava/lang/String;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
