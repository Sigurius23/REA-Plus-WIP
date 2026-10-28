.class public final synthetic Lk93/b;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"


# static fields
.field public static final w:Lk93/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lk93/b;

    const-string v1, "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;"

    const/4 v2, 0x1

    const-class v3, Lk93/c;

    const-string v4, "superclasses"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lk93/b;->w:Lk93/b;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lj93/d;

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj93/d;->getSupertypes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/a0;

    invoke-interface {v1}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v1

    instance-of v2, v1, Lj93/d;

    if-eqz v2, :cond_1

    check-cast v1, Lj93/d;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method
