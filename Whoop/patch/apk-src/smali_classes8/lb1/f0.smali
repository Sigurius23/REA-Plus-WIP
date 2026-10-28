.class public abstract Llb1/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/f0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/colortheme/ColorValueModel;",
        "Ly81/e;",
        "b",
        "(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;",
        "Lcom/whoop/design/models/colortheme/ColorBackgroundModel;",
        "Lm51/a;",
        "a",
        "(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;",
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


# direct methods
.method public static final a(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/colortheme/ColorBackgroundModel;->getColors()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/colortheme/ColorValueModel;

    invoke-static {v2}, Llb1/f0;->b(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/colortheme/ColorBackgroundModel;->getOpacity()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_3
    const v0, 0x3f333333    # 0.7f

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/colortheme/ColorBackgroundModel;->getType()Lcom/whoop/design/models/colortheme/ColorBackgroundType;

    move-result-object p0

    sget-object v2, Llb1/f0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    const/4 v2, 0x1

    if-eq p0, v2, :cond_7

    const/4 v2, 0x2

    if-eq p0, v2, :cond_6

    const/4 v3, 0x3

    if-ne p0, v3, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-ge p0, v2, :cond_4

    new-instance p0, Lm51/a$c;

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly81/e;

    invoke-direct {p0, v1, v0}, Lm51/a$c;-><init>(Ly81/e;F)V

    return-object p0

    :cond_4
    new-instance p0, Lm51/a$a;

    invoke-direct {p0, v1, v0}, Lm51/a$a;-><init>(Ljava/util/List;F)V

    return-object p0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    new-instance p0, Lm51/a$b;

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly81/e;

    invoke-direct {p0, v1, v0}, Lm51/a$b;-><init>(Ly81/e;F)V

    return-object p0

    :cond_7
    new-instance p0, Lm51/a$c;

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly81/e;

    invoke-direct {p0, v1, v0}, Lm51/a$c;-><init>(Ly81/e;F)V

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/colortheme/ColorValueModel;->getToken()Ly81/f;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/colortheme/ColorValueModel;->getHex()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Li51/t;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p0}, Li2/w0;->c(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ly81/g;->b(J)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
