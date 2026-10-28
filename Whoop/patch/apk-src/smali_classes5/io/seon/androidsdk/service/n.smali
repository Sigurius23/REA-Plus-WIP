.class public final Lio/seon/androidsdk/service/n;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final i:[Ljava/lang/String;

.field public static final j:Lbu/c;

.field public static final k:Ljava/util/UUID;

.field public static final l:Ljava/util/ArrayList;

.field public static final m:Lio/seon/androidsdk/service/r0;

.field public static final n:Lio/seon/androidsdk/service/r0;


# instance fields
.field public e:Landroid/view/accessibility/AccessibilityManager;

.field public f:Landroid/hardware/display/DisplayManager;

.field public g:Landroid/content/pm/PackageManager;

.field public h:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 30

    const-string v7, "interfering_apps"

    const-string v8, "media_drm_id"

    const-string v0, "audio_mute_status"

    const-string v1, "audio_volume_current"

    const-string v2, "is_remote_control_connected"

    const-string v3, "remote_control_provider"

    const-string v4, "is_screen_being_mirrored"

    const-string v5, "is_click_automator_installed"

    const-string v6, "enabled_accessibility_apps"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/n;->i:[Ljava/lang/String;

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/n;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/n;->j:Lbu/c;

    new-instance v0, Ljava/util/UUID;

    const-wide v1, -0x121074568629b532L    # -3.563403477674908E221

    const-wide v3, -0x5c37d8232ae2de13L

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    sput-object v0, Lio/seon/androidsdk/service/n;->k:Ljava/util/UUID;

    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x1077efecc0b24d02L

    const-wide v3, -0x531cc3e1ad1d04b5L    # -1.8442503140481377E-92

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v11, Ljava/util/UUID;

    const-wide v1, -0x1d8e62a7567a4c37L    # -1.6229728350858627E166

    const-wide v3, 0x781ab030af78d30eL    # 3.524813189889319E270

    invoke-direct {v11, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v1, Ljava/util/UUID;

    const-wide v2, -0x65fb0f8667bfbd7aL

    const-wide v4, -0x546d19a41f77a06bL    # -8.640911267670052E-99

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v5, Ljava/util/UUID;

    const-wide v2, 0x6dd8b3c345f44a68L

    const-wide v6, -0x40c59be972fe5b5aL    # -4.0269423062129007E-4

    invoke-direct {v5, v2, v3, v6, v7}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v6, Ljava/util/UUID;

    const-wide v2, -0xdc61896105cb7b0L

    const-wide v7, -0x63e956fc396cd105L

    invoke-direct {v6, v2, v3, v7, v8}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v7, Ljava/util/UUID;

    const-wide v2, 0x616c746963617374L    # 2.0002404882412996E161

    const-wide v8, 0x2d50726f74656374L    # 2.018498121094357E-90

    invoke-direct {v7, v2, v3, v8, v9}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v8, Ljava/util/UUID;

    const-wide v2, -0x6b317904f800b0bdL    # -1.857124211486329E-208

    const-wide v9, -0x52476c2d0569735eL    # -1.930447046979883E-88

    invoke-direct {v8, v2, v3, v9, v10}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v10, Ljava/util/UUID;

    const-wide v2, 0x279fe473512c48feL    # 7.904396207581822E-118

    const-wide v12, -0x52172e8901194bf1L    # -1.5594876332071613E-87

    invoke-direct {v10, v2, v3, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v9, Ljava/util/UUID;

    const-wide v2, 0x3d5e6d359b9a41e8L    # 4.3238798128379746E-13

    const-wide v12, -0x47bc22c3918d3bd4L

    invoke-direct {v9, v2, v3, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v12, Ljava/util/UUID;

    const-wide v2, 0x644fe7b5260f4fadL    # 1.5782206271797283E175

    const-wide v13, -0x6b65f89d004fab4cL

    invoke-direct {v12, v2, v3, v13, v14}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v13, Ljava/util/UUID;

    const-wide v2, 0x37c332587b994c7eL    # 4.407337595420064E-40

    const-wide v14, -0x4ea2e6508bb7deacL    # -6.588082024556869E-71

    invoke-direct {v13, v2, v3, v14, v15}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v14, Ljava/util/UUID;

    const-wide v2, 0x45d481cb8fe049c0L    # 2.5386451686397094E28

    move-object/from16 v29, v0

    move-object/from16 v19, v1

    const-wide v0, -0x525654d2dbaa4d0eL    # -1.0080787127743305E-88

    invoke-direct {v14, v2, v3, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v15, Ljava/util/UUID;

    const-wide v0, -0x230b1c1c9d0ea7e8L    # -6.219283612281491E139

    const-wide v2, 0x7ba60a6fe33ff3ddL    # 4.195199657592593E287

    invoke-direct {v15, v0, v1, v2, v3}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v0, Ljava/util/UUID;

    const-wide v1, 0x35bf197b530e42d7L    # 8.312174775092534E-50

    const-wide v3, -0x749ae4b40beaf8f1L    # -8.996477824093255E-254

    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v1, Ljava/util/UUID;

    const-wide v2, -0x7f594181ebb7b3c9L

    move-object/from16 v16, v5

    const-wide v4, -0x618f2a5141fb372eL

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v2, Ljava/util/UUID;

    const-wide v3, 0x5e629af538da4063L    # 4.646486536138129E146

    move-object v5, v0

    move-object/from16 v17, v1

    const-wide v0, -0x768868004266fd2cL    # -4.682962702012726E-263

    invoke-direct {v2, v3, v4, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v0, Ljava/util/UUID;

    const-wide v3, 0x6a99532d869f5922L    # 3.1760331697990193E205

    move-object/from16 v18, v2

    const-wide v1, -0x656eeec5484e1d0dL

    invoke-direct {v0, v3, v4, v1, v2}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v1, Ljava/util/UUID;

    const-wide v2, -0x524be3dbd240b593L    # -1.5795441829625505E-88

    move-object/from16 v20, v5

    const-wide v4, -0x6a74bba83f2d846bL

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v2, Ljava/util/UUID;

    const-wide v3, 0x1f83e1e86ee94f0dL    # 7.240727944309351E-157

    move-object v5, v0

    move-object/from16 v21, v1

    const-wide v0, -0x45d0a13b1c12e59aL    # -1.97973743253654E-28

    invoke-direct {v2, v3, v4, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v0, Ljava/util/UUID;

    const-wide v3, -0x66d3b9193bc8b767L

    move-object/from16 v22, v2

    const-wide v1, -0x495faf056e52f1c7L    # -1.4290024310091166E-45

    invoke-direct {v0, v3, v4, v1, v2}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v1, Ljava/util/UUID;

    const-wide v2, -0x597ed62ca8a4b0e6L    # -3.245447789535373E-123

    move-object/from16 v23, v5

    const-wide v4, -0x6345cddc7b93083dL

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v2, Ljava/util/UUID;

    const-wide v3, -0x55ee698033feb5b6L    # -4.792865200363992E-106

    move-object v5, v0

    move-object/from16 v24, v1

    const-wide v0, -0x71663a2c222015d3L

    invoke-direct {v2, v3, v4, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v0, Ljava/util/UUID;

    const-wide v3, -0x65d8227d021db8dbL

    move-object/from16 v25, v2

    const-wide v1, -0x7343bdcb55f913f7L

    invoke-direct {v0, v3, v4, v1, v2}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v1, Ljava/util/UUID;

    const-wide v2, -0x4bbeca793a730050L    # -5.48313168342113E-57

    move-object/from16 v26, v5

    const-wide v4, -0x6b5a2b7693e5093dL    # -3.3201000592026955E-209

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v2, Ljava/util/UUID;

    const-wide v3, 0x793b79569f944946L    # 9.512125946396106E275

    move-object v5, v0

    move-object/from16 v27, v1

    const-wide v0, -0x56bddc181081bb4cL    # -6.03441322045799E-110

    invoke-direct {v2, v3, v4, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v28, v26

    move-object/from16 v26, v5

    move-object/from16 v5, v16

    move-object/from16 v16, v20

    move-object/from16 v20, v23

    move-object/from16 v23, v28

    move-object/from16 v28, v2

    filled-new-array/range {v5 .. v29}, [Ljava/util/UUID;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lio/seon/androidsdk/service/n;->l:Ljava/util/ArrayList;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    const-wide/32 v1, 0x493e0

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/n;->m:Lio/seon/androidsdk/service/r0;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/n;->n:Lio/seon/androidsdk/service/r0;

    return-void
.end method

.method public static h()[Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/n;->k:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lio/seon/androidsdk/service/n;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v2

    move v4, v3

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v4, v6, :cond_2

    :try_start_0
    new-instance v6, Landroid/media/MediaDrm;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/UUID;

    invoke-direct {v6, v7}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v5, "deviceUniqueId"

    invoke-virtual {v6, v5}, Landroid/media/MediaDrm;->getPropertyByteArray(Ljava/lang/String;)[B

    move-result-object v5

    const-string v7, "SHA-256"

    invoke-static {v7}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/security/MessageDigest;->update([B)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ","

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v7

    invoke-static {v7}, Lio/seon/androidsdk/service/o;->b([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v6}, Landroid/media/MediaDrm;->close()V

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v5, v6

    goto :goto_1

    :catch_0
    move-object v5, v6

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Landroid/media/MediaDrm;->close()V

    :cond_0
    throw v0

    :catch_1
    :goto_2
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/media/MediaDrm;->close()V

    :goto_3
    move-object v5, v2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v3, v2, :cond_3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_3
    return-object v1
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 11

    const-string v0, "audio"

    sget-object v1, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x3

    const/4 v6, 0x0

    :try_start_0
    iget-object v7, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    invoke-virtual {v7, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/media/AudioManager;

    invoke-virtual {v7}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v7

    const/4 v8, 0x2

    if-eq v7, v8, :cond_0

    move v7, v4

    goto :goto_0

    :cond_0
    move v7, v3

    :goto_0
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    :goto_1
    move-object v7, v6

    goto :goto_2

    :catch_0
    move-exception v7

    invoke-virtual {v1, v5, v7}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1

    :goto_2
    const-string v8, "audio_mute_status"

    invoke-virtual {v2, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v7, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    invoke-virtual {v7, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/media/AudioManager;

    invoke-virtual {v7, v5}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v7

    iget-object v8, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    invoke-virtual {v8, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-virtual {v0, v5}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    int-to-double v7, v7

    int-to-double v9, v0

    div-double/2addr v7, v9

    const-wide/high16 v9, 0x4059000000000000L    # 100.0

    mul-double/2addr v7, v9

    double-to-int v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    :goto_3
    move-object v0, v6

    goto :goto_4

    :catch_1
    move-exception v0

    invoke-virtual {v1, v5, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_3

    :goto_4
    const-string v7, "audio_volume_current"

    invoke-virtual {v2, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/l;

    const/4 v7, 0x2

    invoke-direct {v0, p0, v7}, Lio/seon/androidsdk/service/l;-><init>(Lio/seon/androidsdk/service/n;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v7, "is_remote_control_connected"

    invoke-virtual {v2, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/l;

    const/4 v7, 0x3

    invoke-direct {v0, p0, v7}, Lio/seon/androidsdk/service/l;-><init>(Lio/seon/androidsdk/service/n;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v7, "remote_control_provider"

    invoke-virtual {v2, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object v0, p0, Lio/seon/androidsdk/service/n;->f:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catch_2
    move-exception v0

    :try_start_3
    const-string v7, "ConnDisp"

    invoke-static {v7, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v6

    :goto_5
    array-length v0, v0

    if-le v0, v4, :cond_1

    move v3, v4

    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :catch_3
    :try_start_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_7

    :catchall_2
    :goto_6
    move-object v0, v6

    goto :goto_7

    :catch_4
    move-exception v0

    invoke-virtual {v1, v5, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_6

    :goto_7
    const-string v3, "is_screen_being_mirrored"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/l;

    const/4 v3, 0x4

    invoke-direct {v0, p0, v3}, Lio/seon/androidsdk/service/l;-><init>(Lio/seon/androidsdk/service/n;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "is_click_automator_installed"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    invoke-virtual {p0}, Lio/seon/androidsdk/service/n;->i()Lco/e;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_8

    :cond_2
    iget-object v0, v0, Lco/e;->x:Ljava/util/ArrayList;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_a

    :catch_5
    move-exception v0

    goto :goto_9

    :catchall_3
    :goto_8
    move-object v0, v6

    goto :goto_a

    :goto_9
    invoke-virtual {v1, v5, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_8

    :goto_a
    const-string v3, "enabled_accessibility_apps"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    invoke-virtual {p0}, Lio/seon/androidsdk/service/n;->i()Lco/e;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_b

    :cond_3
    iget-object v6, v0, Lco/e;->w:Ljava/util/ArrayList;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_b

    :catch_6
    move-exception v0

    invoke-virtual {v1, v5, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_4
    :goto_b
    const-string v0, "interfering_apps"

    invoke-virtual {v2, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/l;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/l;-><init>(Lio/seon/androidsdk/service/n;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "media_drm_id"

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final b()Ljava/util/Map;
    .locals 8

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lio/seon/androidsdk/service/l;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/l;-><init>(Lio/seon/androidsdk/service/n;I)V

    invoke-static {v1}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "codec_hash"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/seon/androidsdk/service/l;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/l;-><init>(Lio/seon/androidsdk/service/n;I)V

    invoke-static {v1}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "display_flags"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/seon/androidsdk/service/m;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/m;-><init>(Lio/seon/androidsdk/service/g;I)V

    invoke-static {v1}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "media_drm_id_list"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    const/4 v2, 0x3

    sget-object v3, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    const-string v4, "current_active_audio_device"

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    :try_start_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1f

    if-lt v6, v7, :cond_0

    invoke-virtual {v1}, Landroid/media/AudioManager;->getCommunicationDevice()Landroid/media/AudioDeviceInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    const/4 v1, -0x1

    :goto_0
    :try_start_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    :goto_1
    move-object v1, v5

    goto :goto_2

    :catch_1
    move-exception v1

    invoke-virtual {v3, v2, v1}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1

    :goto_2
    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_1
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    :try_start_2
    invoke-virtual {p0}, Lio/seon/androidsdk/service/n;->j()Ljava/lang/Boolean;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catch_2
    move-exception v1

    invoke-virtual {v3, v2, v1}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_1
    :goto_4
    const-string v1, "is_speakerphone_active"

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 2

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object p1, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    const-string v0, "accessibility"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/n;->e:Landroid/view/accessibility/AccessibilityManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :try_start_2
    iget-object p1, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    const-string v0, "display"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/display/DisplayManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/n;->f:Landroid/hardware/display/DisplayManager;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :try_start_3
    iget-object p1, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/n;->g:Landroid/content/pm/PackageManager;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :try_start_4
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Landroidx/lifecycle/z0;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    :try_start_5
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lb3/n;

    invoke-direct {v0, p0}, Lb3/n;-><init>(Lio/seon/androidsdk/service/n;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :catchall_4
    return-void
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/n;->f:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "ConnDisp"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Landroid/view/Display;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final g()Ljava/lang/String;
    .locals 5

    const-string v0, "DRM"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/n;->k:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lio/seon/androidsdk/service/n;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_0

    invoke-static {}, Landroid/media/MediaDrm;->getSupportedCryptoSchemes()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/UUID;

    :try_start_0
    new-instance v3, Landroid/media/MediaDrm;

    invoke-direct {v3, v2}, Landroid/media/MediaDrm;-><init>(Ljava/util/UUID;)V

    const-string v2, "deviceUniqueId"

    invoke-virtual {v3, v2}, Landroid/media/MediaDrm;->getPropertyByteArray(Ljava/lang/String;)[B

    move-result-object v2

    const-string v4, "SHA-256"

    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-static {v2}, Lio/seon/androidsdk/service/o;->b([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Landroid/media/MediaDrm;->close()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/media/UnsupportedSchemeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object v2

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    goto :goto_2

    :goto_1
    invoke-static {v0, v2}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_3
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Suppressed"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_2
    sget-object v3, Lio/seon/androidsdk/service/n;->j:Lbu/c;

    const/4 v4, 0x6

    invoke-virtual {v3, v4, v2}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()Lco/e;
    .locals 11

    const-string v0, " "

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lio/seon/androidsdk/service/n;->e:Landroid/view/accessibility/AccessibilityManager;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "AccServ"

    invoke-static {v3, v2}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v2, v1

    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :catch_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/accessibilityservice/AccessibilityServiceInfo;

    :try_start_1
    invoke-virtual {v5}, Landroid/accessibilityservice/AccessibilityServiceInfo;->getResolveInfo()Landroid/content/pm/ResolveInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    invoke-virtual {v5}, Landroid/accessibilityservice/AccessibilityServiceInfo;->getResolveInfo()Landroid/content/pm/ResolveInfo;

    move-result-object v7

    iget-object v7, v7, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    invoke-virtual {v5}, Landroid/accessibilityservice/AccessibilityServiceInfo;->getResolveInfo()Landroid/content/pm/ResolveInfo;

    move-result-object v5

    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v8, "}"

    const-string v9, ""

    if-nez v6, :cond_2

    if-nez v7, :cond_1

    :try_start_2
    invoke-virtual {v5}, Landroid/content/pm/ActivityInfo;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "ActivityInfo{"

    invoke-virtual {v6, v7, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    goto :goto_2

    :cond_1
    invoke-virtual {v7}, Landroid/content/pm/ProviderInfo;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "ProviderInfo{"

    invoke-virtual {v5, v6, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    iget-object v5, v7, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Landroid/content/pm/ServiceInfo;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "ServiceInfo{"

    invoke-virtual {v5, v7, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, v6, Landroid/content/pm/ServiceInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object v10, v6

    move-object v6, v5

    move-object v5, v10

    :goto_2
    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    aget-object v6, v6, v7

    :cond_3
    iget-object v7, p0, Lio/seon/androidsdk/service/n;->g:Landroid/content/pm/PackageManager;

    if-eqz v7, :cond_4

    invoke-virtual {v7, v5}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v2

    const/16 v7, 0x384

    if-le v5, v7, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    add-int/2addr v2, v5

    goto/16 :goto_1

    :cond_6
    new-instance v0, Lco/e;

    invoke-direct {v0, v4, v3}, Lco/e;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public final j()Ljava/lang/Boolean;
    .locals 7

    const-string v0, "audio"

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    if-nez v1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x22

    if-lt v2, v3, :cond_5

    invoke-virtual {v1}, Landroid/media/AudioManager;->getCommunicationDevice()Landroid/media/AudioDeviceInfo;

    move-result-object v0

    const/4 v2, 0x0

    const/16 v3, 0x1b

    const/16 v4, 0x18

    const/4 v5, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v0

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v1, v5}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object v0

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_4

    aget-object v6, v0, v2

    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v6

    if-eq v6, v5, :cond_3

    if-eq v6, v4, :cond_3

    if-eq v6, v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_5
    iget-object v1, p0, Lio/seon/androidsdk/service/n;->h:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
