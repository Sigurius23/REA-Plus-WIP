.class public final synthetic Lcom/whoop/data/local/room/dao/persistent/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lcom/whoop/data/local/room/dao/persistent/e;->w:I

    iput p1, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Luh1/b;->i(ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Luh1/b;->f(ILtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Ltr2/g;->n(ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lmh/h;

    invoke-static {v0, p1}, Ls32/c;->d(ILmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lqk2/b;->k(ILy3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lmh/h;

    invoke-static {v0, p1}, Lo11/l;->f(ILmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Collection doesn\'t contain element at index "

    const/16 v1, 0x2e

    iget v2, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    invoke-static {v0, v2, v1}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lju0/b;->d(ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelItemSwipeListener;->b(ILjava/util/Map$Entry;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->s(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->e(ILio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lio/getstream/chat/android/client/audio/TrackInfo;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->a(ILio/getstream/chat/android/client/audio/TrackInfo;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Li51/k;->a(ILandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lfx2/g;->i0(ILtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lfx2/g;->g0(ILtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lfx2/g;->h0(ILtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lfx2/g;->J(ILtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    invoke-static {v0, p1}, Lfu2/d;->f(ILcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WorkoutExercise;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    invoke-static {v0, p1}, Lfu2/d;->k(ILcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WorkoutGroup;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lfi/i;

    iget-object p1, p1, Lfi/i;->a:Landroid/content/Context;

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    invoke-static {p1, v0}, Lo73/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lfi/i;

    iget-object p1, p1, Lfi/i;->a:Landroid/content/Context;

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    invoke-static {p1, v0}, Lo73/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lfi/i;

    iget-object p1, p1, Lfi/i;->a:Landroid/content/Context;

    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    invoke-static {p1, v0}, Lo73/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lpg3/v0;

    invoke-static {v0, p1}, Lcq0/g;->e(ILpg3/v0;)Lcom/whoop/domain/model/RecordsDto;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Lpg3/v0;

    invoke-static {v0, p1}, Lcq0/g;->a(ILpg3/v0;)Lcom/whoop/domain/model/RecordsDto;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao_Impl;->g(ILtb/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->f(ILtb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->a(ILtb/a;)Lcom/whoop/domain/model/teams/MemberStory;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget v0, p0, Lcom/whoop/data/local/room/dao/persistent/e;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao_Impl;->e(ILtb/a;)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
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
