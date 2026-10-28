.class public final synthetic Lc41/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc41/o;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic w:Lc41/x;

.field public final synthetic x:Lcom/whoop/navigation/e;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lc41/x;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;ZLc41/o;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/k;->w:Lc41/x;

    iput-object p2, p0, Lc41/k;->x:Lcom/whoop/navigation/e;

    iput-object p3, p0, Lc41/k;->y:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Lc41/k;->z:Z

    iput-object p5, p0, Lc41/k;->E:Lc41/o;

    iput-object p6, p0, Lc41/k;->F:Lcom/whoop/design/util/TextResource;

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

    iget-object v0, p0, Lc41/k;->w:Lc41/x;

    iget-object v1, p0, Lc41/k;->x:Lcom/whoop/navigation/e;

    iget-object v2, p0, Lc41/k;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lc41/k;->z:Z

    iget-object v4, p0, Lc41/k;->E:Lc41/o;

    iget-object v5, p0, Lc41/k;->F:Lcom/whoop/design/util/TextResource;

    invoke-static/range {v0 .. v7}, Lc41/n;->c(Lc41/x;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;ZLc41/o;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
