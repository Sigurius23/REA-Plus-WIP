.class public final synthetic Lwc/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwc/e1;->w:I

    iput-object p1, p0, Lwc/e1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lwc/e1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lwc/e1;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lx6/u;Lx6/t;Lp6/l;Lx6/d;)V
    .locals 0

    .line 2
    const/4 p3, 0x7

    iput p3, p0, Lwc/e1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/e1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lwc/e1;->y:Ljava/lang/Object;

    iput-object p4, p0, Lwc/e1;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lwc/e1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lyv2/c;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lyv2/a;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lzv2/h;->c(Lkotlin/jvm/functions/Function1;Lyv2/c;Lyv2/a;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lwo2/b;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lxo2/a;

    invoke-static {v0, v1, v2, p1}, Lzo2/g;->f(Lwo2/b;Ll83/h;Ll83/h;Lxo2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lq0/b;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lzk2/e;->d(Ljava/util/List;Lq0/b;Lbc3/c0;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lal1/c;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lzk1/c;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Leb/s0;

    invoke-static {v0, v1, v2, p1}, Lzk1/a;->h(Lal1/c;Lzk1/c;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lzc1/f4;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lzc1/e4;->c(Lp1/c1;Lp1/c1;Lzc1/f4;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lx50/b;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lw50/a;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lx50/a;

    invoke-static {v0, v1, v2, p1}, Lz50/e;->a(Lx50/b;Lw50/a;Lkotlin/jvm/functions/Function1;Lx50/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lw22/a;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lw22/c;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lx22/a;

    invoke-static {v0, v1, v2, p1}, Lz22/i;->a(Lw22/a;Lw22/c;Ll83/h;Lx22/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lx0/c;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lx0/g;

    check-cast p1, Lg0/d;

    iget-object v0, v0, Lx0/c;->a:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_a

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lx0/b;

    instance-of v7, v6, Lx0/d;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v7, :cond_1

    new-instance v7, Lay/n;

    check-cast v6, Lx0/d;

    const/16 v11, 0xb

    invoke-direct {v7, v6, v11}, Lay/n;-><init>(Ljava/lang/Object;I)V

    iget v11, v6, Lx0/d;->c:I

    if-nez v11, :cond_0

    goto :goto_1

    :cond_0
    new-instance v9, Lb30/o4;

    const/16 v11, 0x11

    invoke-direct {v9, v6, v11}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    new-instance v11, Lx1/b;

    const v12, -0x731428a5

    invoke-direct {v11, v9, v10, v12}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v9, v11

    :goto_1
    new-instance v10, Lyo1/b;

    const/16 v11, 0x8

    invoke-direct {v10, v11, v6, v2}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v7, v9, v10, v8}, Lg0/d;->b(Lg0/d;Lc93/m;Lx1/b;Lc93/a;I)V

    goto/16 :goto_3

    :cond_1
    instance-of v7, v6, Lx0/h;

    if-eqz v7, :cond_8

    check-cast v6, Lx0/h;

    if-nez v1, :cond_2

    goto/16 :goto_3

    :cond_2
    iget v7, v6, Lx0/h;->c:I

    iget-object v6, v6, Lx0/h;->b:Landroid/view/textclassifier/TextClassification;

    if-gez v7, :cond_4

    new-instance v7, Lay/n;

    const/16 v11, 0xc

    invoke-direct {v7, v6, v11}, Lay/n;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v11

    if-eqz v11, :cond_3

    new-instance v9, Lb30/o4;

    const/16 v12, 0x12

    invoke-direct {v9, v11, v12}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    new-instance v11, Lx1/b;

    const v12, -0x42f30a7b

    invoke-direct {v11, v9, v10, v12}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v9, v11

    :cond_3
    new-instance v10, Lyo1/b;

    const/16 v11, 0xa

    invoke-direct {v10, v11, v1, v6}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v7, v9, v10, v8}, Lg0/d;->b(Lg0/d;Lc93/m;Lx1/b;Lc93/a;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Landroid/view/textclassifier/TextClassification;->getActions()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/app/RemoteAction;

    if-nez v7, :cond_5

    move v7, v10

    goto :goto_2

    :cond_5
    move v7, v4

    :goto_2
    new-instance v11, Lay/n;

    const/16 v12, 0xd

    invoke-direct {v11, v6, v12}, Lay/n;-><init>(Ljava/lang/Object;I)V

    if-nez v7, :cond_6

    invoke-virtual {v6}, Landroid/app/RemoteAction;->shouldShowIcon()Z

    move-result v7

    if-eqz v7, :cond_7

    :cond_6
    new-instance v7, Lb30/o4;

    const/16 v9, 0x13

    invoke-direct {v7, v6, v9}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    new-instance v9, Lx1/b;

    const v12, -0x4b2bf918

    invoke-direct {v9, v7, v10, v12}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    :cond_7
    new-instance v7, Lyy/b0;

    const/4 v10, 0x3

    invoke-direct {v7, v6, v10}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v11, v9, v7, v8}, Lg0/d;->b(Lg0/d;Lc93/m;Lx1/b;Lc93/a;I)V

    goto :goto_3

    :cond_8
    instance-of v6, v6, Lx0/f;

    if-eqz v6, :cond_9

    iget-object v6, p1, Lg0/d;->a:Lz1/p;

    sget-object v7, Lg0/b;->a:Lx1/b;

    invoke-virtual {v6, v7}, Lz1/p;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lwt2/q$c;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v0, v1, v2, p1}, Lyt2/m;->k(Lwt2/q$c;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lwt2/f;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, p1}, Lyt2/c;->c(Lwt2/f;Lkotlin/jvm/functions/Function1;Lc93/a;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Ll21/c;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lyl0/n;->e(Lld1/c;Ll21/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lyl0/c;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Locale;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lyl0/b;->d(Lyl0/c;Ljava/util/Locale;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lvf1/a;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lvf1/c;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lwf1/a;

    invoke-static {v0, v1, v2, p1}, Lyf1/h;->b(Lvf1/a;Lvf1/c;Ll83/h;Lwf1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lwb0/f;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Lwb0/f;

    invoke-static {v0, v1, v2, p1}, Lyb0/k;->c(Lwb0/f;Lkotlin/jvm/functions/Function1;Lp1/c1;Lwb0/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Landroid/icu/text/NumberFormat;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lyb0/g;->k(Landroid/icu/text/NumberFormat;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lup2/b;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Ll83/h;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    check-cast p1, Lvp2/a;

    invoke-static {v0, v1, v2, p1}, Lxp2/g;->d(Lup2/b;Ll83/h;Ll83/h;Lvp2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/community/CommunityRemoveMembersFragment;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->P(Lkotlin/jvm/internal/g0;Lcom/whoop/community/CommunityRemoveMembersFragment;Lkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/community/CommunityManageTeamFragment;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->K(Lkotlin/jvm/internal/g0;Lcom/whoop/community/CommunityManageTeamFragment;Lkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/community/CommunityAddMemberFragment;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->S(Lkotlin/jvm/internal/g0;Lcom/whoop/community/CommunityAddMemberFragment;Lkotlin/jvm/functions/Function1;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lvh0/c$f;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lqh0/b;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, p1}, Lxh0/c;->h(Lvh0/c$f;Lkotlin/jvm/functions/Function1;Lqh0/b;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object p1, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast p1, Lx6/u;

    iget-object v0, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v0, Lx6/t;

    iget-object v1, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v1, Lx6/d;

    check-cast p1, Lx6/v;

    invoke-virtual {p1}, Lx6/v;->a()J

    move-result-wide v2

    iget-wide v4, v0, Lx6/t;->b:J

    invoke-static {v2, v3, v4, v5}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result v2

    if-gez v2, :cond_f

    iget-wide v2, v0, Lx6/t;->b:J

    iget-object v0, p1, Lx6/v;->x:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Long;

    if-eqz v5, :cond_e

    invoke-static {v2, v3}, Lkotlin/time/Duration;->isPositive-impl(J)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v2, v3}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v7

    add-long/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    :cond_b
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v4, :cond_b

    goto :goto_4

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot call addTime with a negative duration"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Start the timer with startTimer before calling addTime"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    :goto_5
    new-instance v0, Lx6/c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lx6/c;-><init>(Lx6/d;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Ll3/g;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lb3/b3;

    check-cast p1, Lh2/b;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    if-eqz v0, :cond_10

    iget-wide v3, p1, Lh2/b;->a:J

    iget-object p1, v0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p1, v3, v4}, Ll3/w;->g(J)I

    move-result p1

    invoke-virtual {v1, p1, p1}, Ll3/g;->b(II)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/e;

    if-eqz p1, :cond_10

    iget-object v0, p1, Ll3/e;->d:Ljava/lang/String;

    const-string v1, "URL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p1, p1, Ll3/e;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    check-cast v2, Lb3/e1;

    invoke-virtual {v2, p1}, Lb3/e1;->a(Ljava/lang/String;)V

    :cond_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lwr0/t;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lwr0/s;->e(Lwr0/t;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lso1/b;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lwo1/t;->f(Lp1/h1;Lso1/b;Lc93/m;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lso1/b;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lp1/a1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1}, Lwo1/t;->g(Lso1/b;Lp1/a1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Ly3/c;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    check-cast p1, Ly2/y;

    invoke-static {v0, v1, v2, p1}, Lwo1/k;->a(Ly3/c;Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v0, v1, v2, p1}, Lwi0/e;->e(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lwc/e1;->x:Ljava/lang/Object;

    check-cast v0, Lwc/h1;

    iget-object v1, p0, Lwc/e1;->y:Ljava/lang/Object;

    check-cast v1, Lmg/h;

    iget-object v2, p0, Lwc/e1;->z:Ljava/lang/Object;

    check-cast v2, Lgf/b;

    check-cast p1, Lqd/e;

    const-string v3, "$this$fromEnvironment"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lwc/h1;->x:Ljava/lang/String;

    iput-object v3, p1, Lqd/e;->d:Ljava/lang/String;

    iget-object v0, v0, Lwc/h1;->z:Lpf/a;

    iget-object v3, p1, Lqd/e;->a:Lzt/q;

    invoke-virtual {v3, v0}, Lzt/q;->G(Lpf/a;)V

    iput-object v1, p1, Lqd/e;->k:Lmg/h;

    sget-object v0, Lcf/l;->d:Lgf/a;

    invoke-interface {v2, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/e;

    iput-object v0, p1, Lqd/e;->j:Lcf/e;

    sget-object v0, Lyd/d;->a:Lgf/a;

    invoke-interface {v2, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lqd/e;->n:Ljava/lang/String;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
