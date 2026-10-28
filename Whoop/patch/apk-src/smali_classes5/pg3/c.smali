.class public final Lpg3/c;
.super Lpg3/m;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lpg3/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 1

    iget v0, p0, Lpg3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Lpg3/m;->requestBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-class p2, Lud3/v0;

    invoke-static {p1}, Lpg3/e1;->i(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lpg3/b;->x:Lpg3/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final responseBodyConverter(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;
    .locals 2

    iget v0, p0, Lpg3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lpg3/m;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/util/Optional;

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0, p1}, Lpg3/m;->getParameterUpperBound(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-virtual {p3, p1, p2}, Lpg3/y0;->d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lpg3/n;

    move-result-object p1

    new-instance p2, Lla/b;

    const/16 p3, 0x19

    invoke-direct {p2, p1, p3}, Lla/b;-><init>(Ljava/lang/Object;I)V

    move-object p1, p2

    :goto_0
    return-object p1

    :pswitch_0
    const-class p3, Lud3/a1;

    if-ne p1, p3, :cond_2

    const-class p1, Lwg3/w;

    invoke-static {p2, p1}, Lpg3/e1;->l([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lpg3/a;->y:Lpg3/a;

    goto :goto_1

    :cond_1
    sget-object p1, Lpg3/a;->x:Lpg3/a;

    goto :goto_1

    :cond_2
    const-class p2, Ljava/lang/Void;

    if-ne p1, p2, :cond_3

    sget-object p1, Lpg3/a;->z:Lpg3/a;

    goto :goto_1

    :cond_3
    sget-boolean p2, Lpg3/e1;->b:Z

    if-eqz p2, :cond_4

    :try_start_0
    const-class p2, Ll83/a0;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, p2, :cond_4

    sget-object p1, Lpg3/b;->z:Lpg3/b;

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lpg3/e1;->b:Z

    :cond_4
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
