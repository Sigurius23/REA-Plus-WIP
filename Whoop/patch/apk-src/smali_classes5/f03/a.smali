.class public final Lf03/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lf03/a;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "Lv82/a;",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lv82/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lf03/a;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lcom/whoop/widget/ui/healthspan/a;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->o(Lxf3/c;Luf3/a;)Lcom/whoop/widget/ui/healthspan/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Li03/b;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->s(Lxf3/c;Luf3/a;)Li03/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lcom/whoop/widget/api/WidgetApi;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->k(Lxf3/c;Luf3/a;)Lcom/whoop/widget/api/WidgetApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lh03/b;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->m(Lxf3/c;Luf3/a;)Lh03/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Li03/a;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->r(Lxf3/c;Luf3/a;)Li03/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Ly6/g;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->q(Lxf3/c;Luf3/a;)Ly6/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Le03/a;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->p(Lxf3/c;Luf3/a;)Le03/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lcom/whoop/widget/api/StressWidgetApi;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->l(Lxf3/c;Luf3/a;)Lcom/whoop/widget/api/StressWidgetApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 0

    invoke-static {p0, p1}, Lf03/a;->n(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ltf3/a;)Ll83/a0;
    .locals 14

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltf3/a;->a:Ljava/util/HashSet;

    new-instance v5, Lex0/a;

    const/16 v1, 0x10

    invoke-direct {v5, v1}, Lex0/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/widget/api/WidgetApi;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v9, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v13, 0x1

    move-object v2, v9

    move v6, v13

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lex0/a;

    const/16 v2, 0x11

    invoke-direct {v12, v2}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lcom/whoop/widget/api/StressWidgetApi;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lex0/a;

    const/16 v2, 0x12

    invoke-direct {v12, v2}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Lh03/b;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v11, Lvf3/c;

    const-string v0, "WIDGET_KTX_SERIALIZATION_JSON"

    invoke-direct {v11, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v12, Lex0/a;

    const/16 v0, 0x13

    invoke-direct {v12, v0}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lad3/c;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v13, 0x2

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lex0/a;

    const/16 v0, 0x14

    invoke-direct {v12, v0}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Lcom/whoop/widget/ui/healthspan/a;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v0, v13

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lex0/a;

    const/16 v2, 0x15

    invoke-direct {v12, v2}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Le03/a;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v13, v6

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "STRESS_WIDGET_STATE_DEFINITION"

    invoke-static {v8, p0, v2, v1, v3}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lex0/a;

    const/16 v2, 0x16

    invoke-direct {v12, v2}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Ly6/g;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lex0/a;

    const/16 v2, 0x17

    invoke-direct {v12, v2}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v2, Li03/a;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move v13, v0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v0, v2, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lex0/a;

    const/16 v0, 0x18

    invoke-direct {v12, v0}, Lex0/a;-><init>(I)V

    new-instance v8, Lqf3/b;

    const-class v0, Li03/b;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lxf3/c;Luf3/a;)Lcom/whoop/widget/api/WidgetApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/widget/api/WidgetApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/widget/api/WidgetApi;

    return-object p0
.end method

.method private static final l(Lxf3/c;Luf3/a;)Lcom/whoop/widget/api/StressWidgetApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/widget/api/StressWidgetApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/widget/api/StressWidgetApi;

    return-object p0
.end method

.method private static final m(Lxf3/c;Luf3/a;)Lh03/b;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lh03/b;

    new-instance v0, Lvf3/c;

    const-string v1, "workManagerInstance"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lic/p0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lic/p0;

    invoke-direct {p1, p0}, Lh03/b;-><init>(Lic/p0;)V

    return-object p1
.end method

.method private static final n(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lxf3/c;Luf3/a;)Lcom/whoop/widget/ui/healthspan/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/widget/ui/healthspan/a;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lvf3/c;

    const-string v2, "WIDGET_KTX_SERIALIZATION_JSON"

    invoke-direct {v1, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lad3/c;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lad3/c;

    invoke-direct {p1, v0, p0}, Lcom/whoop/widget/ui/healthspan/a;-><init>(Landroid/content/Context;Lad3/c;)V

    return-object p1
.end method

.method private static final p(Lxf3/c;Luf3/a;)Le03/a;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le03/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Le03/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final q(Lxf3/c;Luf3/a;)Ly6/g;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ly6/h;->a:Ly6/h;

    return-object p0
.end method

.method private static final r(Lxf3/c;Luf3/a;)Li03/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li03/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lh03/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh03/b;

    const-class v3, Li03/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li03/b;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Li03/a;-><init>(Lh03/b;Li03/b;Lbc3/c0;)V

    return-object p1
.end method

.method private static final s(Lxf3/c;Luf3/a;)Li03/b;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li03/b;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lod1/a0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lod1/a0;

    const-class v4, Lcom/whoop/widget/ui/healthspan/a;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/widget/ui/healthspan/a;

    invoke-direct {p1, v0, v2, p0}, Li03/b;-><init>(Landroid/content/Context;Lod1/a0;Lcom/whoop/widget/ui/healthspan/a;)V

    return-object p1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lf03/a;->j(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv82/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf03/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
