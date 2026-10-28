.class public final Lcom/whoop/design/json/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/json/a$a;
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
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u000b0\u00010\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/design/json/a;",
        "Lwc3/c;",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "e",
        "(Lzc3/e;Lcom/whoop/design/models/modal/AnyModal;)V",
        "Lcom/whoop/design/models/modal/Modal;",
        "modal",
        "Ll83/k;",
        "",
        "d",
        "(Lcom/whoop/design/models/modal/Modal;)Ll83/k;",
        "Lzc3/d;",
        "decoder",
        "c",
        "(Lzc3/d;)Lcom/whoop/design/models/modal/AnyModal;",
        "Lyc3/g;",
        "a",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "descriptor",
        "b",
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
.field public static final b:Lcom/whoop/design/json/a$a;

.field public static final c:I

.field private static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ltr2/n;


# instance fields
.field private final a:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/json/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/json/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/json/a;->b:Lcom/whoop/design/json/a$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/json/a;->c:I

    sget-object v0, Lcom/whoop/design/models/modal/ModalType;->DIALOG:Lcom/whoop/design/models/modal/ModalType;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalType;->getValue()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/modal/DialogModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/modal/ModalType;->BOTTOM_SHEET:Lcom/whoop/design/models/modal/ModalType;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalType;->getValue()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/whoop/design/models/modal/BottomSheet;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/modal/ModalType;->FULLSCREEN:Lcom/whoop/design/models/modal/ModalType;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalType;->getValue()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/whoop/design/models/modal/FullScreenContentModal;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/modal/ModalType;->COACH:Lcom/whoop/design/models/modal/ModalType;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalType;->getValue()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/whoop/design/models/modal/CoachModal;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/modal/ModalType;->TOAST:Lcom/whoop/design/models/modal/ModalType;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalType;->getValue()Ljava/lang/String;

    move-result-object v0

    const-class v2, Lcom/whoop/design/models/modal/ToastModal;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5, v6, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/json/a;->d:Ljava/util/Map;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "AnyModalSerializer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/json/a;->e:Ltr2/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v2, "AnyModal"

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, Lyc3/a;

    invoke-direct {v6, v2}, Lyc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lcom/whoop/design/json/a;->b(Lyc3/a;)Ll83/a0;

    new-instance v1, Lyc3/h;

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    iget-object v4, v6, Lyc3/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, Lyc3/h;-><init>(Ljava/lang/String;Lyc3/k;ILjava/util/List;Lyc3/a;)V

    iput-object v1, p0, Lcom/whoop/design/json/a;->a:Lyc3/g;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic a()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/whoop/design/json/a;->d:Ljava/util/Map;

    return-object v0
.end method

