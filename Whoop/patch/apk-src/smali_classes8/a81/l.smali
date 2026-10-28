.class public final synthetic La81/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput v0, p0, La81/l;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La81/l;->z:Ljava/lang/Object;

    iput-object p2, p0, La81/l;->E:Ljava/lang/Object;

    iput-object p3, p0, La81/l;->x:Ljava/lang/Object;

    iput-object p4, p0, La81/l;->F:Ljava/lang/Object;

    iput-object p5, p0, La81/l;->y:Ljava/lang/Object;

    iput-object p6, p0, La81/l;->G:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p7, p0, La81/l;->w:I

    iput-object p1, p0, La81/l;->x:Ljava/lang/Object;

    iput-object p2, p0, La81/l;->z:Ljava/lang/Object;

    iput-object p3, p0, La81/l;->E:Ljava/lang/Object;

    iput-object p4, p0, La81/l;->F:Ljava/lang/Object;

    iput-object p5, p0, La81/l;->y:Ljava/lang/Object;

    iput-object p6, p0, La81/l;->G:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p7, p0, La81/l;->w:I

    iput-object p1, p0, La81/l;->x:Ljava/lang/Object;

    iput-object p2, p0, La81/l;->y:Ljava/lang/Object;

    iput-object p3, p0, La81/l;->z:Ljava/lang/Object;

    iput-object p4, p0, La81/l;->E:Ljava/lang/Object;

    iput-object p5, p0, La81/l;->F:Ljava/lang/Object;

    iput-object p6, p0, La81/l;->G:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, La81/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lzv2/i;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    invoke-static/range {v1 .. v6}, Lzv2/h;->p(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/lang/String;Ljava/lang/String;Lzv2/i;Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/o;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    check-cast v0, Lec3/f2;

    iget-object v2, p0, La81/l;->E:Ljava/lang/Object;

    check-cast v2, Lec3/f2;

    iget-object v3, p0, La81/l;->F:Ljava/lang/Object;

    check-cast v3, Lec3/f2;

    iget-object v4, p0, La81/l;->y:Ljava/lang/Object;

    check-cast v4, Lec3/f2;

    iget-object v5, p0, La81/l;->G:Ljava/lang/Object;

    check-cast v5, Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v0

    invoke-interface/range {v1 .. v6}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lot2/c;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/f$a;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-static/range {v1 .. v6}, Lpt2/l;->p(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lot2/c;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lmf0/g;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/t2;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-static/range {v1 .. v6}, Lmf0/e;->y(Lmf0/g;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/t2;Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcp1/d;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lhp1/d;

    invoke-static/range {v1 .. v6}, Ljp1/g;->c(Lcp1/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lhp1/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lb3/x2;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg2/i;

    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/c0;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lis0/m0;

    invoke-static/range {v1 .. v6}, Lis0/j0;->t(Lb3/x2;Lg2/i;Lbc3/c0;Lp1/c1;Lp1/c1;Lis0/m0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;->a(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lql0/c;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lh/i;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-static/range {v1 .. v6}, Lih0/l;->k(Lbc3/c0;Lql0/c;Lh/i;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/io/File;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lh/i;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lh/i;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetContentKt;->i(Landroid/content/Context;Ljava/io/File;Lh/i;Lh/i;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lys2/e$j;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/f$a;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-static/range {v1 .. v6}, Lat2/c0;->h(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lys2/e$j;Lv41/f$a;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcm2/g;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lg1/y3;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    invoke-static/range {v1 .. v6}, Lam2/w;->q(Lbc3/c0;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcm2/g;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, La81/l;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbc3/c0;

    iget-object v0, p0, La81/l;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ll1/w3;

    iget-object v0, p0, La81/l;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    iget-object v0, p0, La81/l;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lfi0/a;

    iget-object v0, p0, La81/l;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, La81/l;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    invoke-static/range {v1 .. v6}, La81/o;->h(Lbc3/c0;Ll1/w3;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
