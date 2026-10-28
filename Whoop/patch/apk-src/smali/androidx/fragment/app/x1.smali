.class public final Landroidx/fragment/app/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/x1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:I

.field public final F:I

.field public final G:Ljava/lang/String;

.field public final H:Z

.field public final I:Z

.field public final J:Z

.field public final K:Z

.field public final L:I

.field public final M:Ljava/lang/String;

.field public final N:I

.field public final O:Z

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/q1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/fragment/app/q1;-><init>(I)V

    sput-object v0, Landroidx/fragment/app/x1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x1;->w:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x1;->x:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/x1;->y:Z

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Landroidx/fragment/app/x1;->z:Z

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/x1;->E:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/x1;->F:I

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x1;->G:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iput-boolean v0, p0, Landroidx/fragment/app/x1;->H:Z

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iput-boolean v0, p0, Landroidx/fragment/app/x1;->I:Z

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    move v0, v1

    :goto_4
    iput-boolean v0, p0, Landroidx/fragment/app/x1;->J:Z

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_5

    move v0, v2

    goto :goto_5

    :cond_5
    move v0, v1

    :goto_5
    iput-boolean v0, p0, Landroidx/fragment/app/x1;->K:Z

    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/x1;->L:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x1;->M:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/x1;->N:I

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_6

    move v1, v2

    :cond_6
    iput-boolean v1, p0, Landroidx/fragment/app/x1;->O:Z

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/m0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/x1;->w:Ljava/lang/String;

    .line 3
    iget-object v0, p1, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/x1;->x:Ljava/lang/String;

    .line 4
    iget-boolean v0, p1, Landroidx/fragment/app/m0;->mFromLayout:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x1;->y:Z

    .line 5
    iget-boolean v0, p1, Landroidx/fragment/app/m0;->mInDynamicContainer:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x1;->z:Z

    .line 6
    iget v0, p1, Landroidx/fragment/app/m0;->mFragmentId:I

    iput v0, p0, Landroidx/fragment/app/x1;->E:I

    .line 7
    iget v0, p1, Landroidx/fragment/app/m0;->mContainerId:I

    iput v0, p0, Landroidx/fragment/app/x1;->F:I

    .line 8
    iget-object v0, p1, Landroidx/fragment/app/m0;->mTag:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/x1;->G:Ljava/lang/String;

    .line 9
    iget-boolean v0, p1, Landroidx/fragment/app/m0;->mRetainInstance:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x1;->H:Z

    .line 10
    iget-boolean v0, p1, Landroidx/fragment/app/m0;->mRemoving:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x1;->I:Z

    .line 11
    iget-boolean v0, p1, Landroidx/fragment/app/m0;->mDetached:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x1;->J:Z

    .line 12
    iget-boolean v0, p1, Landroidx/fragment/app/m0;->mHidden:Z

    iput-boolean v0, p0, Landroidx/fragment/app/x1;->K:Z

    .line 13
    iget-object v0, p1, Landroidx/fragment/app/m0;->mMaxState:Landroidx/lifecycle/w;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/x1;->L:I

    .line 14
    iget-object v0, p1, Landroidx/fragment/app/m0;->mTargetWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/x1;->M:Ljava/lang/String;

    .line 15
    iget v0, p1, Landroidx/fragment/app/m0;->mTargetRequestCode:I

    iput v0, p0, Landroidx/fragment/app/x1;->N:I

    .line 16
    iget-boolean p1, p1, Landroidx/fragment/app/m0;->mUserVisibleHint:Z

    iput-boolean p1, p0, Landroidx/fragment/app/x1;->O:Z

    return-void
.end method


# virtual methods
.method public final b(Landroidx/fragment/app/w0;Ljava/lang/ClassLoader;)Landroidx/fragment/app/m0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/x1;->w:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/w0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object p1

    iget-object p2, p0, Landroidx/fragment/app/x1;->x:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->y:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mFromLayout:Z

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->z:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mInDynamicContainer:Z

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mRestored:Z

    iget p2, p0, Landroidx/fragment/app/x1;->E:I

    iput p2, p1, Landroidx/fragment/app/m0;->mFragmentId:I

    iget p2, p0, Landroidx/fragment/app/x1;->F:I

    iput p2, p1, Landroidx/fragment/app/m0;->mContainerId:I

    iget-object p2, p0, Landroidx/fragment/app/x1;->G:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/m0;->mTag:Ljava/lang/String;

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->H:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mRetainInstance:Z

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->I:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mRemoving:Z

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->J:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mDetached:Z

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->K:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mHidden:Z

    invoke-static {}, Landroidx/lifecycle/w;->values()[Landroidx/lifecycle/w;

    move-result-object p2

    iget v0, p0, Landroidx/fragment/app/x1;->L:I

    aget-object p2, p2, v0

    iput-object p2, p1, Landroidx/fragment/app/m0;->mMaxState:Landroidx/lifecycle/w;

    iget-object p2, p0, Landroidx/fragment/app/x1;->M:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/m0;->mTargetWho:Ljava/lang/String;

    iget p2, p0, Landroidx/fragment/app/x1;->N:I

    iput p2, p1, Landroidx/fragment/app/m0;->mTargetRequestCode:I

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->O:Z

    iput-boolean p2, p1, Landroidx/fragment/app/m0;->mUserVisibleHint:Z

    return-object p1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentState{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/x1;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/x1;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")}:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/fragment/app/x1;->y:Z

    if-eqz v1, :cond_0

    const-string v1, " fromLayout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-boolean v1, p0, Landroidx/fragment/app/x1;->z:Z

    if-eqz v1, :cond_1

    const-string v1, " dynamicContainer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget v1, p0, Landroidx/fragment/app/x1;->F:I

    if-eqz v1, :cond_2

    const-string v2, " id=0x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/x1;->G:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, " tag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-boolean v1, p0, Landroidx/fragment/app/x1;->H:Z

    if-eqz v1, :cond_4

    const-string v1, " retainInstance"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-boolean v1, p0, Landroidx/fragment/app/x1;->I:Z

    if-eqz v1, :cond_5

    const-string v1, " removing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-boolean v1, p0, Landroidx/fragment/app/x1;->J:Z

    if-eqz v1, :cond_6

    const-string v1, " detached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-boolean v1, p0, Landroidx/fragment/app/x1;->K:Z

    if-eqz v1, :cond_7

    const-string v1, " hidden"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Landroidx/fragment/app/x1;->M:Ljava/lang/String;

    if-eqz v1, :cond_8

    const-string v2, " targetWho="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " targetRequestCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/x1;->N:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_8
    iget-boolean v1, p0, Landroidx/fragment/app/x1;->O:Z

    if-eqz v1, :cond_9

    const-string v1, " userVisibleHint"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Landroidx/fragment/app/x1;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/fragment/app/x1;->x:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->y:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->z:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/x1;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/x1;->F:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/x1;->G:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->H:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->I:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->J:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->K:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/x1;->L:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/x1;->M:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/x1;->N:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Landroidx/fragment/app/x1;->O:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
