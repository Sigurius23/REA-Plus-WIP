.class public final synthetic Le41/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lgz0/m0;

.field public final synthetic H:Lcom/whoop/design/util/TextResource;

.field public final synthetic I:Z

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Lgz0/m0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZZLgz0/m0;ZLkotlin/jvm/functions/Function1;Ljava/lang/Object;Lgz0/m0;Lcom/whoop/design/util/TextResource;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le41/d;->w:Z

    iput-boolean p2, p0, Le41/d;->x:Z

    iput-object p3, p0, Le41/d;->y:Lgz0/m0;

    iput-boolean p4, p0, Le41/d;->z:Z

    iput-object p5, p0, Le41/d;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Le41/d;->F:Ljava/lang/Object;

    iput-object p7, p0, Le41/d;->G:Lgz0/m0;

    iput-object p8, p0, Le41/d;->H:Lcom/whoop/design/util/TextResource;

    iput-boolean p9, p0, Le41/d;->I:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v0, p0, Le41/d;->w:Z

    iget-boolean v1, p0, Le41/d;->x:Z

    iget-object v2, p0, Le41/d;->y:Lgz0/m0;

    iget-boolean v3, p0, Le41/d;->z:Z

    iget-object v4, p0, Le41/d;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Le41/d;->F:Ljava/lang/Object;

    iget-object v6, p0, Le41/d;->G:Lgz0/m0;

    iget-object v7, p0, Le41/d;->H:Lcom/whoop/design/util/TextResource;

    iget-boolean v8, p0, Le41/d;->I:Z

    invoke-static/range {v0 .. v10}, Le41/g;->h(ZZLgz0/m0;ZLkotlin/jvm/functions/Function1;Ljava/lang/Object;Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
