.class public abstract Lc2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    sget-object v0, Lc2/n;->w:Lc2/n;

    new-instance v1, Ll83/k;

    const-string v2, "emailAddress"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->x:Lc2/n;

    new-instance v2, Ll83/k;

    const-string v3, "username"

    invoke-direct {v2, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->y:Lc2/n;

    new-instance v3, Ll83/k;

    const-string v4, "password"

    invoke-direct {v3, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->z:Lc2/n;

    new-instance v4, Ll83/k;

    const-string v5, "newUsername"

    invoke-direct {v4, v0, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->E:Lc2/n;

    new-instance v5, Ll83/k;

    const-string v6, "newPassword"

    invoke-direct {v5, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->F:Lc2/n;

    new-instance v6, Ll83/k;

    const-string v7, "postalAddress"

    invoke-direct {v6, v0, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->G:Lc2/n;

    new-instance v7, Ll83/k;

    const-string v8, "postalCode"

    invoke-direct {v7, v0, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->H:Lc2/n;

    new-instance v8, Ll83/k;

    const-string v9, "creditCardNumber"

    invoke-direct {v8, v0, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->I:Lc2/n;

    new-instance v9, Ll83/k;

    const-string v10, "creditCardSecurityCode"

    invoke-direct {v9, v0, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->J:Lc2/n;

    new-instance v10, Ll83/k;

    const-string v11, "creditCardExpirationDate"

    invoke-direct {v10, v0, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->K:Lc2/n;

    new-instance v11, Ll83/k;

    const-string v12, "creditCardExpirationMonth"

    invoke-direct {v11, v0, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->L:Lc2/n;

    new-instance v12, Ll83/k;

    const-string v13, "creditCardExpirationYear"

    invoke-direct {v12, v0, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->M:Lc2/n;

    new-instance v13, Ll83/k;

    const-string v14, "creditCardExpirationDay"

    invoke-direct {v13, v0, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->N:Lc2/n;

    new-instance v14, Ll83/k;

    const-string v15, "addressCountry"

    invoke-direct {v14, v0, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->O:Lc2/n;

    new-instance v15, Ll83/k;

    move-object/from16 v16, v1

    const-string v1, "addressRegion"

    invoke-direct {v15, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->P:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v17, v2

    const-string v2, "addressLocality"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->Q:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v18, v1

    const-string v1, "streetAddress"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->R:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v19, v2

    const-string v2, "extendedAddress"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->S:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v20, v1

    const-string v1, "extendedPostalCode"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->T:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v21, v2

    const-string v2, "personName"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->U:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v22, v1

    const-string v1, "personGivenName"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->V:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v23, v2

    const-string v2, "personFamilyName"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->W:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v24, v1

    const-string v1, "personMiddleName"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->X:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v25, v2

    const-string v2, "personMiddleInitial"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->Y:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v26, v1

    const-string v1, "personNamePrefix"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->Z:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v27, v2

    const-string v2, "personNameSuffix"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->a0:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v28, v1

    const-string v1, "phoneNumber"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->b0:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v29, v2

    const-string v2, "phoneNumberDevice"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->c0:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v30, v1

    const-string v1, "phoneCountryCode"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->d0:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v31, v2

    const-string v2, "phoneNational"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->e0:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v32, v1

    const-string v1, "gender"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->f0:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v33, v2

    const-string v2, "birthDateFull"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->g0:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v34, v1

    const-string v1, "birthDateDay"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->h0:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v35, v2

    const-string v2, "birthDateMonth"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->i0:Lc2/n;

    new-instance v2, Ll83/k;

    move-object/from16 v36, v1

    const-string v1, "birthDateYear"

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lc2/n;->j0:Lc2/n;

    new-instance v1, Ll83/k;

    move-object/from16 v37, v2

    const-string v2, "smsOTPCode"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v2, v36

    move-object/from16 v36, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v28

    move-object/from16 v28, v30

    move-object/from16 v30, v32

    move-object/from16 v32, v34

    move-object/from16 v34, v2

    move-object/from16 v2, v17

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

    filled-new-array/range {v1 .. v36}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lc2/e;->a:Ljava/util/HashMap;

    return-void
.end method
