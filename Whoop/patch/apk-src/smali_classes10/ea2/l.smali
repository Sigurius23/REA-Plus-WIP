.class public final synthetic Lea2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lea2/l;->w:I

    iput-object p1, p0, Lea2/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    iget v0, p0, Lea2/l;->w:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Lea2/l;->x:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Ltx0/a;

    invoke-virtual {v4, p1, p2}, Ltx0/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :pswitch_0
    check-cast v4, [Lkotlin/jvm/functions/Function1;

    array-length v0, v4

    move v1, v3

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, v4, v1

    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Comparable;

    invoke-interface {v2, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Comparable;

    invoke-static {v5, v2}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v2

    if-eqz v2, :cond_0

    move v3, v2

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v3

    :pswitch_1
    check-cast v4, Lm22/b;

    invoke-virtual {v4, p1, p2}, Lm22/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :pswitch_2
    check-cast v4, Llive/hms/video/utils/c;

    invoke-static {v4, p1, p2}, Llive/hms/video/utils/LogUtils;->b(Llive/hms/video/utils/c;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_3
    check-cast v4, [Ljava/lang/String;

    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object p1, p1, Lt23/g2;->M:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move p1, v3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move p1, v2

    :goto_2
    iget-object p2, p2, Lt23/g2;->M:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    move p2, v3

    goto :goto_3

    :cond_6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move p2, v2

    :goto_3
    if-eqz p1, :cond_8

    if-nez p2, :cond_8

    goto :goto_4

    :cond_8
    if-nez p1, :cond_9

    if-eqz p2, :cond_9

    move v1, v2

    goto :goto_4

    :cond_9
    move v1, v3

    :goto_4
    return v1

    :pswitch_4
    check-cast v4, Ljava/util/Map;

    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    const-string v0, "$pins"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lt23/g2;->a:Ljava/lang/String;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv43/a;

    iget-object p2, p2, Lt23/g2;->a:Ljava/lang/String;

    invoke-interface {v4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv43/a;

    if-eqz p1, :cond_a

    if-nez p2, :cond_a

    goto :goto_5

    :cond_a
    if-nez p1, :cond_b

    if-eqz p2, :cond_b

    move v1, v2

    goto :goto_5

    :cond_b
    if-nez p1, :cond_c

    if-nez p2, :cond_c

    move v1, v3

    goto :goto_5

    :cond_c
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Lv43/b;->w:Lv43/b;

    sget-object v0, Lv43/b;->w:Lv43/b;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, p2, Lv43/a;->b:Ljg3/i;

    iget-object p1, p1, Lv43/a;->b:Ljg3/i;

    invoke-virtual {p2, p1}, Ljg3/i;->o0(Ljg3/i;)I

    move-result v1

    :goto_5
    return v1

    :pswitch_5
    check-cast v4, Lj43/a;

    check-cast p1, Lt23/g2;

    check-cast p2, Lt23/g2;

    iget-object p1, p1, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v4, p1}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p2, p2, Lt23/g2;->e:Lstream/video/sfu/models/ParticipantSource;

    invoke-virtual {v4, p2}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1

    :pswitch_6
    check-cast v4, [Ljava/util/Comparator;

    const-string v0, "$comparators"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v4

    move v1, v3

    :goto_6
    if-ge v1, v0, :cond_e

    aget-object v2, v4, v1

    invoke-interface {v2, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-eqz v2, :cond_d

    move v3, v2

    goto :goto_7

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_e
    :goto_7
    return v3

    :pswitch_7
    check-cast v4, Lhb2/f;

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->w:I

    invoke-virtual {v4, p1, p2}, Lhb2/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :pswitch_8
    check-cast v4, Li9/r;

    invoke-interface {v4, p2}, Li9/r;->a(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {v4, p1}, Li9/r;->a(Ljava/lang/Object;)I

    move-result p1

    :goto_8
    sub-int/2addr p2, p1

    return p2

    :pswitch_9
    check-cast v4, Lc93/m;

    invoke-interface {v4, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :pswitch_a
    check-cast v4, Lhn/t;

    invoke-interface {v4, p2}, Lhn/t;->a(Ljava/lang/Object;)I

    move-result p2

    invoke-interface {v4, p1}, Lhn/t;->a(Ljava/lang/Object;)I

    move-result p1

    goto :goto_8

    :pswitch_b
    check-cast v4, Lej1/h;

    invoke-virtual {v4, p1, p2}, Lej1/h;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :pswitch_c
    check-cast v4, Lcom/whoop/profile/view/edit/c;

    invoke-static {v4, p1, p2}, Lea2/n;->i(Lcom/whoop/profile/view/edit/c;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
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
