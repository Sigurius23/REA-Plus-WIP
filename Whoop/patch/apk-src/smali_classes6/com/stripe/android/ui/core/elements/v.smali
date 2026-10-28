.class public final Lcom/stripe/android/ui/core/elements/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    const-class v1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->valueOf(Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;)V

    return-object v0
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    return-object p1
.end method
