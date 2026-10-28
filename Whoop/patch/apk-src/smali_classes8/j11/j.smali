.class public final synthetic Lj11/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Ll3/g;

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:I

.field public final synthetic J:Lc93/m;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ll3/g;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj11/j;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lj11/j;->x:Lcom/whoop/design/util/TextResource;

    iput-boolean p3, p0, Lj11/j;->y:Z

    iput-object p4, p0, Lj11/j;->z:Ljava/lang/String;

    iput-object p5, p0, Lj11/j;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lj11/j;->F:Ll3/g;

    iput-object p7, p0, Lj11/j;->G:Ljava/lang/Integer;

    iput-object p8, p0, Lj11/j;->H:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lj11/j;->I:I

    iput-object p10, p0, Lj11/j;->J:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lj11/j;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lj11/j;->x:Lcom/whoop/design/util/TextResource;

    iget-boolean v2, p0, Lj11/j;->y:Z

    iget-object v3, p0, Lj11/j;->z:Ljava/lang/String;

    iget-object v4, p0, Lj11/j;->E:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lj11/j;->F:Ll3/g;

    iget-object v6, p0, Lj11/j;->G:Ljava/lang/Integer;

    iget-object v7, p0, Lj11/j;->H:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lj11/j;->I:I

    iget-object v9, p0, Lj11/j;->J:Lc93/m;

    invoke-static/range {v0 .. v11}, Lj11/n;->h(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ll3/g;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ILc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
