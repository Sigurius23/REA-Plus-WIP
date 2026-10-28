.class public final Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;
.super Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination<",
        "Lpn2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;",
        "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;",
        "Lpn2/a;",
        "<init>",
        "()V",
        "Leb/a0;",
        "Lpo2/a$a;",
        "a",
        "(Leb/a0;)Lpo2/a$a;",
        "universal-checkout_release"
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
.field public static final a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;

    invoke-direct {v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;-><init>()V

    sput-object v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    invoke-static {}, Lcom/whoop/universalcheckout/features/a;->v()Lkotlin/jvm/functions/Function1;

    move-result-object v4

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v1, "checkout"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final a(Leb/a0;)Lpo2/a$a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lpo2/a$j;

    sget-object v0, Lcom/whoop/universalcheckout/features/b;->a:Lcom/whoop/universalcheckout/features/b;

    invoke-virtual {v0}, Lcom/whoop/universalcheckout/features/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lpo2/a$j;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
