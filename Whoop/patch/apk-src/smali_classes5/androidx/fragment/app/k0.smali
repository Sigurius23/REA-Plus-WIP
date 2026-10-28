.class public final Landroidx/fragment/app/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/k0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Landroidx/fragment/app/k0;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lv5/b;->x:Lv5/b;

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :pswitch_0
    new-instance v0, Ls/r2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ls/r2;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 5
    :pswitch_1
    new-instance v0, Lqq/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lqq/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_2
    new-instance v0, Lq4/f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lq4/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_3
    new-instance v0, Lpq/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lpq/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 8
    :pswitch_4
    new-instance v0, Lnr/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lnr/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 9
    :pswitch_5
    new-instance v0, Llr/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Llr/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 10
    :pswitch_6
    new-instance v0, Lhc/m;

    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p1, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lhc/m;->w:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    iput v2, v0, Lhc/m;->x:I

    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, v0, Lhc/m;->y:Landroid/os/Parcelable;

    return-object v0

    .line 15
    :pswitch_7
    new-instance v0, Lfc/j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lfc/j;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 16
    :pswitch_8
    new-instance v0, Lcr/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcr/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 17
    :pswitch_9
    new-instance v0, Lcom/google/android/material/textfield/h0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/material/textfield/h0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_a
    new-instance v0, Landroidx/fragment/app/l0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/l0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

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

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Landroidx/fragment/app/k0;->a:I

    packed-switch v0, :pswitch_data_0

    .line 19
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 20
    sget-object p1, Lv5/b;->x:Lv5/b;

    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :pswitch_0
    new-instance v0, Ls/r2;

    invoke-direct {v0, p1, p2}, Ls/r2;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 23
    :pswitch_1
    new-instance v0, Lqq/b;

    invoke-direct {v0, p1, p2}, Lqq/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 24
    :pswitch_2
    new-instance v0, Lq4/f;

    invoke-direct {v0, p1, p2}, Lq4/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 25
    :pswitch_3
    new-instance v0, Lpq/d;

    invoke-direct {v0, p1, p2}, Lpq/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 26
    :pswitch_4
    new-instance v0, Lnr/a;

    invoke-direct {v0, p1, p2}, Lnr/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 27
    :pswitch_5
    new-instance v0, Llr/d;

    invoke-direct {v0, p1, p2}, Llr/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 28
    :pswitch_6
    new-instance v0, Lhc/m;

    .line 29
    invoke-direct {v0, p1, p2}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lhc/m;->w:I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lhc/m;->x:I

    .line 32
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, v0, Lhc/m;->y:Landroid/os/Parcelable;

    return-object v0

    .line 33
    :pswitch_7
    new-instance v0, Lfc/j;

    invoke-direct {v0, p1, p2}, Lfc/j;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 34
    :pswitch_8
    new-instance v0, Lcr/a;

    invoke-direct {v0, p1, p2}, Lcr/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 35
    :pswitch_9
    new-instance v0, Lcom/google/android/material/textfield/h0;

    invoke-direct {v0, p1, p2}, Lcom/google/android/material/textfield/h0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 36
    :pswitch_a
    new-instance v0, Landroidx/fragment/app/l0;

    invoke-direct {v0, p1, p2}, Landroidx/fragment/app/l0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/fragment/app/k0;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lv5/b;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Ls/r2;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lqq/b;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lq4/f;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lpq/d;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lnr/a;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Llr/d;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lhc/m;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lfc/j;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Lcr/a;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Lcom/google/android/material/textfield/h0;

    return-object p1

    :pswitch_a
    new-array p1, p1, [Landroidx/fragment/app/l0;

    return-object p1

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
