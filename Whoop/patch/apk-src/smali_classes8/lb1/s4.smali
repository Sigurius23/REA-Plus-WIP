.class public abstract Llb1/s4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0017\u0010\u000c\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TextAreaModel;",
        "Lt11/h;",
        "f",
        "(Lcom/whoop/design/models/items/TextAreaModel;)Lt11/h;",
        "Lhy0/n1;",
        "g",
        "(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "textAreaMapper",
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

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/s4;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;
    .locals 0

    invoke-static {p0}, Llb1/s4;->e(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/s4;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/s4;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/TextAreaModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/s4$a;

    invoke-direct {v2, v0}, Llb1/s4$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/s4;->g(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/models/items/TextAreaModel;)Lt11/h;
    .locals 18

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getHintText()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getMaxLines()I

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TextAreaModel;->getMaxCharacterCount()I

    move-result v7

    new-instance v1, Lt11/h;

    const/16 v16, 0x3f80

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v17}, Lt11/h;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIFZZZLb91/a;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final g(Lcom/whoop/design/models/items/TextAreaModel;)Lhy0/n1;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhy0/n1;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_0

    move-object v0, v2

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getText()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    move-object v3, v2

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getHintText()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getErrorMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v5, v2

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getMaxCharacterCount()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getMaxLines()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getErrorMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lor2/o1;->c(Ljava/lang/String;)Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/TextAreaModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v13

    const/16 v14, 0x780

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v15}, Lhy0/n1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IIZZZLb91/a;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
