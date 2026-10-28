.class public abstract Llb1/t4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TextInputModel;",
        "Lb41/f;",
        "g",
        "(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;",
        "Lcom/whoop/design/models/items/TextInputValidation;",
        "",
        "input",
        "",
        "i",
        "(Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Z",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "textInputMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/z2;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/t4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;
    .locals 0

    invoke-static {p0}, Llb1/t4;->f(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/TextInputModel;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 0

    invoke-static {p0, p1}, Llb1/t4;->h(Lcom/whoop/design/models/items/TextInputModel;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/t4;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/t4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TextInputModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/t4$a;

    invoke-direct {v2, v0}, Llb1/t4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/t4;->g(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/TextInputModel;)Lb41/f;
    .locals 15

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getPlaceholder()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v4, v8

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getSuffix()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getCaption()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getKeyboardType()Lcom/whoop/design/models/items/TextInputKeyboardType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TextInputKeyboardType;->getType-PjHm6EE()I

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getMaxLength()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->isSecure()Z

    move-result v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->isDisabled()Z

    move-result v0

    xor-int/lit8 v10, v0, 0x1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getErrorMessage()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getOverrideTapInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    new-instance v13, Lb41/g;

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v14, 0x1d

    invoke-direct {v0, p0, v14}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v13, v0}, Lb41/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lb41/f;

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v14}, Lb41/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lb41/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final h(Lcom/whoop/design/models/items/TextInputModel;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getTextInputValidation()Lcom/whoop/design/models/items/TextInputValidation;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputValidation;->getValidityKey()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-static {p0, p1}, Llb1/t4;->i(Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    invoke-interface {v4, v5, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p0

    invoke-interface {v4, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-direct {p0, v4, v1, v0, v2}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_2
    return-object v2

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getErrorStateKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputModel;->getTextInputValidation()Lcom/whoop/design/models/items/TextInputValidation;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputValidation;->getValidityKey()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_4
    move-object p0, v2

    :goto_1
    filled-new-array {p1, v3, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    new-instance p1, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {p1, p0, v1, v0, v2}, Lcom/whoop/whoopaction/domain/models/StateClearAction;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final i(Lcom/whoop/design/models/items/TextInputValidation;Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputValidation;->getValidityKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/TextInputValidation;->getRegex()Ljava/lang/String;

    move-result-object p0

    const-string v0, "pattern"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    const-string v0, "compile(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_1
    :goto_1
    return v1
.end method
