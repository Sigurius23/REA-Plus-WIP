.class public final Ldq/g;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ldq/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/lang/String;

.field public final J:Ljava/lang/String;

.field public final K:I

.field public final L:Ljava/util/ArrayList;

.field public final M:Lgq/f;

.field public final N:Ljava/util/ArrayList;

.field public final O:Ljava/lang/String;

.field public final P:Ljava/lang/String;

.field public final Q:Ljava/util/ArrayList;

.field public final R:Z

.field public final S:Ljava/util/ArrayList;

.field public final T:Ljava/util/ArrayList;

.field public final U:Ljava/util/ArrayList;

.field public final V:Lgq/c;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldq/x;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ldq/x;-><init>(I)V

    sput-object v0, Ldq/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lgq/f;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lgq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/g;->w:Ljava/lang/String;

    iput-object p2, p0, Ldq/g;->x:Ljava/lang/String;

    iput-object p3, p0, Ldq/g;->y:Ljava/lang/String;

    iput-object p4, p0, Ldq/g;->z:Ljava/lang/String;

    iput-object p5, p0, Ldq/g;->E:Ljava/lang/String;

    iput-object p6, p0, Ldq/g;->F:Ljava/lang/String;

    iput-object p7, p0, Ldq/g;->G:Ljava/lang/String;

    iput-object p8, p0, Ldq/g;->H:Ljava/lang/String;

    iput-object p9, p0, Ldq/g;->I:Ljava/lang/String;

    iput-object p10, p0, Ldq/g;->J:Ljava/lang/String;

    iput p11, p0, Ldq/g;->K:I

    iput-object p12, p0, Ldq/g;->L:Ljava/util/ArrayList;

    iput-object p13, p0, Ldq/g;->M:Lgq/f;

    iput-object p14, p0, Ldq/g;->N:Ljava/util/ArrayList;

    iput-object p15, p0, Ldq/g;->O:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Ldq/g;->P:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Ldq/g;->Q:Ljava/util/ArrayList;

    move/from16 p1, p18

    iput-boolean p1, p0, Ldq/g;->R:Z

    move-object/from16 p1, p19

    iput-object p1, p0, Ldq/g;->S:Ljava/util/ArrayList;

    move-object/from16 p1, p20

    iput-object p1, p0, Ldq/g;->T:Ljava/util/ArrayList;

    move-object/from16 p1, p21

    iput-object p1, p0, Ldq/g;->U:Ljava/util/ArrayList;

    move-object/from16 p1, p22

    iput-object p1, p0, Ldq/g;->V:Lgq/c;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Ldq/g;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Ldq/g;->x:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v1, p0, Ldq/g;->y:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v3, p0, Ldq/g;->z:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v3, p0, Ldq/g;->E:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v3, p0, Ldq/g;->F:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v3, p0, Ldq/g;->G:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v3, p0, Ldq/g;->H:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0xa

    iget-object v3, p0, Ldq/g;->I:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0xb

    iget-object v3, p0, Ldq/g;->J:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0xc

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Ldq/g;->K:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v1, 0xd

    iget-object v3, p0, Ldq/g;->L:Ljava/util/ArrayList;

    invoke-static {p1, v1, v3}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0xe

    iget-object v3, p0, Ldq/g;->M:Lgq/f;

    invoke-static {p1, v1, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 v1, 0xf

    iget-object v3, p0, Ldq/g;->N:Ljava/util/ArrayList;

    invoke-static {p1, v1, v3}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0x10

    iget-object v3, p0, Ldq/g;->O:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x11

    iget-object v3, p0, Ldq/g;->P:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x12

    iget-object v3, p0, Ldq/g;->Q:Ljava/util/ArrayList;

    invoke-static {p1, v1, v3}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0x13

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean v1, p0, Ldq/g;->R:Z

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v1, 0x14

    iget-object v2, p0, Ldq/g;->S:Ljava/util/ArrayList;

    invoke-static {p1, v1, v2}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0x15

    iget-object v2, p0, Ldq/g;->T:Ljava/util/ArrayList;

    invoke-static {p1, v1, v2}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0x16

    iget-object v2, p0, Ldq/g;->U:Ljava/util/ArrayList;

    invoke-static {p1, v1, v2}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0x17

    iget-object v2, p0, Ldq/g;->V:Lgq/c;

    invoke-static {p1, v1, v2, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
