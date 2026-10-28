.class public final Lrw/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Low/a0;


# static fields
.field public static final z:Lrw/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrw/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lrw/a;-><init>(I)V

    sput-object v0, Lrw/q;->z:Lrw/a;

    return-void
.end method

.method public constructor <init>(Lf1/p1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lrw/q;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lrw/q;->x:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lrw/q;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Low/z;I)V
    .locals 0

    .line 1
    iput p3, p0, Lrw/q;->w:I

    iput-object p1, p0, Lrw/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lrw/q;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Low/m;Lvw/a;)Low/z;
    .locals 7

    iget v0, p0, Lrw/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class v1, Lpw/a;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lpw/a;

    if-nez v5, :cond_0

    const/4 p1, 0x0

    move-object v1, p0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrw/q;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lf1/p1;

    const/4 v6, 0x1

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lrw/q;->b(Lf1/p1;Low/m;Lvw/a;Lpw/a;Z)Low/z;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    move-object v1, p0

    move-object v4, p2

    iget-object p1, v4, Lvw/a;->a:Ljava/lang/Class;

    iget-object p2, v1, Lrw/q;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    new-instance p2, Lrw/b;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0, p1}, Lrw/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, p2

    :goto_1
    return-object p1

    :pswitch_1
    move-object v1, p0

    move-object v4, p2

    iget-object p1, v4, Lvw/a;->a:Ljava/lang/Class;

    iget-object p2, v1, Lrw/q;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Class;

    if-ne p1, p2, :cond_2

    iget-object p1, v1, Lrw/q;->y:Ljava/lang/Object;

    check-cast p1, Low/z;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lf1/p1;Low/m;Lvw/a;Lpw/a;Z)Low/z;
    .locals 2

    invoke-interface {p4}, Lpw/a;->value()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Lvw/a;

    invoke-direct {v1, v0}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v1, v0}, Lf1/p1;->j(Lvw/a;Z)Lqw/o;

    move-result-object p1

    invoke-interface {p1}, Lqw/o;->construct()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p4}, Lpw/a;->nullSafe()Z

    move-result p4

    instance-of v0, p1, Low/z;

    if-eqz v0, :cond_0

    check-cast p1, Low/z;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Low/a0;

    if-eqz v0, :cond_3

    check-cast p1, Low/a0;

    if-eqz p5, :cond_1

    iget-object p5, p3, Lvw/a;->a:Ljava/lang/Class;

    iget-object v0, p0, Lrw/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p5, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Low/a0;

    if-eqz p5, :cond_1

    move-object p1, p5

    :cond_1
    invoke-interface {p1, p2, p3}, Low/a0;->a(Low/m;Lvw/a;)Low/z;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    if-eqz p4, :cond_2

    invoke-virtual {p1}, Low/z;->a()Low/y;

    move-result-object p1

    :cond_2
    return-object p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Invalid attempt to bind an instance of "

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lvw/a;->b:Ljava/lang/reflect/Type;

    invoke-static {p1}, Lqw/g;->k(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lrw/q;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Factory[typeHierarchy="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lrw/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    const-string v2, ",adapter="

    invoke-static {v1, v0, v2}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v1, p0, Lrw/q;->y:Ljava/lang/Object;

    check-cast v1, Low/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Factory[type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lrw/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    const-string v2, ",adapter="

    invoke-static {v1, v0, v2}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-object v1, p0, Lrw/q;->y:Ljava/lang/Object;

    check-cast v1, Low/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
