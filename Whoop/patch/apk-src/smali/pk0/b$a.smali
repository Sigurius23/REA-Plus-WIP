.class public abstract synthetic Lpk0/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpk0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
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


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I

.field public static final synthetic d:[I

.field public static final synthetic e:[I

.field public static final synthetic f:[I

.field public static final synthetic g:[I

.field public static final synthetic h:[I


# direct methods
.method static constructor <clinit>()V
    .locals 25

    invoke-static {}, Lst0/v;->values()[Lst0/v;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lst0/v;->MAVERICK:Lst0/v;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lst0/v;->PUFFIN:Lst0/v;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lst0/v;->GOOSE:Lst0/v;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v4, 0x4

    :try_start_3
    sget-object v5, Lst0/v;->GEN_4:Lst0/v;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    sput-object v0, Lpk0/b$a;->a:[I

    invoke-static {}, Llt0/c$a;->values()[Llt0/c$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4
    sget-object v5, Llt0/c$a;->COMMAND:Llt0/c$a;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v1, v0, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v5, Llt0/c$a;->COMMAND_RESPONSE:Llt0/c$a;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v2, v0, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v5, Llt0/c$a;->PUFFIN_COMMAND:Llt0/c$a;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v3, v0, v5
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v5, Llt0/c$a;->PUFFIN_COMMAND_RESPONSE:Llt0/c$a;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    const/4 v5, 0x5

    :try_start_8
    sget-object v6, Llt0/c$a;->HISTORICAL_DATA:Llt0/c$a;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    const/4 v6, 0x6

    :try_start_9
    sget-object v7, Llt0/c$a;->REALTIME_RAW_DATA:Llt0/c$a;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    const/4 v7, 0x7

    :try_start_a
    sget-object v8, Llt0/c$a;->REALTIME_DATA:Llt0/c$a;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    const/16 v8, 0x8

    :try_start_b
    sget-object v9, Llt0/c$a;->PUFFIN_EVENTS_FROM_STRAP:Llt0/c$a;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aput v8, v0, v9
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    const/16 v9, 0x9

    :try_start_c
    sget-object v10, Llt0/c$a;->EVENT:Llt0/c$a;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aput v9, v0, v10
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    const/16 v10, 0xa

    :try_start_d
    sget-object v11, Llt0/c$a;->CONSOLE_LOGS:Llt0/c$a;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aput v10, v0, v11
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    const/16 v11, 0xb

    :try_start_e
    sget-object v12, Llt0/c$a;->METADATA:Llt0/c$a;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aput v11, v0, v12
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    const/16 v12, 0xc

    :try_start_f
    sget-object v13, Llt0/c$a;->REALTIME_IMU_DATA_STREAM:Llt0/c$a;

    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aput v12, v0, v13
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    const/16 v13, 0xd

    :try_start_10
    sget-object v14, Llt0/c$a;->HISTORICAL_IMU_DATA_STREAM:Llt0/c$a;

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aput v13, v0, v14
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    const/16 v14, 0xe

    :try_start_11
    sget-object v15, Llt0/c$a;->RELATIVE_PUFFIN_EVENTS:Llt0/c$a;

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aput v14, v0, v15
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    const/16 v15, 0xf

    :try_start_12
    sget-object v16, Llt0/c$a;->RELATIVE_BATTERY_PACK_CONSOLE_LOGS:Llt0/c$a;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aput v15, v0, v16
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    const/16 v16, 0x10

    :try_start_13
    sget-object v17, Llt0/c$a;->PUFFIN_METADATA:Llt0/c$a;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v16, v0, v17
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    sput-object v0, Lpk0/b$a;->b:[I

    invoke-static {}, Llt0/l;->values()[Llt0/l;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_14
    sget-object v17, Llt0/l;->PUFFIN_GET_HELLO:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v1, v0, v17
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :try_start_15
    sget-object v17, Llt0/l;->SEND_HISTORICAL_DATA:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v2, v0, v17
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    :try_start_16
    sget-object v17, Llt0/l;->HISTORICAL_PULL_RESULT:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v3, v0, v17
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    :try_start_17
    sget-object v17, Llt0/l;->HISTORICAL_PULL_ABORT:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v4, v0, v17
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :try_start_18
    sget-object v17, Llt0/l;->PUFFIN_START_FW_LOAD:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v5, v0, v17
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    :try_start_19
    sget-object v17, Llt0/l;->PUFFIN_LOAD_FW_DATA:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v6, v0, v17
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :try_start_1a
    sget-object v17, Llt0/l;->PUFFIN_PROCESS_FW:Llt0/l;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v7, v0, v17
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    sput-object v0, Lpk0/b$a;->c:[I

    invoke-static {}, Llt0/e;->values()[Llt0/e;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_1b
    sget-object v17, Llt0/e;->REPORT_VERSION_INFO:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v1, v0, v17
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    :try_start_1c
    sget-object v17, Llt0/e;->GET_CLOCK_DEPRECATED:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v2, v0, v17
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    :try_start_1d
    sget-object v17, Llt0/e;->GET_BATTERY_LEVEL:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v3, v0, v17
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    :try_start_1e
    sget-object v17, Llt0/e;->GET_DATA_RANGE:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v4, v0, v17
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    :try_start_1f
    sget-object v17, Llt0/e;->GET_HELLO:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v5, v0, v17
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    :try_start_20
    sget-object v17, Llt0/e;->GET_HELLO_HARVARD:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v6, v0, v17
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_20 .. :try_end_20} :catch_20

    :catch_20
    :try_start_21
    sget-object v17, Llt0/e;->GET_LED_DRIVE:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v7, v0, v17
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_21} :catch_21

    :catch_21
    :try_start_22
    sget-object v17, Llt0/e;->GET_TIA_GAIN:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v8, v0, v17
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_22} :catch_22

    :catch_22
    :try_start_23
    sget-object v17, Llt0/e;->GET_BIAS_OFFSET:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v9, v0, v17
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_23} :catch_23

    :catch_23
    :try_start_24
    sget-object v17, Llt0/e;->SET_BIAS_OFFSET:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v10, v0, v17
    :try_end_24
    .catch Ljava/lang/NoSuchFieldError; {:try_start_24 .. :try_end_24} :catch_24

    :catch_24
    :try_start_25
    sget-object v17, Llt0/e;->RUN_HAPTIC_PATTERN_MAVERICK:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v11, v0, v17
    :try_end_25
    .catch Ljava/lang/NoSuchFieldError; {:try_start_25 .. :try_end_25} :catch_25

    :catch_25
    :try_start_26
    sget-object v17, Llt0/e;->ABORT_HISTORICAL_TRANSMITS:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v12, v0, v17
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_26} :catch_26

    :catch_26
    :try_start_27
    sget-object v17, Llt0/e;->START_FIRMWARE_LOAD:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v13, v0, v17
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_27} :catch_27

    :catch_27
    :try_start_28
    sget-object v17, Llt0/e;->START_FIRMWARE_LOAD_NEW:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v14, v0, v17
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_28} :catch_28

    :catch_28
    :try_start_29
    sget-object v17, Llt0/e;->LOAD_FIRMWARE_DATA:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v15, v0, v17
    :try_end_29
    .catch Ljava/lang/NoSuchFieldError; {:try_start_29 .. :try_end_29} :catch_29

    :catch_29
    :try_start_2a
    sget-object v17, Llt0/e;->LOAD_FIRMWARE_DATA_NEW:Llt0/e;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aput v16, v0, v17
    :try_end_2a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2a .. :try_end_2a} :catch_2a

    :catch_2a
    const/16 v17, 0x11

    :try_start_2b
    sget-object v18, Llt0/e;->PROCESS_FIRMWARE_IMAGE:Llt0/e;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    move-result v18

    aput v17, v0, v18
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2b .. :try_end_2b} :catch_2b

    :catch_2b
    const/16 v18, 0x12

    :try_start_2c
    sget-object v19, Llt0/e;->PROCESS_FIRMWARE_IMAGE_NEW:Llt0/e;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    aput v18, v0, v19
    :try_end_2c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2c .. :try_end_2c} :catch_2c

    :catch_2c
    const/16 v19, 0x13

    :try_start_2d
    sget-object v20, Llt0/e;->VERIFY_FIRMWARE_IMAGE:Llt0/e;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->ordinal()I

    move-result v20

    aput v19, v0, v20
    :try_end_2d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2d .. :try_end_2d} :catch_2d

    :catch_2d
    const/16 v20, 0x14

    :try_start_2e
    sget-object v21, Llt0/e;->VERIFY_CERTIFICATE:Llt0/e;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Enum;->ordinal()I

    move-result v21

    aput v20, v0, v21
    :try_end_2e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2e .. :try_end_2e} :catch_2e

    :catch_2e
    const/16 v21, 0x15

    :try_start_2f
    sget-object v22, Llt0/e;->TOGGLE_GENERIC_HR_PROFILE:Llt0/e;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    move-result v22

    aput v21, v0, v22
    :try_end_2f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2f .. :try_end_2f} :catch_2f

    :catch_2f
    const/16 v22, 0x16

    :try_start_30
    sget-object v23, Llt0/e;->TOGGLE_REALTIME_HR:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    aput v22, v0, v23
    :try_end_30
    .catch Ljava/lang/NoSuchFieldError; {:try_start_30 .. :try_end_30} :catch_30

    :catch_30
    :try_start_31
    sget-object v23, Llt0/e;->SET_ALARM_TIME:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x17

    aput v24, v0, v23
    :try_end_31
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_31} :catch_31

    :catch_31
    :try_start_32
    sget-object v23, Llt0/e;->GET_ALARM_TIME:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x18

    aput v24, v0, v23
    :try_end_32
    .catch Ljava/lang/NoSuchFieldError; {:try_start_32 .. :try_end_32} :catch_32

    :catch_32
    :try_start_33
    sget-object v23, Llt0/e;->RUN_ALARM:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x19

    aput v24, v0, v23
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_33} :catch_33

    :catch_33
    :try_start_34
    sget-object v23, Llt0/e;->DISABLE_ALARM:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x1a

    aput v24, v0, v23
    :try_end_34
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_34} :catch_34

    :catch_34
    :try_start_35
    sget-object v23, Llt0/e;->GET_ADVERTISING_NAME_HARVARD:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x1b

    aput v24, v0, v23
    :try_end_35
    .catch Ljava/lang/NoSuchFieldError; {:try_start_35 .. :try_end_35} :catch_35

    :catch_35
    :try_start_36
    sget-object v23, Llt0/e;->SET_ADVERTISING_NAME_HARVARD:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x1c

    aput v24, v0, v23
    :try_end_36
    .catch Ljava/lang/NoSuchFieldError; {:try_start_36 .. :try_end_36} :catch_36

    :catch_36
    :try_start_37
    sget-object v23, Llt0/e;->GET_ADVERTISING_NAME:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x1d

    aput v24, v0, v23
    :try_end_37
    .catch Ljava/lang/NoSuchFieldError; {:try_start_37 .. :try_end_37} :catch_37

    :catch_37
    :try_start_38
    sget-object v23, Llt0/e;->SET_ADVERTISING_NAME:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x1e

    aput v24, v0, v23
    :try_end_38
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_38} :catch_38

    :catch_38
    :try_start_39
    sget-object v23, Llt0/e;->RUN_HAPTICS_PATTERN:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x1f

    aput v24, v0, v23
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_39} :catch_39

    :catch_39
    :try_start_3a
    sget-object v23, Llt0/e;->GET_ALL_HAPTICS_PATTERN:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x20

    aput v24, v0, v23
    :try_end_3a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3a .. :try_end_3a} :catch_3a

    :catch_3a
    :try_start_3b
    sget-object v23, Llt0/e;->ENTER_HIGH_FREQ_SYNC:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x21

    aput v24, v0, v23
    :try_end_3b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3b .. :try_end_3b} :catch_3b

    :catch_3b
    :try_start_3c
    sget-object v23, Llt0/e;->EXIT_HIGH_FREQ_SYNC:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x22

    aput v24, v0, v23
    :try_end_3c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3c .. :try_end_3c} :catch_3c

    :catch_3c
    :try_start_3d
    sget-object v23, Llt0/e;->GET_BODY_LOCATION_AND_STATUS:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x23

    aput v24, v0, v23
    :try_end_3d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3d .. :try_end_3d} :catch_3d

    :catch_3d
    :try_start_3e
    sget-object v23, Llt0/e;->TOGGLE_IMU_MODE_HISTORICAL:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x24

    aput v24, v0, v23
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3f
    sget-object v23, Llt0/e;->TOGGLE_IMU_MODE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x25

    aput v24, v0, v23
    :try_end_3f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3f .. :try_end_3f} :catch_3f

    :catch_3f
    :try_start_40
    sget-object v23, Llt0/e;->START_FF_KEY_EXCHANGE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x26

    aput v24, v0, v23
    :try_end_40
    .catch Ljava/lang/NoSuchFieldError; {:try_start_40 .. :try_end_40} :catch_40

    :catch_40
    :try_start_41
    sget-object v23, Llt0/e;->SEND_NEXT_FF:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x27

    aput v24, v0, v23
    :try_end_41
    .catch Ljava/lang/NoSuchFieldError; {:try_start_41 .. :try_end_41} :catch_41

    :catch_41
    :try_start_42
    sget-object v23, Llt0/e;->SET_FF_VALUE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x28

    aput v24, v0, v23
    :try_end_42
    .catch Ljava/lang/NoSuchFieldError; {:try_start_42 .. :try_end_42} :catch_42

    :catch_42
    :try_start_43
    sget-object v23, Llt0/e;->GET_FF_VALUE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x29

    aput v24, v0, v23
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_43} :catch_43

    :catch_43
    :try_start_44
    sget-object v23, Llt0/e;->STOP_HAPTICS:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x2a

    aput v24, v0, v23
    :try_end_44
    .catch Ljava/lang/NoSuchFieldError; {:try_start_44 .. :try_end_44} :catch_44

    :catch_44
    :try_start_45
    sget-object v23, Llt0/e;->SELECT_WRIST:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x2b

    aput v24, v0, v23
    :try_end_45
    .catch Ljava/lang/NoSuchFieldError; {:try_start_45 .. :try_end_45} :catch_45

    :catch_45
    :try_start_46
    sget-object v23, Llt0/e;->TOGGLE_LABRADOR_FILTERED:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x2c

    aput v24, v0, v23
    :try_end_46
    .catch Ljava/lang/NoSuchFieldError; {:try_start_46 .. :try_end_46} :catch_46

    :catch_46
    :try_start_47
    sget-object v23, Llt0/e;->TOGGLE_LABRADOR_RAW_SAVE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x2d

    aput v24, v0, v23
    :try_end_47
    .catch Ljava/lang/NoSuchFieldError; {:try_start_47 .. :try_end_47} :catch_47

    :catch_47
    :try_start_48
    sget-object v23, Llt0/e;->TOGGLE_LABRADOR_DATA_GENERATION:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x2e

    aput v24, v0, v23
    :try_end_48
    .catch Ljava/lang/NoSuchFieldError; {:try_start_48 .. :try_end_48} :catch_48

    :catch_48
    :try_start_49
    sget-object v23, Llt0/e;->START_DEVICE_CONFIG_KEY_EXCHANGE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x2f

    aput v24, v0, v23
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_49 .. :try_end_49} :catch_49

    :catch_49
    :try_start_4a
    sget-object v23, Llt0/e;->SEND_NEXT_DEVICE_CONFIG:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x30

    aput v24, v0, v23
    :try_end_4a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4a .. :try_end_4a} :catch_4a

    :catch_4a
    :try_start_4b
    sget-object v23, Llt0/e;->SET_DEVICE_CONFIG_VALUE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x31

    aput v24, v0, v23
    :try_end_4b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4b .. :try_end_4b} :catch_4b

    :catch_4b
    :try_start_4c
    sget-object v23, Llt0/e;->GET_DEVICE_CONFIG_VALUE:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x32

    aput v24, v0, v23
    :try_end_4c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4c .. :try_end_4c} :catch_4c

    :catch_4c
    :try_start_4d
    sget-object v23, Llt0/e;->START_RAW_DATA:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x33

    aput v24, v0, v23
    :try_end_4d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4d .. :try_end_4d} :catch_4d

    :catch_4d
    :try_start_4e
    sget-object v23, Llt0/e;->GET_BATTERY_PACK_INFO:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x34

    aput v24, v0, v23
    :try_end_4e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4e .. :try_end_4e} :catch_4e

    :catch_4e
    :try_start_4f
    sget-object v23, Llt0/e;->ENABLE_OPTICAL_DATA:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x35

    aput v24, v0, v23
    :try_end_4f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4f .. :try_end_4f} :catch_4f

    :catch_4f
    :try_start_50
    sget-object v23, Llt0/e;->TOGGLE_PERSISTENT_R20:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x36

    aput v24, v0, v23
    :try_end_50
    .catch Ljava/lang/NoSuchFieldError; {:try_start_50 .. :try_end_50} :catch_50

    :catch_50
    :try_start_51
    sget-object v23, Llt0/e;->TOGGLE_PERSISTENT_R21:Llt0/e;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    const/16 v24, 0x37

    aput v24, v0, v23
    :try_end_51
    .catch Ljava/lang/NoSuchFieldError; {:try_start_51 .. :try_end_51} :catch_51

    :catch_51
    sput-object v0, Lpk0/b$a;->d:[I

    invoke-static {}, Lfk0/b;->values()[Lfk0/b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_52
    sget-object v23, Lfk0/b;->STATE_OF_CHARGE:Lfk0/b;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    aput v1, v0, v23
    :try_end_52
    .catch Ljava/lang/NoSuchFieldError; {:try_start_52 .. :try_end_52} :catch_52

    :catch_52
    sput-object v0, Lpk0/b$a;->e:[I

    invoke-static {}, Lot0/a$b;->values()[Lot0/a$b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_53
    sget-object v23, Lot0/a$b;->BATTERY_LEVEL:Lot0/a$b;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    aput v1, v0, v23
    :try_end_53
    .catch Ljava/lang/NoSuchFieldError; {:try_start_53 .. :try_end_53} :catch_53

    :catch_53
    :try_start_54
    sget-object v23, Lot0/a$b;->BLE_CONNECTION_DOWN:Lot0/a$b;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    aput v2, v0, v23
    :try_end_54
    .catch Ljava/lang/NoSuchFieldError; {:try_start_54 .. :try_end_54} :catch_54

    :catch_54
    :try_start_55
    sget-object v23, Lot0/a$b;->BLE_CONNECTION_UP:Lot0/a$b;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    aput v3, v0, v23
    :try_end_55
    .catch Ljava/lang/NoSuchFieldError; {:try_start_55 .. :try_end_55} :catch_55

    :catch_55
    :try_start_56
    sget-object v23, Lot0/a$b;->BLE_REALTIME_HR_OFF:Lot0/a$b;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    aput v4, v0, v23
    :try_end_56
    .catch Ljava/lang/NoSuchFieldError; {:try_start_56 .. :try_end_56} :catch_56

    :catch_56
    :try_start_57
    sget-object v4, Lot0/a$b;->BLE_REALTIME_HR_ON:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v5, v0, v4
    :try_end_57
    .catch Ljava/lang/NoSuchFieldError; {:try_start_57 .. :try_end_57} :catch_57

    :catch_57
    :try_start_58
    sget-object v4, Lot0/a$b;->CHARGING_OFF:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v6, v0, v4
    :try_end_58
    .catch Ljava/lang/NoSuchFieldError; {:try_start_58 .. :try_end_58} :catch_58

    :catch_58
    :try_start_59
    sget-object v4, Lot0/a$b;->CHARGING_ON:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v7, v0, v4
    :try_end_59
    .catch Ljava/lang/NoSuchFieldError; {:try_start_59 .. :try_end_59} :catch_59

    :catch_59
    :try_start_5a
    sget-object v4, Lot0/a$b;->DOUBLE_TAP:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v8, v0, v4
    :try_end_5a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5a .. :try_end_5a} :catch_5a

    :catch_5a
    :try_start_5b
    sget-object v4, Lot0/a$b;->FLASH_INIT_COMPLETE:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v9, v0, v4
    :try_end_5b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5b .. :try_end_5b} :catch_5b

    :catch_5b
    :try_start_5c
    sget-object v4, Lot0/a$b;->RTC_LOST:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v10, v0, v4
    :try_end_5c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5c .. :try_end_5c} :catch_5c

    :catch_5c
    :try_start_5d
    sget-object v4, Lot0/a$b;->STRAP_CONDITION_REPORT:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v11, v0, v4
    :try_end_5d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5d .. :try_end_5d} :catch_5d

    :catch_5d
    :try_start_5e
    sget-object v4, Lot0/a$b;->SYSTEM_CONTROL:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v12, v0, v4
    :try_end_5e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5e .. :try_end_5e} :catch_5e

    :catch_5e
    :try_start_5f
    sget-object v4, Lot0/a$b;->WRIST_OFF:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v13, v0, v4
    :try_end_5f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5f .. :try_end_5f} :catch_5f

    :catch_5f
    :try_start_60
    sget-object v4, Lot0/a$b;->WRIST_ON:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v14, v0, v4
    :try_end_60
    .catch Ljava/lang/NoSuchFieldError; {:try_start_60 .. :try_end_60} :catch_60

    :catch_60
    :try_start_61
    sget-object v4, Lot0/a$b;->CONSOLE_OUTPUT:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v15, v0, v4
    :try_end_61
    .catch Ljava/lang/NoSuchFieldError; {:try_start_61 .. :try_end_61} :catch_61

    :catch_61
    :try_start_62
    sget-object v4, Lot0/a$b;->STRAP_DRIVEN_ALARM_SET:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v16, v0, v4
    :try_end_62
    .catch Ljava/lang/NoSuchFieldError; {:try_start_62 .. :try_end_62} :catch_62

    :catch_62
    :try_start_63
    sget-object v4, Lot0/a$b;->STRAP_DRIVEN_ALARM_EXECUTED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v17, v0, v4
    :try_end_63
    .catch Ljava/lang/NoSuchFieldError; {:try_start_63 .. :try_end_63} :catch_63

    :catch_63
    :try_start_64
    sget-object v4, Lot0/a$b;->APP_DRIVEN_ALARM_EXECUTED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v18, v0, v4
    :try_end_64
    .catch Ljava/lang/NoSuchFieldError; {:try_start_64 .. :try_end_64} :catch_64

    :catch_64
    :try_start_65
    sget-object v4, Lot0/a$b;->STRAP_DRIVEN_ALARM_DISABLED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v19, v0, v4
    :try_end_65
    .catch Ljava/lang/NoSuchFieldError; {:try_start_65 .. :try_end_65} :catch_65

    :catch_65
    :try_start_66
    sget-object v4, Lot0/a$b;->HAPTICS_FIRED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v20, v0, v4
    :try_end_66
    .catch Ljava/lang/NoSuchFieldError; {:try_start_66 .. :try_end_66} :catch_66

    :catch_66
    :try_start_67
    sget-object v4, Lot0/a$b;->HIGH_FREQ_SYNC_PROMPT:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v21, v0, v4
    :try_end_67
    .catch Ljava/lang/NoSuchFieldError; {:try_start_67 .. :try_end_67} :catch_67

    :catch_67
    :try_start_68
    sget-object v4, Lot0/a$b;->HIGH_FREQ_SYNC_ENABLED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v22, v0, v4
    :try_end_68
    .catch Ljava/lang/NoSuchFieldError; {:try_start_68 .. :try_end_68} :catch_68

    :catch_68
    :try_start_69
    sget-object v4, Lot0/a$b;->HIGH_FREQ_SYNC_DISABLED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/16 v5, 0x17

    aput v5, v0, v4
    :try_end_69
    .catch Ljava/lang/NoSuchFieldError; {:try_start_69 .. :try_end_69} :catch_69

    :catch_69
    :try_start_6a
    sget-object v4, Lot0/a$b;->BATTERY_PACK_CONNECTED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/16 v5, 0x18

    aput v5, v0, v4
    :try_end_6a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6a .. :try_end_6a} :catch_6a

    :catch_6a
    :try_start_6b
    sget-object v4, Lot0/a$b;->BATTERY_PACK_REMOVED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/16 v5, 0x19

    aput v5, v0, v4
    :try_end_6b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6b .. :try_end_6b} :catch_6b

    :catch_6b
    :try_start_6c
    sget-object v4, Lot0/a$b;->HAPTICS_TERMINATED:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/16 v5, 0x1a

    aput v5, v0, v4
    :try_end_6c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6c .. :try_end_6c} :catch_6c

    :catch_6c
    :try_start_6d
    sget-object v4, Lot0/a$b;->BATTERY_PACK_INFO:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/16 v5, 0x1b

    aput v5, v0, v4
    :try_end_6d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6d .. :try_end_6d} :catch_6d

    :catch_6d
    :try_start_6e
    sget-object v4, Lot0/a$b;->GENERIC_FIRMWARE_EVENT:Lot0/a$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/16 v5, 0x1c

    aput v5, v0, v4
    :try_end_6e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6e .. :try_end_6e} :catch_6e

    :catch_6e
    sput-object v0, Lpk0/b$a;->f:[I

    invoke-static {}, Ldk0/i$b;->values()[Ldk0/i$b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_6f
    sget-object v4, Ldk0/i$b;->HISTORY_START:Ldk0/i$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_6f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6f .. :try_end_6f} :catch_6f

    :catch_6f
    :try_start_70
    sget-object v4, Ldk0/i$b;->HISTORY_END:Ldk0/i$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_70
    .catch Ljava/lang/NoSuchFieldError; {:try_start_70 .. :try_end_70} :catch_70

    :catch_70
    :try_start_71
    sget-object v4, Ldk0/i$b;->HISTORY_COMPLETE:Ldk0/i$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_71
    .catch Ljava/lang/NoSuchFieldError; {:try_start_71 .. :try_end_71} :catch_71

    :catch_71
    sput-object v0, Lpk0/b$a;->g:[I

    invoke-static {}, Lfk0/g$b;->values()[Lfk0/g$b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_72
    sget-object v4, Lfk0/g$b;->HISTORY_START:Lfk0/g$b;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_72
    .catch Ljava/lang/NoSuchFieldError; {:try_start_72 .. :try_end_72} :catch_72

    :catch_72
    :try_start_73
    sget-object v1, Lfk0/g$b;->HISTORY_END:Lfk0/g$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_73
    .catch Ljava/lang/NoSuchFieldError; {:try_start_73 .. :try_end_73} :catch_73

    :catch_73
    :try_start_74
    sget-object v1, Lfk0/g$b;->HISTORY_COMPLETE:Lfk0/g$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_74
    .catch Ljava/lang/NoSuchFieldError; {:try_start_74 .. :try_end_74} :catch_74

    :catch_74
    sput-object v0, Lpk0/b$a;->h:[I

    return-void
.end method
