.class public final Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00142\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;",
        "Lwc3/c;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "Companion",
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
.field public static final $stable:I

.field private static final CONTENT:Ljava/lang/String; = "content"

.field public static final Companion:Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer$Companion;

.field private static final TYPE:Ljava/lang/String; = "type"

.field private static final logger:Ltr2/n;


# instance fields
.field private final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->Companion:Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->$stable:I

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "CalendarDayModelSerializer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->logger:Ltr2/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "CalendarDayModel"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->descriptor$lambda$0(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    iput-object v1, p0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->descriptor:Lyc3/g;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final descriptor$lambda$0(Lyc3/a;)Ll83/a0;
    .locals 3

    const-string v0, "$this$buildClassSerialDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "type"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v0}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public deserialize(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;
    .locals 8

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lad3/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_7

    .line 3
    :try_start_0
    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v0

    .line 4
    const-string v2, "type"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_6

    invoke-static {v2}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    invoke-static {v2}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 5
    invoke-static {}, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->getEntries()Lt83/a;

    move-result-object v3

    .line 6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    .line 7
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "toUpperCase(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v1, v4

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    check-cast v1, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;

    if-eqz v1, :cond_5

    .line 8
    invoke-virtual {v1}, Lcom/whoop/design/models/calendar/archmini/CalendarDayType;->getModelType()Lj93/d;

    move-result-object v1

    invoke-static {v1}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 9
    const-string v2, "content"

    invoke-virtual {v0, v2}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_3

    .line 10
    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    check-cast v1, Lwc3/b;

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;

    return-object p1

    .line 11
    :cond_3
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Missing \"content\" field"

    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    throw p1

    .line 14
    :cond_4
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No serializer found for calendar day type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    throw p1

    .line 17
    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown calendar day type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    throw p1

    .line 20
    :cond_6
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Missing \"type\" field"

    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :goto_2
    sget-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->logger:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Calendar day deserialization failed, returning UnknownCalendarDayModel"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    .line 24
    sget-object p1, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;

    return-object p1

    .line 25
    :cond_7
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "CalendarDayModelSerializer can only be used with JSON"

    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->deserialize(Lzc3/d;)Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public serialize(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 3
    const-string p2, "Serialization of CalendarDayModel is not supported. Calendar days are only deserialized from the backend."

    .line 4
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;->serialize(Lzc3/e;Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;)V

    return-void
.end method
