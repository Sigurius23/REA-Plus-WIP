.class public final Lly0/e$d$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lly0/e$d;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
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
        "Ly2/i1;",
        "Ll83/a0;",
        "a",
        "(Ly2/i1;)V"
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

.field final synthetic x:Ljava/util/List;


# direct methods
.method public constructor <init>(Le4/r;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lly0/e$d$a;->w:Le4/r;

    iput-object p2, p0, Lly0/e$d$a;->x:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/i1;)V
    .locals 2

    iget-object v0, p0, Lly0/e$d$a;->w:Le4/r;

    iget-object v1, p0, Lly0/e$d$a;->x:Ljava/util/List;

    invoke-virtual {v0, p1, v1}, Le4/r;->e(Ly2/i1;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/i1;

    invoke-virtual {p0, p1}, Lly0/e$d$a;->a(Ly2/i1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
