.class public final Lv20/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv20/k;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv20/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Lv20/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv20/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv20/h;->w:Lv20/h;

    new-instance v0, Lv20/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv20/e;-><init>(I)V

    sput-object v0, Lv20/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
