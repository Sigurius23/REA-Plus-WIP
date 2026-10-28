.class public final Lvc3/f;
.super Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;
.source "SourceFile"


# static fields
.field public static final a:Lvc3/f;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvc3/f;

    invoke-direct {v0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;-><init>()V

    sput-object v0, Lvc3/f;->a:Lvc3/f;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lv40/d;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lv40/d;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lvc3/f;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final findPolymorphicSerializerOrNull(Lzc3/b;Ljava/lang/String;)Lwc3/b;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lvc3/f;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/g;

    .line 6
    invoke-virtual {v0, p1, p2}, Lwc3/g;->findPolymorphicSerializerOrNull(Lzc3/b;Ljava/lang/String;)Lwc3/b;

    move-result-object p1

    return-object p1
.end method

.method public final findPolymorphicSerializerOrNull(Lzc3/e;Ljava/lang/Object;)Lwc3/j;
    .locals 1

    .line 1
    check-cast p2, Lkotlinx/datetime/DateTimeUnit;

    .line 2
    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lvc3/f;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/g;

    .line 4
    invoke-virtual {v0, p1, p2}, Lwc3/g;->findPolymorphicSerializerOrNull(Lzc3/e;Ljava/lang/Object;)Lwc3/j;

    move-result-object p1

    return-object p1
.end method

.method public final getBaseClass()Lj93/d;
    .locals 2

    const-class v0, Lkotlinx/datetime/DateTimeUnit;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lvc3/f;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/g;

    invoke-virtual {v0}, Lwc3/g;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0
.end method
