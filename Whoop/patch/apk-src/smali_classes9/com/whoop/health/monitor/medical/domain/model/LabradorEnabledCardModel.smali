.class public final Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$$serializer;,
        Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0008\u0081\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB=\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020\u00042\u0008\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001bR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001d\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "header",
        "",
        "error",
        "",
        "items",
        "<init>",
        "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$kennel_release",
        "(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "component2",
        "()Z",
        "component3",
        "()Ljava/util/List;",
        "copy",
        "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
        "getHeader",
        "Z",
        "getError",
        "Ljava/util/List;",
        "getItems",
        "Companion",
        "$serializer",
        "kennel_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$Companion;


# instance fields
.field private final error:Z

.field private final header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->Companion:Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwi0/d;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lwi0/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v1, 0x2

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_0

    .line 3
    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    goto :goto_1

    :cond_1
    iput-boolean p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    :goto_1
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 5
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 6
    iput-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    return-void

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
            "Z",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    .line 9
    iput-boolean p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    .line 10
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 11
    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 12
    sget-object p3, Lm83/y;->w:Lm83/y;

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->copy(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$kennel_release(Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;Lzc3/c;Lyc3/g;)V
    .locals 10

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    new-instance v3, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel$$serializer;->INSTANCE:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel$$serializer;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    if-eqz v2, :cond_3

    :goto_1
    iget-boolean v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;",
            "Z",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;"
        }
    .end annotation

    const-string v0, "header"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;-><init>(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;ZLjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    iget-boolean v3, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getError()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    return v0
.end method

.method public final getHeader()Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    invoke-virtual {v0}, Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->header:Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;

    iget-boolean v1, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->error:Z

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/LabradorEnabledCardModel;->items:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LabradorEnabledCardModel(header="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
