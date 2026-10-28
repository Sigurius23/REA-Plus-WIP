.class public final Lr93/t;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lr93/t;

.field public static final F:Lr93/t;

.field public static final x:Lr93/t;

.field public static final y:Lr93/t;

.field public static final z:Lr93/t;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lr93/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr93/t;-><init>(I)V

    sput-object v0, Lr93/t;->x:Lr93/t;

    new-instance v0, Lr93/t;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr93/t;-><init>(I)V

    sput-object v0, Lr93/t;->y:Lr93/t;

    new-instance v0, Lr93/t;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lr93/t;-><init>(I)V

    sput-object v0, Lr93/t;->z:Lr93/t;

    new-instance v0, Lr93/t;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lr93/t;-><init>(I)V

    sput-object v0, Lr93/t;->E:Lr93/t;

    new-instance v0, Lr93/t;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lr93/t;-><init>(I)V

    sput-object v0, Lr93/t;->F:Lr93/t;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lr93/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr93/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lr93/b;

    invoke-interface {p1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object p1

    const-string v0, "getTypeParameters(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lr93/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lr93/j;

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lr93/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lr93/b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lr93/g0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lu93/g0;

    iget-object p1, p1, Lu93/g0;->F:Lva3/e;

    return-object p1

    :pswitch_3
    check-cast p1, Lva3/c;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
