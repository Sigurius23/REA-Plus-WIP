.class public final Lxa3/g;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lxa3/g;

.field public static final x:Lxa3/g;

.field public static final y:Lxa3/g;

.field public static final z:Lxa3/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lxa3/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxa3/g;-><init>(I)V

    sput-object v0, Lxa3/g;->x:Lxa3/g;

    new-instance v0, Lxa3/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lxa3/g;-><init>(I)V

    sput-object v0, Lxa3/g;->y:Lxa3/g;

    new-instance v0, Lxa3/g;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lxa3/g;-><init>(I)V

    sput-object v0, Lxa3/g;->z:Lxa3/g;

    new-instance v0, Lxa3/g;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lxa3/g;-><init>(I)V

    sput-object v0, Lxa3/g;->E:Lxa3/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lxa3/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxa3/g;->w:I

    const-string v1, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_0
    check-cast p1, Lxa3/k;

    sget-object v0, Lxa3/i;->c:Lxa3/i;

    const-string v0, "$this$withOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lxa3/k;->f()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lo93/m;->p:Lva3/e;

    sget-object v2, Lo93/m;->q:Lva3/e;

    filled-new-array {v1, v2}, [Lva3/e;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-interface {p1, v0}, Lxa3/k;->l(Ljava/util/LinkedHashSet;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lr93/a1;

    sget-object p1, Lxa3/i;->c:Lxa3/i;

    const-string p1, ""

    return-object p1

    :pswitch_2
    check-cast p1, Llb3/y;

    sget-object v0, Lxa3/i;->c:Lxa3/i;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
