.class public final Lcom/google/android/material/textfield/m;
.super Lcr/l;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lcom/google/android/material/textfield/q;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/textfield/m;->w:Lcom/google/android/material/textfield/q;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/material/textfield/m;->w:Lcom/google/android/material/textfield/q;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/q;->b()Lcom/google/android/material/textfield/r;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/textfield/r;->a()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/material/textfield/m;->w:Lcom/google/android/material/textfield/q;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/q;->b()Lcom/google/android/material/textfield/r;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/textfield/r;->b()V

    return-void
.end method
