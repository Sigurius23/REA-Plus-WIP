.class public Lcom/whoop/realtime/DataBinderMapperImpl;
.super Landroidx/databinding/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/DataBinderMapperImpl$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/util/SparseIntArray;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    sput-object v0, Lcom/whoop/realtime/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    sget v2, Lk52/e;->b:I

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->c:I

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->d:I

    const/4 v3, 0x3

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->e:I

    const/4 v3, 0x4

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->f:I

    const/4 v3, 0x5

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->g:I

    const/4 v3, 0x6

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->h:I

    const/4 v3, 0x7

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->i:I

    const/16 v3, 0x8

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->k:I

    const/16 v3, 0x9

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->l:I

    const/16 v3, 0xa

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->m:I

    const/16 v3, 0xb

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    sget v2, Lk52/e;->n:I

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

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;

    invoke-direct {v1}, Landroidx/databinding/library/baseAdapters/DataBinderMapperImpl;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getDataBinder(Landroidx/databinding/f;Landroid/view/View;I)Landroidx/databinding/a0;
    .locals 1

    .line 1
    sget-object v0, Lcom/whoop/realtime/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_d

    .line 2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 3
    :pswitch_0
    const-string p3, "layout/view_rtstrain_range_segment_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 4
    new-instance p3, Lm52/x;

    filled-new-array {p2}, [Landroid/view/View;

    move-result-object p2

    invoke-direct {p3, p1, p2}, Lm52/x;-><init>(Landroidx/databinding/f;[Landroid/view/View;)V

    return-object p3

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_rtstrain_range_segment is invalid. Received: "

    .line 6
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :pswitch_1
    const-string p3, "layout/view_realtime_cell_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 9
    new-instance p3, Lm52/v;

    filled-new-array {p2}, [Landroid/view/View;

    move-result-object p2

    invoke-direct {p3, p1, p2}, Lm52/v;-><init>(Landroidx/databinding/f;[Landroid/view/View;)V

    return-object p3

    .line 10
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_realtime_cell is invalid. Received: "

    .line 11
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 12
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :pswitch_2
    const-string p3, "layout/view_real_time_strain_range_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 14
    new-instance p3, Lm52/t;

    invoke-direct {p3, p1, p2}, Lm52/t;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_real_time_strain_range is invalid. Received: "

    .line 16
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :pswitch_3
    const-string p3, "layout/view_daystrain_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 19
    new-instance p3, Lm52/r;

    invoke-direct {p3, p1, p2}, Lm52/r;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 20
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_daystrain is invalid. Received: "

    .line 21
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :pswitch_4
    const-string p3, "layout/layout_gps_map_fragment_activity_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 24
    new-instance p3, Lm52/p;

    invoke-direct {p3, p1, p2}, Lm52/p;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 25
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for layout_gps_map_fragment_activity is invalid. Received: "

    .line 26
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :pswitch_5
    const-string p3, "layout/layout_gps_map_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 29
    new-instance p3, Lm52/n;

    invoke-direct {p3, p1, p2}, Lm52/n;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 30
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for layout_gps_map is invalid. Received: "

    .line 31
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 33
    :pswitch_6
    const-string p3, "layout/fragment_select_activity_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 34
    new-instance p3, Lm52/l;

    invoke-direct {p3, p1, p2}, Lm52/l;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 35
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_select_activity is invalid. Received: "

    .line 36
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 38
    :pswitch_7
    const-string p3, "layout/fragment_realtime_sleep_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    .line 39
    new-instance p3, Lm52/j;

    invoke-direct {p3, p1, p2}, Lm52/j;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 40
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_realtime_sleep is invalid. Received: "

    .line 41
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :pswitch_8
    const-string p3, "layout/fragment_real_time_map_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_8

    .line 44
    new-instance p3, Lm52/h;

    invoke-direct {p3, p1, p2}, Lm52/h;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 45
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_real_time_map is invalid. Received: "

    .line 46
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 48
    :pswitch_9
    const-string p3, "layout/fragment_real_time_heartrate_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 49
    new-instance p3, Lm52/f;

    invoke-direct {p3, p1, p2}, Lm52/f;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 50
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_real_time_heartrate is invalid. Received: "

    .line 51
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 53
    :pswitch_a
    const-string p3, "layout/fragment_real_time_activity_strain_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 54
    new-instance p3, Lm52/d;

    invoke-direct {p3, p1, p2}, Lm52/d;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 55
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for fragment_real_time_activity_strain is invalid. Received: "

    .line 56
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 58
    :pswitch_b
    const-string p3, "layout/activity_start_activity_kotlin_0"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    .line 59
    new-instance p3, Lm52/b;

    invoke-direct {p3, p1, p2}, Lm52/b;-><init>(Landroidx/databinding/f;Landroid/view/View;)V

    return-object p3

    .line 60
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for activity_start_activity_kotlin is invalid. Received: "

    .line 61
    invoke-static {v0, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 63
    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    :goto_0
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
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
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_6

    .line 112
    array-length v1, p2

    if-nez v1, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    sget-object v1, Lcom/whoop/realtime/DataBinderMapperImpl;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v1, p3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p3

    if-lez p3, :cond_6

    const/4 v1, 0x0

    .line 114
    aget-object v1, p2, v1

    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    const/16 v2, 0xb

    if-eq p3, v2, :cond_3

    const/16 v2, 0xc

    if-eq p3, v2, :cond_1

    goto :goto_0

    .line 115
    :cond_1
    const-string p3, "layout/view_rtstrain_range_segment_0"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 116
    new-instance p3, Lm52/x;

    invoke-direct {p3, p1, p2}, Lm52/x;-><init>(Landroidx/databinding/f;[Landroid/view/View;)V

    return-object p3

    .line 117
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_rtstrain_range_segment is invalid. Received: "

    .line 118
    invoke-static {v1, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 119
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_3
    const-string p3, "layout/view_realtime_cell_0"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 121
    new-instance p3, Lm52/v;

    invoke-direct {p3, p1, p2}, Lm52/v;-><init>(Landroidx/databinding/f;[Landroid/view/View;)V

    return-object p3

    .line 122
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The tag for view_realtime_cell is invalid. Received: "

    .line 123
    invoke-static {v1, p2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 125
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "view must have a tag"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_0
    return-object v0
.end method

.method public getLayoutId(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, Lcom/whoop/realtime/DataBinderMapperImpl$a;->a:Ljava/util/HashMap;

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
