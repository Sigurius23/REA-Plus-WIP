.class public final Lvc3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lvc3/h;

.field public static final b:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvc3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvc3/h;->a:Lvc3/h;

    const-string v0, "kotlinx.datetime.FixedOffsetTimeZone"

    sget-object v1, Lyc3/e;->i:Lyc3/e;

    invoke-static {v0, v1}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object v0

    sput-object v0, Lvc3/h;->b:Lyc3/g;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lkotlinx/datetime/TimeZone;->Companion:Lpc3/p;

    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lpc3/p;->a(Ljava/lang/String;)Lkotlinx/datetime/TimeZone;

    move-result-object p1

    instance-of v0, p1, Lkotlinx/datetime/FixedOffsetTimeZone;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/datetime/FixedOffsetTimeZone;

    return-object p1

    :cond_0
    new-instance v0, Lkotlinx/serialization/SerializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Timezone identifier \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' does not correspond to a fixed-offset timezone"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lvc3/h;->b:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/datetime/FixedOffsetTimeZone;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lkotlinx/datetime/TimeZone;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
