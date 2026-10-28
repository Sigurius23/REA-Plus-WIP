.class public final synthetic La11/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ZLcom/whoop/design/util/TextResource;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La11/p;->w:Z

    iput-object p2, p0, La11/p;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, La11/p;->y:Lc93/a;

    iput p4, p0, La11/p;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-boolean v0, p0, La11/p;->w:Z

    iget-object v1, p0, La11/p;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, La11/p;->y:Lc93/a;

    iget v3, p0, La11/p;->z:I

    invoke-static/range {v0 .. v5}, La11/q;->c(ZLcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
