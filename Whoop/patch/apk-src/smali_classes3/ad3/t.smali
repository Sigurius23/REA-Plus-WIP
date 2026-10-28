.class public final Lad3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lad3/t;

.field public static final b:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lad3/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lad3/t;->a:Lad3/t;

    const-string v0, "kotlinx.serialization.json.JsonLiteral"

    sget-object v1, Lyc3/e;->i:Lyc3/e;

    invoke-static {v0, v1}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object v0

    sput-object v0, Lad3/t;->b:Lyc3/g;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    move-result-object p1

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    instance-of v0, p1, Lad3/s;

    if-eqz v0, :cond_0

    check-cast p1, Lad3/s;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected JSON element, expected JsonLiteral, had "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, v1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {p1, v1, v0}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lad3/t;->b:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Lad3/s;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lad3/s;->y:Ljava/lang/String;

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    iget-boolean v1, p2, Lad3/s;->w:Z

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p2, p2, Lad3/s;->x:Lyc3/g;

    if-eqz p2, :cond_1

    invoke-interface {p1, p2}, Lzc3/e;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    invoke-interface {p1, v0}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lzc3/e;->encodeLong(J)V

    return-void

    :cond_2
    invoke-static {v0}, Ls7/a;->s(Ljava/lang/String;)Ll83/v;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-wide v0, p2, Ll83/v;->w:J

    sget-object p2, Lkotlinx/serialization/internal/ULongSerializer;->INSTANCE:Lkotlinx/serialization/internal/ULongSerializer;

    invoke-interface {p2}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Lzc3/e;->encodeLong(J)V

    return-void

    :cond_3
    invoke-static {v0}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lzc3/e;->encodeDouble(D)V

    return-void

    :cond_4
    invoke-static {v0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeBoolean(Z)V

    return-void

    :cond_5
    invoke-interface {p1, v0}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
