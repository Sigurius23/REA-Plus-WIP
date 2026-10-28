.class public final Luo/m;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Luo/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:I

.field public x:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsp/e;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lsp/e;-><init>(I)V

    sput-object v0, Luo/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Luo/m;->w:I

    iput-object p2, p0, Luo/m;->x:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Luo/m;->w:I

    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Luo/m;->x:Ljava/util/List;

    return-object v0
.end method

.method public final h(Luo/j;)V
    .locals 1

    iget-object v0, p0, Luo/m;->x:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luo/m;->x:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Luo/m;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static {p1, v1, v0}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v0, p0, Luo/m;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x2

    iget-object v1, p0, Luo/m;->x:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
