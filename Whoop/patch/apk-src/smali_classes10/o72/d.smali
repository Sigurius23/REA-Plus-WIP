.class public final Lo72/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJo\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00082\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lo72/d;",
        "",
        "<init>",
        "()V",
        "Lb72/e;",
        "gaugeState",
        "Ld61/a;",
        "event",
        "Landroid/content/Context;",
        "context",
        "c",
        "(Lb72/e;Ld61/a;Landroid/content/Context;)Lb72/e;",
        "Lo51/a;",
        "action",
        "sageGaugeState",
        "initialSageGaugeState",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onUpdateGaugeState",
        "Lm72/e;",
        "onViewEvent",
        "La72/a;",
        "onAnalyticsEvent",
        "a",
        "(Lo51/a;Lb72/e;Lb72/e;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "La71/c;",
        "sageDetails",
        "",
        "isRight",
        "Lb72/d;",
        "b",
        "(La71/c;Z)Lb72/d;",
        "sage_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo51/a;Lb72/e;Lb72/e;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo51/a;",
            "Lb72/e;",
            "Lb72/e;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdateGaugeState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticsEvent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lo51/a$c;

    if-eqz v0, :cond_4

    check-cast p1, Lo51/a$c;

    invoke-virtual {p1}, Lo51/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of p6, p1, Ld61/a;

    if-eqz p6, :cond_6

    check-cast p1, Ld61/a;

    instance-of p6, p1, Ld61/a$c;

    if-nez p6, :cond_2

    instance-of p6, p1, Ld61/a$a;

    if-eqz p6, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Ld61/a$b;

    if-eqz p1, :cond_1

    invoke-interface {p5, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, La72/a$p;->a:La72/a$p;

    invoke-interface {p7, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p0, p2, p1, p4}, Lo72/d;->c(Lb72/e;Ld61/a;Landroid/content/Context;)Lb72/e;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    instance-of p2, p1, Lo51/a$a;

    if-eqz p2, :cond_5

    new-instance p2, La72/a$c;

    move-object p3, p1

    check-cast p3, Lo51/a$a;

    invoke-virtual {p3}, Lo51/a$a;->b()Z

    move-result p3

    invoke-direct {p2, p3}, La72/a$c;-><init>(Z)V

    invoke-interface {p7, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lm72/e$a;

    invoke-direct {p2, p1}, Lm72/e$a;-><init>(Lo51/a;)V

    invoke-interface {p6, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    instance-of p2, p1, Lo51/a$b;

    if-eqz p2, :cond_6

    new-instance p2, La72/a$d;

    check-cast p1, Lo51/a$b;

    invoke-virtual {p1}, Lo51/a$b;->a()I

    move-result p1

    invoke-direct {p2, p1}, La72/a$d;-><init>(I)V

    invoke-interface {p7, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public final b(La71/c;Z)Lb72/d;
    .locals 2

    if-eqz p1, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, La71/c;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, La71/c;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, La71/c;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, La71/c;->d()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, La71/c;->b()Ljava/lang/String;

    move-result-object p1

    :goto_1
    new-instance p2, Lb72/d;

    invoke-direct {p2, v0, p1, v1}, Lb72/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_2
    new-instance p1, Lb72/d;

    const-string p2, "--"

    const-string v0, ""

    invoke-direct {p1, v0, p2, v0}, Lb72/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c(Lb72/e;Ld61/a;Landroid/content/Context;)Lb72/e;
    .locals 14

    move-object/from16 v0, p3

    const-string v1, "gaugeState"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "event"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Ld61/a;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcz0/s;

    invoke-virtual {v4}, Lcz0/s;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, La71/a;

    invoke-virtual {v5}, La71/a;->e()La71/c;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La71/a;

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, La71/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_2

    :cond_3
    move-object v4, v3

    :goto_2
    if-eqz v4, :cond_4

    invoke-virtual {v1}, La71/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/whoop/design/util/TextResource;->resolve(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_4
    const-string v4, ""

    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, La71/a;->j()Ljava/lang/Float;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    if-eqz v1, :cond_6

    sget-object v6, Lb72/f;->DATA_PRESENT:Lb72/f;

    goto :goto_5

    :cond_6
    sget-object v6, Lb72/f;->MISSING_DATA:Lb72/f;

    :goto_5
    if-eqz v1, :cond_7

    invoke-virtual {v1}, La71/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v7, v0}, Lcom/whoop/design/util/TextResource;->resolve(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_7
    move-object v0, v3

    :goto_6
    if-eqz v1, :cond_8

    invoke-virtual {v1}, La71/a;->e()La71/c;

    move-result-object v7

    goto :goto_7

    :cond_8
    move-object v7, v3

    :goto_7
    const/4 v8, 0x1

    invoke-virtual {p0, v7, v8}, Lo72/d;->b(La71/c;Z)Lb72/d;

    move-result-object v7

    if-eqz v1, :cond_9

    invoke-virtual {v1}, La71/a;->e()La71/c;

    move-result-object v3

    :cond_9
    const/4 v1, 0x0

    invoke-virtual {p0, v3, v1}, Lo72/d;->b(La71/c;Z)Lb72/d;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/16 v12, 0x1c0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v3, v0

    move-object v5, v6

    move-object v6, v1

    invoke-static/range {v2 .. v13}, Lb72/e;->b(Lb72/e;Ljava/lang/String;Ljava/lang/String;Lb72/f;Lb72/d;Lb72/d;Ljava/lang/Float;ZLjava/lang/String;ZILjava/lang/Object;)Lb72/e;

    move-result-object v0

    return-object v0
.end method
