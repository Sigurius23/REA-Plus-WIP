.class final enum Lb80/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb80/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb80/c$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb80/c$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0018\u0008\u0082\u0081\u0002\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B1\u0008\u0002\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\r\u001a\u0004\u0008\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\r\u001a\u0004\u0008\u0011\u0010\u000fj\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lb80/c$b;",
        "",
        "",
        "",
        "analyticsNames",
        "screenName",
        "category",
        "viewLabel",
        "<init>",
        "(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Ljava/util/Set;",
        "getAnalyticsNames",
        "()Ljava/util/Set;",
        "Ljava/lang/String;",
        "getScreenName",
        "()Ljava/lang/String;",
        "getCategory",
        "getViewLabel",
        "Companion",
        "a",
        "GET_STARTED",
        "EMAIL_ONLY",
        "COUNTRY",
        "STATE",
        "MEMBER_OPTIONS",
        "SET_PASSWORD",
        "NAME_USERNAME",
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

.field private static final synthetic $VALUES:[Lb80/c$b;

.field public static final enum COUNTRY:Lb80/c$b;

.field public static final Companion:Lb80/c$b$a;

.field public static final enum EMAIL_ONLY:Lb80/c$b;

.field public static final enum GET_STARTED:Lb80/c$b;

.field public static final enum MEMBER_OPTIONS:Lb80/c$b;

.field public static final enum NAME_USERNAME:Lb80/c$b;

.field public static final enum SET_PASSWORD:Lb80/c$b;

.field public static final enum STATE:Lb80/c$b;


# instance fields
.field private final analyticsNames:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final category:Ljava/lang/String;

.field private final screenName:Ljava/lang/String;

.field private final viewLabel:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lb80/c$b;
    .locals 7

    sget-object v0, Lb80/c$b;->GET_STARTED:Lb80/c$b;

    sget-object v1, Lb80/c$b;->EMAIL_ONLY:Lb80/c$b;

    sget-object v2, Lb80/c$b;->COUNTRY:Lb80/c$b;

    sget-object v3, Lb80/c$b;->STATE:Lb80/c$b;

    sget-object v4, Lb80/c$b;->MEMBER_OPTIONS:Lb80/c$b;

    sget-object v5, Lb80/c$b;->SET_PASSWORD:Lb80/c$b;

    sget-object v6, Lb80/c$b;->NAME_USERNAME:Lb80/c$b;

    filled-new-array/range {v0 .. v6}, [Lb80/c$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lb80/c$b;

    const-string v1, "get_started_with_whoop"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    const/4 v5, 0x0

    const-string v6, "screen"

    const-string v1, "GET_STARTED"

    const/4 v2, 0x0

    const-string v4, "get_started_with_whoop"

    invoke-direct/range {v0 .. v6}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb80/c$b;->GET_STARTED:Lb80/c$b;

    new-instance v1, Lb80/c$b;

    const-string v0, "email_only"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const-string v6, "account_creation"

    const-string v7, "screen"

    const-string v2, "EMAIL_ONLY"

    const/4 v3, 0x1

    const-string v5, "email_only"

    invoke-direct/range {v1 .. v7}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lb80/c$b;->EMAIL_ONLY:Lb80/c$b;

    new-instance v2, Lb80/c$b;

    const-string v0, "location_country"

    const-string v1, "select_country"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    const-string v7, "account_creation"

    const-string v8, "screen"

    const-string v3, "COUNTRY"

    const/4 v4, 0x2

    const-string v6, "location_country"

    invoke-direct/range {v2 .. v8}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lb80/c$b;->COUNTRY:Lb80/c$b;

    new-instance v3, Lb80/c$b;

    const-string v0, "location_state"

    const-string v1, "select_state"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    const-string v8, "account_creation"

    const-string v9, "screen"

    const-string v4, "STATE"

    const/4 v5, 0x3

    const-string v7, "location_state"

    invoke-direct/range {v3 .. v9}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lb80/c$b;->STATE:Lb80/c$b;

    new-instance v4, Lb80/c$b;

    const-string v0, "member_options"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    const/4 v9, 0x0

    const-string v10, "screen"

    const-string v5, "MEMBER_OPTIONS"

    const/4 v6, 0x4

    const-string v8, "member_options"

    invoke-direct/range {v4 .. v10}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lb80/c$b;->MEMBER_OPTIONS:Lb80/c$b;

    new-instance v5, Lb80/c$b;

    const-string v0, "enter_password"

    const-string v1, "create_password"

    const-string v2, "set_up_your_password"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    const-string v10, "account_creation"

    const-string v11, "screen"

    const-string v6, "SET_PASSWORD"

    const/4 v7, 0x5

    const-string v9, "set_up_your_password"

    invoke-direct/range {v5 .. v11}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v5, Lb80/c$b;->SET_PASSWORD:Lb80/c$b;

    new-instance v6, Lb80/c$b;

    const-string v0, "name_username"

    const-string v1, "create_account"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    const-string v11, "account_creation"

    const-string v12, "screen"

    const-string v7, "NAME_USERNAME"

    const/4 v8, 0x6

    const-string v10, "name_username"

    invoke-direct/range {v6 .. v12}, Lb80/c$b;-><init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v6, Lb80/c$b;->NAME_USERNAME:Lb80/c$b;

    invoke-static {}, Lb80/c$b;->$values()[Lb80/c$b;

    move-result-object v0

    sput-object v0, Lb80/c$b;->$VALUES:[Lb80/c$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lb80/c$b;->$ENTRIES:Lt83/a;

    new-instance v0, Lb80/c$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb80/c$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lb80/c$b;->Companion:Lb80/c$b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb80/c$b;->analyticsNames:Ljava/util/Set;

    iput-object p4, p0, Lb80/c$b;->screenName:Ljava/lang/String;

    iput-object p5, p0, Lb80/c$b;->category:Ljava/lang/String;

    iput-object p6, p0, Lb80/c$b;->viewLabel:Ljava/lang/String;

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

    sget-object v0, Lb80/c$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lb80/c$b;
    .locals 1

    const-class v0, Lb80/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb80/c$b;

    return-object p0
.end method

.method public static values()[Lb80/c$b;
    .locals 1

    sget-object v0, Lb80/c$b;->$VALUES:[Lb80/c$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb80/c$b;

    return-object v0
.end method


# virtual methods
.method public final getAnalyticsNames()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb80/c$b;->analyticsNames:Ljava/util/Set;

    return-object v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb80/c$b;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getScreenName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb80/c$b;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public final getViewLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb80/c$b;->viewLabel:Ljava/lang/String;

    return-object v0
.end method
