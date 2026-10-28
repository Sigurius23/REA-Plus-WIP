.class public final Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "",
        "<set-?>",
        "x",
        "Lf93/d;",
        "getCompanyName",
        "()Ljava/lang/String;",
        "setCompanyName",
        "(Ljava/lang/String;)V",
        "companyName",
        "payments-core_release"
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
.field public static final synthetic y:[Lj93/z;


# instance fields
.field public final w:Lgm/j;

.field public final x:Ls40/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;

    const-string v2, "companyName"

    const-string v3, "getCompanyName()Ljava/lang/String;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->y:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1010084

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p2, Lgm/j;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lgm/j;-><init>(Landroid/content/Context;B)V

    iput-object p2, p0, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->w:Lgm/j;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    new-instance p1, Ls40/g;

    invoke-direct {p1, p0}, Ls40/g;-><init>(Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;)V

    iput-object p1, p0, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->x:Ls40/g;

    return-void
.end method


# virtual methods
.method public final getCompanyName()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->y:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->x:Ls40/g;

    invoke-interface {v1, p0, v0}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final setCompanyName(Ljava/lang/String;)V
    .locals 2

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->y:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;->x:Ls40/g;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
