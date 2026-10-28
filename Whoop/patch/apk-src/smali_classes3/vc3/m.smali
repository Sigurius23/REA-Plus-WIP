.class public final Lvc3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lvc3/m;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lvc3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvc3/m;->a:Lvc3/m;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lv40/d;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lv40/d;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lvc3/m;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p0}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object p1

    invoke-interface {p1}, Lzc3/b;->decodeSequentially()Z

    move-result v1

    const/4 v2, 0x1

    sget-object v3, Lvc3/m;->a:Lvc3/m;

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v3}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {p1, v1, v4}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v3

    goto :goto_1

    :cond_0
    const-wide/16 v5, 0x0

    move v1, v4

    :goto_0
    invoke-virtual {v3}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v7

    invoke-interface {p1, v7}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_2

    if-nez v7, :cond_1

    invoke-virtual {v3}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {p1, v1, v4}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v5

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-static {v7}, Ls4/d;->i(I)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    move v2, v1

    move-wide v3, v5

    :goto_1
    invoke-interface {p1, v0}, Lzc3/b;->endStructure(Lyc3/g;)V

    if-eqz v2, :cond_3

    new-instance p1, Lkotlinx/datetime/DateTimeUnit$TimeBased;

    invoke-direct {p1, v3, v4}, Lkotlinx/datetime/DateTimeUnit$TimeBased;-><init>(J)V

    return-object p1

    :cond_3
    new-instance p1, Lkotlinx/serialization/MissingFieldException;

    invoke-virtual {p0}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "nanoseconds"

    invoke-direct {p1, v1, v0}, Lkotlinx/serialization/MissingFieldException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lvc3/m;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 5

    check-cast p2, Lkotlinx/datetime/DateTimeUnit$TimeBased;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    sget-object v1, Lvc3/m;->a:Lvc3/m;

    invoke-virtual {v1}, Lvc3/m;->getDescriptor()Lyc3/g;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p2}, Lkotlinx/datetime/DateTimeUnit$TimeBased;->getNanoseconds()J

    move-result-wide v3

    invoke-interface {p1, v1, v2, v3, v4}, Lzc3/c;->encodeLongElement(Lyc3/g;IJ)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method
