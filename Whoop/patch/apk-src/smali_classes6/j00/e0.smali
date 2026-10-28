.class public final enum Lj00/e0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Lj00/e0;

.field public static final enum F:Lj00/e0;

.field public static final enum G:Lj00/e0;

.field public static final enum H:Lj00/e0;

.field public static final enum I:Lj00/e0;

.field public static final enum J:Lj00/e0;

.field public static final synthetic K:[Lj00/e0;

.field public static final enum w:Lj00/e0;

.field public static final enum x:Lj00/e0;

.field public static final enum y:Lj00/e0;

.field public static final enum z:Lj00/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lj00/e0;

    const-string v1, "Checkbox"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj00/e0;->w:Lj00/e0;

    new-instance v1, Lj00/e0;

    const-string v2, "CheckboxWithPrefilledEmail"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj00/e0;->x:Lj00/e0;

    new-instance v2, Lj00/e0;

    const-string v3, "CheckboxWithPrefilledEmailAndPhone"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lj00/e0;->y:Lj00/e0;

    new-instance v3, Lj00/e0;

    const-string v4, "Implied"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj00/e0;->z:Lj00/e0;

    new-instance v4, Lj00/e0;

    const-string v5, "ImpliedWithPrefilledEmail"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lj00/e0;->E:Lj00/e0;

    new-instance v5, Lj00/e0;

    const-string v6, "DefaultOptInWithAllPrefilled"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lj00/e0;->F:Lj00/e0;

    new-instance v6, Lj00/e0;

    const-string v7, "DefaultOptInWithSomePrefilled"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lj00/e0;->G:Lj00/e0;

    new-instance v7, Lj00/e0;

    const-string v8, "DefaultOptInWithNonePrefilled"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lj00/e0;->H:Lj00/e0;

    new-instance v8, Lj00/e0;

    const-string v9, "SignUpOptInMobileChecked"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lj00/e0;->I:Lj00/e0;

    new-instance v9, Lj00/e0;

    const-string v10, "SignUpOptInMobilePrechecked"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lj00/e0;->J:Lj00/e0;

    filled-new-array/range {v0 .. v9}, [Lj00/e0;

    move-result-object v0

    sput-object v0, Lj00/e0;->K:[Lj00/e0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj00/e0;
    .locals 1

    const-class v0, Lj00/e0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj00/e0;

    return-object p0
.end method

.method public static values()[Lj00/e0;
    .locals 1

    sget-object v0, Lj00/e0;->K:[Lj00/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj00/e0;

    return-object v0
.end method
