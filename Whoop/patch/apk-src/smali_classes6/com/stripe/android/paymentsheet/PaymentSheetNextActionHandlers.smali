.class public final Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\t\u001a\u001c\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00060\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0004\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;",
        "",
        "<init>",
        "()V",
        "",
        "Ljava/lang/Class;",
        "Ly00/b8;",
        "Lc20/e;",
        "Ly00/c8;",
        "get",
        "()Ljava/util/Map;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ly00/b8;",
            ">;",
            "Lc20/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx20/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll83/k;

    const-class v2, Ly00/y7;

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lx20/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll83/k;

    const-class v3, Ly00/i7;

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lx20/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Ll83/k;

    const-class v4, Ly00/o7;

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lx20/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ll83/k;

    const-class v5, Ly00/p7;

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
