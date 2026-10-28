.class public final enum Lq80/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq80/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lq80/m;",
        "",
        "Lq80/d;",
        "descriptor",
        "<init>",
        "(Ljava/lang/String;ILq80/d;)V",
        "Lq80/d;",
        "getDescriptor",
        "()Lq80/d;",
        "Profile",
        "Permissions",
        "AfterActivation",
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

.field private static final synthetic $VALUES:[Lq80/m;

.field public static final enum AfterActivation:Lq80/m;

.field public static final enum Permissions:Lq80/m;

.field public static final enum Profile:Lq80/m;


# instance fields
.field private final descriptor:Lq80/d;


# direct methods
.method private static final synthetic $values()[Lq80/m;
    .locals 3

    sget-object v0, Lq80/m;->Profile:Lq80/m;

    sget-object v1, Lq80/m;->Permissions:Lq80/m;

    sget-object v2, Lq80/m;->AfterActivation:Lq80/m;

    filled-new-array {v0, v1, v2}, [Lq80/m;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lq80/m;

    new-instance v1, Lq80/d;

    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->AL_PROFILE:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v3, Lpl0/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lpl0/a;-><init>(I)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v4, "activation_al_profile"

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lq80/d;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Profile"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lq80/m;-><init>(Ljava/lang/String;ILq80/d;)V

    sput-object v0, Lq80/m;->Profile:Lq80/m;

    new-instance v0, Lq80/m;

    new-instance v1, Lq80/d;

    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->AL_PERMISSIONS:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v3, Lpl0/a;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lpl0/a;-><init>(I)V

    const-string v4, "activation_al_permissions"

    invoke-direct/range {v1 .. v7}, Lq80/d;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Permissions"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lq80/m;-><init>(Ljava/lang/String;ILq80/d;)V

    sput-object v0, Lq80/m;->Permissions:Lq80/m;

    new-instance v0, Lq80/m;

    new-instance v1, Lq80/d;

    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->AL_AFTER_ACTIVATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    new-instance v3, Lpl0/a;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lpl0/a;-><init>(I)V

    const-string v4, "activation_al_after_activation"

    invoke-direct/range {v1 .. v7}, Lq80/d;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "AfterActivation"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lq80/m;-><init>(Ljava/lang/String;ILq80/d;)V

    sput-object v0, Lq80/m;->AfterActivation:Lq80/m;

    invoke-static {}, Lq80/m;->$values()[Lq80/m;

    move-result-object v0

    sput-object v0, Lq80/m;->$VALUES:[Lq80/m;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lq80/m;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILq80/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq80/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lq80/m;->descriptor:Lq80/d;

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/String;)Lj80/a;
    .locals 0

    sget-object p0, Lj80/a$o;->a:Lj80/a$o;

    return-object p0
.end method

.method private static final _init_$lambda$1(Ljava/lang/String;)Lj80/a;
    .locals 0

    sget-object p0, Lj80/a$n;->a:Lj80/a$n;

    return-object p0
.end method

.method private static final _init_$lambda$2(Ljava/lang/String;)Lj80/a;
    .locals 0

    sget-object p0, Lj80/a$m;->a:Lj80/a$m;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;)Lj80/a;
    .locals 0

    invoke-static {p0}, Lq80/m;->_init_$lambda$2(Ljava/lang/String;)Lj80/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Lj80/a;
    .locals 0

    invoke-static {p0}, Lq80/m;->_init_$lambda$0(Ljava/lang/String;)Lj80/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Lj80/a;
    .locals 0

    invoke-static {p0}, Lq80/m;->_init_$lambda$1(Ljava/lang/String;)Lj80/a;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lq80/m;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq80/m;
    .locals 1

    const-class v0, Lq80/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq80/m;

    return-object p0
.end method

.method public static values()[Lq80/m;
    .locals 1

    sget-object v0, Lq80/m;->$VALUES:[Lq80/m;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq80/m;

    return-object v0
.end method


# virtual methods
.method public final getDescriptor()Lq80/d;
    .locals 1

    iget-object v0, p0, Lq80/m;->descriptor:Lq80/d;

    return-object v0
.end method
