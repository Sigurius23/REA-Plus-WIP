.class public final Ly00/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/s;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/q;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public final G:Ljava/lang/Boolean;

.field public final H:Z

.field public final I:Ly00/u5;

.field public final J:Ljava/lang/String;

.field public final K:Ly00/x2;

.field public final L:Ly00/o;

.field public final M:Ly00/p;

.field public final N:Ljava/lang/String;

.field public final O:Ljava/lang/Boolean;

.field public final P:Ljava/lang/String;

.field public final Q:Ly00/a6;

.field public final R:Ly00/n;

.field public final S:Ljava/lang/String;

.field public final w:Ly00/d5;

.field public final x:Ljava/lang/String;

.field public final y:Ly00/x6;

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ly00/k;-><init>(I)V

    sput-object v0, Ly00/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ly00/d5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ly00/u5;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;I)V
    .locals 23

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p4

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    :goto_3
    move v11, v1

    goto :goto_4

    :cond_3
    const/4 v1, 0x1

    goto :goto_3

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_5

    :cond_4
    move-object/from16 v12, p5

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_5

    move-object v14, v2

    goto :goto_6

    :cond_5
    move-object/from16 v14, p6

    :goto_6
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object v15, v2

    goto :goto_7

    :cond_6
    move-object/from16 v15, p7

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object/from16 v16, v2

    goto :goto_8

    :cond_7
    move-object/from16 v16, p8

    :goto_8
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_8

    move-object/from16 v18, v2

    goto :goto_9

    :cond_8
    move-object/from16 v18, p9

    :goto_9
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    if-eqz v4, :cond_9

    .line 21
    iget-object v1, v4, Ly00/d5;->w:Ljava/lang/String;

    goto :goto_a

    :cond_9
    move-object v1, v2

    :goto_a
    move-object/from16 v19, v1

    goto :goto_b

    :cond_a
    move-object/from16 v19, p10

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v20, v2

    goto :goto_c

    :cond_b
    move-object/from16 v20, p11

    :goto_c
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v21, v2

    goto :goto_d

    :cond_c
    move-object/from16 v21, p12

    :goto_d
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move-object/from16 v22, v2

    goto :goto_e

    :cond_d
    move-object/from16 v22, p13

    :goto_e
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    move-object/from16 v3, p0

    move-object/from16 v8, p3

    .line 22
    invoke-direct/range {v3 .. v22}, Ly00/q;-><init>(Ly00/d5;Ljava/lang/String;Ly00/x6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLy00/u5;Ljava/lang/String;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ly00/d5;Ljava/lang/String;Ly00/x6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLy00/u5;Ljava/lang/String;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly00/q;->w:Ly00/d5;

    .line 3
    iput-object p2, p0, Ly00/q;->x:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Ly00/q;->y:Ly00/x6;

    .line 5
    iput-object p4, p0, Ly00/q;->z:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Ly00/q;->E:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Ly00/q;->F:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Ly00/q;->G:Ljava/lang/Boolean;

    .line 9
    iput-boolean p8, p0, Ly00/q;->H:Z

    .line 10
    iput-object p9, p0, Ly00/q;->I:Ly00/u5;

    .line 11
    iput-object p10, p0, Ly00/q;->J:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Ly00/q;->K:Ly00/x2;

    .line 13
    iput-object p12, p0, Ly00/q;->L:Ly00/o;

    .line 14
    iput-object p13, p0, Ly00/q;->M:Ly00/p;

    .line 15
    iput-object p14, p0, Ly00/q;->N:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Ly00/q;->O:Ljava/lang/Boolean;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Ly00/q;->P:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Ly00/q;->Q:Ly00/a6;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Ly00/q;->R:Ly00/n;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Ly00/q;->S:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ly00/q;
    .locals 21

    move-object/from16 v0, p0

    iget-object v7, v0, Ly00/q;->F:Ljava/lang/String;

    const-string v1, "clientSecret"

    iget-object v6, v0, Ly00/q;->E:Ljava/lang/String;

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly00/q;

    iget-object v2, v0, Ly00/q;->w:Ly00/d5;

    iget-object v3, v0, Ly00/q;->x:Ljava/lang/String;

    iget-object v4, v0, Ly00/q;->y:Ly00/x6;

    iget-object v5, v0, Ly00/q;->z:Ljava/lang/String;

    iget-object v8, v0, Ly00/q;->G:Ljava/lang/Boolean;

    iget-object v10, v0, Ly00/q;->I:Ly00/u5;

    iget-object v11, v0, Ly00/q;->J:Ljava/lang/String;

    iget-object v12, v0, Ly00/q;->K:Ly00/x2;

    iget-object v13, v0, Ly00/q;->L:Ly00/o;

    iget-object v14, v0, Ly00/q;->M:Ly00/p;

    iget-object v15, v0, Ly00/q;->N:Ljava/lang/String;

    iget-object v9, v0, Ly00/q;->O:Ljava/lang/Boolean;

    move-object/from16 v17, v1

    iget-object v1, v0, Ly00/q;->P:Ljava/lang/String;

    move-object/from16 v18, v1

    iget-object v1, v0, Ly00/q;->Q:Ly00/a6;

    move-object/from16 v19, v1

    iget-object v1, v0, Ly00/q;->R:Ly00/n;

    move-object/from16 v20, v1

    iget-object v1, v0, Ly00/q;->S:Ljava/lang/String;

    move-object/from16 v16, v20

    move-object/from16 v20, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v16

    move-object/from16 v16, v9

    const/4 v9, 0x1

    invoke-direct/range {v1 .. v20}, Ly00/q;-><init>(Ly00/d5;Ljava/lang/String;Ly00/x6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLy00/u5;Ljava/lang/String;Ly00/x2;Ly00/o;Ly00/p;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ly00/a6;Ly00/n;Ljava/lang/String;)V

    return-object v1
.end method

.method public final c0()Ljava/util/Map;
    .locals 8

    new-instance v0, Ll83/k;

    const-string v1, "client_secret"

    iget-object v2, p0, Ly00/q;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Ly00/q;->H:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "use_stripe_sdk"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/q;->G:Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    const-string v3, "save_payment_method"

    invoke-static {v2, v3}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    sget-object v3, Lm83/z;->w:Lm83/z;

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->J:Ljava/lang/String;

    if-eqz v2, :cond_2

    const-string v4, "mandate"

    invoke-static {v4, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v1

    :goto_1
    if-nez v4, :cond_3

    move-object v4, v3

    :cond_3
    invoke-static {v0, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v4, p0, Ly00/q;->w:Ly00/d5;

    iget-object v5, p0, Ly00/q;->K:Ly00/x2;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ly00/x2;->c0()Ljava/util/Map;

    move-result-object v2

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_5

    iget-boolean v5, v4, Ly00/d5;->x:Z

    const/4 v6, 0x1

    if-ne v5, v6, :cond_5

    if-nez v2, :cond_5

    new-instance v2, Ll83/k;

    const-string v5, "type"

    const-string v6, "online"

    invoke-direct {v2, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "infer_from_client"

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v5}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v7}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    const-string v5, "customer_acceptance"

    invoke-static {v5, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_2

    :cond_5
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_6

    const-string v5, "mandate_data"

    invoke-static {v5, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_3

    :cond_6
    move-object v2, v1

    :goto_3
    if-nez v2, :cond_7

    move-object v2, v3

    :cond_7
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->F:Ljava/lang/String;

    if-eqz v2, :cond_8

    const-string v5, "return_url"

    invoke-static {v5, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_4

    :cond_8
    move-object v2, v1

    :goto_4
    if-nez v2, :cond_9

    move-object v2, v3

    :cond_9
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->I:Ly00/u5;

    if-eqz v2, :cond_a

    const-string v5, "payment_method_options"

    invoke-virtual {v2}, Ly00/u5;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v5, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_5

    :cond_a
    move-object v2, v1

    :goto_5
    if-nez v2, :cond_b

    move-object v2, v3

    :cond_b
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->L:Ly00/o;

    if-eqz v2, :cond_c

    const-string v5, "setup_future_usage"

    iget-object v2, v2, Ly00/o;->w:Ljava/lang/String;

    invoke-static {v5, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_6

    :cond_c
    move-object v2, v1

    :goto_6
    if-nez v2, :cond_d

    move-object v2, v3

    :cond_d
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->O:Ljava/lang/Boolean;

    if-eqz v2, :cond_e

    const-string v5, "set_as_default_payment_method"

    invoke-static {v2, v5}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_7

    :cond_e
    move-object v2, v1

    :goto_7
    if-nez v2, :cond_f

    move-object v2, v3

    :cond_f
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->M:Ly00/p;

    if-eqz v2, :cond_10

    const-string v5, "shipping"

    invoke-virtual {v2}, Ly00/p;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v5, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_8

    :cond_10
    move-object v2, v1

    :goto_8
    if-nez v2, :cond_11

    move-object v2, v3

    :cond_11
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->Q:Ly00/a6;

    if-eqz v2, :cond_12

    const-string v5, "radar_options"

    invoke-virtual {v2}, Ly00/a6;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v5, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_9

    :cond_12
    move-object v2, v1

    :goto_9
    if-nez v2, :cond_13

    move-object v2, v3

    :cond_13
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    if-eqz v4, :cond_14

    const-string v2, "payment_method_data"

    invoke-virtual {v4}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v4

    invoke-static {v2, v4}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_a

    :cond_14
    iget-object v2, p0, Ly00/q;->x:Ljava/lang/String;

    if-eqz v2, :cond_15

    const-string v4, "payment_method"

    invoke-static {v4, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_a

    :cond_15
    iget-object v2, p0, Ly00/q;->S:Ljava/lang/String;

    if-eqz v2, :cond_16

    const-string v4, "confirmation_token"

    invoke-static {v4, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_a

    :cond_16
    iget-object v2, p0, Ly00/q;->y:Ly00/x6;

    if-eqz v2, :cond_17

    const-string v4, "source_data"

    invoke-virtual {v2}, Ly00/x6;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v4, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    goto :goto_a

    :cond_17
    iget-object v2, p0, Ly00/q;->z:Ljava/lang/String;

    if-eqz v2, :cond_18

    const-string v4, "source"

    invoke-static {v4, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_a

    :cond_18
    move-object v2, v3

    :goto_a
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->N:Ljava/lang/String;

    if-eqz v2, :cond_19

    const-string v4, "receipt_email"

    invoke-static {v4, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_b

    :cond_19
    move-object v2, v1

    :goto_b
    if-nez v2, :cond_1a

    move-object v2, v3

    :cond_1a
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v2, p0, Ly00/q;->R:Ly00/n;

    if-eqz v2, :cond_1b

    const-string v1, "client_attribution_metadata"

    invoke-virtual {v2}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    :cond_1b
    if-nez v1, :cond_1c

    goto :goto_c

    :cond_1c
    move-object v3, v1

    :goto_c
    invoke-static {v0, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly00/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/q;

    iget-object v1, p0, Ly00/q;->w:Ly00/d5;

    iget-object v3, p1, Ly00/q;->w:Ly00/d5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/q;->x:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/q;->y:Ly00/x6;

    iget-object v3, p1, Ly00/q;->y:Ly00/x6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/q;->z:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ly00/q;->E:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/q;->F:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/q;->G:Ljava/lang/Boolean;

    iget-object v3, p1, Ly00/q;->G:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Ly00/q;->H:Z

    iget-boolean v3, p1, Ly00/q;->H:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/q;->I:Ly00/u5;

    iget-object v3, p1, Ly00/q;->I:Ly00/u5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ly00/q;->J:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->J:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ly00/q;->K:Ly00/x2;

    iget-object v3, p1, Ly00/q;->K:Ly00/x2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ly00/q;->L:Ly00/o;

    iget-object v3, p1, Ly00/q;->L:Ly00/o;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ly00/q;->M:Ly00/p;

    iget-object v3, p1, Ly00/q;->M:Ly00/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Ly00/q;->N:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->N:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Ly00/q;->O:Ljava/lang/Boolean;

    iget-object v3, p1, Ly00/q;->O:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Ly00/q;->P:Ljava/lang/String;

    iget-object v3, p1, Ly00/q;->P:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Ly00/q;->Q:Ly00/a6;

    iget-object v3, p1, Ly00/q;->Q:Ly00/a6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Ly00/q;->R:Ly00/n;

    iget-object v3, p1, Ly00/q;->R:Ly00/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Ly00/q;->S:Ljava/lang/String;

    iget-object p1, p1, Ly00/q;->S:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/q;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final getReturnUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/q;->F:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Ly00/q;->w:Ly00/d5;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ly00/d5;->hashCode()I

    move-result v1

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->x:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->y:Ly00/x6;

    if-nez v3, :cond_2

    move v3, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ly00/x6;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->z:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->E:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v1

    iget-object v3, p0, Ly00/q;->F:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->G:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-boolean v3, p0, Ly00/q;->H:Z

    invoke-static {v1, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v1

    iget-object v3, p0, Ly00/q;->I:Ly00/u5;

    if-nez v3, :cond_6

    move v3, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->J:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->K:Ly00/x2;

    if-nez v3, :cond_8

    move v3, v0

    goto :goto_8

    :cond_8
    iget-object v3, v3, Ly00/x2;->w:Ly00/w2;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->L:Ly00/o;

    if-nez v3, :cond_9

    move v3, v0

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->M:Ly00/p;

    if-nez v3, :cond_a

    move v3, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ly00/p;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->N:Ljava/lang/String;

    if-nez v3, :cond_b

    move v3, v0

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->O:Ljava/lang/Boolean;

    if-nez v3, :cond_c

    move v3, v0

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->P:Ljava/lang/String;

    if-nez v3, :cond_d

    move v3, v0

    goto :goto_d

    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_d
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->Q:Ly00/a6;

    if-nez v3, :cond_e

    move v3, v0

    goto :goto_e

    :cond_e
    invoke-virtual {v3}, Ly00/a6;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v3, p0, Ly00/q;->R:Ly00/n;

    if-nez v3, :cond_f

    move v3, v0

    goto :goto_f

    :cond_f
    invoke-virtual {v3}, Ly00/n;->hashCode()I

    move-result v3

    :goto_f
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    iget-object v2, p0, Ly00/q;->S:Ljava/lang/String;

    if-nez v2, :cond_10

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_10
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ly00/q;->F:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ConfirmPaymentIntentParams(paymentMethodCreateParams="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->w:Ly00/d5;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", paymentMethodId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ly00/q;->x:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", sourceParams="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ly00/q;->y:Ly00/x6;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", sourceId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ly00/q;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", clientSecret="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", returnUrl="

    const-string v3, ", savePaymentMethod="

    iget-object v4, p0, Ly00/q;->E:Ljava/lang/String;

    invoke-static {v1, v4, v2, v0, v3}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/q;->G:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useStripeSdk="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ly00/q;->H:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodOptions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->I:Ly00/u5;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mandateId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->J:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mandateData="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->K:Ly00/x2;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", setupFutureUsage="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->L:Ly00/o;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shipping="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->M:Ly00/p;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", receiptEmail="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->N:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", setAsDefaultPaymentMethod="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodCode="

    const-string v2, ", radarOptions="

    iget-object v3, p0, Ly00/q;->O:Ljava/lang/Boolean;

    iget-object v4, p0, Ly00/q;->P:Ljava/lang/String;

    invoke-static {v3, v0, v4, v2, v1}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v0, p0, Ly00/q;->Q:Ly00/a6;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", clientAttributionMetadata="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/q;->R:Ly00/n;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmationTokenId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    iget-object v2, p0, Ly00/q;->S:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ly00/q;->F:Ljava/lang/String;

    return-void
.end method

.method public final bridge synthetic w0()Ly00/s;
    .locals 1

    invoke-virtual {p0}, Ly00/q;->b()Ly00/q;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/q;->w:Ly00/d5;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/d5;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v2, p0, Ly00/q;->x:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->y:Ly00/x6;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/x6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Ly00/q;->z:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->E:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->F:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->G:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-static {p1, v0, v2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_2
    iget-boolean v2, p0, Ly00/q;->H:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Ly00/q;->I:Ly00/u5;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v2, p0, Ly00/q;->J:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->K:Ly00/x2;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/x2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Ly00/q;->L:Ly00/o;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    iget-object v2, p0, Ly00/q;->M:Ly00/p;

    if-nez v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/p;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v2, p0, Ly00/q;->N:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->O:Ljava/lang/Boolean;

    if-nez v2, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-static {p1, v0, v2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_6
    iget-object v2, p0, Ly00/q;->P:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/q;->Q:Ly00/a6;

    if-nez v2, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/a6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_7
    iget-object v2, p0, Ly00/q;->R:Ly00/n;

    if-nez v2, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/n;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_8
    iget-object p2, p0, Ly00/q;->S:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
