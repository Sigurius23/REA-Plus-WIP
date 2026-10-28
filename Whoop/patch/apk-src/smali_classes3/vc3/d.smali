.class public final Lvc3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lvc3/d;

.field public static final b:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvc3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvc3/d;->a:Lvc3/d;

    const-string v0, "kotlinx.datetime.DateTimePeriod/ISO"

    sget-object v1, Lyc3/e;->i:Lyc3/e;

    invoke-static {v0, v1}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object v0

    sput-object v0, Lvc3/d;->b:Lyc3/g;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlinx/datetime/DateTimePeriod;->Companion:Lpc3/b;

    invoke-interface {p1}, Lzc3/d;->decodeString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lpc3/b;->a(Ljava/lang/String;)Lkotlinx/datetime/DateTimePeriod;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lvc3/d;->b:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/datetime/DateTimePeriod;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lkotlinx/datetime/DateTimePeriod;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
