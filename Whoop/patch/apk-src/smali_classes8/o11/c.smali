.class public final synthetic Lo11/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo11/c;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lo11/c;->x:Lcom/whoop/design/util/TextResource;

    iput p3, p0, Lo11/c;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Lc0/i0;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lo11/c;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lo11/c;->x:Lcom/whoop/design/util/TextResource;

    iget v2, p0, Lo11/c;->y:I

    invoke-static/range {v0 .. v5}, Lo11/g;->i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
