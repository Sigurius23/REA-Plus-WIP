.class public final synthetic Ld30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ld30/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ld30/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lzc1/a1;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/o;

    check-cast p2, Lcom/whoop/archv2/model/template/BackgroundModel;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lyi0/d;->b(Lc0/o;Lcom/whoop/archv2/model/template/BackgroundModel;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lqy0/a;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lwo1/b;->a(Lqy0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Ly00/c;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/v3;

    invoke-direct {v0, p4, p2, p1, p3}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lsl0/d2;->e(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lc0/o;

    check-cast p2, Lm91/n;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lrm1/b;->a(Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ly3/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    check-cast p4, Ly3/c;

    invoke-static {p1, p2, p3, p4}, Lhb1/m;->a(Ly3/a;IILy3/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ly3/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    check-cast p4, Ly3/c;

    invoke-static {p1, p2, p3, p4}, Lhb1/m;->h(Ly3/a;IILy3/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lq83/j;

    check-cast p2, Landroid/content/Context;

    check-cast p3, Lf1/s;

    check-cast p4, Ls3/b;

    new-instance v0, Lf1/p;

    invoke-direct {v0, p1, p2, p3, p4}, Lf1/p;-><init>(Lq83/j;Landroid/content/Context;Lf1/s;Ls3/b;)V

    return-object v0

    :pswitch_8
    check-cast p1, Ljava/util/List;

    check-cast p2, Lq20/y;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    const-string v0, "displayablePaymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_5

    instance-of v1, p2, Lq20/i;

    if-nez v1, :cond_5

    instance-of v1, p2, Lq20/g;

    if-nez v1, :cond_5

    sget-object v1, Lq20/j;->x:Lq20/j;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    instance-of v1, p2, Lq20/m;

    if-nez v1, :cond_5

    instance-of v1, p2, Lq20/x;

    if-nez v1, :cond_5

    instance-of v1, p2, Lq20/t;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, p2, Lq20/w;

    if-eqz v1, :cond_4

    check-cast p2, Lq20/w;

    iget-object p2, p2, Lq20/w;->x:Ly00/o4;

    iget-object p2, p2, Ly00/o4;->w:Ljava/lang/String;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lh20/l;

    iget-object v3, v3, Lh20/l;->b:Ly00/o4;

    iget-object v3, v3, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v0, v2

    :cond_3
    check-cast v0, Lh20/l;

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    new-instance p2, Ld30/x;

    invoke-direct {p2, p1, v0, p3, p4}, Ld30/x;-><init>(Ljava/util/List;Lh20/l;ZZ)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
