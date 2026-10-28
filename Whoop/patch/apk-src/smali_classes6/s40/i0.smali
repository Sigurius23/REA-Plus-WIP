.class public final Ls40/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic w:Lcom/stripe/android/view/CountryTextInputLayout;

.field public final synthetic x:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CountryTextInputLayout;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/i0;->w:Lcom/stripe/android/view/CountryTextInputLayout;

    iput-boolean p2, p0, Ls40/i0;->x:Z

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Ls40/i0;->w:Lcom/stripe/android/view/CountryTextInputLayout;

    invoke-virtual {p1}, Lcom/stripe/android/view/CountryTextInputLayout;->getCountryAutocomplete()Landroid/widget/AutoCompleteTextView;

    move-result-object p1

    iget-boolean p2, p0, Ls40/i0;->x:Z

    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
