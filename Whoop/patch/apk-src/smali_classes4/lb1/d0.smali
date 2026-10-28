.class public abstract Llb1/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/d0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a)\u0010\r\u001a\u00020\u000c*\u0004\u0018\u00010\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CheckboxModel;",
        "Lsy0/e;",
        "i",
        "(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;",
        "Ly81/f;",
        "e",
        "(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;)Ly81/f;",
        "Lb91/c;",
        "labelStyle",
        "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;",
        "alignment",
        "Lsy0/k;",
        "g",
        "(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Lb91/c;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lsy0/k;",
        "Lb2/f;",
        "h",
        "(Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lb2/f;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "checkboxMapper",
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

    new-instance v0, Llb1/v;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/d0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/d0;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;
    .locals 0

    invoke-static {p0}, Llb1/d0;->d(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/v;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/CheckboxModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/d0$b;

    invoke-direct {v2, v0}, Llb1/d0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/d0;->i(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;)Ly81/f;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Llb1/d0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p0

    :pswitch_2
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/d0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Lb91/c;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lsy0/k;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Llb1/d0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_1
    sget-object p0, Lsy0/k$c;->b:Lsy0/k$c;

    return-object p0

    :pswitch_2
    sget-object p0, Lsy0/k$e;->b:Lsy0/k$e;

    return-object p0

    :pswitch_3
    if-eqz p1, :cond_1

    sget-object p0, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {p0, p1}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object p0

    if-nez p0, :cond_2

    :cond_1
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->m()Lb91/a;

    move-result-object p0

    :cond_2
    new-instance p1, Lsy0/k$g;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-direct {p1, p0, p2, v0, p2}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :pswitch_4
    sget-object p0, Lsy0/k$h;->b:Lsy0/k$h;

    return-object p0

    :pswitch_5
    if-eqz p1, :cond_3

    sget-object p0, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {p0, p1}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object p0

    if-nez p0, :cond_4

    :cond_3
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->m()Lb91/a;

    move-result-object p0

    :cond_4
    new-instance p1, Lsy0/k$i;

    invoke-direct {p1, p0}, Lsy0/k$i;-><init>(Lb91/a;)V

    return-object p1

    :pswitch_6
    if-eqz p1, :cond_6

    sget-object p0, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {p0, p1}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object p0

    if-nez p0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    move-object v2, p0

    goto :goto_3

    :cond_6
    :goto_2
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->a()Lb91/a;

    move-result-object p0

    goto :goto_1

    :goto_3
    invoke-static {p2}, Llb1/d0;->h(Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lb2/f;

    move-result-object v3

    sget-object p0, Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;->LEADING:Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    if-ne p2, p0, :cond_7

    const/4 p0, 0x1

    :goto_4
    move v4, p0

    goto :goto_5

    :cond_7
    const/4 p0, 0x0

    goto :goto_4

    :goto_5
    new-instance v0, Lsy0/k$a;

    const/4 v1, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lsy0/k$a;-><init>(Li2/x;Lb91/a;Lb2/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static final h(Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lb2/f;
    .locals 2

    const/4 v0, -0x1

    if-nez p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    sget-object v1, Llb1/d0$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    :goto_0
    if-eq p0, v0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    sget-object p0, Lb2/e;->O:Lb2/k;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Lb2/e;->N:Lb2/k;

    return-object p0

    :cond_3
    sget-object p0, Lb2/e;->M:Lb2/k;

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/CheckboxModel;)Lsy0/e;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    new-instance v2, Lsy0/a;

    invoke-direct {v2, v0, v1}, Lsy0/a;-><init>(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getStyle()Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getLabelStyle()Lb91/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getAlignment()Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;

    move-result-object v2

    invoke-static {v0, v1, v2}, Llb1/d0;->g(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Lb91/c;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;)Lsy0/k;

    move-result-object v7

    new-instance v3, Lsy0/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getLabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->isToggled()Z

    move-result v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getSpacerSize()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getToggledOnColor()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CheckboxModel;->getStyle()Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;

    move-result-object p0

    invoke-static {p0}, Llb1/d0;->e(Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;)Ly81/f;

    move-result-object v0

    :cond_1
    move-object v10, v0

    invoke-direct/range {v3 .. v10}, Lsy0/e;-><init>(Ljava/lang/String;Ljava/lang/String;ZLsy0/k;Lsy0/a;Ljava/lang/Integer;Ly81/f;)V

    return-object v3
.end method
