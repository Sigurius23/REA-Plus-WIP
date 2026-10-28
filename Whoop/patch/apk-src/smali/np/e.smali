.class public final Lnp/e;
.super Lnp/a;
.source "SourceFile"


# virtual methods
.method public final j0(Lnp/k;)V
    .locals 1

    invoke-virtual {p0}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 p1, 0x3b

    invoke-virtual {p0, v0, p1}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    return-void
.end method
