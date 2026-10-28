.class public final Lc01/e$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc01/e;->o(Lc01/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Li3/z;",
        "Ll83/a0;",
        "a",
        "(Li3/z;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic w:Le4/r;


# direct methods
.method public constructor <init>(Le4/r;)V
    .locals 0

    iput-object p1, p0, Lc01/e$c;->w:Le4/r;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li3/z;)V
    .locals 1

    iget-object v0, p0, Lc01/e$c;->w:Le4/r;

    invoke-static {p1, v0}, Le4/t;->a(Li3/z;Le4/r;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li3/z;

    invoke-virtual {p0, p1}, Lc01/e$c;->a(Li3/z;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
