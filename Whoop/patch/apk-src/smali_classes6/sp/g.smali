.class public final Lsp/g;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lsp/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public w:[Ljava/lang/String;

.field public x:[I

.field public y:Landroid/widget/RemoteViews;

.field public z:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Lsp/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lsp/g;->w:[Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->n(Landroid/os/Parcel;I[Ljava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lsp/g;->x:[I

    invoke-static {p1, v1, v2}, Lvo/c;->i(Landroid/os/Parcel;I[I)V

    const/4 v1, 0x3

    iget-object v2, p0, Lsp/g;->y:Landroid/widget/RemoteViews;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/4 p2, 0x4

    iget-object v1, p0, Lsp/g;->z:[B

    invoke-static {p1, p2, v1}, Lvo/c;->f(Landroid/os/Parcel;I[B)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
