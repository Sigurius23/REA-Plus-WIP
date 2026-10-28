.class final Lkotlin/reflect/jvm/internal/KPackageImpl$Data;
.super Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/KPackageImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Data"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0007\u001a\u0004\u0008\r\u0010\u000eR!\u0010\u0015\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R%\u0010\u001b\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00170\u00168FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0007\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "<init>",
        "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V",
        "Lw93/b;",
        "kotlinClass$delegate",
        "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;",
        "getKotlinClass",
        "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;",
        "kotlinClass",
        "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;",
        "scope$delegate",
        "getScope",
        "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;",
        "scope",
        "Ljava/lang/Class;",
        "multifileFacade$delegate",
        "Ll83/h;",
        "getMultifileFacade",
        "()Ljava/lang/Class;",
        "multifileFacade",
        "",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable;",
        "members$delegate",
        "getMembers",
        "()Ljava/util/Collection;",
        "members",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final kotlinClass$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

.field private final members$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

.field private final multifileFacade$delegate:Ll83/h;

.field private final scope$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

.field final synthetic this$0:Lkotlin/reflect/jvm/internal/KPackageImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;

    const-string v2, "kotlinClass"

    const-string v3, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "scope"

    const-string v5, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v3

    const-string v5, "members"

    const-string v6, "getMembers()Ljava/util/Collection;"

    invoke-static {v1, v5, v6, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->$$delegatedProperties:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/KPackageImpl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->this$0:Lkotlin/reflect/jvm/internal/KPackageImpl;

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;-><init>(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V

    new-instance v0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$0;

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$0;-><init>(Lkotlin/reflect/jvm/internal/KPackageImpl;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->kotlinClass$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    new-instance v0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$1;

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$1;-><init>(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->scope$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$2;

    invoke-direct {v1, p0, p1}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$2;-><init>(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->multifileFacade$delegate:Ll83/h;

    new-instance v0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$3;

    invoke-direct {v0, p0, p1}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$$Lambda$3;-><init>(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)V

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties;->lazySoft(Lc93/a;)Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->members$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    return-void
.end method

.method public static synthetic accessor$KPackageImpl$Data$lambda0(Lkotlin/reflect/jvm/internal/KPackageImpl;)Lw93/b;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->kotlinClass_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl;)Lw93/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$KPackageImpl$Data$lambda1(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->scope_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$KPackageImpl$Data$lambda2(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)Ljava/lang/Class;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->multifileFacade_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic accessor$KPackageImpl$Data$lambda3(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->members_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final getKotlinClass()Lw93/b;
    .locals 3

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->kotlinClass$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v1, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw93/b;

    return-object v0
.end method

.method private static final kotlinClass_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl;)Lw93/b;
    .locals 0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KPackageImpl;->getJClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lva3/g;->l(Ljava/lang/Class;)Lw93/b;

    move-result-object p0

    return-object p0
.end method

.method private static final members_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)Ljava/util/List;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$members$2$visitor$1;

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data$members$2$visitor$1;-><init>(Lkotlin/reflect/jvm/internal/KPackageImpl;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->getScope()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p0

    const/4 p1, 0x3

    const/4 v1, 0x0

    invoke-static {p0, v1, p1}, Ldt/b;->t(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;I)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/k;

    instance-of v3, v2, Lr93/c;

    if-eqz v3, :cond_1

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v2, v0, v3}, Lr93/k;->T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/reflect/jvm/internal/DescriptorKCallable;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final multifileFacade_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;Lkotlin/reflect/jvm/internal/KPackageImpl;)Ljava/lang/Class;
    .locals 3

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->getKotlinClass()Lw93/b;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    iget-object p0, p0, Lw93/b;->b:Lpa3/b;

    iget-object v1, p0, Lpa3/b;->b:Ljava/lang/String;

    iget-object p0, p0, Lpa3/b;->d:Ljava/lang/Object;

    check-cast p0, Lpa3/a;

    sget-object v2, Lpa3/a;->I:Lpa3/a;

    if-ne p0, v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p0

    if-lez p0, :cond_1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/KPackageImpl;->getJClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const/16 p1, 0x2f

    const/16 v0, 0x2e

    invoke-static {v1, p1, v0}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method private static final scope_delegate$lambda$0(Lkotlin/reflect/jvm/internal/KPackageImpl$Data;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 11

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->getKotlinClass()Lw93/b;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;->getModuleData()Lw93/e;

    move-result-object p0

    iget-object p0, p0, Lw93/e;->b:Ls/m2;

    iget-object v1, p0, Ls/m2;->w:Ljava/lang/Object;

    check-cast v1, Loa3/f;

    iget-object v2, p0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, v0, Lw93/b;->a:Ljava/lang/Class;

    invoke-static {v3}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_9

    invoke-static {v3}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v3

    iget-object v3, v3, Lva3/c;->a:Lva3/e;

    iget-object v5, v0, Lw93/b;->b:Lpa3/b;

    iget-object v6, v5, Lpa3/b;->d:Ljava/lang/Object;

    check-cast v6, Lpa3/a;

    sget-object v7, Lpa3/a;->H:Lpa3/a;

    if-ne v6, v7, :cond_4

    iget-object v5, v5, Lpa3/b;->f:Ljava/io/Serializable;

    check-cast v5, [Ljava/lang/String;

    const/4 v8, 0x0

    if-ne v6, v7, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v8

    :goto_0
    if-eqz v5, :cond_1

    invoke-static {v5}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    :cond_1
    if-nez v8, :cond_2

    sget-object v8, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast v8, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ldb3/b;->c(Ljava/lang/String;)Ldb3/b;

    move-result-object v7

    new-instance v8, Lva3/e;

    iget-object v7, v7, Ldb3/b;->a:Ljava/lang/String;

    const/16 v9, 0x2f

    const/16 v10, 0x2e

    invoke-virtual {v7, v9, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v7, Lva3/c;

    invoke-virtual {v8}, Lva3/e;->b()Lva3/e;

    move-result-object v9

    iget-object v8, v8, Lva3/e;->a:Lva3/f;

    invoke-virtual {v8}, Lva3/f;->g()Lva3/h;

    move-result-object v8

    invoke-direct {v7, v9, v8}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    iget-object v8, p0, Ls/m2;->x:Ljava/lang/Object;

    check-cast v8, Laj/d;

    invoke-virtual {v1}, Loa3/f;->c()Lhb3/i;

    move-result-object v9

    iget-object v9, v9, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lsa3/e;->g:Lsa3/e;

    invoke-static {v8, v7, v9}, Lds/p;->D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    :cond_5
    new-instance p0, Lu93/q;

    invoke-virtual {v1}, Loa3/f;->c()Lhb3/i;

    move-result-object v6

    iget-object v6, v6, Lhb3/i;->b:Lr93/b0;

    invoke-direct {p0, v6, v3}, Lu93/q;-><init>(Lr93/b0;Lva3/e;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lw93/b;

    invoke-virtual {v1, p0, v7}, Loa3/f;->a(Lr93/g0;Lw93/b;)Ljb3/r;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "package "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Landroidx/room/c1;->m(Ljava/lang/String;Ljava/lang/Iterable;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p0

    invoke-virtual {v2, v4, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_8

    move-object v5, p0

    goto :goto_3

    :cond_8
    move-object v5, v0

    :cond_9
    :goto_3
    const-string p0, "getOrPut(...)"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v5

    :cond_a
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    return-object p0
.end method


# virtual methods
.method public final getMembers()Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lkotlin/reflect/jvm/internal/DescriptorKCallable<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->members$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v1, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final getMultifileFacade()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->multifileFacade$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method

.method public final getScope()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 3

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->scope$delegate:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    sget-object v1, Lkotlin/reflect/jvm/internal/KPackageImpl$Data;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lkotlin/reflect/jvm/internal/ReflectProperties$Val;->getValue(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v0
.end method
