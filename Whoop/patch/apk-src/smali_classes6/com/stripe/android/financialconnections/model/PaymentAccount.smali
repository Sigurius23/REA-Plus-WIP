.class public abstract Lcom/stripe/android/financialconnections/model/PaymentAccount;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "",
        "getId",
        "()Ljava/lang/String;",
        "id",
        "Companion",
        "pz/c",
        "Lcom/stripe/android/financialconnections/model/BankAccount;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lqz/b;
.end annotation


# static fields
.field public static final Companion:Lpz/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpz/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/PaymentAccount;->Companion:Lpz/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/model/PaymentAccount;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getId()Ljava/lang/String;
.end method
