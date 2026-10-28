.class public final synthetic Lcom/whoop/data/local/room/dao/wipeable/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Lp1/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->w:I

    iput p1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    iput-object p2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->w:I

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    iput p2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    iput-object p3, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 3
    iput p4, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->w:I

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    iput-object p2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    iput p3, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lu0/v1;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Ly2/j1;

    move-object v2, p1

    check-cast v2, Ly2/i1;

    iget v3, v0, Lu0/v1;->x:I

    iget-object p1, v0, Lu0/v1;->w:Lu0/n1;

    iget-object v4, v0, Lu0/v1;->y:Lq3/e0;

    iget-object v0, v0, Lu0/v1;->z:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/p1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v6, 0x0

    iget v7, v1, Ly2/j1;->w:I

    invoke-static/range {v2 .. v7}, Lu0/n0;->h(Ly2/i1;ILq3/e0;Ll3/r0;ZI)Lh2/c;

    move-result-object v0

    sget-object v3, Lh0/d2;->w:Lh0/d2;

    iget v4, v1, Ly2/j1;->x:I

    iget v5, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-virtual {p1, v3, v0, v5, v4}, Lu0/n1;->a(Lh0/d2;Lh2/c;II)V

    iget-object p1, p1, Lu0/n1;->a:Lp1/g1;

    invoke-virtual {p1}, Lp1/g1;->x()F

    move-result p1

    neg-float p1, p1

    const/4 v0, 0x0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {v1, v0, p1, v2}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, v2, p1}, Ltr2/g;->h(Ljava/lang/String;Ljava/lang/String;ILtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Ln82/c;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Ltg2/j;->b(Ln82/c;ILkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lz1/s;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/a1;

    check-cast p1, Ly2/y;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lrs2/a;->f(Lz1/s;ILp1/a1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lib/u;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lrq0/e1$b;

    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lrq0/e1$b;->n(Lib/u;ILrq0/e1$b;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lib/u;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lrq0/w0;

    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lrq0/w0;->m(Lib/u;ILrq0/w0;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lib/u;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lrq0/k0;

    check-cast p1, Lhq0/a;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lrq0/k0;->o(Lib/u;ILrq0/k0;Lhq0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lib/u;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lrq0/i0$b;

    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lrq0/i0$b;->o(Lib/u;ILrq0/i0$b;Lcom/whoop/domain/model/RecordsDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lib/u;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lrq0/g;

    check-cast p1, Ljava/util/List;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lrq0/g;->l(Lib/u;ILrq0/g;Ljava/util/List;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lp6/s0;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    check-cast p1, Lr6/a;

    invoke-static {}, Lr6/i;->u()Lr6/h;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/i;

    invoke-static {v3, v0}, Lr6/i;->n(Lr6/i;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v0, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v0, Lr6/i;

    iget v3, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v3}, Lr6/i;->o(Lr6/i;I)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    array-length v0, v1

    invoke-static {v1, v3, v0}, Landroidx/glance/appwidget/protobuf/i;->d([BII)Landroidx/glance/appwidget/protobuf/h;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v1, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v1, Lr6/i;

    invoke-static {v1, v0}, Lr6/i;->p(Lr6/i;Landroidx/glance/appwidget/protobuf/h;)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/i;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p1, Lr6/n;

    invoke-static {p1, v0}, Lr6/n;->o(Lr6/n;Lr6/i;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lp6/s0;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Lr6/a;

    invoke-static {}, Lr6/e;->u()Lr6/d;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v3, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v3, Lr6/e;

    invoke-static {v3, v0}, Lr6/e;->n(Lr6/e;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v0, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v0, Lr6/e;

    iget v3, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v3}, Lr6/e;->o(Lr6/e;I)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object v0, v2, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast v0, Lr6/e;

    invoke-static {v0, v1}, Lr6/e;->p(Lr6/e;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/e;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p1, Lr6/n;

    invoke-static {p1, v0}, Lr6/n;->q(Lr6/n;Lr6/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v1, v2, p1}, Lm81/e;->a(Lkotlin/jvm/functions/Function1;Ljava/util/List;IZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/a1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v2, v0, v1, p1}, Llw1/e;->g(ILkotlin/jvm/functions/Function1;Lp1/a1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lik1/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Llk1/b;->b(Lz1/p;ILik1/e;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    check-cast p1, Lio/getstream/chat/android/client/audio/AudioState;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;->e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordingAttachmentsGroupView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;ILio/getstream/chat/android/client/audio/AudioState;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Lp1/a1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v2, v0, v1, p1}, Lep1/h;->l(ILp1/h1;Lp1/a1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->f(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;ILjava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    iget-object v1, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast p1, Ltb/a;

    iget v2, p0, Lcom/whoop/data/local/room/dao/wipeable/d;->x:I

    invoke-static {v0, v2, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->a(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;ILjava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
