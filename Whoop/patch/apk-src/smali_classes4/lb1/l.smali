.class public abstract Llb1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AppointmentCardModel;",
        "model",
        "Lxz0/f;",
        "f",
        "(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;",
        "Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;",
        "Lxz0/b;",
        "g",
        "(Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;)Lxz0/b;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "appointmentCardMapper",
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

    new-instance v0, Llb1/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/l;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;
    .locals 0

    invoke-static {p0}, Llb1/l;->d(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AppointmentCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/l$a;

    invoke-direct {v2, v0}, Llb1/l$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/l;->f(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/l;->a:Llb1/y0;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/models/items/AppointmentCardModel;)Lxz0/f;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getHeader()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getIconButton()Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llb1/l;->g(Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;)Lxz0/b;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Llb1/q4;->d(Lcom/whoop/design/models/items/TagModel;)Lhy0/h1;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getDescriptionImageUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object v6, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_3

    new-instance v8, Lkd1/o$c;

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object v8, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getImageAlignment()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lxz0/c;->values()[Lxz0/c;

    move-result-object v9

    array-length v10, v9

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_5

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_5
    move-object v12, v1

    :goto_5
    if-nez v12, :cond_6

    goto :goto_7

    :cond_6
    :goto_6
    move-object v9, v12

    goto :goto_8

    :cond_7
    :goto_7
    sget-object v12, Lxz0/c;->LEADING:Lxz0/c;

    goto :goto_6

    :goto_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getDate()Lcom/whoop/design/models/items/AppointmentCardDateModel;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v10, Lxz0/a;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AppointmentCardDateModel;->getMonth()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/design/models/items/AppointmentCardDateModel;->getDay()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v11, v0}, Lxz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_8
    move-object v10, v1

    :goto_9
    const/4 v0, 0x1

    invoke-static {v1, v0, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v12

    new-instance v1, Lxz0/f;

    invoke-direct/range {v1 .. v12}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final g(Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;)Lxz0/b;
    .locals 6

    new-instance v0, Lxz0/b;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lgz0/m0;->ADD:Lgz0/m0;

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    instance-of v4, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    if-eqz v4, :cond_1

    check-cast p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    const/4 v4, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->getRequest()Lcom/whoop/whoopaction/domain/models/Request;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/Request;->getPath()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    const-string v5, "dismissals"

    invoke-static {p0, v5, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    const/4 v5, 0x1

    if-ne p0, v5, :cond_2

    move v4, v5

    :cond_2
    invoke-direct {v0, v1, v2, v3, v4}, Lxz0/b;-><init>(Lgz0/m0;Ljava/lang/Object;Lcom/whoop/whoopaction/domain/models/Action;Z)V

    return-object v0
.end method
