.class public final Lvn/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lvn/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvn/r;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lvn/s;

    invoke-direct {v0, p1}, Lvn/s;-><init>(Landroid/os/Parcel;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lvn/t;

    invoke-direct {v0, p1}, Lvn/t;-><init>(Landroid/os/Parcel;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvn/r;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Lvn/s;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lvn/t;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
