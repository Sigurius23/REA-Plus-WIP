.class public final synthetic Lis0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lis0/e;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;


# direct methods
.method public synthetic constructor <init>(Lis0/e;Lcom/whoop/design/util/TextResource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/p0;->w:Lis0/e;

    iput-object p2, p0, Lis0/p0;->x:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lis0/p0;->x:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lis0/p0;->w:Lis0/e;

    invoke-static {v0, v1, p1, p2}, Lis0/q0;->c(Lcom/whoop/design/util/TextResource;Lis0/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
