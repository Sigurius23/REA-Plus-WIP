.class public final Lcom/whoop/weightlifting/StrengthTrainerDestination$j;
.super Lcom/whoop/weightlifting/StrengthTrainerDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/StrengthTrainerDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$j;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;",
        "<init>",
        "()V",
        "a",
        "weightlifting_release"
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
.field public static final a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    invoke-direct {v0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;-><init>()V

    sput-object v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    new-instance v4, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0x16

    invoke-direct {v4, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "workoutLibrary"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/weightlifting/StrengthTrainerDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic a(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->b(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Leb/q;)Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "workoutTabIndex"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;-><init>(Ljava/lang/Integer;)V

    return-object v0
.end method
