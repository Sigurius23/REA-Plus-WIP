.class public final Lkotlinx/serialization/internal/ObjectSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\'\u0008\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u0008\u0007\u0010\u000cJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0017R\u001c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lkotlinx/serialization/internal/ObjectSerializer;",
        "",
        "T",
        "Lwc3/c;",
        "",
        "serialName",
        "objectInstance",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Object;)V",
        "",
        "",
        "classAnnotations",
        "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Ljava/lang/Object;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "",
        "_annotations",
        "Ljava/util/List;",
        "Lyc3/g;",
        "descriptor$delegate",
        "Ll83/h;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private _annotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private final descriptor$delegate:Ll83/h;

.field private final objectInstance:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "serialName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objectInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkotlinx/serialization/internal/ObjectSerializer;->objectInstance:Ljava/lang/Object;

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    iput-object p2, p0, Lkotlinx/serialization/internal/ObjectSerializer;->_annotations:Ljava/util/List;

    .line 3
    sget-object p2, Ll83/i;->x:Ll83/i;

    new-instance v0, Lk80/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, p0}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/serialization/internal/ObjectSerializer;->descriptor$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;[",
            "Ljava/lang/annotation/Annotation;",
            ")V"
        }
    .end annotation

    const-string v0, "serialName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objectInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classAnnotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-static {p3}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lkotlinx/serialization/internal/ObjectSerializer;->_annotations:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lkotlinx/serialization/internal/ObjectSerializer;)Lyc3/g;
    .locals 0

    invoke-static {p0, p1}, Lkotlinx/serialization/internal/ObjectSerializer;->descriptor_delegate$lambda$1(Ljava/lang/String;Lkotlinx/serialization/internal/ObjectSerializer;)Lyc3/g;

    move-result-object p0

    return-object p0
.end method

.method private static final descriptor_delegate$lambda$1(Ljava/lang/String;Lkotlinx/serialization/internal/ObjectSerializer;)Lyc3/g;
    .locals 6

    sget-object v2, Lyc3/l;->d:Lyc3/l;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v1, "serialName"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lyc3/l;->a:Lyc3/l;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v5, Lyc3/a;

    invoke-direct {v5, p0}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlinx/serialization/internal/ObjectSerializer;->descriptor_delegate$lambda$1$lambda$0(Lkotlinx/serialization/internal/ObjectSerializer;Lyc3/a;)Ll83/a0;

    move-object p1, v0

    new-instance v0, Lyc3/h;

    iget-object v1, v5, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Blank serial names are prohibited"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final descriptor_delegate$lambda$1$lambda$0(Lkotlinx/serialization/internal/ObjectSerializer;Lyc3/a;)Ll83/a0;
    .locals 1

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlinx/serialization/internal/ObjectSerializer;->_annotations:Ljava/util/List;

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lyc3/a;->b:Ljava/util/List;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")TT;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ObjectSerializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object p1

    invoke-interface {p1}, Lzc3/b;->decodeSequentially()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lkotlinx/serialization/internal/ObjectSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {p1, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    :goto_0
    invoke-interface {p1, v0}, Lzc3/b;->endStructure(Lyc3/g;)V

    iget-object p1, p0, Lkotlinx/serialization/internal/ObjectSerializer;->objectInstance:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Unexpected index "

    invoke-static {v1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lkotlinx/serialization/internal/ObjectSerializer;->descriptor$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc3/g;

    return-object v0
.end method

.method public serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ObjectSerializer;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/ObjectSerializer;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method
