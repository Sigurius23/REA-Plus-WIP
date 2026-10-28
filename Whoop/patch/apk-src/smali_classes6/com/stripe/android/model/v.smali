.class public final enum Lcom/stripe/android/model/v;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/v;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum E:Lcom/stripe/android/model/v;

.field public static final enum F:Lcom/stripe/android/model/v;

.field public static final synthetic G:[Lcom/stripe/android/model/v;

.field public static final synthetic H:Lt83/b;

.field public static final x:Lcom/stripe/android/model/t;

.field public static final enum y:Lcom/stripe/android/model/v;

.field public static final enum z:Lcom/stripe/android/model/v;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/stripe/android/model/v;

    const/4 v1, 0x0

    const-string v2, ""

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/v;->y:Lcom/stripe/android/model/v;

    new-instance v1, Lcom/stripe/android/model/v;

    const/4 v2, 0x1

    const-string v3, "link_auth_token"

    const-string v4, "LinkAuthToken"

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/model/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/stripe/android/model/v;->z:Lcom/stripe/android/model/v;

    new-instance v2, Lcom/stripe/android/model/v;

    const/4 v3, 0x2

    const-string v4, "signup"

    const-string v5, "SignUp"

    invoke-direct {v2, v5, v3, v4}, Lcom/stripe/android/model/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/stripe/android/model/v;->E:Lcom/stripe/android/model/v;

    new-instance v3, Lcom/stripe/android/model/v;

    const/4 v4, 0x3

    const-string v5, "email"

    const-string v6, "Email"

    invoke-direct {v3, v6, v4, v5}, Lcom/stripe/android/model/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v4, Lcom/stripe/android/model/v;

    const/4 v5, 0x4

    const-string v6, "sms"

    const-string v7, "Sms"

    invoke-direct {v4, v7, v5, v6}, Lcom/stripe/android/model/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/stripe/android/model/v;->F:Lcom/stripe/android/model/v;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/model/v;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/v;->G:[Lcom/stripe/android/model/v;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/v;->H:Lt83/b;

    new-instance v0, Lcom/stripe/android/model/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/v;->x:Lcom/stripe/android/model/t;

    new-instance v0, Lcom/stripe/android/model/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/model/v;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/v;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/v;
    .locals 1

    const-class v0, Lcom/stripe/android/model/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/model/v;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/v;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/v;->G:[Lcom/stripe/android/model/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/model/v;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
