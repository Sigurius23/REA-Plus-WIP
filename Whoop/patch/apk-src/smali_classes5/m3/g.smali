.class public final synthetic Lm3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lm3/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, Lm3/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lza/c;

    check-cast p2, Lza/c;

    iget-wide v0, p1, Lza/c;->b:J

    iget-wide p1, p2, Lza/c;->b:J

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Lza/d;

    check-cast p2, Lza/d;

    iget-object p1, p1, Lza/d;->a:Lza/e;

    iget p1, p1, Lza/e;->b:I

    iget-object p2, p2, Lza/d;->a:Lza/e;

    iget p2, p2, Lza/e;->b:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1, p2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->a(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Lyn/d;

    check-cast p2, Lyn/d;

    iget p2, p2, Lyn/d;->b:I

    iget p1, p1, Lyn/d;->b:I

    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :pswitch_3
    check-cast p1, Lra/d;

    check-cast p2, Lra/d;

    iget p2, p2, Lra/d;->b:I

    iget p1, p1, Lra/d;->b:I

    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :pswitch_4
    check-cast p1, Lp9/o;

    check-cast p2, Lp9/o;

    iget p1, p1, Lp9/o;->c:F

    iget p2, p2, Lp9/o;->c:F

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1

    :pswitch_5
    check-cast p1, Lp9/o;

    check-cast p2, Lp9/o;

    iget p1, p1, Lp9/o;->a:I

    iget p2, p2, Lp9/o;->a:I

    sub-int/2addr p1, p2

    return p1

    :pswitch_6
    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    const/4 p1, -0x1

    goto :goto_0

    :cond_2
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1

    :pswitch_7
    check-cast p1, Lp0/e0;

    check-cast p2, Lp0/e0;

    invoke-interface {p1}, Lp0/e0;->getIndex()I

    move-result p1

    invoke-interface {p2}, Lp0/e0;->getIndex()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1

    :pswitch_8
    check-cast p1, Lp0/d1;

    check-cast p2, Lp0/d1;

    iget p2, p2, Lp0/d1;->a:I

    iget p1, p1, Lp0/d1;->a:I

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1

    :pswitch_9
    check-cast p1, Lo9/p;

    check-cast p2, Lo9/p;

    iget-boolean v0, p1, Lo9/p;->E:Z

    iget v1, p1, Lo9/p;->J:I

    if-eqz v0, :cond_3

    iget-boolean v0, p1, Lo9/p;->H:Z

    if-eqz v0, :cond_3

    sget-object v0, Lo9/q;->j:Lzr/v0;

    goto :goto_1

    :cond_3
    sget-object v0, Lo9/q;->j:Lzr/v0;

    invoke-virtual {v0}, Lzr/v0;->a()Lzr/v0;

    move-result-object v0

    :goto_1
    iget-object v2, p1, Lo9/p;->F:Lo9/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p1, Lo9/p;->K:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v2, p2, Lo9/p;->K:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lzr/y;->a:Lzr/w;

    invoke-virtual {v3, p1, v2, v0}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget p2, p2, Lo9/p;->J:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v1, p2, v0}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-virtual {p1}, Lzr/y;->e()I

    move-result p1

    return p1

    :pswitch_a
    check-cast p1, Lo9/p;

    check-cast p2, Lo9/p;

    invoke-static {p1, p2}, Lo9/p;->c(Lo9/p;Lo9/p;)I

    move-result p1

    return p1

    :pswitch_b
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/m;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo9/m;

    invoke-virtual {p1, p2}, Lo9/m;->c(Lo9/m;)I

    move-result p1

    return p1

    :pswitch_c
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/f;

    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo9/f;

    invoke-virtual {p1, p2}, Lo9/f;->c(Lo9/f;)I

    move-result p1

    return p1

    :pswitch_d
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    new-instance v0, Lm3/g;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lm3/g;-><init>(I)V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo9/p;

    new-instance v1, Lm3/g;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lm3/g;-><init>(I)V

    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo9/p;

    invoke-static {v0, v1}, Lo9/p;->c(Lo9/p;Lo9/p;)I

    move-result v0

    invoke-static {v0}, Lzr/w;->f(I)Lzr/y;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lzr/y;->a(II)Lzr/y;

    move-result-object v0

    new-instance v1, Lm3/g;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lm3/g;-><init>(I)V

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/p;

    new-instance v1, Lm3/g;

    invoke-direct {v1, v2}, Lm3/g;-><init>(I)V

    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo9/p;

    new-instance v1, Lm3/g;

    invoke-direct {v1, v2}, Lm3/g;-><init>(I)V

    invoke-virtual {v0, p1, p2, v1}, Lzr/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lzr/y;

    move-result-object p1

    invoke-virtual {p1}, Lzr/y;->e()I

    move-result p1

    return p1

    :pswitch_e
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo9/g;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo9/g;

    iget p1, p1, Lo9/g;->F:I

    iget p2, p2, Lo9/g;->F:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_6

    const/4 v1, 0x0

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sub-int v1, p1, p2

    :cond_6
    :goto_2
    return v1

    :pswitch_10
    check-cast p1, Lu8/p;

    check-cast p2, Lu8/p;

    iget p2, p2, Lu8/p;->j:I

    iget p1, p1, Lu8/p;->j:I

    sub-int/2addr p2, p1

    return p2

    :pswitch_11
    check-cast p1, Lm7/w0;

    check-cast p2, Lm7/w0;

    iget-object p1, p1, Lm7/w0;->a:Ljava/time/Instant;

    iget-object p2, p2, Lm7/w0;->a:Ljava/time/Instant;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->compareTo(Ljava/time/Instant;)I

    move-result p1

    return p1

    :pswitch_12
    check-cast p1, Lm7/p;

    check-cast p2, Lm7/p;

    iget-object p1, p1, Lm7/p;->a:Ljava/time/Instant;

    iget-object p2, p2, Lm7/p;->a:Ljava/time/Instant;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->compareTo(Ljava/time/Instant;)I

    move-result p1

    return p1

    :pswitch_13
    check-cast p1, Lm7/v;

    check-cast p2, Lm7/v;

    iget-object p1, p1, Lm7/v;->a:Ljava/time/Instant;

    iget-object p2, p2, Lm7/v;->a:Ljava/time/Instant;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->compareTo(Ljava/time/Instant;)I

    move-result p1

    return p1

    :pswitch_14
    check-cast p1, Ll83/k;

    check-cast p2, Ll83/k;

    iget-object v0, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    iget-object p1, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p2, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    sub-int/2addr p1, p2

    sub-int/2addr v0, p1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
