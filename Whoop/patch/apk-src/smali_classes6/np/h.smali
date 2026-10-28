.class public final Lnp/h;
.super Lip/h;
.source "SourceFile"


# instance fields
.field public g:Lcq/q;


# virtual methods
.method public final m0(Landroid/os/Parcel;I)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    sget-object p2, Ltp/l;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, p2}, Lnp/l;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ltp/l;

    iget-object p2, p0, Lnp/h;->g:Lcq/q;

    invoke-virtual {p2, p1}, Lcq/q;->b(Lvo/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lnp/h;->g:Lcq/q;

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
