.class public final Lu00/b;
.super Lu00/d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Name"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lh20/l1;)Lh20/k1;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lh20/l1;->w:Lh20/k1;

    return-object p1
.end method

.method public final b(Ljava/util/LinkedHashMap;)Lg40/w2;
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/NameSpec;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lcom/stripe/android/ui/core/elements/NameSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/TranslationId;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/NameSpec;->transform(Ljava/util/Map;)Lg40/w2;

    move-result-object p1

    return-object p1
.end method
