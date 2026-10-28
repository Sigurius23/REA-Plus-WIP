.class public final synthetic Lv41/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:F

.field public final synthetic G:Z

.field public final synthetic H:Ljava/util/Map;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lqi/i;

.field public final synthetic y:Lv41/r0;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lqi/i;Lv41/r0;Ljava/lang/String;Ljava/util/Map;FZLjava/util/Map;Lc93/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv41/p0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lv41/p0;->x:Lqi/i;

    iput-object p3, p0, Lv41/p0;->y:Lv41/r0;

    iput-object p4, p0, Lv41/p0;->z:Ljava/lang/String;

    iput-object p5, p0, Lv41/p0;->E:Ljava/util/Map;

    iput p6, p0, Lv41/p0;->F:F

    iput-boolean p7, p0, Lv41/p0;->G:Z

    iput-object p8, p0, Lv41/p0;->H:Ljava/util/Map;

    iput-object p9, p0, Lv41/p0;->I:Lc93/a;

    iput-object p10, p0, Lv41/p0;->J:Lkotlin/jvm/functions/Function1;

    iput p11, p0, Lv41/p0;->K:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lv41/p0;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lv41/p0;->x:Lqi/i;

    iget-object v2, p0, Lv41/p0;->y:Lv41/r0;

    iget-object v3, p0, Lv41/p0;->z:Ljava/lang/String;

    iget-object v4, p0, Lv41/p0;->E:Ljava/util/Map;

    iget v5, p0, Lv41/p0;->F:F

    iget-boolean v6, p0, Lv41/p0;->G:Z

    iget-object v7, p0, Lv41/p0;->H:Ljava/util/Map;

    iget-object v8, p0, Lv41/p0;->I:Lc93/a;

    iget-object v9, p0, Lv41/p0;->J:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lv41/p0;->K:I

    invoke-static/range {v0 .. v12}, Lv41/q0;->g(Landroidx/compose/ui/Modifier;Lqi/i;Lv41/r0;Ljava/lang/String;Ljava/util/Map;FZLjava/util/Map;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
