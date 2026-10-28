.class public final Lcom/stripe/android/view/CardNumberTextInputLayout;
.super Lcom/google/android/material/textfield/TextInputLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/view/CardNumberTextInputLayout;",
        "Lcom/google/android/material/textfield/TextInputLayout;",
        "",
        "<set-?>",
        "f1",
        "Lf93/d;",
        "isLoading$payments_core_release",
        "()Z",
        "setLoading$payments_core_release",
        "(Z)V",
        "isLoading",
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
.field public static final synthetic g1:[Lj93/z;


# instance fields
.field public final e1:Ls40/a0;

.field public final f1:Ls40/g;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/stripe/android/view/CardNumberTextInputLayout;

    const-string v2, "isLoading"

    const-string v3, "isLoading$payments_core_release()Z"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/stripe/android/view/CardNumberTextInputLayout;->g1:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f040aca

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Ls40/a0;

    invoke-direct {v0, p1, p2}, Ls40/a0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/stripe/android/view/CardNumberTextInputLayout;->e1:Ls40/a0;

    new-instance p1, Ls40/g;

    invoke-direct {p1, p0}, Ls40/g;-><init>(Lcom/stripe/android/view/CardNumberTextInputLayout;)V

    iput-object p1, p0, Lcom/stripe/android/view/CardNumberTextInputLayout;->f1:Ls40/g;

    new-instance p1, Loq/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Loq/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f140fdf

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final setLoading$payments_core_release(Z)V
    .locals 2

    sget-object v0, Lcom/stripe/android/view/CardNumberTextInputLayout;->g1:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberTextInputLayout;->f1:Ls40/g;

    invoke-interface {v1, p0, v0, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
