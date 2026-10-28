.class public final synthetic Lio/sentry/android/core/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic E:Lio/sentry/i5;

.field public final synthetic F:Landroid/widget/TextView;

.field public final synthetic G:Landroid/widget/TextView;

.field public final synthetic H:Landroid/widget/TextView;

.field public final synthetic w:Lio/sentry/android/core/o1;

.field public final synthetic x:Landroid/widget/EditText;

.field public final synthetic y:Landroid/widget/EditText;

.field public final synthetic z:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/o1;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Lio/sentry/i5;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/l1;->w:Lio/sentry/android/core/o1;

    iput-object p2, p0, Lio/sentry/android/core/l1;->x:Landroid/widget/EditText;

    iput-object p3, p0, Lio/sentry/android/core/l1;->y:Landroid/widget/EditText;

    iput-object p4, p0, Lio/sentry/android/core/l1;->z:Landroid/widget/EditText;

    iput-object p5, p0, Lio/sentry/android/core/l1;->E:Lio/sentry/i5;

    iput-object p6, p0, Lio/sentry/android/core/l1;->F:Landroid/widget/TextView;

    iput-object p7, p0, Lio/sentry/android/core/l1;->G:Landroid/widget/TextView;

    iput-object p8, p0, Lio/sentry/android/core/l1;->H:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    iget-object p1, p0, Lio/sentry/android/core/l1;->x:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/l1;->y:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/android/core/l1;->z:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    iget-object v6, p0, Lio/sentry/android/core/l1;->E:Lio/sentry/i5;

    if-eqz v5, :cond_0

    iget-boolean v5, v6, Lio/sentry/i5;->a:Z

    if-eqz v5, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/l1;->F:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, v6, Lio/sentry/i5;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/l1;->G:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/sentry/android/core/l1;->H:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    new-instance p1, Lio/sentry/protocol/j;

    invoke-direct {p1, v4}, Lio/sentry/protocol/j;-><init>(Ljava/lang/String;)V

    iput-object v0, p1, Lio/sentry/protocol/j;->y:Ljava/lang/String;

    iput-object v2, p1, Lio/sentry/protocol/j;->x:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/android/core/l1;->w:Lio/sentry/android/core/o1;

    iget-object v1, v0, Lio/sentry/android/core/o1;->x:Lio/sentry/protocol/v;

    if-eqz v1, :cond_3

    iput-object v1, p1, Lio/sentry/protocol/j;->E:Lio/sentry/protocol/v;

    :cond_3
    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/d1;->A()Lio/sentry/t0;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/sentry/t0;->c(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p1, v1}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Thank you for your report!"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    return-void
.end method
