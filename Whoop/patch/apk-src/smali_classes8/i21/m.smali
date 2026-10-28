.class public final synthetic Li21/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly11/r;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:J

.field public final synthetic z:Li21/l$d;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLi21/l$d;Ly11/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/m;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Li21/m;->x:Lcom/whoop/design/util/TextResource;

    iput-wide p3, p0, Li21/m;->y:J

    iput-object p5, p0, Li21/m;->z:Li21/l$d;

    iput-object p6, p0, Li21/m;->E:Ly11/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Li21/m;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Li21/m;->x:Lcom/whoop/design/util/TextResource;

    iget-wide v2, p0, Li21/m;->y:J

    iget-object v4, p0, Li21/m;->z:Li21/l$d;

    iget-object v5, p0, Li21/m;->E:Ly11/r;

    invoke-static/range {v0 .. v7}, Li21/n;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLi21/l$d;Ly11/r;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
