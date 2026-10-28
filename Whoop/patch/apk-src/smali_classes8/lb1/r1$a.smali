.class public abstract synthetic Llb1/r1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llb1/r1;
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


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$FileType;->values()[Lcom/whoop/design/models/items/FileViewerModel$FileType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/whoop/design/models/items/FileViewerModel$FileType;->IMAGE:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$FileType;->PDF:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$FileType;->UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Llb1/r1$a;->a:[I

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->values()[Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->RELATIVE:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->ABSOLUTE:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, Llb1/r1$a;->b:[I

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->values()[Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_5
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->FIT:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->FILL:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Llb1/r1$a;->c:[I

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->values()[Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->NONE:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->PINCH:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->FIT:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, Llb1/r1$a;->d:[I

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->values()[Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_a
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->LEADING:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :try_start_b
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v0, v4
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->TRAILING:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    sput-object v0, Llb1/r1$a;->e:[I

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->values()[Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_d
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->TOP:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :try_start_e
    sget-object v1, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    sget-object v1, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->BOTTOM:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    sput-object v0, Llb1/r1$a;->f:[I

    return-void
.end method
