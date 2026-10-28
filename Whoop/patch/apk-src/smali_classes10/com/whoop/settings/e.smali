.class public final synthetic Lcom/whoop/settings/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Ll0/y;

.field public final synthetic x:Z

.field public final synthetic y:Lcom/whoop/settings/b;


# direct methods
.method public synthetic constructor <init>(Ll0/y;ZLcom/whoop/settings/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/settings/e;->w:Ll0/y;

    iput-boolean p2, p0, Lcom/whoop/settings/e;->x:Z

    iput-object p3, p0, Lcom/whoop/settings/e;->y:Lcom/whoop/settings/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lcom/whoop/settings/e;->w:Ll0/y;

    iget-boolean v1, p0, Lcom/whoop/settings/e;->x:Z

    iget-object v2, p0, Lcom/whoop/settings/e;->y:Lcom/whoop/settings/b;

    invoke-static/range {v0 .. v5}, Lcom/whoop/settings/h;->b(Ll0/y;ZLcom/whoop/settings/b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
