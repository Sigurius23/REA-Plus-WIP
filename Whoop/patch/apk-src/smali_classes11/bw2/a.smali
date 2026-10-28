.class public abstract Lbw2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;",
        "Lcw2/e;",
        "k",
        "(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "measurementEntryDesignItemReducer",
        "Lm91/p;",
        "b",
        "Lm91/p;",
        "f",
        "()Lm91/p;",
        "measurementEntryDesignItemViewFactory",
        "weightlifting_release"
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
.field private static final a:Ljb1/a;

.field private static final b:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbs1/n;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lbs1/n;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lbw2/a;->a:Ljb1/a;

    new-instance v0, Lbs1/n;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lbs1/n;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lbw2/a;->b:Lm91/p;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbw2/a;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbw2/a;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbw2/a;->j(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;
    .locals 0

    invoke-static {p0}, Lbw2/a;->i(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lbw2/a;->a:Ljb1/a;

    return-object v0
.end method

.method public static final f()Lm91/p;
    .locals 1

    sget-object v0, Lbw2/a;->b:Lm91/p;

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbs1/n;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lbs1/n;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbs1/n;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lbs1/n;-><init>(I)V

    const-class v1, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lbw2/a$a;

    invoke-direct {v2, v0}, Lbw2/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbw2/a;->k(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lcw2/e;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lcw2/a;

    invoke-direct {v1}, Lcw2/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;)Lcw2/e;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcw2/e;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getTitleSuffix()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getSubtitleSuffix()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getLeadingIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getLeadingIconColor()Ly81/f;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getSubtitleColor()Ly81/f;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getTrailingIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getTrailingIconColor()Ly81/f;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/measuremententry/models/MeasurementEntryItemModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v11

    invoke-direct/range {v1 .. v11}, Lcw2/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ly81/f;Ly81/f;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method
