.class public final synthetic Lcom/whoop/settings/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lcom/whoop/settings/b;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lz1/s;


# direct methods
.method public synthetic constructor <init>(ZLz1/s;Lcom/whoop/settings/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/whoop/settings/d;->w:Lcom/whoop/settings/b;

    iput-boolean p1, p0, Lcom/whoop/settings/d;->x:Z

    iput-boolean p4, p0, Lcom/whoop/settings/d;->y:Z

    iput-object p2, p0, Lcom/whoop/settings/d;->z:Lz1/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lcom/whoop/settings/d;->w:Lcom/whoop/settings/b;

    iget-boolean v1, p0, Lcom/whoop/settings/d;->x:Z

    iget-boolean v2, p0, Lcom/whoop/settings/d;->y:Z

    iget-object v3, p0, Lcom/whoop/settings/d;->z:Lz1/s;

    invoke-static/range {v0 .. v6}, Lcom/whoop/settings/h;->c(Lcom/whoop/settings/b;ZZLz1/s;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
