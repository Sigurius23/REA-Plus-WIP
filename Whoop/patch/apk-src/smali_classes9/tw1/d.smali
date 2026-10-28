.class public final enum Ltw1/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltw1/d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\'\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0007\u0010\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ltw1/d;",
        "",
        "",
        "key",
        "Leb/g1;",
        "navType",
        "",
        "isRequired",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V",
        "Ljava/lang/String;",
        "getKey",
        "()Ljava/lang/String;",
        "Leb/g1;",
        "getNavType",
        "()Leb/g1;",
        "Z",
        "()Z",
        "NewMember",
        "MemberId",
        "PlanId",
        "membership_release"
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

.field private static final synthetic $VALUES:[Ltw1/d;

.field public static final enum MemberId:Ltw1/d;

.field public static final enum NewMember:Ltw1/d;

.field public static final enum PlanId:Ltw1/d;


# instance fields
.field private final isRequired:Z

.field private final key:Ljava/lang/String;

.field private final navType:Leb/g1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/g1;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Ltw1/d;
    .locals 3

    sget-object v0, Ltw1/d;->NewMember:Ltw1/d;

    sget-object v1, Ltw1/d;->MemberId:Ltw1/d;

    sget-object v2, Ltw1/d;->PlanId:Ltw1/d;

    filled-new-array {v0, v1, v2}, [Ltw1/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ltw1/d;

    sget-object v4, Leb/g1;->l:Leb/a1;

    const/4 v5, 0x1

    const-string v1, "NewMember"

    const/4 v2, 0x0

    const-string v3, "isNewMember"

    invoke-direct/range {v0 .. v5}, Ltw1/d;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v0, Ltw1/d;->NewMember:Ltw1/d;

    new-instance v1, Ltw1/d;

    const/4 v6, 0x1

    const-string v2, "MemberId"

    const/4 v3, 0x1

    const-string v4, "family_member_user_id"

    sget-object v5, Leb/g1;->o:Leb/a1;

    invoke-direct/range {v1 .. v6}, Ltw1/d;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v1, Ltw1/d;->MemberId:Ltw1/d;

    new-instance v7, Ltw1/d;

    const-string v10, "family_plan_id"

    const/4 v12, 0x1

    const-string v8, "PlanId"

    const/4 v9, 0x2

    move-object v11, v5

    invoke-direct/range {v7 .. v12}, Ltw1/d;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

    sput-object v7, Ltw1/d;->PlanId:Ltw1/d;

    invoke-static {}, Ltw1/d;->$values()[Ltw1/d;

    move-result-object v0

    sput-object v0, Ltw1/d;->$VALUES:[Ltw1/d;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ltw1/d;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leb/g1;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ltw1/d;->key:Ljava/lang/String;

    iput-object p4, p0, Ltw1/d;->navType:Leb/g1;

    iput-boolean p5, p0, Ltw1/d;->isRequired:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, Ltw1/d;-><init>(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V

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

    sget-object v0, Ltw1/d;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltw1/d;
    .locals 1

    const-class v0, Ltw1/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltw1/d;

    return-object p0
.end method

.method public static values()[Ltw1/d;
    .locals 1

    sget-object v0, Ltw1/d;->$VALUES:[Ltw1/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltw1/d;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltw1/d;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getNavType()Leb/g1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Leb/g1;"
        }
    .end annotation

    iget-object v0, p0, Ltw1/d;->navType:Leb/g1;

    return-object v0
.end method

.method public final isRequired()Z
    .locals 1

    iget-boolean v0, p0, Ltw1/d;->isRequired:Z

    return v0
.end method