.method private static final b(Lyc3/a;)Ll83/a0;
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

    sget-object v0, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;->Companion:Lcom/whoop/design/models/modal/ModalAnalyticEventModel$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalAnalyticEventModel$Companion;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "analytic_events"

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object v0, Lcom/whoop/design/models/modal/ModalLifecycleInteractions;->Companion:Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;->serializer()Lwc3/c;

    move-result-object v0

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    const-string v1, "modal_lifecycle_interactions"

    invoke-virtual {p0, v1, v0, v2}, Lyc3/a;->a(Ljava/lang/String;Lyc3/g;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public c(Lzc3/d;)Lcom/whoop/design/models/modal/AnyModal;
    .locals 9

    const-string v0, "No serializer found for modal type: "

    const-string v1, "Unknown modal type: "

    const-string v2, "decoder"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lad3/k;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast p1, Lad3/k;

    goto :goto_0

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_9

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v2

    invoke-static {v2}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object v2

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "type"

    invoke-virtual {v2, v5}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlinx/serialization/json/JsonElement;

    if-eqz v5, :cond_4

    invoke-static {v5}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v5

    invoke-static {v5}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    sget-object v6, Lcom/whoop/design/json/a;->d:Ljava/util/Map;

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "toUpperCase(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj93/d;

    if-eqz v6, :cond_3

    invoke-static {v6}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v0, "content"

    invoke-virtual {v2, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v5

    check-cast v1, Lwc3/b;

    invoke-virtual {v5, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/modal/Modal;

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "Missing \"content\" field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v1, Lkotlinx/serialization/SerializationException;

    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v0, Lkotlinx/serialization/SerializationException;

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "Missing \"type\" field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    sget-object v1, Lcom/whoop/design/json/a;->e:Ltr2/n;

    const-string v5, "Modal deserialization failed, returning UnknownModal"

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {v1, v5, v0, v6}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object v0, Lcom/whoop/design/models/modal/UnknownModal;->INSTANCE:Lcom/whoop/design/models/modal/UnknownModal;

    :goto_2
    :try_start_1
    const-string v1, "analytic_events"

    invoke-virtual {v2, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_6

    instance-of v5, v1, Lkotlinx/serialization/json/JsonNull;

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    move-object v1, v3

    :goto_3
    if-eqz v1, :cond_6

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;->Companion:Lcom/whoop/design/models/modal/ModalAnalyticEventModel$Companion;

    invoke-virtual {v6}, Lcom/whoop/design/models/modal/ModalAnalyticEventModel$Companion;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v5, v6, v1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v1

    sget-object v5, Lcom/whoop/design/json/a;->e:Ltr2/n;

    const-string v6, "Modal analytic events deserialization failed, ignoring"

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v5, v6, v1, v7}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_6
    move-object v1, v3

    :goto_4
    :try_start_2
    const-string v5, "modal_lifecycle_interactions"

    invoke-virtual {v2, v5}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    if-eqz v2, :cond_8

    instance-of v5, v2, Lkotlinx/serialization/json/JsonNull;

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    move-object v2, v3

    :goto_5
    if-eqz v2, :cond_8

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    sget-object v5, Lcom/whoop/design/models/modal/ModalLifecycleInteractions;->Companion:Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;

    invoke-virtual {v5}, Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-virtual {p1, v5, v2}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/modal/ModalLifecycleInteractions;
    :try_end_2
    .catch Lkotlinx/serialization/SerializationException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v3, p1

    goto :goto_6

    :catch_2
    move-exception p1

    sget-object v2, Lcom/whoop/design/json/a;->e:Ltr2/n;

    const-string v5, "Modal lifecycle interactions deserialization failed, ignoring"

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v5, p1, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_8
    :goto_6
    new-instance p1, Lcom/whoop/design/models/modal/AnyModal;

    invoke-direct {p1, v0, v1, v3}, Lcom/whoop/design/models/modal/AnyModal;-><init>(Lcom/whoop/design/models/modal/Modal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/design/models/modal/ModalLifecycleInteractions;)V

    return-object p1

    :cond_9
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "AnyModalSerializer can only be used with JSON"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lcom/whoop/design/models/modal/Modal;)Ll83/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/modal/Modal;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "modal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/json/a;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ljava/util/Map$Entry;

    if-eqz v1, :cond_2

    new-instance v2, Ll83/k;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    new-instance p1, Ll83/k;

    if-eqz v2, :cond_3

    iget-object v0, v2, Ll83/k;->w:Ljava/lang/Object;

    iget-object v1, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lj93/d;

    invoke-static {v1}, Lvb/g;->i(Lj93/d;)Lwc3/c;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_3
    sget-object v0, Lcom/whoop/design/models/modal/UnknownModal;->INSTANCE:Lcom/whoop/design/models/modal/UnknownModal;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/UnknownModal;->serializer()Lwc3/c;

    move-result-object v0

    const-string v1, "UNKNOWN"

    invoke-direct {p1, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/design/json/a;->c(Lzc3/d;)Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    return-object p1
.end method

.method public e(Lzc3/e;Lcom/whoop/design/models/modal/AnyModal;)V
    .locals 5

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/whoop/design/models/modal/AnyModal;->getModal()Lcom/whoop/design/models/modal/Modal;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whoop/design/json/a;->d(Lcom/whoop/design/models/modal/Modal;)Ll83/k;

    move-result-object v1

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lwc3/c;

    check-cast p1, Lad3/p;

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<com.whoop.design.models.modal.Modal>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lwc3/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v0, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    const-string v3, "element"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "type"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    const-string v2, "content"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {p2}, Lcom/whoop/design/models/modal/AnyModal;->getAnalyticEvents()Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v2

    sget-object v3, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;->Companion:Lcom/whoop/design/models/modal/ModalAnalyticEventModel$Companion;

    invoke-virtual {v3}, Lcom/whoop/design/models/modal/ModalAnalyticEventModel$Companion;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/j;

    invoke-virtual {v2, v3, v0}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    const-string v2, "analytic_events"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/design/models/modal/AnyModal;->getModalLifecycleInteractions()Lcom/whoop/design/models/modal/ModalLifecycleInteractions;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/models/modal/ModalLifecycleInteractions;->Companion:Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;

    invoke-virtual {v2}, Lcom/whoop/design/models/modal/ModalLifecycleInteractions$Companion;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {v0, v2, p2}, Lad3/c;->c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    const-string v0, "modal_lifecycle_interactions"

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    :cond_1
    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p2, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    invoke-interface {p1, p2}, Lad3/p;->c(Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/json/a;->a:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/design/models/modal/AnyModal;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/json/a;->e(Lzc3/e;Lcom/whoop/design/models/modal/AnyModal;)V

    return-void
.end method
