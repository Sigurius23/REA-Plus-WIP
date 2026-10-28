.class public final Ldd/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldd/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ldg/a;Ljava/lang/Object;)Lvf/b;
    .locals 20

    move-object/from16 v0, p2

    check-cast v0, Lud/a;

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "input"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvf/b;

    invoke-direct {v1}, Lvf/b;-><init>()V

    sget-object v2, Lmf/r;->x:Lmf/r;

    iput-object v2, v1, Lvf/b;->w:Lmf/r;

    iget-object v2, v1, Lvf/b;->x:Lcg/j;

    iget-object v2, v2, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v2, Lig/d;

    new-instance v3, Lyf/k;

    invoke-direct {v3}, Lyf/k;-><init>()V

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lig/d;-><init>(Lyf/k;Ljava/lang/String;)V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->e:Lhg/l;

    new-instance v6, Lig/c;

    const-string v7, "DurationSeconds"

    invoke-direct {v6, v7}, Lig/c;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x1

    new-array v8, v7, [Lhg/d;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v5, v6, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v6, Lhg/l;->i:Lhg/l;

    new-instance v8, Lig/c;

    const-string v10, "ExternalId"

    invoke-direct {v8, v10}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v10, v7, [Lhg/d;

    aput-object v8, v10, v9

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v5, v6, v8, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v10, Lig/c;

    const-string v11, "Policy"

    invoke-direct {v10, v11}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v11, v7, [Lhg/d;

    aput-object v10, v11, v9

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v8, v6, v10, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    sget-object v11, Lhg/l;->f:Lhg/l;

    new-instance v12, Lig/c;

    const-string v13, "PolicyArns"

    invoke-direct {v12, v13}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v13, v7, [Lhg/d;

    aput-object v12, v13, v9

    invoke-static {v13}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    invoke-direct {v10, v11, v12, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v12, Lhg/i;

    new-instance v13, Lig/c;

    const-string v14, "ProvidedContexts"

    invoke-direct {v13, v14}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v14, v7, [Lhg/d;

    aput-object v13, v14, v9

    invoke-static {v14}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v13

    invoke-direct {v12, v11, v13, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v13, Lhg/i;

    new-instance v14, Lig/c;

    const-string v15, "RoleArn"

    invoke-direct {v14, v15}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v15, v7, [Lhg/d;

    aput-object v14, v15, v9

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    invoke-direct {v13, v6, v14, v9}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v14, Lhg/i;

    new-instance v15, Lig/c;

    move/from16 p1, v9

    const-string v9, "RoleSessionName"

    invoke-direct {v15, v9}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v9, v7, [Lhg/d;

    aput-object v15, v9, p1

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    move/from16 v15, p1

    invoke-direct {v14, v6, v9, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v15, Lig/c;

    move-object/from16 p2, v3

    const-string v3, "SerialNumber"

    invoke-direct {v15, v3}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v3, v7, [Lhg/d;

    aput-object v15, v3, p1

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    move/from16 v15, p1

    invoke-direct {v9, v6, v3, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lhg/i;

    new-instance v15, Lig/c;

    move-object/from16 v16, v1

    const-string v1, "SourceIdentity"

    invoke-direct {v15, v1}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v1, v7, [Lhg/d;

    aput-object v15, v1, p1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    move/from16 v15, p1

    invoke-direct {v3, v6, v1, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lhg/i;

    new-instance v15, Lig/c;

    move-object/from16 v17, v0

    const-string v0, "Tags"

    invoke-direct {v15, v0}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v0, v7, [Lhg/d;

    aput-object v15, v0, p1

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move/from16 v15, p1

    invoke-direct {v1, v11, v0, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v0, Lhg/i;

    new-instance v15, Lig/c;

    move-object/from16 v18, v2

    const-string v2, "TokenCode"

    invoke-direct {v15, v2}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v2, v7, [Lhg/d;

    aput-object v15, v2, p1

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    move/from16 v15, p1

    invoke-direct {v0, v6, v2, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    new-instance v6, Lig/c;

    const-string v15, "TransitiveTagKeys"

    invoke-direct {v6, v15}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v15, v7, [Lhg/d;

    aput-object v6, v15, p1

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    move/from16 v15, p1

    invoke-direct {v2, v11, v6, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lxl/a;

    const/16 v11, 0xd

    invoke-direct {v6, v11}, Lxl/a;-><init>(I)V

    new-instance v11, Lig/c;

    const-string v15, "AssumeRoleRequest"

    invoke-direct {v11, v15}, Lig/c;-><init>(Ljava/lang/String;)V

    iget-object v15, v6, Lxl/a;->y:Ljava/lang/Object;

    check-cast v15, Ljava/util/LinkedHashSet;

    invoke-interface {v15, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v11, Lig/e;

    const-string v7, "Action"

    move-object/from16 v19, v2

    const-string v2, "AssumeRole"

    invoke-direct {v11, v7, v2}, Lig/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v15, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lig/e;

    const-string v7, "Version"

    const-string v11, "2011-06-15"

    invoke-direct {v2, v7, v11}, Lig/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v15, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v10}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v12}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v13}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v14}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v9}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v1}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v0}, Lxl/a;->p(Lhg/i;)V

    move-object/from16 v0, v19

    invoke-virtual {v6, v0}, Lxl/a;->p(Lhg/i;)V

    new-instance v0, Lhg/j;

    invoke-direct {v0, v6}, Lhg/j;-><init>(Lxl/a;)V

    move-object/from16 v2, v18

    invoke-virtual {v2, v0}, Lig/d;->e(Lhg/j;)Lhg/n;

    move-result-object v0

    move-object/from16 v2, v17

    iget-object v3, v2, Lud/a;->a:Ljava/lang/Integer;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move-object v6, v0

    check-cast v6, Ld1/j;

    new-instance v7, Lf1/x;

    const/4 v8, 0x1

    invoke-direct {v7, v6, v3, v8}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v4, v7}, Ld1/j;->H(Lhg/i;Lc93/a;)V

    :cond_0
    iget-object v3, v2, Lud/a;->b:Ljava/lang/String;

    if-eqz v3, :cond_1

    move-object v4, v0

    check-cast v4, Ld1/j;

    invoke-virtual {v4, v5, v3}, Ld1/j;->a(Lhg/i;Ljava/lang/String;)V

    :cond_1
    iget-object v3, v2, Lud/a;->c:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    new-instance v3, Lvd/b;

    const/4 v8, 0x1

    invoke-direct {v3, v2, v8}, Lvd/b;-><init>(Lud/a;I)V

    move-object v4, v0

    check-cast v4, Ld1/j;

    invoke-virtual {v4, v10, v3}, Ld1/j;->B(Lhg/i;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    iget-object v3, v2, Lud/a;->d:Ljava/lang/String;

    if-eqz v3, :cond_3

    move-object v4, v0

    check-cast v4, Ld1/j;

    invoke-virtual {v4, v13, v3}, Ld1/j;->a(Lhg/i;Ljava/lang/String;)V

    :cond_3
    iget-object v3, v2, Lud/a;->e:Ljava/lang/String;

    if-eqz v3, :cond_4

    move-object v4, v0

    check-cast v4, Ld1/j;

    invoke-virtual {v4, v14, v3}, Ld1/j;->a(Lhg/i;Ljava/lang/String;)V

    :cond_4
    iget-object v3, v2, Lud/a;->f:Ljava/util/ArrayList;

    if-eqz v3, :cond_5

    new-instance v3, Lvd/b;

    const/4 v15, 0x0

    invoke-direct {v3, v2, v15}, Lvd/b;-><init>(Lud/a;I)V

    check-cast v0, Ld1/j;

    invoke-virtual {v0, v1, v3}, Ld1/j;->B(Lhg/i;Lkotlin/jvm/functions/Function1;)V

    :cond_5
    invoke-virtual/range {p2 .. p2}, Lyf/k;->n()[B

    move-result-object v0

    new-instance v1, Lof/a;

    invoke-direct {v1, v0}, Lof/a;-><init>([B)V

    move-object/from16 v0, v16

    iput-object v1, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    const-string v2, "application/x-www-form-urlencoded"

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ldg/a;Ljava/lang/Object;)Lvf/b;
    .locals 24

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget v2, v1, Ldd/c;->a:I

    const-string v3, "application/json"

    const-string v4, "refreshToken"

    const-string v5, "redirectUri"

    const-string v6, "grantType"

    const-string v7, "codeVerifier"

    const-string v8, "code"

    const-string v9, "clientId"

    const-string v10, "UserContextData"

    const-string v11, "Session"

    const-string v12, "AnalyticsMetadata"

    const-string v13, "AttributeName"

    const-string v15, "ClientId"

    const-string v14, "ClientMetadata"

    const-string v1, "AccessToken"

    move/from16 v17, v2

    const-string v2, "application/x-amz-json-1.1"

    move-object/from16 v18, v3

    const-string v3, "/"

    move-object/from16 v19, v4

    const-string v4, "input"

    move-object/from16 v20, v5

    const-string v5, "context"

    move-object/from16 v21, v6

    const/4 v6, 0x0

    packed-switch v17, :pswitch_data_0

    move-object/from16 v1, p2

    check-cast v1, Lud/c;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v2, Lmf/r;->x:Lmf/r;

    iput-object v2, v0, Lvf/b;->w:Lmf/r;

    iget-object v2, v0, Lvf/b;->x:Lcg/j;

    iget-object v2, v2, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v2, Lig/d;

    new-instance v3, Lyf/k;

    invoke-direct {v3}, Lyf/k;-><init>()V

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lig/d;-><init>(Lyf/k;Ljava/lang/String;)V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->e:Lhg/l;

    new-instance v7, Lig/c;

    const-string v8, "DurationSeconds"

    invoke-direct {v7, v8}, Lig/c;-><init>(Ljava/lang/String;)V

    const/4 v8, 0x1

    new-array v9, v8, [Lhg/d;

    aput-object v7, v9, v6

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v5, v7, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v7, Lhg/l;->i:Lhg/l;

    new-instance v9, Lig/c;

    const-string v10, "Policy"

    invoke-direct {v9, v10}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v10, v8, [Lhg/d;

    aput-object v9, v10, v6

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v5, v7, v9, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    sget-object v10, Lhg/l;->f:Lhg/l;

    new-instance v11, Lig/c;

    const-string v12, "PolicyArns"

    invoke-direct {v11, v12}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v12, v8, [Lhg/d;

    aput-object v11, v12, v6

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v9, v10, v11, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Lig/c;

    const-string v12, "ProviderId"

    invoke-direct {v11, v12}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v12, v8, [Lhg/d;

    aput-object v11, v12, v6

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v7, v11, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v12, Lig/c;

    const-string v13, "RoleArn"

    invoke-direct {v12, v13}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v13, v8, [Lhg/d;

    aput-object v12, v13, v6

    invoke-static {v13}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    invoke-direct {v11, v7, v12, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v12, Lhg/i;

    new-instance v13, Lig/c;

    const-string v14, "RoleSessionName"

    invoke-direct {v13, v14}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v14, v8, [Lhg/d;

    aput-object v13, v14, v6

    invoke-static {v14}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v13

    invoke-direct {v12, v7, v13, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v13, Lhg/i;

    new-instance v14, Lig/c;

    const-string v15, "WebIdentityToken"

    invoke-direct {v14, v15}, Lig/c;-><init>(Ljava/lang/String;)V

    new-array v15, v8, [Lhg/d;

    aput-object v14, v15, v6

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v13, v7, v8, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lxl/a;

    const/16 v7, 0xd

    invoke-direct {v6, v7}, Lxl/a;-><init>(I)V

    new-instance v7, Lig/c;

    const-string v8, "AssumeRoleWithWebIdentityRequest"

    invoke-direct {v7, v8}, Lig/c;-><init>(Ljava/lang/String;)V

    iget-object v8, v6, Lxl/a;->y:Ljava/lang/Object;

    check-cast v8, Ljava/util/LinkedHashSet;

    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v7, Lig/e;

    const-string v14, "Action"

    const-string v15, "AssumeRoleWithWebIdentity"

    invoke-direct {v7, v14, v15}, Lig/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v7, Lig/e;

    const-string v14, "Version"

    const-string v15, "2011-06-15"

    invoke-direct {v7, v14, v15}, Lig/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v9}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v10}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v11}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v12}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v6, v13}, Lxl/a;->p(Lhg/i;)V

    new-instance v5, Lhg/j;

    invoke-direct {v5, v6}, Lhg/j;-><init>(Lxl/a;)V

    invoke-virtual {v2, v5}, Lig/d;->e(Lhg/j;)Lhg/n;

    move-result-object v2

    iget-object v5, v1, Lud/c;->a:Ljava/lang/Integer;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v6, v2

    check-cast v6, Ld1/j;

    new-instance v7, Lf1/x;

    const/4 v8, 0x1

    invoke-direct {v7, v6, v5, v8}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v6, v4, v7}, Ld1/j;->H(Lhg/i;Lc93/a;)V

    :cond_0
    iget-object v4, v1, Lud/c;->b:Ljava/util/List;

    if-eqz v4, :cond_1

    new-instance v4, Ls;

    const/16 v5, 0x19

    invoke-direct {v4, v1, v5}, Ls;-><init>(Ljava/lang/Object;I)V

    move-object v5, v2

    check-cast v5, Ld1/j;

    invoke-virtual {v5, v9, v4}, Ld1/j;->B(Lhg/i;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    iget-object v4, v1, Lud/c;->c:Ljava/lang/String;

    if-eqz v4, :cond_2

    move-object v5, v2

    check-cast v5, Ld1/j;

    invoke-virtual {v5, v11, v4}, Ld1/j;->a(Lhg/i;Ljava/lang/String;)V

    :cond_2
    iget-object v4, v1, Lud/c;->d:Ljava/lang/String;

    if-eqz v4, :cond_3

    move-object v5, v2

    check-cast v5, Ld1/j;

    invoke-virtual {v5, v12, v4}, Ld1/j;->a(Lhg/i;Ljava/lang/String;)V

    :cond_3
    iget-object v1, v1, Lud/c;->e:Ljava/lang/String;

    if-eqz v1, :cond_4

    check-cast v2, Ld1/j;

    invoke-virtual {v2, v13, v1}, Ld1/j;->a(Lhg/i;Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v3}, Lyf/k;->n()[B

    move-result-object v1

    new-instance v2, Lof/a;

    invoke-direct {v2, v1}, Lof/a;-><init>([B)V

    iput-object v2, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    const-string v2, "application/x-www-form-urlencoded"

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    invoke-direct/range {p0 .. p2}, Ldd/c;->b(Ldg/a;Ljava/lang/Object;)Lvf/b;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object/from16 v7, p2

    check-cast v7, Lre/e1;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v4, Lmf/r;->x:Lmf/r;

    iput-object v4, v0, Lvf/b;->w:Lmf/r;

    iget-object v4, v0, Lvf/b;->x:Lcg/j;

    iget-object v4, v4, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v8, Ljg/e;

    invoke-direct {v8, v1}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v9, v1, [Lhg/d;

    aput-object v8, v9, v6

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v4, v5, v8, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v9, Ljg/e;

    invoke-direct {v9, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v1, [Lhg/d;

    aput-object v9, v10, v6

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v8, v5, v9, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "Code"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Lhg/d;

    aput-object v10, v1, v6

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v9, v5, v1, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v4, Lhg/i;->b:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v8, Lhg/i;->b:I

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v9, Lhg/i;->b:I

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v1}, Le73/b;->f()V

    iget-object v5, v7, Lre/e1;->a:Ljava/lang/String;

    if-eqz v5, :cond_5

    invoke-virtual {v3, v4, v5}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_5
    iget-object v4, v7, Lre/e1;->b:Ljava/lang/String;

    if-eqz v4, :cond_6

    invoke-virtual {v3, v8, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_6
    iget-object v4, v7, Lre/e1;->c:Ljava/lang/String;

    if-eqz v4, :cond_7

    invoke-virtual {v3, v9, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_7
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v1}, Le73/b;->l()[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_2
    move-object/from16 v7, p2

    check-cast v7, Lre/c1;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lre/c1;->b:Ljava/util/List;

    new-instance v4, Lvf/b;

    invoke-direct {v4}, Lvf/b;-><init>()V

    sget-object v5, Lmf/r;->x:Lmf/r;

    iput-object v5, v4, Lvf/b;->w:Lmf/r;

    iget-object v5, v4, Lvf/b;->x:Lcg/j;

    iget-object v5, v5, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v5, Lhg/i;

    sget-object v8, Lhg/l;->i:Lhg/l;

    new-instance v9, Ljg/e;

    invoke-direct {v9, v1}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v10, v1, [Lhg/d;

    aput-object v9, v10, v6

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v5, v8, v9, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v9, Lhg/l;->h:Lhg/l;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v1, [Lhg/d;

    aput-object v10, v11, v6

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v8, v9, v10, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    sget-object v10, Lhg/l;->f:Lhg/l;

    new-instance v11, Ljg/e;

    const-string v12, "UserAttributes"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v1, [Lhg/d;

    aput-object v11, v12, v6

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v9, v10, v1, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v5, Lhg/i;->b:I

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v8, Lhg/i;->b:I

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v9, Lhg/i;->b:I

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v1}, Le73/b;->f()V

    iget-object v6, v7, Lre/c1;->a:Ljava/lang/String;

    if-eqz v6, :cond_8

    invoke-virtual {v3, v5, v6}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_8
    if-eqz v0, :cond_b

    invoke-static {v9}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Le73/b;->q(Ljava/lang/String;)V

    sget-object v5, Ljg/q;->x:Ljg/q;

    const-string v6, "["

    invoke-virtual {v1, v6}, Le73/b;->j(Ljava/lang/String;)V

    iget-boolean v6, v1, Le73/b;->b:Z

    if-eqz v6, :cond_9

    iget-object v6, v1, Le73/b;->e:Ljava/lang/Object;

    check-cast v6, Ljava/lang/StringBuilder;

    const/16 v7, 0xa

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_9
    iget v6, v1, Le73/b;->d:I

    const/16 v22, 0x1

    add-int/lit8 v6, v6, 0x1

    iput v6, v1, Le73/b;->d:I

    iget-object v6, v1, Le73/b;->c:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    const-string v7, "<this>"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lre/b;

    sget-object v7, Lse/i;->w:Lse/i;

    new-instance v8, Lhg/k;

    invoke-direct {v8, v6, v7}, Lhg/k;-><init>(Ljava/lang/Object;Lc93/m;)V

    invoke-interface {v3, v8}, Lhg/h;->j(Lhg/k;)V

    goto :goto_0

    :cond_a
    sget-object v0, Ljg/q;->y:Ljg/q;

    filled-new-array {v5, v0}, [Ljg/q;

    move-result-object v0

    const-string v5, "]"

    invoke-virtual {v1, v5, v0}, Le73/b;->h(Ljava/lang/String;[Ljg/q;)V

    :cond_b
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v1}, Le73/b;->l()[B

    move-result-object v0

    new-instance v1, Lof/a;

    invoke-direct {v1, v0}, Lof/a;-><init>([B)V

    iput-object v1, v4, Lvf/b;->z:Lmf/l;

    iget-object v0, v4, Lvf/b;->y:Lmf/c;

    invoke-virtual {v0, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v4

    :pswitch_3
    move-object/from16 v7, p2

    check-cast v7, Lre/w0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v4, Lmf/r;->x:Lmf/r;

    iput-object v4, v0, Lvf/b;->w:Lmf/r;

    iget-object v4, v0, Lvf/b;->x:Lcg/j;

    iget-object v4, v4, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v8, Ljg/e;

    invoke-direct {v8, v1}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v9, v1, [Lhg/d;

    aput-object v8, v9, v6

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v4, v5, v8, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v8, Lhg/l;->j:Lhg/l;

    new-instance v9, Ljg/e;

    const-string v10, "EmailMfaSettings"

    invoke-direct {v9, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v1, [Lhg/d;

    aput-object v9, v10, v6

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v5, v8, v9, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "SMSMfaSettings"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v1, [Lhg/d;

    aput-object v10, v11, v6

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v9, v8, v10, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "SoftwareTokenMfaSettings"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Lhg/d;

    aput-object v11, v1, v6

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v10, v8, v1, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v4, Lhg/i;->b:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v5, Lhg/i;->b:I

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v9, Lhg/i;->b:I

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v10, Lhg/i;->b:I

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v1}, Le73/b;->f()V

    iget-object v6, v7, Lre/w0;->a:Ljava/lang/String;

    if-eqz v6, :cond_c

    invoke-virtual {v3, v4, v6}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_c
    iget-object v4, v7, Lre/w0;->b:Lre/i0;

    if-eqz v4, :cond_d

    sget-object v6, Lse/d;->w:Lse/d;

    invoke-static {v3, v5, v4, v6}, Lds/p;->C(Lhg/n;Lhg/i;Ljava/lang/Object;Lc93/m;)V

    :cond_d
    iget-object v4, v7, Lre/w0;->c:Lre/z0;

    if-eqz v4, :cond_e

    sget-object v5, Lse/e;->w:Lse/e;

    invoke-static {v3, v9, v4, v5}, Lds/p;->C(Lhg/n;Lhg/i;Ljava/lang/Object;Lc93/m;)V

    :cond_e
    iget-object v4, v7, Lre/w0;->d:Lre/b1;

    if-eqz v4, :cond_f

    sget-object v5, Lse/f;->w:Lse/f;

    invoke-static {v3, v10, v4, v5}, Lds/p;->C(Lhg/n;Lhg/i;Ljava/lang/Object;Lc93/m;)V

    :cond_f
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v1}, Le73/b;->l()[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    move-object/from16 v1, p2

    check-cast v1, Lre/t0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v4, Lmf/r;->x:Lmf/r;

    iput-object v4, v0, Lvf/b;->w:Lmf/r;

    iget-object v4, v0, Lvf/b;->x:Lcg/j;

    iget-object v4, v4, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v8, 0x1

    new-array v9, v8, [Lhg/d;

    aput-object v7, v9, v6

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v5, v7, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    new-instance v9, Ljg/e;

    const-string v10, "ClientSecret"

    invoke-direct {v9, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v8, [Lhg/d;

    aput-object v9, v10, v6

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v7, v5, v9, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "Token"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v8, [Lhg/d;

    aput-object v10, v8, v6

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v9, v5, v8, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v4, Lhg/i;->b:I

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v7, Lhg/i;->b:I

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v9, Lhg/i;->b:I

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v5}, Le73/b;->f()V

    iget-object v6, v1, Lre/t0;->a:Ljava/lang/String;

    if-eqz v6, :cond_10

    invoke-virtual {v3, v4, v6}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_10
    iget-object v1, v1, Lre/t0;->b:Ljava/lang/String;

    if-eqz v1, :cond_11

    invoke-virtual {v3, v9, v1}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_11
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v5}, Le73/b;->l()[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    move-object/from16 v1, p2

    check-cast v1, Lre/r0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lre/r0;->b:Ljava/lang/Object;

    new-instance v4, Lvf/b;

    invoke-direct {v4}, Lvf/b;-><init>()V

    sget-object v5, Lmf/r;->x:Lmf/r;

    iput-object v5, v4, Lvf/b;->w:Lmf/r;

    iget-object v5, v4, Lvf/b;->x:Lcg/j;

    iget-object v5, v5, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v5, Lhg/i;

    sget-object v7, Lhg/l;->j:Lhg/l;

    new-instance v8, Ljg/e;

    invoke-direct {v8, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v12, v9, [Lhg/d;

    aput-object v8, v12, v6

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v5, v7, v8, v6}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v12, Lhg/l;->d:Lhg/l;

    new-instance v13, Ljg/e;

    move/from16 v17, v6

    const-string v6, "ChallengeName"

    invoke-direct {v13, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v6, v9, [Lhg/d;

    aput-object v13, v6, v17

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    move/from16 v13, v17

    invoke-direct {v8, v12, v6, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    sget-object v12, Lhg/l;->h:Lhg/l;

    new-instance v13, Ljg/e;

    move-object/from16 v16, v0

    const-string v0, "ChallengeResponses"

    invoke-direct {v13, v0}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v0, v9, [Lhg/d;

    aput-object v13, v0, v17

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move/from16 v13, v17

    invoke-direct {v6, v12, v0, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v0, Lhg/i;

    sget-object v13, Lhg/l;->i:Lhg/l;

    move-object/from16 v23, v2

    new-instance v2, Ljg/e;

    invoke-direct {v2, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v15, v9, [Lhg/d;

    aput-object v2, v15, v17

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    move/from16 v15, v17

    invoke-direct {v0, v13, v2, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    new-instance v15, Ljg/e;

    invoke-direct {v15, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v14, v9, [Lhg/d;

    aput-object v15, v14, v17

    invoke-static {v14}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    move/from16 v15, v17

    invoke-direct {v2, v12, v14, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v12, Lhg/i;

    new-instance v14, Ljg/e;

    invoke-direct {v14, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v9, [Lhg/d;

    aput-object v14, v11, v15

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v12, v13, v11, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v13, Ljg/e;

    invoke-direct {v13, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v9, [Lhg/d;

    aput-object v13, v9, v15

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v11, v7, v9, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    iput v9, v5, Lhg/i;->b:I

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v8, Lhg/i;->b:I

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v6, Lhg/i;->b:I

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v0, Lhg/i;->b:I

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v2, Lhg/i;->b:I

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v2

    iput v2, v12, Lhg/i;->b:I

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v2

    iput v2, v11, Lhg/i;->b:I

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v2}, Le73/b;->f()V

    iget-object v5, v1, Lre/r0;->a:Lre/z;

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Lre/z;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v8, v5}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_12
    if-eqz v16, :cond_14

    invoke-static {v6}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v2}, Le73/b;->f()V

    invoke-interface/range {v16 .. v16}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3, v7, v6}, Lhg/f;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_13
    invoke-virtual {v2}, Le73/b;->k()V

    :cond_14
    iget-object v5, v1, Lre/r0;->c:Ljava/lang/String;

    if-eqz v5, :cond_15

    invoke-virtual {v3, v0, v5}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_15
    iget-object v0, v1, Lre/r0;->d:Ljava/lang/String;

    if-eqz v0, :cond_16

    invoke-virtual {v3, v12, v0}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_16
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v2}, Le73/b;->l()[B

    move-result-object v0

    new-instance v1, Lof/a;

    invoke-direct {v1, v0}, Lof/a;-><init>([B)V

    iput-object v1, v4, Lvf/b;->z:Lmf/l;

    iget-object v0, v4, Lvf/b;->y:Lmf/c;

    move-object/from16 v2, v23

    invoke-virtual {v0, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v4

    :pswitch_6
    move-object/from16 v1, p2

    check-cast v1, Lre/n0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lre/n0;->d:Ljava/util/Map;

    iget-object v4, v1, Lre/n0;->b:Ljava/util/Map;

    new-instance v5, Lvf/b;

    invoke-direct {v5}, Lvf/b;-><init>()V

    sget-object v6, Lmf/r;->x:Lmf/r;

    iput-object v6, v5, Lvf/b;->w:Lmf/r;

    iget-object v6, v5, Lvf/b;->x:Lcg/j;

    iget-object v6, v6, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v6, Lhg/i;

    sget-object v7, Lhg/l;->j:Lhg/l;

    new-instance v8, Ljg/e;

    invoke-direct {v8, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v12, v9, [Lhg/d;

    const/4 v13, 0x0

    aput-object v8, v12, v13

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v6, v7, v8, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v12, Lhg/l;->d:Lhg/l;

    move/from16 v17, v13

    new-instance v13, Ljg/e;

    move-object/from16 v16, v0

    const-string v0, "AuthFlow"

    invoke-direct {v13, v0}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v0, v9, [Lhg/d;

    aput-object v13, v0, v17

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move/from16 v13, v17

    invoke-direct {v8, v12, v0, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v0, Lhg/i;

    sget-object v12, Lhg/l;->h:Lhg/l;

    new-instance v13, Ljg/e;

    move-object/from16 v18, v4

    const-string v4, "AuthParameters"

    invoke-direct {v13, v4}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v4, v9, [Lhg/d;

    aput-object v13, v4, v17

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    move/from16 v13, v17

    invoke-direct {v0, v12, v4, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    sget-object v13, Lhg/l;->i:Lhg/l;

    move-object/from16 v23, v2

    new-instance v2, Ljg/e;

    invoke-direct {v2, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v15, v9, [Lhg/d;

    aput-object v2, v15, v17

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    move/from16 v15, v17

    invoke-direct {v4, v13, v2, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    new-instance v15, Ljg/e;

    invoke-direct {v15, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v14, v9, [Lhg/d;

    aput-object v15, v14, v17

    invoke-static {v14}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    move/from16 v15, v17

    invoke-direct {v2, v12, v14, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v12, Lhg/i;

    new-instance v14, Ljg/e;

    invoke-direct {v14, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v9, [Lhg/d;

    aput-object v14, v11, v15

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v12, v13, v11, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v13, Ljg/e;

    invoke-direct {v13, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v9, [Lhg/d;

    aput-object v13, v9, v15

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v11, v7, v9, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    iput v9, v6, Lhg/i;->b:I

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v8, Lhg/i;->b:I

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v0, Lhg/i;->b:I

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v4, Lhg/i;->b:I

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v2, Lhg/i;->b:I

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v12, Lhg/i;->b:I

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v11, Lhg/i;->b:I

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v6}, Le73/b;->f()V

    iget-object v7, v1, Lre/n0;->a:Lre/f;

    if-eqz v7, :cond_17

    invoke-virtual {v7}, Lre/f;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v8, v7}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_17
    if-eqz v18, :cond_19

    invoke-static {v0}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v6}, Le73/b;->f()V

    invoke-interface/range {v18 .. v18}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v3, v8, v7}, Lhg/f;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_18
    invoke-virtual {v6}, Le73/b;->k()V

    :cond_19
    iget-object v0, v1, Lre/n0;->c:Ljava/lang/String;

    if-eqz v0, :cond_1a

    invoke-virtual {v3, v4, v0}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_1a
    if-eqz v16, :cond_1c

    invoke-static {v2}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {v6}, Le73/b;->f()V

    invoke-interface/range {v16 .. v16}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v3, v2, v1}, Lhg/f;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_1b
    invoke-virtual {v6}, Le73/b;->k()V

    :cond_1c
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v6}, Le73/b;->l()[B

    move-result-object v0

    new-instance v1, Lof/a;

    invoke-direct {v1, v0}, Lof/a;-><init>([B)V

    iput-object v1, v5, Lvf/b;->z:Lmf/l;

    iget-object v0, v5, Lvf/b;->y:Lmf/c;

    move-object/from16 v2, v23

    invoke-virtual {v0, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v5

    :pswitch_7
    move-object/from16 v6, p2

    check-cast v6, Lre/l0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v4, Lmf/r;->x:Lmf/r;

    iput-object v4, v0, Lvf/b;->w:Lmf/r;

    iget-object v4, v0, Lvf/b;->x:Lcg/j;

    iget-object v4, v4, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v1}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lhg/d;

    const/4 v13, 0x0

    aput-object v7, v1, v13

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v4, v5, v1, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v4, Lhg/i;->b:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v1}, Le73/b;->f()V

    iget-object v5, v6, Lre/l0;->a:Ljava/lang/String;

    if-eqz v5, :cond_1d

    invoke-virtual {v3, v4, v5}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_1d
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v1}, Le73/b;->l()[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_8
    move-object/from16 v6, p2

    check-cast v6, Lre/j0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v4, Lmf/r;->x:Lmf/r;

    iput-object v4, v0, Lvf/b;->w:Lmf/r;

    iget-object v4, v0, Lvf/b;->x:Lcg/j;

    iget-object v4, v4, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v1}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v8, v1, [Lhg/d;

    const/4 v15, 0x0

    aput-object v7, v8, v15

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v5, v7, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    new-instance v8, Ljg/e;

    invoke-direct {v8, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v1, [Lhg/d;

    aput-object v8, v9, v15

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v7, v5, v8, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    sget-object v8, Lhg/l;->h:Lhg/l;

    new-instance v9, Ljg/e;

    invoke-direct {v9, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Lhg/d;

    aput-object v9, v1, v15

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v5, v8, v1, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    iput v8, v4, Lhg/i;->b:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    iput v8, v7, Lhg/i;->b:I

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    iput v8, v5, Lhg/i;->b:I

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v1}, Le73/b;->f()V

    iget-object v5, v6, Lre/j0;->a:Ljava/lang/String;

    if-eqz v5, :cond_1e

    invoke-virtual {v3, v4, v5}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_1e
    iget-object v4, v6, Lre/j0;->b:Ljava/lang/String;

    if-eqz v4, :cond_1f

    invoke-virtual {v3, v7, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_1f
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v1}, Le73/b;->l()[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_9
    move-object/from16 v6, p2

    check-cast v6, Lre/a0;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v4, Lmf/r;->x:Lmf/r;

    iput-object v4, v0, Lvf/b;->w:Lmf/r;

    iget-object v4, v0, Lvf/b;->x:Lcg/j;

    iget-object v4, v4, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v7, Ljg/e;

    invoke-direct {v7, v1}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v8, v1, [Lhg/d;

    const/4 v13, 0x0

    aput-object v7, v8, v13

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v4, v5, v7, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    new-instance v8, Ljg/e;

    const-string v9, "PreviousPassword"

    invoke-direct {v8, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v1, [Lhg/d;

    aput-object v8, v9, v13

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v7, v5, v8, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v9, Ljg/e;

    const-string v10, "ProposedPassword"

    invoke-direct {v9, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Lhg/d;

    aput-object v9, v1, v13

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v8, v5, v1, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v4, Lhg/i;->b:I

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v7, Lhg/i;->b:I

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    iput v5, v8, Lhg/i;->b:I

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v1}, Le73/b;->f()V

    iget-object v5, v6, Lre/a0;->a:Ljava/lang/String;

    if-eqz v5, :cond_20

    invoke-virtual {v3, v4, v5}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_20
    iget-object v4, v6, Lre/a0;->b:Ljava/lang/String;

    if-eqz v4, :cond_21

    invoke-virtual {v3, v7, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_21
    iget-object v4, v6, Lre/a0;->c:Ljava/lang/String;

    if-eqz v4, :cond_22

    invoke-virtual {v3, v8, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_22
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v1}, Le73/b;->l()[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_a
    move-object/from16 v1, p2

    check-cast v1, Lod/d;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v2, Lmf/r;->x:Lmf/r;

    iput-object v2, v0, Lvf/b;->w:Lmf/r;

    iget-object v2, v0, Lvf/b;->x:Lcg/j;

    iget-object v2, v2, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "/token"

    invoke-virtual {v2, v3}, Lbd3/k;->e(Ljava/lang/String;)V

    new-instance v2, Ljg/f;

    invoke-direct {v2}, Ljg/f;-><init>()V

    new-instance v3, Lhg/i;

    sget-object v4, Lhg/l;->i:Lhg/l;

    new-instance v5, Ljg/e;

    invoke-direct {v5, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v6, v9, [Lhg/d;

    const/4 v13, 0x0

    aput-object v5, v6, v13

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v3, v4, v5, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    new-instance v6, Ljg/e;

    const-string v10, "clientSecret"

    invoke-direct {v6, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v9, [Lhg/d;

    aput-object v6, v10, v13

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v5, v4, v6, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v9, [Lhg/d;

    aput-object v10, v8, v13

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v6, v4, v8, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v9, [Lhg/d;

    aput-object v10, v7, v13

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v8, v4, v7, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "deviceCode"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v9, [Lhg/d;

    aput-object v10, v11, v13

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v7, v4, v10, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    move-object/from16 v12, v21

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v9, [Lhg/d;

    aput-object v11, v12, v13

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v4, v11, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v12, Ljg/e;

    move-object/from16 v14, v20

    invoke-direct {v12, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v14, v9, [Lhg/d;

    aput-object v12, v14, v13

    invoke-static {v14}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    invoke-direct {v11, v4, v12, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v12, Lhg/i;

    new-instance v14, Ljg/e;

    move-object/from16 v15, v19

    invoke-direct {v14, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v15, v9, [Lhg/d;

    aput-object v14, v15, v13

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    invoke-direct {v12, v4, v14, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    sget-object v14, Lhg/l;->f:Lhg/l;

    new-instance v15, Ljg/e;

    move/from16 v17, v13

    const-string v13, "scope"

    invoke-direct {v15, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v9, [Lhg/d;

    aput-object v15, v9, v17

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    move/from16 v13, v17

    invoke-direct {v4, v14, v9, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lxl/a;

    const/16 v13, 0xd

    invoke-direct {v9, v13}, Lxl/a;-><init>(I)V

    invoke-virtual {v9, v3}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v7}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v10}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v11}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v12}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v9, v4}, Lxl/a;->p(Lhg/i;)V

    iget-object v4, v9, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedHashSet;

    const-string v6, "traits"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v2, Ljg/f;->w:Le73/b;

    invoke-virtual {v4}, Le73/b;->f()V

    iget-object v6, v1, Lod/d;->a:Ljava/lang/String;

    if-eqz v6, :cond_23

    invoke-virtual {v2, v3, v6}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_23
    iget-object v3, v1, Lod/d;->b:Ljava/lang/String;

    if-eqz v3, :cond_24

    invoke-virtual {v2, v5, v3}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_24
    iget-object v3, v1, Lod/d;->c:Ljava/lang/String;

    if-eqz v3, :cond_25

    invoke-virtual {v2, v10, v3}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_25
    iget-object v1, v1, Lod/d;->d:Ljava/lang/String;

    if-eqz v1, :cond_26

    invoke-virtual {v2, v12, v1}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_26
    invoke-virtual {v2}, Ljg/f;->o()V

    invoke-virtual {v4}, Le73/b;->l()[B

    move-result-object v1

    new-instance v2, Lof/a;

    invoke-direct {v2, v1}, Lof/a;-><init>([B)V

    iput-object v2, v0, Lvf/b;->z:Lmf/l;

    iget-object v1, v0, Lvf/b;->y:Lmf/c;

    move-object/from16 v2, v18

    invoke-virtual {v1, v2}, La2/a;->P(Ljava/lang/String;)V

    return-object v0

    :pswitch_b
    move-object/from16 v1, p2

    check-cast v1, Lid/a;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v2, Lmf/r;->w:Lmf/r;

    iput-object v2, v0, Lvf/b;->w:Lmf/r;

    iget-object v2, v0, Lvf/b;->x:Lcg/j;

    iget-object v3, v2, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "/federation/credentials"

    invoke-virtual {v3, v4}, Lbd3/k;->e(Ljava/lang/String;)V

    iget-object v2, v2, Lcg/j;->E:Lcg/g;

    sget-object v5, Ltg/g;->m:Ltg/g;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "encoding"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ltg/g;->j:Ltg/g;

    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_27

    iget-object v2, v2, Lcg/g;->y:Lhf/h;

    goto :goto_4

    :cond_27
    sget-object v11, Lcg/c;->w:Lcg/c;

    new-instance v3, La1/e;

    const/4 v9, 0x0

    const/16 v10, 0x11

    const/4 v4, 0x1

    const-class v6, Ltg/e;

    const-string v7, "encodableFromDecoded"

    const-string v8, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v3 .. v10}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v12, v3

    sget-object v13, Lcg/d;->w:Lcg/d;

    new-instance v3, La1/e;

    const/16 v10, 0x12

    const-class v6, Ltg/e;

    const-string v7, "encodableFromDecoded"

    const-string v8, "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;"

    invoke-direct/range {v3 .. v10}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v2, v11, v12, v13, v3}, Lhg3/i;->t(Lgf/m;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;)Lhf/h;

    move-result-object v2

    :goto_4
    const-string v3, "$this$decodedParameters"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lid/a;->b:Ljava/lang/String;

    if-eqz v3, :cond_28

    const-string v4, "account_id"

    invoke-virtual {v2, v4, v3}, Lhf/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_28
    iget-object v3, v1, Lid/a;->c:Ljava/lang/String;

    if-eqz v3, :cond_29

    const-string v4, "role_name"

    invoke-virtual {v2, v4, v3}, Lhf/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_29
    iget-object v1, v1, Lid/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_2a

    const-string v2, "x-amz-sso_bearer_token"

    iget-object v3, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v3, v1, v2}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2a
    return-object v0

    :pswitch_c
    move-object/from16 v2, v18

    move-object/from16 v15, v19

    move-object/from16 v14, v20

    move-object/from16 v12, v21

    move-object/from16 v1, p2

    check-cast v1, Lcd/c;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    sget-object v3, Lmf/r;->x:Lmf/r;

    iput-object v3, v0, Lvf/b;->w:Lmf/r;

    iget-object v3, v0, Lvf/b;->x:Lcg/j;

    iget-object v3, v3, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "/v1/token"

    invoke-virtual {v3, v4}, Lbd3/k;->e(Ljava/lang/String;)V

    iget-object v1, v1, Lcd/c;->a:Lcd/d;

    if-eqz v1, :cond_2c

    new-instance v3, Ljg/f;

    invoke-direct {v3}, Ljg/f;-><init>()V

    new-instance v4, Lhg/i;

    sget-object v5, Lhg/l;->i:Lhg/l;

    new-instance v6, Ljg/e;

    invoke-direct {v6, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    new-array v10, v9, [Lhg/d;

    const/4 v13, 0x0

    aput-object v6, v10, v13

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v5, v6, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v9, [Lhg/d;

    aput-object v10, v8, v13

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v6, v5, v8, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v9, [Lhg/d;

    aput-object v10, v7, v13

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v8, v5, v7, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    new-instance v10, Ljg/e;

    invoke-direct {v10, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v9, [Lhg/d;

    aput-object v10, v11, v13

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v7, v5, v10, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    invoke-direct {v11, v14}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v9, [Lhg/d;

    aput-object v11, v12, v13

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v5, v11, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v12, Ljg/e;

    invoke-direct {v12, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v9, [Lhg/d;

    aput-object v12, v9, v13

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v11, v5, v9, v13}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    iput v9, v4, Lhg/i;->b:I

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    iput v9, v6, Lhg/i;->b:I

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v8, Lhg/i;->b:I

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v7, Lhg/i;->b:I

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v10, Lhg/i;->b:I

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    iput v6, v11, Lhg/i;->b:I

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v3, Ljg/f;->w:Le73/b;

    invoke-virtual {v5}, Le73/b;->f()V

    iget-object v6, v1, Lcd/d;->a:Ljava/lang/String;

    invoke-virtual {v3, v4, v6}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    iget-object v4, v1, Lcd/d;->b:Ljava/lang/String;

    invoke-virtual {v3, v7, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    iget-object v4, v1, Lcd/d;->c:Ljava/lang/String;

    if-eqz v4, :cond_2b

    invoke-virtual {v3, v11, v4}, Ljg/f;->a(Lhg/i;Ljava/lang/String;)V

    :cond_2b
    invoke-virtual {v3}, Ljg/f;->o()V

    invoke-virtual {v5}, Le73/b;->l()[B

    move-result-object v3

    new-instance v4, Lof/a;

    invoke-direct {v4, v3}, Lof/a;-><init>([B)V

    iput-object v4, v0, Lvf/b;->z:Lmf/l;

    :cond_2c
    iget-object v3, v0, Lvf/b;->z:Lmf/l;

    instance-of v3, v3, Lmf/j;

    iget-object v4, v0, Lvf/b;->y:Lmf/c;

    if-nez v3, :cond_2d

    invoke-virtual {v4, v2}, La2/a;->P(Ljava/lang/String;)V

    :cond_2d
    if-nez v1, :cond_2e

    const-string v1, "{}"

    invoke-static {v1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v1

    new-instance v3, Lof/a;

    invoke-direct {v3, v1}, Lof/a;-><init>([B)V

    iput-object v3, v0, Lvf/b;->z:Lmf/l;

    invoke-virtual {v4, v2}, La2/a;->P(Ljava/lang/String;)V

    :cond_2e
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
