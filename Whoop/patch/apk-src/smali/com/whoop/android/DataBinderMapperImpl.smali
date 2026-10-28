.class public Lcom/whoop/android/DataBinderMapperImpl;
.super Landroidx/databinding/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/android/DataBinderMapperImpl$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/util/SparseIntArray;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    sput-object v0, Lcom/whoop/android/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    sget v2, Lhi0/f;->a:I

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->b:I

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->c:I

    const/4 v3, 0x3

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->d:I

    const/4 v3, 0x4

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->e:I

    const/4 v3, 0x5

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->f:I

    const/4 v3, 0x6

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->g:I

    const/4 v3, 0x7

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->h:I

    const/16 v3, 0x8

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->j:I

    const/16 v3, 0x9

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->k:I

    const/16 v3, 0xa

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->l:I

    const/16 v3, 0xb

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->m:I

    const/16 v3, 0xc

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->q:I

    const/16 v3, 0xd

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->r:I

    const/16 v3, 0xe

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->s:I

    const/16 v3, 0xf

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->t:I

    const/16 v3, 0x10

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->u:I

    const/16 v3, 0x11

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->v:I

    const/16 v3, 0x12

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lhi0/f;->w:I

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collectDependencies()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/databinding/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;

    invoke-direct {v1}, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/whoop/community/DataBinderMapperImpl;

    invoke-direct {v1}, Lcom/whoop/community/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/whoop/profile/DataBinderMapperImpl;

    invoke-direct {v1}, Lcom/whoop/profile/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/whoop/realtime/DataBinderMapperImpl;

    invoke-direct {v1}, Lcom/whoop/realtime/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/whoop/settings/DataBinderMapperImpl;

    invoke-direct {v1}, Lcom/whoop/settings/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/whoop/sleep/coach/DataBinderMapperImpl;

    invoke-direct {v1}, Lcom/whoop/sleep/coach/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/whoop/whooplive/DataBinderMapperImpl;

    invoke-direct {v1}, Lcom/whoop/whooplive/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getDataBinder(Landroidx/databinding/f;Landroid/view/View;I)Landroidx/databinding/a0;
    .locals 1

    .line 1
    sget-object v0, Lcom/whoop/android/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_14

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 3
    :pswitch_0
    const-string p3, "layout/view_new_strap_settings_battery_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 4
    new-instance p3, Lii0/l0;

    invoke-direct {p3, p1, p2}, Lii0/l0;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_new_strap_settings_battery is invalid. Received: "

    .line 6
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :pswitch_1
    const-string p3, "layout/view_loading_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 9
    new-instance p3, Lii0/j0;

    invoke-direct {p3, p1, p2}, Lii0/j0;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_loading is invalid. Received: "

    .line 11
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 12
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :pswitch_2
    const-string p3, "layout/view_enable_location_services_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 14
    new-instance p3, Lii0/h0;

    invoke-direct {p3, p1, p2}, Lii0/h0;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_enable_location_services is invalid. Received: "

    .line 16
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :pswitch_3
    const-string p3, "layout/view_enable_bluetooth_services_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 19
    new-instance p3, Lii0/f0;

    invoke-direct {p3, p1, p2}, Lii0/f0;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 20
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_enable_bluetooth_services is invalid. Received: "

    .line 21
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :pswitch_4
    const-string p3, "layout/view_choose_gen4_bluetooth_device_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 24
    new-instance p3, Lii0/d0;

    invoke-direct {p3, p1, p2}, Lii0/d0;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 25
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_choose_gen4_bluetooth_device is invalid. Received: "

    .line 26
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :pswitch_5
    const-string p3, "layout/view_allow_location_permissions_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 29
    new-instance p3, Lii0/b0;

    invoke-direct {p3, p1, p2}, Lii0/b0;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 30
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_allow_location_permissions is invalid. Received: "

    .line 31
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :pswitch_6
    const-string p3, "layout/view_advanced_settings_item_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 34
    new-instance p3, Lii0/z;

    invoke-direct {p3, p1, p2}, Lii0/z;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 35
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_advanced_settings_item is invalid. Received: "

    .line 36
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 38
    :pswitch_7
    const-string p3, "layout/fragment_strap_status_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 39
    new-instance p3, Lii0/x;

    invoke-direct {p3, p1, p2}, Lii0/x;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 40
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_strap_status is invalid. Received: "

    .line 41
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :pswitch_8
    const-string p3, "layout/fragment_strap_settings_landing_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 44
    new-instance p3, Lii0/v;

    invoke-direct {p3, p1, p2}, Lii0/v;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 45
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_strap_settings_landing is invalid. Received: "

    .line 46
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :pswitch_9
    const-string p3, "layout/fragment_settings_landing_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 49
    new-instance p3, Lii0/t;

    invoke-direct {p3, p1, p2}, Lii0/t;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 50
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_settings_landing is invalid. Received: "

    .line 51
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :pswitch_a
    const-string p3, "layout/fragment_push_debug_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 54
    new-instance p3, Lii0/r;

    invoke-direct {p3, p1, p2}, Lii0/r;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 55
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_push_debug is invalid. Received: "

    .line 56
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :pswitch_b
    const-string p3, "layout/fragment_gift_whoop_landing_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    .line 59
    new-instance p3, Lii0/p;

    invoke-direct {p3, p1, p2}, Lii0/p;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 60
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_gift_whoop_landing is invalid. Received: "

    .line 61
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 63
    :pswitch_c
    const-string p3, "layout/fragment_debug_iterable_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_c

    .line 64
    new-instance p3, Lii0/n;

    invoke-direct {p3, p1, p2}, Lii0/n;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 65
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_debug_iterable is invalid. Received: "

    .line 66
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :pswitch_d
    const-string p3, "layout/fragment_advanced_settings_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_d

    .line 69
    new-instance p3, Lii0/l;

    invoke-direct {p3, p1, p2}, Lii0/l;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 70
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_advanced_settings is invalid. Received: "

    .line 71
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :pswitch_e
    const-string p3, "layout/connect_strap_network_error_view_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    .line 74
    new-instance p3, Lii0/j;

    invoke-direct {p3, p1, p2}, Lii0/j;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 75
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for connect_strap_network_error_view is invalid. Received: "

    .line 76
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 77
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :pswitch_f
    const-string p3, "layout/activity_main_v2_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_f

    .line 79
    new-instance p3, Lii0/h;

    invoke-direct {p3, p1, p2}, Lii0/h;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 80
    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for activity_main_v2 is invalid. Received: "

    .line 81
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :pswitch_10
    const-string p3, "layout/activity_edit_device_name_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_10

    .line 84
    new-instance p3, Lii0/f;

    invoke-direct {p3, p1, p2}, Lii0/f;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 85
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for activity_edit_device_name is invalid. Received: "

    .line 86
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 87
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 88
    :pswitch_11
    const-string p3, "layout/activity_ble_connect_strap_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_11

    .line 89
    new-instance p3, Lii0/d;

    invoke-direct {p3, p1, p2}, Lii0/d;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 90
    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for activity_ble_connect_strap is invalid. Received: "

    .line 91
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 92
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :pswitch_12
    const-string p3, "layout/activity_ble_choose_strap_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_12

    .line 94
    new-instance p3, Lii0/b;

    invoke-direct {p3, p1, p2}, Lii0/b;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 95
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for activity_ble_choose_strap is invalid. Received: "

    .line 96
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 98
    :cond_13
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    :goto_0
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

.method public getDataBinder(Landroidx/databinding/f;[Landroid/view/View;I)Landroidx/databinding/a0;
    .locals 1

    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 175
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    .line 176
    :cond_0
    sget-object v0, Lcom/whoop/android/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_2

    const/4 p3, 0x0

    .line 177
    aget-object p2, p2, p3

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 178
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method public getLayoutId(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, Lcom/whoop/android/DataBinderMapperImpl$a;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
