.class public final Loa3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Loa3/m;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Loa3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Loa3/m;->a:Loa3/m;

    return-void
.end method

.method public static a(Ljava/lang/String;)Loa3/l;
    .locals 8

    const-string v0, "representation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {}, Ldb3/c;->values()[Ldb3/c;

    move-result-object v2

    array-length v3, v2

    move v4, v0

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v3, :cond_1

    aget-object v6, v2, v4

    invoke-virtual {v6}, Ldb3/c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_2

    new-instance p0, Loa3/k;

    invoke-direct {p0, v6}, Loa3/k;-><init>(Ldb3/c;)V

    return-object p0

    :cond_2
    const/16 v0, 0x56

    if-eq v1, v0, :cond_5

    const/16 v0, 0x5b

    const-string v2, "substring(...)"

    const/4 v3, 0x1

    if-eq v1, v0, :cond_4

    const/16 v0, 0x4c

    if-ne v1, v0, :cond_3

    const/16 v0, 0x3b

    invoke-static {p0, v0}, Lyb3/r;->Z(Ljava/lang/String;C)Z

    move-result v0

    :cond_3
    new-instance v0, Loa3/j;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Loa3/j;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v0, Loa3/i;

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Loa3/m;->a(Ljava/lang/String;)Loa3/l;

    move-result-object p0

    invoke-direct {v0, p0}, Loa3/i;-><init>(Loa3/l;)V

    return-object v0

    :cond_5
    new-instance p0, Loa3/k;

    invoke-direct {p0, v5}, Loa3/k;-><init>(Ldb3/c;)V

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Loa3/j;
    .locals 1

    const-string v0, "internalName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loa3/j;

    invoke-direct {v0, p0}, Loa3/j;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(Loa3/l;)Ljava/lang/String;
    .locals 2

    const-string v0, "type"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Loa3/i;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p0, Loa3/i;

    iget-object p0, p0, Loa3/i;->i:Loa3/l;

    invoke-static {p0}, Loa3/m;->c(Loa3/l;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Loa3/k;

    if-eqz v0, :cond_3

    check-cast p0, Loa3/k;

    iget-object p0, p0, Loa3/k;->i:Ldb3/c;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ldb3/c;->c()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    return-object p0

    :cond_2
    :goto_0
    const-string p0, "V"

    return-object p0

    :cond_3
    instance-of v0, p0, Loa3/j;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "L"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p0, Loa3/j;

    iget-object p0, p0, Loa3/j;->i:Ljava/lang/String;

    const/16 v1, 0x3b

    invoke-static {v0, p0, v1}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
