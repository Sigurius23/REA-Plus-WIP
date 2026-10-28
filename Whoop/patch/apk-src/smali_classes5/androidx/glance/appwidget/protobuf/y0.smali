.class public final Landroidx/glance/appwidget/protobuf/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Landroidx/glance/appwidget/protobuf/y0;


# instance fields
.field public final a:Landroidx/glance/appwidget/protobuf/m0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/glance/appwidget/protobuf/y0;

    invoke-direct {v0}, Landroidx/glance/appwidget/protobuf/y0;-><init>()V

    sput-object v0, Landroidx/glance/appwidget/protobuf/y0;->c:Landroidx/glance/appwidget/protobuf/y0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Landroidx/glance/appwidget/protobuf/y0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Landroidx/glance/appwidget/protobuf/m0;

    invoke-direct {v0}, Landroidx/glance/appwidget/protobuf/m0;-><init>()V

    iput-object v0, p0, Landroidx/glance/appwidget/protobuf/y0;->a:Landroidx/glance/appwidget/protobuf/m0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Landroidx/glance/appwidget/protobuf/b1;
    .locals 9

    const-string v0, "messageType"

    invoke-static {p1, v0}, Landroidx/glance/appwidget/protobuf/f0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/glance/appwidget/protobuf/y0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/glance/appwidget/protobuf/b1;

    if-nez v1, :cond_c

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/y0;->a:Landroidx/glance/appwidget/protobuf/m0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Landroidx/glance/appwidget/protobuf/c1;->a:Ljava/lang/Class;

    const-class v2, Landroidx/glance/appwidget/protobuf/a0;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Landroidx/glance/appwidget/protobuf/c1;->a:Ljava/lang/Class;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Message classes must extend GeneratedMessage or GeneratedMessageLite"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v1, v1, Landroidx/glance/appwidget/protobuf/m0;->a:Ljava/lang/Object;

    check-cast v1, Landroidx/glance/appwidget/protobuf/l0;

    invoke-virtual {v1, p1}, Landroidx/glance/appwidget/protobuf/l0;->a(Ljava/lang/Class;)Landroidx/glance/appwidget/protobuf/a1;

    move-result-object v3

    iget v1, v3, Landroidx/glance/appwidget/protobuf/a1;->d:I

    iget-object v4, v3, Landroidx/glance/appwidget/protobuf/a1;->a:Landroidx/glance/appwidget/protobuf/a;

    const/4 v5, 0x2

    and-int/2addr v1, v5

    const-string v6, "Protobuf runtime is not correctly loaded."

    if-ne v1, v5, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Landroidx/glance/appwidget/protobuf/c1;->c:Landroidx/glance/appwidget/protobuf/f1;

    sget-object v2, Landroidx/glance/appwidget/protobuf/u;->a:Landroidx/glance/appwidget/protobuf/t;

    new-instance v3, Landroidx/glance/appwidget/protobuf/t0;

    invoke-direct {v3, v1, v2, v4}, Landroidx/glance/appwidget/protobuf/t0;-><init>(Landroidx/glance/appwidget/protobuf/d1;Landroidx/glance/appwidget/protobuf/t;Landroidx/glance/appwidget/protobuf/a;)V

    goto/16 :goto_2

    :cond_2
    sget-object v1, Landroidx/glance/appwidget/protobuf/c1;->b:Landroidx/glance/appwidget/protobuf/d1;

    sget-object v2, Landroidx/glance/appwidget/protobuf/u;->b:Landroidx/glance/appwidget/protobuf/t;

    if-eqz v2, :cond_3

    new-instance v3, Landroidx/glance/appwidget/protobuf/t0;

    invoke-direct {v3, v1, v2, v4}, Landroidx/glance/appwidget/protobuf/t0;-><init>(Landroidx/glance/appwidget/protobuf/d1;Landroidx/glance/appwidget/protobuf/t;Landroidx/glance/appwidget/protobuf/a;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_7

    move-object v1, v4

    sget-object v4, Landroidx/glance/appwidget/protobuf/v0;->b:Landroidx/glance/appwidget/protobuf/u0;

    sget-object v5, Landroidx/glance/appwidget/protobuf/j0;->b:Landroidx/glance/appwidget/protobuf/i0;

    sget-object v6, Landroidx/glance/appwidget/protobuf/c1;->c:Landroidx/glance/appwidget/protobuf/f1;

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/a1;->a()I

    move-result v7

    invoke-static {v7}, Le4/p;->e(I)I

    move-result v7

    if-eq v7, v2, :cond_5

    sget-object v1, Landroidx/glance/appwidget/protobuf/u;->a:Landroidx/glance/appwidget/protobuf/t;

    :cond_5
    move-object v7, v1

    sget-object v8, Landroidx/glance/appwidget/protobuf/p0;->b:Landroidx/glance/appwidget/protobuf/o0;

    instance-of v1, v3, Landroidx/glance/appwidget/protobuf/a1;

    if-eqz v1, :cond_6

    invoke-static/range {v3 .. v8}, Landroidx/glance/appwidget/protobuf/s0;->z(Landroidx/glance/appwidget/protobuf/a1;Landroidx/glance/appwidget/protobuf/u0;Landroidx/glance/appwidget/protobuf/i0;Landroidx/glance/appwidget/protobuf/d1;Landroidx/glance/appwidget/protobuf/t;Landroidx/glance/appwidget/protobuf/o0;)Landroidx/glance/appwidget/protobuf/s0;

    move-result-object v3

    goto :goto_2

    :cond_6
    sget-object p1, Landroidx/glance/appwidget/protobuf/s0;->n:[I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_7
    move-object v1, v4

    sget-object v4, Landroidx/glance/appwidget/protobuf/v0;->a:Landroidx/glance/appwidget/protobuf/u0;

    sget-object v5, Landroidx/glance/appwidget/protobuf/j0;->a:Landroidx/glance/appwidget/protobuf/i0;

    move-object v7, v6

    sget-object v6, Landroidx/glance/appwidget/protobuf/c1;->b:Landroidx/glance/appwidget/protobuf/d1;

    invoke-virtual {v3}, Landroidx/glance/appwidget/protobuf/a1;->a()I

    move-result v8

    invoke-static {v8}, Le4/p;->e(I)I

    move-result v8

    if-eq v8, v2, :cond_8

    sget-object v1, Landroidx/glance/appwidget/protobuf/u;->b:Landroidx/glance/appwidget/protobuf/t;

    if-eqz v1, :cond_9

    :cond_8
    move-object v7, v1

    goto :goto_1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    sget-object v8, Landroidx/glance/appwidget/protobuf/p0;->a:Landroidx/glance/appwidget/protobuf/o0;

    instance-of v1, v3, Landroidx/glance/appwidget/protobuf/a1;

    if-eqz v1, :cond_b

    invoke-static/range {v3 .. v8}, Landroidx/glance/appwidget/protobuf/s0;->z(Landroidx/glance/appwidget/protobuf/a1;Landroidx/glance/appwidget/protobuf/u0;Landroidx/glance/appwidget/protobuf/i0;Landroidx/glance/appwidget/protobuf/d1;Landroidx/glance/appwidget/protobuf/t;Landroidx/glance/appwidget/protobuf/o0;)Landroidx/glance/appwidget/protobuf/s0;

    move-result-object v3

    :goto_2
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/glance/appwidget/protobuf/b1;

    if-eqz p1, :cond_a

    return-object p1

    :cond_a
    return-object v3

    :cond_b
    sget-object p1, Landroidx/glance/appwidget/protobuf/s0;->n:[I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_c
    return-object v1
.end method
