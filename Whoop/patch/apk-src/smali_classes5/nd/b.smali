.class public abstract Lnd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    new-instance v0, Lyb3/p;

    const-string v1, "^(us|eu|ap|sa|ca|me|af|il|mx)\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    const-string v3, "af-south-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "ap-east-1"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "ap-east-2"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v5, Ll83/k;

    const-string v6, "ap-northeast-1"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v6, Ll83/k;

    const-string v7, "ap-northeast-2"

    invoke-direct {v6, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v7, Ll83/k;

    const-string v8, "ap-northeast-3"

    invoke-direct {v7, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v8, Ll83/k;

    const-string v9, "ap-south-1"

    invoke-direct {v8, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v9, Ll83/k;

    const-string v10, "ap-south-2"

    invoke-direct {v9, v10, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v10, Ll83/k;

    const-string v11, "ap-southeast-1"

    invoke-direct {v10, v11, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v11, Ll83/k;

    const-string v12, "ap-southeast-2"

    invoke-direct {v11, v12, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v12, Ll83/k;

    const-string v13, "ap-southeast-3"

    invoke-direct {v12, v13, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v13, Ll83/k;

    const-string v14, "ap-southeast-4"

    invoke-direct {v13, v14, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v14, Ll83/k;

    const-string v15, "ap-southeast-5"

    invoke-direct {v14, v15, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v15, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "ap-southeast-6"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "ap-southeast-7"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v18, v2

    const-string v2, "aws-global"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v19, v3

    const-string v3, "ca-central-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v20, v2

    const-string v2, "ca-west-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "eu-central-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v22, v2

    const-string v2, "eu-central-2"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v23, v3

    const-string v3, "eu-north-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v24, v2

    const-string v2, "eu-south-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v25, v3

    const-string v3, "eu-south-2"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v26, v2

    const-string v2, "eu-west-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v27, v3

    const-string v3, "eu-west-2"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v28, v2

    const-string v2, "eu-west-3"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v29, v3

    const-string v3, "il-central-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v30, v2

    const-string v2, "me-central-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v31, v3

    const-string v3, "me-south-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v32, v2

    const-string v2, "mx-central-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v33, v3

    const-string v3, "sa-east-1"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v34, v2

    const-string v2, "us-east-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v35, v3

    const-string v3, "us-east-2"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    move-object/from16 v36, v2

    const-string v2, "us-west-1"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    move-object/from16 v37, v3

    const-string v3, "us-west-2"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v3, v36

    move-object/from16 v36, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v28

    move-object/from16 v28, v30

    move-object/from16 v30, v32

    move-object/from16 v32, v34

    move-object/from16 v34, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    move-object/from16 v25, v27

    move-object/from16 v27, v29

    move-object/from16 v29, v31

    move-object/from16 v31, v33

    move-object/from16 v33, v35

    move-object/from16 v35, v37

    filled-new-array/range {v2 .. v36}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lfe/b;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v8, "us-east-1"

    const-string v3, "aws"

    const-string v4, "amazonaws.com"

    const-string v5, "api.aws"

    move-object v6, v7

    invoke-direct/range {v2 .. v8}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    new-instance v10, Lfe/a;

    const-string v3, "aws"

    invoke-direct {v10, v3, v1, v0, v2}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^cn\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v2, Ll83/k;

    const-string v3, "aws-cn-global"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "cn-north-1"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "cn-northwest-1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.amazonwebservices.com.cn"

    const-string v9, "cn-northwest-1"

    const-string v4, "aws-cn"

    const-string v5, "amazonaws.com.cn"

    move-object v8, v7

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    new-instance v2, Lfe/a;

    const-string v4, "aws-cn"

    invoke-direct {v2, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^eusc\\-(de)\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "eusc-de-east-1"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.amazonwebservices.eu"

    const-string v9, "eusc-de-east-1"

    const-string v4, "aws-eusc"

    const-string v5, "amazonaws.eu"

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v11, v10

    new-instance v10, Lfe/a;

    const-string v4, "aws-eusc"

    invoke-direct {v10, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^us\\-iso\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "aws-iso-global"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "us-iso-east-1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v5, Ll83/k;

    const-string v6, "us-iso-west-1"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.aws.ic.gov"

    const-string v9, "us-iso-east-1"

    const-string v4, "aws-iso"

    const-string v5, "c2s.ic.gov"

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v12, v11

    new-instance v11, Lfe/a;

    const-string v4, "aws-iso"

    invoke-direct {v11, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^us\\-isob\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "aws-iso-b-global"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "us-isob-east-1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v5, Ll83/k;

    const-string v6, "us-isob-west-1"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.aws.scloud"

    const-string v9, "us-isob-east-1"

    const-string v4, "aws-iso-b"

    const-string v5, "sc2s.sgov.gov"

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v13, v12

    new-instance v12, Lfe/a;

    const-string v4, "aws-iso-b"

    invoke-direct {v12, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^eu\\-isoe\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "aws-iso-e-global"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "eu-isoe-west-1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.cloud-aws.adc-e.uk"

    const-string v9, "eu-isoe-west-1"

    const-string v4, "aws-iso-e"

    const-string v5, "cloud.adc-e.uk"

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v14, v13

    new-instance v13, Lfe/a;

    const-string v4, "aws-iso-e"

    invoke-direct {v13, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^us\\-isof\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "aws-iso-f-global"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "us-isof-east-1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v5, Ll83/k;

    const-string v6, "us-isof-south-1"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.aws.hci.ic.gov"

    const-string v9, "us-isof-south-1"

    const-string v4, "aws-iso-f"

    const-string v5, "csp.hci.ic.gov"

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v15, v14

    new-instance v14, Lfe/a;

    const-string v4, "aws-iso-f"

    invoke-direct {v14, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    new-instance v0, Lyb3/p;

    const-string v1, "^us\\-gov\\-\\w+\\-\\d+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v3, Ll83/k;

    const-string v4, "aws-us-gov-global"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v4, Ll83/k;

    const-string v5, "us-gov-east-1"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lfe/b;

    invoke-direct {v1}, Lfe/b;-><init>()V

    new-instance v5, Ll83/k;

    const-string v6, "us-gov-west-1"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lfe/b;

    const-string v6, "api.aws"

    const-string v9, "us-gov-west-1"

    const-string v4, "aws-us-gov"

    const-string v5, "amazonaws.com"

    invoke-direct/range {v3 .. v9}, Lfe/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v8, v15

    new-instance v15, Lfe/a;

    const-string v4, "aws-us-gov"

    invoke-direct {v15, v4, v1, v0, v3}, Lfe/a;-><init>(Ljava/lang/String;Ljava/util/Map;Lyb3/p;Lfe/b;)V

    move-object v9, v2

    filled-new-array/range {v8 .. v15}, [Lfe/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lnd/b;->a:Ljava/util/List;

    return-void
.end method
