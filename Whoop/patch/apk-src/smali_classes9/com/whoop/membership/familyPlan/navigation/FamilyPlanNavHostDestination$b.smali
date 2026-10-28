.class public final Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;
.super Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;",
        "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;",
        "<init>",
        "()V",
        "",
        "isNewMember",
        "",
        "a",
        "(Z)Ljava/lang/String;",
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
.field public static final a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;

    invoke-direct {v0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;-><init>()V

    sput-object v0, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Ltw1/d;->NewMember:Ltw1/d;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "FamilyPlanInviteNewMemberScreen"

    invoke-direct {p0, v2, v0, v1}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
