.class public abstract Llb1/h5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/UpsellCardCalloutModel;",
        "Ll01/h;",
        "d",
        "(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "upsellCardCalloutMapper",
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

    new-instance v0, Llb1/z4;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/h5;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/h5;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;
    .locals 0

    invoke-static {p0}, Llb1/h5;->f(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/h5;->a:Llb1/y0;

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->getDescription()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->getTierImage()Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    if-eqz v5, :cond_0

    new-instance v4, Lkd1/o$c;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v1

    const/4 v5, 0x1

    invoke-static {v1, v0, v5, v0}, Llb1/d4;->l(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;ILjava/lang/Object;)Lny0/h;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/UpsellCardCalloutModel;->getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object p0

    invoke-static {p0}, Llb1/j2;->b(Lcom/whoop/design/models/InfoCalloutTileModel;)Lc41/p2;

    move-result-object v5

    new-instance v1, Ll01/h;

    invoke-direct/range {v1 .. v6}, Ll01/h;-><init>(Ljava/lang/String;Lkd1/o;Lkd1/o;Lc41/p2;Lny0/h;)V

    return-object v1
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/UpsellCardCalloutModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/h5$a;

    invoke-direct {v2, v0}, Llb1/h5$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/h5;->d(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;

    move-result-object p0

    return-object p0
.end method
