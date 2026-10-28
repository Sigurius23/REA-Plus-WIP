.class public final Lrw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Low/a0;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrw/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Low/m;Lvw/a;)Low/z;
    .locals 2

    iget v0, p0, Lrw/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class v0, Ljava/sql/Timestamp;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lvw/a;

    const-class v0, Ljava/util/Date;

    invoke-direct {p2, v0}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, p2}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object p1

    new-instance p2, Luw/a;

    invoke-direct {p2, p1}, Luw/a;-><init>(Low/z;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    return-object p2

    :pswitch_0
    iget-object p1, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class p2, Ljava/sql/Time;

    if-ne p1, p2, :cond_1

    new-instance p1, Luw/a;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Luw/a;-><init>(I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    iget-object p1, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class p2, Ljava/sql/Date;

    if-ne p1, p2, :cond_2

    new-instance p1, Luw/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Luw/a;-><init>(I)V

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Factory should not be used"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_3
    iget-object p1, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class p2, Ljava/lang/Enum;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-ne p1, p2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    :cond_4
    new-instance p2, Lrw/f;

    invoke-direct {p2, p1}, Lrw/f;-><init>(Ljava/lang/Class;)V

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p2, 0x0

    :goto_4
    return-object p2

    :pswitch_4
    iget-object p1, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class p2, Ljava/util/Date;

    if-ne p1, p2, :cond_6

    new-instance p1, Lrw/b;

    sget-object p2, Lrw/e;->b:Lrw/d;

    const/4 v0, 0x2

    invoke-direct {p1, p2, v0, v0}, Lrw/b;-><init>(Lrw/e;II)V

    goto :goto_5

    :cond_6
    const/4 p1, 0x0

    :goto_5
    return-object p1

    :pswitch_5
    iget-object p2, p2, Lvw/a;->b:Ljava/lang/reflect/Type;

    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_8

    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_7

    move-object v1, p2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    const/4 p1, 0x0

    goto :goto_7

    :cond_8
    if-eqz v0, :cond_9

    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    goto :goto_6

    :cond_9
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    :goto_6
    new-instance v0, Lvw/a;

    invoke-direct {v0, p2}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v0}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v0

    new-instance v1, Lrw/b;

    invoke-static {p2}, Lqw/g;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p1, v0, p2}, Lrw/b;-><init>(Low/m;Low/z;Ljava/lang/Class;)V

    move-object p1, v1

    :goto_7
    return-object p1

    nop

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

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lrw/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
