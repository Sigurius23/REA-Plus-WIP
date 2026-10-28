.class public final Lya0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\u000c\u001a\u00020\u0008*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0012\u001a\u00020\u0008*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0008*\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lya0/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lkd0/a$x;",
        "action",
        "Ll83/a0;",
        "f",
        "(Lkd0/a$x;)V",
        "Lkf0/k;",
        "a",
        "(Lkf0/k;Ljava/lang/Object;)V",
        "Lm91/u;",
        "event",
        "",
        "sectionId",
        "c",
        "(Lm91/u;Ljava/lang/Object;Ljava/lang/String;)V",
        "Lny0/h;",
        "b",
        "(Lny0/h;)V",
        "Lkd0/a$c;",
        "e",
        "(Lkd0/a$c;)V",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "d",
        "(Lcom/whoop/analytics/AnalyticEventModel;)V",
        "Lfi0/a;",
        "advanced-labs_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya0/a;->a:Lfi0/a;

    return-void
.end method

.method private final a(Lkf0/k;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p1}, Lkf0/k;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v1, "feature_list_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :sswitch_1
    const-string v1, "next_steps_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :sswitch_2
    const-string v1, "faq_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :sswitch_3
    const-string v1, "biomarker_preview_list_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :sswitch_4
    const-string v1, "biomarker_summary"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :sswitch_5
    const-string v1, "learn_more_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :sswitch_6
    const-string v1, "coaching_carousel_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :sswitch_7
    const-string v1, "feature_comparison_section"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    invoke-virtual {p1}, Lkf0/k;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, p2, v2}, Lya0/a;->c(Lm91/u;Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x62947b68 -> :sswitch_7
        -0x57c8daa3 -> :sswitch_6
        -0x140959ea -> :sswitch_5
        0x150e17a9 -> :sswitch_4
        0x25cb3038 -> :sswitch_3
        0x57273abc -> :sswitch_2
        0x6b419981 -> :sswitch_1
        0x703146ed -> :sswitch_0
    .end sparse-switch
.end method

.method private final b(Lny0/h;)V
    .locals 1

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "biomarker_list_start_testing_button"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->f(Lfi0/a;)V

    return-void

    :sswitch_1
    const-string v0, "advanced_labs_home_start_testing_button"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->g(Lfi0/a;)V

    return-void

    :sswitch_2
    const-string v0, "advanced_labs_home_upload_past_labs_button"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->m(Lfi0/a;)V

    return-void

    :sswitch_3
    const-string v0, "coaching_carousel_start_testing_standard_button"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->h(Lfi0/a;)V

    :cond_4
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4800f1a0 -> :sswitch_3
        0xf0d03b8 -> :sswitch_2
        0x2c436262 -> :sswitch_1
        0x5fdbc802 -> :sswitch_0
    .end sparse-switch
.end method

.method private final c(Lm91/u;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    instance-of v0, p1, Llf0/t1;

    if-eqz v0, :cond_0

    instance-of p3, p2, Lcom/whoop/navigation/e;

    if-eqz p3, :cond_e

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p2

    instance-of p2, p2, Lcom/whoop/navigation/AppScreen$c1;

    if-eqz p2, :cond_e

    check-cast p1, Llf0/t1;

    invoke-virtual {p1}, Llf0/t1;->getId()Ljava/lang/String;

    move-result-object p1

    const-string p2, "promotional_biomarker_pie_chart_section"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->n(Lfi0/a;)V

    return-void

    :cond_0
    instance-of v0, p1, Lf01/q;

    if-eqz v0, :cond_1

    instance-of p1, p2, Lny0/h;

    if-eqz p1, :cond_e

    check-cast p2, Lny0/h;

    invoke-direct {p0, p2}, Lya0/a;->b(Lny0/h;)V

    return-void

    :cond_1
    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_2

    instance-of p1, p2, Lny0/h;

    if-eqz p1, :cond_e

    check-cast p2, Lny0/h;

    invoke-direct {p0, p2}, Lya0/a;->b(Lny0/h;)V

    return-void

    :cond_2
    instance-of v0, p1, Ll01/n;

    if-eqz v0, :cond_3

    instance-of p3, p2, Lcom/whoop/navigation/e;

    if-eqz p3, :cond_e

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p2

    instance-of p2, p2, Lcom/whoop/navigation/AppScreen$h0;

    if-eqz p2, :cond_e

    check-cast p1, Ll01/n;

    invoke-virtual {p1}, Ll01/n;->getId()Ljava/lang/String;

    move-result-object p1

    const-string p2, "labs_included"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->j(Lfi0/a;)V

    return-void

    :cond_3
    instance-of v0, p1, Lq21/i;

    if-eqz v0, :cond_4

    instance-of p1, p2, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_e

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/whoop/navigation/AppScreen$h0;

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->i(Lfi0/a;)V

    return-void

    :cond_4
    instance-of v0, p1, Lsz0/h0;

    if-eqz v0, :cond_5

    const-string p1, "next_steps_section"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->k(Lfi0/a;)V

    return-void

    :cond_5
    instance-of v0, p1, Lq11/e;

    if-eqz v0, :cond_6

    instance-of p1, p2, Lq11/a$b;

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    check-cast p2, Lq11/a$b;

    invoke-virtual {p2}, Lq11/a$b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lya0/b;->b(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_6
    instance-of v0, p1, Lb01/i;

    if-eqz v0, :cond_9

    instance-of p1, p2, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_8

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    instance-of p2, p1, Lcom/whoop/navigation/AppScreen$e5;

    if-eqz p2, :cond_7

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->e(Lfi0/a;)V

    return-void

    :cond_7
    instance-of p1, p1, Lcom/whoop/navigation/AppScreen$h0;

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p1}, Lya0/b;->f(Lfi0/a;)V

    return-void

    :cond_8
    instance-of p1, p2, Lny0/h;

    if-eqz p1, :cond_e

    check-cast p2, Lny0/h;

    invoke-direct {p0, p2}, Lya0/a;->b(Lny0/h;)V

    return-void

    :cond_9
    instance-of v0, p1, Lh51/f;

    if-eqz v0, :cond_b

    instance-of p1, p2, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz p1, :cond_e

    const-string p1, "coaching_carousel_section"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    check-cast p2, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {p2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lya0/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_a
    const-string p1, "learn_more_section"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lya0/a;->a:Lfi0/a;

    check-cast p2, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {p2}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lya0/b;->c(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_b
    instance-of v0, p1, Lc41/p2;

    if-eqz v0, :cond_e

    const-string v0, "feature_list_section"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_e

    instance-of p3, p2, Lcom/whoop/navigation/e;

    if-eqz p3, :cond_e

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-virtual {p2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p2

    instance-of p2, p2, Lcom/whoop/navigation/AppScreen$y2;

    if-eqz p2, :cond_e

    check-cast p1, Lc41/p2;

    invoke-virtual {p1}, Lc41/p2;->c()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_c

    const-string p2, "region"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_d

    :cond_c
    const-string p1, "unknown"

    :cond_d
    iget-object p2, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {p2, p1}, Lya0/b;->d(Lfi0/a;Ljava/lang/String;)V

    :cond_e
    return-void
.end method

.method private final f(Lkd0/a$x;)V
    .locals 2

    invoke-virtual {p1}, Lkd0/a$x;->c()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lkf0/k;

    if-eqz v1, :cond_0

    check-cast v0, Lkf0/k;

    invoke-virtual {p1}, Lkd0/a$x;->d()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lya0/a;->a(Lkf0/k;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lya0/a;->a:Lfi0/a;

    invoke-static {v0, p1}, Lfi0/b;->a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void
.end method

.method public final e(Lkd0/a$c;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "event"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lkd0/a$b0;

    const-string v3, "workflow_step"

    const-string v4, "source"

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    iget-object v6, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$b0;

    invoke-virtual {v1}, Lkd0/a$b0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object v9, v5

    :goto_0
    invoke-virtual {v1}, Lkd0/a$b0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object v11, v5

    :goto_1
    invoke-virtual {v1}, Lkd0/a$b0;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkd0/a$b0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getWorkflowStep()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v5

    :goto_2
    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkd0/a$b0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getCategory()Ljava/lang/String;

    move-result-object v5

    :cond_3
    new-instance v1, Ll83/k;

    const-string v2, "category"

    invoke-direct {v1, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v4, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v12

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v7, 0x0

    const-string v8, "view_home"

    const-string v10, "Bloodwork"

    invoke-static/range {v6 .. v14}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_4
    instance-of v2, v1, Lkd0/a$f0;

    const-string v6, "biomarker_summary"

    const-string v7, "screen"

    if-eqz v2, :cond_8

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$f0;

    invoke-virtual {v1}, Lkd0/a$f0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_3

    :cond_5
    move-object v11, v5

    :goto_3
    invoke-virtual {v1}, Lkd0/a$f0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_4

    :cond_6
    move-object v13, v5

    :goto_4
    invoke-virtual {v1}, Lkd0/a$f0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getWorkflowStep()Ljava/lang/String;

    move-result-object v5

    :cond_7
    new-instance v1, Ll83/k;

    invoke-direct {v1, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v7, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_biomarker_summary"

    const-string v12, "Bloodwork"

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_8
    instance-of v2, v1, Lkd0/a$d0;

    if-eqz v2, :cond_c

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$d0;

    invoke-virtual {v1}, Lkd0/a$d0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_5

    :cond_9
    move-object v11, v5

    :goto_5
    invoke-virtual {v1}, Lkd0/a$d0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_6

    :cond_a
    move-object v13, v5

    :goto_6
    invoke-virtual {v1}, Lkd0/a$d0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getWorkflowStep()Ljava/lang/String;

    move-result-object v5

    :cond_b
    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkd0/a$d0;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_biomarker_detail"

    const-string v12, "Bloodwork"

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_c
    instance-of v2, v1, Lkd0/a$e0;

    if-eqz v2, :cond_d

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$e0;

    invoke-virtual {v1}, Lkd0/a$e0;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    const/16 v15, 0x25

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_detail_faq"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_d
    instance-of v2, v1, Lkd0/a$h0;

    if-eqz v2, :cond_11

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$h0;

    invoke-virtual {v1}, Lkd0/a$h0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_7

    :cond_e
    move-object v11, v5

    :goto_7
    invoke-virtual {v1}, Lkd0/a$h0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_8

    :cond_f
    move-object v13, v5

    :goto_8
    invoke-virtual {v1}, Lkd0/a$h0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getWorkflowStep()Ljava/lang/String;

    move-result-object v5

    :cond_10
    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkd0/a$h0;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_insights"

    const-string v12, "Bloodwork"

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_11
    instance-of v2, v1, Lkd0/a$g0;

    if-eqz v2, :cond_15

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$g0;

    invoke-virtual {v1}, Lkd0/a$g0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_9

    :cond_12
    move-object v11, v5

    :goto_9
    invoke-virtual {v1}, Lkd0/a$g0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_a

    :cond_13
    move-object v13, v5

    :goto_a
    invoke-virtual {v1}, Lkd0/a$g0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getWorkflowStep()Ljava/lang/String;

    move-result-object v5

    :cond_14
    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkd0/a$g0;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ll83/k;

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_insight_detail"

    const-string v12, "Bloodwork"

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_15
    instance-of v2, v1, Lkd0/a$c0;

    if-eqz v2, :cond_19

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$c0;

    invoke-virtual {v1}, Lkd0/a$c0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_b

    :cond_16
    move-object v11, v5

    :goto_b
    invoke-virtual {v1}, Lkd0/a$c0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_c

    :cond_17
    move-object v13, v5

    :goto_c
    invoke-virtual {v1}, Lkd0/a$c0;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getWorkflowStep()Ljava/lang/String;

    move-result-object v5

    :cond_18
    invoke-static {v3, v5}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_actions"

    const-string v12, "Bloodwork"

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_19
    instance-of v2, v1, Lkd0/a$x;

    if-eqz v2, :cond_1a

    check-cast v1, Lkd0/a$x;

    invoke-direct {v0, v1}, Lya0/a;->f(Lkd0/a$x;)V

    return-void

    :cond_1a
    instance-of v2, v1, Lkd0/a$z0;

    if-eqz v2, :cond_1b

    iget-object v1, v0, Lya0/a;->a:Lfi0/a;

    invoke-static {v1}, Lya0/b;->l(Lfi0/a;)V

    return-void

    :cond_1b
    instance-of v2, v1, Lkd0/a$q;

    if-eqz v2, :cond_1c

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$q;

    invoke-virtual {v1}, Lkd0/a$q;->a()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lkd0/a$q;->b()Ljava/lang/String;

    move-result-object v13

    const/16 v15, 0x21

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "home_learn_more"

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1c
    instance-of v2, v1, Lkd0/a$o;

    if-eqz v2, :cond_1d

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_summary_download"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1d
    instance-of v2, v1, Lkd0/a$p;

    if-eqz v2, :cond_1e

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_summary_search"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1e
    instance-of v2, v1, Lkd0/a$e1;

    if-eqz v2, :cond_21

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$e1;

    invoke-virtual {v1}, Lkd0/a$e1;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_1f

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_d

    :cond_1f
    move-object v11, v5

    :goto_d
    invoke-virtual {v1}, Lkd0/a$e1;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v5

    :cond_20
    move-object v13, v5

    const/16 v15, 0x21

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_all_tests"

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_21
    instance-of v2, v1, Lkd0/a$g1;

    if-eqz v2, :cond_24

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$g1;

    invoke-virtual {v1}, Lkd0/a$g1;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v2

    if-eqz v2, :cond_22

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    move-object v11, v2

    goto :goto_e

    :cond_22
    move-object v11, v5

    :goto_e
    invoke-virtual {v1}, Lkd0/a$g1;->a()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v1

    if-eqz v1, :cond_23

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;->getValue()Ljava/lang/String;

    move-result-object v5

    :cond_23
    move-object v13, v5

    const/16 v15, 0x21

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "view_single_test"

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_24
    instance-of v2, v1, Lkd0/a$w0;

    if-eqz v2, :cond_25

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$w0;

    invoke-virtual {v1}, Lkd0/a$w0;->a()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0x31

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "test_download"

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_25
    instance-of v2, v1, Lkd0/a$x0;

    if-eqz v2, :cond_26

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "test_edit_saved"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_26
    instance-of v2, v1, Lkd0/a$v0;

    if-eqz v2, :cond_27

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "test_delete"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_27
    instance-of v2, v1, Lkd0/a$l;

    if-eqz v2, :cond_28

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_detail_view_all"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_28
    instance-of v2, v1, Lkd0/a$r0;

    if-eqz v2, :cond_29

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$r0;

    invoke-virtual {v1}, Lkd0/a$r0;->a()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lkd0/a$r0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const-string v10, "start_workflow"

    const-string v12, "Bloodwork"

    const-string v9, "intake_workflow"

    invoke-interface/range {v8 .. v13}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_29
    instance-of v2, v1, Lkd0/a$w;

    if-eqz v2, :cond_2a

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x34

    const/16 v16, 0x0

    const-string v9, "intake_workflow"

    const-string v10, "intake_started"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2a
    instance-of v2, v1, Lkd0/a$l0;

    if-eqz v2, :cond_2c

    check-cast v1, Lkd0/a$l0;

    invoke-virtual {v1}, Lkd0/a$l0;->b()Z

    move-result v2

    if-eqz v2, :cond_2b

    iget-object v3, v0, Lya0/a;->a:Lfi0/a;

    invoke-virtual {v1}, Lkd0/a$l0;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lkd0/a$l0;->a()Ljava/lang/String;

    move-result-object v8

    const-string v1, "upcharge_warning"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    const-string v5, "appt_scheduling_zip"

    const-string v7, "Bloodwork"

    const-string v4, "appt_scheduling_workflow"

    invoke-interface/range {v3 .. v9}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_2b
    iget-object v10, v0, Lya0/a;->a:Lfi0/a;

    invoke-virtual {v1}, Lkd0/a$l0;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lkd0/a$l0;->a()Ljava/lang/String;

    move-result-object v15

    const-string v12, "appt_scheduling_zip"

    const-string v14, "Bloodwork"

    const-string v11, "appt_scheduling_workflow"

    invoke-interface/range {v10 .. v15}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2c
    instance-of v2, v1, Lkd0/a$m0;

    if-eqz v2, :cond_2d

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$m0;

    invoke-virtual {v1}, Lkd0/a$m0;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lkd0/a$m0;->a()Ljava/lang/String;

    move-result-object v13

    const-string v1, "location_error"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v1}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const-string v10, "appt_scheduling_error"

    const-string v12, "Bloodwork"

    const-string v9, "appt_scheduling_workflow"

    invoke-interface/range {v8 .. v14}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_2d
    instance-of v2, v1, Lkd0/a$b;

    if-eqz v2, :cond_2e

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x34

    const/16 v16, 0x0

    const-string v9, "bloodwork"

    const-string v10, "add_details"

    const/4 v11, 0x0

    const-string v12, "External Data Upload"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2e
    instance-of v2, v1, Lkd0/a$c1;

    if-eqz v2, :cond_2f

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "upload_success"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_2f
    instance-of v2, v1, Lkd0/a$b1;

    if-eqz v2, :cond_30

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "upload_failure"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_30
    instance-of v2, v1, Lkd0/a$k;

    if-eqz v2, :cond_31

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$k;

    invoke-virtual {v1}, Lkd0/a$k;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lkd0/a$k;->b()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0x21

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_add_saved"

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_31
    instance-of v2, v1, Lkd0/a$m;

    if-eqz v2, :cond_32

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$m;

    invoke-virtual {v1}, Lkd0/a$m;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lkd0/a$m;->b()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0x21

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_edit_saved"

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_32
    instance-of v2, v1, Lkd0/a$n;

    if-eqz v2, :cond_33

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$n;

    invoke-virtual {v1}, Lkd0/a$n;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lkd0/a$n;->b()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0x21

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_remove_saved"

    const-string v12, "Bloodwork"

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_33
    instance-of v2, v1, Lkd0/a$d1;

    if-eqz v2, :cond_34

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$d1;

    invoke-virtual {v1}, Lkd0/a$d1;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lkd0/a$d1;->b()Ljava/lang/String;

    move-result-object v11

    const-string v10, "validation_complete"

    const-string v12, "External Data Upload"

    const-string v9, "bloodwork"

    invoke-interface/range {v8 .. v13}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_34
    instance-of v2, v1, Lkd0/a$e;

    if-eqz v2, :cond_35

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x34

    const/16 v16, 0x0

    const-string v9, "appt_scheduling_workflow"

    const-string v10, "appt_add_calendar"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_35
    instance-of v2, v1, Lkd0/a$g;

    if-eqz v2, :cond_36

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$g;

    invoke-virtual {v1}, Lkd0/a$g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x14

    const/16 v16, 0x0

    const-string v9, "appt_scheduling_workflow"

    const-string v10, "appt_reschedule_start"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_36
    instance-of v2, v1, Lkd0/a$f;

    if-eqz v2, :cond_37

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x34

    const/16 v16, 0x0

    const-string v9, "appt_scheduling_workflow"

    const-string v10, "appt_lab_order"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_37
    instance-of v2, v1, Lkd0/a$a;

    if-eqz v2, :cond_38

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const/16 v15, 0x35

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "action_filter"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_38
    instance-of v2, v1, Lkd0/a$y0;

    if-eqz v2, :cond_3a

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$y0;

    invoke-virtual {v1}, Lkd0/a$y0;->a()Z

    move-result v1

    if-eqz v1, :cond_39

    const-string v1, "see_more"

    :goto_f
    move-object v10, v1

    goto :goto_10

    :cond_39
    const-string v1, "see_less"

    goto :goto_f

    :goto_10
    invoke-static {v7, v6}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3a
    instance-of v2, v1, Lkd0/a$q0;

    if-eqz v2, :cond_3b

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    invoke-static {v7, v6}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "start_testing"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3b
    instance-of v2, v1, Lkd0/a$s;

    if-eqz v2, :cond_3c

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    invoke-static {v7, v6}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "close_card"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3c
    instance-of v2, v1, Lkd0/a$u;

    if-eqz v2, :cond_3d

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const-string v1, "biomarker_advanced_labs"

    invoke-static {v4, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x17

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "Healthspan"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3d
    instance-of v2, v1, Lkd0/a$v;

    if-eqz v2, :cond_3e

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$v;

    invoke-virtual {v1}, Lkd0/a$v;->a()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0x31

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "biomarker_detail_healthspan_card"

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_3e
    instance-of v2, v1, Lkd0/a$s0;

    if-eqz v2, :cond_3f

    iget-object v2, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$s0;

    invoke-virtual {v1}, Lkd0/a$s0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lya0/b;->o(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_3f
    instance-of v2, v1, Lkd0/a$o0;

    if-eqz v2, :cond_40

    iget-object v2, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$o0;

    invoke-virtual {v1}, Lkd0/a$o0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lya0/b;->q(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_40
    instance-of v2, v1, Lkd0/a$t0;

    if-eqz v2, :cond_41

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$t0;

    invoke-virtual {v1}, Lkd0/a$t0;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lkd0/a$t0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "swipe_testimonial"

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_41
    instance-of v2, v1, Lkd0/a$n0;

    if-eqz v2, :cond_42

    iget-object v8, v0, Lya0/a;->a:Lfi0/a;

    const-string v1, "al_landing_page"

    invoke-static {v7, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const/16 v15, 0x15

    const/16 v16, 0x0

    const/4 v9, 0x0

    const-string v10, "scrolled_to_bottom"

    const/4 v11, 0x0

    const-string v12, "Bloodwork"

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_42
    instance-of v2, v1, Lkd0/a$u0;

    if-eqz v2, :cond_43

    iget-object v6, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$u0;

    invoke-virtual {v1}, Lkd0/a$u0;->a()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0x31

    const/4 v14, 0x0

    const/4 v7, 0x0

    const-string v8, "test_context_edit"

    const-string v10, "Bloodwork"

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_43
    instance-of v2, v1, Lkd0/a$a1;

    if-eqz v2, :cond_45

    iget-object v6, v0, Lya0/a;->a:Lfi0/a;

    check-cast v1, Lkd0/a$a1;

    invoke-virtual {v1}, Lkd0/a$a1;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_44

    const-string v2, "biomarker_id"

    invoke-static {v2, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    :cond_44
    move-object v12, v5

    const/16 v13, 0x15

    const/4 v14, 0x0

    const/4 v7, 0x0

    const-string v8, "trend_scrub"

    const/4 v9, 0x0

    const-string v10, "Bloodwork"

    const/4 v11, 0x0

    invoke-static/range {v6 .. v14}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_45
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
