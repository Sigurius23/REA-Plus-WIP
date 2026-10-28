.class public abstract Lm6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm6/a;->a:Lm6/a;

    sput-object v0, Lm6/b;->a:Lm6/a;

    return-void
.end method

.method public static a(Landroidx/fragment/app/m0;)Lm6/a;
    .locals 2

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "declaringFragment.parentFragmentManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragment()Landroidx/fragment/app/m0;

    move-result-object p0

    goto :goto_0

    :cond_1
    sget-object p0, Lm6/b;->a:Lm6/a;

    return-object p0
.end method

.method public static b(Landroidx/fragment/app/strictmode/Violation;)V
    .locals 2

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/strictmode/Violation;->w:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StrictMode violation in "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final c(Landroidx/fragment/app/m0;Ljava/lang/String;)V
    .locals 3

    const-string v0, "fragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousFragmentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/fragment/app/strictmode/FragmentReuseViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to reuse fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with previous ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final d(Landroidx/fragment/app/m0;Landroid/view/ViewGroup;)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final e(Landroidx/fragment/app/m0;)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/GetRetainInstanceUsageViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to get retain instance for fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final f(Landroidx/fragment/app/m0;)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/GetTargetFragmentRequestCodeUsageViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to get target request code from fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final g(Landroidx/fragment/app/m0;)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/GetTargetFragmentUsageViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to get target fragment from fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final h(Landroidx/fragment/app/m0;)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/SetRetainInstanceUsageViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set retain instance for fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final i(Landroidx/fragment/app/m0;Landroidx/fragment/app/m0;I)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set target fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with request code "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final j(Landroidx/fragment/app/m0;Z)V
    .locals 3

    new-instance v0, Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set user visible hint to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " for fragment "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final k(Landroidx/fragment/app/m0;Landroid/view/ViewGroup;)V
    .locals 3

    const-string v0, "fragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to add fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " which is not a FragmentContainerView"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static final l(Landroidx/fragment/app/m0;Landroidx/fragment/app/m0;I)V
    .locals 3

    const-string v0, "fragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to nest fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " within the view of parent fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " via container with ID "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " without using parent\'s childFragmentManager"

    invoke-static {v1, p2, p1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-static {v0}, Lm6/b;->b(Landroidx/fragment/app/strictmode/Violation;)V

    invoke-static {p0}, Lm6/b;->a(Landroidx/fragment/app/m0;)Lm6/a;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
