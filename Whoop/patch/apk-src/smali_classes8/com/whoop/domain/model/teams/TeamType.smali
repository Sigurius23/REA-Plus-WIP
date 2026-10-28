.class public final enum Lcom/whoop/domain/model/teams/TeamType;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/teams/TeamType;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/domain/model/teams/TeamType;",
        "Landroid/os/Parcelable;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "",
        "describeContents",
        "()I",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "COMMUNITY",
        "ELITE",
        "ALL",
        "core_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/teams/TeamType;

.field public static final enum ALL:Lcom/whoop/domain/model/teams/TeamType;

.field public static final enum COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/domain/model/teams/TeamType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum ELITE:Lcom/whoop/domain/model/teams/TeamType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/domain/model/teams/TeamType;
    .locals 3

    sget-object v0, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    sget-object v1, Lcom/whoop/domain/model/teams/TeamType;->ELITE:Lcom/whoop/domain/model/teams/TeamType;

    sget-object v2, Lcom/whoop/domain/model/teams/TeamType;->ALL:Lcom/whoop/domain/model/teams/TeamType;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/teams/TeamType;

    const/4 v1, 0x0

    const-string v2, "community"

    const-string v3, "COMMUNITY"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/domain/model/teams/TeamType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    new-instance v0, Lcom/whoop/domain/model/teams/TeamType;

    const/4 v1, 0x1

    const-string v2, "elite"

    const-string v3, "ELITE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/domain/model/teams/TeamType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamType;->ELITE:Lcom/whoop/domain/model/teams/TeamType;

    new-instance v0, Lcom/whoop/domain/model/teams/TeamType;

    const/4 v1, 0x2

    const-string v2, "all"

    const-string v3, "ALL"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/domain/model/teams/TeamType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamType;->ALL:Lcom/whoop/domain/model/teams/TeamType;

    invoke-static {}, Lcom/whoop/domain/model/teams/TeamType;->$values()[Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/teams/TeamType;->$VALUES:[Lcom/whoop/domain/model/teams/TeamType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/teams/TeamType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/domain/model/teams/TeamType$Creator;

    invoke-direct {v0}, Lcom/whoop/domain/model/teams/TeamType$Creator;-><init>()V

    sput-object v0, Lcom/whoop/domain/model/teams/TeamType;->CREATOR:Landroid/os/Parcelable$Creator;

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

    iput-object p3, p0, Lcom/whoop/domain/model/teams/TeamType;->value:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/domain/model/teams/TeamType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/teams/TeamType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/teams/TeamType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/teams/TeamType;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/teams/TeamType;->$VALUES:[Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/teams/TeamType;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/teams/TeamType;->value:Ljava/lang/String;

    return-object v0
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
