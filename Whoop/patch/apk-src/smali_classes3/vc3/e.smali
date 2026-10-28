.class public final Lvc3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final b:Lvc3/e;

.field public static final c:Lyc3/g;


# instance fields
.field public final synthetic a:Lvc3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvc3/e;

    invoke-direct {v0}, Lvc3/e;-><init>()V

    sput-object v0, Lvc3/e;->b:Lvc3/e;

    const-string v0, "kotlinx.datetime.DateTimePeriod"

    sget-object v1, Lyc3/e;->i:Lyc3/e;

    invoke-static {v0, v1}, Lvf3/b;->b(Ljava/lang/String;Lyc3/f;)Lyc3/g;

    move-result-object v0

    sput-object v0, Lvc3/e;->c:Lyc3/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lvc3/d;->a:Lvc3/d;

    iput-object v0, p0, Lvc3/e;->a:Lvc3/d;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvc3/e;->a:Lvc3/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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

    sget-object v0, Lvc3/e;->c:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/datetime/DateTimePeriod;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvc3/e;->a:Lvc3/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Lkotlinx/datetime/DateTimePeriod;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->encodeString(Ljava/lang/String;)V

    return-void
.end method
