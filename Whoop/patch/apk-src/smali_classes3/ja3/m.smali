.class public final Lja3/m;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lja3/m;

.field public static final F:Lja3/m;

.field public static final x:Lja3/m;

.field public static final y:Lja3/m;

.field public static final z:Lja3/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lja3/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lja3/m;-><init>(I)V

    sput-object v0, Lja3/m;->x:Lja3/m;

    new-instance v0, Lja3/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lja3/m;-><init>(I)V

    sput-object v0, Lja3/m;->y:Lja3/m;

    new-instance v0, Lja3/m;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lja3/m;-><init>(I)V

    sput-object v0, Lja3/m;->z:Lja3/m;

    new-instance v0, Lja3/m;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lja3/m;-><init>(I)V

    sput-object v0, Lja3/m;->E:Lja3/m;

    new-instance v0, Lja3/m;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lja3/m;-><init>(I)V

    sput-object v0, Lja3/m;->F:Lja3/m;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lja3/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lja3/m;->w:I

    const-string v1, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb3/y;

    sget v0, Lja3/d0;->p:I

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    instance-of v0, p1, Lr93/e;

    if-eqz v0, :cond_0

    check-cast p1, Lr93/e;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    sget v0, Lja3/d0;->p:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :pswitch_1
    check-cast p1, Lx93/v;

    sget v0, Lja3/d0;->p:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx93/v;->i()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lu93/q0;

    sget-object v0, Lja3/a0;->m:[Lj93/z;

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_3
    check-cast p1, Lx93/v;

    sget v0, Lja3/o;->v:I

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx93/v;->i()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
