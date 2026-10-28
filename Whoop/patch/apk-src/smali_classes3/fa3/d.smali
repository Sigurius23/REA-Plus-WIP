.class public final Lfa3/d;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lfa3/d;

.field public static final F:Lfa3/d;

.field public static final G:Lfa3/d;

.field public static final H:Lfa3/d;

.field public static final x:Lfa3/d;

.field public static final y:Lfa3/d;

.field public static final z:Lfa3/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lfa3/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->x:Lfa3/d;

    new-instance v0, Lfa3/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->y:Lfa3/d;

    new-instance v0, Lfa3/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->z:Lfa3/d;

    new-instance v0, Lfa3/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->E:Lfa3/d;

    new-instance v0, Lfa3/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->F:Lfa3/d;

    new-instance v0, Lfa3/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->G:Lfa3/d;

    new-instance v0, Lfa3/d;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lfa3/d;-><init>(I)V

    sput-object v0, Lfa3/d;->H:Lfa3/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lfa3/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lfa3/d;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "it"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/c;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lo93/h;->A(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget v0, Lfa3/e;->l:I

    sget-object v0, Lfa3/g0;->e:Ljava/util/Set;

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lfa3/d;->y:Lfa3/d;

    invoke-static {p1, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lio/sentry/config/a;->p(Lr93/b;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lfa3/g0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v3, Lfa3/d0;->w:Lfa3/d0;

    goto :goto_0

    :cond_2
    sget-object v0, Lfa3/g0;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1, v0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfa3/f0;

    sget-object v0, Lfa3/f0;->x:Lfa3/f0;

    if-ne p1, v0, :cond_3

    sget-object v3, Lfa3/d0;->y:Lfa3/d0;

    goto :goto_0

    :cond_3
    sget-object v3, Lfa3/d0;->x:Lfa3/d0;

    :cond_4
    :goto_0
    if-eqz v3, :cond_5

    move v1, v2

    :cond_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lr93/c;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lfa3/c;->l:I

    check-cast p1, Lu93/q0;

    invoke-static {p1}, Lo93/h;->A(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ls;

    const/4 v3, 0x4

    invoke-direct {v0, p1, v3}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p1

    if-eqz p1, :cond_6

    move v1, v2

    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lr93/c;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->M(Lr93/c;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lr93/a1;

    check-cast p1, Lu93/x0;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lr93/c;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ls2/e;->M(Lr93/c;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lr93/c;

    sget v0, Lfa3/e;->l:I

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lr93/w;

    if-eqz v0, :cond_7

    sget-object v0, Lfa3/g0;->f:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/sentry/config/a;->p(Lr93/b;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    move v1, v2

    :cond_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lr93/c;

    sget v0, Lfa3/e;->l:I

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfa3/g0;->f:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/sentry/config/a;->p(Lr93/b;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
