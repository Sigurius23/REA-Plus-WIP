.class public final Lr9/e;
.super Li9/o;
.source "SourceFile"


# static fields
.field public static final Q1:[I

.field public static R1:Z

.field public static S1:Z


# instance fields
.field public A1:I

.field public B1:J

.field public C1:I

.field public D1:J

.field public E1:Lu8/y0;

.field public F1:Lu8/y0;

.field public G1:I

.field public H1:Z

.field public I1:I

.field public J1:Lmo/h;

.field public K1:Lr9/m;

.field public L1:J

.field public M1:J

.field public N1:Z

.field public O1:Z

.field public P1:I

.field public final c1:Landroid/content/Context;

.field public final d1:Z

.field public final e1:Lxl/a;

.field public final f1:I

.field public final g1:Z

.field public final h1:Lr9/n;

.field public final i1:Lna/a;

.field public final j1:J

.field public final k1:Ljava/util/PriorityQueue;

.field public l1:Lcr/p;

.field public m1:Z

.field public n1:Z

.field public o1:Lfw/h;

.field public p1:Z

.field public q1:Ljava/util/List;

.field public r1:Landroid/view/Surface;

.field public s1:Lr9/f;

.field public t1:Lx8/o;

.field public u1:Z

.field public v1:I

.field public w1:I

.field public x1:J

.field public y1:I

.field public z1:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lr9/e;->Q1:[I

    return-void

    :array_0
    .array-data 4
        0x780
        0x640
        0x5a0
        0x500
        0x3c0
        0x356
        0x280
        0x21c
        0x1e0
    .end array-data
.end method

.method public constructor <init>(Lr9/d;)V
    .locals 7

    iget-object v0, p1, Lr9/d;->c:Li9/j;

    const/high16 v1, 0x41f00000    # 30.0f

    const/4 v2, 0x2

    invoke-direct {p0, v2, v0, v1}, Li9/o;-><init>(ILi9/j;F)V

    iget-object v0, p1, Lr9/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lr9/e;->c1:Landroid/content/Context;

    iget v1, p1, Lr9/d;->g:I

    iput v1, p0, Lr9/e;->f1:I

    const/4 v1, 0x0

    iput-object v1, p0, Lr9/e;->o1:Lfw/h;

    new-instance v2, Lxl/a;

    iget-object v3, p1, Lr9/d;->e:Landroid/os/Handler;

    iget-object v4, p1, Lr9/d;->f:Lb9/c0;

    invoke-direct {v2, v3, v4}, Lxl/a;-><init>(Landroid/os/Handler;Lb9/c0;)V

    iput-object v2, p0, Lr9/e;->e1:Lxl/a;

    iget-object v2, p0, Lr9/e;->o1:Lfw/h;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    iput-boolean v2, p0, Lr9/e;->d1:Z

    new-instance v2, Lr9/n;

    iget-wide v5, p1, Lr9/d;->d:J

    invoke-direct {v2, v0, p0, v5, v6}, Lr9/n;-><init>(Landroid/content/Context;Lr9/e;J)V

    iput-object v2, p0, Lr9/e;->h1:Lr9/n;

    new-instance p1, Lna/a;

    invoke-direct {p1}, Lna/a;-><init>()V

    iput-object p1, p0, Lr9/e;->i1:Lna/a;

    const-string p1, "NVIDIA"

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lr9/e;->g1:Z

    sget-object p1, Lx8/o;->c:Lx8/o;

    iput-object p1, p0, Lr9/e;->t1:Lx8/o;

    iput v3, p0, Lr9/e;->v1:I

    iput v4, p0, Lr9/e;->w1:I

    sget-object p1, Lu8/y0;->d:Lu8/y0;

    iput-object p1, p0, Lr9/e;->E1:Lu8/y0;

    iput v4, p0, Lr9/e;->I1:I

    iput-object v1, p0, Lr9/e;->F1:Lu8/y0;

    const/16 p1, -0x3e8

    iput p1, p0, Lr9/e;->G1:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lr9/e;->L1:J

    iput-wide v0, p0, Lr9/e;->M1:J

    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, Lr9/e;->k1:Ljava/util/PriorityQueue;

    iput-wide v0, p0, Lr9/e;->j1:J

    return-void
.end method

.method public static w0(Ljava/lang/String;)Z
    .locals 17

    const-string v0, "OMX.google"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-class v2, Lr9/e;

    monitor-enter v2

    :try_start_0
    sget-boolean v0, Lr9/e;->R1:Z

    if-nez v0, :cond_a2

    sget v0, Lx8/t;->a:I

    const/16 v3, 0x1c

    const/4 v4, 0x7

    const/4 v5, 0x6

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, -0x1

    const/4 v11, 0x1

    if-gt v0, v3, :cond_a

    sget-object v12, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_0

    :goto_0
    move v12, v10

    goto/16 :goto_1

    :sswitch_0
    const-string v13, "machuca"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    goto :goto_0

    :cond_1
    move v12, v4

    goto :goto_1

    :sswitch_1
    const-string v13, "once"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    goto :goto_0

    :cond_2
    move v12, v5

    goto :goto_1

    :sswitch_2
    const-string v13, "magnolia"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_0

    :cond_3
    move v12, v6

    goto :goto_1

    :sswitch_3
    const-string v13, "aquaman"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_0

    :cond_4
    move v12, v7

    goto :goto_1

    :sswitch_4
    const-string v13, "oneday"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    goto :goto_0

    :cond_5
    move v12, v8

    goto :goto_1

    :sswitch_5
    const-string v13, "dangalUHD"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    goto :goto_0

    :cond_6
    move v12, v9

    goto :goto_1

    :sswitch_6
    const-string v13, "dangalFHD"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    goto :goto_0

    :cond_7
    move v12, v11

    goto :goto_1

    :sswitch_7
    const-string v13, "dangal"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    goto :goto_0

    :cond_8
    move v12, v1

    :goto_1
    packed-switch v12, :pswitch_data_0

    goto :goto_3

    :cond_9
    :goto_2
    :pswitch_0
    move v1, v11

    goto/16 :goto_8

    :cond_a
    :goto_3
    const/16 v12, 0x1b

    if-gt v0, v12, :cond_b

    :try_start_1
    const-string v13, "HWEML"

    sget-object v14, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    goto :goto_2

    :cond_b
    sget-object v13, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/16 v15, 0x8

    sparse-switch v14, :sswitch_data_1

    :goto_4
    move v14, v10

    goto/16 :goto_5

    :sswitch_8
    const-string v14, "AFTEUFF014"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_c

    goto :goto_4

    :cond_c
    move v14, v15

    goto/16 :goto_5

    :sswitch_9
    const-string v14, "AFTSO001"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_d

    goto :goto_4

    :cond_d
    move v14, v4

    goto :goto_5

    :sswitch_a
    const-string v14, "AFTEU014"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_e

    goto :goto_4

    :cond_e
    move v14, v5

    goto :goto_5

    :sswitch_b
    const-string v14, "AFTEU011"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_f

    goto :goto_4

    :cond_f
    move v14, v6

    goto :goto_5

    :sswitch_c
    const-string v14, "AFTR"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_10

    goto :goto_4

    :cond_10
    move v14, v7

    goto :goto_5

    :sswitch_d
    const-string v14, "AFTN"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    goto :goto_4

    :cond_11
    move v14, v8

    goto :goto_5

    :sswitch_e
    const-string v14, "AFTA"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_4

    :cond_12
    move v14, v9

    goto :goto_5

    :sswitch_f
    const-string v14, "AFTKMST12"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_13

    goto :goto_4

    :cond_13
    move v14, v11

    goto :goto_5

    :sswitch_10
    const-string v14, "AFTJMST12"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_14

    goto :goto_4

    :cond_14
    move v14, v1

    :goto_5
    packed-switch v14, :pswitch_data_1

    const/16 v14, 0x1a

    if-gt v0, v14, :cond_a1

    :try_start_2
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v16

    sparse-switch v16, :sswitch_data_2

    :goto_6
    move v3, v10

    goto/16 :goto_7

    :sswitch_11
    const-string v3, "HWWAS-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_6

    :cond_15
    const/16 v3, 0x8b

    goto/16 :goto_7

    :sswitch_12
    const-string v3, "HWVNS-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_6

    :cond_16
    const/16 v3, 0x8a

    goto/16 :goto_7

    :sswitch_13
    const-string v3, "ELUGA_Prim"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_6

    :cond_17
    const/16 v3, 0x89

    goto/16 :goto_7

    :sswitch_14
    const-string v3, "ELUGA_Note"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_6

    :cond_18
    const/16 v3, 0x88

    goto/16 :goto_7

    :sswitch_15
    const-string v3, "ASUS_X00AD_2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_6

    :cond_19
    const/16 v3, 0x87

    goto/16 :goto_7

    :sswitch_16
    const-string v3, "HWCAM-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_6

    :cond_1a
    const/16 v3, 0x86

    goto/16 :goto_7

    :sswitch_17
    const-string v3, "HWBLN-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_6

    :cond_1b
    const/16 v3, 0x85

    goto/16 :goto_7

    :sswitch_18
    const-string v3, "DM-01K"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_6

    :cond_1c
    const/16 v3, 0x84

    goto/16 :goto_7

    :sswitch_19
    const-string v3, "BRAVIA_ATV3_4K"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_6

    :cond_1d
    const/16 v3, 0x83

    goto/16 :goto_7

    :sswitch_1a
    const-string v3, "Infinix-X572"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_6

    :cond_1e
    const/16 v3, 0x82

    goto/16 :goto_7

    :sswitch_1b
    const-string v3, "PB2-670M"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto/16 :goto_6

    :cond_1f
    const/16 v3, 0x81

    goto/16 :goto_7

    :sswitch_1c
    const-string v3, "santoni"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto/16 :goto_6

    :cond_20
    const/16 v3, 0x80

    goto/16 :goto_7

    :sswitch_1d
    const-string v3, "iball8735_9806"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_6

    :cond_21
    const/16 v3, 0x7f

    goto/16 :goto_7

    :sswitch_1e
    const-string v3, "CPH1715"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_6

    :cond_22
    const/16 v3, 0x7e

    goto/16 :goto_7

    :sswitch_1f
    const-string v3, "CPH1609"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto/16 :goto_6

    :cond_23
    const/16 v3, 0x7d

    goto/16 :goto_7

    :sswitch_20
    const-string v3, "woods_f"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_6

    :cond_24
    const/16 v3, 0x7c

    goto/16 :goto_7

    :sswitch_21
    const-string v3, "htc_e56ml_dtul"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_25

    goto/16 :goto_6

    :cond_25
    const/16 v3, 0x7b

    goto/16 :goto_7

    :sswitch_22
    const-string v3, "EverStar_S"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    goto/16 :goto_6

    :cond_26
    const/16 v3, 0x7a

    goto/16 :goto_7

    :sswitch_23
    const-string v3, "hwALE-H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    goto/16 :goto_6

    :cond_27
    const/16 v3, 0x79

    goto/16 :goto_7

    :sswitch_24
    const-string v3, "itel_S41"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto/16 :goto_6

    :cond_28
    const/16 v3, 0x78

    goto/16 :goto_7

    :sswitch_25
    const-string v3, "LS-5017"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_6

    :cond_29
    const/16 v3, 0x77

    goto/16 :goto_7

    :sswitch_26
    const-string v3, "panell_d"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto/16 :goto_6

    :cond_2a
    const/16 v3, 0x76

    goto/16 :goto_7

    :sswitch_27
    const-string v3, "j2xlteins"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    goto/16 :goto_6

    :cond_2b
    const/16 v3, 0x75

    goto/16 :goto_7

    :sswitch_28
    const-string v3, "A7000plus"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2c

    goto/16 :goto_6

    :cond_2c
    const/16 v3, 0x74

    goto/16 :goto_7

    :sswitch_29
    const-string v3, "manning"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    goto/16 :goto_6

    :cond_2d
    const/16 v3, 0x73

    goto/16 :goto_7

    :sswitch_2a
    const-string v3, "GIONEE_WBL7519"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    goto/16 :goto_6

    :cond_2e
    const/16 v3, 0x72

    goto/16 :goto_7

    :sswitch_2b
    const-string v3, "GIONEE_WBL7365"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    goto/16 :goto_6

    :cond_2f
    const/16 v3, 0x71

    goto/16 :goto_7

    :sswitch_2c
    const-string v3, "GIONEE_WBL5708"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    goto/16 :goto_6

    :cond_30
    const/16 v3, 0x70

    goto/16 :goto_7

    :sswitch_2d
    const-string v3, "QM16XE_U"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31

    goto/16 :goto_6

    :cond_31
    const/16 v3, 0x6f

    goto/16 :goto_7

    :sswitch_2e
    const-string v3, "Pixi5-10_4G"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_32

    goto/16 :goto_6

    :cond_32
    const/16 v3, 0x6e

    goto/16 :goto_7

    :sswitch_2f
    const-string v3, "TB3-850M"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    goto/16 :goto_6

    :cond_33
    const/16 v3, 0x6d

    goto/16 :goto_7

    :sswitch_30
    const-string v3, "TB3-850F"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_34

    goto/16 :goto_6

    :cond_34
    const/16 v3, 0x6c

    goto/16 :goto_7

    :sswitch_31
    const-string v3, "TB3-730X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_35

    goto/16 :goto_6

    :cond_35
    const/16 v3, 0x6b

    goto/16 :goto_7

    :sswitch_32
    const-string v3, "TB3-730F"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_36

    goto/16 :goto_6

    :cond_36
    const/16 v3, 0x6a

    goto/16 :goto_7

    :sswitch_33
    const-string v3, "A7020a48"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_37

    goto/16 :goto_6

    :cond_37
    const/16 v3, 0x69

    goto/16 :goto_7

    :sswitch_34
    const-string v3, "A7010a48"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_38

    goto/16 :goto_6

    :cond_38
    const/16 v3, 0x68

    goto/16 :goto_7

    :sswitch_35
    const-string v3, "griffin"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_39

    goto/16 :goto_6

    :cond_39
    const/16 v3, 0x67

    goto/16 :goto_7

    :sswitch_36
    const-string v3, "marino_f"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto/16 :goto_6

    :cond_3a
    const/16 v3, 0x66

    goto/16 :goto_7

    :sswitch_37
    const-string v3, "CPY83_I00"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    goto/16 :goto_6

    :cond_3b
    const/16 v3, 0x65

    goto/16 :goto_7

    :sswitch_38
    const-string v3, "A2016a40"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    goto/16 :goto_6

    :cond_3c
    const/16 v3, 0x64

    goto/16 :goto_7

    :sswitch_39
    const-string v3, "le_x6"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3d

    goto/16 :goto_6

    :cond_3d
    const/16 v3, 0x63

    goto/16 :goto_7

    :sswitch_3a
    const-string v3, "l5460"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3e

    goto/16 :goto_6

    :cond_3e
    const/16 v3, 0x62

    goto/16 :goto_7

    :sswitch_3b
    const-string v3, "i9031"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3f

    goto/16 :goto_6

    :cond_3f
    const/16 v3, 0x61

    goto/16 :goto_7

    :sswitch_3c
    const-string v3, "X3_HK"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_40

    goto/16 :goto_6

    :cond_40
    const/16 v3, 0x60

    goto/16 :goto_7

    :sswitch_3d
    const-string v3, "V23GB"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    goto/16 :goto_6

    :cond_41
    const/16 v3, 0x5f

    goto/16 :goto_7

    :sswitch_3e
    const-string v3, "Q4310"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    goto/16 :goto_6

    :cond_42
    const/16 v3, 0x5e

    goto/16 :goto_7

    :sswitch_3f
    const-string v3, "Q4260"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    goto/16 :goto_6

    :cond_43
    const/16 v3, 0x5d

    goto/16 :goto_7

    :sswitch_40
    const-string v3, "PRO7S"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_44

    goto/16 :goto_6

    :cond_44
    const/16 v3, 0x5c

    goto/16 :goto_7

    :sswitch_41
    const-string v3, "F3311"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45

    goto/16 :goto_6

    :cond_45
    const/16 v3, 0x5b

    goto/16 :goto_7

    :sswitch_42
    const-string v3, "F3215"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46

    goto/16 :goto_6

    :cond_46
    const/16 v3, 0x5a

    goto/16 :goto_7

    :sswitch_43
    const-string v3, "F3213"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_47

    goto/16 :goto_6

    :cond_47
    const/16 v3, 0x59

    goto/16 :goto_7

    :sswitch_44
    const-string v3, "F3211"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_48

    goto/16 :goto_6

    :cond_48
    const/16 v3, 0x58

    goto/16 :goto_7

    :sswitch_45
    const-string v3, "F3116"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_49

    goto/16 :goto_6

    :cond_49
    const/16 v3, 0x57

    goto/16 :goto_7

    :sswitch_46
    const-string v3, "F3113"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4a

    goto/16 :goto_6

    :cond_4a
    const/16 v3, 0x56

    goto/16 :goto_7

    :sswitch_47
    const-string v3, "F3111"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4b

    goto/16 :goto_6

    :cond_4b
    const/16 v3, 0x55

    goto/16 :goto_7

    :sswitch_48
    const-string v3, "E5643"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4c

    goto/16 :goto_6

    :cond_4c
    const/16 v3, 0x54

    goto/16 :goto_7

    :sswitch_49
    const-string v3, "A1601"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4d

    goto/16 :goto_6

    :cond_4d
    const/16 v3, 0x53

    goto/16 :goto_7

    :sswitch_4a
    const-string v3, "Aura_Note_2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4e

    goto/16 :goto_6

    :cond_4e
    const/16 v3, 0x52

    goto/16 :goto_7

    :sswitch_4b
    const-string v3, "602LV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4f

    goto/16 :goto_6

    :cond_4f
    const/16 v3, 0x51

    goto/16 :goto_7

    :sswitch_4c
    const-string v3, "601LV"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_50

    goto/16 :goto_6

    :cond_50
    const/16 v3, 0x50

    goto/16 :goto_7

    :sswitch_4d
    const-string v3, "MEIZU_M5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_51

    goto/16 :goto_6

    :cond_51
    const/16 v3, 0x4f

    goto/16 :goto_7

    :sswitch_4e
    const-string v3, "p212"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_52

    goto/16 :goto_6

    :cond_52
    const/16 v3, 0x4e

    goto/16 :goto_7

    :sswitch_4f
    const-string v3, "mido"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_53

    goto/16 :goto_6

    :cond_53
    const/16 v3, 0x4d

    goto/16 :goto_7

    :sswitch_50
    const-string v3, "kate"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_54

    goto/16 :goto_6

    :cond_54
    const/16 v3, 0x4c

    goto/16 :goto_7

    :sswitch_51
    const-string v3, "fugu"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_55

    goto/16 :goto_6

    :cond_55
    const/16 v3, 0x4b

    goto/16 :goto_7

    :sswitch_52
    const-string v3, "XE2X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_56

    goto/16 :goto_6

    :cond_56
    const/16 v3, 0x4a

    goto/16 :goto_7

    :sswitch_53
    const-string v3, "Q427"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_57

    goto/16 :goto_6

    :cond_57
    const/16 v3, 0x49

    goto/16 :goto_7

    :sswitch_54
    const-string v3, "Q350"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_58

    goto/16 :goto_6

    :cond_58
    const/16 v3, 0x48

    goto/16 :goto_7

    :sswitch_55
    const-string v3, "P681"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_59

    goto/16 :goto_6

    :cond_59
    const/16 v3, 0x47

    goto/16 :goto_7

    :sswitch_56
    const-string v3, "F04J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5a

    goto/16 :goto_6

    :cond_5a
    const/16 v3, 0x46

    goto/16 :goto_7

    :sswitch_57
    const-string v3, "F04H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5b

    goto/16 :goto_6

    :cond_5b
    const/16 v3, 0x45

    goto/16 :goto_7

    :sswitch_58
    const-string v3, "F03H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5c

    goto/16 :goto_6

    :cond_5c
    const/16 v3, 0x44

    goto/16 :goto_7

    :sswitch_59
    const-string v3, "F02H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5d

    goto/16 :goto_6

    :cond_5d
    const/16 v3, 0x43

    goto/16 :goto_7

    :sswitch_5a
    const-string v3, "F01J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5e

    goto/16 :goto_6

    :cond_5e
    const/16 v3, 0x42

    goto/16 :goto_7

    :sswitch_5b
    const-string v3, "F01H"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5f

    goto/16 :goto_6

    :cond_5f
    const/16 v3, 0x41

    goto/16 :goto_7

    :sswitch_5c
    const-string v3, "1714"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_60

    goto/16 :goto_6

    :cond_60
    const/16 v3, 0x40

    goto/16 :goto_7

    :sswitch_5d
    const-string v3, "1713"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_61

    goto/16 :goto_6

    :cond_61
    const/16 v3, 0x3f

    goto/16 :goto_7

    :sswitch_5e
    const-string v3, "1601"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_62

    goto/16 :goto_6

    :cond_62
    const/16 v3, 0x3e

    goto/16 :goto_7

    :sswitch_5f
    const-string v3, "flo"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_63

    goto/16 :goto_6

    :cond_63
    const/16 v3, 0x3d

    goto/16 :goto_7

    :sswitch_60
    const-string v3, "deb"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_64

    goto/16 :goto_6

    :cond_64
    const/16 v3, 0x3c

    goto/16 :goto_7

    :sswitch_61
    const-string v3, "cv3"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_65

    goto/16 :goto_6

    :cond_65
    const/16 v3, 0x3b

    goto/16 :goto_7

    :sswitch_62
    const-string v3, "cv1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_66

    goto/16 :goto_6

    :cond_66
    const/16 v3, 0x3a

    goto/16 :goto_7

    :sswitch_63
    const-string v3, "Z80"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_67

    goto/16 :goto_6

    :cond_67
    const/16 v3, 0x39

    goto/16 :goto_7

    :sswitch_64
    const-string v3, "QX1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_68

    goto/16 :goto_6

    :cond_68
    const/16 v3, 0x38

    goto/16 :goto_7

    :sswitch_65
    const-string v3, "PLE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_69

    goto/16 :goto_6

    :cond_69
    const/16 v3, 0x37

    goto/16 :goto_7

    :sswitch_66
    const-string v3, "P85"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6a

    goto/16 :goto_6

    :cond_6a
    const/16 v3, 0x36

    goto/16 :goto_7

    :sswitch_67
    const-string v3, "MX6"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6b

    goto/16 :goto_6

    :cond_6b
    const/16 v3, 0x35

    goto/16 :goto_7

    :sswitch_68
    const-string v3, "M5c"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6c

    goto/16 :goto_6

    :cond_6c
    const/16 v3, 0x34

    goto/16 :goto_7

    :sswitch_69
    const-string v3, "M04"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6d

    goto/16 :goto_6

    :cond_6d
    const/16 v3, 0x33

    goto/16 :goto_7

    :sswitch_6a
    const-string v3, "JGZ"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6e

    goto/16 :goto_6

    :cond_6e
    const/16 v3, 0x32

    goto/16 :goto_7

    :sswitch_6b
    const-string v3, "mh"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6f

    goto/16 :goto_6

    :cond_6f
    const/16 v3, 0x31

    goto/16 :goto_7

    :sswitch_6c
    const-string v3, "b5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_70

    goto/16 :goto_6

    :cond_70
    const/16 v3, 0x30

    goto/16 :goto_7

    :sswitch_6d
    const-string v3, "V5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_71

    goto/16 :goto_6

    :cond_71
    const/16 v3, 0x2f

    goto/16 :goto_7

    :sswitch_6e
    const-string v3, "V1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_72

    goto/16 :goto_6

    :cond_72
    const/16 v3, 0x2e

    goto/16 :goto_7

    :sswitch_6f
    const-string v3, "Q5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_73

    goto/16 :goto_6

    :cond_73
    const/16 v3, 0x2d

    goto/16 :goto_7

    :sswitch_70
    const-string v3, "C1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_74

    goto/16 :goto_6

    :cond_74
    const/16 v3, 0x2c

    goto/16 :goto_7

    :sswitch_71
    const-string v3, "woods_fn"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_75

    goto/16 :goto_6

    :cond_75
    const/16 v3, 0x2b

    goto/16 :goto_7

    :sswitch_72
    const-string v3, "ELUGA_A3_Pro"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_76

    goto/16 :goto_6

    :cond_76
    const/16 v3, 0x2a

    goto/16 :goto_7

    :sswitch_73
    const-string v3, "Z12_PRO"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_77

    goto/16 :goto_6

    :cond_77
    const/16 v3, 0x29

    goto/16 :goto_7

    :sswitch_74
    const-string v3, "BLACK-1X"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_78

    goto/16 :goto_6

    :cond_78
    const/16 v3, 0x28

    goto/16 :goto_7

    :sswitch_75
    const-string v3, "taido_row"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_79

    goto/16 :goto_6

    :cond_79
    const/16 v3, 0x27

    goto/16 :goto_7

    :sswitch_76
    const-string v3, "Pixi4-7_3G"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7a

    goto/16 :goto_6

    :cond_7a
    const/16 v3, 0x26

    goto/16 :goto_7

    :sswitch_77
    const-string v3, "GIONEE_GBL7360"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7b

    goto/16 :goto_6

    :cond_7b
    const/16 v3, 0x25

    goto/16 :goto_7

    :sswitch_78
    const-string v3, "GiONEE_CBL7513"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7c

    goto/16 :goto_6

    :cond_7c
    const/16 v3, 0x24

    goto/16 :goto_7

    :sswitch_79
    const-string v3, "OnePlus5T"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7d

    goto/16 :goto_6

    :cond_7d
    const/16 v3, 0x23

    goto/16 :goto_7

    :sswitch_7a
    const-string v3, "whyred"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7e

    goto/16 :goto_6

    :cond_7e
    const/16 v3, 0x22

    goto/16 :goto_7

    :sswitch_7b
    const-string v3, "watson"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7f

    goto/16 :goto_6

    :cond_7f
    const/16 v3, 0x21

    goto/16 :goto_7

    :sswitch_7c
    const-string v3, "SVP-DTV15"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_80

    goto/16 :goto_6

    :cond_80
    const/16 v3, 0x20

    goto/16 :goto_7

    :sswitch_7d
    const-string v3, "A7000-a"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_81

    goto/16 :goto_6

    :cond_81
    const/16 v3, 0x1f

    goto/16 :goto_7

    :sswitch_7e
    const-string v3, "nicklaus_f"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_82

    goto/16 :goto_6

    :cond_82
    const/16 v3, 0x1e

    goto/16 :goto_7

    :sswitch_7f
    const-string v3, "tcl_eu"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_83

    goto/16 :goto_6

    :cond_83
    const/16 v3, 0x1d

    goto/16 :goto_7

    :sswitch_80
    const-string v4, "ELUGA_Ray_X"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a0

    goto/16 :goto_6

    :sswitch_81
    const-string v3, "s905x018"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_84

    goto/16 :goto_6

    :cond_84
    move v3, v12

    goto/16 :goto_7

    :sswitch_82
    const-string v3, "A10-70L"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_85

    goto/16 :goto_6

    :cond_85
    move v3, v14

    goto/16 :goto_7

    :sswitch_83
    const-string v3, "A10-70F"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_86

    goto/16 :goto_6

    :cond_86
    const/16 v3, 0x19

    goto/16 :goto_7

    :sswitch_84
    const-string v3, "namath"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_87

    goto/16 :goto_6

    :cond_87
    const/16 v3, 0x18

    goto/16 :goto_7

    :sswitch_85
    const-string v3, "Slate_Pro"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_88

    goto/16 :goto_6

    :cond_88
    const/16 v3, 0x17

    goto/16 :goto_7

    :sswitch_86
    const-string v3, "iris60"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_89

    goto/16 :goto_6

    :cond_89
    const/16 v3, 0x16

    goto/16 :goto_7

    :sswitch_87
    const-string v3, "BRAVIA_ATV2"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8a

    goto/16 :goto_6

    :cond_8a
    const/16 v3, 0x15

    goto/16 :goto_7

    :sswitch_88
    const-string v3, "GiONEE_GBL7319"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8b

    goto/16 :goto_6

    :cond_8b
    const/16 v3, 0x14

    goto/16 :goto_7

    :sswitch_89
    const-string v3, "panell_dt"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8c

    goto/16 :goto_6

    :cond_8c
    const/16 v3, 0x13

    goto/16 :goto_7

    :sswitch_8a
    const-string v3, "panell_ds"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8d

    goto/16 :goto_6

    :cond_8d
    const/16 v3, 0x12

    goto/16 :goto_7

    :sswitch_8b
    const-string v3, "panell_dl"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8e

    goto/16 :goto_6

    :cond_8e
    const/16 v3, 0x11

    goto/16 :goto_7

    :sswitch_8c
    const-string v3, "vernee_M5"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8f

    goto/16 :goto_6

    :cond_8f
    const/16 v3, 0x10

    goto/16 :goto_7

    :sswitch_8d
    const-string v3, "pacificrim"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_90

    goto/16 :goto_6

    :cond_90
    const/16 v3, 0xf

    goto/16 :goto_7

    :sswitch_8e
    const-string v3, "Phantom6"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_91

    goto/16 :goto_6

    :cond_91
    const/16 v3, 0xe

    goto/16 :goto_7

    :sswitch_8f
    const-string v3, "ComioS1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_92

    goto/16 :goto_6

    :cond_92
    const/16 v3, 0xd

    goto/16 :goto_7

    :sswitch_90
    const-string v3, "XT1663"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_93

    goto/16 :goto_6

    :cond_93
    const/16 v3, 0xc

    goto/16 :goto_7

    :sswitch_91
    const-string v3, "RAIJIN"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_94

    goto/16 :goto_6

    :cond_94
    const/16 v3, 0xb

    goto/16 :goto_7

    :sswitch_92
    const-string v3, "AquaPowerM"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_95

    goto/16 :goto_6

    :cond_95
    const/16 v3, 0xa

    goto/16 :goto_7

    :sswitch_93
    const-string v3, "PGN611"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_96

    goto/16 :goto_6

    :cond_96
    const/16 v3, 0x9

    goto/16 :goto_7

    :sswitch_94
    const-string v3, "PGN610"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_97

    goto/16 :goto_6

    :cond_97
    move v3, v15

    goto/16 :goto_7

    :sswitch_95
    const-string v3, "PGN528"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_98

    goto/16 :goto_6

    :cond_98
    move v3, v4

    goto :goto_7

    :sswitch_96
    const-string v3, "NX573J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_99

    goto/16 :goto_6

    :cond_99
    move v3, v5

    goto :goto_7

    :sswitch_97
    const-string v3, "NX541J"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9a

    goto/16 :goto_6

    :cond_9a
    move v3, v6

    goto :goto_7

    :sswitch_98
    const-string v3, "CP8676_I02"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9b

    goto/16 :goto_6

    :cond_9b
    move v3, v7

    goto :goto_7

    :sswitch_99
    const-string v3, "K50a40"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9c

    goto/16 :goto_6

    :cond_9c
    move v3, v8

    goto :goto_7

    :sswitch_9a
    const-string v3, "GIONEE_SWW1631"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9d

    goto/16 :goto_6

    :cond_9d
    move v3, v9

    goto :goto_7

    :sswitch_9b
    const-string v3, "GIONEE_SWW1627"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9e

    goto/16 :goto_6

    :cond_9e
    move v3, v11

    goto :goto_7

    :sswitch_9c
    const-string v3, "GIONEE_SWW1609"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9f

    goto/16 :goto_6

    :cond_9f
    move v3, v1

    :cond_a0
    :goto_7
    packed-switch v3, :pswitch_data_2

    const-string v0, "JSN-L21"

    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_a1
    :goto_8
    :try_start_3
    sput-boolean v1, Lr9/e;->S1:Z

    sput-boolean v11, Lr9/e;->R1:Z

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_a2
    :goto_9
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget-boolean v0, Lr9/e;->S1:Z

    return v0

    :goto_a
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x4fd0ea5f -> :sswitch_7
        -0x48b8f57f -> :sswitch_6
        -0x48b8bd30 -> :sswitch_5
        -0x3c588c8a -> :sswitch_4
        -0x2d5172e2 -> :sswitch_3
        -0x3de1850 -> :sswitch_2
        0x341e81 -> :sswitch_1
        0x31316ffa -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x14d76e6c -> :sswitch_10
        -0x132295cd -> :sswitch_f
        0x1e9d52 -> :sswitch_e
        0x1e9d5f -> :sswitch_d
        0x1e9d63 -> :sswitch_c
        0x6a6b6031 -> :sswitch_b
        0x6a6b6034 -> :sswitch_a
        0x6b2deee6 -> :sswitch_9
        0x7e53ab34 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x7fd6c3bd -> :sswitch_9c
        -0x7fd6c381 -> :sswitch_9b
        -0x7fd6c368 -> :sswitch_9a
        -0x7d026749 -> :sswitch_99
        -0x78929d6a -> :sswitch_98
        -0x75f50a1e -> :sswitch_97
        -0x75f4fe9d -> :sswitch_96
        -0x736f875c -> :sswitch_95
        -0x736f83c2 -> :sswitch_94
        -0x736f83c1 -> :sswitch_93
        -0x7327ce1c -> :sswitch_92
        -0x705c574b -> :sswitch_91
        -0x651ebb62 -> :sswitch_90
        -0x6423293b -> :sswitch_8f
        -0x604f5117 -> :sswitch_8e
        -0x5f691e13 -> :sswitch_8d
        -0x5ca40cc4 -> :sswitch_8c
        -0x58520ec1 -> :sswitch_8b
        -0x58520eba -> :sswitch_8a
        -0x58520eb9 -> :sswitch_89
        -0x4eaed329 -> :sswitch_88
        -0x4892fb4f -> :sswitch_87
        -0x465b3df3 -> :sswitch_86
        -0x43e6c939 -> :sswitch_85
        -0x3ec0fcc5 -> :sswitch_84
        -0x3b33cca0 -> :sswitch_83
        -0x3b33cc9a -> :sswitch_82
        -0x398ae3f6 -> :sswitch_81
        -0x391f0fb4 -> :sswitch_80
        -0x346837ae -> :sswitch_7f
        -0x323788e3 -> :sswitch_7e
        -0x30f57652 -> :sswitch_7d
        -0x2f88a116 -> :sswitch_7c
        -0x2f61ed98 -> :sswitch_7b
        -0x2efd0837 -> :sswitch_7a
        -0x2e9e9441 -> :sswitch_79
        -0x2247b8b1 -> :sswitch_78
        -0x1f0fa2b7 -> :sswitch_77
        -0x19af3b41 -> :sswitch_76
        -0x114fad3e -> :sswitch_75
        -0x10dae90b -> :sswitch_74
        -0x1084b7b7 -> :sswitch_73
        -0xa5988e9 -> :sswitch_72
        -0x35f9fbf -> :sswitch_71
        0x84e -> :sswitch_70
        0xa04 -> :sswitch_6f
        0xa9b -> :sswitch_6e
        0xa9f -> :sswitch_6d
        0xc13 -> :sswitch_6c
        0xd9b -> :sswitch_6b
        0x11ebd -> :sswitch_6a
        0x12711 -> :sswitch_69
        0x127db -> :sswitch_68
        0x12beb -> :sswitch_67
        0x1334d -> :sswitch_66
        0x135c9 -> :sswitch_65
        0x13aea -> :sswitch_64
        0x158d2 -> :sswitch_63
        0x1821e -> :sswitch_62
        0x18220 -> :sswitch_61
        0x18401 -> :sswitch_60
        0x18c69 -> :sswitch_5f
        0x1716e6 -> :sswitch_5e
        0x171ac8 -> :sswitch_5d
        0x171ac9 -> :sswitch_5c
        0x208c61 -> :sswitch_5b
        0x208c63 -> :sswitch_5a
        0x208c80 -> :sswitch_59
        0x208c9f -> :sswitch_58
        0x208cbe -> :sswitch_57
        0x208cc0 -> :sswitch_56
        0x252f5f -> :sswitch_55
        0x25981d -> :sswitch_54
        0x259b88 -> :sswitch_53
        0x290a13 -> :sswitch_52
        0x3021fd -> :sswitch_51
        0x321e47 -> :sswitch_50
        0x332327 -> :sswitch_4f
        0x33ab63 -> :sswitch_4e
        0x27691fb -> :sswitch_4d
        0x30f8881 -> :sswitch_4c
        0x30f8c42 -> :sswitch_4b
        0x349f581 -> :sswitch_4a
        0x3ab0ea7 -> :sswitch_49
        0x3e53ea5 -> :sswitch_48
        0x3f25a44 -> :sswitch_47
        0x3f25a46 -> :sswitch_46
        0x3f25a49 -> :sswitch_45
        0x3f25e05 -> :sswitch_44
        0x3f25e07 -> :sswitch_43
        0x3f25e09 -> :sswitch_42
        0x3f261c6 -> :sswitch_41
        0x48dce49 -> :sswitch_40
        0x48dd589 -> :sswitch_3f
        0x48dd8af -> :sswitch_3e
        0x4d36832 -> :sswitch_3d
        0x4f0b0e7 -> :sswitch_3c
        0x5e2479e -> :sswitch_3b
        0x60acc05 -> :sswitch_3a
        0x6214744 -> :sswitch_39
        0x9d91379 -> :sswitch_38
        0xadc0551 -> :sswitch_37
        0xea056b3 -> :sswitch_36
        0x1121dbc3 -> :sswitch_35
        0x1255818c -> :sswitch_34
        0x1263990d -> :sswitch_33
        0x12d90f3a -> :sswitch_32
        0x12d90f4c -> :sswitch_31
        0x12d98b1b -> :sswitch_30
        0x12d98b22 -> :sswitch_2f
        0x1844c711 -> :sswitch_2e
        0x1e3e8044 -> :sswitch_2d
        0x2f5336ed -> :sswitch_2c
        0x2f54115e -> :sswitch_2b
        0x2f541849 -> :sswitch_2a
        0x31cf010e -> :sswitch_29
        0x36ad82f4 -> :sswitch_28
        0x391a0b61 -> :sswitch_27
        0x3f3728cd -> :sswitch_26
        0x448ec687 -> :sswitch_25
        0x46260f63 -> :sswitch_24
        0x4c505106 -> :sswitch_23
        0x4de67084 -> :sswitch_22
        0x506ac5a9 -> :sswitch_21
        0x5abad9cd -> :sswitch_20
        0x64d2e6e9 -> :sswitch_1f
        0x64d2eac5 -> :sswitch_1e
        0x65e4085b -> :sswitch_1d
        0x6f373556 -> :sswitch_1c
        0x719f1dcb -> :sswitch_1b
        0x75d9a0f0 -> :sswitch_1a
        0x7796d144 -> :sswitch_19
        0x785bcb26 -> :sswitch_18
        0x78fc0e50 -> :sswitch_17
        0x790521fb -> :sswitch_16
        0x7933207f -> :sswitch_15
        0x7a05a409 -> :sswitch_14
        0x7a0696bd -> :sswitch_13
        0x7a16dfe7 -> :sswitch_12
        0x7a1f0e95 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static x0(Li9/m;Lu8/p;)I
    .locals 11

    iget v0, p1, Lu8/p;->u:I

    iget v1, p1, Lu8/p;->v:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_d

    if-ne v1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v3, p1, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "video/dolby-vision"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "video/avc"

    const-string v6, "video/av01"

    const/4 v7, 0x1

    const-string v8, "video/hevc"

    const/4 v9, 0x2

    if-eqz v4, :cond_4

    invoke-static {p1}, Li9/s;->d(Lu8/p;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v3, 0x200

    if-eq p1, v3, :cond_2

    if-eq p1, v7, :cond_2

    if-ne p1, v9, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0x400

    if-ne p1, v3, :cond_3

    move-object v3, v6

    goto :goto_1

    :cond_2
    :goto_0
    move-object v3, v5

    goto :goto_1

    :cond_3
    move-object v3, v8

    :cond_4
    :goto_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result p1

    const/4 v4, 0x4

    const/4 v10, 0x3

    sparse-switch p1, :sswitch_data_0

    :goto_2
    move v7, v2

    goto :goto_3

    :sswitch_0
    const-string p1, "video/x-vnd.on2.vp9"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v7, 0x6

    goto :goto_3

    :sswitch_1
    const-string p1, "video/x-vnd.on2.vp8"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v7, 0x5

    goto :goto_3

    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    move v7, v4

    goto :goto_3

    :sswitch_3
    const-string p1, "video/mp4v-es"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_2

    :cond_8
    move v7, v10

    goto :goto_3

    :sswitch_4
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_9
    move v7, v9

    goto :goto_3

    :sswitch_5
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_2

    :sswitch_6
    const-string p1, "video/3gpp"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_2

    :cond_a
    const/4 v7, 0x0

    :cond_b
    :goto_3
    packed-switch v7, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    mul-int/2addr v0, v1

    mul-int/2addr v0, v10

    div-int/lit8 v0, v0, 0x8

    return v0

    :pswitch_1
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v3, "BRAVIA 4K 2015"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "Amazon"

    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "KFSOWI"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "AFTS"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-boolean p0, p0, Li9/m;->f:Z

    if-eqz p0, :cond_c

    goto :goto_4

    :cond_c
    const/16 p0, 0x10

    invoke-static {v0, p0}, Lx8/t;->e(II)I

    move-result p1

    invoke-static {v1, p0}, Lx8/t;->e(II)I

    move-result p0

    mul-int/2addr p0, p1

    mul-int/lit16 p0, p0, 0x300

    div-int/2addr p0, v4

    return p0

    :pswitch_2
    mul-int/2addr v0, v1

    mul-int/2addr v0, v10

    div-int/2addr v0, v4

    const/high16 p0, 0x200000

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    :pswitch_3
    mul-int/2addr v0, v1

    mul-int/2addr v0, v10

    div-int/2addr v0, v4

    return v0

    :cond_d
    :goto_4
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_6
        -0x631b55f6 -> :sswitch_5
        -0x63185e82 -> :sswitch_4
        0x46cdc642 -> :sswitch_3
        0x4f62373a -> :sswitch_2
        0x5f50bed8 -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static y0(Landroid/content/Context;Li9/h;Lu8/p;ZZ)Ljava/util/List;
    .locals 3

    iget-object v0, p2, Lu8/p;->n:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object p0, Lzr/w0;->E:Lzr/w0;

    return-object p0

    :cond_0
    sget v1, Lx8/t;->a:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_2

    const-string v1, "video/dolby-vision"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lug/m;->x(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p2}, Li9/s;->b(Lu8/p;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    sget-object p0, Lzr/w0;->E:Lzr/w0;

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p0, p3, p4}, Li9/h;->b(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    return-object p0

    :cond_2
    invoke-static {p1, p2, p3, p4}, Li9/s;->g(Li9/h;Lu8/p;ZZ)Lzr/w0;

    move-result-object p0

    return-object p0
.end method

.method public static z0(Li9/m;Lu8/p;)I
    .locals 4

    iget v0, p1, Lu8/p;->o:I

    iget-object v1, p1, Lu8/p;->q:Ljava/util/List;

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v0, p0, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget p0, p1, Lu8/p;->o:I

    add-int/2addr p0, v2

    return p0

    :cond_1
    invoke-static {p0, p1}, Lr9/e;->x0(Li9/m;Lu8/p;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final A0(Li9/m;)Landroid/view/Surface;
    .locals 5

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_b

    iget-object v0, p0, Lr9/e;->r1:Landroid/view/Surface;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget v0, Lx8/t;->a:I

    const/16 v3, 0x23

    if-lt v0, v3, :cond_1

    iget-boolean v0, p1, Li9/m;->h:Z

    if-eqz v0, :cond_1

    return-object v2

    :cond_1
    invoke-virtual {p0, p1}, Lr9/e;->H0(Li9/m;)Z

    move-result v0

    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-object v0, p0, Lr9/e;->s1:Lr9/f;

    if-eqz v0, :cond_2

    iget-boolean v3, v0, Lr9/f;->w:Z

    iget-boolean v4, p1, Li9/m;->f:Z

    if-eq v3, v4, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lr9/f;->release()V

    iput-object v2, p0, Lr9/e;->s1:Lr9/f;

    :cond_2
    iget-object v0, p0, Lr9/e;->s1:Lr9/f;

    if-nez v0, :cond_a

    iget-object v0, p0, Lr9/e;->c1:Landroid/content/Context;

    iget-boolean p1, p1, Li9/m;->f:Z

    const/4 v2, 0x1

    if-eqz p1, :cond_4

    invoke-static {v0}, Lr9/f;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1

    :cond_4
    sget v0, Lr9/f;->z:I

    :goto_0
    move v0, v2

    :goto_1
    invoke-static {v0}, Lva3/g;->i(Z)V

    new-instance v0, Lmo/c;

    const-string v3, "ExoPlayer:PlaceholderSurface"

    invoke-direct {v0, v3, v2}, Lmo/c;-><init>(Ljava/lang/String;I)V

    if-eqz p1, :cond_5

    sget p1, Lr9/f;->z:I

    goto :goto_2

    :cond_5
    move p1, v1

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v3, v0, Lmo/c;->x:Landroid/os/Handler;

    new-instance v4, Lx8/e;

    invoke-direct {v4, v3}, Lx8/e;-><init>(Landroid/os/Handler;)V

    iput-object v4, v0, Lmo/c;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v3, v0, Lmo/c;->x:Landroid/os/Handler;

    invoke-virtual {v3, v2, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :goto_3
    iget-object p1, v0, Lmo/c;->F:Landroid/view/Surface;

    check-cast p1, Lr9/f;

    if-nez p1, :cond_6

    iget-object p1, v0, Lmo/c;->z:Ljava/lang/RuntimeException;

    if-nez p1, :cond_6

    iget-object p1, v0, Lmo/c;->y:Ljava/lang/Error;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_6

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move v1, v2

    goto :goto_3

    :cond_6
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_7

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_7
    iget-object p1, v0, Lmo/c;->z:Ljava/lang/RuntimeException;

    if-nez p1, :cond_9

    iget-object p1, v0, Lmo/c;->y:Ljava/lang/Error;

    if-nez p1, :cond_8

    iget-object p1, v0, Lmo/c;->F:Landroid/view/Surface;

    check-cast p1, Lr9/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lr9/e;->s1:Lr9/f;

    goto :goto_5

    :cond_8
    throw p1

    :cond_9
    throw p1

    :goto_4
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :cond_a
    :goto_5
    iget-object p1, p0, Lr9/e;->s1:Lr9/f;

    return-object p1

    :cond_b
    invoke-static {v1}, Lva3/g;->i(Z)V

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    throw v2
.end method

.method public final B0(Li9/m;)Z
    .locals 2

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-nez v0, :cond_3

    iget-object v0, p0, Lr9/e;->r1:Landroid/view/Surface;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    sget v0, Lx8/t;->a:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_1

    iget-boolean v0, p1, Li9/m;->h:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lr9/e;->H0(Li9/m;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final C0()V
    .locals 8

    iget v0, p0, Lr9/e;->y1:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lr9/e;->x1:J

    sub-long v2, v0, v2

    iget v4, p0, Lr9/e;->y1:I

    iget-object v5, p0, Lr9/e;->e1:Lxl/a;

    iget-object v6, v5, Lxl/a;->x:Ljava/lang/Object;

    check-cast v6, Landroid/os/Handler;

    if-eqz v6, :cond_0

    new-instance v7, Lr9/q;

    invoke-direct {v7, v5, v4, v2, v3}, Lr9/q;-><init>(Lxl/a;IJ)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    const/4 v2, 0x0

    iput v2, p0, Lr9/e;->y1:I

    iput-wide v0, p0, Lr9/e;->x1:J

    :cond_1
    return-void
.end method

.method public final D(Li9/m;Lu8/p;Lu8/p;)Lb9/h;
    .locals 8

    invoke-virtual {p1, p2, p3}, Li9/m;->b(Lu8/p;Lu8/p;)Lb9/h;

    move-result-object v0

    iget v1, v0, Lb9/h;->e:I

    iget-object v2, p0, Lr9/e;->l1:Lcr/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p3, Lu8/p;->u:I

    iget v4, v2, Lcr/p;->a:I

    if-gt v3, v4, :cond_0

    iget v3, p3, Lu8/p;->v:I

    iget v4, v2, Lcr/p;->b:I

    if-le v3, v4, :cond_1

    :cond_0
    or-int/lit16 v1, v1, 0x100

    :cond_1
    invoke-static {p1, p3}, Lr9/e;->z0(Li9/m;Lu8/p;)I

    move-result v3

    iget v2, v2, Lcr/p;->c:I

    if-le v3, v2, :cond_2

    or-int/lit8 v1, v1, 0x40

    :cond_2
    move v7, v1

    new-instance v2, Lb9/h;

    iget-object v3, p1, Li9/m;->a:Ljava/lang/String;

    if-eqz v7, :cond_3

    const/4 p1, 0x0

    :goto_0
    move v6, p1

    move-object v4, p2

    move-object v5, p3

    goto :goto_1

    :cond_3
    iget p1, v0, Lb9/h;->d:I

    goto :goto_0

    :goto_1
    invoke-direct/range {v2 .. v7}, Lb9/h;-><init>(Ljava/lang/String;Lu8/p;Lu8/p;II)V

    return-object v2
.end method

.method public final D0()V
    .locals 4

    iget-boolean v0, p0, Lr9/e;->H1:Z

    if-eqz v0, :cond_2

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Li9/o;->k0:Li9/k;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lmo/h;

    invoke-direct {v2, p0, v1}, Lmo/h;-><init>(Lr9/e;Li9/k;)V

    iput-object v2, p0, Lr9/e;->J1:Lmo/h;

    const/16 v2, 0x21

    if-lt v0, v2, :cond_2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "tunnel-peek"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {v1, v0}, Li9/k;->setParameters(Landroid/os/Bundle;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final E(Ljava/lang/IllegalStateException;Li9/m;)Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;
    .locals 2

    new-instance v0, Landroidx/media3/exoplayer/video/MediaCodecVideoDecoderException;

    iget-object v1, p0, Lr9/e;->r1:Landroid/view/Surface;

    invoke-direct {v0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;-><init>(Ljava/lang/IllegalStateException;Li9/m;)V

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->isValid()Z

    :cond_0
    return-object v0
.end method

.method public final E0(Li9/k;IJ)V
    .locals 6

    const-string v0, "releaseOutputBuffer"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-interface {p1, p2, p3, p4}, Li9/k;->d(IJ)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget p2, p1, Lb9/g;->f:I

    const/4 p3, 0x1

    add-int/2addr p2, p3

    iput p2, p1, Lb9/g;->f:I

    const/4 p1, 0x0

    iput p1, p0, Lr9/e;->z1:I

    iget-object p2, p0, Lr9/e;->o1:Lfw/h;

    if-nez p2, :cond_3

    iget-object p2, p0, Lr9/e;->E1:Lu8/y0;

    sget-object p4, Lu8/y0;->d:Lu8/y0;

    invoke-virtual {p2, p4}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result p4

    iget-object v1, p0, Lr9/e;->e1:Lxl/a;

    if-nez p4, :cond_0

    iget-object p4, p0, Lr9/e;->F1:Lu8/y0;

    invoke-virtual {p2, p4}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_0

    iput-object p2, p0, Lr9/e;->F1:Lu8/y0;

    invoke-virtual {v1, p2}, Lxl/a;->H(Lu8/y0;)V

    :cond_0
    iget-object p2, p0, Lr9/e;->h1:Lr9/n;

    iget p4, p2, Lr9/n;->e:I

    const/4 v0, 0x3

    if-eq p4, v0, :cond_1

    move p1, p3

    :cond_1
    iput v0, p2, Lr9/n;->e:I

    iget-object p4, p2, Lr9/n;->l:Lx8/p;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lx8/t;->J(J)J

    move-result-wide v2

    iput-wide v2, p2, Lr9/n;->g:J

    if-eqz p1, :cond_3

    iget-object v2, p0, Lr9/e;->r1:Landroid/view/Surface;

    if-eqz v2, :cond_3

    iget-object p1, v1, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    if-eqz p1, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    new-instance v0, Lcom/mapbox/common/module/c;

    const/4 v5, 0x6

    invoke-direct/range {v0 .. v5}, Lcom/mapbox/common/module/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    iput-boolean p3, p0, Lr9/e;->u1:Z

    :cond_3
    return-void
.end method

.method public final F0(Ljava/lang/Object;)V
    .locals 9

    instance-of v0, p1, Landroid/view/Surface;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/Surface;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iget-object v0, p0, Lr9/e;->r1:Landroid/view/Surface;

    iget-object v3, p0, Lr9/e;->e1:Lxl/a;

    if-eq v0, p1, :cond_c

    iput-object p1, p0, Lr9/e;->r1:Landroid/view/Surface;

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    iget-object v2, p0, Lr9/e;->h1:Lr9/n;

    if-nez v0, :cond_3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v4, 0x1

    if-eqz p1, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    iput-boolean v5, v2, Lr9/n;->m:Z

    iput-boolean v0, v2, Lr9/n;->n:Z

    iget-object v0, v2, Lr9/n;->b:Lmo/p;

    iget-object v5, v0, Lmo/p;->c:Landroid/view/Surface;

    if-ne v5, p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lmo/p;->b()V

    iput-object p1, v0, Lmo/p;->c:Landroid/view/Surface;

    invoke-virtual {v0, v4}, Lmo/p;->d(Z)V

    :goto_2
    invoke-virtual {v2, v4}, Lr9/n;->d(I)V

    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lr9/e;->u1:Z

    iget v0, p0, Lb9/f;->H:I

    iget-object v4, p0, Li9/o;->k0:Li9/k;

    if-eqz v4, :cond_7

    iget-object v5, p0, Lr9/e;->o1:Lfw/h;

    if-nez v5, :cond_7

    iget-object v5, p0, Li9/o;->r0:Li9/m;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v5}, Lr9/e;->B0(Li9/m;)Z

    move-result v6

    sget v7, Lx8/t;->a:I

    const/16 v8, 0x17

    if-lt v7, v8, :cond_6

    if-eqz v6, :cond_6

    iget-boolean v6, p0, Lr9/e;->m1:Z

    if-nez v6, :cond_6

    invoke-virtual {p0, v5}, Lr9/e;->A0(Li9/m;)Landroid/view/Surface;

    move-result-object v5

    if-lt v7, v8, :cond_4

    if-eqz v5, :cond_4

    invoke-interface {v4, v5}, Li9/k;->c(Landroid/view/Surface;)V

    goto :goto_3

    :cond_4
    const/16 v5, 0x23

    if-lt v7, v5, :cond_5

    invoke-interface {v4}, Li9/k;->h()V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_6
    invoke-virtual {p0}, Li9/o;->j0()V

    invoke-virtual {p0}, Li9/o;->U()V

    :cond_7
    :goto_3
    if-eqz p1, :cond_8

    iget-object p1, p0, Lr9/e;->F1:Lu8/y0;

    if-eqz p1, :cond_9

    invoke-virtual {v3, p1}, Lxl/a;->H(Lu8/y0;)V

    goto :goto_4

    :cond_8
    iput-object v1, p0, Lr9/e;->F1:Lu8/y0;

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p1, :cond_9

    iget-object p1, p1, Lfw/h;->e:Ljava/lang/Object;

    check-cast p1, Lr9/i;

    sget-object v3, Lx8/o;->c:Lx8/o;

    iget v3, v3, Lx8/o;->a:I

    iput-object v1, p1, Lr9/i;->j:Landroid/util/Pair;

    :cond_9
    :goto_4
    const/4 p1, 0x2

    if-ne v0, p1, :cond_b

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    const/4 v0, 0x1

    if-eqz p1, :cond_a

    iget-object p1, p1, Lfw/h;->e:Ljava/lang/Object;

    check-cast p1, Lr9/i;

    iget-object p1, p1, Lr9/i;->f:Lr9/c;

    iget-object p1, p1, Lr9/c;->a:Lr9/n;

    invoke-virtual {p1, v0}, Lr9/n;->c(Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {v2, v0}, Lr9/n;->c(Z)V

    :cond_b
    :goto_5
    invoke-virtual {p0}, Lr9/e;->D0()V

    return-void

    :cond_c
    if-eqz p1, :cond_e

    iget-object p1, p0, Lr9/e;->F1:Lu8/y0;

    if-eqz p1, :cond_d

    invoke-virtual {v3, p1}, Lxl/a;->H(Lu8/y0;)V

    :cond_d
    iget-object v4, p0, Lr9/e;->r1:Landroid/view/Surface;

    if-eqz v4, :cond_e

    iget-boolean p1, p0, Lr9/e;->u1:Z

    if-eqz p1, :cond_e

    iget-object p1, v3, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    if-eqz p1, :cond_e

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    new-instance v2, Lcom/mapbox/common/module/c;

    const/4 v7, 0x6

    invoke-direct/range {v2 .. v7}, Lcom/mapbox/common/module/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_e
    return-void
.end method

.method public final G0(JJZZ)Z
    .locals 9

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v2, p0, Lr9/e;->j1:J

    cmp-long v0, v2, v0

    const/4 v1, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    iget-wide v5, p0, Lb9/f;->L:J

    const-wide/32 v7, 0x30d40

    add-long/2addr v5, v7

    cmp-long v0, p3, v5

    if-lez v0, :cond_0

    cmp-long v0, p1, v2

    if-gez v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lr9/e;->O1:Z

    :cond_1
    const-wide/32 v2, -0x7a120

    cmp-long p1, p1, v2

    if-gez p1, :cond_6

    if-nez p5, :cond_6

    iget-object p1, p0, Lb9/f;->I:Ll9/z0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v2, p0, Lb9/f;->K:J

    sub-long/2addr p3, v2

    invoke-interface {p1, p3, p4}, Ll9/z0;->j(J)I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lr9/e;->k1:Ljava/util/PriorityQueue;

    if-eqz p6, :cond_3

    iget-object p3, p0, Li9/o;->X0:Lb9/g;

    iget p4, p3, Lb9/g;->e:I

    add-int/2addr p4, p1

    iput p4, p3, Lb9/g;->e:I

    iget p1, p3, Lb9/g;->g:I

    iget p5, p0, Lr9/e;->A1:I

    add-int/2addr p1, p5

    iput p1, p3, Lb9/g;->g:I

    invoke-virtual {p2}, Ljava/util/PriorityQueue;->size()I

    move-result p1

    add-int/2addr p1, p4

    iput p1, p3, Lb9/g;->e:I

    goto :goto_1

    :cond_3
    iget-object p3, p0, Li9/o;->X0:Lb9/g;

    iget p4, p3, Lb9/g;->k:I

    add-int/2addr p4, v4

    iput p4, p3, Lb9/g;->k:I

    invoke-virtual {p2}, Ljava/util/PriorityQueue;->size()I

    move-result p2

    add-int/2addr p2, p1

    iget p1, p0, Lr9/e;->A1:I

    invoke-virtual {p0, p2, p1}, Lr9/e;->J0(II)V

    :goto_1
    invoke-virtual {p0}, Li9/o;->K()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Li9/o;->U()V

    :cond_4
    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1}, Lfw/h;->a(Z)V

    :cond_5
    return v4

    :cond_6
    :goto_2
    return v1
.end method

.method public final H0(Li9/m;)Z
    .locals 2

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Lr9/e;->H1:Z

    if-nez v0, :cond_1

    iget-object v0, p1, Li9/m;->a:Ljava/lang/String;

    invoke-static {v0}, Lr9/e;->w0(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean p1, p1, Li9/m;->f:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lr9/e;->c1:Landroid/content/Context;

    invoke-static {p1}, Lr9/f;->b(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final I0(Li9/k;I)V
    .locals 1

    const-string v0, "skipVideoBuffer"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Li9/k;->i(I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget p2, p1, Lb9/g;->g:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p1, Lb9/g;->g:I

    return-void
.end method

.method public final J0(II)V
    .locals 2

    iget-object v0, p0, Li9/o;->X0:Lb9/g;

    iget v1, v0, Lb9/g;->i:I

    add-int/2addr v1, p1

    iput v1, v0, Lb9/g;->i:I

    add-int/2addr p1, p2

    iget p2, v0, Lb9/g;->h:I

    add-int/2addr p2, p1

    iput p2, v0, Lb9/g;->h:I

    iget p2, p0, Lr9/e;->y1:I

    add-int/2addr p2, p1

    iput p2, p0, Lr9/e;->y1:I

    iget p2, p0, Lr9/e;->z1:I

    add-int/2addr p2, p1

    iput p2, p0, Lr9/e;->z1:I

    iget p1, v0, Lb9/g;->j:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, v0, Lb9/g;->j:I

    iget p1, p0, Lr9/e;->f1:I

    if-lez p1, :cond_0

    iget p2, p0, Lr9/e;->y1:I

    if-lt p2, p1, :cond_0

    invoke-virtual {p0}, Lr9/e;->C0()V

    :cond_0
    return-void
.end method

.method public final K0(J)V
    .locals 3

    iget-object v0, p0, Li9/o;->X0:Lb9/g;

    iget-wide v1, v0, Lb9/g;->l:J

    add-long/2addr v1, p1

    iput-wide v1, v0, Lb9/g;->l:J

    iget v1, v0, Lb9/g;->m:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lb9/g;->m:I

    iget-wide v0, p0, Lr9/e;->B1:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lr9/e;->B1:J

    iget p1, p0, Lr9/e;->C1:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lr9/e;->C1:I

    return-void
.end method

.method public final M(La9/e;)I
    .locals 4

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    iget-boolean v0, p0, Lr9/e;->H1:Z

    if-eqz v0, :cond_0

    iget-wide v0, p1, La9/e;->G:J

    iget-wide v2, p0, Lb9/f;->L:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/16 p1, 0x20

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final N()Z
    .locals 2

    iget-boolean v0, p0, Lr9/e;->H1:Z

    if-eqz v0, :cond_0

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final O(F[Lu8/p;)F
    .locals 6

    array-length v0, p2

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p2, v2

    iget v4, v4, Lu8/p;->w:F

    cmpl-float v5, v4, v1

    if-eqz v5, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    cmpl-float p2, v3, v1

    if-nez p2, :cond_2

    return v1

    :cond_2
    mul-float/2addr v3, p1

    return v3
.end method

.method public final P(Li9/h;Lu8/p;Z)Ljava/util/ArrayList;
    .locals 2

    iget-object v0, p0, Lr9/e;->c1:Landroid/content/Context;

    iget-boolean v1, p0, Lr9/e;->H1:Z

    invoke-static {v0, p1, p2, p3, v1}, Lr9/e;->y0(Landroid/content/Context;Li9/h;Lu8/p;ZZ)Ljava/util/List;

    move-result-object p1

    sget-object p3, Li9/s;->a:Ljava/util/HashMap;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lhn/p;

    const/4 v0, 0x2

    invoke-direct {p1, p2, v0}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lea2/l;

    const/4 v0, 0x4

    invoke-direct {p2, p1, v0}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object p3
.end method

.method public final Q(Li9/m;Lu8/p;Landroid/media/MediaCrypto;F)La30/w0;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    iget-object v3, v2, Li9/m;->c:Ljava/lang/String;

    iget-object v5, v0, Lb9/f;->J:[Lu8/p;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v6, v4, Lu8/p;->u:I

    iget v7, v4, Lu8/p;->w:F

    iget-object v8, v4, Lu8/p;->B:Lu8/g;

    iget v9, v4, Lu8/p;->v:I

    invoke-static/range {p1 .. p2}, Lr9/e;->z0(Li9/m;Lu8/p;)I

    move-result v10

    array-length v11, v5

    const/4 v13, -0x1

    const/4 v14, 0x1

    if-ne v11, v14, :cond_1

    if-eq v10, v13, :cond_0

    invoke-static/range {p1 .. p2}, Lr9/e;->x0(Li9/m;Lu8/p;)I

    move-result v5

    if-eq v5, v13, :cond_0

    int-to-float v10, v10

    const/high16 v11, 0x3fc00000    # 1.5f

    mul-float/2addr v10, v11

    float-to-int v10, v10

    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    move-result v10

    :cond_0
    new-instance v5, Lcr/p;

    invoke-direct {v5, v6, v9, v10}, Lcr/p;-><init>(III)V

    move-object/from16 v19, v8

    move v15, v9

    goto/16 :goto_11

    :cond_1
    array-length v11, v5

    move v14, v6

    move v12, v9

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_0
    if-ge v15, v11, :cond_6

    aget-object v13, v5, v15

    move-object/from16 v18, v5

    if-eqz v8, :cond_2

    iget-object v5, v13, Lu8/p;->B:Lu8/g;

    if-nez v5, :cond_2

    invoke-virtual {v13}, Lu8/p;->a()Lu8/o;

    move-result-object v5

    iput-object v8, v5, Lu8/o;->A:Lu8/g;

    new-instance v13, Lu8/p;

    invoke-direct {v13, v5}, Lu8/p;-><init>(Lu8/o;)V

    :cond_2
    invoke-virtual {v2, v4, v13}, Li9/m;->b(Lu8/p;Lu8/p;)Lb9/h;

    move-result-object v5

    move/from16 v19, v11

    iget v11, v13, Lu8/p;->v:I

    iget v5, v5, Lb9/h;->d:I

    if-eqz v5, :cond_5

    iget v5, v13, Lu8/p;->u:I

    move/from16 v20, v15

    const/4 v15, -0x1

    if-eq v5, v15, :cond_4

    if-ne v11, v15, :cond_3

    goto :goto_1

    :cond_3
    const/16 v17, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/16 v17, 0x1

    :goto_2
    or-int v16, v16, v17

    invoke-static {v14, v5}, Ljava/lang/Math;->max(II)I

    move-result v14

    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    move-result v12

    invoke-static {v2, v13}, Lr9/e;->z0(Li9/m;Lu8/p;)I

    move-result v5

    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    move v10, v5

    goto :goto_3

    :cond_5
    move/from16 v20, v15

    const/4 v15, -0x1

    :goto_3
    add-int/lit8 v5, v20, 0x1

    move v13, v15

    move/from16 v11, v19

    move v15, v5

    move-object/from16 v5, v18

    goto :goto_0

    :cond_6
    if-eqz v16, :cond_12

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v11, "Resolutions unknown. Codec max resolution: "

    invoke-direct {v5, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, "x"

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v13, "MediaCodecVideoRenderer"

    invoke-static {v13, v5}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    if-le v9, v6, :cond_7

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_8

    move v15, v9

    goto :goto_5

    :cond_8
    move v15, v6

    :goto_5
    move/from16 v16, v5

    if-eqz v5, :cond_9

    move v5, v6

    goto :goto_6

    :cond_9
    move v5, v9

    :goto_6
    int-to-float v1, v5

    move/from16 v17, v1

    int-to-float v1, v15

    div-float v1, v17, v1

    move/from16 v17, v1

    const/4 v1, 0x0

    :goto_7
    const/16 v18, 0x0

    move-object/from16 v19, v8

    const/16 v8, 0x9

    if-ge v1, v8, :cond_11

    sget-object v8, Lr9/e;->Q1:[I

    aget v8, v8, v1

    move/from16 v20, v1

    int-to-float v1, v8

    mul-float v1, v1, v17

    float-to-int v1, v1

    if-le v8, v15, :cond_11

    if-gt v1, v5, :cond_a

    goto/16 :goto_e

    :cond_a
    move/from16 v21, v1

    if-eqz v16, :cond_b

    goto :goto_8

    :cond_b
    move v1, v8

    :goto_8
    if-eqz v16, :cond_c

    :goto_9
    move/from16 v21, v5

    goto :goto_a

    :cond_c
    move/from16 v8, v21

    goto :goto_9

    :goto_a
    iget-object v5, v2, Li9/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-nez v5, :cond_d

    :goto_b
    move/from16 v23, v15

    move-object/from16 v4, v18

    goto :goto_c

    :cond_d
    invoke-virtual {v5}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v5

    if-nez v5, :cond_e

    goto :goto_b

    :cond_e
    move-object/from16 v22, v5

    invoke-virtual/range {v22 .. v22}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getWidthAlignment()I

    move-result v5

    move/from16 v23, v15

    invoke-virtual/range {v22 .. v22}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getHeightAlignment()I

    move-result v15

    new-instance v4, Landroid/graphics/Point;

    invoke-static {v1, v5}, Lx8/t;->e(II)I

    move-result v1

    mul-int/2addr v1, v5

    invoke-static {v8, v15}, Lx8/t;->e(II)I

    move-result v5

    mul-int/2addr v5, v15

    invoke-direct {v4, v1, v5}, Landroid/graphics/Point;-><init>(II)V

    :goto_c
    if-eqz v4, :cond_f

    iget v1, v4, Landroid/graphics/Point;->x:I

    iget v5, v4, Landroid/graphics/Point;->y:I

    move v15, v9

    float-to-double v8, v7

    invoke-virtual {v2, v1, v5, v8, v9}, Li9/m;->g(IID)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_f

    :cond_f
    move v15, v9

    :cond_10
    add-int/lit8 v1, v20, 0x1

    move-object/from16 v4, p2

    move v9, v15

    move-object/from16 v8, v19

    move/from16 v5, v21

    move/from16 v15, v23

    goto :goto_7

    :goto_d
    move-object/from16 v4, v18

    goto :goto_f

    :cond_11
    :goto_e
    move v15, v9

    goto :goto_d

    :goto_f
    if-eqz v4, :cond_13

    iget v1, v4, Landroid/graphics/Point;->x:I

    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    move-result v14

    iget v1, v4, Landroid/graphics/Point;->y:I

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lu8/p;->a()Lu8/o;

    move-result-object v1

    iput v14, v1, Lu8/o;->t:I

    iput v12, v1, Lu8/o;->u:I

    new-instance v4, Lu8/p;

    invoke-direct {v4, v1}, Lu8/p;-><init>(Lu8/o;)V

    invoke-static {v2, v4}, Lr9/e;->x0(Li9/m;Lu8/p;)I

    move-result v1

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Codec max resolution adjusted to: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v13, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10

    :cond_12
    move-object/from16 v19, v8

    move v15, v9

    :cond_13
    :goto_10
    new-instance v5, Lcr/p;

    invoke-direct {v5, v14, v12, v10}, Lcr/p;-><init>(III)V

    :goto_11
    iput-object v5, v0, Lr9/e;->l1:Lcr/p;

    iget-boolean v1, v0, Lr9/e;->H1:Z

    if-eqz v1, :cond_14

    iget v1, v0, Lr9/e;->I1:I

    goto :goto_12

    :cond_14
    const/4 v1, 0x0

    :goto_12
    new-instance v4, Landroid/media/MediaFormat;

    invoke-direct {v4}, Landroid/media/MediaFormat;-><init>()V

    const-string v8, "mime"

    invoke-virtual {v4, v8, v3}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "width"

    invoke-virtual {v4, v3, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v3, "height"

    invoke-virtual {v4, v3, v15}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    move-object/from16 v3, p2

    iget-object v6, v3, Lu8/p;->q:Ljava/util/List;

    invoke-static {v4, v6}, Lx8/a;->t(Landroid/media/MediaFormat;Ljava/util/List;)V

    const/high16 v6, -0x40800000    # -1.0f

    cmpl-float v8, v7, v6

    if-eqz v8, :cond_15

    const-string v8, "frame-rate"

    invoke-virtual {v4, v8, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_15
    const-string v7, "rotation-degrees"

    iget v8, v3, Lu8/p;->x:I

    invoke-static {v4, v7, v8}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    if-eqz v19, :cond_16

    const-string v7, "color-transfer"

    move-object/from16 v8, v19

    iget v9, v8, Lu8/g;->c:I

    invoke-static {v4, v7, v9}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v7, "color-standard"

    iget v9, v8, Lu8/g;->a:I

    invoke-static {v4, v7, v9}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    const-string v7, "color-range"

    iget v9, v8, Lu8/g;->b:I

    invoke-static {v4, v7, v9}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    iget-object v7, v8, Lu8/g;->d:[B

    if-eqz v7, :cond_16

    invoke-static {v7}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v7

    const-string v8, "hdr-static-info"

    invoke-virtual {v4, v8, v7}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    :cond_16
    const-string v7, "video/dolby-vision"

    iget-object v8, v3, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-static {v3}, Li9/s;->d(Lu8/p;)Landroid/util/Pair;

    move-result-object v7

    if-eqz v7, :cond_17

    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const-string v8, "profile"

    invoke-static {v4, v8, v7}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    :cond_17
    const-string v7, "max-width"

    iget v8, v5, Lcr/p;->a:I

    invoke-virtual {v4, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v7, "max-height"

    iget v8, v5, Lcr/p;->b:I

    invoke-virtual {v4, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v7, "max-input-size"

    iget v5, v5, Lcr/p;->c:I

    invoke-static {v4, v7, v5}, Lx8/a;->p(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget v5, Lx8/t;->a:I

    const/16 v7, 0x17

    if-lt v5, v7, :cond_18

    const-string v7, "priority"

    const/4 v8, 0x0

    invoke-virtual {v4, v7, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    cmpl-float v6, p4, v6

    if-eqz v6, :cond_18

    const-string v6, "operating-rate"

    move/from16 v7, p4

    invoke-virtual {v4, v6, v7}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_18
    iget-boolean v6, v0, Lr9/e;->g1:Z

    if-eqz v6, :cond_19

    const-string v6, "no-post-process"

    const/4 v7, 0x1

    invoke-virtual {v4, v6, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "auto-frc"

    const/4 v8, 0x0

    invoke-virtual {v4, v6, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_13

    :cond_19
    const/4 v7, 0x1

    :goto_13
    if-eqz v1, :cond_1a

    const-string v6, "tunneled-playback"

    invoke-virtual {v4, v6, v7}, Landroid/media/MediaFormat;->setFeatureEnabled(Ljava/lang/String;Z)V

    const-string v6, "audio-session-id"

    invoke-virtual {v4, v6, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1a
    const/16 v1, 0x23

    if-lt v5, v1, :cond_1b

    iget v1, v0, Lr9/e;->G1:I

    neg-int v1, v1

    const/4 v8, 0x0

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    const-string v5, "importance"

    invoke-virtual {v4, v5, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1b
    invoke-virtual/range {p0 .. p1}, Lr9/e;->A0(Li9/m;)Landroid/view/Surface;

    move-result-object v5

    iget-object v1, v0, Lr9/e;->o1:Lfw/h;

    if-eqz v1, :cond_1c

    iget-object v1, v0, Lr9/e;->c1:Landroid/content/Context;

    invoke-static {v1}, Lx8/t;->H(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1c

    const-string v1, "allow-frame-drop"

    const/4 v8, 0x0

    invoke-virtual {v4, v1, v8}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1c
    new-instance v1, La30/w0;

    const/4 v7, 0x0

    const/4 v8, 0x6

    move-object v6, v4

    move-object v4, v3

    move-object v3, v6

    move-object/from16 v6, p3

    invoke-direct/range {v1 .. v8}, La30/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v1
.end method

.method public final R(La9/e;)V
    .locals 7

    iget-boolean v0, p0, Lr9/e;->n1:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, La9/e;->H:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/16 v6, -0x4b

    if-ne v0, v6, :cond_2

    const/16 v0, 0x3c

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    const/4 v1, 0x4

    if-ne v3, v1, :cond_2

    if-eqz v4, :cond_1

    if-ne v4, v0, :cond_2

    :cond_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object p1, p0, Li9/o;->k0:Li9/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "hdr10-plus-info"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    invoke-interface {p1, v1}, Li9/k;->setParameters(Landroid/os/Bundle;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final W(Lu8/p;)Z
    .locals 3

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-nez v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    :try_start_0
    invoke-virtual {v0, p1}, Lfw/h;->b(Lu8/p;)Z

    const/4 v0, 0x0

    throw v0
    :try_end_0
    .catch Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const/16 v1, 0x1b58

    const/4 v2, 0x0

    invoke-virtual {p0, v0, p1, v2, v1}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1
.end method

.method public final X(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "MediaCodecVideoRenderer"

    const-string v1, "Video codec error"

    invoke-static {v0, v1, p1}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lr9/e;->e1:Lxl/a;

    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Lr9/q;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, v3}, Lr9/q;-><init>(Lxl/a;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final Y(JJLjava/lang/String;)V
    .locals 8

    iget-object v1, p0, Lr9/e;->e1:Lxl/a;

    iget-object v0, v1, Lxl/a;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Landroid/os/Handler;

    if-eqz v7, :cond_0

    new-instance v0, Lr9/q;

    move-wide v3, p1

    move-wide v5, p3

    move-object v2, p5

    invoke-direct/range {v0 .. v6}, Lr9/q;-><init>(Lxl/a;Ljava/lang/String;JJ)V

    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    move-object v2, p5

    :goto_0
    invoke-static {v2}, Lr9/e;->w0(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lr9/e;->m1:Z

    iget-object p1, p0, Li9/o;->r0:Li9/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p2, Lx8/t;->a:I

    const/16 p3, 0x1d

    const/4 p4, 0x0

    if-lt p2, p3, :cond_4

    const-string p2, "video/x-vnd.on2.vp9"

    iget-object p3, p1, Li9/m;->b:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p1, Li9/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroid/media/MediaCodecInfo$CodecCapabilities;->profileLevels:[Landroid/media/MediaCodecInfo$CodecProfileLevel;

    if-nez p1, :cond_2

    :cond_1
    new-array p1, p4, [Landroid/media/MediaCodecInfo$CodecProfileLevel;

    :cond_2
    array-length p2, p1

    move p3, p4

    :goto_1
    if-ge p3, p2, :cond_4

    aget-object p5, p1, p3

    iget p5, p5, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    const/16 v0, 0x4000

    if-ne p5, v0, :cond_3

    const/4 p4, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    iput-boolean p4, p0, Lr9/e;->n1:Z

    invoke-virtual {p0}, Lr9/e;->D0()V

    return-void
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lr9/e;->e1:Lxl/a;

    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Lr9/q;

    const/4 v3, 0x2

    invoke-direct {v2, v0, p1, v3}, Lr9/q;-><init>(Lxl/a;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final a(ILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_c

    const/4 v1, 0x7

    if-eq p1, v1, :cond_a

    const/16 v1, 0xa

    if-eq p1, v1, :cond_9

    const/4 v1, 0x4

    if-eq p1, v1, :cond_8

    const/4 v1, 0x5

    if-eq p1, v1, :cond_5

    const/16 v1, 0xd

    if-eq p1, v1, :cond_4

    const/16 v1, 0xe

    if-eq p1, v1, :cond_3

    const/16 v1, 0x10

    if-eq p1, v1, :cond_1

    const/16 v1, 0x11

    if-eq p1, v1, :cond_0

    const/16 v0, 0xb

    if-ne p1, v0, :cond_b

    check-cast p2, Lb9/h0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Li9/o;->f0:Lb9/h0;

    return-void

    :cond_0
    iget-object p1, p0, Lr9/e;->r1:Landroid/view/Surface;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lr9/e;->F0(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Lr9/e;

    invoke-virtual {p2, v0, p1}, Lr9/e;->a(ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lr9/e;->G1:I

    iget-object p1, p0, Li9/o;->k0:Li9/k;

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    sget p2, Lx8/t;->a:I

    const/16 v0, 0x23

    if-lt p2, v0, :cond_b

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Lr9/e;->G1:I

    neg-int v0, v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "importance"

    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {p1, p2}, Li9/k;->setParameters(Landroid/os/Bundle;)V

    return-void

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Lx8/o;

    iget p1, p2, Lx8/o;->a:I

    if-eqz p1, :cond_b

    iget p1, p2, Lx8/o;->b:I

    if-eqz p1, :cond_b

    iput-object p2, p0, Lr9/e;->t1:Lx8/o;

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p1, :cond_b

    iget-object v0, p0, Lr9/e;->r1:Landroid/view/Surface;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, p2}, Lfw/h;->d(Landroid/view/Surface;Lx8/o;)V

    return-void

    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lr9/e;->q1:Ljava/util/List;

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p1, :cond_b

    invoke-virtual {p1, p2}, Lfw/h;->g(Ljava/util/List;)V

    return-void

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lr9/e;->w1:I

    iget-object p2, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p2, :cond_6

    invoke-virtual {p2, p1}, Lfw/h;->c(I)V

    return-void

    :cond_6
    iget-object p2, p0, Lr9/e;->h1:Lr9/n;

    iget-object p2, p2, Lr9/n;->b:Lmo/p;

    iget v1, p2, Lmo/p;->h:I

    if-ne v1, p1, :cond_7

    goto :goto_0

    :cond_7
    iput p1, p2, Lmo/p;->h:I

    invoke-virtual {p2, v0}, Lmo/p;->d(Z)V

    return-void

    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lr9/e;->v1:I

    iget-object p2, p0, Li9/o;->k0:Li9/k;

    if-eqz p2, :cond_b

    invoke-interface {p2, p1}, Li9/k;->b(I)V

    return-void

    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget p2, p0, Lr9/e;->I1:I

    if-eq p2, p1, :cond_b

    iput p1, p0, Lr9/e;->I1:I

    iget-boolean p1, p0, Lr9/e;->H1:Z

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Li9/o;->j0()V

    return-void

    :cond_a
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p2, Lr9/m;

    iput-object p2, p0, Lr9/e;->K1:Lr9/m;

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p1, :cond_b

    invoke-virtual {p1, p2}, Lfw/h;->h(Lr9/m;)V

    :cond_b
    :goto_0
    return-void

    :cond_c
    invoke-virtual {p0, p2}, Lr9/e;->F0(Ljava/lang/Object;)V

    return-void
.end method

.method public final a0(Lqg3/d;)Lb9/h;
    .locals 4

    invoke-super {p0, p1}, Li9/o;->a0(Lqg3/d;)Lb9/h;

    move-result-object v0

    iget-object p1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, Lu8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lr9/e;->e1:Lxl/a;

    iget-object v2, v1, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_0

    new-instance v3, Lr9/q;

    invoke-direct {v3, v1, p1, v0}, Lr9/q;-><init>(Lxl/a;Lu8/p;Lb9/h;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-object v0
.end method

.method public final b0(Lu8/p;Landroid/media/MediaFormat;)V
    .locals 8

    iget-object v0, p0, Li9/o;->k0:Li9/k;

    if-eqz v0, :cond_0

    iget v1, p0, Lr9/e;->v1:I

    invoke-interface {v0, v1}, Li9/k;->b(I)V

    :cond_0
    iget-boolean v0, p0, Lr9/e;->H1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget p2, p1, Lu8/p;->u:I

    iget v0, p1, Lu8/p;->v:I

    goto :goto_3

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "crop-right"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "crop-top"

    const-string v4, "crop-bottom"

    const-string v5, "crop-left"

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v6

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v5

    sub-int/2addr v0, v5

    add-int/2addr v0, v6

    goto :goto_1

    :cond_3
    const-string v0, "width"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    :goto_1
    if-eqz v2, :cond_4

    invoke-virtual {p2, v4}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    sub-int/2addr v2, p2

    add-int/2addr v2, v6

    move p2, v2

    goto :goto_2

    :cond_4
    const-string v2, "height"

    invoke-virtual {p2, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    :goto_2
    move v7, v0

    move v0, p2

    move p2, v7

    :goto_3
    iget v2, p1, Lu8/p;->y:F

    iget v3, p1, Lu8/p;->x:I

    const/16 v4, 0x5a

    if-eq v3, v4, :cond_5

    const/16 v4, 0x10e

    if-ne v3, v4, :cond_6

    :cond_5
    const/high16 v3, 0x3f800000    # 1.0f

    div-float v2, v3, v2

    move v7, v0

    move v0, p2

    move p2, v7

    :cond_6
    new-instance v3, Lu8/y0;

    invoke-direct {v3, v2, p2, v0}, Lu8/y0;-><init>(FII)V

    iput-object v3, p0, Lr9/e;->E1:Lu8/y0;

    iget-object v3, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v3, :cond_a

    iget-boolean v4, p0, Lr9/e;->N1:Z

    if-eqz v4, :cond_a

    invoke-virtual {p1}, Lu8/p;->a()Lu8/o;

    move-result-object p1

    iput p2, p1, Lu8/o;->t:I

    iput v0, p1, Lu8/o;->u:I

    iput v2, p1, Lu8/o;->x:F

    new-instance p2, Lu8/p;

    invoke-direct {p2, p1}, Lu8/p;-><init>(Lu8/o;)V

    iget-object p1, p0, Lr9/e;->q1:Ljava/util/List;

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    :goto_4
    invoke-static {v1}, Lva3/g;->i(Z)V

    iget-object v0, v3, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v1, v0, Lr9/i;->c:Lr9/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lzr/d0;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lzr/a0;-><init>(I)V

    invoke-virtual {v1, p1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    iget-object p1, v0, Lr9/i;->e:Lzr/w0;

    invoke-virtual {v1, p1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    invoke-virtual {v1}, Lzr/d0;->f()Lzr/w0;

    move-result-object p1

    iput-object p1, v3, Lfw/h;->b:Ljava/util/List;

    iput-object p2, v3, Lfw/h;->c:Ljava/lang/Object;

    invoke-virtual {p2}, Lu8/p;->a()Lu8/o;

    move-result-object p1

    iget-object p2, p2, Lu8/p;->B:Lu8/g;

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lu8/g;->d()Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    sget-object p2, Lu8/g;->h:Lu8/g;

    :cond_9
    iput-object p2, p1, Lu8/o;->A:Lu8/g;

    invoke-virtual {p1}, Lu8/o;->a()Lu8/p;

    const/4 p1, 0x0

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    throw p1

    :cond_a
    iget p1, p1, Lu8/p;->w:F

    iget-object p2, p0, Lr9/e;->h1:Lr9/n;

    iget-object p2, p2, Lr9/n;->b:Lmo/p;

    iput p1, p2, Lmo/p;->d:F

    iget-object p1, p2, Lmo/p;->p:Ljava/lang/Object;

    check-cast p1, Lmo/f;

    iget-object v0, p1, Lmo/f;->d:Ljava/lang/Object;

    check-cast v0, Lmo/e;

    invoke-virtual {v0}, Lmo/e;->c()V

    iget-object v0, p1, Lmo/f;->e:Ljava/lang/Object;

    check-cast v0, Lmo/e;

    invoke-virtual {v0}, Lmo/e;->c()V

    iput-boolean v1, p1, Lmo/f;->a:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p1, Lmo/f;->b:J

    iput v1, p1, Lmo/f;->c:I

    invoke-virtual {p2}, Lmo/p;->c()V

    iput-boolean v1, p0, Lr9/e;->N1:Z

    return-void
.end method

.method public final d0(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Li9/o;->d0(J)V

    iget-boolean p1, p0, Lr9/e;->H1:Z

    if-nez p1, :cond_0

    iget p1, p0, Lr9/e;->A1:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lr9/e;->A1:I

    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 5

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfw/h;->i()V

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    iget-object v1, p0, Li9/o;->Y0:Li9/n;

    iget-wide v1, v1, Li9/n;->b:J

    iget-wide v3, p0, Lr9/e;->L1:J

    neg-long v3, v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lfw/h;->f(JJ)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lr9/e;->h1:Lr9/n;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lr9/n;->d(I)V

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lr9/e;->N1:Z

    invoke-virtual {p0}, Lr9/e;->D0()V

    return-void
.end method

.method public final f0(La9/e;)V
    .locals 11

    const/4 v0, 0x0

    iput v0, p0, Lr9/e;->P1:I

    iget-boolean v1, p0, Lr9/e;->H1:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget v3, p0, Lr9/e;->A1:I

    add-int/2addr v3, v2

    iput v3, p0, Lr9/e;->A1:I

    :cond_0
    sget v3, Lx8/t;->a:I

    const/16 v4, 0x17

    if-ge v3, v4, :cond_5

    if-eqz v1, :cond_5

    iget-wide v3, p1, La9/e;->G:J

    invoke-virtual {p0, v3, v4}, Li9/o;->v0(J)V

    iget-object p1, p0, Lr9/e;->E1:Lu8/y0;

    sget-object v1, Lu8/y0;->d:Lu8/y0;

    invoke-virtual {p1, v1}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v6, p0, Lr9/e;->e1:Lxl/a;

    if-nez v1, :cond_1

    iget-object v1, p0, Lr9/e;->F1:Lu8/y0;

    invoke-virtual {p1, v1}, Lu8/y0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object p1, p0, Lr9/e;->F1:Lu8/y0;

    invoke-virtual {v6, p1}, Lxl/a;->H(Lu8/y0;)V

    :cond_1
    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget v1, p1, Lb9/g;->f:I

    add-int/2addr v1, v2

    iput v1, p1, Lb9/g;->f:I

    iget-object p1, p0, Lr9/e;->h1:Lr9/n;

    iget v1, p1, Lr9/n;->e:I

    const/4 v5, 0x3

    if-eq v1, v5, :cond_2

    move v0, v2

    :cond_2
    iput v5, p1, Lr9/n;->e:I

    iget-object v1, p1, Lr9/n;->l:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    invoke-static {v7, v8}, Lx8/t;->J(J)J

    move-result-wide v7

    iput-wide v7, p1, Lr9/n;->g:J

    if-eqz v0, :cond_4

    iget-object v7, p0, Lr9/e;->r1:Landroid/view/Surface;

    if-eqz v7, :cond_4

    iget-object p1, v6, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    if-eqz p1, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    new-instance v5, Lcom/mapbox/common/module/c;

    const/4 v10, 0x6

    invoke-direct/range {v5 .. v10}, Lcom/mapbox/common/module/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    invoke-virtual {p1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    iput-boolean v2, p0, Lr9/e;->u1:Z

    :cond_4
    invoke-virtual {p0, v3, v4}, Lr9/e;->d0(J)V

    :cond_5
    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    iget v1, v0, Lr9/n;->e:I

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput v1, v0, Lr9/n;->e:I

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lr9/e;->h1:Lr9/n;

    iget v1, v0, Lr9/n;->e:I

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput v1, v0, Lr9/n;->e:I

    :cond_2
    return-void
.end method

.method public final h0(JJLi9/k;Ljava/nio/ByteBuffer;IIIJZZLu8/p;)Z
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p7

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Li9/o;->Y0:Li9/n;

    iget-wide v3, v3, Li9/n;->c:J

    sub-long v6, p10, v3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    iget-object v5, v0, Lr9/e;->k1:Ljava/util/PriorityQueue;

    invoke-virtual {v5}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v8, v8, p10

    if-gez v8, :cond_0

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v5}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4, v3}, Lr9/e;->J0(II)V

    iget-object v4, v0, Lr9/e;->o1:Lfw/h;

    const/4 v12, 0x1

    if-eqz v4, :cond_3

    if-eqz p12, :cond_1

    if-nez p13, :cond_1

    invoke-virtual {v0, v1, v2}, Lr9/e;->I0(Li9/k;I)V

    return v12

    :cond_1
    invoke-static {v3}, Lva3/g;->i(Z)V

    iget-object v1, v4, Lfw/h;->e:Ljava/lang/Object;

    check-cast v1, Lr9/i;

    iget v1, v1, Lr9/i;->n:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_5

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-static {v1}, Lva3/g;->j(Ljava/lang/Object;)V

    throw v1

    :cond_3
    iget-object v4, v0, Li9/o;->Y0:Li9/n;

    iget-wide v4, v4, Li9/n;->b:J

    iget-object v8, v0, Lr9/e;->i1:Lna/a;

    iget-object v13, v0, Lr9/e;->h1:Lr9/n;

    move-wide/from16 v16, p1

    move-wide/from16 v18, p3

    move-wide/from16 v14, p10

    move/from16 v22, p12

    move/from16 v23, p13

    move-wide/from16 v20, v4

    move-object/from16 v24, v8

    invoke-virtual/range {v13 .. v24}, Lr9/n;->a(JJJJZZLna/a;)I

    move-result v4

    iget-object v13, v0, Lr9/e;->i1:Lna/a;

    if-eqz v4, :cond_b

    if-eq v4, v12, :cond_8

    const/4 v5, 0x2

    if-eq v4, v5, :cond_7

    const/4 v5, 0x3

    if-eq v4, v5, :cond_6

    const/4 v1, 0x4

    if-eq v4, v1, :cond_5

    const/4 v1, 0x5

    if-ne v4, v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    :goto_1
    return v3

    :cond_6
    invoke-virtual {v0, v1, v2}, Lr9/e;->I0(Li9/k;I)V

    iget-wide v1, v13, Lna/a;->a:J

    invoke-virtual {v0, v1, v2}, Lr9/e;->K0(J)V

    return v12

    :cond_7
    const-string v4, "dropVideoBuffer"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Li9/k;->i(I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v0, v3, v12}, Lr9/e;->J0(II)V

    iget-wide v1, v13, Lna/a;->a:J

    invoke-virtual {v0, v1, v2}, Lr9/e;->K0(J)V

    return v12

    :cond_8
    iget-wide v8, v13, Lna/a;->b:J

    iget-wide v3, v13, Lna/a;->a:J

    iget-wide v10, v0, Lr9/e;->D1:J

    cmp-long v5, v8, v10

    if-nez v5, :cond_9

    invoke-virtual {v0, v1, v2}, Lr9/e;->I0(Li9/k;I)V

    goto :goto_2

    :cond_9
    iget-object v5, v0, Lr9/e;->K1:Lr9/m;

    if-eqz v5, :cond_a

    iget-object v11, v0, Li9/o;->m0:Landroid/media/MediaFormat;

    move-object/from16 v10, p14

    invoke-interface/range {v5 .. v11}, Lr9/m;->d(JJLu8/p;Landroid/media/MediaFormat;)V

    :cond_a
    invoke-virtual {v0, v1, v2, v8, v9}, Lr9/e;->E0(Li9/k;IJ)V

    :goto_2
    invoke-virtual {v0, v3, v4}, Lr9/e;->K0(J)V

    iput-wide v8, v0, Lr9/e;->D1:J

    return v12

    :cond_b
    iget-object v3, v0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    iget-object v5, v0, Lr9/e;->K1:Lr9/m;

    if-eqz v5, :cond_c

    iget-object v11, v0, Li9/o;->m0:Landroid/media/MediaFormat;

    move-object/from16 v10, p14

    invoke-interface/range {v5 .. v11}, Lr9/m;->d(JJLu8/p;Landroid/media/MediaFormat;)V

    :cond_c
    invoke-virtual {v0, v1, v2, v8, v9}, Lr9/e;->E0(Li9/k;IJ)V

    iget-wide v1, v13, Lna/a;->a:J

    invoke-virtual {v0, v1, v2}, Lr9/e;->K0(J)V

    return v12
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecVideoRenderer"

    return-object v0
.end method

.method public final k0()V
    .locals 1

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfw/h;->i()V

    :cond_0
    return-void
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Li9/o;->T0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l0()V
    .locals 1

    invoke-super {p0}, Li9/o;->l0()V

    iget-object v0, p0, Lr9/e;->k1:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr9/e;->O1:Z

    iput v0, p0, Lr9/e;->A1:I

    iput v0, p0, Lr9/e;->P1:I

    return-void
.end method

.method public final n()Z
    .locals 2

    invoke-super {p0}, Li9/o;->n()Z

    move-result v0

    iget-object v1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    const/4 v1, 0x0

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    invoke-virtual {v0, v1}, Lr9/n;->b(Z)Z

    move-result v0

    return v0

    :cond_0
    if-eqz v0, :cond_2

    iget-object v1, p0, Li9/o;->k0:Li9/k;

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lr9/e;->H1:Z

    if-eqz v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    iget-object v1, p0, Lr9/e;->h1:Lr9/n;

    invoke-virtual {v1, v0}, Lr9/n;->b(Z)Z

    move-result v0

    return v0
.end method

.method public final o()V
    .locals 6

    iget-object v0, p0, Lr9/e;->e1:Lxl/a;

    const/4 v1, 0x0

    iput-object v1, p0, Lr9/e;->F1:Lu8/y0;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Lr9/e;->M1:J

    iget-object v2, p0, Lr9/e;->o1:Lfw/h;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v2, Lfw/h;->e:Ljava/lang/Object;

    check-cast v2, Lr9/i;

    iget-object v2, v2, Lr9/i;->f:Lr9/c;

    iget-object v2, v2, Lr9/c;->a:Lr9/n;

    invoke-virtual {v2, v3}, Lr9/n;->d(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lr9/e;->h1:Lr9/n;

    invoke-virtual {v2, v3}, Lr9/n;->d(I)V

    :goto_0
    invoke-virtual {p0}, Lr9/e;->D0()V

    iput-boolean v3, p0, Lr9/e;->u1:Z

    iput-object v1, p0, Lr9/e;->J1:Lmo/h;

    :try_start_0
    invoke-super {p0}, Li9/o;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Li9/o;->X0:Lb9/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v1

    monitor-exit v1

    iget-object v2, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_1

    new-instance v3, Lr5/b;

    const/4 v4, 0x4

    invoke-direct {v3, v4, v0, v1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    sget-object v1, Lu8/y0;->d:Lu8/y0;

    invoke-virtual {v0, v1}, Lxl/a;->H(Lu8/y0;)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Li9/o;->X0:Lb9/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v2

    monitor-exit v2

    iget-object v3, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    if-eqz v3, :cond_2

    new-instance v4, Lr5/b;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v0, v2}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    sget-object v2, Lu8/y0;->d:Lu8/y0;

    invoke-virtual {v0, v2}, Lxl/a;->H(Lu8/y0;)V

    throw v1
.end method

.method public final p(ZZ)V
    .locals 6

    new-instance p1, Lb9/g;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lb9/g;-><init>(I)V

    iput-object p1, p0, Li9/o;->X0:Lb9/g;

    iget-object p1, p0, Lb9/f;->z:Lb9/i1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean p1, p1, Lb9/i1;->b:Z

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget v2, p0, Lr9/e;->I1:I

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    invoke-static {v2}, Lva3/g;->i(Z)V

    iget-boolean v2, p0, Lr9/e;->H1:Z

    if-eq v2, p1, :cond_2

    iput-boolean p1, p0, Lr9/e;->H1:Z

    invoke-virtual {p0}, Li9/o;->j0()V

    :cond_2
    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget-object v2, p0, Lr9/e;->e1:Lxl/a;

    iget-object v3, v2, Lxl/a;->x:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    if-eqz v3, :cond_3

    new-instance v4, Lr9/q;

    const/4 v5, 0x5

    invoke-direct {v4, v2, p1, v5}, Lr9/q;-><init>(Lxl/a;Ljava/lang/Object;I)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    iget-boolean p1, p0, Lr9/e;->p1:Z

    iget-object v2, p0, Lr9/e;->h1:Lr9/n;

    if-nez p1, :cond_7

    iget-object p1, p0, Lr9/e;->q1:Ljava/util/List;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-nez p1, :cond_6

    new-instance p1, Ld30/f0;

    iget-object v3, p0, Lr9/e;->c1:Landroid/content/Context;

    invoke-direct {p1, v3, v2}, Ld30/f0;-><init>(Landroid/content/Context;Lr9/n;)V

    iget-object v3, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, p1, Ld30/f0;->b:Ljava/lang/Object;

    iget-boolean v3, p1, Ld30/f0;->a:Z

    xor-int/2addr v3, v1

    invoke-static {v3}, Lva3/g;->i(Z)V

    iget-object v3, p1, Ld30/f0;->f:Ljava/lang/Object;

    check-cast v3, Lr9/h;

    if-nez v3, :cond_5

    iget-object v3, p1, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v3, Lr9/g;

    if-nez v3, :cond_4

    new-instance v3, Lr9/g;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p1, Ld30/f0;->e:Ljava/lang/Object;

    :cond_4
    new-instance v3, Lr9/h;

    iget-object v4, p1, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v4, Lr9/g;

    invoke-direct {v3, v4}, Lr9/h;-><init>(Lu8/x0;)V

    iput-object v3, p1, Ld30/f0;->f:Ljava/lang/Object;

    :cond_5
    new-instance v3, Lr9/i;

    invoke-direct {v3, p1}, Lr9/i;-><init>(Ld30/f0;)V

    iput-boolean v1, p1, Ld30/f0;->a:Z

    iput v1, v3, Lr9/i;->n:I

    iget-object p1, v3, Lr9/i;->d:Landroid/util/SparseArray;

    invoke-static {p1, v0}, Lx8/t;->i(Landroid/util/SparseArray;I)Z

    move-result v4

    xor-int/2addr v4, v1

    invoke-static {v4}, Lva3/g;->i(Z)V

    new-instance v4, Lfw/h;

    iget-object v5, v3, Lr9/i;->a:Landroid/content/Context;

    invoke-direct {v4, v3, v5}, Lfw/h;-><init>(Lr9/i;Landroid/content/Context;)V

    iget-object v3, v3, Lr9/i;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-object v4, p0, Lr9/e;->o1:Lfw/h;

    :cond_6
    iput-boolean v1, p0, Lr9/e;->p1:Z

    :cond_7
    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p1, :cond_c

    sget-object v0, Lds/r;->w:Lds/r;

    iput-object v0, p1, Lfw/h;->d:Ljava/lang/Object;

    iget-object v0, p0, Lr9/e;->K1:Lr9/m;

    if-eqz v0, :cond_8

    invoke-virtual {p1, v0}, Lfw/h;->h(Lr9/m;)V

    :cond_8
    iget-object p1, p0, Lr9/e;->r1:Landroid/view/Surface;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lr9/e;->t1:Lx8/o;

    sget-object v0, Lx8/o;->c:Lx8/o;

    invoke-virtual {p1, v0}, Lx8/o;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    iget-object v0, p0, Lr9/e;->r1:Landroid/view/Surface;

    iget-object v1, p0, Lr9/e;->t1:Lx8/o;

    invoke-virtual {p1, v0, v1}, Lfw/h;->d(Landroid/view/Surface;Lx8/o;)V

    :cond_9
    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    iget v0, p0, Lr9/e;->w1:I

    invoke-virtual {p1, v0}, Lfw/h;->c(I)V

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    iget v0, p0, Li9/o;->i0:F

    invoke-virtual {p1, v0}, Lfw/h;->e(F)V

    iget-object p1, p0, Lr9/e;->q1:Ljava/util/List;

    if-eqz p1, :cond_a

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    invoke-virtual {v0, p1}, Lfw/h;->g(Ljava/util/List;)V

    :cond_a
    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    iget-object v0, p1, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    iput p2, v0, Lr9/n;->e:I

    iget-object p2, p0, Li9/o;->f0:Lb9/h0;

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_b
    return-void

    :cond_c
    iget-object p1, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v2, Lr9/n;->l:Lx8/p;

    iput p2, v2, Lr9/n;->e:I

    return-void
.end method

.method public final p0(La9/e;)Z
    .locals 8

    invoke-virtual {p0}, Lb9/f;->k()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_9

    const/high16 v0, 0x20000000

    invoke-virtual {p1, v0}, La9/a;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-wide v2, p0, Lr9/e;->M1:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-wide v4, p1, La9/e;->G:J

    iget-object v0, p0, Li9/o;->Y0:Li9/n;

    iget-wide v6, v0, Li9/n;->c:J

    sub-long/2addr v4, v6

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x186a0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p1, v0}, La9/a;->f(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    iget-wide v2, p1, La9/e;->G:J

    iget-wide v4, p0, Lb9/f;->L:J

    cmp-long v0, v2, v4

    const/4 v2, 0x1

    if-gez v0, :cond_4

    move v0, v2

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    if-nez v0, :cond_5

    iget-boolean v3, p0, Lr9/e;->O1:Z

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    const/high16 v3, 0x10000000

    invoke-virtual {p1, v3}, La9/a;->f(I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_1

    :cond_6
    const/high16 v3, 0x4000000

    invoke-virtual {p1, v3}, La9/a;->f(I)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {p1}, La9/e;->o()V

    if-eqz v0, :cond_7

    iget-object p1, p0, Li9/o;->X0:Lb9/g;

    iget v0, p1, Lb9/g;->e:I

    add-int/2addr v0, v2

    iput v0, p1, Lb9/g;->e:I

    return v2

    :cond_7
    iget-boolean v0, p0, Lr9/e;->O1:Z

    if-eqz v0, :cond_8

    iget-wide v0, p1, La9/e;->G:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object v0, p0, Lr9/e;->k1:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lr9/e;->P1:I

    add-int/2addr p1, v2

    iput p1, p0, Lr9/e;->P1:I

    :cond_8
    return v2

    :cond_9
    :goto_1
    return v1
.end method

.method public final q(JZ)V
    .locals 6

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-nez p3, :cond_0

    invoke-virtual {v0, v1}, Lfw/h;->a(Z)V

    :cond_0
    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    iget-object v2, p0, Li9/o;->Y0:Li9/n;

    iget-wide v2, v2, Li9/n;->b:J

    iget-wide v4, p0, Lr9/e;->L1:J

    neg-long v4, v4

    invoke-virtual {v0, v2, v3, v4, v5}, Lfw/h;->f(JJ)V

    iput-boolean v1, p0, Lr9/e;->N1:Z

    :cond_1
    invoke-super {p0, p1, p2, p3}, Li9/o;->q(JZ)V

    iget-object p1, p0, Lr9/e;->o1:Lfw/h;

    iget-object p2, p0, Lr9/e;->h1:Lr9/n;

    if-nez p1, :cond_2

    iget-object p1, p2, Lr9/n;->b:Lmo/p;

    const-wide/16 v2, 0x0

    iput-wide v2, p1, Lmo/p;->k:J

    const-wide/16 v2, -0x1

    iput-wide v2, p1, Lmo/p;->n:J

    iput-wide v2, p1, Lmo/p;->l:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p2, Lr9/n;->h:J

    iput-wide v2, p2, Lr9/n;->f:J

    invoke-virtual {p2, v1}, Lr9/n;->d(I)V

    iput-wide v2, p2, Lr9/n;->i:J

    :cond_2
    const/4 p1, 0x0

    if-eqz p3, :cond_4

    iget-object p3, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p3, :cond_3

    iget-object p2, p3, Lfw/h;->e:Ljava/lang/Object;

    check-cast p2, Lr9/i;

    iget-object p2, p2, Lr9/i;->f:Lr9/c;

    iget-object p2, p2, Lr9/c;->a:Lr9/n;

    invoke-virtual {p2, p1}, Lr9/n;->c(Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2, p1}, Lr9/n;->c(Z)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Lr9/e;->D0()V

    iput p1, p0, Lr9/e;->z1:I

    return-void
.end method

.method public final q0(Li9/m;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lr9/e;->B0(Li9/m;)Z

    move-result p1

    return p1
.end method

.method public final r()V
    .locals 4

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lr9/e;->d1:Z

    if-eqz v1, :cond_2

    iget-object v0, v0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget v1, v0, Lr9/i;->k:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lr9/i;->i:Lx8/r;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v1, Lx8/r;->a:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_1
    iput-object v3, v0, Lr9/i;->j:Landroid/util/Pair;

    iput v2, v0, Lr9/i;->k:I

    :cond_2
    :goto_0
    return-void
.end method

.method public final s()V
    .locals 6

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p0}, Li9/o;->F()V

    invoke-virtual {p0}, Li9/o;->j0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v4, p0, Li9/o;->e0:Le10/k0;

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v3}, Le10/k0;->K(Lg9/d;)V

    :goto_0
    iput-object v3, p0, Li9/o;->e0:Le10/k0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v2, p0, Lr9/e;->p1:Z

    iput-wide v0, p0, Lr9/e;->L1:J

    iget-object v0, p0, Lr9/e;->s1:Lr9/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lr9/f;->release()V

    iput-object v3, p0, Lr9/e;->s1:Lr9/f;

    :cond_1
    return-void

    :catchall_0
    move-exception v4

    goto :goto_1

    :catchall_1
    move-exception v4

    :try_start_2
    iget-object v5, p0, Li9/o;->e0:Le10/k0;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v3}, Le10/k0;->K(Lg9/d;)V

    :cond_2
    iput-object v3, p0, Li9/o;->e0:Le10/k0;

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iput-boolean v2, p0, Lr9/e;->p1:Z

    iput-wide v0, p0, Lr9/e;->L1:J

    iget-object v0, p0, Lr9/e;->s1:Lr9/f;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lr9/f;->release()V

    iput-object v3, p0, Lr9/e;->s1:Lr9/f;

    :cond_3
    throw v4
.end method

.method public final s0(Li9/h;Lu8/p;)I
    .locals 13

    iget-object v0, p2, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v0}, Lu8/d0;->n(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p2, Lu8/p;->r:Lu8/l;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v3, p0, Lr9/e;->c1:Landroid/content/Context;

    invoke-static {v3, p1, p2, v0, v1}, Lr9/e;->y0(Landroid/content/Context;Li9/h;Lu8/p;ZZ)Ljava/util/List;

    move-result-object v4

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v3, p1, p2, v1, v1}, Lr9/e;->y0(Landroid/content/Context;Li9/h;Lu8/p;ZZ)Ljava/util/List;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {v2, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_3
    iget v5, p2, Lu8/p;->M:I

    const/4 v6, 0x2

    if-eqz v5, :cond_5

    if-ne v5, v6, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v6, v1, v1, v1}, Lb9/f;->f(IIII)I

    move-result p1

    return p1

    :cond_5
    :goto_1
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li9/m;

    invoke-virtual {v5, p2}, Li9/m;->e(Lu8/p;)Z

    move-result v7

    if-nez v7, :cond_7

    move v8, v2

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_7

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li9/m;

    invoke-virtual {v9, p2}, Li9/m;->e(Lu8/p;)Z

    move-result v10

    if-eqz v10, :cond_6

    move v4, v1

    move v7, v2

    move-object v5, v9

    goto :goto_3

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_7
    move v4, v2

    :goto_3
    const/4 v8, 0x4

    if-eqz v7, :cond_8

    move v9, v8

    goto :goto_4

    :cond_8
    const/4 v9, 0x3

    :goto_4
    invoke-virtual {v5, p2}, Li9/m;->f(Lu8/p;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x10

    goto :goto_5

    :cond_9
    const/16 v10, 0x8

    :goto_5
    iget-boolean v5, v5, Li9/m;->g:Z

    if-eqz v5, :cond_a

    const/16 v5, 0x40

    goto :goto_6

    :cond_a
    move v5, v1

    :goto_6
    if-eqz v4, :cond_b

    const/16 v4, 0x80

    goto :goto_7

    :cond_b
    move v4, v1

    :goto_7
    sget v11, Lx8/t;->a:I

    const/16 v12, 0x1a

    if-lt v11, v12, :cond_c

    const-string v11, "video/dolby-vision"

    iget-object v12, p2, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-static {v3}, Lug/m;->x(Landroid/content/Context;)Z

    move-result v11

    if-nez v11, :cond_c

    const/16 v4, 0x100

    :cond_c
    if-eqz v7, :cond_d

    invoke-static {v3, p1, p2, v0, v2}, Lr9/e;->y0(Landroid/content/Context;Li9/h;Lu8/p;ZZ)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    sget-object v0, Li9/s;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lhn/p;

    invoke-direct {p1, p2, v6}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lea2/l;

    invoke-direct {v2, p1, v8}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/m;

    invoke-virtual {p1, p2}, Li9/m;->e(Lu8/p;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1, p2}, Li9/m;->f(Lu8/p;)Z

    move-result p1

    if-eqz p1, :cond_d

    const/16 v1, 0x20

    :cond_d
    or-int p1, v9, v10

    or-int/2addr p1, v1

    or-int/2addr p1, v5

    or-int/2addr p1, v4

    return p1
.end method

.method public final t()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lr9/e;->y1:I

    iget-object v1, p0, Lb9/f;->G:Lx8/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iput-wide v1, p0, Lr9/e;->x1:J

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lr9/e;->B1:J

    iput v0, p0, Lr9/e;->C1:I

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    invoke-virtual {v0}, Lr9/n;->e()V

    return-void

    :cond_0
    iget-object v0, p0, Lr9/e;->h1:Lr9/n;

    invoke-virtual {v0}, Lr9/n;->e()V

    return-void
.end method

.method public final u()V
    .locals 6

    invoke-virtual {p0}, Lr9/e;->C0()V

    iget v0, p0, Lr9/e;->C1:I

    if-eqz v0, :cond_1

    iget-wide v1, p0, Lr9/e;->B1:J

    iget-object v3, p0, Lr9/e;->e1:Lxl/a;

    iget-object v4, v3, Lxl/a;->x:Ljava/lang/Object;

    check-cast v4, Landroid/os/Handler;

    if-eqz v4, :cond_0

    new-instance v5, Lr9/q;

    invoke-direct {v5, v3, v1, v2, v0}, Lr9/q;-><init>(Lxl/a;JI)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lr9/e;->B1:J

    const/4 v0, 0x0

    iput v0, p0, Lr9/e;->C1:I

    :cond_1
    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    iget-object v0, v0, Lr9/c;->a:Lr9/n;

    invoke-virtual {v0}, Lr9/n;->f()V

    return-void

    :cond_2
    iget-object v0, p0, Lr9/e;->h1:Lr9/n;

    invoke-virtual {v0}, Lr9/n;->f()V

    return-void
.end method

.method public final v([Lu8/p;JJLl9/c0;)V
    .locals 2

    invoke-super/range {p0 .. p6}, Li9/o;->v([Lu8/p;JJLl9/c0;)V

    move-object p1, p0

    iget-wide p4, p1, Lr9/e;->L1:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p4, p4, v0

    if-nez p4, :cond_0

    iput-wide p2, p1, Lr9/e;->L1:J

    :cond_0
    iget-object p2, p1, Lb9/f;->P:Lu8/o0;

    invoke-virtual {p2}, Lu8/o0;->p()Z

    move-result p3

    if-eqz p3, :cond_1

    iput-wide v0, p1, Lr9/e;->M1:J

    return-void

    :cond_1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p6, Ll9/c0;->a:Ljava/lang/Object;

    new-instance p4, Lu8/m0;

    invoke-direct {p4}, Lu8/m0;-><init>()V

    invoke-virtual {p2, p3, p4}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    move-result-object p2

    iget-wide p2, p2, Lu8/m0;->d:J

    iput-wide p2, p1, Lr9/e;->M1:J

    return-void
.end method

.method public final x(JJ)V
    .locals 2

    iget-object v0, p0, Lr9/e;->o1:Lfw/h;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, v0, Lfw/h;->e:Ljava/lang/Object;

    check-cast v0, Lr9/i;

    iget-object v0, v0, Lr9/i;->f:Lr9/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v1, v0, Lr9/c;->c:Lr9/p;

    invoke-virtual {v1, p1, p2, p3, p4}, Lr9/p;->a(JJ)V
    :try_end_1
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    new-instance p2, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    iget-object p3, v0, Lr9/c;->e:Lu8/p;

    invoke-direct {p2, p1, p3}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Exception;Lu8/p;)V

    throw p2
    :try_end_2
    .catch Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    const/16 p2, 0x1b59

    const/4 p3, 0x0

    iget-object p4, p1, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;->w:Lu8/p;

    invoke-virtual {p0, p1, p4, p3, p2}, Lb9/f;->g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    move-result-object p1

    throw p1

    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Li9/o;->x(JJ)V

    return-void
.end method

.method public final z(FF)V
    .locals 0

    invoke-super {p0, p1, p2}, Li9/o;->z(FF)V

    iget-object p2, p0, Lr9/e;->o1:Lfw/h;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lfw/h;->e(F)V

    return-void

    :cond_0
    iget-object p2, p0, Lr9/e;->h1:Lr9/n;

    invoke-virtual {p2, p1}, Lr9/n;->g(F)V

    return-void
.end method
