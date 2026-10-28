.class public final Lcom/whoop/whooplabs/data/domain/ProtocolStep$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/domain/ProtocolStep;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStep;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;
    .locals 49

    .line 1
    const-string v0, "parcel"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v0, :cond_0

    move v0, v9

    move v9, v10

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    const/4 v12, 0x0

    if-nez v11, :cond_1

    move-object v11, v12

    goto :goto_2

    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v11

    if-eqz v11, :cond_2

    move v11, v10

    goto :goto_1

    :cond_2
    move v11, v0

    :goto_1
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v13

    if-eqz v13, :cond_3

    move v13, v10

    move-object v10, v11

    move v11, v13

    :goto_3
    move-object v14, v12

    goto :goto_4

    :cond_3
    move v13, v10

    move-object v10, v11

    move v11, v0

    goto :goto_3

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v12

    move v15, v13

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v16, v14

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    move/from16 v17, v15

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v18, v16

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v16

    move/from16 v19, v17

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v20, v18

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v18

    move/from16 v21, v19

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v22

    if-nez v22, :cond_4

    move-object/from16 v22, v20

    goto :goto_5

    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v23

    if-nez v23, :cond_5

    move-object/from16 v23, v20

    move-object/from16 v24, v23

    :goto_6
    move-object/from16 v20, v22

    goto :goto_7

    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    move-object/from16 v24, v20

    goto :goto_6

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v25

    if-nez v25, :cond_6

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    goto :goto_9

    :cond_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v25

    if-eqz v25, :cond_7

    move/from16 v25, v21

    goto :goto_8

    :cond_7
    move/from16 v25, v0

    :goto_8
    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v25

    move-object/from16 v26, v24

    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v24

    move/from16 v27, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v25

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v25

    move-object/from16 v28, v26

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v26

    move/from16 v29, v27

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v30

    if-nez v30, :cond_8

    move-object/from16 v30, v28

    goto :goto_a

    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v30

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v31

    if-nez v31, :cond_9

    move-object/from16 v31, v28

    move-object/from16 v32, v31

    :goto_b
    move-object/from16 v28, v30

    goto :goto_c

    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v31

    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v31

    move-object/from16 v32, v28

    goto :goto_b

    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v33

    if-nez v33, :cond_a

    move-object/from16 v33, v32

    move-object/from16 v34, v33

    goto :goto_e

    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v33

    if-eqz v33, :cond_b

    move/from16 v33, v29

    goto :goto_d

    :cond_b
    move/from16 v33, v0

    :goto_d
    invoke-static/range {v33 .. v33}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v33

    move-object/from16 v34, v32

    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v32

    move/from16 v35, v29

    move-object/from16 v29, v31

    move-object/from16 v31, v33

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v33

    move-object/from16 v36, v34

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v34

    move/from16 v37, v35

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v35

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v38

    if-nez v38, :cond_c

    move-object/from16 v38, v36

    goto :goto_f

    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v38

    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v38

    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v39

    if-nez v39, :cond_d

    move-object/from16 v39, v36

    move-object/from16 v40, v39

    :goto_10
    move-object/from16 v36, v38

    goto :goto_11

    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v39

    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v39

    move-object/from16 v40, v36

    goto :goto_10

    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v38

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v41

    if-nez v41, :cond_e

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    goto :goto_13

    :cond_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v41

    if-eqz v41, :cond_f

    move/from16 v41, v37

    goto :goto_12

    :cond_f
    move/from16 v41, v0

    :goto_12
    invoke-static/range {v41 .. v41}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v41

    move-object/from16 v42, v40

    :goto_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v40

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v43

    if-eqz v43, :cond_10

    move/from16 v43, v37

    move-object/from16 v37, v39

    move-object/from16 v39, v41

    move/from16 v41, v43

    :goto_14
    move-object/from16 v44, v42

    goto :goto_15

    :cond_10
    move/from16 v43, v37

    move-object/from16 v37, v39

    move-object/from16 v39, v41

    move/from16 v41, v0

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v42

    move/from16 v45, v43

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v43

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v46

    if-eqz v46, :cond_11

    move/from16 v0, v45

    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v45

    if-nez v45, :cond_12

    move-object/from16 v45, v44

    goto :goto_16

    :cond_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v45

    invoke-static/range {v45 .. v45}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v45

    :goto_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v46

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v47

    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v48

    if-nez v48, :cond_13

    :goto_17
    move-object/from16 v48, v44

    move/from16 v44, v0

    goto :goto_18

    :cond_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v44

    invoke-static/range {v44 .. v44}, Lcom/whoop/whooplabs/data/domain/SurveyProvider;->valueOf(Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object v44

    goto :goto_17

    :goto_18
    invoke-direct/range {v1 .. v48}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep$Creator;->createFromParcel(Landroid/os/Parcel;)Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lcom/whoop/whooplabs/data/domain/ProtocolStep;
    .locals 0

    .line 1
    new-array p1, p1, [Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep$Creator;->newArray(I)[Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object p1

    return-object p1
.end method
