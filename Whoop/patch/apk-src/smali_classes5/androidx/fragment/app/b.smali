.class public final Landroidx/fragment/app/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:I

.field public final F:Ljava/lang/String;

.field public final G:I

.field public final H:I

.field public final I:Ljava/lang/CharSequence;

.field public final J:I

.field public final K:Ljava/lang/CharSequence;

.field public final L:Ljava/util/ArrayList;

.field public final M:Ljava/util/ArrayList;

.field public final N:Z

.field public final w:[I

.field public final x:Ljava/util/ArrayList;

.field public final y:[I

.field public final z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La10/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, La10/a;-><init>(I)V

    sput-object v0, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->w:[I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->x:Ljava/util/ArrayList;

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->y:[I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->z:[I

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/b;->E:I

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->F:Ljava/lang/String;

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/b;->G:I

    .line 37
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/b;->H:I

    .line 38
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    iput-object v1, p0, Landroidx/fragment/app/b;->I:Ljava/lang/CharSequence;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Landroidx/fragment/app/b;->J:I

    .line 40
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/b;->K:Ljava/lang/CharSequence;

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->L:Ljava/util/ArrayList;

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/b;->M:Ljava/util/ArrayList;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Landroidx/fragment/app/b;->N:Z

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x6

    .line 3
    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/fragment/app/b;->w:[I

    .line 4
    iget-boolean v1, p1, Landroidx/fragment/app/c2;->i:Z

    if-eqz v1, :cond_2

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Landroidx/fragment/app/b;->x:Ljava/util/ArrayList;

    .line 6
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/fragment/app/b;->y:[I

    .line 7
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/fragment/app/b;->z:[I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    .line 8
    iget-object v3, p1, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/b2;

    .line 9
    iget-object v4, p0, Landroidx/fragment/app/b;->w:[I

    add-int/lit8 v5, v2, 0x1

    iget v6, v3, Landroidx/fragment/app/b2;->a:I

    aput v6, v4, v2

    .line 10
    iget-object v4, p0, Landroidx/fragment/app/b;->x:Ljava/util/ArrayList;

    iget-object v6, v3, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    if-eqz v6, :cond_0

    iget-object v6, v6, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v4, p0, Landroidx/fragment/app/b;->w:[I

    add-int/lit8 v6, v2, 0x2

    iget-boolean v7, v3, Landroidx/fragment/app/b2;->c:Z

    aput v7, v4, v5

    add-int/lit8 v5, v2, 0x3

    .line 12
    iget v7, v3, Landroidx/fragment/app/b2;->d:I

    aput v7, v4, v6

    add-int/lit8 v6, v2, 0x4

    .line 13
    iget v7, v3, Landroidx/fragment/app/b2;->e:I

    aput v7, v4, v5

    add-int/lit8 v5, v2, 0x5

    .line 14
    iget v7, v3, Landroidx/fragment/app/b2;->f:I

    aput v7, v4, v6

    add-int/lit8 v2, v2, 0x6

    .line 15
    iget v6, v3, Landroidx/fragment/app/b2;->g:I

    aput v6, v4, v5

    .line 16
    iget-object v4, p0, Landroidx/fragment/app/b;->y:[I

    iget-object v5, v3, Landroidx/fragment/app/b2;->h:Landroidx/lifecycle/w;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v5, v4, v1

    .line 17
    iget-object v4, p0, Landroidx/fragment/app/b;->z:[I

    iget-object v3, v3, Landroidx/fragment/app/b2;->i:Landroidx/lifecycle/w;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v3, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    :cond_1
    iget v0, p1, Landroidx/fragment/app/c2;->h:I

    iput v0, p0, Landroidx/fragment/app/b;->E:I

    .line 19
    iget-object v0, p1, Landroidx/fragment/app/c2;->k:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/b;->F:Ljava/lang/String;

    .line 20
    iget v0, p1, Landroidx/fragment/app/a;->v:I

    iput v0, p0, Landroidx/fragment/app/b;->G:I

    .line 21
    iget v0, p1, Landroidx/fragment/app/c2;->l:I

    iput v0, p0, Landroidx/fragment/app/b;->H:I

    .line 22
    iget-object v0, p1, Landroidx/fragment/app/c2;->m:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/b;->I:Ljava/lang/CharSequence;

    .line 23
    iget v0, p1, Landroidx/fragment/app/c2;->n:I

    iput v0, p0, Landroidx/fragment/app/b;->J:I

    .line 24
    iget-object v0, p1, Landroidx/fragment/app/c2;->o:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/b;->K:Ljava/lang/CharSequence;

    .line 25
    iget-object v0, p1, Landroidx/fragment/app/c2;->p:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/fragment/app/b;->L:Ljava/util/ArrayList;

    .line 26
    iget-object v0, p1, Landroidx/fragment/app/c2;->q:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/fragment/app/b;->M:Ljava/util/ArrayList;

    .line 27
    iget-boolean p1, p1, Landroidx/fragment/app/c2;->r:Z

    iput-boolean p1, p0, Landroidx/fragment/app/b;->N:Z

    return-void

    .line 28
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not on back stack"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Landroidx/fragment/app/a;)V
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    iget-object v3, p0, Landroidx/fragment/app/b;->w:[I

    array-length v4, v3

    const/4 v5, 0x1

    if-ge v1, v4, :cond_2

    new-instance v4, Landroidx/fragment/app/b2;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v6, v1, 0x1

    aget v7, v3, v1

    iput v7, v4, Landroidx/fragment/app/b2;->a:I

    const/4 v7, 0x2

    invoke-static {v7}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v7

    if-eqz v7, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Instantiate "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " op #"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " base fragment #"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v8, v3, v6

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "FragmentManager"

    invoke-static {v8, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {}, Landroidx/lifecycle/w;->values()[Landroidx/lifecycle/w;

    move-result-object v7

    iget-object v8, p0, Landroidx/fragment/app/b;->y:[I

    aget v8, v8, v2

    aget-object v7, v7, v8

    iput-object v7, v4, Landroidx/fragment/app/b2;->h:Landroidx/lifecycle/w;

    invoke-static {}, Landroidx/lifecycle/w;->values()[Landroidx/lifecycle/w;

    move-result-object v7

    iget-object v8, p0, Landroidx/fragment/app/b;->z:[I

    aget v8, v8, v2

    aget-object v7, v7, v8

    iput-object v7, v4, Landroidx/fragment/app/b2;->i:Landroidx/lifecycle/w;

    add-int/lit8 v7, v1, 0x2

    aget v6, v3, v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    iput-boolean v5, v4, Landroidx/fragment/app/b2;->c:Z

    add-int/lit8 v5, v1, 0x3

    aget v6, v3, v7

    iput v6, v4, Landroidx/fragment/app/b2;->d:I

    add-int/lit8 v7, v1, 0x4

    aget v5, v3, v5

    iput v5, v4, Landroidx/fragment/app/b2;->e:I

    add-int/lit8 v8, v1, 0x5

    aget v7, v3, v7

    iput v7, v4, Landroidx/fragment/app/b2;->f:I

    add-int/lit8 v1, v1, 0x6

    aget v3, v3, v8

    iput v3, v4, Landroidx/fragment/app/b2;->g:I

    iput v6, p1, Landroidx/fragment/app/c2;->d:I

    iput v5, p1, Landroidx/fragment/app/c2;->e:I

    iput v7, p1, Landroidx/fragment/app/c2;->f:I

    iput v3, p1, Landroidx/fragment/app/c2;->g:I

    invoke-virtual {p1, v4}, Landroidx/fragment/app/c2;->b(Landroidx/fragment/app/b2;)V

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_2
    iget v0, p0, Landroidx/fragment/app/b;->E:I

    iput v0, p1, Landroidx/fragment/app/c2;->h:I

    iget-object v0, p0, Landroidx/fragment/app/b;->F:Ljava/lang/String;

    iput-object v0, p1, Landroidx/fragment/app/c2;->k:Ljava/lang/String;

    iput-boolean v5, p1, Landroidx/fragment/app/c2;->i:Z

    iget v0, p0, Landroidx/fragment/app/b;->H:I

    iput v0, p1, Landroidx/fragment/app/c2;->l:I

    iget-object v0, p0, Landroidx/fragment/app/b;->I:Ljava/lang/CharSequence;

    iput-object v0, p1, Landroidx/fragment/app/c2;->m:Ljava/lang/CharSequence;

    iget v0, p0, Landroidx/fragment/app/b;->J:I

    iput v0, p1, Landroidx/fragment/app/c2;->n:I

    iget-object v0, p0, Landroidx/fragment/app/b;->K:Ljava/lang/CharSequence;

    iput-object v0, p1, Landroidx/fragment/app/c2;->o:Ljava/lang/CharSequence;

    iget-object v0, p0, Landroidx/fragment/app/b;->L:Ljava/util/ArrayList;

    iput-object v0, p1, Landroidx/fragment/app/c2;->p:Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/fragment/app/b;->M:Ljava/util/ArrayList;

    iput-object v0, p1, Landroidx/fragment/app/c2;->q:Ljava/util/ArrayList;

    iget-boolean v0, p0, Landroidx/fragment/app/b;->N:Z

    iput-boolean v0, p1, Landroidx/fragment/app/c2;->r:Z

    return-void
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f(Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;
    .locals 5

    new-instance v0, Landroidx/fragment/app/a;

    invoke-direct {v0, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/b;->b(Landroidx/fragment/app/a;)V

    iget v1, p0, Landroidx/fragment/app/b;->G:I

    iput v1, v0, Landroidx/fragment/app/a;->v:I

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/b;->x:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v3, v0, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/b2;

    iget-object v4, p1, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v4, v2}, Landroidx/fragment/app/a2;->b(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v2

    iput-object v2, v3, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/a;->h(I)V

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Landroidx/fragment/app/b;->w:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Landroidx/fragment/app/b;->x:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Landroidx/fragment/app/b;->y:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget-object p2, p0, Landroidx/fragment/app/b;->z:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    iget p2, p0, Landroidx/fragment/app/b;->E:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/b;->F:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Landroidx/fragment/app/b;->G:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Landroidx/fragment/app/b;->H:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/b;->I:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget p2, p0, Landroidx/fragment/app/b;->J:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Landroidx/fragment/app/b;->K:Ljava/lang/CharSequence;

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget-object p2, p0, Landroidx/fragment/app/b;->L:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object p2, p0, Landroidx/fragment/app/b;->M:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-boolean p2, p0, Landroidx/fragment/app/b;->N:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
