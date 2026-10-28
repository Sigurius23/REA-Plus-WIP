.class public final enum Ly00/l0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum E:Ly00/l0;

.field public static final enum F:Ly00/l0;

.field public static final enum G:Ly00/l0;

.field public static final enum H:Ly00/l0;

.field public static final enum I:Ly00/l0;

.field public static final enum J:Ly00/l0;

.field public static final enum K:Ly00/l0;

.field public static final synthetic L:[Ly00/l0;

.field public static final enum x:Ly00/l0;

.field public static final enum y:Ly00/l0;

.field public static final enum z:Ly00/l0;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Ly00/l0;

    const/4 v1, 0x0

    const-string v2, "clicked_checkbox_nospm_mobile_v0"

    const-string v3, "Checkbox"

    invoke-direct {v0, v3, v1, v2}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly00/l0;->x:Ly00/l0;

    new-instance v1, Ly00/l0;

    const/4 v2, 0x1

    const-string v3, "clicked_checkbox_nospm_mobile_v0_0"

    const-string v4, "CheckboxWithPrefilledEmail"

    invoke-direct {v1, v4, v2, v3}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly00/l0;->y:Ly00/l0;

    new-instance v2, Ly00/l0;

    const/4 v3, 0x2

    const-string v4, "clicked_checkbox_nospm_mobile_v0_1"

    const-string v5, "CheckboxWithPrefilledEmailAndPhone"

    invoke-direct {v2, v5, v3, v4}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Ly00/l0;->z:Ly00/l0;

    new-instance v3, Ly00/l0;

    const/4 v4, 0x3

    const-string v5, "implied_consent_withspm_mobile_v0"

    const-string v6, "Implied"

    invoke-direct {v3, v6, v4, v5}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly00/l0;->E:Ly00/l0;

    new-instance v4, Ly00/l0;

    const/4 v5, 0x4

    const-string v6, "implied_consent_withspm_mobile_v0_0"

    const-string v7, "ImpliedWithPrefilledEmail"

    invoke-direct {v4, v7, v5, v6}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Ly00/l0;->F:Ly00/l0;

    new-instance v5, Ly00/l0;

    const/4 v6, 0x5

    const-string v7, "prechecked_opt_in_box_prefilled_all"

    const-string v8, "PrecheckedOptInBoxPrefilledAll"

    invoke-direct {v5, v8, v6, v7}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Ly00/l0;->G:Ly00/l0;

    new-instance v6, Ly00/l0;

    const/4 v7, 0x6

    const-string v8, "prechecked_opt_in_box_prefilled_some"

    const-string v9, "PrecheckedOptInBoxPrefilledSome"

    invoke-direct {v6, v9, v7, v8}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Ly00/l0;->H:Ly00/l0;

    new-instance v7, Ly00/l0;

    const/4 v8, 0x7

    const-string v9, "prechecked_opt_in_box_prefilled_none"

    const-string v10, "PrecheckedOptInBoxPrefilledNone"

    invoke-direct {v7, v10, v8, v9}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Ly00/l0;->I:Ly00/l0;

    new-instance v8, Ly00/l0;

    const/16 v9, 0x8

    const-string v10, "sign_up_opt_in_mobile_checked"

    const-string v11, "SignUpOptInMobileChecked"

    invoke-direct {v8, v11, v9, v10}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Ly00/l0;->J:Ly00/l0;

    new-instance v9, Ly00/l0;

    const/16 v10, 0x9

    const-string v11, "sign_up_opt_in_mobile_prechecked"

    const-string v12, "SignUpOptInMobilePrechecked"

    invoke-direct {v9, v12, v10, v11}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Ly00/l0;->K:Ly00/l0;

    new-instance v10, Ly00/l0;

    const/16 v11, 0xa

    const-string v12, "entered_phone_number_clicked_save_to_link"

    const-string v13, "EnteredPhoneNumberClickedSaveToLink"

    invoke-direct {v10, v13, v11, v12}, Ly00/l0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    filled-new-array/range {v0 .. v10}, [Ly00/l0;

    move-result-object v0

    sput-object v0, Ly00/l0;->L:[Ly00/l0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ly00/l0;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly00/l0;
    .locals 1

    const-class v0, Ly00/l0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly00/l0;

    return-object p0
.end method

.method public static values()[Ly00/l0;
    .locals 1

    sget-object v0, Ly00/l0;->L:[Ly00/l0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly00/l0;

    return-object v0
.end method
