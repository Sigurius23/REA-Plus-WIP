.class public final Ldp/h;
.super Lip/a;
.source "SourceFile"


# virtual methods
.method public final m0(Lcp/b;Ljava/lang/String;ILcp/b;)Lcp/a;
    .locals 1

    invoke-virtual {p0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p4}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, v0, p1}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method

.method public final n0(Lcp/b;Ljava/lang/String;ILcp/b;)Lcp/a;
    .locals 1

    invoke-virtual {p0}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v0, p4}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x3

    invoke-virtual {p0, v0, p1}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcp/b;->X(Landroid/os/IBinder;)Lcp/a;

    move-result-object p2

    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V

    return-object p2
.end method
