.class public final Lrw/b;
.super Low/z;
.source "SourceFile"


# static fields
.field public static final d:Lrw/a;

.field public static final e:Lrw/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lrw/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrw/a;-><init>(I)V

    sput-object v0, Lrw/b;->d:Lrw/a;

    new-instance v0, Lrw/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lrw/a;-><init>(I)V

    sput-object v0, Lrw/b;->e:Lrw/a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lrw/b;->a:I

    iput-object p2, p0, Lrw/b;->c:Ljava/lang/Object;

    iput-object p3, p0, Lrw/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Low/m;Low/z;Ljava/lang/Class;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lrw/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lrw/f;

    invoke-direct {v0, p1, p2, p3}, Lrw/f;-><init>(Low/m;Low/z;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lrw/b;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lrw/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrw/e;II)V
    .locals 6

    const/4 v0, 0x1

    iput v0, p0, Lrw/b;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrw/b;->c:Ljava/lang/Object;

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lrw/b;->b:Ljava/lang/Object;

    .line 8
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p2, p3, p1}, Ljava/text/DateFormat;->getDateTimeInstance(IILjava/util/Locale;)Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 10
    invoke-static {p2, p3}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_0
    sget v1, Lqw/h;->a:I

    const/16 v2, 0x9

    if-lt v1, v2, :cond_8

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    const-string v2, "Unknown DateFormat style: "

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz p2, :cond_4

    if-eq p2, v5, :cond_3

    if-eq p2, v4, :cond_2

    if-ne p2, v3, :cond_1

    .line 14
    const-string p2, "M/d/yy"

    goto :goto_0

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    invoke-static {p2, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_2
    const-string p2, "MMM d, yyyy"

    goto :goto_0

    .line 19
    :cond_3
    const-string p2, "MMMM d, yyyy"

    goto :goto_0

    .line 20
    :cond_4
    const-string p2, "EEEE, MMMM d, yyyy"

    .line 21
    :goto_0
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_7

    if-eq p3, v5, :cond_7

    if-eq p3, v4, :cond_6

    if-ne p3, v3, :cond_5

    .line 22
    const-string p2, "h:mm a"

    goto :goto_1

    .line 23
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    invoke-static {p3, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_6
    const-string p2, "h:mm:ss a"

    goto :goto_1

    .line 27
    :cond_7
    const-string p2, "h:mm:ss a z"

    .line 28
    :goto_1
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 29
    new-instance p3, Ljava/text/SimpleDateFormat;

    invoke-direct {p3, p2, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 30
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lrw/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrw/b;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    iget-object v1, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v1, Lrw/q;

    iget-object v1, v1, Lrw/q;->y:Ljava/lang/Object;

    check-cast v1, Low/z;

    invoke-virtual {v1, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected a "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " but was "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    return-object v1

    :pswitch_0
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lrw/b;->b:Ljava/lang/Object;

    check-cast v0, Lqw/o;

    invoke-interface {v0}, Lqw/o;->construct()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lww/a;->beginArray()V

    :goto_1
    invoke-virtual {p1}, Lww/a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v1, Lrw/f;

    iget-object v1, v1, Lrw/f;->c:Ljava/lang/Object;

    check-cast v1, Low/z;

    invoke-virtual {v1, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lww/a;->endArray()V

    move-object p1, v0

    :goto_2
    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/text/DateFormat;

    invoke-virtual {v3}, Ljava/text/DateFormat;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v3, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    monitor-exit v1

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    throw p1

    :catch_0
    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    goto :goto_3

    :cond_5
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v1, Ljava/text/ParsePosition;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-static {v0, v1}, Lsw/a;->b(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p1
    :try_end_3
    .catch Ljava/text/ParseException; {:try_start_3 .. :try_end_3} :catch_1

    :goto_4
    iget-object v0, p0, Lrw/b;->b:Ljava/lang/Object;

    check-cast v0, Lrw/e;

    invoke-virtual {v0, p1}, Lrw/e;->a(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    :goto_5
    return-object p1

    :catch_1
    move-exception v1

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v3, "Failed parsing \'"

    const-string v4, "\' as Date; at path "

    invoke-static {v3, v0, v4}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_6
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :pswitch_2
    iget-object v0, p0, Lrw/b;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p1}, Lww/a;->o0()I

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_6

    invoke-virtual {p1}, Lww/a;->T()V

    const/4 p1, 0x0

    goto :goto_9

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lww/a;->beginArray()V

    :goto_7
    invoke-virtual {p1}, Lww/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v2, Lrw/f;

    iget-object v2, v2, Lrw/f;->c:Ljava/lang/Object;

    check-cast v2, Low/z;

    invoke-virtual {v2, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    invoke-virtual {p1}, Lww/a;->endArray()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :goto_8
    if-ge v2, p1, :cond_8

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_8
    move-object p1, v0

    goto :goto_9

    :cond_9
    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    :goto_9
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lrw/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v0, Lrw/q;

    iget-object v0, v0, Lrw/q;->y:Ljava/lang/Object;

    check-cast v0, Low/z;

    invoke-virtual {v0, p1, p2}, Low/z;->c(Lww/b;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/util/Collection;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lww/b;->beginArray()V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v1, Lrw/f;

    invoke-virtual {v1, p1, v0}, Lrw/f;->c(Lww/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lww/b;->endArray()V

    :goto_1
    return-void

    :pswitch_1
    check-cast p2, Ljava/util/Date;

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    iget-object v1, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    :goto_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :pswitch_2
    if-nez p2, :cond_3

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_4

    :cond_3
    invoke-virtual {p1}, Lww/b;->beginArray()V

    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    :goto_3
    if-ge v1, v0, :cond_4

    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v3, Lrw/f;

    invoke-virtual {v3, p1, v2}, Lrw/f;->c(Lww/b;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lww/b;->endArray()V

    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lrw/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrw/b;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    instance-of v1, v0, Ljava/text/SimpleDateFormat;

    const/16 v2, 0x29

    const-string v3, "DefaultDateTypeAdapter("

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
