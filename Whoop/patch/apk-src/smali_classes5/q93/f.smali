.class public final Lq93/f;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lq93/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq93/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq93/f;->w:Lq93/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lr93/b0;

    sget-object v0, Lq93/g;->d:Lq93/e;

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/g;->f:Lva3/e;

    invoke-interface {p1, v0}, Lr93/b0;->F(Lva3/e;)Lr93/k0;

    move-result-object p1

    check-cast p1, Lu93/a0;

    iget-object p1, p1, Lu93/a0;->F:Lkb3/i;

    sget-object v0, Lu93/a0;->I:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lib3/c;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/k;

    return-object p1
.end method
