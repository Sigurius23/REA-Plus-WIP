.class final Lz21/b$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz21/b$h;->a(Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lf31/a;

.field final synthetic x:Z


# direct methods
.method public constructor <init>(Lf31/a;Z)V
    .locals 0

    iput-object p1, p0, Lz21/b$h$a;->w:Lf31/a;

    iput-boolean p2, p0, Lz21/b$h$a;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/whoop/design/util/TextResource;
    .locals 2

    iget-object v0, p0, Lz21/b$h$a;->w:Lf31/a;

    invoke-virtual {v0}, Lf31/a;->b()Z

    move-result v0

    iget-boolean v1, p0, Lz21/b$h$a;->x:Z

    invoke-static {p1, v0, v1}, Lz21/b;->r(IZZ)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lz21/b$h$a;->a(I)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method
