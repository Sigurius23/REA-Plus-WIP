.class public abstract Lr21/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "Lr21/c;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "design_release"
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
.method public static final a(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lr21/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lr21/c;

    const-string v10, "What is Heart Rate Variability (HRV)?"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v11, "Your respiratory rate, or breathing rate, is the number of breaths you take per minute. It is a general indicator or cardiovascular fitness and is typically very consistent over time.\n\nA high respiratory rate relative to your baseline may indicate illness or extreme fatigue."

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v15, Lr21/a;->DEFAULT:Lr21/a;

    const/16 v8, 0x70

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v15

    invoke-direct/range {v0 .. v9}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lr21/c;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v19, Lr21/a;->RECOMMENDATION:Lr21/a;

    new-instance v1, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->a()I

    move-result v3

    const/4 v5, 0x2

    invoke-direct {v1, v3, v4, v5, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x70

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v1

    invoke-direct/range {v16 .. v25}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    new-instance v3, Lr21/c;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const-string v6, "Your respiratory rate, or breathing rate, is the number of breaths you take per minute. It is a general indicator or cardiovascular fitness and is typically very consistent over time."

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v6, Ly71/g;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/k0;->a()I

    move-result v7

    invoke-direct {v6, v7, v4, v5, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v27, 0x60

    const/16 v28, 0x0

    const/16 v24, 0x1

    const/16 v26, 0x0

    move-object/from16 v23, v6

    move-object/from16 v22, v19

    move-object/from16 v19, v3

    invoke-direct/range {v19 .. v28}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lr21/c;

    const-string v6, "New January Challenge plans available!"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v19, Lr21/a;->JUMPSTART:Lr21/a;

    new-instance v6, Ly71/g;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/k0;->E()I

    move-result v7

    invoke-direct {v6, v7, v4, v5, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x72

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v6

    invoke-direct/range {v16 .. v25}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    new-instance v16, Lr21/c;

    const-string v7, "Read In Bed"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v7, "If you are reading on a screened device, dim the brightness, use night mode, or wear blue-light blocking glasses to minimize its negative impact."

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v19, Lr21/a;->TIP:Lr21/a;

    new-instance v7, Ly71/g;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->a()I

    move-result v2

    invoke-direct {v7, v2, v4, v5, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x70

    move-object/from16 v20, v7

    invoke-direct/range {v16 .. v25}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    new-instance v5, Lr21/c;

    const-string v2, "What is VO\u2082 Max?"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v2, "VO\u2082 Max is the maximum amount of oxygen your body can use during intense exercise. It\u2019s like the fuel gauge for your endurance, showing how efficiently your body can use oxygen to power your muscles. \n\nThink of it as a measure of your aerobic fitness, indicating how well your heart, lungs, and muscles work together to keep you going strong."

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v2, Lkd1/o$a;

    sget v7, Lgy0/a;->O4:I

    invoke-direct {v2, v7}, Lkd1/o$a;-><init>(I)V

    const-string v7, "Based on the graph by Jayson Gifford, Brigham Young University"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const/16 v20, 0x10

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v2

    move-object v12, v5

    invoke-direct/range {v12 .. v21}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lr21/c;

    const-string v2, "Why Does It Matter?"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const-string v2, "Your VO\u2082 Max supports the foundation of your fitness and long-term health. It is the most powerful predictor of your longevity.\n\nA higher VO2 Max doesn\u2019t just mean your performance peak is higher, it means the foundation of your health and fitness is stronger and more resilient\u2013making everything from climbing the stairs to recovering from a hard workout easier.\n\nBy maintaining a higher VO\u2082 Max, you\u2019ll have more energy for daily activities, higher social stamina, and a better performance as you age."

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v12 .. v21}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v3

    move-object v3, v6

    move-object v6, v12

    filled-new-array/range {v0 .. v6}, [Lr21/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
