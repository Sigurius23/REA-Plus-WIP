.class public final Lx93/b;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lx93/b;

.field public static final x:Lx93/b;

.field public static final y:Lx93/b;

.field public static final z:Lx93/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lx93/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx93/b;-><init>(I)V

    sput-object v0, Lx93/b;->x:Lx93/b;

    new-instance v0, Lx93/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lx93/b;-><init>(I)V

    sput-object v0, Lx93/b;->y:Lx93/b;

    new-instance v0, Lx93/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lx93/b;-><init>(I)V

    sput-object v0, Lx93/b;->z:Lx93/b;

    new-instance v0, Lx93/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lx93/b;-><init>(I)V

    sput-object v0, Lx93/b;->E:Lx93/b;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lx93/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lx93/b;->w:I

    const-string v1, "it"

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lva3/h;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v2

    :cond_1
    return-object v2

    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    sget-object v0, Lx93/c;->a:Ljava/util/List;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p1

    const-string v0, "getActualTypeArguments(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    sget-object v0, Lx93/c;->a:Ljava/util/List;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    :cond_3
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
