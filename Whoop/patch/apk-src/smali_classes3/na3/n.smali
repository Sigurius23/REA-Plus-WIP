.class public final Lna3/n;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lna3/n;

.field public static final x:Lna3/n;

.field public static final y:Lna3/n;

.field public static final z:Lna3/n;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lna3/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lna3/n;-><init>(I)V

    sput-object v0, Lna3/n;->x:Lna3/n;

    new-instance v0, Lna3/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lna3/n;-><init>(I)V

    sput-object v0, Lna3/n;->y:Lna3/n;

    new-instance v0, Lna3/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lna3/n;-><init>(I)V

    sput-object v0, Lna3/n;->z:Lna3/n;

    new-instance v0, Lna3/n;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lna3/n;-><init>(I)V

    sput-object v0, Lna3/n;->E:Lna3/n;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lna3/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lna3/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lna3/o;

    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Spliterator"

    const-string v1, "java/util/"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lna3/l;->b:Lna3/d;

    filled-new-array {v1, v1}, [Lna3/d;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Lya3/q;->w:Lya3/q;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Llb3/f1;

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    sget-object v1, Lq93/d;->f:Lva3/e;

    iget-object v2, v1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->g()Lva3/h;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcb3/e;->c(Lr93/l;)Lva3/e;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    check-cast p1, Llb3/f1;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lka3/h;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lr93/c;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :pswitch_3
    check-cast p1, Lr93/c;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b;->B()Lr93/q0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lu93/d;

    invoke-virtual {p1}, Lu93/d;->getType()Llb3/y;

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
