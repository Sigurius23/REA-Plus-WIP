.class public final Lw00/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/o0;


# static fields
.field public static final a:Lw00/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw00/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw00/j;->a:Lw00/j;

    return-void
.end method


# virtual methods
.method public final a(Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lq20/c;)Lt00/a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw00/j;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p3}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;
    .locals 10

    sget-object v1, Lw00/i;->a:Lw00/i;

    new-instance v0, Lu00/f;

    const p1, 0x7f080819

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v9, 0x40

    const v3, 0x7f14109a

    const v4, 0x7f080818

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p2

    invoke-direct/range {v0 .. v9}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v0
.end method

.method public final g(Lv00/b0;Ljava/util/List;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final i(Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;Lv00/m0;)Ljava/util/List;
    .locals 8

    new-instance p4, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Name:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-direct {p4, v0, v1}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Email:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->Phone:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;)V

    new-instance v2, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;

    invoke-direct {v2}, Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;-><init>()V

    new-instance v3, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBillingAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;->BillingAddress:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;

    invoke-direct {v3, v4, v5}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/PlaceholderSpec$PlaceholderField;)V

    new-instance v4, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;

    invoke-direct {v4}, Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;-><init>()V

    sget-object v5, Lw00/i;->b:Ly00/f4;

    invoke-virtual {p1, v5}, Lv00/c0;->H(Ly00/f4;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v6, 0x6

    new-array v6, v6, [Lcom/stripe/android/ui/core/elements/FormItemSpec;

    const/4 v7, 0x0

    aput-object p4, v6, v7

    const/4 p4, 0x1

    aput-object v0, v6, p4

    const/4 p4, 0x2

    aput-object v1, v6, p4

    const/4 p4, 0x3

    aput-object v2, v6, p4

    const/4 p4, 0x4

    aput-object v3, v6, p4

    const/4 p4, 0x5

    aput-object v4, v6, p4

    invoke-static {v6}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p2, p4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p4

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getBillingAddress$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    filled-new-array {p4, v0, v1}, [Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p4

    invoke-static {p4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    iget-object v0, p1, Lv00/c0;->Z:Ljava/util/Map;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/i3;

    if-nez v0, :cond_1

    sget-object v0, Lh20/i3;->w:Lh20/i3;

    :cond_1
    invoke-virtual {p3, p1, p2, p4, v0}, Lty/c;->v(Lv00/c0;Ljava/util/ArrayList;Ljava/util/List;Lh20/i3;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
