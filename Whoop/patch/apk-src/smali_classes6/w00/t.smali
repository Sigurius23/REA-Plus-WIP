.class public final Lw00/t;
.super Lv00/p0;
.source "SourceFile"


# instance fields
.field public final a:Lv00/q;


# direct methods
.method public constructor <init>(Lv00/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw00/t;->a:Lv00/q;

    return-void
.end method


# virtual methods
.method public final k(Lv00/c0;Lv00/m0;Ld30/f0;)V
    .locals 2

    iget-object p1, p0, Lw00/t;->a:Lv00/q;

    iget-object p2, p1, Lv00/q;->z:Lzy/c;

    if-eqz p2, :cond_0

    new-instance v0, Lx30/r1;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "CustomPaymentMethodHeader"

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/a;->a(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lx30/r1;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lzy/c;)V

    iget-object p2, p3, Ld30/f0;->d:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-boolean p1, p1, Lv00/q;->E:Z

    if-eqz p1, :cond_1

    iget-object p1, p3, Ld30/f0;->g:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    const/4 p1, 0x0

    iput-boolean p1, p3, Ld30/f0;->a:Z

    :cond_1
    return-void
.end method

.method public final l(Lv00/c0;)Lu00/f;
    .locals 11

    iget-object p1, p0, Lw00/t;->a:Lv00/q;

    iget-object v1, p1, Lv00/q;->w:Ljava/lang/String;

    iget-object v0, p1, Lv00/q;->x:Ljava/lang/String;

    invoke-static {v0}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v2

    iget-object v8, p1, Lv00/q;->z:Lzy/c;

    iget-object v5, p1, Lv00/q;->y:Ljava/lang/String;

    new-instance v0, Lu00/f;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v9, 0x0

    const/16 v10, 0x202

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v6, v5

    invoke-direct/range {v0 .. v10}, Lu00/f;-><init>(Ljava/lang/String;Lzy/c;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLzy/c;Ljava/lang/Integer;I)V

    return-object v0
.end method
