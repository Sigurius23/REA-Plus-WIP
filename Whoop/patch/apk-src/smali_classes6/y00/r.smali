.class public final Ly00/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly00/s;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ly00/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Z

.field public final F:Ljava/lang/String;

.field public final G:Ly00/x2;

.field public final H:Ljava/lang/Boolean;

.field public final I:Ljava/lang/String;

.field public final J:Ly00/u5;

.field public final K:Ly00/a6;

.field public final L:Ly00/n;

.field public final M:Ljava/lang/String;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ly00/d5;

.field public z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly00/k;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ly00/k;-><init>(I)V

    sput-object v0, Ly00/r;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/l5;Ly00/a6;Ly00/n;Ljava/lang/String;I)V
    .locals 17

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    if-eqz v6, :cond_7

    .line 15
    iget-object v1, v6, Ly00/d5;->w:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object v1, v2

    :goto_7
    move-object v12, v1

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    move-object v14, v2

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    move-object v15, v2

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    move-object/from16 v16, v2

    :goto_c
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    goto :goto_d

    :cond_c
    move-object/from16 v16, p13

    goto :goto_c

    .line 16
    :goto_d
    invoke-direct/range {v3 .. v16}, Ly00/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/u5;Ly00/a6;Ly00/n;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/u5;Ly00/a6;Ly00/n;Ljava/lang/String;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly00/r;->w:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ly00/r;->x:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Ly00/r;->y:Ly00/d5;

    .line 5
    iput-object p4, p0, Ly00/r;->z:Ljava/lang/String;

    .line 6
    iput-boolean p5, p0, Ly00/r;->E:Z

    .line 7
    iput-object p6, p0, Ly00/r;->F:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Ly00/r;->G:Ly00/x2;

    .line 9
    iput-object p8, p0, Ly00/r;->H:Ljava/lang/Boolean;

    .line 10
    iput-object p9, p0, Ly00/r;->I:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Ly00/r;->J:Ly00/u5;

    .line 12
    iput-object p11, p0, Ly00/r;->K:Ly00/a6;

    .line 13
    iput-object p12, p0, Ly00/r;->L:Ly00/n;

    .line 14
    iput-object p13, p0, Ly00/r;->M:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ly00/r;
    .locals 15

    iget-object v4, p0, Ly00/r;->z:Ljava/lang/String;

    const-string v0, "clientSecret"

    iget-object v1, p0, Ly00/r;->w:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly00/r;

    const/4 v10, 0x0

    const/16 v14, 0x200

    iget-object v2, p0, Ly00/r;->x:Ljava/lang/String;

    iget-object v3, p0, Ly00/r;->y:Ly00/d5;

    const/4 v5, 0x1

    iget-object v6, p0, Ly00/r;->F:Ljava/lang/String;

    iget-object v7, p0, Ly00/r;->G:Ly00/x2;

    iget-object v8, p0, Ly00/r;->H:Ljava/lang/Boolean;

    iget-object v9, p0, Ly00/r;->I:Ljava/lang/String;

    iget-object v11, p0, Ly00/r;->K:Ly00/a6;

    iget-object v12, p0, Ly00/r;->L:Ly00/n;

    iget-object v13, p0, Ly00/r;->M:Ljava/lang/String;

    invoke-direct/range {v0 .. v14}, Ly00/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/d5;Ljava/lang/String;ZLjava/lang/String;Ly00/x2;Ljava/lang/Boolean;Ljava/lang/String;Ly00/l5;Ly00/a6;Ly00/n;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final c0()Ljava/util/Map;
    .locals 8

    new-instance v0, Ll83/k;

    const-string v1, "client_secret"

    iget-object v2, p0, Ly00/r;->w:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v1, p0, Ly00/r;->E:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "use_stripe_sdk"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Ly00/r;->z:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v3, "return_url"

    invoke-static {v3, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    sget-object v3, Lm83/z;->w:Lm83/z;

    if-nez v1, :cond_1

    move-object v1, v3

    :cond_1
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/r;->F:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v4, "mandate"

    invoke-static {v4, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    if-nez v4, :cond_3

    move-object v4, v3

    :cond_3
    invoke-static {v0, v4}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v4, p0, Ly00/r;->y:Ly00/d5;

    iget-object v5, p0, Ly00/r;->G:Ly00/x2;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ly00/x2;->c0()Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_5

    iget-boolean v5, v4, Ly00/d5;->x:Z

    const/4 v6, 0x1

    if-ne v5, v6, :cond_5

    if-nez v1, :cond_5

    new-instance v1, Ll83/k;

    const-string v5, "type"

    const-string v6, "online"

    invoke-direct {v1, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "infer_from_client"

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v5}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v7}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    const-string v5, "customer_acceptance"

    invoke-static {v5, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_6

    const-string v5, "mandate_data"

    invoke-static {v5, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_3

    :cond_6
    move-object v1, v2

    :goto_3
    if-nez v1, :cond_7

    move-object v1, v3

    :cond_7
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/r;->H:Ljava/lang/Boolean;

    if-eqz v1, :cond_8

    const-string v5, "set_as_default_payment_method"

    invoke-static {v1, v5}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_4

    :cond_8
    move-object v1, v2

    :goto_4
    if-nez v1, :cond_9

    move-object v1, v3

    :cond_9
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/r;->K:Ly00/a6;

    if-eqz v1, :cond_a

    const-string v5, "radar_options"

    invoke-virtual {v1}, Ly00/a6;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v5, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_5

    :cond_a
    move-object v1, v2

    :goto_5
    if-nez v1, :cond_b

    move-object v1, v3

    :cond_b
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    if-eqz v4, :cond_c

    const-string v1, "payment_method_data"

    invoke-virtual {v4}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object v4

    invoke-static {v1, v4}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    goto :goto_6

    :cond_c
    iget-object v1, p0, Ly00/r;->x:Ljava/lang/String;

    if-eqz v1, :cond_d

    const-string v4, "payment_method"

    invoke-static {v4, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_6

    :cond_d
    iget-object v1, p0, Ly00/r;->M:Ljava/lang/String;

    if-eqz v1, :cond_e

    const-string v4, "confirmation_token"

    invoke-static {v4, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_6

    :cond_e
    move-object v1, v3

    :goto_6
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Ly00/r;->L:Ly00/n;

    if-eqz v1, :cond_f

    const-string v2, "client_attribution_metadata"

    invoke-virtual {v1}, Ly00/n;->c0()Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    :cond_f
    if-nez v2, :cond_10

    goto :goto_7

    :cond_10
    move-object v3, v2

    :goto_7
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
    instance-of v1, p1, Ly00/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly00/r;

    iget-object v1, p0, Ly00/r;->w:Ljava/lang/String;

    iget-object v3, p1, Ly00/r;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly00/r;->x:Ljava/lang/String;

    iget-object v3, p1, Ly00/r;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly00/r;->y:Ly00/d5;

    iget-object v3, p1, Ly00/r;->y:Ly00/d5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly00/r;->z:Ljava/lang/String;

    iget-object v3, p1, Ly00/r;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Ly00/r;->E:Z

    iget-boolean v3, p1, Ly00/r;->E:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly00/r;->F:Ljava/lang/String;

    iget-object v3, p1, Ly00/r;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ly00/r;->G:Ly00/x2;

    iget-object v3, p1, Ly00/r;->G:Ly00/x2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ly00/r;->H:Ljava/lang/Boolean;

    iget-object v3, p1, Ly00/r;->H:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ly00/r;->I:Ljava/lang/String;

    iget-object v3, p1, Ly00/r;->I:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Ly00/r;->J:Ly00/u5;

    iget-object v3, p1, Ly00/r;->J:Ly00/u5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ly00/r;->K:Ly00/a6;

    iget-object v3, p1, Ly00/r;->K:Ly00/a6;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Ly00/r;->L:Ly00/n;

    iget-object v3, p1, Ly00/r;->L:Ly00/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Ly00/r;->M:Ljava/lang/String;

    iget-object p1, p1, Ly00/r;->M:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final synthetic getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/r;->w:Ljava/lang/String;

    return-object v0
.end method

.method public final getReturnUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly00/r;->z:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ly00/r;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    const/4 v2, 0x0

    iget-object v3, p0, Ly00/r;->x:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->y:Ly00/d5;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ly00/d5;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->z:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v3, p0, Ly00/r;->E:Z

    invoke-static {v0, v1, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Ly00/r;->F:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->G:Ly00/x2;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    iget-object v3, v3, Ly00/x2;->w:Ly00/w2;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->H:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->I:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->J:Ly00/u5;

    if-nez v3, :cond_7

    move v3, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->K:Ly00/a6;

    if-nez v3, :cond_8

    move v3, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ly00/a6;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Ly00/r;->L:Ly00/n;

    if-nez v3, :cond_9

    move v3, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ly00/n;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Ly00/r;->M:Ljava/lang/String;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Ly00/r;->z:Ljava/lang/String;

    const-string v1, ", paymentMethodId="

    const-string v2, ", paymentMethodCreateParams="

    const-string v3, "ConfirmSetupIntentParams(clientSecret="

    iget-object v4, p0, Ly00/r;->w:Ljava/lang/String;

    iget-object v5, p0, Ly00/r;->x:Ljava/lang/String;

    invoke-static {v3, v4, v1, v5, v2}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ly00/r;->y:Ly00/d5;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", returnUrl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", useStripeSdk="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mandateId="

    const-string v2, ", mandateData="

    iget-boolean v3, p0, Ly00/r;->E:Z

    iget-object v4, p0, Ly00/r;->F:Ljava/lang/String;

    invoke-static {v1, v3, v0, v4, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/r;->G:Ly00/x2;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", setAsDefaultPaymentMethod="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/r;->H:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodCode="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/r;->I:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodOptions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/r;->J:Ly00/u5;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", radarOptions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/r;->K:Ly00/a6;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", clientAttributionMetadata="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ly00/r;->L:Ly00/n;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", confirmationTokenId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    iget-object v2, p0, Ly00/r;->M:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ly00/r;->z:Ljava/lang/String;

    return-void
.end method

.method public final bridge synthetic w0()Ly00/s;
    .locals 1

    invoke-virtual {p0}, Ly00/r;->b()Ly00/r;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly00/r;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Ly00/r;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Ly00/r;->y:Ly00/d5;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/d5;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v2, p0, Ly00/r;->z:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v2, p0, Ly00/r;->E:Z

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v2, p0, Ly00/r;->F:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/r;->G:Ly00/x2;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/x2;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v2, p0, Ly00/r;->H:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-static {p1, v0, v2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_2
    iget-object v2, p0, Ly00/r;->I:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Ly00/r;->J:Ly00/u5;

    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v2, p0, Ly00/r;->K:Ly00/a6;

    if-nez v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/a6;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v2, p0, Ly00/r;->L:Ly00/n;

    if-nez v2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, p1, p2}, Ly00/n;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-object p2, p0, Ly00/r;->M:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
