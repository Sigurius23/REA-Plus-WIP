.class public final Lcb3/d;
.super Ls9/f;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/io/Serializable;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcb3/d;->w:I

    iput-object p1, p0, Lcb3/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lcb3/d;->x:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/g0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcb3/d;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcb3/d;->x:Ljava/io/Serializable;

    iput-object p1, p0, Lcb3/d;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public p(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcb3/d;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    check-cast p1, Lr93/c;

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcb3/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Z
    .locals 3

    iget v0, p0, Lcb3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast v0, [Z

    iget-object v1, p0, Lcb3/d;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    aput-boolean v1, v0, v2

    :cond_0
    aget-boolean p1, v0, v2

    xor-int/2addr p1, v1

    return p1

    :pswitch_0
    check-cast p1, Lr93/e;

    iget-object v0, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/g0;

    const-string v1, "javaClassDescriptor"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcb3/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Le4/a;->R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lq93/s;->b:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Lq93/n;->w:Lq93/n;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    sget-object v1, Lq93/s;->d:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Lq93/n;->x:Lq93/n;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object v1, Lq93/s;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p1, Lq93/n;->y:Lq93/n;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sget-object v1, Lq93/s;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lq93/n;->E:Lq93/n;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_4
    :goto_0
    iget-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p1, :cond_5

    const/4 p1, 0x1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_1
    check-cast p1, Lr93/c;

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p1, :cond_6

    const/4 p1, 0x1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final y()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcb3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast v0, [Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lq93/n;

    if-nez v0, :cond_0

    sget-object v0, Lq93/n;->z:Lq93/n;

    :cond_0
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcb3/d;->x:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lr93/c;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
