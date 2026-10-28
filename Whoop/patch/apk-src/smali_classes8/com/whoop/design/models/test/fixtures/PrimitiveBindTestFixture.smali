.class public final Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJB\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010\u0015J\u0010\u0010!\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0017J\u001a\u0010#\u001a\u00020\u00072\u0008\u0010\"\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010%\u001a\u0004\u0008&\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\'\u001a\u0004\u0008(\u0010\u0017R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008*\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010-\u001a\u0004\u0008.\u0010\u001dR0\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104RE\u0010:\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000205\u0018\u00010\u000fj\u0004\u0018\u0001`6\u00a2\u0006\u000c\u00087\u0012\u0008\u00088\u0012\u0004\u0008\t098\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u00100\u001a\u0004\u0008;\u00102\"\u0004\u0008<\u00104\u00a8\u0006="
    }
    d2 = {
        "Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "stringValue",
        "",
        "intValue",
        "",
        "booleanValue",
        "",
        "longValue",
        "",
        "doubleValue",
        "<init>",
        "(Ljava/lang/String;IZJD)V",
        "",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "()Z",
        "component4",
        "()J",
        "component5",
        "()D",
        "copy",
        "(Ljava/lang/String;IZJD)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStringValue",
        "I",
        "getIntValue",
        "Z",
        "getBooleanValue",
        "J",
        "getLongValue",
        "D",
        "getDoubleValue",
        "bindings",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "getAggregateBindings",
        "setAggregateBindings",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final booleanValue:Z

.field private final doubleValue:D

.field private final intValue:I

.field private final longValue:J

.field private final stringValue:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IZJD)V
    .locals 1

    const-string v0, "stringValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    iput p2, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    iput-boolean p3, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    iput-wide p4, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    iput-wide p6, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;Ljava/lang/String;IZJDILjava/lang/Object;)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    iget-wide p6, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    :cond_4
    move-wide p8, p6

    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->copy(Ljava/lang/String;IZJD)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->bind(Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixtureStateBindingKt;->generatedBind(Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;IZJD)Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;
    .locals 9

    const-string v0, "stringValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-wide v5, p4

    move-wide v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;-><init>(Ljava/lang/String;IZJD)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    iget-object v1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    iget v3, p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    iget-wide v5, p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    iget-wide v5, p1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBooleanValue()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    return v0
.end method

.method public final getDoubleValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    return-wide v0
.end method

.method public final getIntValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    return v0
.end method

.method public final getLongValue()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    return-wide v0
.end method

.method public final getStringValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->stringValue:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->intValue:I

    iget-boolean v2, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->booleanValue:Z

    iget-wide v3, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->longValue:J

    iget-wide v5, p0, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;->doubleValue:D

    const-string v7, ", intValue="

    const-string v8, ", booleanValue="

    const-string v9, "PrimitiveBindTestFixture(stringValue="

    invoke-static {v1, v9, v0, v7, v8}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", longValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", doubleValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
