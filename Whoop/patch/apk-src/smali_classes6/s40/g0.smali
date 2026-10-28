.class public final Ls40/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AutoCompleteTextView$Validator;


# instance fields
.field public final a:Ls40/h;

.field public final b:Lq11/c;


# direct methods
.method public constructor <init>(Ls40/h;Lq11/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/g0;->a:Ls40/h;

    iput-object p2, p0, Ls40/g0;->b:Lq11/c;

    return-void
.end method


# virtual methods
.method public final fixText(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public final isValid(Ljava/lang/CharSequence;)Z
    .locals 4

    iget-object v0, p0, Ls40/g0;->a:Ls40/h;

    iget-object v0, v0, Ls40/h;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/core/model/Country;

    invoke-virtual {v2}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object p1, p0, Ls40/g0;->b:Lq11/c;

    invoke-virtual {p1, v1}, Lq11/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/core/model/Country;

    if-eqz v1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
