.class public final enum Lng3/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lng3/r;


# static fields
.field public static final enum E:Lng3/b;

.field public static final enum F:Lng3/b;

.field public static final enum G:Lng3/b;

.field public static final synthetic H:[Lng3/b;

.field public static final enum x:Lng3/b;

.field public static final enum y:Lng3/b;

.field public static final enum z:Lng3/b;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v1, Lng3/b;

    sget-object v0, Ljg3/b;->y:Ljg3/b;

    const-string v0, "NANOS"

    const/4 v2, 0x0

    const-string v3, "Nanos"

    invoke-direct {v1, v0, v2, v3}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lng3/b;->x:Lng3/b;

    new-instance v2, Lng3/b;

    const/4 v0, 0x1

    const-string v3, "Micros"

    const-string v4, "MICROS"

    invoke-direct {v2, v4, v0, v3}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lng3/b;

    const/4 v0, 0x2

    const-string v4, "Millis"

    const-string v5, "MILLIS"

    invoke-direct {v3, v5, v0, v4}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lng3/b;

    const/4 v0, 0x3

    const-string v5, "Seconds"

    const-string v6, "SECONDS"

    invoke-direct {v4, v6, v0, v5}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v5, Lng3/b;

    const/4 v0, 0x4

    const-string v6, "Minutes"

    const-string v7, "MINUTES"

    invoke-direct {v5, v7, v0, v6}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v6, Lng3/b;

    const/4 v0, 0x5

    const-string v7, "Hours"

    const-string v8, "HOURS"

    invoke-direct {v6, v8, v0, v7}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v7, Lng3/b;

    const/4 v0, 0x6

    const-string v8, "HalfDays"

    const-string v9, "HALF_DAYS"

    invoke-direct {v7, v9, v0, v8}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v8, Lng3/b;

    const/4 v0, 0x7

    const-string v9, "Days"

    const-string v10, "DAYS"

    invoke-direct {v8, v10, v0, v9}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lng3/b;->y:Lng3/b;

    new-instance v9, Lng3/b;

    const/16 v0, 0x8

    const-string v10, "Weeks"

    const-string v11, "WEEKS"

    invoke-direct {v9, v11, v0, v10}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lng3/b;->z:Lng3/b;

    new-instance v10, Lng3/b;

    const/16 v0, 0x9

    const-string v11, "Months"

    const-string v12, "MONTHS"

    invoke-direct {v10, v12, v0, v11}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lng3/b;->E:Lng3/b;

    new-instance v11, Lng3/b;

    const/16 v0, 0xa

    const-string v12, "Years"

    const-string v13, "YEARS"

    invoke-direct {v11, v13, v0, v12}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lng3/b;->F:Lng3/b;

    new-instance v12, Lng3/b;

    const/16 v0, 0xb

    const-string v13, "Decades"

    const-string v14, "DECADES"

    invoke-direct {v12, v14, v0, v13}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v13, Lng3/b;

    const/16 v0, 0xc

    const-string v14, "Centuries"

    const-string v15, "CENTURIES"

    invoke-direct {v13, v15, v0, v14}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v14, Lng3/b;

    const/16 v0, 0xd

    const-string v15, "Millennia"

    move-object/from16 v16, v1

    const-string v1, "MILLENNIA"

    invoke-direct {v14, v1, v0, v15}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v15, Lng3/b;

    const/16 v0, 0xe

    const-string v1, "Eras"

    move-object/from16 v17, v2

    const-string v2, "ERAS"

    invoke-direct {v15, v2, v0, v1}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v0, Lng3/b;

    const-wide/32 v1, 0x3b9aca00

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    const-wide/32 v3, 0x3b9ac9ff

    invoke-static {v3, v4, v1, v2}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v1

    const-wide v3, 0x7fffffffffffffffL

    invoke-static {v3, v4, v1, v2}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v1

    const v3, 0x3b9aca00

    move-object/from16 v20, v5

    const-wide/32 v4, 0x3b9ac9ff

    invoke-static {v3, v4, v5}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v3

    invoke-static {v3, v1, v2}, Ljg3/b;->a(IJ)Ljg3/b;

    const-string v1, "FOREVER"

    const/16 v2, 0xf

    const-string v3, "Forever"

    invoke-direct {v0, v1, v2, v3}, Lng3/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lng3/b;->G:Lng3/b;

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v16, v0

    filled-new-array/range {v1 .. v16}, [Lng3/b;

    move-result-object v0

    sput-object v0, Lng3/b;->H:[Lng3/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lng3/b;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lng3/b;
    .locals 1

    const-class v0, Lng3/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lng3/b;

    return-object p0
.end method

.method public static values()[Lng3/b;
    .locals 1

    sget-object v0, Lng3/b;->H:[Lng3/b;

    invoke-virtual {v0}, [Lng3/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lng3/b;

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/j;J)Lng3/j;
    .locals 0

    invoke-interface {p1, p2, p3, p0}, Lng3/j;->c(JLng3/r;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lng3/b;->w:Ljava/lang/String;

    return-object v0
.end method
