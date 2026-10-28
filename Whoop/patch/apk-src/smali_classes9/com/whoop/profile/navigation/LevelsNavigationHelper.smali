.class public final Lcom/whoop/profile/navigation/LevelsNavigationHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/profile/navigation/LevelsNavigationHelper;",
        "",
        "<init>",
        "()V",
        "Lj02/m0$o2;",
        "levelsScreen",
        "Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;",
        "convertToMemberLevelProfileViewData",
        "(Lj02/m0$o2;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;",
        "profile_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/profile/navigation/LevelsNavigationHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/navigation/LevelsNavigationHelper;

    invoke-direct {v0}, Lcom/whoop/profile/navigation/LevelsNavigationHelper;-><init>()V

    sput-object v0, Lcom/whoop/profile/navigation/LevelsNavigationHelper;->INSTANCE:Lcom/whoop/profile/navigation/LevelsNavigationHelper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final convertToMemberLevelProfileViewData(Lj02/m0$o2;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;
    .locals 14

    const-string v0, "levelsScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    invoke-virtual {p1}, Lj02/m0$o2;->d()I

    move-result v2

    invoke-virtual {p1}, Lj02/m0$o2;->c()I

    move-result v3

    invoke-virtual {p1}, Lj02/m0$o2;->g()I

    move-result v4

    invoke-virtual {p1}, Lj02/m0$o2;->e()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1}, Lj02/m0$o2;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lj02/m0$o2;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lj02/m0$o2;->h()Ljava/lang/String;

    move-result-object v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;-><init>(IIILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
