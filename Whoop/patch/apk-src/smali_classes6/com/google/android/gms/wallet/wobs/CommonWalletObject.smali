.class public Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
.super Lvo/a;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepName;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:I

.field public final J:Ljava/util/ArrayList;

.field public final K:Lgq/f;

.field public final L:Ljava/util/ArrayList;

.field public final M:Ljava/lang/String;

.field public final N:Ljava/lang/String;

.field public final O:Ljava/util/ArrayList;

.field public final P:Z

.field public final Q:Ljava/util/ArrayList;

.field public final R:Ljava/util/ArrayList;

.field public final S:Ljava/util/ArrayList;

.field public w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgp/r0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lgp/r0;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->J:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->L:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iput-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->O:Ljava/util/ArrayList;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->Q:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    iput-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->R:Ljava/util/ArrayList;

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    iput-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->S:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lgq/f;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->w:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->x:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->y:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->z:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->E:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->F:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->G:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->H:Ljava/lang/String;

    iput p9, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->I:I

    iput-object p10, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->J:Ljava/util/ArrayList;

    iput-object p11, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->K:Lgq/f;

    iput-object p12, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->L:Ljava/util/ArrayList;

    iput-object p13, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->M:Ljava/lang/String;

    iput-object p14, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->N:Ljava/lang/String;

    iput-object p15, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->O:Ljava/util/ArrayList;

    move/from16 p1, p16

    iput-boolean p1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->P:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->Q:Ljava/util/ArrayList;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->R:Ljava/util/ArrayList;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->S:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const/16 v0, 0x4f45

    invoke-static {p1, v0}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->w:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->x:Ljava/lang/String;

    invoke-static {p1, v1, v2}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->y:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->z:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->E:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->F:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->G:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->H:Ljava/lang/String;

    invoke-static {p1, v1, v3}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 v1, 0xa

    invoke-static {p1, v1, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->I:I

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v1, 0xb

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->J:Ljava/util/ArrayList;

    invoke-static {p1, v1, v3}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 v1, 0xc

    iget-object v3, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->K:Lgq/f;

    invoke-static {p1, v1, v3, p2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    const/16 p2, 0xd

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->L:Ljava/util/ArrayList;

    invoke-static {p1, p2, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 p2, 0xe

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->M:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 p2, 0xf

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->N:Ljava/lang/String;

    invoke-static {p1, p2, v1}, Lvo/c;->m(Landroid/os/Parcel;ILjava/lang/String;)V

    const/16 p2, 0x10

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->O:Ljava/util/ArrayList;

    invoke-static {p1, p2, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 p2, 0x11

    invoke-static {p1, p2, v2}, Lvo/c;->r(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->P:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/16 p2, 0x12

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->Q:Ljava/util/ArrayList;

    invoke-static {p1, p2, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 p2, 0x13

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->R:Ljava/util/ArrayList;

    invoke-static {p1, p2, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    const/16 p2, 0x14

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->S:Ljava/util/ArrayList;

    invoke-static {p1, p2, v1}, Lvo/c;->q(Landroid/os/Parcel;ILjava/util/List;)V

    invoke-static {p1, v0}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
