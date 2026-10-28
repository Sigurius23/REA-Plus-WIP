.class public final enum Lf70/s;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf70/s;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lf70/s;",
        "",
        "",
        "tagValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getTagValue",
        "()Ljava/lang/String;",
        "APP_LAUNCH",
        "POST_SIGN_IN",
        "POST_SIGN_UP",
        "PROFILE_COMPLETION",
        "TRIAL_ORDERED",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lf70/s;

.field public static final enum APP_LAUNCH:Lf70/s;

.field public static final enum POST_SIGN_IN:Lf70/s;

.field public static final enum POST_SIGN_UP:Lf70/s;

.field public static final enum PROFILE_COMPLETION:Lf70/s;

.field public static final enum TRIAL_ORDERED:Lf70/s;


# instance fields
.field private final tagValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lf70/s;
    .locals 5

    sget-object v0, Lf70/s;->APP_LAUNCH:Lf70/s;

    sget-object v1, Lf70/s;->POST_SIGN_IN:Lf70/s;

    sget-object v2, Lf70/s;->POST_SIGN_UP:Lf70/s;

    sget-object v3, Lf70/s;->PROFILE_COMPLETION:Lf70/s;

    sget-object v4, Lf70/s;->TRIAL_ORDERED:Lf70/s;

    filled-new-array {v0, v1, v2, v3, v4}, [Lf70/s;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf70/s;

    const/4 v1, 0x0

    const-string v2, "app_launch"

    const-string v3, "APP_LAUNCH"

    invoke-direct {v0, v3, v1, v2}, Lf70/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf70/s;->APP_LAUNCH:Lf70/s;

    new-instance v0, Lf70/s;

    const/4 v1, 0x1

    const-string v2, "post_sign_in"

    const-string v3, "POST_SIGN_IN"

    invoke-direct {v0, v3, v1, v2}, Lf70/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf70/s;->POST_SIGN_IN:Lf70/s;

    new-instance v0, Lf70/s;

    const/4 v1, 0x2

    const-string v2, "post_sign_up"

    const-string v3, "POST_SIGN_UP"

    invoke-direct {v0, v3, v1, v2}, Lf70/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf70/s;->POST_SIGN_UP:Lf70/s;

    new-instance v0, Lf70/s;

    const/4 v1, 0x3

    const-string v2, "profile_completion"

    const-string v3, "PROFILE_COMPLETION"

    invoke-direct {v0, v3, v1, v2}, Lf70/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf70/s;->PROFILE_COMPLETION:Lf70/s;

    new-instance v0, Lf70/s;

    const/4 v1, 0x4

    const-string v2, "trial_ordered"

    const-string v3, "TRIAL_ORDERED"

    invoke-direct {v0, v3, v1, v2}, Lf70/s;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lf70/s;->TRIAL_ORDERED:Lf70/s;

    invoke-static {}, Lf70/s;->$values()[Lf70/s;

    move-result-object v0

    sput-object v0, Lf70/s;->$VALUES:[Lf70/s;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lf70/s;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lf70/s;->tagValue:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lf70/s;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf70/s;
    .locals 1

    const-class v0, Lf70/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf70/s;

    return-object p0
.end method

.method public static values()[Lf70/s;
    .locals 1

    sget-object v0, Lf70/s;->$VALUES:[Lf70/s;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf70/s;

    return-object v0
.end method


# virtual methods
.method public final getTagValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf70/s;->tagValue:Ljava/lang/String;

    return-object v0
.end method
